package controller;

import java.awt.Point;
import java.awt.event.KeyEvent;

import Player.Player;

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
			player.setPosition(new Point(player.getPosition().x, (int) (player.getPosition().y-(SPEED*timeSinceLastFrame))));
		}
		
		//south
		if(Keyboard.isKeyDown(KeyEvent.VK_S)){
			player.setPosition(new Point(player.getPosition().x, (int) (player.getPosition().y+(SPEED*timeSinceLastFrame))));
		}
		
		//east
		if(Keyboard.isKeyDown(KeyEvent.VK_D)){
			player.setPosition(new Point((int) (player.getPosition().x+(SPEED*timeSinceLastFrame)), (player.getPosition().y)));
		}
		
		//west
		if(Keyboard.isKeyDown(KeyEvent.VK_A)){
			player.setPosition(new Point((int) (player.getPosition().x-(SPEED*timeSinceLastFrame)), (player.getPosition().y)));
		}

		
		
	}
}
