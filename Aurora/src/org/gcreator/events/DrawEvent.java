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
    
    ImageIcon icon;
    public DrawEvent(){
        icon = new ImageIcon(getClass().getResource("/resources/events/draw.png"));
    }
    
    @Override
    public String toString(){
        return "Draw";
    }
    
    @Override
    public ImageIcon getImage(){
        return icon;
    }
}
