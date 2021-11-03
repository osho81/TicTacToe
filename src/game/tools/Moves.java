package game.tools;

import java.util.Random;
import java.util.Scanner;

public class Moves {

	// Method takes controlling id, our board, and scanner object (created in Main)
	public void makeMove(int id, String[][] board, Scanner sc) {

		if (id == 0) // If current id is 0...
			user(board, sc); // ...run user move method
		if (id == 1) // If current id is 1...
			comp(board); // ...run computer move generating method
	}

	// Computer generated move
	private void comp(String[][] board) {

		System.out.println("Computer move:");
		Random rnd = new Random();
		int row = -1, col = -1; 
		boolean valid;
		row = rnd.nextInt(3); // Random numbers generated: 0, 1 or 2
		col = rnd.nextInt(3);
		// If board value of generated board spot is x or o (i.e. taken), valid is
		// false, otherwise valid is true
		valid = (board[row][col].equalsIgnoreCase("x") || board[row][col].equalsIgnoreCase("o")) ? false : true;
		// If valid is false (!valid), then while condition is true >> while loop runs
		// (Otherwise skip loop)
		while (!valid) {
			row = rnd.nextInt(3); // New row/col pairs are generated
			col = rnd.nextInt(3);
			// Valid is true when generated board spot is not (!) x or o; loop breaks
			valid = (!board[row][col].equalsIgnoreCase("x") && !board[row][col].equalsIgnoreCase("o"));
		}
		// Generated board spot is assigned an O; with or without the loop
		board[row][col] = "O";
	}

	// metoden tar emot användaren inmatning
	private void user(String[][] board, Scanner sc) {

		System.out.print("Choose a spot: ");
		int pick = getUserInput(sc); // Get valid input 1-9 from getUserInput()
		boolean valid = false;

		// Checks if valid 1-9 (pick) also is a spot NOT already taken by user/computer
		while (!valid) {
			int x = -1, y = -1, found = 0;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					// If current board spot equals chosen number, then it is available
					// I.e. spot is not taken by x or o. 
					// If available spot, do the following...
					if (board[i][j].equals(pick + "")) { // "" is shortcut type casting
						found++; // Controls following if-statement: found becomes 1
						x = i; // Assign i, j to x, y
						y = j; 
						break; // Break loop, and move to next part of this while loop
					}
				}
			}
			// If while was broken, i.e. found++ occurred (>0)...
			if (found > 0) {
				board[x][y] = "X"; // ...Assign X to board spot (at the time of loop break)
				valid = true; // Break while loop
			} else {
				System.out.println("3- taken spot, try again:");
				pick = getUserInput(sc); // Else, start over while loop, with new pick
			}
		}
	}

	// Method asks for user input, validates, and returns when valid int
	private int getUserInput(Scanner sc) {
		int output = -1;
		boolean valid = false;
		while (!valid) {
			try {
				output = sc.nextInt();
				// If entered value is between 1-9, it is valid, so break loop
				valid = (output <= 9 && output > 0) ? true : false;
			} catch (Exception e) {
				sc.next();
				System.out.println("1- invalid input, try again:");
			}
		}
		return output;
	}

}
