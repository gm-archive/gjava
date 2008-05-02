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
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.*;
import org.gcreator.autocomplete.impl.*;
import org.gcreator.components.*;
import org.gcreator.components.impl.VectorListModel;
import org.gcreator.fileclass.Project;
import org.gcreator.units.ObjectNode;
import publicdomain.*;

/**
 * @author Luís Reis
 */
public class GSAutocomplete extends AutocompleteFrame{
    int selstart;
    int selend;
    SyntaxHighlighter editor;
    String prevWord;
    String context;
    boolean requestDie = false;
    Project p;
    //How to declare an actor?
    Vector<Suggestion> v = new Vector<Suggestion>();
    
    public GSAutocomplete(final int selstart, final int selend, final SyntaxHighlighter editor, Project p){
        super("GS Autocomplete...");
        this.selstart = selstart;
        this.selend = selend;
        this.editor = editor;
        this.p = p;
        context = getContext();
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
            Suggestion s = (Suggestion) list.getSelectedValue();
            String t = s.confirm(context, prevWord);
            editor.insert(selstart, selend, t);
            editor.setSelectionStart(selstart+t.length()-s.retreat());
            editor.setSelectionEnd(selstart+t.length()-s.retreat());
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
    
    private void applyFunction(String val){
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
            v.add(new FunctionSuggestion(val));
        }
    }
    
    private void useContext(){
        if(context==null){
            dispose();
            return;
        }
        
        applyCKeyword("if");
        applyCKeyword("while");
        applyCKeyword("for");
        applyKeyword("else");
        applyKeyword("do");
        
        applyKeyword("var");
        
        applyFunction("room_goto_next");
        applyFunction("room_goto_previous");
        applyFunction("scene_goto_next");
        applyFunction("scene_goto_previous");
        applyFunction("random");
        applyFunction("abs");
        applyFunction("sign");
        applyFunction("round");
        applyFunction("floor");
        applyFunction("ceil");
        applyFunction("frac");
        applyFunction("sqrt");
        applyFunction("sqr");
        applyFunction("power");
        applyFunction("exp");
        applyFunction("ln");
        applyFunction("log2");
        applyFunction("log10");
        applyFunction("logn");
        applyFunction("sin");
        applyFunction("cos");
        applyFunction("tan");
        applyFunction("arcsin");
        applyFunction("arccos");
        applyFunction("arctan");
        applyFunction("arctan2");
        applyFunction("degtorad");
        applyFunction("radtodeg");
        applyFunction("point_distance");
        applyFunction("lengthdir_x");
        applyFunction("lengthdir_y");
        applyFunction("is_real");
        applyFunction("is_string");
        applyFunction("point_direction");
        applyFunction("real");
        applyFunction("string");
        applyFunction("chr");
        applyFunction("ord");
        applyFunction("string_length");
        applyFunction("string_pos");
        applyFunction("string_copy");
        applyFunction("string_char_at");
        applyFunction("string_delete");
        applyFunction("string_insert");
        applyFunction("string_lower");
        applyFunction("string_upper");
        applyFunction("string_repeat");
        applyFunction("string_letters");
        applyFunction("string_digits");
        applyFunction("string_lettersdigits");
        applyFunction("string_replace");
        applyFunction("string_replaceall");
        applyFunction("string_count");
        applyFunction("string_format");
        applyFunction("clipboard_has_text");
        applyFunction("clipboard_get_text");
        applyFunction("clipboard_set_text");
        applyFunction("date_current_date");
        applyFunction("move_snap");
        applyFunction("place_snapped");
        applyFunction("move_random");
        applyFunction("move_wrap");
        applyFunction("move_towards_point");
        applyFunction("distance_to_point");
        applyFunction("sleep");
        applyFunction("game_end");
        applyFunction("draw_sprite");
        applyFunction("draw_sprite_stretched");
        applyFunction("draw_clear");
        applyFunction("draw_point");
        applyFunction("draw_line");
        applyFunction("draw_rectangle");
        applyFunction("draw_roundrect");
        applyFunction("draw_set_color");
        applyFunction("draw_get_color");
        applyFunction("draw_get_red");
        applyFunction("draw_get_green");
        applyFunction("draw_get_blue");
        applyFunction("make_color_rgb");
        applyFunction("draw_text");
        applyFunction("surface_create");
        applyFunction("surface_get_width");
        applyFunction("surface_get_height");
        applyFunction("surface_set_target");
        applyFunction("surface_reset_target");
        applyFunction("surface_save");
        applyFunction("draw_surface");
        applyFunction("display_get_width");
        applyFunction("display_get_height");
        applyFunction("display_get_frequency");
        applyFunction("display_get_colordepth");
        applyFunction("show_message");
        applyFunction("show_error");
        applyFunction("file_text_open_read");
        applyFunction("file_text_open_write");
        applyFunction("file_text_close");
        applyFunction("file_text_write_string");
        applyFunction("file_text_write_real");
        applyFunction("file_text_read_string");
        applyFunction("ds_stack_create");
        applyFunction("ds_stack_destroy");
        applyFunction("ds_stack_clear");
        applyFunction("ds_stack_size");
        applyFunction("ds_stack_empty");
        applyFunction("ds_stack_push");
        applyFunction("ds_stack_pop");
        applyFunction("ds_queue_create");
        applyFunction("ds_queue_destroy");
        applyFunction("ds_queue_clear");
        applyFunction("ds_queue_size");
        applyFunction("ds_queue_empty");
        applyFunction("ds_queue_enqueue");
        applyFunction("ds_queue_dequeue");
        applyFunction("ds_queue_head");
        applyFunction("ds_queue_tail");
        applyFunction("window_set_visible");
        applyFunction("window_get_visible");
        applyFunction("window_set_fullscreen");
        applyFunction("window_get_fullscreen");
        applyFunction("window_set_showborder");
        applyFunction("window_get_showborder");
        applyFunction("window_set_sizeable");
        applyFunction("window_get_sizeable");
        applyFunction("window_set_caption");
        applyFunction("window_get_caption");
        
        Collections.sort(v);
        
        list.setModel(new VectorListModel(v));
        list.setCellRenderer(new SuggestionCellRenderer());
        
        if(v.size()==1){
            list.setSelectedIndex(0);
            String t = ((Suggestion) list.getSelectedValue()).confirm(context, prevWord);
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
    
}
