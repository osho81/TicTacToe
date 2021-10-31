package game.tools;

public class CheckWin {
	
	int countX = 0, countO = 0;

	public boolean check(String[][] board) {

		if (checkRows(board)) return true;
		if (checkDiagnal(board)) return true;
		if (checkColumns(board)) return true;
		return false;
	}
	
	// Kontrollera tre i vertikalt
	private boolean checkColumns(String[][] board) {

		for (int i = 0; i < board.length; i++) {

			countX = 0; countO = 0;

			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j].equalsIgnoreCase("x")) countX++;
				if (board[i][j].equalsIgnoreCase("o")) countO++;
				
				if (countX == 3) {
					System.out.println("You win!");
					return true;
				}
				if (countO == 3) {
					System.out.println("Computer win!");
					return true;
				}
			}
		}
		return false;
	}

	
	// Kontrollera tre i rad diagonalt
	private boolean checkDiagnal(String[][] board) {
		
		
		if ((board[1][1] == "O" && 
				((board[0][0] == "O" && 
				board[2][2] == "O") || 
				(board[0][2] == "O" && 
				board[2][0] == "O")))) {
			System.out.println("Computer Wins!");
			return true;
		} else if ((board[1][1] == "X" && 
				((board[0][0] == "X" && 
				board[2][2] == "X") || 
				(board[0][2] == "X" && 
				board[2][0] == "X")))) {
			System.out.println("You Win!");
			return true;
		}
		
		return false;
	}

	
	// Kontrollera tre i rad horizontellt
	private boolean checkRows(String[][] board) {

		for (int i = 0; i < board.length; i++) {

			countX = 0; countO = 0;

			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i].equalsIgnoreCase("x")) countX++;
				if (board[j][i].equalsIgnoreCase("o")) countO++;
				
				if (countX == 3) {
					System.out.println("You win!");
					return true;
				}
				if (countO == 3) {
					System.out.println("Computer win!");
					return true;
				}
			}

		}

		return false;
	}
}
