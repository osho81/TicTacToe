package game.tools;


// GameLogic har startats i Main, som i sin tur kontrollerar spelstrukturen

public class GameLogic {
	
	PrintOut printOut = new PrintOut(); // Skapa objekt av klassen PrintOut
	
	String[][] board; // Deklareras här så den är tillgänglig i hela klassen

	public void run() {  // Anropad från Main; kontrollerar spelstrukturen

		initiateArray();
		
		// Anropa metoden printBoard i klassen PrintOut, genom objektet printOut 
		printOut.printBoard(board); 
	}

	private void initiateArray() {
		board = new String[3][3];  // Redan deklarerad överst
		
		for (int row = 0, count = 1; row < board.length; row++) { // Count går från 1-9

			// count 1-3 tilldelas row 1, count 4-6 tilldelas row 2, count 7-9 tilldelas row 3
			for (int col = 0; col < board[row].length; col++, count++) {
				board[row][col] = count + "";  // Typomvandla int till string, med genväg
			}
		}
	}

}
