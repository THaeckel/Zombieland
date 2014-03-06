package controller;

import java.awt.event.KeyEvent;

import player.Player;
import view.Screen;

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
	 * Maphandler
	 */
	TravelMap travelMap;

	/**
	 * Enum to switch between screens
	 */
	public static GameState state;

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
		travelMap = new TravelMap();
		
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
		case travel:
			break;
		default:
			break;
		}

	}

	/**
	 * render the changes to the screen
	 */
	private void render() {
		screen.repaintScreen();
	}

	/**
	 * ths methode handle the shortCuts for map etc
	 */
	private void shortCuts() {
		switch (state) {
		case game:
			if (Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)) {
				System.exit(0);
			}
			if (Keyboard.isKeyDown(KeyEvent.VK_M)){
				state=GameState.travel;
			}
			break;
		case travel:
			if (Keyboard.isKeyDown(KeyEvent.VK_M)){
				state=GameState.game;
			}
			break;
		default:
			break;
		}

	}

	/**
	 * enums to switch getween display modes
	 * 
	 * @author Mikko Eberhardt
	 * 
	 */
	public static enum GameState {
		game, map, travel;
	}

}
