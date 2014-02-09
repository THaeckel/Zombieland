package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import controller.Keyboard;

public class Screen extends JFrame{
	
	/**
	 * test 
	 */
	private int x = 0;
	
	/**
	 * Default serial Version ID
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * Buffered Image for the background
	 */
	private BufferedImage background = null;
	
	/**
	 * for the canvas enxtendet container
	 */
	private BufferStrategy strat;

	/**
	 * Contruktor creates the GUI for the game
	 * 
	 * @param model contains the Data
	 * @param width	from the screen
	 * @param height from the screen
	 */
	public Screen(int width, int height) {
		setTitle("Zombieland");
		setSize(width, height);
		addKeyListener(new Keyboard());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		makeStrat();
		try{
			background = ImageIO.read(Screen.class.getResource("/Background.png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this methos create the BuffereStrategy for the GUI
	 */
	public void makeStrat() {
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}
	
	/**
	 * this method draws the game on th screen
	 */
	public void repaintScreen(){
		Graphics g = strat.getDrawGraphics();
		//draw begins
		
		g.drawImage(background, 0, 0, null);
		x+=5;
		//draw ends
		g.dispose();
		strat.show();
	}

}
