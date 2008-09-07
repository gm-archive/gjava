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

import java.awt.Color;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import org.gcreator.editors.ActorEditor;
import org.gcreator.editors.TimelineEditor;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Resource;

/**
 * Actions represent the GCL equivalent in the Actor Editor.
 * Actions themselves contain little information. They are just storages.
 * All the "content" is stored by ActionPattern.
 * @author Luís Reis
 */
public class Action implements Serializable {

    static final long serialVersionUID = 1L;
    /**
     * The ActionPattern of this action
     */
    public ActionPattern pattern;
    private JComponent panel;
    public Project project;
    public Resource resource;
    
    private static final ObjectStreamField[] serialPersistentFields
                 = {new ObjectStreamField("pattern", ActionPattern.class)}; 
    /**
     * Creates a new action with a given pattern
     * 
     * @param pattern The Action pattern
     * @param r The Resource
     */
    public Action(ActionPattern pattern, Resource r) {
        this.pattern = pattern;
        this.resource = r;
        if (pattern != null) {
            panel = pattern.createNewPanel(this, null, null);
        }
    }

    /**
     * Creates a new action with a given pattern and a given actor editor
     * 
     * @param editor The Actor editor
     * @param pattern The action pattern
     */
    public Action(ActorEditor editor, ActionPattern pattern) {
        this.pattern = pattern;
        this.project = editor.project;
        this.resource = editor.actor;
        if (pattern != null) {
            panel = pattern.createNewPanel(this, project, null);
        }
    }
    
    /**
     * Creates a new action with a given pattern and a given timeline editor
     * 
     * @param editor The Timeline editor
     * @param pattern The action pattern
     */
    public Action(TimelineEditor editor, ActionPattern pattern) {
        this.pattern = pattern;
        this.project = editor.project;
        this.resource = (Resource) editor.file.value;
        if (pattern != null) {
            panel = pattern.createNewPanel(this, project, resource);
        }
    }

    /**
     * Gets the action image
     * @return The image
     */
    public ImageIcon getImage() {
        return pattern.getStandardImage();
    }

    /**
     * Gets the action label
     * @return The label
     */
    public String getLabel() {
        return pattern.getStandardText(getPanel());
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JComponent getPanel() {
        if (panel == null) {
            panel = pattern.createNewPanel(this, project, resource);
            pattern.load(panel);
        }
        return panel;
    }

    public String getGCL() {
        return pattern.generateGCL(getPanel());
    }

    public Color getBackground(JList list) {
        return pattern.getBackground(list);
    }

    public Color getForeground(JList list) {
        return pattern.getForeground(list);
    }

    public Color getSelectedBackground(JList list) {
        return pattern.getSelectedBackground(list);
    }

    public Color getSelectedForeground(JList list) {
        return pattern.getSelectedForeground(list);
    }

    public String writeXml() {
        String xml = "<action>\n";
        xml += "<type>";
        xml += pattern.getClass().getName();
        xml += "</type>";
        xml += pattern.writeXml(panel);
        xml += "</action>\n";
        return xml;
    }

    @Override
    public Action clone() {
        Action a = new Action(pattern, resource);
        return a;
    }

    public boolean indents(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return pattern.indents(panel, indented, unindented, list, selected);
    }

    public boolean unindents(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return pattern.unindents(panel, indented, unindented, list, selected);
    }

    public boolean indentsNext(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return pattern.indentsNext(panel, indented, unindented, list, selected);
    }

    public boolean unindentsNext(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected) {
        return pattern.unindentsNext(panel, indented, unindented, list, selected);
    }
}
