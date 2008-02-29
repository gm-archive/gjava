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
public class FunctionSuggestion extends Suggestion{
    private String text = "";
    private static ImageIcon img = new ImageIcon(ClassSuggestion.class.getResource("/org/gcreator/resources/i_function.png"));
    public FunctionSuggestion(){}
    
    public FunctionSuggestion(String text){
        this.text = text;
    }
    
    public Color getForeground(){
        return Color.DARK_GRAY;
    }
    
    public ImageIcon getImage(){
        return img;
    }
    
    public String getText(){
        return text;
    }
    
    public String confirm(String context, String prevWord){
        try{
            return text.substring(context.substring(context.lastIndexOf('.')+1).length()) + "(";
        }
        catch(Exception e){
            return "";
        }
    }
}
