/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.fileclass.*;
import org.gcreator.units.*;

/**
 *
 * @author Luís
 */
public class ResourceChooser extends JComponent{
    private FileLabel label;
    public ResourceChooser(Project p, String key){
        label = new FileLabel(p, key);
        
        label.setVisible(true);
        
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }
    
    public void setFile(GFile file){
        label.setFile(file);
    }
    
    public GFile getFile(){
        return label.getFile();
    }
    
    public void addActionListener(ActionListener a){
        label.addActionListener(a);
    }
    
    /**
     * @deprecated use getFile instead
     */
    public ObjectNode getCurrentObject(){
        GFile f = getFile();
        if(f==null)
            return null;
        return f.node;
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(120, 30);
    }
}
