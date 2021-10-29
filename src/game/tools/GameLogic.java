package game.tools;

public class GameLogic {
	
	PrintOut printOut = new PrintOut();
	
	String[][] board;

	public void run() {

		initiateArray();
		printOut.printBoard(board);
	}

	private void initiateArray() {
		board = new String[3][3];
		
		for (int row = 0, count = 1; row < board.length; row++) {

			for (int col = 0; col < board[row].length; col++, count++) {
				board[row][col] = count + "";
			}
		}
	}

}
