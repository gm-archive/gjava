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
import javax.swing.*;
import java.awt.event.*;

/**
 * The comment action
 */
public class Comment extends ActionPattern {

    static final long serialVersionUID = 1L;
    
    public String text;
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
    
    public JComponent createNewPanel(org.gcreator.actions.Action action) {
        PlainTextPanel panel = new PlainTextPanel();
        panel.text.setText(text);
        return panel; // new PlainTextPanel();
    }

    public String getStandardText(JComponent panel) {

        if (panel != null) {
            text = ((PlainTextPanel) panel).text.getText();
            return text;
        } else {
            return "Comment";
        }
    }

    public String generateGCL(JComponent panel) {
        return ""; //It could generate a comment, but why should it?
    }
}
