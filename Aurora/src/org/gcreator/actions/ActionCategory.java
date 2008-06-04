/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.actions;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís Reis
 */
public class ActionCategory {
    public Vector<ActionPattern> patterns = new Vector<ActionPattern>();
    public String name = "";
    public ImageIcon icon = null;
    public Color foreground = Color.BLACK;
    public Color background = Color.WHITE;
    
    public void add(ActionPattern pattern){
        patterns.add(pattern);
    }
    
    public Color getSelectedBackground(JList list){
        return list.getSelectionBackground();
    }
    
    public Color getSelectedForeground(JList list){
        return list.getSelectionForeground();
    }
}
