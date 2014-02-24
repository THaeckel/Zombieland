package imageHandler;

import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Image Handler for ItemImages
 * @author Timo
 *
 */
public class ItemImage extends ImageHandler {
	/**
	 * Constant Parameter WIDTH for the width of one Image
	 */
	private static final int WIDTH = 25;
	/**
	 * Constant Parameter HIGHT for the width of one Image
	 */
	private static final int HIGHT = 25;
	
	/**
	 * Constructor
	 */
	public ItemImage (){
		try {
			setImage(ImageIO.read(ItemImage.class.getResource("/ItemImages.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(WIDTH,HIGHT);
	}		
}
