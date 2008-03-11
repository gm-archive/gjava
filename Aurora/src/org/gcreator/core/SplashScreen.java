/*
 * SplashScreen.java
 *
 * Created on 5 de Setembro de 2007, 17:30
 */

package org.gcreator.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  Luís
 */
public class SplashScreen extends JFrame {
    
    /** Creates new form SplashScreen */
    public SplashScreen(boolean applet) {
        jLabel1 = new javax.swing.JLabel();

        setTitle("Loading... Please Wait");
        if(!applet){
            setAlwaysOnTop(true);
        }
        setResizable(false);
        setUndecorated(true);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/splashscreen20tf0.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1)
        );

        pack();
        Dimension m = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(
                (m.width - this.getWidth()) / 2,
                (m.height - this.getHeight()) / 2);
        this.addMouseListener(new MouseListener(){
            public void mouseExited(MouseEvent evt){}
            public void mouseEntered(MouseEvent evt){}
            public void mouseClicked(MouseEvent evt){
                setVisible(false);
            }
            public void mouseReleased(MouseEvent evt){
                setVisible(false);
            }
            public void mousePressed(MouseEvent evt){
                setVisible(false);
            }
        });
        setVisible(true);
    }

    public void dispose(){
        super.dispose();
    }
    
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
    
}