package item;

/**
 * This class represents an Item in Zombieland
 * @author Timo
 * 
 */
public class Item {
	/**
	 * name of Item
	 */
	private String NAME;
	
	/**
	 * id of the Item
	 */
	private int itemID;
	
	/**
	 * Constructor
	 * @param name of Item
	 */
	public Item (String name){
		this.NAME = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return NAME;
	}
	
	@Override
	public String toString() {
		return "Item: " + NAME;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Item) {
			Item item = (Item) obj;
			if (item.itemID == this.itemID && item.NAME.equals(this.NAME)) {
				equal = true;
			}
		}
		return equal;
	}

	/**
	 * @return the itemID
	 */
	public int getItemID() {
		return itemID;
	}

	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
}