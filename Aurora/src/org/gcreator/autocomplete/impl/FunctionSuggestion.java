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

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * @author Luís Reis
 */
public class FunctionSuggestion extends Suggestion {

    public String name = "";
    public String args = "";
    private static ImageIcon img = new ImageIcon(
    ClassSuggestion.class.getResource("/org/gcreator/resources/i_function.png"));

    public FunctionSuggestion() {
    }

    public FunctionSuggestion(String name, String args) {
        this.name = name;
        this.args = args;
    }

    @Override
    public Color getForeground() {
        return Color.DARK_GRAY;
    }

    @Override
    public ImageIcon getImage() {
        return img;
    }

    @Override
    public String getText() {
        return name + "(" + args + ")";
    }

    @Override
    public String confirm(String context, String prevWord) {
        try {
            return name.substring(context.substring(context.lastIndexOf('.') + 1).length()) + "(";
        } catch (Exception e) {
            return "";
        }
    }
    
    @Override
    public String toString() {
        return this.name;
    }
        
}
