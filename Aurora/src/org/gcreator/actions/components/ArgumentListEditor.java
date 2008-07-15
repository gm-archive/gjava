/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
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
    JPanel p = new JPanel();
    @Override
    public String getAsText(){
        Object o = getValue();
        if(o==null)
            return "";
        return ((ArgumentList) o).toString();
    }
    
    @Override
    public Component getCustomEditor(){
        p.setLayout(new BorderLayout());
        ArgumentListLabel l;
        p.add(BorderLayout.CENTER, l = new ArgumentListLabel(this));
        p.add(BorderLayout.EAST, new ArgumentListButton(this, l));
        
        return p;
    }
    
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
}
