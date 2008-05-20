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
    JEditTextArea editor;
    String prevWord;
    String context;
    boolean requestDie = false;
    Project p;
    //How to declare an actor?
    Vector<Suggestion> v = new Vector<Suggestion>();
    
    public GSAutocomplete(final int selstart, final int selend, final JEditTextArea editor, Project p){
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
                    //dispose();
                    //editor.callAutocomplete();
                    //editor.setSelectionEnd(selstart);
                    GSAutocomplete.this.selstart = editor.getSelectionStart();
                    GSAutocomplete.this.selend = editor.getSelectionEnd();
                    context = getContext();
                    useContext();
                    list.repaint();
                    scroll.updateUI();
                }
                else if(evt.getKeyChar()==8){
                    if(selstart==selend){
                        editor.insert(selstart-1, selstart, "");
                    }
                    else{
                        editor.insert(selstart, selend, "");
                    }
                    //dispose();
                    //editor.callAutocomplete();
                    editor.setSelectionEnd(selstart);
                    GSAutocomplete.this.selstart = editor.getSelectionStart();
                    GSAutocomplete.this.selend = editor.getSelectionEnd();
                    context = getContext();
                    useContext();
                    list.repaint();
                    scroll.updateUI();
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
            if(selstart!=selend)
                t = editor.getText().substring(selstart, selend) + t;
            editor.insert(selstart, selend, t);
            selstart = selstart+t.length()-s.retreat();
            selend = selstart+t.length()-s.retreat();
            editor.setSelectionStart(selstart);
            editor.setSelectionEnd(selend);
            
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
        
        applyCKeyword("if");
        applyCKeyword("while");
        applyCKeyword("for");
        applyKeyword("else");
        applyKeyword("do");
        
        applyKeyword("var");
        
        applyFunction("room_goto_next", "");
        applyFunction("room_goto_previous", "");
        applyFunction("scene_goto_next", "");
        applyFunction("scene_goto_previous", "");
        applyFunction("random", "max");
        applyFunction("abs", "x");
        applyFunction("sign", "x");
        applyFunction("round", "x");
        applyFunction("floor", "x");
        applyFunction("ceil", "x");
        applyFunction("frac", "x");
        applyFunction("sqrt", "x");
        applyFunction("sqr", "x");
        applyFunction("power", "x");
        applyFunction("exp", "x");
        applyFunction("ln", "x");
        applyFunction("log2", "x");
        applyFunction("log10", "x");
        applyFunction("logn", "n, x");
        applyFunction("sin", "x");
        applyFunction("cos", "x");
        applyFunction("tan", "x");
        applyFunction("arcsin", "x");
        applyFunction("arccos", "x");
        applyFunction("arctan", "x");
        applyFunction("arctan2", "y, x");
        applyFunction("degtorad", "degrees");
        applyFunction("radtodeg", "radians");
        applyFunction("point_distance", "x1, y1, x2, y2");
        applyFunction("lengthdir_x", "len, dir");
        applyFunction("lengthdir_y", "len, dir");
        applyFunction("is_real", "x");
        applyFunction("is_string", "x");
        applyFunction("point_direction", "x1, y1, x2, y2");
        applyFunction("real", "str");
        applyFunction("string", "value");
        applyFunction("chr", "value");
        applyFunction("ord", "char");
        applyFunction("string_length", "text");
        applyFunction("string_pos", "substring, text");
        applyFunction("string_copy", "text, index, count");
        applyFunction("string_char_at", "text, index");
        applyFunction("string_delete", "text, index, count");
        applyFunction("string_insert", "substring, text, index");
        applyFunction("string_lower", "text");
        applyFunction("string_upper", "text");
        applyFunction("string_repeat", "text, times");
        applyFunction("string_letters", "text");
        applyFunction("string_digits", "text");
        applyFunction("string_lettersdigits", "text");
        applyFunction("string_replace", "text, find, replace");
        applyFunction("string_replaceall", "text, find, replace");
        applyFunction("string_count", "substring, text");
        applyFunction("string_format", "val, total, dec");
        applyFunction("clipboard_has_text", "");
        applyFunction("clipboard_get_text", "");
        applyFunction("clipboard_set_text", "text");
        applyFunction("date_current_date", "");
        applyFunction("move_snap", "hsnap, vsnap");
        applyFunction("place_snapped", "hsnap, vsnap");
        applyFunction("move_random", "hsnap, vsnap");
        applyFunction("move_wrap", "hsnap, vsnap");
        applyFunction("move_towards_point", "x, y, sp");
        applyFunction("distance_to_point", "x, y");
        applyFunction("sleep", "millisecond");
        applyFunction("game_end", "");
        applyFunction("draw_sprite", "sprite, subimg, x, y");
        applyFunction("draw_sprite_stretched", "sprite, subimg, x, y, w, h");
        applyFunction("draw_clear", "color");
        applyFunction("draw_point", "x, y");
        applyFunction("draw_line", "x1, y1, x2, y2");
        applyFunction("draw_rectangle", "x1, y1, x2, y2, outline");
        applyFunction("draw_roundrect", "x1, y1, x2, y2, outline");
        applyFunction("draw_set_color", "color");
        applyFunction("draw_get_color", "");
        applyFunction("draw_get_red", "");
        applyFunction("draw_get_green", "");
        applyFunction("draw_get_blue", "");
        applyFunction("make_color_rgb", "red, green, blue");
        applyFunction("draw_text", "x, y, string");
        applyFunction("surface_create", "w, h");
        applyFunction("surface_get_width", "id");
        applyFunction("surface_get_height", "id");
        applyFunction("surface_set_target", "id");
        applyFunction("surface_reset_target", "id");
        applyFunction("surface_save", "id, fname");
        applyFunction("draw_surface", "id, x, y");
        //Tiles
        applyFunction("display_get_width", "");
        applyFunction("display_get_height", "");
        applyFunction("display_get_frequency", "");
        applyFunction("display_get_colordepth", "");
        applyFunction("show_message", "text");
        applyFunction("show_error", "text, abort");
        applyFunction("file_text_open_read", "fname");
        applyFunction("file_text_open_write", "fname");
        applyFunction("file_text_close", "fileid");
        applyFunction("file_text_write_string", "fileid, str");
        applyFunction("file_text_write_real", "fileid, x");
        applyFunction("file_text_read_string", "fileid");
        applyFunction("ds_stack_create", "");
        applyFunction("ds_stack_destroy", "id");
        applyFunction("ds_stack_clear", "id");
        applyFunction("ds_stack_size", "id");
        applyFunction("ds_stack_empty", "id");
        applyFunction("ds_stack_push", "id, value");
        applyFunction("ds_stack_pop", "id");
        applyFunction("ds_stack_top", "id");
        applyFunction("ds_queue_create", "");
        applyFunction("ds_queue_destroy", "id");
        applyFunction("ds_queue_clear", "id");
        applyFunction("ds_queue_size", "id");
        applyFunction("ds_queue_empty", "id");
        applyFunction("ds_queue_enqueue", "id, val");
        applyFunction("ds_queue_dequeue", "id");
        applyFunction("ds_queue_head", "id");
        applyFunction("ds_queue_tail", "id");
        //Lists
        //Maps
        applyFunction("window_set_visible", "visible");
        applyFunction("window_get_visible", "");
        applyFunction("window_set_fullscreen", "fullscreen");
        applyFunction("window_get_fullscreen", "");
        applyFunction("window_set_showborder", "showborder");
        applyFunction("window_get_showborder", "");
        applyFunction("window_set_sizeable", "sizeable");
        applyFunction("window_get_sizeable", "");
        applyFunction("window_set_caption", "caption");
        applyFunction("window_get_caption", "");
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
    
}
