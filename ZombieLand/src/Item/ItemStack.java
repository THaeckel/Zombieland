package Item;

public class ItemStack {

	/**
	 * Item type of Stack
	 */
	private Item item;
	/**
	 * number of Items in Stack
	 */
	private int number;

	public ItemStack(Item item, int number) {
		this.item = item;
		setNumber(number);
	}

	/**
	 * 
	 * @return maximum of Stackable items
	 */
	public int getMaxStackable() {
		return item.getMaxStackable();
	}

	/**
	 * increments number by one
	 * @return true if added
	 */
	public boolean add() {
		boolean added = false;
		if (!isFull()){
			number++;
			added = true;
		}
		return added;
	}
	
	/**
	 * add more Items to item Stack
	 * @param value - number of items to add
	 * @return number of items that could not be added to stack
	 */
	public int add(int value) {
		int overflow = 0;
		number += value;
		if (number > getMaxStackable()){
			overflow = number - getMaxStackable();
			number -= overflow;
		}
		return overflow;
	}

	/**
	 * @return true if Stack is full
	 */
	public boolean isFull() {
		return number == getMaxStackable();
	}

	@Override
	public boolean equals (Object obj){
		boolean equal = false;
		if (obj instanceof Item) {
			equal = item.equals(obj);
		}else if (obj instanceof ItemStack) {
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
	 * only set Number if number <= maximum Stackable
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		if (number <= getMaxStackable()) {
			this.number = number;
		}
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

}
