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
public class EndOfABlock extends ActionPattern{
    
     private static ImageIcon icon = new ImageIcon(EndOfABlock.class.getResource("/org/gcreator/actions/images/End_Block.png"));
     
    public EndOfABlock(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return Dictionary.getEntry("actions-endblock-text");
    }
    
     
    @Override
    public String generateGCL(JComponent panel){
        return "}\n";
    }

    @Override
    public void setStandardImage(ImageIcon icon){
        EndOfABlock.icon = icon;
    }
    
    @Override
    public ImageIcon getStandardImage() {
        return icon;
    }
    
    @Override
    public boolean unindentsNext(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return true;
     }
}
