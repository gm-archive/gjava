/*
 * RoomEditor.java
 *
 * Created on 23 February 2007, 22:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.JGM.roomeditor;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 *
 * @author ali1
 */
public class RoomEditor extends JComponent implements MouseListener, MouseMotionListener {
    
    
    /** Creates a new instance of RoomEditor */
    public RoomEditor() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.DARK_GRAY );
    }
    
    public void mouseClicked(MouseEvent e) {
    }
    
    public void mousePressed(MouseEvent e) {
    }
    
    public void mouseReleased(MouseEvent e) {
    }
    
    public void mouseEntered(MouseEvent e) {
    }
    
    public void mouseExited(MouseEvent e) {
    }
    
    public void mouseDragged(MouseEvent e) {
    }
    
    public void mouseMoved(MouseEvent e) {
    }
    
}
