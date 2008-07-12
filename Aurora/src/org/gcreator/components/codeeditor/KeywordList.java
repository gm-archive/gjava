/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components.codeeditor;

import java.awt.Color;
import java.awt.Font;
import org.gcreator.managers.ScriptThemeManager;

/**
 * A list of keywords of a programming lanugage.
 * @author Serge Humphrey
 */
public abstract class KeywordList {
    public abstract Keyword[] getKeywords();
    
    public Color getCommentColor() {
        return ScriptThemeManager.getColors().get("Comments");
    }
    
    public Color getStringColor() {
        return ScriptThemeManager.getColors().get("Strings");
    }
    public static class Keyword {
        private String name;
        private Color color;
        private boolean function = false;
        private int style = Font.PLAIN;
        
        public Keyword(String name, Color color) {
            this.name = name;
            this.color = color;
        }
        
        public Keyword(String name, Color color, boolean function) {
            this.name = name;
            this.color = color;
            this.function = function;
        }
        
        public Keyword(String name, Color color, int style) {
            this.name = name;
            this.color = color;
            this.style = style;
        }
        
        public Keyword(String name, Color color, int style, boolean function) {
            this.name = name;
            this.color = color;
            this.style = style;
            this.function = function;
        }
        
        public void setColor(Color c) {
            this.color = c;
        }
        
        public Color getColor() {
            return color;
        }
        
        public boolean isFunction() {
            return function;
        }
        
        public int getStyle() {
            return style;
        }
        
        public String getName() {
            return name;
        }
    }

    public Color getNumberColor() {
        return ScriptThemeManager.getColors().get("Constants");
    }
}