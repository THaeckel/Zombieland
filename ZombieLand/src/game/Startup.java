package game;

import java.awt.event.KeyEvent;

import entity.Player;
import controller.Keyboard;


/**
 * this class initialize the window and runs the main menu
 * @author Mikko Eberhardt
 *
 */
public class Startup {
	
	/**
	 * variable for the screen
	 */
	private static Screen screen;
	
	/**
	 * variable for the Player
	 */
	private static Player player;
	
	/**
	 * this variable save the time when the last frame starts
	 */
	public static long lastFrame;
	
	/**
	 * this variable save the time of the actuall frame
	 */
	public static long thisFrame;
	
	/**
	 * this variable is the time between two frames.
	 * so it doesnt mater how fast your cpu the player runs with the same speed
	 */
	public static float timeSinceLastFrame;

	
	/**
	 * this method calculates the changes whitin one frame
	 */
	public static void makeChanges(float timeSinceLastFrame) {
		player.update(timeSinceLastFrame);
	}
	
	/**
	 * this method render the changes to the screen
	 */
	public static void render(){
		screen.repaintScreen();
		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	/** 
	 * the entry point for the game
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creates a new gamescreen
		screen = new Screen(1920,1080);

		/* **********************  gameloop  *****************************/
		/**
		 * Game-Loop
		 * permanetly repaint the screen as (fps is one round from while)
		 */
		while (true){
			
			//calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;
		
			//test changes by Player,enemy,map and so on
			makeChanges(timeSinceLastFrame);
			
			//render the changes to the screen
			render();
			
			//exit fullscreen mode with esc Key 
			if(Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)){
				System.exit(0);				
			}
			
		}
	}
}
