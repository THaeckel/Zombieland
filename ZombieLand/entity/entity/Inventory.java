package entity;

import item.Item;
import item.ItemStack;
import item.Stackable;

import java.util.ArrayList;
import java.util.List;

/**
 * this Class represents the Inventory of an Entity
 * 
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
	 * 
	 * @param itemStack
	 */
	public boolean addItemStack(ItemStack itemStack) {
		boolean result = false;
		if (itemStack != null) {
			if (itemStack.getItem() instanceof Stackable) {
				int position = items.indexOf(itemStack);
				if (position >= 0) {
					items.get(position).add(itemStack.getNumber());
				} else {
					items.add(itemStack);
				}
			} else {
				items.add(itemStack);
			}
		}
		return result;
	}

	/**
	 * adds Item to list creates new ItemStack if items not already in
	 * 
	 * @param item
	 *            to be added
	 */
	public boolean addItem(Item item) {
		boolean result = false;
		if (item != null) {
			result = addItemStack(new ItemStack(item, 1));
		}
		return result;
	}

	public boolean removeItemStack(ItemStack stack) {
		boolean result = false;
		if (stack != null) {
			int position = items.indexOf(stack);
			if(position >=0){
				items.get(position).remove(stack.getNumber());
				if (items.get(position).getNumber() == 0){
					items.remove(position);
				}
				result = true;
			}
		}
		return result;
	}

	public boolean removeItem(Item item) {
		boolean result = false;
		if (item != null) {
			result = removeItemStack(new ItemStack(item, 1));
		}
		return result;
	}

	/**
	 * @return the maxItems
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * raise the MaxItems number
	 * 
	 * @param maxItems
	 *            the maxItems to add
	 */
	public void raiseMaxItems(int addItems) {
		maxItems += addItems;
	}

	/**
	 * reduce the MaxItems number
	 * 
	 * @param maxItems
	 *            the maxItems to subtract
	 */
	public void reduceMaxItems(int subItems) {
		maxItems -= subItems;
	}
}
