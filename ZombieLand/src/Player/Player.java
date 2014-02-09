package Player;

import java.awt.Point;

/**
 * this Class represents the Player in Zombieland game
 * @author Timo
 *
 */
public class Player {
	
	/**
	 * name of Player
	 */
	private final String name;
	
	/**
	 * Player position
	 */
	private Point position;
	
	/**
	 * healthpoints of the Player
	 */
	private int healthPoints;
	
	/**
	 * strength of Player
	 */
	private int strength;
	
	/**
	 * agility of Player
	 */
	private int agility;
	
	/**
	 * wisdom of Player
	 */
	private int wisdom;
	
	/**
	 * level of Player
	 */
	private int level;
	
	/**
	 * Inventory of Player
	 */
	private Inventory inventory = new Inventory();
	
	/**
	 * Equipment of Player
	 */
	private Equipment equipment = new Equipment();
	
	/**
	 * Constructor
	 * @param name --> Player name
	 */
	public Player (String name){
		this.name = name;
	}
	
	public void levelUp(){
		level++;
		//levelUp--> stats increment or call level up method of character
	}
	
	public String getName(){
		return name;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getLevel() {
		return level;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public Equipment getEquipment() {
		return equipment;
	}
}
