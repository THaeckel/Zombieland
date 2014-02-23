package controller;

import entity.Player;
import view.Screen;

public class Game {
	
	/**
	 * Screen variable
	 */
	Screen screen;
	
	/**
	 * Construktor
	 */
	public Game(Player player){
		screen = new Screen(player, 1920, 1080);
	}
	
	public void run(){
		
		while(true){
			//changes
			
			
			//repaint
			screen.repaintScreen();
		}
	}
}
