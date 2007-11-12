/*
 * CreateEvent.java
 * 
 * Created on 24/Set/2007, 19:58:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class DrawEvent extends Event{
    
    static ImageIcon icon;
    public DrawEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/draw.png"));
    }
    
     
    public String toString(){
        return "Draw";
    }
    
     
    public ImageIcon getImage(){
        return icon;
    }
}
