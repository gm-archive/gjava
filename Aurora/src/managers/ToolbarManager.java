/*
 * ToolbarManager.java
 * 
 * Created on 4/Set/2007, 21:24:34
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managers;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ToolbarManager {
    public static JButton addButton(ImageIcon icon, int label){
        JButton button = new JButton();
        button.setToolTipText(LangSupporter.activeLang.getEntry(label));
        button.setIcon(icon);
        return button;
    }
}
