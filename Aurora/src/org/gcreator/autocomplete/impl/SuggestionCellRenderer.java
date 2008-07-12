/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete.impl;

import java.awt.*;
import javax.swing.*;

/**
 * @author Luís Reis
 */
public class SuggestionCellRenderer extends JLabel implements ListCellRenderer{
    public SuggestionCellRenderer(){
        setOpaque(true);
    }
    
    public JComponent getListCellRendererComponent(JList list, Object selection, int index, boolean selected, boolean hasFocus){
        if(selection instanceof Suggestion){
            Suggestion sel = (Suggestion) selection;
            setText(sel.getText());
            setForeground(sel.getForeground());
            setIcon(sel.getImage());
            setFont(sel.getFont());
        }
        else{
            setText(selection.toString());
            setForeground(Color.RED);
            setIcon(null);
            setFont(list.getFont());
        }
        if(selected)
            try{
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }
            catch(Exception e){
                setBackground(Color.BLUE);
                setForeground(Color.WHITE);
            }
        else
            setBackground(Color.WHITE);
        return this;
    }
}
