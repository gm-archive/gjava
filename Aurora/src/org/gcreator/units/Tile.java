/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public class Tile {
    public GFile file = null;
    public int width = 20;
    public int height = 20;
    public int layer = 0;
    public int tilex;
    public int tiley;
    public int x = 0;
    public int y = 0;
    
    public ImageIcon getTilesetImage(){
        if(file == null) {
            System.out.println("file is null");
            return null;
        }
        if(file.value == null) {
            System.out.println("file.value is null");
            return null;
        }
        if(file.value instanceof Tileset) {
            ImageIcon i = ((Tileset) file.value).getImage();
            BufferedImage b = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            b.createGraphics().drawImage(i.getImage(), -tilex, -tiley, i.getImageObserver());
            return new ImageIcon(b);
        }
        System.out.println("tileset.value ain't no Tileset. It's a "+file.value.getClass().getSimpleName());
        return null;
    }
    
    public void drawTileImage(Graphics g){
        if(g==null) {
            return;
        }
        ImageIcon img = getTilesetImage();
        if(img==null) {
            return;
        }
        ImageIcon i = ((Tileset) file.value).getImage();
        BufferedImage b = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        b.createGraphics().drawImage(i.getImage(), -tilex, -tiley, i.getImageObserver());
        g.drawImage(new ImageIcon(b).getImage(),x,y,null);
    }
}
