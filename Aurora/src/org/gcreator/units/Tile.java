/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.awt.*;
import javax.swing.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public class Tile {
    public File tileset = null;
    public int sx = 0;
    public int sy = 0;
    public int width = 20;
    public int height = 20;
    public int dx = 0;
    public int dy = 0;
    public int depth = 0;
    
    public ImageIcon getTilesetImage(){
        if(tileset == null)
            return null;
        if(tileset.value == null)
            return null;
        if(tileset.value instanceof ImageIcon)
            return (ImageIcon) tileset.value;
        return null;
    }
    
    public void drawTileImage(Graphics g){
        if(g==null)
            return;
        ImageIcon img = getTilesetImage();
        if(img==null)
            return;
        g.drawImage(img.getImage(), dx, dy, dx+width, dy+height, sx, sy, sx+width, sy+height, img.getImageObserver());
    }
}
