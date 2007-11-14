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
public class DestroyEvent extends Event{
    
    static ImageIcon icon;
    public DestroyEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/destroy.png"));
    }
    
     
    public String toString(){
        return "Destroy";
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/destroy.png"));
        return icon;
    }
}
