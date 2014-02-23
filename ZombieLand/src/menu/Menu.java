package menu;

import game.Screen;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import view.Display;

public class Menu implements Display{
	
	/**
	 * Background for menu
	 */
	private BufferedImage menuBackground = null;
	
	/**
	 * Construktor
	 */
	public Menu(){
		try{
			menuBackground = ImageIO.read(Screen.class.getResource("/MenuBackground.jpg"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void repaint(Graphics g) {
		g.drawImage(menuBackground, 0, 0, null);
		
	}

}
