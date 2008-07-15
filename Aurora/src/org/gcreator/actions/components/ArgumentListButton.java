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

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Luís
 */
/*internal*/ class ArgumentListButton extends JButton implements ActionListener{
    ArgumentListEditor e;
    ArgumentListLabel l;
    ArgumentListButton(ArgumentListEditor e, ArgumentListLabel l){
        super("...");
        this.e = e;
        this.l = l;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        Container c = this.getParent();
        while(!(c instanceof JFrame))
            c = c.getParent();
        ArgumentListDialog d = new ArgumentListDialog((JFrame) c, true, e, l);
        d.setVisible(true);
    }
}
