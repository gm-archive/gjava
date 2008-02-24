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
public class ClassSuggestion implements Suggestion{
    private String text = "";
    private String context = "";
    
    public ClassSuggestion(){}
    
    public ClassSuggestion(String text){
        this.text = text;
    }
    
    public ClassSuggestion(String context, String text){
        this.context = context;
        this.text = text;
    }
    
    public Color getForeground(){
        return new Color(0, 150, 0);
    }
    
    public ImageIcon getImage(){
        return null;
    }
    
    public String getText(){
        return text;
    }
    
    public String confirm(String context){
        return (this.context + text).substring(context.length());
    }
}
