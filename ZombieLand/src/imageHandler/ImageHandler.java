package imageHandler;

import java.awt.image.BufferedImage;
/**
 * Iamage Handler for ImageLists 
 * @author Timo
 *
 */
public abstract class ImageHandler {
	
	/**
	 * hight of one Image in ImageList
	 */
	private int hight;
	
	/**
	 * width of one Image in ImageList
	 */
	private int width;
	
	/**
	 * Image to Handle
	 */
	private BufferedImage image;

	/**
	 * @return the image
	 */
	public BufferedImage getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(BufferedImage image) {
		this.image = image;
	}

	/**
	 * @return the hight
	 */
	public int getHight() {
		return hight;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * set hight and width of one Image in Image list
	 * @param hight to set
	 * @param width to set
	 */
	public void setSize(int hight, int width) {
		this.hight = hight;
		this.width = width;
	}
	
	/**
	 * getImage to image ID 
	 * @param id of the Image
	 * @return Image from List
	 */
	public BufferedImage getImage (int id){
		return getImage().getSubimage(id * getWidth(), 0, getWidth(), getHight());
	}
}
