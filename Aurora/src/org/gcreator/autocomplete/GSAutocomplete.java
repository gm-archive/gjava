/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import org.gcreator.autocomplete.gscript.GSFunctions;
import org.gcreator.autocomplete.impl.*;
import org.gcreator.components.*;
import org.gcreator.components.codeeditor.ColorCodedTextArea;
import org.gcreator.components.impl.VectorListModel;
import org.gcreator.fileclass.Project;
import publicdomain.*;

/**
 * @author Luís Reis
 */
public class GSAutocomplete extends AutocompleteFrame{
    int selstart;
    int selend;
    ColorCodedTextArea editor;
    String prevWord;
    String context;
    boolean requestDie = false;
    Project p;
    //How to declare an actor?
    Vector<Suggestion> v = new Vector<Suggestion>();
    
    {
        list.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() > 1) {
                    confirm();
                }
            }
        });
    }
    
    //I put this here to avoid the evil 'final' declairations.
    private KeyListener listener = new KeyListener(){
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
                  //  System.out.println((int) evt.getKeyChar());
                    editor.insert(/*selstart*/editor.getCaretPosition(), editor.getCaretPosition() /*selend*/, "" + evt.getKeyChar());
                    //editor.setSelectionStart(selstart+1);
                    //editor.setSelectionEnd(selstart+1);
                 //   editor.setSelectionStart(editor.getCaretPosition()+1);
                 //   editor.setSelectionEnd(editor.getCaretPosition()+1);
                    editor.setCaretPosition(editor.getDocument().getLength());
                    //dispose();
                    editor.callAutocomplete();
                    //editor.setSelectionEnd(selstart);
                    //GSAutocomplete.this.selstart = editor.getSelectionStart();
                   // GSAutocomplete.this.selend = editor.getSelectionEnd();
                    GSAutocomplete.this.selstart = findSelectionStart(
                            Math.min(editor.getDocument().getLength(), editor.getCaretPosition()+1));
                    GSAutocomplete.this.selend = Math.min(editor.getDocument().getLength(), editor.getCaretPosition()+1);
                    context = getContext();
                    useContext();
                    list.repaint();
                    scroll.updateUI();
                }
                else if(evt.getKeyChar()==8){// backspace
                    fixSel();
                    if(selstart == selend){
                        editor.insert(Math.max(--selstart,0), selend--, "");
                    }
                    else{
                        editor.insert(selstart, selend, "");
                    }
                    //dispose();
                    editor.callAutocomplete();
                    //editor.setSelectionEnd(selstart);
                    //GSAutocomplete.this.selstart = editor.getSelectionStart();
                    //GSAutocomplete.this.selend = editor.getSelectionEnd();
                    //fixSel();
                    context = getContext();
                    useContext();
                    list.repaint();
                    scroll.updateUI();
                }
            }
            public void keyReleased(KeyEvent evt){}
            public void keyTyped(KeyEvent evt){}
        };
    
    public GSAutocomplete(int selstart, int selend, ColorCodedTextArea editor, Project p){
        super("GS Autocomplete...");
        this.setAlwaysOnTop(true);
        editor.requestFocusInWindow();
        this.selstart = selstart;
        this.selend = selend;
        this.editor = editor;
        this.p = p;
        context = getContext();
        addKeyListener(listener);
        useContext();
        findSelectionStart();
    }
    
    public void resetAutocomplete(final int selstart, final int selend, final ColorCodedTextArea editor, Project p) {
        this.selstart = selstart;
        this.selend = selend;
        this.editor = editor;
        this.p = p;
        context = getContext();
    //    useContext();
        this.list.updateUI();
        this.editor.updateUI();
        findSelectionStart();
     }
    
    @Override
    public boolean requestDie(){
        return requestDie;
    }
    
    private void confirm(){
        fixSel();
        if(list.isSelectionEmpty()){//enter
            editor.insert(selstart, selend, "\n");
            editor.callAutocomplete();
        }
        else{
            Suggestion s = (Suggestion) list.getSelectedValue();
            String t = s.confirm(context, prevWord);
            if(selstart!=selend)
                t = editor.getText().substring(selstart, selend) + t;
            editor.insert(selstart, selend, t);
            selstart = selstart+t.length()-s.retreat();
            selend = selstart+t.length()-s.retreat();
            editor.setSelectionStart(selstart);
            editor.setSelectionEnd(Math.min(selend, editor.getDocument().getLength()));
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
    
    private void applyCKeyword(String val){
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
            v.add(new CKeywordSuggestion(val));
        }
    }
    
    private void applyVKeyword(String val){
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
            v.add(new VKeywordSuggestion(val));
        }
    }
    
    private void applyNKeyword(String val){
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
            v.add(new NKeywordSuggestion(val));
        }
    }
    
    private void applyFunction(String val, String args){
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
            v.add(new FunctionSuggestion(val, args));
        }
    }
    
    private void useContext(){
        if(context==null){
            dispose();
            return;
        }
        v.clear();
        //<editor-fold desc="Keywords" defaultstate="collapsed">
        applyCKeyword("if");
        applyCKeyword("while");
        applyCKeyword("for");
        applyKeyword("else");
        applyKeyword("do");
        
        applyKeyword("var");
        
        for(FunctionSuggestion sug : GSFunctions.functions){
            applyFunction(sug.name, sug.args);
        }

        //</editor-fold>
        //Repainting the screen
        
        Collections.sort(v);
        
        list.setModel(new VectorListModel(v));
        list.setCellRenderer(new SuggestionCellRenderer());
        list.repaint();
        list.updateUI();
        
        if(v.size()==1){
            list.setSelectedIndex(0);
            String t = ((Suggestion) list.getSelectedValue()).confirm(context, prevWord);
            if(selstart!=selend)
                t = editor.getText().substring(selstart, selend) + t;
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
        prevWord = "";
        if(selection<0||selection>x.length())
            return null;
        for(int i = 0; i < selection; i++){
            try{
                if(situation==NULL){
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='/'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = SCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='*'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = MCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = STRING;
                        continue;
                    }
                    if(x.charAt(i)=='\''){
                        if(!word.equals(""))
                            prevWord = word;
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
                        if(!word.equals(""))
                            prevWord = word;
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
    
    @Override
    public void dispose() {
        //JOptionPane.showMessageDialog(this, "Disposed!");
        super.dispose();
        editor.requestFocus();
    }
    
    private int findSelectionStart() {
        return findSelectionStart(editor.getCaretPosition());
    }
    private int findSelectionStart(int endpoint) {
        try {
            int start = editor.getSelectionStart();
            if (editor.getText(endpoint, 1).matches("\\W+|\n+|\\+|\\-|\\*|/|\\%|\\&|\\|" + "|\\(|\\)|\\{|\\}|\\!|\\^|\\,|\\;|\\<|\\>|\\=|\\?|\\:")) {
                return start;
            }
            for (int i = endpoint; i >= 0; i--) {
                if (editor.getText(i, 1).matches("\\W+|\n+")) {
                    // System.out.println("i: "+i+"\ttext: '"+editor.getText(i, 1)+"'");
                    start = i;
                    break;
                }
            }
            return start;
        } catch (BadLocationException ex) {
            Logger.getLogger(GSAutocomplete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    private void fixSel() {
        selend = Math.min(editor.getSelectionEnd(),  editor.getCaretPosition());
        selstart = Math.min(editor.getSelectionStart(),  editor.getCaretPosition());
        if (selend != editor.getCaretPosition() && selstart != editor.getCaretPosition()) {
            System.out.println("[scripteditor gsautocomplete]: OK, fixing...");
            selstart = editor.getCaretPosition();
            selend = editor.getCaretPosition();
        }
    }
}
