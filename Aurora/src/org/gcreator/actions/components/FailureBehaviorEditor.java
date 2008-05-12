/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.components;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditorSupport;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class FailureBehaviorEditor extends PropertyEditorSupport{
    JComboBox c = new JComboBox();
    
    public String getAsText(){
        return ((FailureBehavior) getValue()).toString();
    }
    
    public Component getCustomEditor(){
        c.setModel(new DefaultComboBoxModel(retrieveComboModel()));
        FailureBehavior f = (FailureBehavior) getValue();
        if(f!=null)
            c.setSelectedIndex(f.status);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                setValue(new FailureBehavior(c.getSelectedIndex()));
                firePropertyChange();
            }
        });
        return c;
    }
    
    public boolean supportsCustomEditor(){
        return true;
    }
    
    public static String[] retrieveComboModel(){
        return new String[]{
            LangSupporter.activeLang.getEntry(237),
            LangSupporter.activeLang.getEntry(238),
            LangSupporter.activeLang.getEntry(239)
        };
    }
}
