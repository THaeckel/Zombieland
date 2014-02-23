package view;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import controller.Keyboard;

public class Screen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	
	
	/**
	 * Construktor
	 */
	public Screen(int width, int height){
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

	}
	
	
	
}
