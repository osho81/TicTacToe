package game;

import java.util.Scanner;

import game.tools.GameLogic;

//Main starts GameLogic, which in turn controls the game structure

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Create scanner object, to pass to other classes
		
		// Create instance/object of class GameLogic
		GameLogic logic = new GameLogic();
		
		// Call method run() in the class GameLogic; through the object created above
		logic.run(sc);
		
		sc.close();
	}
}
