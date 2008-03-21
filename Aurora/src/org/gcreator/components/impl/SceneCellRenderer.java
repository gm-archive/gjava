/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
                val = ((Scene) ((org.gcreator.fileclass.GFile) value).value).name;
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
