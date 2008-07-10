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
public class DiscMenuItem {
    public ImageIcon image = null;
    public String label = null;
    private Vector<ActionListener> action = new Vector<ActionListener>();
    private boolean enabled = true;
    
    public DiscMenuItem(String label, ImageIcon image){
        this.image = image;
        this.label = label;
    }
    
    public void addActionListener(ActionListener act){
        action.add(act);
    }
    
    protected void actionPerformed(ActionEvent evt){
        actionPerformed(evt, false);
    }
    
    protected void actionPerformed(ActionEvent evt, boolean back){
        for(ActionListener l : action)
            l.actionPerformed(evt);
    }
    
    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }
    
    public boolean isEnabled(){
        return enabled;
    }
}
