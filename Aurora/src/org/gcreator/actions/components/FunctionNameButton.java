/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Project;

/**
 *
 * @author Serge Humphrey
 */
class FunctionNameButton extends JButton implements ActionListener {

    private static final long serialVersionUID = 1;
    FunctionNameEditor e;
    FunctionNameTextField l;
    Project p;
    
    FunctionNameButton(FunctionNameEditor e, FunctionNameTextField l, Project p) {
        super("...");
        this.e = e;
        this.l = l;
        this.p = p;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        SelectFunctionDialog d = new SelectFunctionDialog( 
                gcreator.window, "Select a Function", e, l, p);
        d.setVisible(true);
    }
}
