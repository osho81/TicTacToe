package game.tools;

public class PrintOut {

	// This method is called upon from GameLogic class (which was called by Main)
	public void showBoard(String[][] board) {

		System.out.println();
		String print = "";

		for (int row = 0; row < board.length; row++) { // For each row, create the following row-parts

			System.out.print("\t");
			for (int col = 0; col < board[row].length; col++) {
				print = (col < 2) ? "   |  " : ""; // If column 1 or 2, include |, otherwise without |
				System.out.print(print);
			}

			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				// If column 1 or 2, include |, otherwise without |
				// In this row-part, also print value of current board[row][col] 
				print = (col < 2) ? board[row][col] + "  |  " : board[row][col]; 
				System.out.print(print);
			}

			System.out.print("\n\t");
			for (int col = 0; col < board[row].length; col++) {
				print = (col < 2) ? "   |  " : "";
				System.out.print(print);
			}

			// Ad hoc (manual) formatting for the last row-part (--------)
			System.out.print("\n     "); 
			for (int col = 0; col < 19 && row < 2; col++) {
				print = "-";
				System.out.print(print);
			}
			System.out.println();

		}
	}
}
