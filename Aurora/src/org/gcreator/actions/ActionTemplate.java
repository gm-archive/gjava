/*
 * ActionTemplate.java
 * 
 * Created on 06-Sep-2007, 02:46:39
 * 
 * This will be the class that all actions must extend
 */

package org.gcreator.actions;

import javax.swing.*;

/**
 * All Actions must extend this class
 * @author TGMG
 */
public class ActionTemplate extends JPanel {
    JFrame frame;
    String xml;
    
    public ActionTemplate(String title)
    {
        frame = new JFrame(title);
        frame.add(this);
        initComponents();
        setVisible(true);
    }
    
    //show action window to edit it
    @Override
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }
    
   private void initComponents()
    {
        
    }
    
    @Override
    public String getName()
    {
        return "";
    }
    
    public String getCategory()
    {
        return "";
    }
    
    public ImageIcon getImage()
    {
        return null;
    }

    public String getTooltip()
    {
        return "";
    }
    
    //write xml to actor
    public void writeXml()
    {
        
    }
}
