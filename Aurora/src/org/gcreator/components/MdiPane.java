/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Luís Reis
 */
public class MdiPane extends JPanel{
    private JDesktopPane p;
    private JToolBar t;
    
    public MdiPane(){
        setLayout(new BorderLayout());
        p = new JDesktopPane();
        p.setVisible(true);
        this.add(p, BorderLayout.CENTER);
        t = new JToolBar();
        JButton minimize = new JButton("Minimize");
        minimize.setVisible(true);
        minimize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JInternalFrame f = p.getSelectedFrame();
                if (f != null)
                    try {
                        f.setIcon(true);
                    }
                    catch(Exception e){}
            }
        });
        t.add(minimize);
        JButton restore = new JButton("Restore");
        restore.setVisible(true);
        restore.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JInternalFrame f = p.getSelectedFrame();
                if(f!=null)
                    try{
                        f.setIcon(false);
                        f.setMaximum(false);
                    }
                    catch(Exception e){}
            }
        });
        t.add(restore);
        JButton maximize = new JButton("Maximize");
        maximize.setVisible(true);
        maximize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JInternalFrame f = p.getSelectedFrame();
                if(f!=null)
                    try{
                        f.setIcon(false);
                        f.setMaximum(true);
                    }
                    catch(Exception e){}
            }
        });
        t.add(maximize);
        JButton cascade = new JButton("Cascade");
        cascade.setVisible(true);
        cascade.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JInternalFrame[] fs = p.getAllFrames();
                int width = p.getWidth();
                int height = p.getHeight();
                int w = width / 2;
                int h = height / 2;
                int xg = width / 10;
                int yg =height / 10;
                if(xg<yg)
                    yg = xg;
                else
                    xg = yg;
                int cx = 0;
                int cy = 0;
                for(JInternalFrame f : fs){
                    f.setSize(w, h);
                    f.setLocation(cx, cy);
                    cx += xg;
                    cy += yg;
                    if(cx+w>width||cy+h>height){
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
    
    public JInternalFrame getSelectedFrame(){
        return p.getSelectedFrame();
    }
    
    public void add(JInternalFrame frame, Integer layer){
        p.add(frame, layer);
    }
}
