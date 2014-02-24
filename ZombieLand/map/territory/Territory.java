package territory;

import java.awt.Point;

import entity.Entity;

/**
 * Territorys in game
 * @author Timo
 *
 */
public abstract class Territory {

	/**
	 * min Spawnlevel 
	 */
	private int minLevel;

	/**
	 * max Spawnlevel 
	 */
	private int maxLevel;
	
	/**
	 * name of Territory
	 */
	private String name;
	
	public Territory (String name, int minLevel, int maxLevel){
		this.name = name;
		this.maxLevel = maxLevel;
		this.minLevel = minLevel;
	}
	
	/**
	 * random enemy Spawn in Territory 
	 * @return Entity to Spawn 
	 */
	public abstract Entity spawnEnemy (Point position);

	/**
	 * @return the minLevel
	 */
	public int getMinLevel() {
		return minLevel;
	}

	/**
	 * @return the maxLevel
	 */
	public int getMaxLevel() {
		return maxLevel;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
