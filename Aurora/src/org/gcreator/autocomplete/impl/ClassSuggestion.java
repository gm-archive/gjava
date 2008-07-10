/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
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
public class ClassSuggestion extends Suggestion{
    private String text = "";
    private static ImageIcon img = new ImageIcon(ClassSuggestion.class.getResource("/org/gcreator/resources/i_class.png"));
    
    public ClassSuggestion(){}
    
    public ClassSuggestion(String text){
        this.text = text;
    }
    
    public Color getForeground(){
        return new Color(0, 150, 0);
    }
    
    public ImageIcon getImage(){
        return img;
    }
    
    public String getText(){
        return text;
    }
    
    public String confirm(String context, String prevWord){
        try{
            return (text + (prevWord.equals("new") ? "(" : ""))
                    .substring(context.substring(context.lastIndexOf('.')+1).length());
        }
        catch(Exception e){
            return "";
        }
    }
}
