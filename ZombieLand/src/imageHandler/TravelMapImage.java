package imageHandler;

import java.io.IOException;

import javax.imageio.ImageIO;

public class TravelMapImage extends ImageHandler {

	/**
	 * Constant Parameter WIDTH for the width of one Image
	 */
	private static final int WIDTH = 300;
	/**
	 * Constant Parameter HIGHT for the width of one Image
	 */
	private static final int HIGHT = 300;

	/**
	 * Constructor
	 */
	public TravelMapImage() {
		try {
			setImage(ImageIO.read(ItemImage.class.getResource("/Container.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSize(WIDTH, HIGHT);
	}
}
