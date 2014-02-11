package Item;

public class Storage extends Item implements Equipable{
	/**
	 * 
	 */
	private int MAXSPACE;

	/**
	 * Constructor
	 * @param name
	 * @param maxSpace
	 */
	public Storage(String name, int maxSpace) {
		super(name);
		this.MAXSPACE = maxSpace;
	}
	
	/**
	 * @return the mAXSPACE
	 */
	public int getMAXSPACE() {
		return MAXSPACE;
	}
}