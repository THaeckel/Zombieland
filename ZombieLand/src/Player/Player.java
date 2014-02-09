package Player;

import java.awt.Point;

/**
 * This Class represents the Player in Zombieland game
 * @author Timo
 *
 */
public class Player {
	
	/**
	 * Constant experience Multiplier per Level
	 */
	private static final int levelMultiplier = 1000;
	
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
	 * experience of Player
	 */
	private int experience;
	
	/**
	 * skillPoints of Player
	 */
	private int skillPoints;
	
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
	
	/**
	 * raise level of Player and add Skillpoints
	 */
	public void levelUp(){
		level++;
		skillPoints += 5;
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

	public int getExperience() {
		return experience;
	}

	/**
	 * get new experience and check if level up
	 * @param add experience to add
	 */
	public void raiseExperience(int add) {
		experience += add;
		while (experience >= level * levelMultiplier){
			levelUp();
			experience -= level * levelMultiplier;
		}
	}

	public int getSkillPoints() {
		return skillPoints;
	}
}
