package item;

import itemAccessoire.Amulet;
import itemAccessoire.Ring;
import itemArmor.Armor;
import itemWeapon.CloseCombatWeapon;
import itemWeapon.DistanceCombatWeapon;


/**
 * Equipment of Entity
 * @author Timo
 *
 */
public class Equipment {
	
	/**
	 * Close combat weapon worn
	 */
	private CloseCombatWeapon closeCombat;
	/**
	 * distance combat weapon worn
	 */
	private DistanceCombatWeapon distanceCombat;
	/**
	 * amulet worn
	 */
	private Amulet amulet;
	/**
	 * ring worn on left hand
	 */
	private Ring ringLeft;
	/**
	 * ring worn on right hand
	 */
	private Ring ringRight;
	/**
	 * helmet worn
	 */
	private Armor helmet;
	/**
	 * body Armor worn
	 */
	private Armor bodyArmor;
	/**
	 * usable Item Array slot 1
	 */
	private UsableItem usable1; 
	/**
	 * usable Item Array slot 2
	 */
	private UsableItem usable2;
	/**
	 * usable Item Array slot 3
	 */
	private UsableItem usable3;
	
	/**
	 * @return the closeCombat
	 */
	public CloseCombatWeapon getCloseCombat() {
		return closeCombat;
	}
	/**
	 * @param closeCombat the closeCombat to set
	 */
	public void setCloseCombat(CloseCombatWeapon closeCombat) {
		this.closeCombat = closeCombat;
	}
	/**
	 * @return the distanceCombat
	 */
	public DistanceCombatWeapon getDistanceCombat() {
		return distanceCombat;
	}
	/**
	 * @param distanceCombat the distanceCombat to set
	 */
	public void setDistanceCombat(DistanceCombatWeapon distanceCombat) {
		this.distanceCombat = distanceCombat;
	}
	/**
	 * @return the amulet
	 */
	public Amulet getAmulet() {
		return amulet;
	}
	/**
	 * @param amulet the amulet to set
	 */
	public void setAmulet(Amulet amulet) {
		this.amulet = amulet;
	}
	/**
	 * @return the ringLeft
	 */
	public Ring getRingLeft() {
		return ringLeft;
	}
	/**
	 * @param ringLeft the ringLeft to set
	 */
	public void setRingLeft(Ring ringLeft) {
		this.ringLeft = ringLeft;
	}
	/**
	 * @return the ringRight
	 */
	public Ring getRingRight() {
		return ringRight;
	}
	/**
	 * @param ringRight the ringRight to set
	 */
	public void setRingRight(Ring ringRight) {
		this.ringRight = ringRight;
	}
	/**
	 * @return the helmet
	 */
	public Armor getHelmet() {
		return helmet;
	}
	/**
	 * @param helmet the helmet to set
	 */
	public void setHelmet(Armor helmet) {
		this.helmet = helmet;
	}
	/**
	 * @return the bodyArmor
	 */
	public Armor getBodyArmor() {
		return bodyArmor;
	}
	/**
	 * @param bodyArmor the bodyArmor to set
	 */
	public void setBodyArmor(Armor bodyArmor) {
		this.bodyArmor = bodyArmor;
	}
	/**
	 * @return the usable1
	 */
	public UsableItem getUsable1() {
		return usable1;
	}
	/**
	 * @param usable1 the usable1 to set
	 */
	public void setUsable1(UsableItem usable1) {
		this.usable1 = usable1;
	}
	/**
	 * @return the usable2
	 */
	public UsableItem getUsable2() {
		return usable2;
	}
	/**
	 * @param usable2 the usable2 to set
	 */
	public void setUsable2(UsableItem usable2) {
		this.usable2 = usable2;
	}
	/**
	 * @return the usable3
	 */
	public UsableItem getUsable3() {
		return usable3;
	}
	/**
	 * @param usable3 the usable3 to set
	 */
	public void setUsable3(UsableItem usable3) {
		this.usable3 = usable3;
	}
	
}
