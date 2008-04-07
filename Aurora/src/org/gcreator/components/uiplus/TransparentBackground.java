/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.components.uiplus;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class TransparentBackground extends JComponent {

    private Image background = null;

    public TransparentBackground() {
        updateBackground();
    }

    public void updateBackground() {
        try {
            Robot rbt = new Robot();
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            background = rbt.createScreenCapture(new Rectangle(0, 0, (int) dim.getWidth(),
                    (int) dim.getHeight()));
        } catch (Throwable ex) {
            ex.printStackTrace();
            System.gc();
        }
    }

    public void paint(Graphics g) {
        Point pos = getLocationOnScreen();
        g.drawImage(background, -pos.x, -pos.y, null);
    }
}
