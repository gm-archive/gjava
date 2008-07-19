/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 *
 * 
 * 
 * FancyAboutPanel.java
 *
 * Created on July 17, 2008, 8:38 PM
 */

package org.gcreator.help;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.plaf.FontUIResource;

/**
 * A cheap class that displays all the contributors of G-Creator with fancy text.
 * 
 * @author  Serge Humphrey
 */
public final class FancyAboutPanel extends javax.swing.JPanel {
    
    private static final String[] contributors = new String[] {
        // Aurora Programmers
        "Luís Reis", "Lead G-Creator Developer", 
        "TGMG", "G-Creator Developer",
        "Serge Humphrey", "G-Creator Developer",
        // PlatformCore Programmers
        "TGMG", "Lead (S)GCL And Compiler Developer",
        // G-Java Programmers
        "TGMG", "Lead G-Java Developer",
        // GM Importer
        "TGMG", "Lead GM Importer Developer",
        "Luís Reis", "GM Importer Developer",
        "LGM Team", "GM Format Documentation",
        // G-Creator Translators
        "Luís Reis", "Portuguese Translation",
        "B Biglari", "German Translation",
        "Johnathan Potapenko", "Russian Translation",
        "Luis Peregrina", "Spanish Translation",
        //Art
        "Luis Peregrina", "Lead G-Creator designer",
        // Starfish Programmers
        "Luís Reis", "Lead Starfish Developer",
        // Seagulls Programmers
        "Sleija", "Lead Seagulls Developer",
        "Piggy1", "Seagulls Developer",
        //Special Thanks
        "G-Creator Community", "Special Thanks",
        "All our users", "Special Thanks"
    };
    
    private Timer ti = null;
    
    public void begin(){
        t = 1.0;
        person = 0;
        rotation = 0.0;
        doRotate = false;
        didCall = false;
        scale = 0.0;
        ti.start();
    }
    
    public void end(){
        ti.stop();
    }
    
    /** Creates new form FancyAboutPanel */
    public FancyAboutPanel() {
        initComponents();
        ti = new Timer(20, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
    }
    
    private double scale;
    private double t = 1.0D;
    private double rotation;
    private boolean doRotate;
    private boolean didCall;
    private int person;
    
    private void update() {
        if (!doRotate) {
            scale = Math.sin(t -= ((scale*100 > 32) ? 0.04 : 0))*1.8;
        } else {
            scale *= 1.1;
            if (scale > 1.5) {
                person = (person+2) % contributors.length;
                scale = 0;
                t = 1.0D;
                rotation = 0;
                doRotate = false;
                didCall = false;
                update();
            }
        }
        if (doRotate) {
            rotation += 0.8+Math.random()/3;
        }
        
        if (!didCall && scale*100 <= 32) {
            org.gcreator.threading.ThreadPool.schedule(new Runnable() {

                public void run() {
                    doRotate = true;
                }
            }, 2, TimeUnit.SECONDS);
            didCall = true;
        }
    }
    
    @Override
    public void paint(Graphics AWTGraphics) {
        super.paint(AWTGraphics);
        Graphics2D g = (Graphics2D) AWTGraphics;
        Font font = new FontUIResource("CAC Krazy Legs", Font.BOLD, (int)(scale*100));
        g.setFont(font);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)(Math.min(1, Math.max(1-scale*0.8, 0)))));
        String text = contributors[person];
        String description = contributors[person+1];
        g.rotate(rotation, getWidth() / 2, getHeight() / 2);
        g.setColor(Color.BLACK);
        int c1 = getWidth()/2-g.getFontMetrics().stringWidth(description)/2;
        int c2 = (int)(getHeight()/3+g.getFontMetrics().getHeight()*0.8);
        g.drawString(description, c1, c2+((int)(scale*100))/12);
        g.drawString(text, getWidth()/2-g.getFontMetrics().stringWidth(text)/2, getHeight()/2+g.getFontMetrics().getHeight()+((int)(scale*100))/12);
        g.setColor(Color.BLUE);
        g.drawString(description, c1, c2);
        g.drawString(text, getWidth()/2-g.getFontMetrics().stringWidth(text)/2, getHeight()/2+g.getFontMetrics().getHeight());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
