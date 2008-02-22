/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 * 
 * An ActionPattern owns NO VALUES.
 */

package org.gcreator.actions;

import org.gcreator.editors.ActorEditor;
import org.gcreator.editors.*;
import javax.swing.*;
import java.awt.*;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Luís
 */
public abstract class ActionPattern implements Serializable {
    static final long serialVersionUID = 1L;
   
    private static final ObjectStreamField[] serialPersistentFields
                 = {};
    
    public ActionPattern(){
        //icon = new ImageIcon();
      //  icon  = new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png"));
   
        //setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png")));
    }
    
    public JComponent createNewPanel(Action action){
        return new JPanel();
    }
    
    public abstract void setStandardImage(ImageIcon icon);
    
    public abstract ImageIcon getStandardImage();
    
    public String getStandardText(JComponent panel){
        return "";
    }
    
    public abstract String generateGCL(JComponent panel);
    
    public Color getBackground(JList list){
        return Color.WHITE;
    }
    
    public Color getSelectedBackground(JList list){
        try{
            return list.getSelectionBackground();
        }
        catch(Exception e){
            return Color.BLUE;
        }
    }
    
    public Color getForeground(JList list){
        return Color.BLACK;
    }
    
    public Color getSelectedForeground(JList list){
        try{
            return list.getSelectionForeground();
        }
        catch(Exception e){
            return Color.WHITE;
        }
    }
    
    public String writeXml(JComponent panel){
        return "";
    }
    
    public void setLayout(Object o)
    {
        
    }
    
    public Action clone(JComponent panel){
        return null;
    }
    
    public boolean indents(JComponent panel, Vector<Action> indented, Vector<Action> unindented,JList list, boolean selected){
        return false;
    }
    
    public boolean unindents(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return false;
    }
    
    public boolean indentsNext(JComponent panel, Vector<Action> indented, Vector<Action> unindented,JList list, boolean selected){
        return false;
    }
    
    public boolean unindentsNext(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return false;
    }
}
