/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
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
public class KeywordSuggestion extends Suggestion{
    protected String text = "";
    public KeywordSuggestion(){}
    
    public KeywordSuggestion(String text){
        this.text = text;
    }
    
    public Color getForeground(){
        return Color.BLUE;
    }
    
    public ImageIcon getImage(){
        return null;
    }
    
    public String getText(){
        return text;
    }
    
    public String confirm(String context, String prevWord){
        return (text + " ").substring(context.length());
    }
}
