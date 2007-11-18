/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ActionCategory {
    public Vector patterns = new Vector();
    public String name = "";
    public ImageIcon icon = null;
    public Color selectedForeground = Color.WHITE;
    public Color foreground = Color.BLACK;
    public Color selectedBackground = Color.BLUE;
    public Color background = Color.WHITE;
    
    public void add(ActionPattern pattern){
        patterns.add(pattern);
    }
}
