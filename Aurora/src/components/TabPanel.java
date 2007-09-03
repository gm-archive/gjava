/*
 * TabPanel.java
 * 
 * Created on 24/Ago/2007, 17:37:01
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import core.Aurwindow;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class TabPanel extends JPanel{
    public Aurwindow parent;
    public ExtendedFrame frame;
    public String title;
    
    public void dispose(){
        parent.remove(this, frame);
    }
}
