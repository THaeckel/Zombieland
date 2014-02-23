package itemMap;

import item.Item;
import item.Stackable;

/**
 * This Class represents a Map Item. 
 * @author Timo
 */
public class Map extends Item implements Stackable {

	/**
	 * Sourcefile of the map
	 */
	private String sourceFile;
	
	public Map(String name, String sourceFile) {
		super(name);
		this.sourceFile = sourceFile;
	}

	/**
	 * @return the sourceFile
	 */
	public String getSourceFile() {
		return sourceFile;
	}
}
