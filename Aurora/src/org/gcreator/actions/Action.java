/*
 * Action.java
 * 
 * Created on 26/Set/2007, 16:23:37
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions;

//import org.gcreator.editors.ActorEditor;
import javax.swing.*;
import java.awt.*;
import java.io.ObjectStreamField;
import java.io.Serializable;
//import org.gcreator.editors.*;
import java.util.Vector;
import org.gcreator.editors.*;

/**
 *
 * @author Luís
 */
public class Action implements Serializable {
    
    static final long serialVersionUID = 1L;
    
    public ActionPattern pattern;
    private JComponent panel;
    
    private static final ObjectStreamField[] serialPersistentFields
                 = {new ObjectStreamField("pattern", ActionPattern.class)};
    
//    public Action(ActorEditor editor){
//        this(editor, null);
//    }
//    
    
    public Action (ActionPattern pattern){
        this.pattern = pattern;
        if(pattern!=null)
            panel = pattern.createNewPanel(this);
    }
        
    public Action(ActorEditor editor, ActionPattern pattern){
        this.pattern = pattern;
        if(pattern!=null)
            panel = pattern.createNewPanel(this);
    }
    
    public Action(TimelineEditor editor, ActionPattern pattern){
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
        if (panel == null)
        {
           
           panel= pattern.createNewPanel(this);
        }
        return panel;
    }
    
    public String getEGML(){
        return pattern.generateGCL(getPanel());
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
    
    public Action clone(){
        Action a = new Action(pattern);
        return a;//pattern.clone(panel);
    }
    
    public boolean indents(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return pattern.indents(panel, indented, unindented, list, selected);
    }
    
    public boolean unindents(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return pattern.unindents(panel, indented, unindented, list, selected);
    }
    
    public boolean indentsNext(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return pattern.indentsNext(panel, indented, unindented, list, selected);
    }
    
    public boolean unindentsNext(Vector<Action> indented, Vector<Action> unindented, JList list, boolean selected){
        return pattern.unindentsNext(panel, indented, unindented, list, selected);
    }
}
