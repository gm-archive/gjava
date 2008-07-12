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
import org.gcreator.actions.components.*;
import javax.swing.*;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class While extends ActionPattern{
    
    static final long serialVersionUID = 1L;
    
    public boolean not = false;
    public String condition = "";
    
    public static ImageIcon img = new ImageIcon(While.class.getResource("/org/gcreator/actions/images/While.png"));;
    
    public While(){
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
    
    public void setStandardImage(ImageIcon img){
        While.img = img;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
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
    
    public String getStandardText(JComponent panel){
        if(panel!=null)
            save(panel);
        if(panel==null)
            return "While";
        if(!not)
            return "while("+condition+")";
        return "while(!("+condition+"))";
    }
    
    public String generateGCL(JComponent panel){
        save(panel);
        if(!not)
            return "while("+condition+")\n";
        return "while(!("+condition+"))\n";
    }
}
