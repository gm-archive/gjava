/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.mainactions;

import org.gcreator.actions.components.PlainTextPanel;
import org.gcreator.actions.*;
import javax.swing.*;
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
    
    @Override
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
    
    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
        PlainTextPanel panel = new PlainTextPanel();
        panel.text.setText(text);
        return panel; // new PlainTextPanel();
    }

    @Override
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

    @Override
    public String generateGCL(JComponent panel) {
        save(panel);
        return ""; //It could generate a comment, but why should it?
    }
}
