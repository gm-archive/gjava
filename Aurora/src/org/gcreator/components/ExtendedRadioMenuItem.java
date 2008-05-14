/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.event.*;
import javax.swing.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís Reis
 */
public class ExtendedRadioMenuItem extends JRadioButtonMenuItem implements MouseListener{
    public void mouseExited(MouseEvent evt){
        gcreator.panel.statusbar.restoreText();
    }
    public void mouseEntered(MouseEvent evt){
        gcreator.panel.statusbar.setText(getToolTipText());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    public ExtendedRadioMenuItem(String text){
        super(text);
        addMouseListener(this);
    }
}
