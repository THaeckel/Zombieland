package controller;

import java.awt.event.KeyEvent;

import entity.Player;

/**
 * this class handle the changes of the Player
 * @author Mikko Eberhardt
 *
 */
public class ControlPlayer {
	
	/**
	 * Player which is handle by this controler
	 */
	private Player player;
	
	
	public ControlPlayer(Player player){
		this.player=player;
		
	}

	public void updatePlayer(float timeSinceLastFrame){
		
		if(Keyboard.isKeyDown(KeyEvent.VK_W)){
			player.getPosition().x+=100*timeSinceLastFrame;
		}
		
		
	}
}
