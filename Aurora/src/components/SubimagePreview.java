/*
 * Changes Copyright (C) 2007 TGMG www.g-creator.org
 * Copyright (C) 2007 Clam <ebordin@aapt.net.au>
 * 
 * This file is part of Lateral GM.
 * Lateral GM is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package components;

import editors.SpriteEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


public class SubimagePreview extends AbstractImagePreview
	{
	private static final long serialVersionUID = 1L;

	private SpriteEditor frame;

	private static final int ORIGIN_SIZE = 20;

	public SubimagePreview(SpriteEditor frame)
		{
		super();
		this.frame = frame;
		enableEvents(MouseEvent.MOUSE_PRESSED);
		}

	public void paintComponent(Graphics g)
		{
		super.paintComponent(g);
		BufferedImage img = frame.subimage;
		if (img != null)
			{
			setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
			int originX = (Integer)frame.jSpinner1.getValue();
			int originY = (Integer)frame.jSpinner2.getValue();
			int bboxLeft = (Integer)frame.jSpinner3.getValue();
			int bboxRight = (Integer)frame.jSpinner5.getValue();
			int bboxTop = (Integer)frame.jSpinner4.getValue();
			int bboxBottom = (Integer)frame.jSpinner6.getValue();

			int left = Math.min(bboxLeft,bboxRight);
			int right = Math.max(bboxLeft,bboxRight);
			int top = Math.min(bboxTop,bboxBottom);
			int bottom = Math.max(bboxTop,bboxBottom);

			Shape oldClip = g.getClip(); //backup the old clip
			Rectangle oldc = g.getClipBounds();
			//Set the clip properly
			g.setClip(new Rectangle(oldc.x,oldc.y,Math.min(oldc.x + oldc.width,img.getWidth()) - oldc.x,
					Math.min(oldc.y + oldc.height,img.getHeight()) - oldc.y));

			g.setXORMode(Color.BLACK); //XOR mode so that bbox and origin can counter
			g.setColor(Color.WHITE);

			g.drawRect(left,top,right - left,bottom - top);
			g.drawLine(originX - ORIGIN_SIZE,originY,originX + ORIGIN_SIZE,originY);
			g.drawLine(originX,originY - ORIGIN_SIZE,originX,originY + ORIGIN_SIZE);

			g.setPaintMode(); //just in case
			g.setClip(oldClip); //restore the clip
			}
		else
			setPreferredSize(new Dimension(0,0));
		}

	protected void processMouseEvent(MouseEvent e)
		{
		if (e.getID() == MouseEvent.MOUSE_PRESSED && e.getButton() == MouseEvent.BUTTON1
				&& e.getX() < getPreferredSize().width && e.getY() < getPreferredSize().height)
			{
			frame.jSpinner1.setValue((Integer)e.getX());
			frame.jSpinner2.setValue((Integer)e.getY());
			}
		super.processMouseEvent(e);
		}

	protected BufferedImage getImage()
		{
		if (frame != null) return frame.subimage;
		return null;
		}
	}
