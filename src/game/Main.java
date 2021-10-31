package game;

import java.util.Scanner;

import game.tools.GameLogic;

//Main startar GameLogic, som i sin tur kontrollerar spelstrukturen

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Skapa en instans av klassen GameLogic
		GameLogic logic = new GameLogic();
		
		// Ropa metoden run() som finns i klassen GameLogic, genom objektet ovan
		logic.run(sc);
		
		sc.close();
	}
}
