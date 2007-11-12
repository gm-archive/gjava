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
public class EndStepEvent extends Event{
    
    static ImageIcon icon;
    public EndStepEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/step.png"));
    }
    
     
    public String toString(){
        return "End Step";
    }
    
     
    public ImageIcon getImage(){
        return icon;
    }
}
