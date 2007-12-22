/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import javax.swing.*;
import org.gcreator.components.impl.*;

/**
 *
 * @author luis
 */
public class ToolbarPreviewer extends JPanel{
    public Toolbar toolbar;
    public int selected = -1; //None
    public ToolbarPreviewer(){}
    public Dimension getPreferredSize(){
        return new Dimension(100,100);
    }
}
