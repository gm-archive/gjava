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
import org.gcreator.autocomplete.impl.*;
import org.gcreator.components.*;
import org.gcreator.components.impl.VectorListModel;
import org.gcreator.fileclass.Project;
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
    JScrollPane scroll;
    boolean requestDie = false;
    //How to declare an actor?
    Vector<String> actorTypes = new Vector<String>();
    Vector<Suggestion> v = new Vector<Suggestion>();
    
    public GCLAutocomplete(final int selstart, final int selend, final SyntaxHighlighter editor, Project p){
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
        addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent evt){
                if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                    if(!list.isSelectionEmpty()){
                        int sh = list.getCellRenderer().getListCellRendererComponent(
                                list, list.getSelectedValue(), list.getSelectedIndex(), false, false).getPreferredSize().height;
                        JScrollBar bar = scroll.getVerticalScrollBar();
                        bar.setValue(bar.getValue()+sh);
                    }
                    list.setSelectedIndex(list.getSelectedIndex()+1);
                }
                else if(evt.getKeyCode()==KeyEvent.VK_UP){
                    if(!list.isSelectionEmpty()){
                        int sh = list.getCellRenderer().getListCellRendererComponent(
                                list, list.getSelectedValue(), list.getSelectedIndex(), false, false).getPreferredSize().height;
                        JScrollBar bar = scroll.getVerticalScrollBar();
                        bar.setValue(bar.getValue()-sh);
                    }
                    list.setSelectedIndex(list.getSelectedIndex()-1);
                }
                else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
                    editor.setSelectionStart(selstart-1);
                    editor.setSelectionEnd(selstart-1);
                    dispose();
                }
                else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
                    editor.setSelectionStart(selend+1);
                    editor.setSelectionEnd(selend+1);
                    dispose();
                }
                else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    confirm();
                }
                else if(evt.getKeyChar()!=65535
                        &&evt.getKeyChar()!=8){
                    System.out.println((int) evt.getKeyChar());
                    editor.insert(selstart, selend, "" + evt.getKeyChar());
                    editor.setSelectionStart(selstart+1);
                    editor.setSelectionEnd(selstart+1);
                    dispose();
                    editor.callAutocomplete();
                }
                else if(evt.getKeyChar()==8){
                    if(selstart==selend){
                        editor.insert(selstart-1, selstart, "");
                    }
                    else{
                        editor.insert(selstart, selend, "");
                    }
                    dispose();
                        editor.callAutocomplete();
                        editor.setSelectionEnd(selstart);
                }
            }
            public void keyReleased(KeyEvent evt){}
            public void keyTyped(KeyEvent evt){}
        });
        useContext();
    }
    
    @Override
    public boolean requestDie(){
        return requestDie;
    }
    
    private void confirm(){
        if(list.isSelectionEmpty()){
            editor.insert(selstart, selend, "\n");
        }
        else{
            String t = ((Suggestion) list.getSelectedValue()).confirm(context);
            editor.insert(selstart, selend, t);
            editor.setSelectionStart(selstart+t.length());
            editor.setSelectionEnd(selstart+t.length());
        }
        dispose();
    }
    
    private void applyClass(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new ClassSuggestion(val));
        }
    }
    
    private void applyClassVector(Vector<String> vals){
        for(String s : vals)
            applyClass(s);
    }
    
    private void applyKeyword(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new KeywordSuggestion(val));
        }
    }
    
    private void useContext(){
        scroll = new JScrollPane();
        scroll.setFocusable(false);
        scroll.setVisible(true);
        list = new JList();
        list.setFocusable(false);
        list.setVisible(true);
        scroll.setViewportView(list);
        add(BorderLayout.CENTER, scroll);
        if(context==null){
            dispose();
            return;
        }
        
        actorTypes.add("Actor");
        
        
        applyClassVector(actorTypes);
        
        applyKeyword("char");
        
        applyClass("Clipboard");
        
        applyClass("Common");
        
        if(context.matches("^Common\\.(S(c(e(n(e)?)?)?)?)?$"))
            v.add(new ClassSuggestion("Scene"));
        
        applyKeyword("do");
        
        applyKeyword("else");
        
        applyKeyword("for");
        
        applyKeyword("getter");
        
        if(context.matches("^Clipboard\\.(g(e(t(T(e(x(t)?)?)?)?)?)?)?$"))
            v.add(new FunctionSuggestion("getText"));
        
        applyKeyword("if");
        
        if(context.matches("^(i(n(t)?)?)?$"))
            v.add(new KeywordSuggestion("int"));
        
        if(context.matches("^(f(a(l(s(e)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("false"));
        
        if(context.matches("^(f(l(o(a(t)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("float"));
        
        if(context.matches("^Clipboard\\.(s(e(t(T(e(x(t)?)?)?)?)?)?)?$"))
            v.add(new FunctionSuggestion("hasText"));
        
        if(context.matches("^(n(a(t(i(v(e)?)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("native"));
        
        if(context.matches("^(n(e(w)?)?)?$"))
            v.add(new KeywordSuggestion("new"));
        
        if(context.matches("^(n(u(l(l)?)?)?)?$"))
            v.add(new KeywordSuggestion("null"));
        
        if(context.matches("^(p(r(i(v(a(t(e)?)?)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("private"));
        
        if(context.matches("^(p(r(o(t(e(c(t(e(d)?)?)?)?)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("protected"));
        
        if(context.matches("^(p(u(b(l(i(c)?)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("public"));
        
        if(context.matches("^Clipboard\\.(s(e(t(T(e(x(t)?)?)?)?)?)?)?$"))
            v.add(new FunctionSuggestion("setText"));
        
        if(context.matches("^(s(t(a(t(i(c)?)?)?)?)?)?$"))
            v.add(new KeywordSuggestion("static"));
        
        if(context.matches("^(t(h(i(s)?)?)?)?$"))
            v.add(new KeywordSuggestion("this"));
        
        if(context.matches("^(t(r(u(e)?)?)?)?$"))
            v.add(new KeywordSuggestion("true"));
        
        if(context.matches("^Common\\.Scene\\.(g(o(t(o(N(e(x(t)?)?)?)?)?)?)?)?$"))
            v.add(new FunctionSuggestion("gotoNext"));
        
        if(context.matches("^Common\\.Scene\\.(g(o(t(o(P(r(e(v(i(o(u(s)?)?)?)?)?)?)?)?)?)?)?)?$"))
            v.add(new FunctionSuggestion("gotoNext"));
        
        if(context.matches("^(v(o(i(d)?)?)?)?$"))
            v.add(new KeywordSuggestion("void"));
        
        applyKeyword("while");
        
        list.setModel(new VectorListModel(v));
        list.setCellRenderer(new SuggestionCellRenderer());
        
        if(v.size()==1){
            list.setSelectedIndex(0);
            String t = ((Suggestion) list.getSelectedValue()).confirm(context);
            editor.insert(selstart, selend, t);
            editor.setSelectionStart(selstart+t.length());
            editor.setSelectionEnd(selstart+t.length());
            dispose();
            requestDie = true;
        }
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
                            ||x.charAt(i)=='\n'
                            ||x.charAt(i)=='+'
                            ||x.charAt(i)=='-'
                            ||x.charAt(i)=='*'
                            ||x.charAt(i)=='/'
                            ||x.charAt(i)=='%'
                            ||x.charAt(i)=='&'
                            ||x.charAt(i)=='|'
                            ||x.charAt(i)=='('
                            ||x.charAt(i)==')'
                            ||x.charAt(i)=='{'
                            ||x.charAt(i)=='}'
                            ||x.charAt(i)=='!'
                            ||x.charAt(i)=='^'
                            ||x.charAt(i)==','
                            ||x.charAt(i)==';'
                            ||x.charAt(i)=='<'
                            ||x.charAt(i)=='>'
                            ||x.charAt(i)=='='
                            ||x.charAt(i)=='?'
                            ||x.charAt(i)==':'){
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
