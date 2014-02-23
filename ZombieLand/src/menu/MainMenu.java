package menu;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu extends Menu {

	/**
	 * Object panel
	 */
	private JPanel buttons;
	
	/**
	 * Construktor
	 */
	public MainMenu() {
		super();
		JButton startgame = new JButton("Spiel Starten");
		JButton options = new JButton("Einstellungen");
		JButton close = new JButton("Beenden");
		
		startgame.setSize(200, 50);
		options.setSize(200, 50);
		close.setSize(200, 50);
		
		buttons = new JPanel();
		buttons.add(startgame);
		buttons.add(options);
		buttons.add(close);
	}

	@Override
	public void repaint(Graphics g) {
		super.repaint(g);
	}
}
