package entity;

import java.util.ArrayList;
import java.util.List;

import Item.Item;
import Item.ItemStack;
import Item.Stackable;

/**
 * this Class represents the Inventory of an Entity
 * @author Timo
 * 
 */
public class Inventory {

	/**
	 * item List represents the Inventory
	 */
	private List<ItemStack> items = new ArrayList<ItemStack>();

	/**
	 * 
	 */
	private int maxItems = 100;
	
	/**
	 * @return the items
	 */
	public List<ItemStack> getItems() {
		return items;
	}

	/**
	 * adds ItemStack to list if found fitting ItemStack add them together
	 * @param itemStack
	 */
	public void addItemStack(ItemStack itemStack) {
		if (itemStack != null) {
			if (itemStack.getItem() instanceof Stackable) {
				int position = items.indexOf(itemStack);
				if (position >= 0) {
					items.get(position).add(itemStack.getNumber());
				}
			} else {
				items.add(itemStack);
			}
		}
	}

	/**
	 * adds Item to list creates new ItemStack if items not already in
	 * @param item
	 *            to be added
	 */
	public void addItem(Item item) {
		if (item != null) {
			addItemStack(new ItemStack(item, 1));
		}
	}

	/**
	 * @return the maxItems
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * raise the MaxItems number
	 * @param maxItems the maxItems to add
	 */
	public void raiseMaxItems(int addItems) {
		maxItems += addItems;
	}
	
	/**
	 * reduce the MaxItems number
	 * @param maxItems the maxItems to subtract
	 */
	public void reduceMaxItems(int subItems) {
		maxItems -= subItems;
	}
}
