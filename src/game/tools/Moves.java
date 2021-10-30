package game.tools;

import java.util.Random;
import java.util.Scanner;




public class Moves {

	public static String[][] userInput(String[][] moveBoardUser) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print(" På vilken siffra vill du lägga din markering? "); 
		
		
		
		int chosenUser=sc.nextInt();
				
		switch(chosenUser) { 
		
		case 1 -> moveBoardUser[0][0] = "O";
		case 2 -> moveBoardUser[0][1] = "O";
		case 3 -> moveBoardUser[0][2] = "O";
		case 4 -> moveBoardUser[1][0] = "O";
		case 5 -> moveBoardUser[1][1] = "O";
		case 6 -> moveBoardUser[1][2] = "O";
		case 7 -> moveBoardUser[2][0] = "O";
		case 8 -> moveBoardUser[2][1] = "O";
		case 9 -> moveBoardUser[2][2] = "O";	
		
	}//end switch
		
		sc.close();
				
		return moveBoardUser;
		
				
	}//end userinput

	public  static String[][] computerMove(String[][] CompBoard) {
		
		int randomRow;
		int randomCol;
		
		System.out.print("Datorns drag.");
		Random rand = new Random(); 
		do {
		randomRow = rand.nextInt(3);
		randomCol = rand.nextInt(3);
		}
		while (CompBoard[randomRow][randomCol]=="X" || CompBoard[randomRow][randomCol]=="O");
		
		CompBoard[randomRow][randomCol] = "X";
		
		return CompBoard;
		
	
		
		
	}
}//end class
	
