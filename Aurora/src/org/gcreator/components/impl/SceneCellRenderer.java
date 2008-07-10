/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.awt.*;
import javax.swing.*;
import org.gcreator.editors.*;
import org.gcreator.fileclass.res.*;

public class SceneCellRenderer extends JLabel implements ListCellRenderer {

    public SceneCellRenderer() {
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList list,
            Object value,
            int i,
            boolean selected,
            boolean focus) {
        ImageIcon icon = null;
        String val = value.toString();

        boolean invalid = false;
        if (!(value instanceof org.gcreator.fileclass.GFile)) {
            invalid = true;
            val = "Invalid scene";
            if (selected) {
                setForeground(Color.YELLOW);
            } else {
                setForeground(Color.RED);
            }
        } else {
            Object o = ((org.gcreator.fileclass.GFile) value).value;
            if (!(o instanceof Scene)) {
                invalid = true;
                val = "Invalid scene";
                setForeground(Color.RED);
            } else {
                val = ((org.gcreator.fileclass.GFile) value).name;
            }
        }

        if (selected&&!invalid) {
            try {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } catch (Exception e) {
                setBackground(Color.BLUE);
                setForeground(Color.WHITE);
            }
        } else {
            try {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            } catch (Exception e) {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
            }
        }

        setText(val);
        setIcon(icon);

        return this;
    }
}
