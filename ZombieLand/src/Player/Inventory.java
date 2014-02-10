package Player;

import java.util.ArrayList;
import java.util.List;

import Item.Item;
import Item.ItemStack;

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
	 * maximum Items could be added
	 */
	private int maxItems = 200;

	/**
	 * @return the items
	 */
	public List<ItemStack> getItems() {
		return items;
	}

	/**
	 * @return the maxItems
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * @param maxItems
	 *            the maxItems to set
	 */
	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}
/*	
	public ItemStack addItemStack (ItemStack itemStack){
		
		if (itemStack != null){
			int position = items.indexOf(itemStack);
			if (position >= 0){
				if (items.get(position).add()) {
				}
				
			} else {
				if (items.size() <= maxItems) {
					items.add(itemStack);
				}
			}
		}		
		return itemStack;
	}*/
	
	/**
	 * adds Item to list creates new ItemStack if items not already in
	 * @param item to be added
	 * @return true if item added
	 */
	public boolean addItem(Item item) {
		boolean added = false;
		if (item != null) {
			int position = items.indexOf(item);
			if (position >= 0) {
				if (items.get(position).add()) {
					added = true;
				}
			} else {
				if (items.size() <= maxItems) {
					items.add(new ItemStack(item,1));
					added = true;
				}
			}
		}
		return added;
	}	
}
