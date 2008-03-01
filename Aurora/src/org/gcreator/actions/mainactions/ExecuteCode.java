/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.components.EGMLPanel;
import org.gcreator.components.scanning.GCLScanner;
import org.gcreator.components.scanning.Scanner;
import org.gcreator.components.SyntaxHighlighter;
import org.gcreator.components.impl.*;
import org.gcreator.editors.ActorEditor;
import org.gcreator.actions.*;
import org.gcreator.editors.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.components.*;

import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;
import publicdomain.*;

/**
 *
 * @author Luís
 */
public class ExecuteCode extends ActionPattern{
    //ActorEditor context;
    public static ImageIcon img = new ImageIcon(ExecuteCode.class.getResource("/org/gcreator/actions/images/Execute_Code.png"));
    
    public ExecuteCode(){
        super();
        //this.context = context;
    }
    
    public void setStandardImage(ImageIcon icon){
        img = icon;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
     
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        Scanner scanner = new GCLScanner();
        SyntaxHighlighter panel = new SyntaxHighlighter(100, 100, scanner, project);
        panel.setText("//Some GCL Code");
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
        if(panel!=null){
            String text = ((SyntaxHighlighter) panel).getText();
            if(text==null||!text.equals(""))
                return LangSupporter.activeLang.getEntry(222);
            return text;
        }
        else
            return LangSupporter.activeLang.getEntry(222);
    }
    
     
    public String generateGCL(JComponent panel){
        return ((SyntaxHighlighter) panel).getText();
    }
}
