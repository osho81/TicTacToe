package game.tools;

public class PrintOut {

	public void printBoard(String[][] board) {

		System.out.println();
		String print = "";
		for( int row = 0; row < board.length; row++ ) {
			
			System.out.print("\t");
			for (int col = 0; col < board[row].length; col++) {
				print = (col < 2) ? "   |  " : "";
				System.out.print(print);
			}
			
			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				
				print = (col < 2) ? board[row][col] + "  |  " : board[row][col];
				System.out.print(print);
			}
			
			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				print = (col < 2) ? "   |  " : "";
				System.out.print(print);
			}
			
			System.out.print("\n     ");
			for (int col = 0; col < 19 && row < 2; col++) {
				print = "-";
				System.out.print(print);
			}
			System.out.println();
			
		}
	}
	
}
