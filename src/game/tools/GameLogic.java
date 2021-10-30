package game.tools;

import java.util.Scanner;

// GameLogic har startats i Main, som i sin tur kontrollerar spelstrukturen

public class GameLogic {
	
	PrintOut printOut = new PrintOut(); // Skapa objekt av klassen PrintOut
	Moves moves = new Moves(); // skapar objekt av klassen Moves

	String[][] board; // Deklareras här så den är tillgänglig i hela klassen
	
	public void run() { // Anropad från Main; kontrollerar spelstrukturen

		initiateArray();
		System.out.println(
				"Välkommen till tre i rad! \nDina rutor markeras med O och datorns med X. Varsågod att börja.");

		// Anropa metoden printBoard i klassen PrintOut, genom objektet printOut

		printOut.printBoard(board); // skriver ut spelplanen f�r f�rsta g�ngen

		boolean noWin = true;
		int numOfMoves = 0;
		Scanner sc = new Scanner(System.in);
		// loopa tills vinnare eller spelplanen full
		while (noWin && numOfMoves < 9) {
			board = moves.userInput(board, sc); // anv�ndarens drag

			printOut.printBoard(board); // utskrift efter anv�ndarens drag

			board = moves.computerMove(board); // datorns drag

			printOut.printBoard(board); // utskrift efter datorns drag

			noWin = WinCheck.winChecker(board);
			numOfMoves++; 
		}
		sc.close();
	}

	private void initiateArray() {
		board = new String[3][3]; // Redan deklarerad överst

		for (int row = 0, count = 1; row < board.length; row++) { // Count går från 1-9

			// count 1-3 tilldelas row 1, count 4-6 tilldelas row 2, count 7-9 tilldelas row
			// 3
			for (int col = 0; col < board[row].length; col++, count++) {
				board[row][col] = count + ""; // Typomvandla int till string, med genväg
			}
		}
	}

}// end class
