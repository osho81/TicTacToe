package game;

import java.util.Scanner;

import game.tools.GameLogic;

// Main startar GameLogic, som i sin tur kontrollerar spelstrukturen

public class Main {

	// Statisk scanner att direktanropa/använda i alla klasser
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Skapa ett objekt av klassen GameLogic
		GameLogic gameLogic = new GameLogic();
		
		
		// Ropa metoden run() som finns i klassen GameLogic, genom objektet ovan
		gameLogic.run(); // 
		
	}
}