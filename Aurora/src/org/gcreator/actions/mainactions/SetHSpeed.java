/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.actions.components.HSpeedEditor;

/**
 *
 * @author Luís
 */
public class SetHSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();
    public String text;

    //ActorEditor context;

    public SetHSpeed() {
        super();
        //this.context = context;
        setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/hspeed.png")));
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action) {
         return new HSpeedEditor();
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof HSpeedEditor){
            HSpeedEditor editor = (HSpeedEditor) panel;
            return "Set the hspeed of " + editor.of.getText() + " to " + editor.to.getText();
        }
        return "Set Horizontal Speed";
    }

    public String generateEGML(JComponent panel) {
        if(panel != null&& panel instanceof HSpeedEditor){
            HSpeedEditor editor = (HSpeedEditor) panel;
            return editor.of.getText() + ".hspeed = " + editor.to.getText() + ";";
        }
        return "";
    }
}
