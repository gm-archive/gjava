/*
 * ExtendedFrame.java
 * 
 * Created on 3/Set/2007, 15:15:57
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ExtendedFrame extends JInternalFrame{
    private TabPanel pane = null;
            
    public void setPanel(TabPanel pane){
        this.pane = pane;
    }
    
    public TabPanel getPanel(){
        return pane;
    }
    
    @Override
    public void dispose(){
        if(pane!=null)
            pane.dispose();
    }
}
