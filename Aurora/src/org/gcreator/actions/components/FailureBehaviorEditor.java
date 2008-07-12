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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyEditorSupport;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class FailureBehaviorEditor extends PropertyEditorSupport{
    JComboBox c = new JComboBox();
    
    @Override
    public String getAsText(){
        return ((FailureBehavior) getValue()).toString();
    }
    
    @Override
    public Component getCustomEditor(){
        c.setModel(new DefaultComboBoxModel(retrieveComboModel()));
        FailureBehavior f = (FailureBehavior) getValue();
        if(f!=null)
            c.setSelectedIndex(f.status);
        c.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                setValue(new FailureBehavior(c.getSelectedIndex()));
                firePropertyChange();
            }
        });
        return c;
    }
    
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
    
    public static String[] retrieveComboModel(){
        return new String[]{
            LangSupporter.activeLang.getEntry(237),
            LangSupporter.activeLang.getEntry(238),
            LangSupporter.activeLang.getEntry(239)
        };
    }
}
