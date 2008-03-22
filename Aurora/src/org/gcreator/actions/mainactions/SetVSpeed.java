/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.actions.components.VSpeedEditor;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class SetVSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();
    public String text;
    public static ImageIcon icon = new ImageIcon(SetVSpeed.class.getResource("/org/gcreator/actions/images/vspeed.png"));

    //ActorEditor context;

    public SetVSpeed() {
        super();
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
            return "(" + editor.of.getText() + ").setVspeed(" + editor.to.getText() + ");";
        }
        return "";
    }
}
