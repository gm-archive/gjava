/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;

/**
 *
 * @author TGMG
 */
public class KeyboardEvent extends Event {
static final long serialVersionUID = 1L;
public int type; //keycode
public static ImageIcon icon ;

KeyboardEvent(){
    
}

public KeyboardEvent(int type){
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/keyboard.png"));
    }


}
