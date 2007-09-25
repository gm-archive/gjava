/*
 * CreateEvent.java
 * 
 * Created on 24/Set/2007, 19:58:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package events;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class BeginStepEvent extends Event{
    
    ImageIcon icon;
    public BeginStepEvent(){
        icon = new ImageIcon(getClass().getResource("/resources/events/step.png"));
    }
    
    @Override
    public String toString(){
        return "Begin Step";
    }
    
    @Override
    public ImageIcon getImage(){
        return icon;
    }
}
