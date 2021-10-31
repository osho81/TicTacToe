package game.tools;

import java.util.Scanner;

public class GameLogic {
	
	PrintOut print = new PrintOut();
	CheckWin checkWin = new CheckWin();
	Moves takeInput = new Moves();
	String[][] board;
	
	public void run(Scanner sc) {
		initBoard();
		print.showBoard(board);
		play(sc);
		
	}

	private void play(Scanner sc) {
		
		int playerId = 0, moves = 0; boolean winner = false;
		
		while (!winner && moves < 9) {
			takeInput.makeMove(playerId,board ,sc);
			playerId = (playerId == 0) ? 1 : 0;
			moves++;
			winner = checkWin.check(board);
			print.showBoard(board);
		}
		
		if(moves > 8 && !winner) System.out.println("Ingen vinnare");
	}

	private void initBoard() {
		board = new String[3][3];
		for(int i = 0, x = 1; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++, x++) {
				board[i][j] = x + "";
			}
		}
	}
	
	
}
