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
    @Override
    public String toString(){
        switch(type){
            case 6: return "Left Button Clicked";
            case 7: return "Left Button Pressed";
            case 8: return "Left Button Released";
            case 9: return "Global Left Button Clicked";
            case 10: return "Global Left Button Pressed";
            case 11: return "Global Left Button Released";
            case 12: return "Right Button Clicked";
            case 13: return "Right Button Pressed";
            case 14: return "Right Button Released";
            case 15: return "Global Right Button Clicked";
            case 16: return "Global Right Button Pressed";
            case 17: return "Global Right Button Released";
            case 18: return "Mouse Entered (Over)";
            case 19: return "Mouse Exited (Out)";
            default: return "Invalid Mouse Event";
        }
    }
    
    @Override
    public ImageIcon getImage(){
        return icon;
    }
}
