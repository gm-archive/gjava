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
import org.gcreator.actions.*;
import javax.swing.*;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class NextScene extends ActionPattern{
    
    private static ImageIcon icon = new ImageIcon(NextScene.class.getResource("/org/gcreator/actions/images/Next_Scene.png"));
    public NextScene(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return Dictionary.getEntry("actions-nextscene-text");
    }
    @Override
    public void setStandardImage(ImageIcon icon){
        NextScene.icon = icon;
    }
     
    @Override
    public String generateGCL(JComponent panel){
        return "room_goto_next();\n";
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
