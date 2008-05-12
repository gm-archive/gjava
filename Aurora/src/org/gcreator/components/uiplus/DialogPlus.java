/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.uiplus;

import javax.swing.Icon;
import javax.swing.JDialog;

/**
 *
 * @author luis
 */
public class DialogPlus extends JDialog{
    public void setWindowMask(Icon mask){
        com.sun.jna.examples.WindowUtils.setWindowMask(this, mask);
    }
}
