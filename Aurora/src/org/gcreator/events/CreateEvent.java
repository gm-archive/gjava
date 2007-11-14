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
public class CreateEvent extends Event{
    
   static ImageIcon icon;
    public CreateEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/create.png"));
    }
    
     
    public String toString(){
        return "Create";
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/create.png"));
        return icon;
    }
}
