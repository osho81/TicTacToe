package game;

import game.tools.GameLogic;

public class Main {

	public static void main(String[] args) {
		
		// skapa ett objekt av klassen GameLogic
		GameLogic gameLogic = new GameLogic();
		
		// ropa metoderna som finns i klassen GameLogic
		gameLogic.run();
		
	}
}