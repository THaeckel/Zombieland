package entity;

import java.awt.Point;
import java.awt.Rectangle;

public class Entity {

	/**
	 * ID of Entity
	 */
	private final int entityID;
	
	/**
	 * name of Entity
	 */
	private final String name;
 
	/**
	 * Entity X position
	 */
	private float posX;
	
	/**
	 * Entity Y position
	 */
	private float posY;

	/**
	 * rotation of Player (order geographical cardinals)
	 * N=1; NE=2; E=3; SE=4; S=5; SW=6; W=7; NW=8;
	 */
	private int rotation;
	
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
	private int experience;

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
	public Entity(int id, String name, int level, Point position, int health,
			int wisdom, int agility, int strength, int experience) {
		this.entityID = id;
		this.name = name;
		this.level = level;
		posX = position.x;
		posY = position.y;
		this.agility = agility;
		this.wisdom = wisdom;
		this.healthPoints = health;
		this.strength = strength;

		bounding = new Rectangle(position.x, position.y, 13, 23);
		// spielergröße vorerst fest(13,23)
	}

	public String getName() {
		return name;
	}

	public float getPosX(){
		return posX;
	}
	
	public void setPosX (float x){
		posX = x;
	}

	public float getPosY(){
		return posY;
	}
	
	public void setPosY (float y){
		posY = y;
	}
	
	public void setPosition (float x, float y){
		posX = x;
		posY = y;
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

	/**
	 * @return the rotation
	 */
	public int getRotation() {
		return rotation;
	}

	/**
	 * @param rotation the rotation to set
	 */
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	/**
	 * @return the entityID
	 */
	public int getEntityID() {
		return entityID;
	}
}
