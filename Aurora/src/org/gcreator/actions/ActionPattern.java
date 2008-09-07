/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions;

import com.l2fprod.common.propertysheet.DefaultProperty;
import java.awt.Color;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Resource;

/**
 *
 * @author Luís
 */
public abstract class ActionPattern implements Serializable, Cloneable {

    static final long serialVersionUID = 1L;
    private static final ObjectStreamField[] serialPersistentFields = {};

    public ActionPattern() {
    //icon = new ImageIcon();
    //  icon  = new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png"));

    //setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png")));
    }

    public JComponent createNewPanel(Action action, Project project, Resource r) {
        return new JPanel();
    }

    public abstract void setStandardImage(ImageIcon icon);

    public abstract ImageIcon getStandardImage();

    public String getStandardText(JComponent panel) {
        return "";
    }

    public abstract String generateGCL(JComponent panel);

    public Color getBackground(JList list) {
        return Color.WHITE;
    }

    public Color getSelectedBackground(JList list) {
        try {
            return list.getSelectionBackground();
        } catch (Exception e) {
            return Color.BLUE;
        }
    }

    public Color getForeground(JList list) {
        return Color.BLACK;
    }

    public Color getSelectedForeground(JList list) {
        try {
            return list.getSelectionForeground();
        } catch (Exception e) {
            return Color.WHITE;
        }
    }

    public String writeXml(JComponent panel) {
        return "";
    }

    public void setLayout(Object o) {


    }

    public DefaultProperty Relative() {
        DefaultProperty p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("relative");
        p.setDisplayName("Relative");
        p.setEditable(true);
        p.setType(Boolean.class);
        p.setValue(false);
        p.setShortDescription("Is the new value absolute or relative to the old one.");
        return p;
    }

//    public ActionPattern clone(){
//        
//        return null;
//    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public boolean indents(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return false;
    }

    public boolean unindents(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return false;
    }

    public boolean indentsNext(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return false;
    }

    public boolean unindentsNext(JComponent panel, Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return false;
    }

    public void save(JComponent panel) {

    }

    public void load(JComponent panel) {

    }
}
