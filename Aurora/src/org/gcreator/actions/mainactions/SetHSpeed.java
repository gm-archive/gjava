/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import java.awt.event.*;

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
         return null;
    }

    public String getStandardText(JComponent panel) {
        return "Set Horizontal Speed";
    }

    public String generateEGML(JComponent panel) {
        return "";
    }
}
