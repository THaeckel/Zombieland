package game;

import java.awt.event.KeyEvent;

import controller.Keyboard;


/**
 * this class initialize the window and runs the main menu
 * @author Mikko Eberhardt
 *
 */
public class Startup {
	
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
	 * the entry point for the game
	 * @param args
	 */
	public static void main(String[] args) {

		//creates a new gamescreen
		Screen screen = new Screen(1920,1080);

		MainMenu mainmenu = new MainMenu(screen);
		
		
//		new Intro();
		
		
		
		
		
		/* **********************  gameloop after menu *****************************/
		/**
		 * Game-Loop
		 * permanetly repaint the screen as (fps is one round from while)
		 */
		while (true){
			
			//calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;
			
			
			
			
			screen.repaintScreen();
			
			
			/*reduces the speed of the loop otherwise this will
			 * will fill up the hole CPU speed
			 */
			try {
				Thread.sleep(11);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			/**
			 * reacts on pressing esc to exit the programm
			 */
			if(Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)){
				System.exit(0);				
			}
			
		}
	}
}
