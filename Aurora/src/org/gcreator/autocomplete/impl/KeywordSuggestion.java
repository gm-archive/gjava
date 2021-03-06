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
import java.awt.Font;
import javax.swing.ImageIcon;
import org.gcreator.managers.ScriptThemeManager;

/**
 * @author Luís Reis
 */
public class KeywordSuggestion extends Suggestion {

    protected String text = "";

    public KeywordSuggestion() {
    }

    public KeywordSuggestion(String text) {
        this.text = text;
    }

    @Override
    public Color getForeground() {
        return ScriptThemeManager.getColors().get("Keywords");
    }

    @Override
    public Font getFont() {
        return ScriptThemeManager.getFonts().get("Keywords");
    }

    @Override
    public ImageIcon getImage() {
        return null;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String confirm(String context, String prevWord) {
        return (text + " ").substring(context.length());
    }
}
