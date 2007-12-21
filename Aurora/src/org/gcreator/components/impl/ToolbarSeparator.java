/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.awt.*;

/**
 *
 * @author luis
 */
public class ToolbarSeparator extends ToolbarItem{
    public ToolbarSeparator(){
        
    }
    public int getWidth(){
        return 3;
    }
    public int getHeight(){
        return 10;
    }
    public void paint(Graphics g, int x, int width){
        g.setColor(Color.BLACK);
        g.drawLine(x+1, 1, x+1, width-1);
    }
}
