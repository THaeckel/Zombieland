package game;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * this class represent the mainmenu
 * @author Mikko Eberhardt
 *
 */
public class MainMenu {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * variable screen
	 */
	private Screen screen;
	
	/**
	 * Construktor to create the main menu
	 */
	public MainMenu (Screen screen){
		this.screen=screen;
        screen.setLayout(new BorderLayout());
        screen.add(createMenuPanel());
        screen.pack();
        screen.setLocationRelativeTo(null);
	}

	private Component createMenuPanel() {
		 JPanel panel = new JPanel(new GridLayout(0, 1));
	        
	        JButton start = new JButton("Start Game");
	        start.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               //spiel starten
	            	
	            }
	        });
	        
	        JButton close = new JButton("Close");
	        close.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
	 
	        panel.add(start);
	        panel.add(close);
	        return panel;
	}

}
