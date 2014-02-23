package entity;

import item.Equipment;
import item.Inventory;

import java.awt.Point;
import java.awt.Rectangle;

public class Entity {

	/**
	 * name of Entity
	 */
	private final String name;

	/**
	 * Entity position
	 */
	private Point position;

	/**
	 * health points of the Entity
	 */
	private int healthPoints;

	/**
	 * strength of Entity
	 */
	private int strength;

	/**
	 * agility of Entity
	 */
	private int agility;

	/**
	 * wisdom of Entity
	 */
	private int wisdom;

	/**
	 * level of Entity
	 */
	private int level;

	/**
	 * experience of Entity
	 */
	private int experience = 0;

	/**
	 * Inventory of Entity
	 */
	private Inventory inventory = new Inventory();

	/**
	 * Equipment of Entity
	 */
	private Equipment equipment = new Equipment();

	/**
	 * rectangle for PlayerHitbox
	 */
	private Rectangle bounding;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            to set in Entity
	 * @param level
	 *            to set in Entity
	 * @param position
	 *            to set in Entity
	 * @param health
	 *            to set in Entity
	 * @param wisdom
	 *            to set in Entity
	 * @param agility
	 *            to set in Entity
	 * @param strength
	 *            to set in Entity
	 */
	public Entity(String name, int level, Point position, int health,
			int wisdom, int agility, int strength) {
		this.name = name;
		this.level = level;
		this.position = position;
		this.agility = agility;
		this.wisdom = wisdom;
		this.healthPoints = health;
		this.strength = strength;

		bounding = new Rectangle(getPosition().x, getPosition().y, 13, 23);
		// spielergröße vorerst fest(13,23)
	}

	public String getName() {
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
	 * 
	 * @param value
	 *            - value to add to HP
	 */
	public void raiseHealthPoints(int value) {
		healthPoints += value;
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

	public void setLevel(int level) {
		this.level = level;
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

	public void setExperience(int exp) {
		experience = exp;
	}

	/**
	 * suffering damage
	 * 
	 * @param damage
	 *            value to subtract from healthpoints
	 */
	public void sufferDamage(int damage) {
		healthPoints -= damage;
	}

	/**
	 * getter for player Bounding
	 */
	public Rectangle getBounding() {
		return bounding;
	}
}
