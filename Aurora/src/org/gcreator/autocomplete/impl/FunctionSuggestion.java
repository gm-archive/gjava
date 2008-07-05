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
    public String name = "";
    public String args = "";
    //private String[] args;
    private static ImageIcon img = new ImageIcon(ClassSuggestion.class.getResource("/org/gcreator/resources/i_function.png"));
    public FunctionSuggestion(){}
    
    public FunctionSuggestion(String name, String args){
        this.name = name;
        //this.args = args.split("\\s*,\\s*");
        this.args = args;
    }
    
    public Color getForeground(){
        return Color.DARK_GRAY;
    }
    
    public ImageIcon getImage(){
        return img;
    }
    
    public String getText(){
        //String a = "";
        /*for(int i = 0; i < args.length; i++){
            if(i!=0)
                a += ", ";
            a += args[i];
        }*/
        //return name + "(" + a + ")";
        return name + "(" + args + ")";
    }
    
    public String confirm(String context, String prevWord){
        try{
            return name.substring(context.substring(context.lastIndexOf('.')+1).length()) + "(";
        }
        catch(Exception e){
            return "";
        }
    }
}
