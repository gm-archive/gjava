/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.ObjectStreamField;
import org.gcreator.actions.components.HSpeedEditor;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís, TGMG
 */
public class SetHSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    
    public String to="0",with="this";
    
    public static ImageIcon icon = new ImageIcon(SetHSpeed.class.getResource("/org/gcreator/actions/images/hspeed.png"));

//    private static final ObjectStreamField[] serialPersistentFields
//                 = {new ObjectStreamField(
//      "text", String.class)};

    public SetHSpeed() {
        super();  
    }

    @Override
    public void load(JComponent panel) {
        ((HSpeedEditor) panel).to.setText(to);
        ((HSpeedEditor) panel).of.setText(with);
        //System.out.println("TEXT LOADED AS:"+to);
    }

    @Override
    public void save(JComponent panel) {
        to = ((HSpeedEditor) panel).to.getText();
        with = ((HSpeedEditor) panel).of.getText();
        //System.out.println("text saved as:"+text);
    }
    
    
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public void setStandardImage(ImageIcon img){
        icon = img;
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
         return new HSpeedEditor();
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof HSpeedEditor){
            save(panel);
            HSpeedEditor editor = (HSpeedEditor) panel;
            String who = editor.of.getText();
            if(who==null)
                who = "null";
            String what = editor.to.getText();
            if(what==null)
                what = "null";
            return LangSupporter.activeLang.getEntry(224).replaceAll("\\$apply", who)
                    .replaceAll("\\$value", what)
                    .replaceAll("\\$\\$", "$");
        }
        return LangSupporter.activeLang.getEntry(223);
    }

    public String generateGCL(JComponent panel) {
        if(panel != null&& panel instanceof HSpeedEditor){
            HSpeedEditor editor = (HSpeedEditor) panel;
            save(panel);
            return "(" + editor.of.getText() + ").hspeed = " + editor.to.getText() + ";";
        }
        return "";
    }
}
