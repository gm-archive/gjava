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
    
    Color(int red, int green, int blue){
    c = new java.awt.Color(red,green,blue);
    }
    
    Color(java.awt.Color cc){
        c=cc;
    }
    
}
