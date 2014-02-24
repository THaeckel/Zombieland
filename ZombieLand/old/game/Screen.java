package game;

import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import controller.Keyboard;
import entity.Player;

public class Screen extends JFrame{
	
	/**
	 * Default serial Version ID
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * Buffered Image for the background
	 */
	private BufferedImage background = null;
	
	/**
	 * Buffered Image for the map
	 */
	private BufferedImage map = null;
	
	
	/**
	 * for the canvas enxtendet container
	 */
	private BufferStrategy strat;
	
	/**
	 * Player wchich where uptatet
	 */
	private Player player;

	/**
	 * Contruktor creates the GUI for the game
	 * 
	 * @param model contains the Data
	 * @param width	from the screen
	 * @param height from the screen
	 */
	public Screen(Player player,int width, int height) {
		this.player=player;
		setTitle("Zombieland");
		setSize(width, height);
		
		
		addKeyListener(new Keyboard());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		//Vollbild
		DisplayMode displayMode = new DisplayMode(width, height, 16, 60);// 8 15 16 24 32  
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = environment.getDefaultScreenDevice();
        device.setFullScreenWindow(this);
        device.setDisplayMode(displayMode);
		
		makeStrat();
		try{
			background = ImageIO.read(Screen.class.getResource("/Background.png"));
			map = ImageIO.read(Screen.class.getResource("/map.png"));
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
	 * this method handle the draw funktion and graphic options
	 */
	public void repaintScreen(){
		Graphics g = strat.getDrawGraphics();
		
		draw(g);
		
		g.dispose();
		strat.show();
	}

	/**
	 * This methode draw the game on the screen
	 * @param g is the graphic Object which brings the draw mechanism
	 */
	private void draw(Graphics g) {
		//default backgroun...all times needed
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
		
		//draw map
		g.drawImage(map, player.getPosition().x, player.getPosition().y, null);
		
		//draw player
		
		g.drawRect(getWidth()/2, getHeight()/2, 15, 15);
		
	}
}
