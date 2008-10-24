package org.dolphin.game.api.components;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;

import org.dolphin.game.Scripts;

public class Tile extends Scripts implements Comparable {
	/**
	 * The depth of the tile
	 */
	public double depth;
	/**
	 * The x coordinate of the tile
	 */
	public double x;
	/**
	 * The y coordinate of the tile
	 */
	public double y;
	/**
	 * The x coordinate of the cropped tile, used for cropping the Image
	 */
	public double tileX;
	/**
	 * The y coordinate of the cropped tile, used for cropping the Image
	 */
	public double tileY;
	/**
	 * The width of the cropped tile, used for cropping the Image
	 */
	public double tileW;
	/**
	 * The height of the cropped tile, used for cropping the Image
	 */
	public double tileH;
	/**
	 * The id of the tile
	 */
	public double id;
	public int background;
	/**
	 * Whether or not the tile is visible
	 */
	public boolean visible;
	/**
	 * The tile Image
	 */
	public Image tileimage;
	/**
	 * The instance id, set to 0 as this is a tile
	 */
	public double instance_id = 0;

	public Tile() {
	}

	public Tile(double x, double y, double tileX, double tileY, double tileW,
			double tileH, double depth, double id, int background) {
		this.x = x;
		this.y = y;
		this.tileX = tileX;
		this.tileY = tileY;
		this.tileW = tileW;
		this.tileH = tileH;
		this.depth = depth;
		this.id = id;
		this.background = background;
		Load_image();
	}

	public int compareTo(java.lang.Object o) {
		Tile t = (Tile) o;

		int i = (int) depth - (int) t.depth;
		if (i == 0) {
			if (t.instance_id < 200000 && instance_id < 200000) {
				i = (int) (t.instance_id - 100000)
						- (int) (instance_id - 100000);

			} else
				i = (int) (instance_id - 200000)
						- (int) (t.instance_id - 200000);
		}
		// return i != 0 ? i : (int)depth - (int)t.depth;
		return i;
	}

	/**
	 * load the tile image
	 */
	public void Load_image() {
		// load the image
		// check if the image has to be cropped
		// tileimage =
		// cropImage(basicgame.background[background].show(),(int)tileX,(int)tileY,(int)tileW,(int)tileH);
	}

	/**
	 * Draw the tile
	 * 
	 * @param g
	 */
	public void Draw_event(Graphics g) {
		g.drawImage(get_image(), (int) x, (int) y, null);
	}

	/**
	 * Get the tile image
	 * 
	 * @return Image object of the tile
	 */
	public Image get_image() {
		return tileimage;
	}

	/**
	 * Crop the tile Image
	 * 
	 * @param img
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return The cropped Image object
	 */
	public Image cropImage(Image img, int x, int y, int width, int height) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.createImage(new FilteredImageSource(img
				.getSource(), new CropImageFilter(x, y, width, height)));
		return image;
	}
}
