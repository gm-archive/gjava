/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.mainactions;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import org.gcreator.actions.ActionPattern;
import org.gcreator.units.Dictionary;

/**
 *
 * @author luis
 */
public class Exit extends ActionPattern{
    private static ImageIcon icon = new ImageIcon(Exit.class.getResource("/org/gcreator/actions/images/exit.png"));
    public Exit(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return Dictionary.getEntry("actions-exit-text");
    }
    
    @Override
    public void setStandardImage(ImageIcon icon){
        Exit.icon = icon;
    }
     
    @Override
    public String generateGCL(JComponent panel){
        return "return;";
    }
    
    @Override
    public ImageIcon getStandardImage() {
        return icon;
    }
     
    @Override
    public boolean indents(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
        return false;
    }
}
