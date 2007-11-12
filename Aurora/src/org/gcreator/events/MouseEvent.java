/*
 * MouseEvent.java
 * 
 * Created on 26/Set/2007, 15:01:31
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
public class MouseEvent extends Event{
    public int type;
    public ImageIcon icon;
    public MouseEvent(int type){
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/mouse.png"));
    }
     
    public String toString(){
        switch(type){
            case 5006: return "Left Button Clicked";
            case 5007: return "Left Button Pressed";
            case 5008: return "Left Button Released";
            case 5009: return "Global Left Button Clicked";
            case 5010: return "Global Left Button Pressed";
            case 5011: return "Global Left Button Released";
            case 5012: return "Right Button Clicked";
            case 5013: return "Right Button Pressed";
            case 5014: return "Right Button Released";
            case 5015: return "Global Right Button Clicked";
            case 5016: return "Global Right Button Pressed";
            case 5017: return "Global Right Button Released";
            case 5018: return "Mouse Entered (Over)";
            case 5019: return "Mouse Exited (Out)";
            default: return "Invalid Mouse Event";
        }
    }
    
     
    public ImageIcon getImage(){
        return icon;
    }
}
