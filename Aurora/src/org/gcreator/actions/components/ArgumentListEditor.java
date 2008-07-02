/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.beans.PropertyEditorSupport;
import javax.swing.JPanel;

/**
 *
 * @author Luís
 */
public class ArgumentListEditor extends PropertyEditorSupport{
    @Override
    public String getAsText(){
        return ((FailureBehavior) getValue()).toString();
    }
    
    @Override
    public Component getCustomEditor(){
        JPanel p = new JPanel();
        
        ArgumentList value = (ArgumentList) getValue();
        
        p.setLayout(new BorderLayout());
        p.add(BorderLayout.CENTER, new ArgumentListLabel(value));
        p.add(BorderLayout.EAST, new ArgumentListButton(value));
        
        return p;
    }
    
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
}
