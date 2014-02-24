package imageHandler;

import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Image Handler for ItemImages
 * @author Timo
 *
 */
public class EntityImage extends ImageHandler {
	/**
	 * Constant Parameter WIDTH for the width of one Image
	 */
	private static final int WIDTH = 25;
	/**
	 * Constant Parameter HIGHT for the width of one Image
	 */
	private static final int HIGHT = 50;
	
	/**
	 * Constructor
	 */
	public EntityImage (){
		try {
			setImage(ImageIO.read(ItemImage.class.getResource("/ItemImages.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(WIDTH,HIGHT);
	}		
}
