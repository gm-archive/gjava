/*
 * StartOfABlock.java
 *
 * Created on 26/Set/2007, 16:44:23
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.actions.mainactions;

import org.gcreator.actions.components.PlainTextPanel;
import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 * The comment action
 */
public class Comment extends ActionPattern {

    static final long serialVersionUID = 1L;
    
    public String text = "";
    public static ImageIcon img = new ImageIcon(Comment.class.getResource("/org/gcreator/actions/images/comment.png"));

    public Comment() {
        super();
        //this.context = context;
    }
    
    public void setStandardImage(ImageIcon img){
        Comment.img = img;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
    @Override
    public void save(JComponent panel){
        text = ((PlainTextPanel) panel).text.getText();
    }
    
    @Override
    public void load(JComponent panel){
        ((PlainTextPanel) panel).text.setText(text);
    }
    
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
        PlainTextPanel panel = new PlainTextPanel();
        panel.text.setText(text);
        return panel; // new PlainTextPanel();
    }

    public String getStandardText(JComponent panel) {

        if (panel != null) {
            save(panel);
            text = ((PlainTextPanel) panel).text.getText();
            if(text!=null&&!text.equals(""))
                return text;
            return LangSupporter.activeLang.getEntry(221);
        } else {
            return LangSupporter.activeLang.getEntry(221);
        }
    }

    public String generateGCL(JComponent panel) {
        save(panel);
        return ""; //It could generate a comment, but why should it?
    }
}
