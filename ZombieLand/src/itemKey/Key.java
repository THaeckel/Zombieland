package itemKey;

import item.Item;
import item.Stackable;

public class Key extends Item implements Stackable {
	
	private int lockNo;
	
	public Key(String name, int lockNo) {
		super(name);
		this.lockNo = lockNo;
	}

	/**
	 * @return the lockNo
	 */
	public int getLockNo() {
		return lockNo;
	}
}
