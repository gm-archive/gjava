/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.components.EGMLTextArea;
import org.gcreator.editors.ActorEditor;
import org.gcreator.actions.*;
import org.gcreator.editors.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.components.*;

/**
 *
 * @author Luís
 */
public class ExecuteCode extends ActionPattern{
    ActorEditor context;
    public ExecuteCode(ActorEditor context){
        super(context);
        this.context = context;
        setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Execute_Code.png")));
    }
    
    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action){
        EGMLTextArea panel = new EGMLTextArea("//Some EGML Code");
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
            return ((EGMLTextArea) panel).getText();
        else
            return "Execute EGML Code";
    }
    
    @Override
    public String generateEGML(JComponent panel){
        return ((EGMLTextArea) panel).getText();
    }
}
