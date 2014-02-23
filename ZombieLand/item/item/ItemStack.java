package item;

/**
 * this Class represents a Stack of Items
 * @author Timo
 *
 */
public class ItemStack {

	/**
	 * Item type of Stack
	 */
	private Item item;
	/**
	 * number of Items in Stack
	 */
	private int number;

	/**
	 * Constructor
	 * 
	 * @param item
	 *            to build item stack which is stackable
	 * @param number
	 *            only counts if item is stackable
	 */
	public ItemStack(Item item, int number) {
		this.item = item;
		setNumber(number);
	}

	/**
	 * add more Items to item Stack
	 * 
	 * @param value
	 *            - number of items to add
	 */
	public void add(int value) {
		setNumber(number + value);
	}

	/**
	 * remove Items from item Stack
	 * 
	 * @param value
	 *            - number of items to remove
	 */
	public void remove(int value) {
		setNumber(number - value);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Item) {
			equal = item.equals(obj);
		} else if (obj instanceof ItemStack) {
			ItemStack itemStack = (ItemStack) obj;
			if (itemStack.getItem().getName() == item.getName()) {
				equal = true;
			}
		}
		return equal;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		if (number >= 1) {
			if (item instanceof Stackable) {
				this.number = number;
			} else {
				this.number = 1;
			}
		} else {
			this.number = 0;
		}
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	@Override
	public String toString() {
		return "ItemStack: (" + item + ", " + number + ")";
	}
}
