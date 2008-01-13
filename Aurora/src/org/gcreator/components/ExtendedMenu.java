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
public class ExtendedMenu extends JMenu implements MouseListener{
    private int lx = -1;
    private int ly = -1;
    public void mouseExited(MouseEvent evt){
        gcreator.window.statusbar.restoreText();
    }
    public void mouseEntered(MouseEvent evt){
        gcreator.window.statusbar.setText(getToolTipText());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    
    public ExtendedMenu(String text){
        super(text);
        addMouseListener(this);
    }
}
