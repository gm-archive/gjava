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
        
        items = new JMenuItem[14];
        items[0] = new JMenuItem("Left Button Clicked");
        
        items[1] = new JMenuItem("Left Button Pressed");
        items[2] = new JMenuItem("Left Button Released");
        items[3] = new JMenuItem("Global Left Button Clicked");
        items[4] = new JMenuItem("Global Left Button Pressed");
        items[5] = new JMenuItem("Global Left Button Released");
        items[6] = new JMenuItem("Right Button Clicked");
        items[7] = new JMenuItem("Right Button Pressed");
        items[8] = new JMenuItem("Right Button Released");
        items[9] = new JMenuItem("Global Right Button Clicked");
        items[10] = new JMenuItem("Global Right Button Pressed");
        items[11] = new JMenuItem("Global Right Button Released");
        items[12] = new JMenuItem("Keyboard Entered (Over)");
        items[13] = new JMenuItem("Keyboard Exited (Out)");
        add(items[0]);
        items[0].addActionListener(new KeyboardActionListener(this, 0));
        add(items[1]);
        items[1].addActionListener(new KeyboardActionListener(this, 1));
        add(items[2]);
        items[2].addActionListener(new KeyboardActionListener(this, 2));
        addSeparator();
        add(items[3]);
        items[3].addActionListener(new KeyboardActionListener(this, 3));
        add(items[4]);
        items[4].addActionListener(new KeyboardActionListener(this, 4));
        add(items[5]);
        items[5].addActionListener(new KeyboardActionListener(this, 5));
        addSeparator();
        add(items[6]);
        items[6].addActionListener(new KeyboardActionListener(this, 6));
        add(items[7]);
        items[7].addActionListener(new KeyboardActionListener(this, 7));
        add(items[8]);
        items[8].addActionListener(new KeyboardActionListener(this, 8));
        addSeparator();
        add(items[9]);
        items[9].addActionListener(new KeyboardActionListener(this, 9));
        add(items[10]);
        items[10].addActionListener(new KeyboardActionListener(this, 10));
        add(items[11]);
        items[11].addActionListener(new KeyboardActionListener(this, 11));
        addSeparator();
        add(items[12]);
        items[12].addActionListener(new KeyboardActionListener(this, 12));
        add(items[13]);
        items[13].addActionListener(new KeyboardActionListener(this, 13));
        this.selector = selector;
        this.updateUI();
    }
    public void cause(int num){
        selector.callEvent(EventSelectListener.Keyboard+num);
        selector.dispose();
        selector = null; //Perhaps this will help with garbage collection?
    }
}

