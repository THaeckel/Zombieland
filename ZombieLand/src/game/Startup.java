package game;


/**
 * this class initialize the window and runs the main menu
 * @author Mikko Eberhardt
 *
 */
public class Startup {
	
	/** 
	 * the entry point for the game
	 * @param args
	 */
	public static void main(String[] args) {

		//creates a new gamescreen
		Screen screen = new Screen(1920,1080);


		/**
		 * Game-Loop
		 * permanetly repaint the screen as (fps is one round from while)
		 */
		while (true){
			screen.repaintScreen();
			/*reduces the speed of the loop otherwise this will
			 * will fill up the hole CPU speed
			 */
			try {
				Thread.sleep(11);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
