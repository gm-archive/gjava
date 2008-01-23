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
public class ExtendedToolButton extends JButton implements MouseListener{
    public void mouseExited(MouseEvent evt){
        gcreator.window.statusbar.restoreText();
    }
    public void mouseEntered(MouseEvent evt){
        gcreator.window.statusbar.setText(getToolTipText());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    public ExtendedToolButton(){
        addMouseListener(this);
    }
    private boolean bold = false;
    public boolean isBold(){
        return bold;
    }
    public void setBold(boolean bold){
        this.bold = bold;
        updateUI();
    }
    public String getText(){
        return (bold ? "<HTML><B>" : "") + super.getText();
    }
}
