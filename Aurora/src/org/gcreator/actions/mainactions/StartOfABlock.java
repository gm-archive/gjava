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
import org.gcreator.editors.ActorEditor;
import org.gcreator.actions.*;
import org.gcreator.editors.*;
import javax.swing.*;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class StartOfABlock extends ActionPattern{
    
    private static ImageIcon icon = new ImageIcon(StartOfABlock.class.getResource("/org/gcreator/actions/images/Start_Block.png"));
    public StartOfABlock(){
        super();
    }
    
     
    public String getStandardText(JComponent panel){
        return LangSupporter.activeLang.getEntry(219);
    }
    public void setStandardImage(ImageIcon icon){
        StartOfABlock.icon = icon;
    }
     
    public String generateGCL(JComponent panel){
        return "{";
    }
     public ImageIcon getStandardImage() {
        return icon;
    }
     
     public boolean indents(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return true;
     }
}
