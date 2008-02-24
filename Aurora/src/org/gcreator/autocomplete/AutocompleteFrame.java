/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.autocomplete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Luís Reis
 */
public class AutocompleteFrame extends JFrame{
    public AutocompleteFrame(){
        super();
        setUndecorated(true);
        addFocusListener(new FocusListener(){
            public void focusLost(FocusEvent evt){
                dispose();
            }
            
            public void focusGained(FocusEvent evt){}
        });
        setSize(200, 100);
    }
    
    public boolean requestDie(){
        return false;
    }
}
