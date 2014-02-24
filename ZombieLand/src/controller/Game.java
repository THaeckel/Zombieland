package controller;

import java.awt.event.KeyEvent;

import entity.Player;
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
	 * player container
	 */
	Player player;
	
	/**
	 * Construktor
	 */
	public Game(Player player){
		this.player=player;
		screen = new Screen(player, 1920, 1080);
	}
	
	public void run(){
		
		controlPlayer = new ControlPlayer(player);
		while(true){
			// calculate the speedmultiplier
			thisFrame = System.currentTimeMillis();
			timeSinceLastFrame = ((float) (thisFrame - lastFrame)) / 1000f;
			lastFrame = thisFrame;
			//changes
			makeChanges();
			
			//repaint
			screen.repaintScreen();
			
			
			shortCuts();
			
		}
	}

	private void makeChanges() {
		controlPlayer.updatePlayer(timeSinceLastFrame);
	}

	private void shortCuts() {
		if(Keyboard.isKeyDown(KeyEvent.VK_ESCAPE)){
			System.exit(0);
		}
		
	}
}
