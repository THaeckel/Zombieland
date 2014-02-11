package controller;

import java.awt.Point;
import java.awt.event.KeyEvent;

import entity.Player;

/**
 * this class handle the changes of the Player
 * @author Mikko Eberhardt
 *
 */
public class ControlPlayer {
	
	/**
	 * speed of the player
	 */
	private float SPEED = 80;
	
	/**
	 * Player which is handle by this controler
	 */
	private Player player;
	
	
	public ControlPlayer(Player player){
		this.player=player;
		
	}

	public void updatePlayer(float timeSinceLastFrame){
		
		//north
		if(Keyboard.isKeyDown(KeyEvent.VK_W)){
			player.getPosition().y-=SPEED*timeSinceLastFrame;
		}
		
		//south
		if(Keyboard.isKeyDown(KeyEvent.VK_S)){
			player.getPosition().y+=SPEED*timeSinceLastFrame;
		}
		
		//east
		if(Keyboard.isKeyDown(KeyEvent.VK_D)){
			player.getPosition().x+=SPEED*timeSinceLastFrame;
		}
		
		//west
		if(Keyboard.isKeyDown(KeyEvent.VK_A)){
			player.getPosition().x-=SPEED*timeSinceLastFrame;
		}

		
		
	}
}
