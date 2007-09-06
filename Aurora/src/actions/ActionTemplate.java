/*
 * ActionTemplate.java
 * 
 * Created on 06-Sep-2007, 02:46:39
 * 
 * This will be the class that all actions must extend
 */

package actions;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        show();
    }
    
    //show action window to edit it
    public void show()
    {
        frame.setVisible(true);
    }
    
   private void initComponents()
    {
        
    }
    
    public String getName()
    {
        return "";
    }
    
    public String getCategory()
    {
        return "";
    }
    
    public Image getImage()
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
