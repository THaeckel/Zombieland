package Item;

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
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Item) {
			Item item = (Item) obj;
			if (item.name == this.name) {
				equal = true;
			}
		}
		return equal;
	}
}