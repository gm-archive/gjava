/*
 * ConsolePopupMenu.java
 * 
 * Created on 12/Set/2007, 21:59:43
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import org.gcreator.components.impl.EventSelectListener;
import javax.swing.*;
import java.awt.event.*;


import org.gcreator.core.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
class AlarmActionListener implements ActionListener{
    AlarmListPopup popmenu;
    int num;
    public AlarmActionListener(AlarmListPopup popmenu, int num){
        this.popmenu = popmenu;
        this.num = num;
    }
    
    public void actionPerformed(ActionEvent evt){
        popmenu.cause(num);
    }
}

public class AlarmListPopup extends JPopupMenu{
    JMenuItem[] items;
    EventSelect selector;
    public AlarmListPopup(EventSelect selector){
        items = new JMenuItem[12];
        for(int i = 0; i < 12; i++){
            items[i] = new JMenuItem("Alarm " + i);
            add(items[i]);
            items[i].addActionListener(new AlarmActionListener(this, i));
        }
        this.selector = selector;
        this.updateUI();
    }
    public void cause(int num){
        selector.callEvent(EventSelectListener.ALARM+num);
        selector.dispose();
        selector = null; //Perhaps this will help with garbage collection?
    }
}
