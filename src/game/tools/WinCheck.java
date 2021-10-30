package game.tools;

public class WinCheck {

	// Ta emot array (board) från gameLogic; return boolean för att kontrollera
	// rundor
	public static boolean winChecker(String[][] currentBoard) {

		boolean noWin = true;

		int threeX = 0;
		int threeO = 0;

		// Kontrollera tre i rad horizontellt
		for (int i = 0; i < currentBoard.length; i++) {
			threeX = 0;
			threeO = 0;
			for (int j = 0; j < currentBoard[i].length; j++) {
				if (currentBoard[i][j].equals("X")) // [i][j] = [0][1], [0][1], [0][2]
					threeX++;
				if (currentBoard[i][j].equals("O"))
					threeO++;
			}

			if (threeO == 3) {
				System.out.println("You Win!");
				noWin = false;
				break;
			}
			if (threeX == 3) {
				System.out.println("Computer Wins!");
				noWin = false;
				break;
			}

		}

		// Kontrollera tre i vertikalt
		for (int i = 0; i < currentBoard.length; i++) { 
		threeX = 0;
		threeO = 0;
		for (int j = 0; j < currentBoard[i].length; j++) { 
			if (currentBoard[j][i].equals("X")) // [j][i] = [0][0], [1][0], [2][0], osv
				threeX++;
			if (currentBoard[j][i].equals("O"))
				threeO++;
		}

		if (threeO == 3) {
			System.out.println("You Win!");
			noWin = false;
			break;
		}
		if (threeX == 3) {
			System.out.println("Computer Wins!");
			noWin = false;
			break;
		}

		}

		// Kontrollera tre i rad diagonalt
		if ((currentBoard[1][1] == "O" && ((currentBoard[0][0] == "O" && currentBoard[2][2] == "O") || 
				(currentBoard[0][2] == "O" && currentBoard[2][0] == "O")))) {
			System.out.println("You Win!");
			noWin = false;
		} else if ((currentBoard[1][1] == "X" && ((currentBoard[0][0] == "X" && currentBoard[2][2] == "X") || 
				(currentBoard[0][2] == "X" && currentBoard[2][0] == "X")))) {
			System.out.println("Computer Wins!");
			noWin = false;
		}
		
		return noWin;

	}

}
