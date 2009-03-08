package org.dolphin.game.api.types;

import java.awt.image.BufferedImage;

public class Surface extends Variable {
	public BufferedImage b;
    public int height, width;
    
    public Surface(int width, int height)
    {
        this.width = width;
        this.height = height;
        b =  new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
    }
}
