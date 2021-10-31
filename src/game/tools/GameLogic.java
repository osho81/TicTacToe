package game.tools;

import java.util.Scanner;

// GameLogic is started from Main, and now controls game structure

public class GameLogic {

	PrintOut print = new PrintOut(); // Create object from PrintOut class
	CheckWin checkWin = new CheckWin(); // Create object from CheckWin class
	Moves takeInput = new Moves(); // Create object from Moves class
	String[][] board; // Make board accessible to the whole class

	public void run(Scanner sc) {
		welcome();
		initBoard();
		// Calls showBoard method in PrintOut class, through print object above...
		print.showBoard(board); // and passes initiated board as argument
		play(sc); // starts the game; also uses the scanner object sc

	}

	// Starts the game; also uses the scanner object sc
	private void play(Scanner sc) {

		int playerId = 0, moves = 0;
		boolean winner = false;

		while (!winner && moves < 9) { // While no winner, and while empty spots available
			takeInput.makeMove(playerId, board, sc); // Make move for player (user, i.e. 0)
			playerId = (playerId == 0) ? 1 : 0; // Then change to other player (computer, i.e. 1)
			moves++;
			winner = checkWin.check(board); // Check if any win (three in a row) up till now
			print.showBoard(board); // Show updated board
		}

		if (moves > 8 && !winner)
			System.out.println("  No winner");
	}

	// Initiates 2D array with 3 arrays, with 3 element each
	private void initBoard() {
		board = new String[3][3];
		for (int i = 0, x = 1; i < board.length; i++) { // x goes from 1-9
			// Assign (x)1-3 to row 1, (x)4-6 to row 2, (x)7-9 to row 3
			for (int j = 0; j < board[i].length; j++, x++) {
				board[i][j] = x + ""; // Shortcut for type casting to string
			}
		}
	}

	// Welcomes user
	private void welcome() {
		System.out.println();
		String welcomeString = "  Welcome To Tic Tac Toe!";
		for (int i = 0; i < welcomeString.length(); i++) {
			System.out.print(welcomeString.substring(i, i + 1));
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
		System.out.println();
	}
}