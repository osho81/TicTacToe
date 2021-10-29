package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// First upload...
		
		Scanner sc = new Scanner(System.in);
				
		String[][] spelplan = new String[3][3];
		
		System.out.println("Välkommen till tre i rad! \n");
		
		//Indexierar arrayerna med 1-9
		for( int rad = 0, raknare = 1; rad < 3; rad++) {
			for( int kol=0; kol < 3; kol++, raknare++) {
				spelplan[rad][kol]=raknare + " ";
			}//end nästalad for-loop			
		}//end yttre foor-loop
		
		
		for( int rad = 0; rad < 3; rad++) {
			for( int kol = 0; kol < 3; kol++) {
				System.out.print(spelplan[rad][kol] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//användaren väljer ruta
		System.out.print("Dina rutor markeras med O."); 
		System.out.print(" På vilken siffra vill du lägga din markering? "); 
		int valdRuta=sc.nextInt();
		
		//här måste valdra nr spärras
		switch(valdRuta) { //det här kan vara en metod
		case 1 -> spelplan[0][0] = "O";
		case 2 -> spelplan[0][1] = "O";
		case 3 -> spelplan[0][2] = "O";
		case 4 -> spelplan[1][0] = "O";
		case 5 -> spelplan[1][1] = "O";
		case 6 -> spelplan[1][2] = "O";
		case 7 -> spelplan[2][0] = "O";
		case 8 -> spelplan[2][1] = "O";
		case 9 -> spelplan[2][2] = "O";	
		}
		
		
		System.out.println();
		for( int rad = 0; rad < 3; rad++) { //det här kan vara en metod
			for( int kol = 0; kol < 3; kol++) {
				System.out.print(spelplan[rad][kol] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//datorn slumpar ruta
		Random rand = new Random(); //det här kan vara en metod
		int slumpadRuta = rand.nextInt(8) + 1; //här måste valda nr markeras så det slumpas om till ett ledigt nr ges
		switch(slumpadRuta) {
		case 1 -> spelplan[0][0] = "X";
		case 2 -> spelplan[0][1] = "X";
		case 3 -> spelplan[0][2] = "X";
		case 4 -> spelplan[1][0] = "X";
		case 5 -> spelplan[1][1] = "X";
		case 6 -> spelplan[1][2] = "X";
		case 7 -> spelplan[2][0] = "X";
		case 8 -> spelplan[2][1] = "X";
		case 9 -> spelplan[2][2] = "X";	
		}


		System.out.println();
		
		System.out.println("Datorns drag");
		for( int rad = 0; rad < 3; rad++) { //den här metoden finns redan
			for( int kol = 0; kol < 3; kol++) {
				System.out.print(spelplan[rad][kol] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
	}//end main

}//end class
