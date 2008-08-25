/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.fileclass.GameProject;
import org.gcreator.managers.*;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class GameProjects extends JPanel{
    private ProjectTypes ptypes;
    public int tnum;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    
    public int getSelectedProject(){
        if(jButton1.isSelected())
            return ProjectTypes.EMPTY_GAME;
        if(jButton2.isSelected())
            return ProjectTypes.RPG_GAME;
        if(jButton3.isSelected())
            return ProjectTypes.PLATFORM_GAME;
        if(jButton4.isSelected())
            return ProjectTypes.AIR_BATTLE;
        return -1;
    }
    
    public GameProjects(ProjectTypes ptypes) {
        super();
        this.ptypes = ptypes;
        initComponents();
        jButton1.setText(Dictionary.getEntry("general-newproject-emptygame"));
        ptypes.npro.ProjectButtons.add(jButton1);
        ptypes.npro.ProjectButtons.add(jButton2);
        ptypes.npro.ProjectButtons.add(jButton3);
        ptypes.npro.ProjectButtons.add(jButton4);
    }
    
    public void add(JComponent c){
        GridLayout g = (GridLayout) getLayout();
        
        if(getComponentCount()>5)
            g.setRows(g.getRows()+1);
        super.add(c);
    }
    
    //public GridBagLayout layout;    
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_game.png"))); // NOI18N
        jButton1.setText("Empty Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_rpg.png"))); // NOI18N
        jButton2.setText("RPG Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_platform.png"))); // NOI18N
        jButton3.setText("Platform Game");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_airbattle.png"))); // NOI18N
        jButton4.setText("Air Battle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        //layout = new GridBagLayout();
        setLayout(new GridLayout(5, 1));
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        //gbg = new GridBagConstraints(0, 0, 0, 0, 0, 0,
        //        GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        //layout.setConstraints(this, gbg);
        /*    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        ;
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jButton1)
        );*/
    }
    
    public void setButton(int sel){
        ptypes.npro.uncheckAll();
        if(sel==1)
            jButton1.setSelected(true);
        else if(sel==2)
            jButton2.setSelected(true);
        else if(sel==3)
            jButton3.setSelected(true);
        else if(sel==4)
            jButton4.setSelected(true);
    }
    
    public void turnOff(){
        setButton(0);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setButton(1);
        String str = jButton1.getText()
                .replaceAll("\\s", "_")
                .replaceAll("[\\.:?^(){}]","")
                .replaceAll("(\\[|\\])", "")
                + "1";
        if(str.charAt(0)=='1')
            str = "p1";
        ptypes.npro.jTextField1.setText(str);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setButton(2);
        String str = jButton2.getText()
                .replaceAll("\\s", "_")
                .replaceAll("[\\.:?^(){}]","")
                .replaceAll("(\\[|\\])", "")
                + "1";
        if(str.charAt(0)=='1')
            str = "p1";
        ptypes.npro.jTextField1.setText(str);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setButton(3);
        String str = jButton3.getText()
                .replaceAll("\\s", "_")
                .replaceAll("[\\.:?^(){}]","")
                .replaceAll("(\\[|\\])", "")
                + "1";
        if(str.charAt(0)=='1')
            str = "p1";
        ptypes.npro.jTextField1.setText(str);
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setButton(4);
        String str = jButton4.getText()
                .replaceAll("\\s", "_")
                .replaceAll("[\\.:?^(){}]","")
                .replaceAll("(\\[|\\])", "")
                + "1";
        if(str.charAt(0)=='1')
            str = "p1";
        ptypes.npro.jTextField1.setText(str);
    }
}
