/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import javax.swing.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author luis
 */
public class Tileset implements Resource{
    static final long serialVersionUID = 1L;
    public GFile image;
    public int startx = 0, starty = 0, bwidth = 0, bheight = 0;
    public int tilew = 20, tileh = 20;
    
    public ImageIcon getImage(){
        if(image==null)
            return null;
        return ((org.gcreator.fileclass.res.GImage)(image.value)).image;
    }
    
    /**@deprecated*/
    public Tileset(String name){
        this();
    }
    
    public Tileset(/*String name*/){
        //this.name = name;
        image = null;
    }
    
    public Resource clone(){
        Tileset x = new Tileset();
        x.image = image;
        x.startx = startx;
        x.starty = starty;
        x.bwidth = bwidth;
        x.bheight = bheight;
        x.tilew = tilew;
        x.tileh = tileh;
        return x;
    }
    
    public String exportToHtml(boolean xhtml){
        return "";
    }
}
