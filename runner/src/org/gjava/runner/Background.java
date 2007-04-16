package org.gjava.runner.runner;

// this is the Background class

import java.awt.*;
import javax.swing.ImageIcon;

public class Background
	{

	String filename;

	Image backname;

	// int visible;
	int back_width, back_height, Transparent, Smooth, Preload, tileset, tileh, tilew, hor_o, ver_o, hor_sep,
			ver_sep;

	public Background(String spritename,int Width,int Height,int Transpearant,int SmoothEdges,
			int PreLoadTexture,int UseTileSet,int TileWidth,int TileHeight,int HorizontalOffset,int VerticalOffset,
			int HorizontalSep,int VerticalSep)
		{

		filename = spritename;
		this.back_width = Width;
		this.back_height = Height;
		loadImage();
		}

	public Image show()
		{
		// JOptionPane.showMessageDialog(null,filename+".bmp");
		return backname;
		}

	// Crop sprite to bounding box TODO
	// private void cropSprite(Image img) {
	// Crop all 8x8 blocks

	// PixelGrabber pg=new PixelGrabber(img,0,0,64*8,32*8,false);
	// try { pg.grabPixels(); } catch (InterruptedException ex) { };
	// byte[] map = (byte[])pg.getPixels();
	// offscrcm = pg.getColorModel();

	// for (int x=0; x<16; x++) for (int y=0; y<128; y++)
	// for (int sx=0; sx<bw; sx++) for (int sy=0; sy<bw; sy++)
	// maps[x+y*16][sx+sy*bw] = map[(x*8)+(sx/scale)+(y/32*16*8)+(y%32*64*8*8)+(sy/scale*64*8)];
	// }

	private final Image loadImage()
		{

		// backname = new ImageIcon(filename+".png").getImage();
		backname = new ImageIcon(getClass().getResource(filename + ".png")).getImage();

		// return new ImageIcon(filename).getImage();
		return backname;
		}

	}