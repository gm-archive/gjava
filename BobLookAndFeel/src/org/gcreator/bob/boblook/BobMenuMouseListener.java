/*
 * @(#)BobMenuMouseListener.java	1.10 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.gcreator.bob.boblook;

import java.awt.event.*;
import javax.swing.MenuSelectionManager;

/**
 * A default MouseListener for menu elements
 *
 * @version 1.10 11/17/05
 * @author Arnaud Weber
 */
public class BobMenuMouseListener extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        MenuSelectionManager.defaultManager().processMouseEvent(e);
    }
    public void mouseReleased(MouseEvent e) {
        MenuSelectionManager.defaultManager().processMouseEvent(e);
    }
    public void mouseEntered(MouseEvent e) {
        MenuSelectionManager.defaultManager().processMouseEvent(e);
    }
    public void mouseExited(MouseEvent e) {
        MenuSelectionManager.defaultManager().processMouseEvent(e);
    }
}
