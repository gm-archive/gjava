/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.actions.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.beans.PropertyEditorSupport;
import javax.swing.JPanel;

/**
 *
 * @author Luís
 */
public class ArgumentListEditor extends PropertyEditorSupport{
    @Override
    public String getAsText(){
        return ((ArgumentList) getValue()).toString();
    }
    
    @Override
    public Component getCustomEditor(){
        JPanel p = new JPanel();
        
        ArgumentList value = (ArgumentList) getValue();
        
        p.setLayout(new BorderLayout());
        ArgumentListLabel l;
        p.add(BorderLayout.CENTER, l = new ArgumentListLabel(value));
        p.add(BorderLayout.EAST, new ArgumentListButton(value, l));
        
        return p;
    }
    
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
}
