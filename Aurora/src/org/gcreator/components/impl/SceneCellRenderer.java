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
        Color col = Color.BLACK;
        if (selected) {
            try {
                setBackground(list.getSelectionForeground());
            } catch (Exception e) {
                setBackground(Color.WHITE);
            }
        }

        if (!(value instanceof org.gcreator.fileclass.File)) {
            val = "Invalid scene";
            if (selected) {
                col = Color.YELLOW;
            } else {
                col = Color.RED;
            }
        } else {
            Object o = ((org.gcreator.fileclass.File) value).value;
            if (!(o instanceof Scene)) {
                val = "Invalid scene";
                col = Color.RED;
            } else {
                val = ((Scene) ((org.gcreator.fileclass.File) value).value).name;
            }
        }

        if (selected) {
            try {
                setBackground(list.getSelectionBackground());
            } catch (Exception e) {
                setBackground(Color.BLUE);
            }
        } else {
            setBackground(Color.WHITE);
        }

        setForeground(col);
        setText(val);
        setIcon(icon);

        return this;
    }
}
