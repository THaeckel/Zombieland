package view;

import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import Player.Player;
import controller.Keyboard;

public class Screen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Buffered Image for the background and Player
	 */
	private BufferedImage background = null;
	private BufferedImage map = null;
	private BufferedImage playerBild = null;

	/**
	 * for the canvas enxtendet container
	 */
	private BufferStrategy strat;

	/**
	 * Player wchich where uptatet
	 */
	private Player player;

	/**
	 * Construktor
	 */
	public Screen(Player player, int width, int height) {
		this.player=player;
		setTitle("Zombieland");
		setSize(width, height);
		addKeyListener(new Keyboard());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);

		// Vollbild
		DisplayMode displayMode = new DisplayMode(width, height, 16, 60);// 8 15
																			// 16
																			// 24
																			// 32
		GraphicsEnvironment environment = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice device = environment.getDefaultScreenDevice();
		device.setFullScreenWindow(this);
		device.setDisplayMode(displayMode);

		makeStrat();
		try {
			background = ImageIO.read(Screen.class.getResource("/Background.png"));
			map = ImageIO.read(Screen.class.getResource("/MenuBackground.jpg"));
			playerBild = ImageIO.read(Screen.class.getResource("/Jeff.png"));
		} catch (IOException e) {
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
	public void repaintScreen() {
		Graphics g = strat.getDrawGraphics();

		draw(g);

		g.dispose();
		strat.show();
	}

	/**
	 * This methode draw the game on the screen
	 * 
	 * @param g
	 *            is the graphic Object which brings the draw mechanism
	 */
	private void draw(Graphics g) {
		// default backgroun...all times needed
		g.drawImage(background, 0, 0, null);

		// draw map
		g.drawImage(map, (int)player.getPosX()-500, (int)player.getPosY()-500, this.getWidth(), this.getHeight(), null);
		
		// draw player
		g.drawImage(playerBild, getWidth() / 2-20, getHeight() / 2-35, 25, 50,  null);
		
	}

}
