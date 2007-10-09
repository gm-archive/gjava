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
public class StepEvent extends Event{
    
    ImageIcon icon;
    public StepEvent(){
        icon = new ImageIcon(getClass().getResource("/resources/events/step.png"));
    }
    
    @Override
    public String toString(){
        return "Step";
    }
    
    @Override
    public ImageIcon getImage(){
        return icon;
    }
}
