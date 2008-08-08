/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.mainactions;

import com.l2fprod.common.propertysheet.DefaultProperty;
import com.l2fprod.common.propertysheet.Property;
import org.gcreator.actions.*;
import javax.swing.*;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.units.Dictionary;

/**
 *
 * @author luis
 */
public class If extends ActionPattern{
    
    static final long serialVersionUID = 1L;
    
    public boolean not = false;
    public String condition = "";
    
    public static ImageIcon img = new ImageIcon(If.class.getResource("/org/gcreator/actions/images/If.png"));;
    
    public If(){
        super();
    }
    
    @Override
    public void save(JComponent panel){
        Property[] ps = ((PropertyManager) panel).getProperties();
        for(Property p : ps){
            if(p.getName().equals("not"))
                not = (Boolean) p.getValue();
            if(p.getName().equals("condition"))
                condition = (String) p.getValue();
        }
    }
    
    @Override
    public void load(JComponent panel){
        Property[] ps = ((PropertyManager) panel).getProperties();
        for(Property p : ps){
            if(p.getName().equals("not"))
                p.setValue(not);
            if(p.getName().equals("condition"))
                p.setValue(condition);
        }
    }
    
    @Override
    public void setStandardImage(ImageIcon img){
        If.img = img;
    }
    
    @Override
    public ImageIcon getStandardImage(){
        return img;
    }
    
    @Override
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        PropertyManager panel = new PropertyManager();
        
        DefaultProperty p = new DefaultProperty();
        p.setValue(false);
        p.setType(Boolean.TYPE);
        p.setCategory("<html><b>Main");
        p.setName("not");
        p.setDisplayName("NOT");
        p.setShortDescription("True->If the condition is false<br>False->If the condition is true");
        panel.addProperty(p);
        
        p = new DefaultProperty();
        p.setValue("true");
        p.setType(String.class);
        p.setCategory("<html><b>Main");
        p.setName("condition");
        p.setDisplayName("condition");
        p.setShortDescription("The condition to evaluate");
        panel.addProperty(p);
        
        return panel;
    }
    
    @Override
    public String getStandardText(JComponent panel){
        if(panel!=null)
            save(panel);
        if(panel==null)
            return Dictionary.getEntry("actions-if-text");
        if(!not)
            return Dictionary.getEntry("actions-if-case").replaceAll("$condition", condition);
        return Dictionary.getEntry("actions-if-not").replaceAll("$condition", condition);
    }
    
    @Override
    public String generateGCL(JComponent panel){
        save(panel);
        if(!not)
            return "if("+condition+")\n";
        return "if(!("+condition+"))\n";
    }
}
