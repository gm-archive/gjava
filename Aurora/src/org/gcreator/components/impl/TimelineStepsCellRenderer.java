/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import org.gcreator.units.TimelineStep;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author luis
 */
public class TimelineStepsCellRenderer extends JLabel implements ListCellRenderer{
    public TimelineStepsCellRenderer(){
        setOpaque(true);
    }
    
    public Component getListCellRendererComponent
            (JList list, Object value, int index, boolean selected, boolean focus){
        if(value==null){
            setText("");
        }
        else if(value instanceof TimelineStep){
            TimelineStep step = (TimelineStep) value;
            setText("Step " + step.stepnum);
        }
        else{
            setText("Invalid resource");
        }
        if(selected){
           try{
                    setForeground(list.getSelectionForeground());
                    setBackground(list.getSelectionBackground());
                }
                catch(Exception e){
                    setForeground(Color.WHITE);
                    setBackground(Color.BLACK);
                }
        }
        else{
            setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }
        return this;
    }
}
