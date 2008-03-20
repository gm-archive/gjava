/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ResourceChooser extends JComponent{
    private FileLabel label;
    public ResourceChooser(){
        label = new FileLabel();
        
        label.setVisible(true);
        
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }
}
