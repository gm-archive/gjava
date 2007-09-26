/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions.mainactions;

import actions.*;
import editors.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Luís
 */
public class Comment extends ActionPattern{
    ActorEditor context;
    public Comment(ActorEditor context){
        super(context);
        this.context = context;
        setStandardImage(new ImageIcon(getClass().getResource("/actions/images/comment.png")));
    }
    
    @Override
    public JPanel createNewPanel(actions.Action action){
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
    
    @Override
    public String getStandardText(JPanel panel){
        if(panel!=null)
            return ((PlainTextPanel) panel).text.getText();
        else
            return "Comment";
    }
    
    @Override
    public String generateEGML(JPanel panel){
        return ""; //It could generate a comment, but why should it?
    }
}
