package menu;

import game.Screen;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Menu extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Background for menu
	 */
	private BufferedImage menuBackground = null;
	
	/**
	 * Construktor
	 */
	public Menu(){
		try{
			setMenuBackground(ImageIO.read(Screen.class.getResource("/MenuBackground.png")));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BufferedImage getMenuBackground() {
		return menuBackground;
	}

	public void setMenuBackground(BufferedImage menuBackground) {
		this.menuBackground = menuBackground;
	}

}
