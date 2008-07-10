/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.uiplus;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class DiscMenuContainer extends DiscMenuItem{
    private Vector<DiscMenuItem> items;
    public DiscMenuContainer prevcontainer = null;
    public DiscMenuContainer(String label, ImageIcon image){
        super(label, image);
        items = new Vector<DiscMenuItem>();
    }
    
    public void add(DiscMenuItem item){
        items.add(item);
    }
    
    public int count(){
        items.trimToSize();
        return items.capacity();
    }
    
    public DiscMenuItem elementAt(int i){
        return items.elementAt(i);
    }
    
    protected void actionPerformed(ActionEvent evt, boolean back){
        super.actionPerformed(evt, back);
        
        Object o = evt.getSource();
        if(o instanceof DiscMenu){
            if(!back)
                prevcontainer = ((DiscMenu) o).curcontainer;
            ((DiscMenu) o).curcontainer = this;
            ((DiscMenu) o).repaint();
        }
    }
}
