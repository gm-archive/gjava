/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

/**
 *
 * @author TGMG
 */
public class Color extends Object {

    public java.awt.Color c = java.awt.Color.BLACK;

        
    public Color(int red, int green, int blue){
    c = new java.awt.Color(red,green,blue);
    }
    
    Color(java.awt.Color cc){
        c=cc;
    }

    @Override
    public java.lang.String toString() {
        return "red:"+c.getRed()+" green:"+c.getGreen()+" blue:"+c.getBlue();
    }
    
    
    
}
