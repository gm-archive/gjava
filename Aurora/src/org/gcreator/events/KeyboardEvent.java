/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;
import org.gcreator.components.impl.EventSelectListener;

/**
 *
 * @author TGMG
 */
public class KeyboardEvent extends Event {
static final long serialVersionUID = 1L;
public int type,keycode; //keycode
public ImageIcon icon ;
public String text = " key",name="";

KeyboardEvent(){
    
}

public KeyboardEvent(int type,String name){
    PRIORITY = 700;
    this.name=name;
        this.type = type;
        keycode = type;//-EventSelectListener.Keyboard;
        System.out.println("Keyboard Type:"+type);
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/keyboard.png"));
    }

public String toString(){
//        switch(keycode){
//            case 65: return "A"+text;
//            
//            default: return "Invalid Keyboard Event:"+keycode;
//        }
    return name+text;
}
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/keyboard.png"));
        return icon;
    }
    
    public Event clone(){
        return new KeyboardEvent(type, name);
    }
}
