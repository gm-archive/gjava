/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.components.TokenMarker;
import org.gcreator.components.JEditTextArea;
import org.gcreator.actions.*;
import javax.swing.*;

import org.gcreator.components.scanning.GScriptTokenMarker;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

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
    
    public ExecuteCode(String c){
        super();
        code=c;
        //this.context = context;
    }
    
    public void  setCode(String code){
        //((SyntaxHighlighter) panel).setText(code);
    }
    
    @Override
    public void setStandardImage(ImageIcon icon){
        img = icon;
    }
    
    @Override
    public ImageIcon getStandardImage(){
        return img;
    }
    
    @Override
    public void save(JComponent panel){
        code = ((JEditTextArea) panel).getText();
    }
    
    @Override
    public void load(JComponent panel){
        ((JEditTextArea) panel).setText(code);
    }
     
    @Override
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        TokenMarker scanner = new GScriptTokenMarker();
        JEditTextArea panel = new JEditTextArea(project); //100, 100, scanner, project);
        panel.setTokenMarker(scanner);
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
    
     
    @Override
    public String getStandardText(JComponent panel){
        if(panel!=null){
            save(panel);
            code = ((JEditTextArea) panel).getText();
            if(code==null||!code.equals(""))
                return LangSupporter.activeLang.getEntry(222);
            return code;
        }
        else
            return LangSupporter.activeLang.getEntry(222);
    }
    
     
    @Override
    public String generateGCL(JComponent panel){
        save(panel);
        code = ((JEditTextArea) panel).getText();
        return code;
    }
}
