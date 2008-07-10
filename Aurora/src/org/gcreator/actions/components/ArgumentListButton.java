/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
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
    ArgumentList a;
    ArgumentListLabel l;
    ArgumentListButton(ArgumentList a, ArgumentListLabel l){
        super("...");
        this.a = a;
        this.l = l;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        Container c = this.getParent();
        while(!(c instanceof JFrame))
            c = c.getParent();
        ArgumentListDialog d = new ArgumentListDialog((JFrame) c, true, a, l);
        d.setVisible(true);
    }
}
