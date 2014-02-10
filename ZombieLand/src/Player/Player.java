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
	 * health points of the Player
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
	private int level = 1;
	
	/**
	 * experience of Player
	 */
	private int experience = 0;
	
	/**
	 * skillPoints of Player
	 */
	private int skillPoints = 0;
	
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
	public Player (String name, Point position, int health, int wisdom, int agility, int strength){
		this.name = name;
		this.position = position;
		this.agility = agility;
		this.wisdom = wisdom;
		this.healthPoints = health;
		this.strength = strength;
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

	/**
	 * add value to current HP
	 * @param value - value to add to HP
	 */
	public void raiseHealthPoints(int value) {
		healthPoints += value;
	}

	public int getStrength() {
		return strength;
	}

	/**
	 * add value to current Strength
	 * @param value - value to add to Strength
	 */
	public void raiseStrength(int value) {
		strength += value;
	}

	public int getAgility() {
		return agility;
	}
	
	/**
	 * add value to current Agility
	 * @param value - value to add to Agility
	 */
	public void raiseAgility(int value) {
		agility += value;
	}

	public int getWisdom() {
		return wisdom;
	}
	
	/**
	 * add value to current Wisdom
	 * @param value - value to add to Wisdom
	 */
	public void raiseWisdom(int value) {
		wisdom += value;
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
