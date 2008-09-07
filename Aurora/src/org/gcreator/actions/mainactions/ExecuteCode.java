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

import org.gcreator.actions.*;
import javax.swing.*;

import org.gcreator.components.codeeditor.ColorCodedTextArea;
import org.gcreator.fileclass.Project;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class ExecuteCode extends ActionPattern {

    static final long serialVersionUID = 1L;
    //ActorEditor context;
    public String code = "//Some GCL Code";
    public static ImageIcon img = new ImageIcon(ExecuteCode.class.getResource("/org/gcreator/actions/images/Execute_Code.png"));

    public ExecuteCode() {
        super();
    //this.context = context;
    }

    public ExecuteCode(String c) {
        super();
        code = c;
    //this.context = context;
    }

    public void setCode(String code) {
    //((SyntaxHighlighter) panel).setText(code);
    }

    @Override
    public void setStandardImage(ImageIcon icon) {
        img = icon;
    }

    @Override
    public ImageIcon getStandardImage() {
        return img;
    }

    @Override
    public void save(JComponent panel) {
        code = ((ColorCodedTextArea) ((JScrollPane) panel).getViewport().getView()).getText();
    }

    @Override
    public void load(JComponent panel) {
        ((ColorCodedTextArea) ((JScrollPane) panel).getViewport().getView()).setText(code);
    }

    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project, org.gcreator.fileclass.res.Resource r) {
        ColorCodedTextArea panel = new ColorCodedTextArea(project);
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
        return new JScrollPane(panel);
    }

    @Override
    public String getStandardText(JComponent panel) {
        if (panel != null) {
            save(panel);
            code = ((ColorCodedTextArea) ((JScrollPane) panel).getViewport().getView()).getText();
            if (code == null || !code.equals("")) {
                return Dictionary.getEntry("actions-execute-text");
            }
            return code;
        } else {
            return Dictionary.getEntry("actions-execute-text");
        }
    }

    @Override
    public String generateGCL(JComponent panel) {
        save(panel);
        code = ((ColorCodedTextArea) ((JScrollPane) panel).getViewport().getView()).getText();
        return code;
    }
}
