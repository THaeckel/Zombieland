package controller;

import java.awt.event.KeyEvent;

import view.Screen;
import Player.Player;

public class Game {

	/**
	 * this variable save the time when the last frame starts
	 */
	private long lastFrame;

	/**
	 * this variable save the time of the actuall frame
	 */
	private long thisFrame;

	/**
	 * this variable is the time between two frames. so it doesnt mater how fast
	 * your cpu the player runs with the same speed
	 */
	private float timeSinceLastFrame;

	/**
	 * Screen variable
	 */
	Screen screen;

	/**
	 * controller for changes of Player
	 */
	ControlPlayer controlPlayer;

	/**
	 * Enum to switch between screens
	 */
	public GameState state;

	/**
	 * player container
	 */
	Player player;

	/**
	 * Construktor
	 */
	public Game(Player player) {
		this.player = player;
		screen = new Screen(player, 1920, 1080);
	}

	/**
	 * this methode contains the gameloop and handel the screens
	 */
	public void run() {
		state = GameState.game;

		controlPlayer = new ControlPlayer(player);
		while (true) {

			// calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;
			
			// changes
			makeChanges();

			// repaint
			render();

			shortCuts();
		}
	}

	/**
	 * aktivates and look for changes whithin the last frame
	 */
	private void makeChanges() {
		switch (state) {
		case game:
			controlPlayer.updatePlayer(timeSinceLastFrame);
			break;
		default:
			break;
		}

	}

	/**
	 * render the changes to the screen
	 */
	private void render() {
		switch (state) {
		case game:
				screen.repaintScreen();
				break;
		default:
			break;
		}

	}

	/**
	 * ths methode handle the shortCuts for map etc
	 */
	private void shortCuts() {
		if (Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)) {
			System.exit(0);
		}

	}

	/**
	 * enums to switch getween display modes
	 * 
	 * @author Mikko Eberhardt
	 * 
	 */
	public enum GameState {
		game, map, travel;
	}

}
