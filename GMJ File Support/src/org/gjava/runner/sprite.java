package org.gjava.runner;

import java.awt.*;
import java.net.*;
import javax.swing.*;

public class sprite
	{

	String filename;

	Image spritename[];

	int Transparent;

	public int  sprite_width, sprite_height, sprite_xoffset, sprite_yoffset, image_number,
			image_index, image_speed, depth, subimages, image_count;

	public double currenti;
	
	public int BBLeft, BBRight, BBTop, BBBottom;

	public sprite(String sprite_name,int Height,int Width,int BBLeft,int BBRight,int BBBottom,int BBTop,
			int Transparent,int SmoothEdges,int PreLoadTexture,int BoundingBox,int PreciseCollisionDetection,
			int OriginX,int OriginY,int subimages)
		{

		this.sprite_width = Width;
		this.sprite_height = Height;
		this.BBBottom = BBBottom;
		this.BBTop = BBTop;
		this.BBRight = BBRight;
		this.BBLeft = BBLeft;
		this.sprite_xoffset = OriginX;
		this.sprite_yoffset = OriginY;
		this.Transparent = Transparent;
		this.subimages = subimages;
		filename = sprite_name;
		this.spritename = new Image[subimages];
		loadImage();
		}

	public Image imshow(double i)
		{
		
		while (i>=this.subimages)
			{
			i=i-subimages;
			}
		
		if (((int)i) == -1)
			{
			i = currenti;
			}
		else
			{
			currenti = i;
			}
		
		
		
		return spritename[(int)i];

		}

	// Crop sprite to bounding box

	private void cropSprite(Image img)
		{
		// Crop all 8x8 blocks

		// PixelGrabber pg=new PixelGrabber(img,0,0,64*8,32*8,false);
		// try { pg.grabPixels(); } catch (InterruptedException ex) { };
		// byte[] map = (byte[])pg.getPixels();
		// offscrcm = pg.getColorModel();

		// for (int x=0; x<16; x++) for (int y=0; y<128; y++)
		// for (int sx=0; sx<bw; sx++) for (int sy=0; sy<bw; sy++)
		// maps[x+y*16][sx+sy*bw] = map[(x*8)+(sx/scale)+(y/32*16*8)+(y%32*64*8*8)+(sy/scale*64*8)];
		}

	private final boolean loadImage()
		{
		for (int i = 0; i < subimages; i++)
			{
			if (GameSettings.injar == false)
				{

				if (basicgame.Runningas == "Applet")
					{
					try
						{
						spritename[i] = new ImageIcon(new URL(basicgame.u,filename + "N" + i + ".png")).getImage();
						}
					catch (MalformedURLException ex)
						{
						}
					}
				else
					{

					spritename[i] = new ImageIcon(filename + "N" + i + ".png").getImage();
					}

				}
			else
				{
				// get image inside jar
				spritename[i] = new ImageIcon(getClass().getResource(filename + "N" + i + ".png")).getImage();

				}

			this.spritename[i] = spritename[i];
			}
		return true;
		}

	}