package entity;

import java.awt.Point;

/**
 * This Class represents the Player in Zombieland game
 * @author Timo
 *
 */
public class Player extends Entity{
	
	/**
	 * Constant experience Multiplier per Level
	 */
	private static final int levelMultiplier = 1000;
	
	/**
	 * skillPoints of Player
	 */
	private int skillPoints = 0;
	
	/**
	 * Constructor
	 * @param name to set in Entity
	 * @param position to set in Entity
	 * @param health to set in Entity
	 * @param wisdom to set in Entity
	 * @param agility to set in Entity
	 * @param strength to set in Entity
	 */
	public Player (String name, Point position, int health, int wisdom, int agility, int strength){
		super (name,1, position, health, wisdom, agility, strength);
	}
	
	/**
	 * raise level of Player and add Skillpoints
	 */
	public void levelUp(){
		setLevel(getLevel() + 1);
		skillPoints += 5;
	}
	
	/**
	 * add value to current Strength
	 * @param value - value to add to Strength
	 */
	public void raiseStrength(int value) {
		setStrength(getStrength() + value);
	}

	/**
	 * add value to current Agility
	 * @param value - value to add to Agility
	 */
	public void raiseAgility(int value) {
		setAgility(getAgility() + value);
	}

	/**
	 * add value to current Wisdom
	 * @param value - value to add to Wisdom
	 */
	public void raiseWisdom(int value) {
		setWisdom (getWisdom() + value);
	}

	/**
	 * get new experience and check if level up
	 * @param add experience to add
	 */
	public void raiseExperience(int add) {
		setExperience(getExperience() + add);
		while (getExperience() >= getLevel() * levelMultiplier){
			levelUp();
			setExperience(getExperience()-getLevel() * levelMultiplier); 
		}
	}

	public int getSkillPoints() {
		return skillPoints;
	}
}
