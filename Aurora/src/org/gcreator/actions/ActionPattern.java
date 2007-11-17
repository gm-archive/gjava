/*
 * Action.java
 * 
 * Created on 26/Set/2007, 15:58:46
 * 
 * An ActionPattern owns NO VALUES.
 */

package org.gcreator.actions;

import org.gcreator.editors.ActorEditor;
import org.gcreator.editors.*;
import javax.swing.*;
import java.awt.*;
import java.io.ObjectStreamField;
import java.io.Serializable;

/**
 *
 * @author Luís
 */
public abstract class ActionPattern implements Serializable {
    static final long serialVersionUID = 1L;
   
    private static final ObjectStreamField[] serialPersistentFields
                 = {};
    
    public ActionPattern(){
        //icon = new ImageIcon();
      //  icon  = new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png"));
   
        //setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Blank_action.png")));
    }
    
    public JComponent createNewPanel(Action action){
        return new JPanel();
    }
    
    public abstract void setStandardImage(ImageIcon icon);
    
    public abstract ImageIcon getStandardImage();
    
    public String getStandardText(JComponent panel){
        return "";
    }
    
    public abstract String generateEGML(JComponent panel);
    
    public Color getBackground(){
        return Color.WHITE;
    }
    
    public Color getSelectedBackground(){
        return Color.BLUE;
    }
    
    public Color getForeground(){
        return Color.BLACK;
    }
    
    public Color getSelectedForeground(){
        return Color.WHITE;
    }
    
    public String writeXml(JComponent panel){
        return "";
    }
    
    public void setLayout(Object o)
    {
        
    }
}
