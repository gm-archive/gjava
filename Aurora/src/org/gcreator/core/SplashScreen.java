/*
 * SplashScreen.java
 *
 * Created on 5 de Setembro de 2007, 17:30
 */

package org.gcreator.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.gcreator.components.uiplus.DialogPlus;

/**
 *
 * @author  Luís
 */
public class SplashScreen extends DialogPlus {
    
    public static String message = "Loading...";
    
    ImageIcon i;
    /** Creates new form SplashScreen */
    public SplashScreen(boolean applet) {
        progressBar = new JProgressBar();

       
        setTitle("Loading... Please Wait");
      /*  if(!applet){
            setAlwaysOnTop(true);
        }*/
        setResizable(false);
        setUndecorated(true);

        i = new ImageIcon(getClass().getResource("/org/gcreator/resources/splashscreen300bob.png")); // NOI18N

        JPanel p = new JPanel(){
            public void paint(Graphics g){
                g.drawImage(i.getImage(), 0, 0, i.getImageObserver());
        
                g.setColor(Color.GRAY);
                g.drawString("G-Creator " + gcreator.version + ": " + message, 5, 260);
                
                setOpaque(false);
                super.paint(g);
            }
        };
        p.setVisible(true);
        setContentPane(p);
        setAlwaysOnTop(true);
        
        setLayout(null);
        //add(jLabel1);
        
        setSize(i.getIconWidth(), i.getIconHeight());
        add(progressBar);
        progressBar.setSize(getWidth(), 20);
        progressBar.setLocation(0, 220);
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);
        progressBar.setVisible(false);
        Dimension m = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(
                (m.width - this.getWidth()) / 2,
                (m.height - this.getHeight()) / 2);
        this.addMouseListener(new MouseListener(){
            public void mouseExited(MouseEvent evt){}
            public void mouseEntered(MouseEvent evt){}
            public void mouseClicked(MouseEvent evt){
                fadeOut();
            }
            public void mouseReleased(MouseEvent evt){
                fadeOut();
            }
            public void mousePressed(MouseEvent evt){
                fadeOut();
            }
        });
        setVisible(true);
    }

    public void dispose(){
        super.dispose();
    }
    
    // Variables declaration - do not modify
    public JProgressBar progressBar;
    // End of variables declaration
    
}