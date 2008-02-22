/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components.popupmenus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Luís Reis
 */
public class AutocompleteFrame extends JFrame{
    public AutocompleteFrame(){
        super();
        setUndecorated(true);
        addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent evt){}
            public void focusLost(FocusEvent evt){
                dispose();
            }
        });
        JPanel p = new JPanel() {

            public Image getBgImage() {
                Image background = null;
                try {
                    Robot rbt = new Robot();
                    Toolkit tk = Toolkit.getDefaultToolkit();
                    Dimension dim = tk.getScreenSize();
                    background = rbt.createScreenCapture(
                            new Rectangle(0, 0, (int) dim.getWidth(),
                            (int) dim.getHeight()));
                } catch (Exception ex) {}
                return background;
            }

            public void paint(Graphics g) {
                Point pos = this.getLocationOnScreen();
                Point offset = new Point(-pos.x, -pos.y);
                g.drawImage(getBgImage(), offset.x, offset.y, null);
                super.paintChildren(g);

            }
        };
        this.setContentPane(p);
    }
}
