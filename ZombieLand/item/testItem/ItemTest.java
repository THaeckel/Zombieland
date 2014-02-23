package testItem;

import static org.junit.Assert.*;
import item.Item;
import item.ItemStack;
import itemAccessoire.*;
import itemPlant.*;

import org.junit.Test;

/**
 * Test functionality of all Item Classes
 * @author Timo
 */
public class ItemTest {
	
	/**
	 * this Method is used to test the Item Class
	 */
	@Test
	public void testItem(){
		Item item1 = new Item ("test1");
		Item item2 = new Item ("test1");
		Item item3 = new Item ("test2");
		// test Constructor and getter and toString
		assertTrue("Constructor and getter failed", item1.getName().equals("test1"));
		assertTrue("To String failed", item2.toString().equals("Item: test1"));
		
		// test equal
		assertTrue("Equals Method failed",item1.equals(item2));
		assertTrue("Equals Method failed",!item1.equals(item3));
	}
	
	/**
	 * this Method is used to test the ItemStack Class 
	 */
	@Test
	public void testItemStack(){
		Item item1 = new Item ("test1");
		Item item3 = new Plant ("test2");
		Item item2 = new Amulet ("test3");
		// test Constructor and getter.
		ItemStack stack1 = new ItemStack (item1,1);
		ItemStack stack2 = new ItemStack (item2,1);
		ItemStack stack3 = new ItemStack (item3,1);
		assertTrue("Constructor and getter failed(item,item1)", stack1.getItem().equals(item1));
		assertTrue("Constructor and getter failed(item,item2)", stack2.getItem().equals(item2));
		assertTrue("Constructor and getter failed(item,item3)", stack3.getItem().equals(item3));
		assertTrue("Constructor and getter failed(number,item1)", stack3.getNumber()==1);
		assertTrue("Constructor and getter failed(number,item1)", stack3.getNumber()==1);
		assertTrue("Constructor and getter failed(number,item1)", stack3.getNumber()==1);
		
		// test setter for Number
		stack1.setNumber(5);
		stack2.setNumber(5);
		stack3.setNumber(5);
		assertTrue("setNumber failed (item1)", stack1.getNumber()==1);
		assertTrue("setNumber failed (item2)", stack2.getNumber()==1);
		assertTrue("setNumber failed (item3)", stack3.getNumber()!=1);	
		assertTrue("setNumber failed (item3)", stack3.getNumber()==5);
		
		// test equals
		assertTrue("equals Method failed(stack1)",stack1.equals(stack1));
		assertTrue("equals Method failed(stack2)",!stack2.equals(stack1));
		assertTrue("equals Method failed(stack1)",stack1.equals(item1));
		assertTrue("equals Method failed(stack2)",!stack2.equals(item1));
		
		// test toString
		assertTrue("toString failed (stack1)", stack1.toString().equals("ItemStack: (" + item1.toString() + ", 1)"));
		assertTrue("toString failed (stack1)", stack3.toString().equals("ItemStack: (" + item3.toString() + ", 5)"));
		
		// test add
		stack1.add(4);
		stack2.add(4);
		stack3.add(4);
		assertTrue("setNumber failed (item1)", stack1.getNumber()==1);
		assertTrue("setNumber failed (item2)", stack2.getNumber()==1);
		assertTrue("setNumber failed (item3)", stack3.getNumber()!=1);	
		assertTrue("setNumber failed (item3)", stack3.getNumber()==9);
		
		// test remove
		stack1.remove(4);
		stack2.remove(4);
		stack3.remove(4);
		assertTrue("setNumber failed (item1)", stack1.getNumber()==0);
		assertTrue("setNumber failed (item2)", stack2.getNumber()==0);
		assertTrue("setNumber failed (item3)", stack3.getNumber()!=0);	
		assertTrue("setNumber failed (item3)", stack3.getNumber()==5);
	}
}
