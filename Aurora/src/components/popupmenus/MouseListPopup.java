/*
 * ConsolePopupMenu.java
 * 
 * Created on 12/Set/2007, 21:59:43
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import components.impl.EventSelectListener;
import javax.swing.*;
import java.awt.event.*;


import core.*;
import managers.*;

/**
 *
 * @author Luís
 */
public class MouseListPopup extends JPopupMenu{
    JMenuItem[] items;
    EventSelect selector;
    public MouseListPopup(EventSelect selector){
        items = new JMenuItem[14];
        items[0] = new JMenuItem("Left Button Clicked");
        items[1] = new JMenuItem("Right Button Clicked");
        items[2] = new JMenuItem("Left Button Pressed");
        items[3] = new JMenuItem("Right Button Pressed");
        items[4] = new JMenuItem("Left Button Released");
        items[5] = new JMenuItem("Right Button Released");
        items[6] = new JMenuItem("Mouse Entered (Over)");
        items[7] = new JMenuItem("Mouse Exited (Out)");
        items[8] = new JMenuItem("Global Left Button Clicked");
        items[9] = new JMenuItem("Global Right Button Clicked");
        items[10] = new JMenuItem("Global Left Button Pressed");
        items[11] = new JMenuItem("Global Right Button Pressed");
        items[12] = new JMenuItem("Global Left Button Released");
        items[13] = new JMenuItem("Global Right Button Released");
        add(items[0]);
        add(items[1]);
        addSeparator();
        add(items[2]);
        add(items[3]);
        addSeparator();
        add(items[4]);
        add(items[5]);
        addSeparator();
        add(items[6]);
        add(items[7]);
        addSeparator();
        add(items[8]);
        add(items[9]);
        add(items[10]);
        add(items[11]);
        add(items[12]);
        add(items[13]);
        this.updateUI();
    }
    
    private void beginstep(){
        selector.callEvent(EventSelectListener.BEGINSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void stdstep(){
        selector.callEvent(EventSelectListener.STEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void endstep(){
        selector.callEvent(EventSelectListener.ENDSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
}
