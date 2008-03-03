/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.actions.components.HSpeedEditor;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class SetHSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();
    public String text;
    
    public static ImageIcon icon = new ImageIcon(SetHSpeed.class.getResource("/org/gcreator/actions/images/hspeed.png"));

    //ActorEditor context;

    public SetHSpeed() {
        super();
        //this.context = context;
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
            return "(" + editor.of.getText() + ").hspeed = (" + editor.to.getText() + ");";
        }
        return "";
    }
}
