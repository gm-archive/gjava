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
import org.gcreator.components.uiplus.DialogPlus;

/**
 * @author Luís Reis
 */
public class AutocompleteFrame extends DialogPlus{
    protected JList list;
    protected JScrollPane scroll;
    protected JEditorPane doc;
    public AutocompleteFrame(String text){
        super();
        setUndecorated(true);
        addFocusListener(new FocusListener(){
            public void focusLost(FocusEvent evt){
                dispose();
            }
            
            public void focusGained(FocusEvent evt){}
        });
        setSize(350, 180);
        setLayout(new BorderLayout());
        JLabel label = new JLabel(text);
        label.setFocusable(false);
        label.setVisible(true);
        add(BorderLayout.NORTH, label);
        setTitle(text);
        
        scroll = new JScrollPane();
        scroll.setFocusable(false);
        scroll.setVisible(true);
        list = new JList();
        list.setFocusable(false);
        list.setVisible(true);
        scroll.setViewportView(list);
        add(BorderLayout.CENTER, scroll);
        
        doc = new JEditorPane();
        doc.setFocusable(false);
        doc.setVisible(true);
        doc.setEditable(false);
        doc.setContentType("text/html");
        JScrollPane p = new JScrollPane(){
            public Dimension getPreferredSize(){
                Dimension d = super.getPreferredSize();
                d.width = 180;
                return d;
            }
        };
        p.setVisible(true);
        p.setViewportView(doc);
        add(BorderLayout.LINE_END, p);
    }
    
    public boolean requestDie(){
        return false;
    }
}
