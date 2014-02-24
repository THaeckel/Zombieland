package controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.math.*;

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
		
		
		/********* Spielerbewegung auf der Karte ***********************/
		double dx = 0, dy = 0; // die Bewegung in x- bzw. y-Richtung
		//north
		if(Keyboard.isKeyDown(KeyEvent.VK_W)){
			dy -= SPEED * timeSinceLastFrame;
		}
		
		//south
		if(Keyboard.isKeyDown(KeyEvent.VK_S)){
			dy += SPEED * timeSinceLastFrame;
		}
		
		//east
		if(Keyboard.isKeyDown(KeyEvent.VK_D)){
			dx += SPEED * timeSinceLastFrame;
		}
		
		//west
		if(Keyboard.isKeyDown(KeyEvent.VK_A)){
			dx -= SPEED * timeSinceLastFrame;
		}

		if(Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2))>(SPEED*timeSinceLastFrame)){
			dx= Math.sqrt((dx*dx)/2);
			dy=dx;
		}
		player.setPosition(new Point((int)(player.getPosition().x+dx), (int)(player.getPosition().y+dy)));
		
		
	}
}
