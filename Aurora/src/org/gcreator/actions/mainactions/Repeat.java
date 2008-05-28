/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import com.l2fprod.common.propertysheet.DefaultProperty;
import com.l2fprod.common.propertysheet.Property;
import org.gcreator.actions.*;
import org.gcreator.actions.components.*;
import javax.swing.*;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class Repeat extends ActionPattern{
    
    static final long serialVersionUID = 1L;
    
    public String times = "1";
    
    public static ImageIcon img = null;
    
    public Repeat(){
        super();
    }
    
    @Override
    public void save(JComponent panel){
        Property[] ps = ((PropertyManager) panel).getProperties();
        for(Property p : ps){
            if(p.getName().equals("times"))
                times = (String) p.getValue();
        }
    }
    
    @Override
    public void load(JComponent panel){
        Property[] ps = ((PropertyManager) panel).getProperties();
        for(Property p : ps){
            if(p.getName().equals("times"))
                p.setValue(times);
        }
    }
    
    public void setStandardImage(ImageIcon img){
        Repeat.img = img;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        PropertyManager panel = new PropertyManager();
        
        DefaultProperty p = new DefaultProperty();
        p.setValue("1");
        p.setType(String.class);
        p.setCategory("<html><b>Main");
        p.setName("times");
        p.setDisplayName("Times");
        p.setShortDescription("The number of times to execute.");
        panel.addProperty(p);
        
        return panel;
    }
    
    public String getStandardText(JComponent panel){
        if(panel!=null)
            save(panel);
        if(panel==null)
            return "Repeat";
        return "Repeat ("+times+") times";
    }
    
    public String generateGCL(JComponent panel){
        save(panel);
        return "repeat("+times+")\n";
    }
}
