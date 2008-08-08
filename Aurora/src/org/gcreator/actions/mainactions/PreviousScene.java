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
public class PreviousScene extends ActionPattern{
    
    private static ImageIcon icon = new ImageIcon(PreviousScene.class.getResource("/org/gcreator/actions/images/Previous_Scene.png"));
    public PreviousScene(){
        super();
    }
     
    @Override
    public String getStandardText(JComponent panel){
        return Dictionary.getEntry("actions-previousscene-text");
    }
    
    @Override
    public void setStandardImage(ImageIcon icon){
        PreviousScene.icon = icon;
    }
     
    @Override
    public String generateGCL(JComponent panel){
        return "scene_goto_previous();\n";
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
