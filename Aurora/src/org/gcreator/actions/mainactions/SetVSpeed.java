/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.actions.components.VSpeedEditor;

/**
 *
 * @author Luís
 */
public class SetVSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();
    public String text;

    //ActorEditor context;

    public SetVSpeed() {
        super();
        //this.context = context;
        setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/vspeed.png")));
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action) {
         return new VSpeedEditor();
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof VSpeedEditor){
            VSpeedEditor editor = (VSpeedEditor) panel;
            return "Set the vspeed of " + editor.of.getText() + " to " + editor.to.getText();
        }
        return "Set Vertical Speed";
    }

    public String generateEGML(JComponent panel) {
        if(panel != null&& panel instanceof VSpeedEditor){
            VSpeedEditor editor = (VSpeedEditor) panel;
            return editor.of.getText() + ".vspeed = " + editor.to.getText() + ";";
        }
        return "";
    }
}
