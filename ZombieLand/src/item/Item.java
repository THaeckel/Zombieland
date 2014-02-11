package item;

/**
 * This class represents an Item in Zombierland
 * 
 * @author Timo
 * 
 */
public class Item {
	/**
	 * name of Item
	 */
	private String NAME;
	
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
		return NAME;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Item) {
			Item item = (Item) obj;
			if (item.NAME == this.NAME) {
				equal = true;
			}
		}
		return equal;
	}
}