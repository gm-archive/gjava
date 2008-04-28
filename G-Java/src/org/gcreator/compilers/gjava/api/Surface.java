
package org.gcreator.compilers.gjava.api;

import java.awt.image.BufferedImage;

/**
 *
 * @author TGMG
 */
public class Surface extends Object {
    public BufferedImage b;
    public int height, width;
    
    Surface(int width, int height)
    {
        this.width = width;
        this.height = height;
        b =  new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
    }
}
