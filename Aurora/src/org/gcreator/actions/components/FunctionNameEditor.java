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
import javax.swing.Box;
import javax.swing.JPanel;
import org.gcreator.fileclass.Project;

/**
 *
 * @author Serge Humphrey
 */
public class FunctionNameEditor extends PropertyEditorSupport {

    protected Project project;

    public FunctionNameEditor(Project p) {
        this.project = p;
    }

    @Override
    public String getAsText() {
        Object o = getValue();
        if (o == null) {
            return "null";
        }
        return o.toString();
    }

    @Override
    public Component getCustomEditor() {
        JPanel p = new JPanel(new BorderLayout());
        FunctionNameTextField t = new FunctionNameTextField(this);
        Box box = Box.createHorizontalBox();
        box.add(t);
        box.add(Box.createHorizontalStrut(2));
        p.add(box);
        p.add(new FunctionNameButton(this, t, project), BorderLayout.EAST);
        return p;
    }

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
}
