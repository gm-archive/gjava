/*
 * Action.java
 * 
 * Created on 26/Set/2007, 16:23:37
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import org.gcreator.editors.ActorEditor;
import javax.swing.*;
import java.awt.*;
import org.gcreator.editors.*;

/**
 *
 * @author Luís
 */
public class Action {
    public ActionPattern pattern;
    private JComponent panel;
    
    public Action(ActorEditor editor){
        this(editor, null);
    }
    
    public Action(ActorEditor editor, ActionPattern pattern){
        this.pattern = pattern;
        if(pattern!=null)
            panel = pattern.createNewPanel(this);
    }
    
    public ImageIcon getImage(){
        return pattern.getStandardImage();
    }
    
    public String getLabel(){
        return pattern.getStandardText(getPanel());
    }
    
    public void setPanel(JPanel panel){
        this.panel = panel;
    }
    
    public JComponent getPanel(){
        return panel;
    }
    
    public String getEGML(){
        return pattern.generateEGML(getPanel());
    }
    
    public Color getBackground(){
        return pattern.getBackground();
    }
    
    public Color getForeground(){
        return pattern.getForeground();
    }
    
    public Color getSelectedBackground(){
        return pattern.getSelectedBackground();
    }
    
    public Color getSelectedForeground(){
        return pattern.getSelectedForeground();
    }
    
    public String writeXml(){
        String xml = "<action>\n";
        xml += "<type>";
        xml += pattern.getClass().getName();
        xml += "</type>";
        xml += pattern.writeXml(panel);
        xml += "</action>\n";
        return xml;
    }
}
