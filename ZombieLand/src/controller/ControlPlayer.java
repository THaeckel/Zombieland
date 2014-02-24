package controller;

import java.awt.event.KeyEvent;

import player.Player;

/**
 * this class handle the changes of the Player
 * 
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

	public ControlPlayer(Player player) {
		this.player = player;

	}

	public void updatePlayer(float timeSinceLastFrame) {

		/********* Spielerbewegung auf der Karte ***********************/
		float dx = 0, dy = 0; // die Bewegung in x- bzw. y-Richtung
		// north
		if (Keyboard.isKeyDown(KeyEvent.VK_W)) {
			dy += SPEED * timeSinceLastFrame;
		}

		// south
		if (Keyboard.isKeyDown(KeyEvent.VK_S)) {
			dy -= SPEED * timeSinceLastFrame;
		}

		// east
		if (Keyboard.isKeyDown(KeyEvent.VK_D)) {
			dx -= SPEED * timeSinceLastFrame;
		}

		// west
		if (Keyboard.isKeyDown(KeyEvent.VK_A)) {
			dx += SPEED * timeSinceLastFrame;
		}

		if (Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)) > (SPEED * timeSinceLastFrame)) {
			dx = (float)(dx/Math.sqrt(2));
			dy = (float)(dy/Math.sqrt(2)) ;
		}
		player.setPosition((player.getPosX() + dx), (player.getPosY() + dy));

	}
}
