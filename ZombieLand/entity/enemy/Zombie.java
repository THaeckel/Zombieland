package enemy;

import java.awt.Point;
/**
 * Zombie enemy
 * @author Timo
 *
 */
public class Zombie extends EnemyEntity{
	/**
	 * Counter for Name
	 */
	private static int number=0;
	
	/**
	 * Contructor
	 * @param level to set
	 * @param position to set
	 * @param health to set
	 * @param wisdom to set
	 * @param agility to set
	 * @param strength to set
	 * @param experience to set
	 */
	public Zombie(int level, Point position, int health,
			int wisdom, int agility, int strength, int experience) {
		//--> berechnen der stats !!
		super(("Zombie" + number), level, position, health, wisdom, agility, strength, experience);
		//--> random ausrüstung
		
		number ++;
	}
}
