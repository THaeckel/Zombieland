package controller;

import java.awt.image.BufferedImage;

import player.Player;

/**
 * this class initialize the travelmap
 * @author Mikko Eberhardt
 *
 */
public class ControlTravelMap {

	/**
	 * Player to get the position of the player
	 */
	private Player player;
	
	public ControlTravelMap(Player player){
		this.player=player;
	}
	
	public void initialNewMap(){
		
	}
	
	public BufferedImage getMapTile(int x, int y){
		return null;
		
	}
}
