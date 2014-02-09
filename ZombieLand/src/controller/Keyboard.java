package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * class to handle keys which are typed. Implements KeyListener and set key on true wich are pressed.
 * isKeyDown returns the value of the key pressed or not.
 * @author Mikko Eberhardt
 *
 */
public class Keyboard implements KeyListener {
	
	private static boolean[] keys = new boolean[1024];

	/**
	 * Method to test one individual key is pressed down
	 * @param keyCode of the looking key 
	 * @return true if the looking key is down
	 */
	public static boolean isKeyDown(int keyCode) {
		if (keyCode >= 0 && keyCode < keys.length)
			return keys[keyCode];
		else
			return false;
	}

	/**
	 * Method to test key is down from an Key Event type.
	 * Set key true if pressed
	 */
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if ((keyCode >= 0) && (keyCode < keys.length))
			keys[keyCode] = true;
	}

	
	/**
	 * Method to test key is going up from an Key Event type.
	 * Set key false if released
	 */
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if ((keyCode >= 0) && (keyCode < keys.length))
			keys[keyCode] = false;
	}

	// Unnötig
	public void keyTyped(KeyEvent e) {
	}
}
