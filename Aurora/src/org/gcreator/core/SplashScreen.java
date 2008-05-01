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
    
    public static String message = "Loading...";
    
    ImageIcon i;
    /** Creates new form SplashScreen */
    public SplashScreen(boolean applet) {
        jProgress1 = new JProgressBar();

       
        setTitle("Loading... Please Wait");
        if(!applet){
            setAlwaysOnTop(true);
        }
        setResizable(false);
        setUndecorated(true);

        i = new ImageIcon(getClass().getResource("/org/gcreator/resources/splashscreen20tf0.jpg")); // NOI18N

        JPanel p = new JPanel(){
            public void paint(Graphics g){
                g.drawImage(i.getImage(), 0, 0, i.getImageObserver());
        
                g.setColor(Color.GRAY);
                g.drawString(message, 5, 260);
                
                setOpaque(false);
                super.paint(g);
            }
        };
        p.setVisible(true);
        setContentPane(p);
        
        setLayout(null);
        //add(jLabel1);
        
        setSize(i.getIconWidth(), i.getIconHeight());
        add(jProgress1);
        jProgress1.setSize(getWidth(), 20);
        jProgress1.setLocation(0, 220);
        jProgress1.setVisible(true);
        jProgress1.setIndeterminate(true);
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
    private JProgressBar jProgress1;
    // End of variables declaration
    
}