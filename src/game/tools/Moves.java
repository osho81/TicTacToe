package game.tools;

import java.util.Random;
import java.util.Scanner;

public class Moves {

	public String[][] userInput(String[][] moveBoardUser, Scanner sc) {

		System.out.print(" På vilken siffra vill du lägga din markering? ");
		boolean valid = false;
		int row = 0, col = 0;
		int userChoice = getInput(sc, false);
		
		while (!valid) {

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

			if (!moveBoardUser[row][col].equalsIgnoreCase("X")  && !moveBoardUser[row][col].equalsIgnoreCase("O")) {
				valid = true;
			}else {
				System.out.println("Ogiltigt val försök igen");
				userChoice = getInput(sc, false);
			}
		}
		moveBoardUser[row][col] = "O";
		return moveBoardUser;
	} // end userInput
	
	// kontrollera inmatning (felhantera) och lägg till logiken att användaren ska inte välja en ruta som inte existerar
	private int getInput(Scanner sc, boolean validInput) {
		int output = 0;
		while (!validInput) {
			try {
				output = sc.nextInt();
				if (output <= 9 && output > 0) // logiskt!
					validInput = true;
				else
					System.out.println("Ogiltigt val försök igen");
			} catch (Exception e) {
				System.out.println("Ogiltigt val försök igen");
				sc.next();
			}
		}
		return output;
	}

	// Computer generated move
	public String[][] computerMove(String[][] CompBoard) {

		System.out.print("Datorns drag.\n");
		Random rand = new Random();

		int randomRow = rand.nextInt(3); // slumpa ett värde
		int randomCol = rand.nextInt(3);
		// om dator val Ã¤r redan antagen slumpa igen
		while (CompBoard[randomRow][randomCol].equalsIgnoreCase("X")
				|| CompBoard[randomRow][randomCol].equalsIgnoreCase("O")) {
			randomRow = rand.nextInt(3);
			randomCol = rand.nextInt(3);
		}

		CompBoard[randomRow][randomCol] = "X";

		return CompBoard;

	} // end generated computer move
} // end class
