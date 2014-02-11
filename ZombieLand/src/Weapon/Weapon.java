package Weapon;

import Item.Equipable;
import Item.Item;

public class Weapon extends Item implements Equipable{

	public Weapon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	/**
	 * damage Weapon does
	 */
	private int damage;
	/**
	 * needed Strength to equip
	 */
	private int neededStrength;
	/**
	 * needed Agility to equip
	 */
	private int neededAgility;
	/**
	 * needed Wisdom to equip
	 */
	private int neededWisdom;
	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * @return the neededStrength
	 */
	public int getNeededStrength() {
		return neededStrength;
	}
	/**
	 * @return the neededWisdom
	 */
	public int getNeededWisdom() {
		return neededWisdom;
	}
	/**
	 * @return the neededAgility
	 */
	public int getNeededAgility() {
		return neededAgility;
	}	
}
