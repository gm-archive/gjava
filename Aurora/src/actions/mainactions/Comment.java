/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions.mainactions;

import org.gcreator.editors.ActorEditor;
import actions.*;
import org.gcreator.editors.*;
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
    public JComponent createNewPanel(actions.Action action){
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
    public String getStandardText(JComponent panel){
        if(panel!=null)
            return ((PlainTextPanel) panel).text.getText();
        else
            return "Comment";
    }
    
    @Override
    public String generateEGML(JComponent panel){
        return ""; //It could generate a comment, but why should it?
    }
}
