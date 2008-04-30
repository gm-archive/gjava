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
public class KeyPress extends KeyboardEvent {
static final long serialVersionUID = 1L;

public KeyPress(int type){
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_press.png"));
    }
}
