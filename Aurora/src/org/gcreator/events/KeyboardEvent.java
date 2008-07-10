/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
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
    PRIORITY = 7000;
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
