package game.tools;

public class CheckWin {

	int countX = 0, countO = 0;

	public boolean check(String[][] board) {

		// If one of these is returned true, this in turn is returned true
		// otherwise it is returned false...
		if (checkRows(board)) return true;
		if (checkDiagnal(board)) return true;
		if (checkColumns(board)) return true;
		return false;
	}

	// Check three in a row horizontally 
	private boolean checkColumns(String[][] board) {

		for (int i = 0; i < board.length; i++) {

			countX = 0;
			countO = 0;

			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j].equalsIgnoreCase("x")) // [i][j] = [0][0], [0][1], [0][2] etc.
					countX++; //2nd: [1][0], [1][1], [1][2]; 3rd: [2][0], [2][1], [2][2]
				if (board[i][j].equalsIgnoreCase("o"))
					countO++;

				if (countX == 3) {
					System.out.println("  You win!");
					return true;
				}
				if (countO == 3) {
					System.out.println("  Computer win!");
					return true;
				}
			}
		}
		return false;
	}

	// Check three in a row diagonally
	private boolean checkDiagnal(String[][] board) {

		// If taken spot 5 and (1 and 9) or (3 and 7)
		if ((board[1][1] == "O"
				&& ((board[0][0] == "O" && board[2][2] == "O") || (board[0][2] == "O" && board[2][0] == "O")))) {
			System.out.println("  Computer Wins!");
			return true;
		} else if ((board[1][1] == "X"
				&& ((board[0][0] == "X" && board[2][2] == "X") || (board[0][2] == "X" && board[2][0] == "X")))) {
			System.out.println("  You Win!");
			return true;
		}

		return false;
	}

	// Check three in a row vertically
	private boolean checkRows(String[][] board) {

		for (int i = 0; i < board.length; i++) {

			countX = 0;
			countO = 0;

			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i].equalsIgnoreCase("x")) // [j][i] = [0][0], [1][0], [2][0], 
					countX++; //2nd: [0][1], [1][1], [2][1]; 3rd: [0][2], [1][2], [2][2] 
				if (board[j][i].equalsIgnoreCase("o"))
					countO++;

				if (countX == 3) {
					System.out.println("  You win!");
					return true;
				}
				if (countO == 3) {
					System.out.println("  Computer win!");
					return true;
				}
			}

		}

		return false;
	}
}
