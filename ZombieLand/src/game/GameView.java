package game;

import java.awt.Point;
import java.awt.event.KeyEvent;

import controller.ControlPlayer;
import controller.Keyboard;
import entity.Player;

public class GameView {

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
	 * screen objectvariable
	 */
	private Screen screen;
	
	/**
	 * Controller for Playerchanges
	 */
	private ControlPlayer controlPlayer;
	
	/**
	 * Player which is handle by this controler
	 */
	private Player player;

	/**
	 * Construktor
	 */
	public GameView(Player player) {
		this.player=player;
		controlPlayer = new ControlPlayer(player);
		gameloop();
		
	}

	/**
	 * gameloop which get the changes an display it on the screen
	 */
	private void gameloop() {
		
		
		
		// creates a new gamescreen
		screen = new Screen(player, 1920, 1080);
		
		
		
		/* ********************** gameloop **************************** */
		/**
		 * Game-Loop permanetly repaint the screen as (fps is one round from
		 * while)
		 */
		while (true) {
			// calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;

			// test changes by Player,enemy,map and so on
			makeChanges(timeSinceLastFrame);

			// render the changes to the screen
			render();

			// exit game with esc Key
			if (Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)) {
				System.exit(0);
			}
		}
	}

	/**
	 * this method calculates the changes whitin one frame
	 */
	public void makeChanges(float timeSinceLastFrame) {
		controlPlayer.updatePlayer(timeSinceLastFrame);
	}

	/**
	 * this method render the changes to the screen
	 */
	public void render() {
		screen.repaintScreen();
		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
