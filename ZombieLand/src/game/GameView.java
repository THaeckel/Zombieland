package game;

import java.awt.event.KeyEvent;

import controller.Keyboard;

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
	 * Construktor
	 */
	public GameView() {
		gameloop();
	}

	/**
	 * gameloop which get the changes an display it on the screen
	 */
	private void gameloop() {
		// creates a new gamescreen
		screen = new Screen(1920, 1080);

		/* ********************** gameloop **************************** */
		/**
		 * Game-Loop permanetly repaint the screen as (fps is one round from
		 * while)
		 */
		while (true) {
			// calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			// timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;

			// test changes by Player,enemy,map and so on
			makeChanges(timeSinceLastFrame);

			// render the changes to the screen
			render();

			// exit fullscreen mode with esc Key
			if (Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)) {
				System.exit(0);
			}
		}
	}

	/**
	 * this method calculates the changes whitin one frame
	 */
	public void makeChanges(float timeSinceLastFrame) {
		// TODO
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
