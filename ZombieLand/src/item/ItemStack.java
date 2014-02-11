package item;

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
	 * @param item to build item stack
	 *            which is stackable
	 * @param number only counts if item is stackable
	 */
	public ItemStack(Item item, int number) {
		this.item = item;
		if (item instanceof Stackable) {
			setNumber(number);
		} else {
			number = 1;
		}
	}

	/**
	 * add more Items to item Stack
	 * @param value
	 *            - number of items to add
	 */
	public void add(int value) {
		if (item instanceof Stackable) {
			number += value;
		}
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
		if (item instanceof Stackable) {
			this.number = number;
		}
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
}
