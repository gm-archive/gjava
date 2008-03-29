/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class GameProjects extends JPanel{
    private ProjectTypes ptypes;
    public int tnum;
    private JButton jButton1;
    
    public int getSelectedProject(){
        if(jButton1.isSelected())
            return 0;
        return -1;
    }
    
    public GameProjects(ProjectTypes ptypes) {
        this.ptypes = ptypes;
        initComponents();
        jButton1.setText(LangSupporter.activeLang.getEntry(58));
        ptypes.npro.ProjectButtons.add(jButton1);
    }
    
    public BoxLayout layout;    
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/new_game.png"))); // NOI18N
        jButton1.setText("Empty Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        add(jButton1);
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
}
