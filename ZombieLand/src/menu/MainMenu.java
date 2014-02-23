package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainMenu extends Menu {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

		this.add(startgame);
		this.add(options);
		this.add(close);
		
		startgame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		
		
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
