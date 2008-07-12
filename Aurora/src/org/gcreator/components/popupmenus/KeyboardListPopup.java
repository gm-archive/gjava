/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.popupmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.gcreator.components.impl.EventSelectListener;

/*
 * The numbers of the characters are very important as they represent the keyboard character codes
 * DO NOT CHANGE THEM!
 */
class KeyboardActionListener implements ActionListener{
    KeyboardListPopup popmenu;
    int num;
    String name;
    public KeyboardActionListener(KeyboardListPopup popmenu, int num,String name){
        this.popmenu = popmenu;
        this.num = num;
        this.name = name;
        }
    
    public void actionPerformed(ActionEvent evt){
        popmenu.cause(num,name);
    }
}


public class KeyboardListPopup extends JPopupMenu{
    JMenuItem[] items;
    EventSelect selector;
    int kcode;
    public KeyboardListPopup(EventSelect selector,int code){
        kcode=code;
        JMenu letters = new JMenu("Letters");
        JMenu fkeys = new JMenu("Function keys");
        JMenu digits = new JMenu("Digits");
        JMenu others = new JMenu("Others");
        JMenu keypad = new JMenu("Keypad");
        JMenu arrows = new JMenu("Arrows");
        
        add(arrows);
        add(letters);
        add(fkeys);
        add(digits);
        add(keypad);
        add(others);
        
        add(others,new JMenuItem("<Shift>"),16);
        add(others,new JMenuItem("<Ctrl>"),17);
        add(others,new JMenuItem("<Alt>"),18);
        add(others,new JMenuItem("<Space>"),32); 
        add(others,new JMenuItem("<Enter>"),10); 
        add(others,new JMenuItem("<Backspace>"),8); 
        add(others,new JMenuItem("<Home>"),36);
        add(others,new JMenuItem("<End>"),35);
        add(others,new JMenuItem("<PageUP>"),33); 
        add(others,new JMenuItem("<PageDown>"),34);
        add(others,new JMenuItem("<Delete>"),127); 
        add(others,new JMenuItem("<Insert>"),155);
        add(others,new JMenuItem("<ESC>"),27); 
        
        add(arrows,new JMenuItem("<left>"),37);
        add(arrows,new JMenuItem("<right>"),39);
        add(arrows,new JMenuItem("<up>"),38);
        add(arrows,new JMenuItem("<down>"),40);
        
        add(fkeys,new JMenuItem("F1"),112);
        add(fkeys,new JMenuItem("F2"),113);
        add(fkeys,new JMenuItem("F3"),114);
        add(fkeys,new JMenuItem("F4"),115);
        add(fkeys,new JMenuItem("F5"),116);
        add(fkeys,new JMenuItem("F6"),117);
        add(fkeys,new JMenuItem("F7"),118);
        add(fkeys,new JMenuItem("F8"),119);
        add(fkeys,new JMenuItem("F9"),120);
        add(fkeys,new JMenuItem("F10"),121);
        add(fkeys,new JMenuItem("F11"),122);
        add(fkeys,new JMenuItem("F12"),123);
        
        add(digits,new JMenuItem("0"),48);
        add(digits,new JMenuItem("1"),49);
        add(digits,new JMenuItem("2"),50);
        add(digits,new JMenuItem("3"),51);
        add(digits,new JMenuItem("4"),52);
        add(digits,new JMenuItem("5"),53);
        add(digits,new JMenuItem("6"),54);
        add(digits,new JMenuItem("7"),55);
        add(digits,new JMenuItem("8"),56);
        add(digits,new JMenuItem("9"),57);
        
        add(letters,new JMenuItem("A"),65);
        add(letters,new JMenuItem("B"),66);
        add(letters,new JMenuItem("C"),67);
        add(letters,new JMenuItem("D"),68);
        add(letters,new JMenuItem("E"),69);
        add(letters,new JMenuItem("F"),70);
        add(letters,new JMenuItem("G"),71);
        add(letters,new JMenuItem("H"),72);
        add(letters,new JMenuItem("I"),73);
        add(letters,new JMenuItem("J"),74);
        add(letters,new JMenuItem("K"),75);
        add(letters,new JMenuItem("L"),76);
        add(letters,new JMenuItem("M"),77);
        add(letters,new JMenuItem("N"),78);
        add(letters,new JMenuItem("O"),79);
        add(letters,new JMenuItem("P"),80);
        add(letters,new JMenuItem("Q"),81);
        add(letters,new JMenuItem("R"),82);
        add(letters,new JMenuItem("S"),83);
        add(letters,new JMenuItem("T"),84);
        add(letters,new JMenuItem("U"),85);
        add(letters,new JMenuItem("V"),86);
        add(letters,new JMenuItem("W"),87);
        add(letters,new JMenuItem("X"),88);
        add(letters,new JMenuItem("Y"),89);
        add(letters,new JMenuItem("Z"),90);
        
        this.selector = selector;
        this.updateUI();
    }
    public void add(JMenu j,JMenuItem m, int i){
        j.add(m);
        m.addActionListener(new KeyboardActionListener(this, i,m.getText()));
    }
    
    public void cause(int num,String name){
        selector.callEvent(kcode+num,name);
        selector.dispose();
        selector = null; //Perhaps this will help with garbage collection?
    }
}

