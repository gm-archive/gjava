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

import java.awt.Color;
import java.io.File;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import org.gcreator.externproject.StdImport;
import org.gcreator.managers.*;

/**
 *
 * @author  Luís
 */
public class PowerPackImporter extends TabPanel {

    public IconList list = new IconList();
    /** Creates new form PowerPackImporter */

    public PowerPackImporter() {
        initComponents();
        project = null;
        list.setColumns(5);
        File powerpack = new File("./powerpack");
        if (!powerpack.exists()) {
            jScrollPane1.setViewportView(new JLabel("Could not find PowerPack!"));
        }
        if (!powerpack.isDirectory()) {
            jScrollPane1.setViewportView(new JLabel("PowerPack must be a folder!"));
        }
        File[] files = powerpack.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i] != null && files[i].isFile()) {
                try {
                    list.addElement(files[i].getName(), new ImageIcon(ImageIO.read(files[i])), null);
                } catch (Exception e) {
                }
            }
        }
        jScrollPane1.setViewportView(list);
        list.setBackground(Color.WHITE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText(LangSupporter.activeLang.getEntry(187));

        jLabel2.setText(LangSupporter.activeLang.getEntry(188));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Show image files");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Show audio files");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText(LangSupporter.activeLang.getEntry(196));

        jLabel4.setText(LangSupporter.activeLang.getEntry(197));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel3, 0, 0, Short.MAX_VALUE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jCheckBox2, 0, 0, Short.MAX_VALUE)
                    .add(jCheckBox1, 0, 0, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 198, Short.MAX_VALUE)
                        .add(jButton1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sel = list.getSelectedText();
        if (sel == null) {
            System.out.println("No selection");
            return;
        }
        sel = "." + File.separator + "powerpack" + File.separator + sel;
        try {
            StdImport.importImage(org.gcreator.core.gcreator.panel.getCurrentFolder(), sel);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("will update");
        org.gcreator.core.gcreator.panel.workspace.updateUI();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
