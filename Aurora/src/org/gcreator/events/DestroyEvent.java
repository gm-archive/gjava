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
    
    ImageIcon icon;
    public DestroyEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/destroy.png"));
    }
    
    @Override
    public String toString(){
        return "Destroy";
    }
    
    @Override
    public ImageIcon getImage(){
        return icon;
    }
}
