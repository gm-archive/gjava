

package org.gcreator.gui;

import javax.swing.JFrame;

/**
 * G-Creator's main window.
 * This is to be kept very simple, as modules will
 * handle the content of this frame.
 * 
 * @author Serge Humphrey
 */
public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1;

    public void initialize() {
        setSize(320, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }
}
