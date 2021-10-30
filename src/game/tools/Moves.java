package game.tools;

import java.util.Random;

import game.Main;

public class Moves {

	public static String[][] userInput(String[][] moveBoardUser) {

		boolean valid = false;
		int row = 0, col = 0;
		int userChoice;

		while (!valid) {
			System.out.print(" På vilken siffra vill du lägga din markering? ");
			userChoice = Main.sc.nextInt();

			if (userChoice == 1 || userChoice == 2 || userChoice == 3)
				row = 0;
			else if (userChoice == 4 || userChoice == 5 || userChoice == 6)
				row = 1;
			else
				row = 2;

			if (userChoice == 1 || userChoice == 4 || userChoice == 7)
				col = 0;
			else if (userChoice == 2 || userChoice == 5 || userChoice == 8)
				col = 1;
			else
				col = 2;

			if (moveBoardUser[row][col] != "X" || moveBoardUser[row][col] != "O") {
				valid = true;
			}

		}
		moveBoardUser[row][col] = "O";
		return moveBoardUser;
	} // end userInput

	// Computer generated move
	public static String[][] computerMove(String[][] CompBoard) {

		int randomRow;
		int randomCol;

		System.out.print("Datorns drag.");
		Random rand = new Random();
		do {
			randomRow = rand.nextInt(3);
			randomCol = rand.nextInt(3);
		} while (CompBoard[randomRow][randomCol] == "X" || CompBoard[randomRow][randomCol] == "O");

		CompBoard[randomRow][randomCol] = "X";

		return CompBoard;

	} // end generated computer move 
} // end class
