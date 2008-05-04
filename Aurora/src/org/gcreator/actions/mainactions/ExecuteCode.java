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

import org.gcreator.components.scanning.GScriptScanner;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;
import publicdomain.*;

/**
 *
 * @author Luís
 */
public class ExecuteCode extends ActionPattern{
    static final long serialVersionUID = 1L;
    //ActorEditor context;
    public String code="//Some GCL Code";
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
    
    @Override
    public void save(JComponent panel){
        code = ((SyntaxHighlighter) panel).getText();
    }
    
    @Override
    public void load(JComponent panel){
        ((SyntaxHighlighter) panel).setText(code);
    }
     
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        Scanner scanner = new GScriptScanner();
        SyntaxHighlighter panel = new SyntaxHighlighter(100, 100, scanner, project);
        panel.setText(code);
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
            save(panel);
            code = ((SyntaxHighlighter) panel).getText();
            if(code==null||!code.equals(""))
                return LangSupporter.activeLang.getEntry(222);
            return code;
        }
        else
            return LangSupporter.activeLang.getEntry(222);
    }
    
     
    public String generateGCL(JComponent panel){
        save(panel);
        code = ((SyntaxHighlighter) panel).getText();
        return code;
    }
}
