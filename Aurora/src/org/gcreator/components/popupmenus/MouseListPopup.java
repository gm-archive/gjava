/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
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
class MouseActionListener implements ActionListener{
    MouseListPopup popmenu;
    int num;
    public MouseActionListener(MouseListPopup popmenu, int num){
        this.popmenu = popmenu;
        this.num = num;
    }
    
    public void actionPerformed(ActionEvent evt){
        popmenu.cause(num);
    }
}

public class MouseListPopup extends JPopupMenu{
    JMenuItem[] items;
    EventSelect selector;
    public MouseListPopup(EventSelect selector){
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
        items[12] = new JMenuItem("Mouse Entered (Over)");
        items[13] = new JMenuItem("Mouse Exited (Out)");
        add(items[0]);
        items[0].addActionListener(new MouseActionListener(this, 0));
        add(items[1]);
        items[1].addActionListener(new MouseActionListener(this, 1));
        add(items[2]);
        items[2].addActionListener(new MouseActionListener(this, 2));
        addSeparator();
        add(items[3]);
        items[3].addActionListener(new MouseActionListener(this, 3));
        add(items[4]);
        items[4].addActionListener(new MouseActionListener(this, 4));
        add(items[5]);
        items[5].addActionListener(new MouseActionListener(this, 5));
        addSeparator();
        add(items[6]);
        items[6].addActionListener(new MouseActionListener(this, 6));
        add(items[7]);
        items[7].addActionListener(new MouseActionListener(this, 7));
        add(items[8]);
        items[8].addActionListener(new MouseActionListener(this, 8));
        addSeparator();
        add(items[9]);
        items[9].addActionListener(new MouseActionListener(this, 9));
        add(items[10]);
        items[10].addActionListener(new MouseActionListener(this, 10));
        add(items[11]);
        items[11].addActionListener(new MouseActionListener(this, 11));
        addSeparator();
        add(items[12]);
        items[12].addActionListener(new MouseActionListener(this, 12));
        add(items[13]);
        items[13].addActionListener(new MouseActionListener(this, 13));
        this.selector = selector;
        this.updateUI();
    }
    public void cause(int num){
        selector.callEvent(EventSelectListener.MOUSELEFTCLICKED+num);
        selector.dispose();
        selector = null; //Perhaps this will help with garbage collection?
    }
}
