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
    public Vector patterns = new Vector();
    public String name = "";
    public ImageIcon icon = null;
    public Color selectedForeground = Color.WHITE;
    public Color foreground = Color.BLACK;
    public Color selectedBackground = Color.BLUE;
    public Color background = Color.WHITE;
    
    public void add(ActionPattern pattern){
        patterns.add(pattern);
    }
}
