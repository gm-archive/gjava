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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.*;
import org.gcreator.components.*;
import org.gcreator.components.impl.VectorListModel;
import publicdomain.*;

/**
 * @author Luís Reis
 */
public class GCLAutocomplete extends AutocompleteFrame{
    int selstart;
    int selend;
    SyntaxHighlighter editor;
    String context;
    JList list;
    
    public GCLAutocomplete(final int selstart, final int selend, final SyntaxHighlighter editor){
        super();
        this.selstart = selstart;
        this.selend = selend;
        this.editor = editor;
        setLayout(new BorderLayout());
        JLabel label = new JLabel("GCL Autocomplete...");
        label.setFocusable(false);
        label.setVisible(true);
        add(BorderLayout.NORTH, label);
        context = getContext();
        setTitle("GCL Autocomplete...");
        useContext(context);
        addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent evt){
                if(evt.getKeyCode()==KeyEvent.VK_DOWN)
                    list.setSelectedIndex(list.getSelectedIndex()+1);
                if(evt.getKeyCode()==KeyEvent.VK_UP)
                    list.setSelectedIndex(list.getSelectedIndex()-1);
                if(evt.getKeyCode()==KeyEvent.VK_LEFT){
                    editor.setSelectionStart(selstart-1);
                    editor.setSelectionEnd(selstart-1);
                    dispose();
                }
                if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
                    editor.setSelectionStart(selend+1);
                    editor.setSelectionEnd(selend+1);
                    dispose();
                }
            }
            public void keyReleased(KeyEvent evt){}
            public void keyTyped(KeyEvent evt){
            }
        });
    }
    
    private void useContext(String context){
        list = new JList();
        list.setFocusable(false);
        list.setVisible(true);
        add(BorderLayout.CENTER, list);
        if(context==null){
            dispose();
            return;
        }
        Vector v = new Vector();
        if(context.matches("^(v(o(i(d)?)?)?)?$"))
            v.add("void");
        if(context.matches("^(p(u(b(l(i(c)?)?)?)?)?)?$"))
            v.add("public");
        if(context.matches("^(p(r(o(t(e(c(t(e(d)?)?)?)?)?)?)?)?)?$"))
            v.add("protected");
        list.setModel(new VectorListModel(v));
    }
    
    private String getContext(){
        final int NULL = 0;
        final int SCOMMENT = 1;
        final int MCOMMENT = 2;
        final int STRING = 3;
        final int BSTRING = 4;
        final int CHAR = 5;
        final int BCHAR = 6;
        int situation = NULL;
        String word = "";
        String x = editor.getText();
        int selection = selend;
        if(selection<0||selection>x.length())
            return null;
        for(int i = 0; i < selection; i++){
            try{
                if(situation==NULL){
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='/'){
                        word = "";
                        situation = SCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='*'){
                        word = "";
                        situation = MCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        word = "";
                        situation = STRING;
                        continue;
                    }
                    if(x.charAt(i)=='\''){
                        word = "";
                        situation = CHAR;
                        continue;
                    }
                    if(x.charAt(i)==' '||x.charAt(i)=='\t'
                            ||x.charAt(i)=='\n'){
                        word = "";
                        continue;
                    }
                    word += x.charAt(i);
                    continue;
                }
                if(situation==SCOMMENT){
                    if(x.charAt(i)=='\n'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==MCOMMENT){
                    if(x.charAt(i)=='*'&&x.charAt(i+1)=='/'){
                        situation = NULL;
                        
            continue;
                    }
                }
                if(situation==STRING){
                    if(x.charAt(i)=='\\'){
                        situation = BSTRING;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==BSTRING){
                    situation = STRING;
                    continue;
                }
                if(situation==CHAR){
                    if(x.charAt(i)=='\\'){
                        situation = BCHAR;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==BCHAR){
                    situation = CHAR;
                    continue;
                }
            }
            catch(Exception e){
                break;
            }
        }
        if(situation==NULL){
            return word;
        }
        return null;
    }
    
}
