/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.gcreator.components.impl.EventSelectListener;


class KeyboardActionListener implements ActionListener{
    KeyboardListPopup popmenu;
    int num;
    public KeyboardActionListener(KeyboardListPopup popmenu, int num){
        this.popmenu = popmenu;
        this.num = num;
    }
    
    public void actionPerformed(ActionEvent evt){
        popmenu.cause(num);
    }
}


public class KeyboardListPopup extends JPopupMenu{
    JMenuItem[] items;
    EventSelect selector;
    public KeyboardListPopup(EventSelect selector){
        
        JMenu letters = new JMenu("Letters");
        JMenu fkeys = new JMenu("Function keys");
        JMenu digits = new JMenu("Digits");
        JMenu others = new JMenu("Others");
        JMenu keypad = new JMenu("Keypad");
        
        add(letters);
        add(fkeys);
        add(digits);
        add(keypad);
        add(others);
        
        add(letters,new JMenuItem("A"),65);
        
        this.selector = selector;
        this.updateUI();
    }
    public void add(JMenu j,JMenuItem m, int i){
        j.add(m);
        m.addActionListener(new KeyboardActionListener(this, i));
    }
    
    public void cause(int num){
        selector.callEvent(EventSelectListener.Keyboard+num);
        selector.dispose();
        selector = null; //Perhaps this will help with garbage collection?
    }
}

