package game.tools;

// Metoden i denna klass anropas fr√•n GameLogic (som startats av Main)

public class PrintOut {

	public void printBoard(String[][] board) {

		System.out.println();
		String print = "";
		
		for( int row = 0; row < board.length; row++ ) { // Fˆr varje rad, skapa fˆljande delrader
			
			System.out.print("\t");
			for (int col = 0; col < board[row].length; col++) { 
				print = (col < 2) ? "   |  " : ""; // Om kolumn 1 eller 2, inkludera |, annars utan
				System.out.print(print);
			}
			
			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				
				// Om kolumn 1 eller 2, inkludera |, annars skriv bara ut v‰rdet av berˆrd col
				print = (col < 2) ? board[row][col] + "  |  " : board[row][col];
				System.out.print(print);
			}
			
			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				print = (col < 2) ? "   |  " : "";
				System.out.print(print);
			}
			
			System.out.print("\n     "); // Ad hoc formatering
			for (int col = 0; col < 19 && row < 2; col++) {
				print = "-";
				System.out.print(print);
			}
			System.out.println();
			
		}
	}
	
}
