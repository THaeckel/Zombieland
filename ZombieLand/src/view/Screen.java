package view;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Screen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * for the graphical draw object
	 */
	private Graphics g;
	
	/**
	 * Object Display
	 */
	private Display display;
	
	/**
	 * Construktor
	 */
	public Screen(Display display){
		this.display=display;
		makeStrat();
		
		gameloop();
		
	}
	
	public void setDisplay(Display display){
		this.display=display;
	}
	
	/**
	 * game loop
	 */
	private void gameloop(){
		
		while (true){
			//changes
			
			//repaint
			display.repaint(g);
			
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * this methos create the BuffereStrategy for the GUI
	 */
	public void makeStrat() {
		createBufferStrategy(2);
		BufferStrategy strat = getBufferStrategy();
		g = strat.getDrawGraphics();		
	}
}
