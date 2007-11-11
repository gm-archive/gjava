/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import org.gcreator.editors.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Luís
 */
public class Comment extends ActionPattern{
    //ActorEditor context;
    public Comment(){
        super();
        //this.context = context;
        setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/comment.png")));
    }
    
     
    public JComponent createNewPanel(org.gcreator.actions.Action action){
        PlainTextPanel panel = new PlainTextPanel();
        /*panel.addKeyListener(new KeyListener(){
            public void keyReleased(KeyEvent evt){
                context.jList2.updateUI();
            }
            public void keyPressed(KeyEvent evt){
                context.jList2.updateUI();
            }
            public void keyTyped(KeyEvent evt){
                context.jList2.updateUI();
            }
        }); //Doesn't seem to be working */
        return panel;
    }
    
     
    public String getStandardText(JComponent panel){
        if(panel!=null)
            return ((PlainTextPanel) panel).text.getText();
        else
            return "Comment";
    }
    
     
    public String generateEGML(JComponent panel){
        return ""; //It could generate a comment, but why should it?
    }
}
