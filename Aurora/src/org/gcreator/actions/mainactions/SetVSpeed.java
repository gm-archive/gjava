/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.ObjectStreamField;
import org.gcreator.actions.components.VSpeedEditor;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís, TGMG
 */
public class SetVSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    
    public String to="0",with="this";
    
    public static ImageIcon icon = new ImageIcon(SetVSpeed.class.getResource("/org/gcreator/actions/images/hspeed.png"));

//    private static final ObjectStreamField[] serialPersistentFields
//                 = {new ObjectStreamField(
//      "text", String.class)};

    public SetVSpeed() {
        super();  
    }

    @Override
    public void load(JComponent panel) {
        ((VSpeedEditor) panel).to.setText(to);
        ((VSpeedEditor) panel).of.setText(with);
        //System.out.println("TEXT LOADED AS:"+to);
    }

    @Override
    public void save(JComponent panel) {
        to = ((VSpeedEditor) panel).to.getText();
        with = ((VSpeedEditor) panel).of.getText();
        //System.out.println("text saved as:"+text);
    }
    
    
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public void setStandardImage(ImageIcon img){
        icon = img;
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
         return new VSpeedEditor();
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof VSpeedEditor){
            save(panel);
            VSpeedEditor editor = (VSpeedEditor) panel;
            String who = editor.of.getText();
            if(who==null)
                who = "null";
            String what = editor.to.getText();
            if(what==null)
                what = "null";
            return LangSupporter.activeLang.getEntry(226).replaceAll("\\$apply", who)
                    .replaceAll("\\$value", what)
                    .replaceAll("\\$\\$", "$");
        }
        return LangSupporter.activeLang.getEntry(225);
    }

    public String generateGCL(JComponent panel) {
        if(panel != null&& panel instanceof VSpeedEditor){
            VSpeedEditor editor = (VSpeedEditor) panel;
            save(panel);
            return "(" + editor.of.getText() + ").vspeed = " + editor.to.getText() + ";";
        }
        return "";
    }
}