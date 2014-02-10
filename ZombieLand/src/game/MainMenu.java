package game;

import java.awt.BorderLayout;

/**
 * this class represent the mainmenu
 * @author Mikko Eberhardt
 *
 */
public class MainMenu {
	
	/**
	 * Container for the Screen
	 */
	Screen screen;
	
	/**
	 * Construktor to create the main menu
	 */
	public MainMenu (Screen screen){
		this.screen=screen;
		screen.setLayout(new BorderLayout());
		
	}

}
