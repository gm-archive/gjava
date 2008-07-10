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
public abstract class Suggestion implements Comparable<Suggestion>{
    public abstract String getText();
    public abstract ImageIcon getImage();
    public abstract Color getForeground();
    public Font getFont(){
        return new Font(Font.MONOSPACED, Font.PLAIN, 12);
    }
    public abstract String confirm(String context, String prevWord);
    public String toString(){
        return getText();
    }
    public int compareTo(Suggestion s){
        return getText().compareTo(s.getText());
    }
    public int retreat(){
        return 0;
    }
}
