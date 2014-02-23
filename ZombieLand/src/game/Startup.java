package game;

import java.awt.Point;

import entity.Player;

/**
 * this class initialize the window and runs the main menu
 * 
 * @author Mikko Eberhardt
 * 
 */
public class Startup {
	/**
	 * Player which is given to the view
	 */
	private static Player player;
	/**
	 * the entry point for the game
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create default Player
		// Player (name, position, health, wisdom, agility, strength)
		player = new Player("Mikko Pimmel", new Point(100, 100), 100, 10, 10, 10);

		// creates the new GameView
		new GameView(player);
	}
}
