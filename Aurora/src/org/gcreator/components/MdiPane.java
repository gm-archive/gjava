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

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import org.gcreator.units.Dictionary;


/**
 * @author Luís Reis
 */
public final class MdiPane extends JPanel {

    private JDesktopPane p;
    private JToolBar t;

    public MdiPane() {
        setLayout(new BorderLayout());
        p = new JDesktopPane();
        p.setVisible(true);
        this.add(p, BorderLayout.CENTER);
        t = new JToolBar();
        JButton minimize = new JButton(Dictionary.getEntry("general-mdi-minimize"));
        minimize.setVisible(true);
        minimize.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                JInternalFrame f = p.getSelectedFrame();
                if (f != null) {
                    try {
                        f.setIcon(true);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t.add(minimize);
        JButton restore = new JButton(Dictionary.getEntry("general-mdi-restore"));
        restore.setVisible(true);
        restore.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                JInternalFrame f = p.getSelectedFrame();
                if (f != null) {
                    try {
                        f.setIcon(false);
                        f.setMaximum(false);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t.add(restore);
        JButton maximize = new JButton(Dictionary.getEntry("general-mdi-maximize"));
        maximize.setVisible(true);
        maximize.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                JInternalFrame f = p.getSelectedFrame();
                if (f != null) {
                    try {
                        f.setIcon(false);
                        f.setMaximum(true);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t.add(maximize);
        JButton cascade = new JButton(Dictionary.getEntry("general-mdi-cascade"));
        cascade.setVisible(true);
        cascade.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                JInternalFrame[] fs = p.getAllFrames();
                int width = p.getWidth();
                int height = p.getHeight();
                int w = width / 2;
                int h = height / 2;
                int xg = width / 10;
                int yg = height / 10;
                if (xg < yg) {
                    yg = xg;
                } else {
                    xg = yg;
                }
                int cx = 0;
                int cy = 0;
                for (JInternalFrame f : fs) {
                    if (f.isMaximum()) {
                        try {
                            f.setMaximum(false);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(MdiPane.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    f.setSize(w, h);
                    f.setLocation(cx, cy);
                    cx += xg;
                    cy += yg;
                    if (cx + w > width || cy + h > height) {
                        cx = 0;
                        cy = 0;
                    }
                }
            }
        });
        t.add(cascade);
        t.setVisible(true);
        t.setFloatable(false);
        this.add(t, BorderLayout.NORTH);
    }

    public JInternalFrame getSelectedFrame() {
        return p.getSelectedFrame();
    }

    public void add(JInternalFrame frame, Integer layer) {
        p.add(frame, layer);
    }

    public JDesktopPane getDesktop() {
        return p;
    }
}
