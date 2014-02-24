package testEntity;

import static org.junit.Assert.assertTrue;
import item.Item;
import item.ItemStack;
import itemPlant.Plant;

import org.junit.Test;

import entity.Inventory;

/**
 * Test Class for Inventory Class
 * 
 * @author Timo
 * 
 */
public class TestInventory {

	@Test
	public void testInventory() {
		Inventory inventory = new Inventory();
		// test getter and setter
		assertTrue("false inventory size", inventory.getMaxItems() == 100);
		assertTrue("list not empty", inventory.getItems().isEmpty() == true);

		// test add Items
		Item item = new Item("trank");
		Item stackable = new Plant("pflanze");

		inventory.addItem(item);

		assertTrue("inventory not empty (add item 1)", inventory.getItems()
				.isEmpty() == false);
		assertTrue("false inventory size (add item 1)", inventory.getItems()
				.size() == 1);

		inventory.addItem(item);

		assertTrue("false inventory size (add item 2)", inventory.getItems()
				.size() == 2);
		assertTrue("false stacked (add item 2)",
				inventory.getItems().size() != 1
						&& inventory.getItems().get(0).getNumber() == 1);

		inventory.addItem(stackable);

		assertTrue("false inventory size (add stackable 1)", inventory
				.getItems().size() == 3);
		assertTrue("false stacked (add stackable 1)", inventory.getItems()
				.size() != 2 && inventory.getItems().get(2).getNumber() == 1);

		inventory.addItemStack(new ItemStack(stackable, 10));

		assertTrue("false inventory size (add stackable 2)", inventory
				.getItems().size() == 3);
		assertTrue("false stacked (add stackable 2)", inventory.getItems()
				.size() == 3 && inventory.getItems().get(2).getNumber() == 11);

		// test remove
		inventory.removeItem(item);

		assertTrue("false inventory size (remove item 1)", inventory.getItems()
				.size() == 2);

		inventory.removeItem(item);

		assertTrue("false inventory size (remove item 1)", inventory.getItems()
				.size() == 1);

		inventory.removeItem(stackable);
		assertTrue("false inventory size (remove item 1)", inventory.getItems()
				.size() == 1);
		assertTrue("false stacked (add stackable 2)",
				inventory.getItems().get(0).getNumber() == 10);
		
		inventory.removeItemStack(new ItemStack (stackable, 5));
		assertTrue("false inventory size (remove item 1)", inventory.getItems()
				.size() == 1);
		assertTrue("false stacked (add stackable 2)",
				inventory.getItems().get(0).getNumber() == 5);
		
		inventory.removeItemStack(new ItemStack (stackable, 5));
		assertTrue("false inventory size (remove item 1)", inventory.getItems()
				.size() == 0);

	}

}
