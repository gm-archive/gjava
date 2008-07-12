/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.popupmenus;

import org.gcreator.components.impl.EventSelectListener;
import javax.swing.*;
import java.awt.event.*;


import org.gcreator.core.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class StepListPopup extends JPopupMenu{
    JMenuItem begin, step, end;
    EventSelect selector;
    public StepListPopup(EventSelect selector){
        begin = new JMenuItem("Begin Step");
        step = new JMenuItem("Step");
        end = new JMenuItem("End Step");
        this.selector = selector;
        add(begin);
        begin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                beginstep();
            }
        });
        add(step);
        step.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                stdstep();
            }
        });
        add(end);
        end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                endstep();
            }
        });
        this.updateUI();
    }
    
    private void beginstep(){
        selector.callEvent(EventSelectListener.BEGINSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void stdstep(){
        selector.callEvent(EventSelectListener.STEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void endstep(){
        selector.callEvent(EventSelectListener.ENDSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
}
