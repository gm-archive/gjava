/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.types;

/**
 * This represents a Colour in Dolphin
 * @author TGMG
 */
public class Color extends Variable {

    public java.awt.Color c = java.awt.Color.BLACK;

        
    public Color(int red, int green, int blue){
    c = new java.awt.Color(red,green,blue);
    }
    
    public Color(java.awt.Color cc){
        c=cc;
    }

    @Override
    public java.lang.String toString() {
        return "red:"+c.getRed()+" green:"+c.getGreen()+" blue:"+c.getBlue();
    }
    
    
    
}
