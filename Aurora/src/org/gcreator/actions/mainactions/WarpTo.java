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
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import org.gcreator.actions.*;
import javax.swing.*;
import org.gcreator.fileclass.Project;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class WarpTo extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();

    public String who = "";
    public Double to_x = 0.0;
    public Double to_y = 0.0;//, to_x = "", to_y = "";
    
    public static ImageIcon icon = new ImageIcon(WarpTo.class.getResource("/org/gcreator/actions/images/warp.png"));

    //ActorEditor context;

    public WarpTo() {
        super();
        //this.context = context;
    }
    
    @Override
    public void save(JComponent panel){
        //who = ((WarpToEditor) panel).of.getText();
        //to_x = ((WarpToEditor) panel).X.getText();
        //to_y = ((WarpToEditor) panel).Y.getText();
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for(int i = 0; i < plist.length; i++){
            Property p = plist[i];
            if(p.getName().equals("to_x"))
                to_x = (Double) p.getValue();
            else if(p.getName().equals("who"))
                who = (String) p.getValue();
            else if(p.getName().equals("to_y"))
                to_y = (Double) p.getValue();
        }
    }
    
    @Override
    public void load(JComponent panel){
        //((WarpToEditor) panel).of.setText(who);
        //((WarpToEditor) panel).X.setText(to_x);
        //((WarpToEditor) panel).Y.setText(to_y);
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for(int i = 0; i < plist.length; i++){
            Property p = plist[i];
            if(p.getName().equals("who"))
                p.setValue(who);
            else if(p.getName().equals("to_x"))
                p.setValue(to_x);
            else if(p.getName().equals("to_y"))
                p.setValue(to_y);
        }
    }
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public void setStandardImage(ImageIcon img){
        icon = img;
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
         //return new WarpToEditor();
        PropertySheetPanel propertySheetPanel1 = new PropertySheetPanel();
         propertySheetPanel1.setDescriptionVisible(true);
         propertySheetPanel1.setMode(PropertySheetPanel.VIEW_AS_CATEGORIES);
         
        DefaultProperty p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("who");
        p.setDisplayName("Apply To");
        p.setEditable(true);
        p.setType(String.class);
        p.setValue("this");
        p.setShortDescription("The actor that will modify its horizontal speed.");
        propertySheetPanel1.addProperty(p);
        
        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("to_x");
        p.setDisplayName("X");
        p.setEditable(true);
        p.setType(Double.class);
        p.setValue(0.0);
        p.setShortDescription("The new x");
        propertySheetPanel1.addProperty(p);
        
        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("to_y");
        p.setDisplayName("Y");
        p.setEditable(true);
        p.setType(Double.class);
        p.setValue(0.0);
        p.setShortDescription("The new y");
        propertySheetPanel1.addProperty(p);
         
        return propertySheetPanel1;
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof PropertySheetPanel){
            save(panel);
            PropertySheetPanel editor = (PropertySheetPanel) panel;
            Property[] plist = ((PropertySheetPanel) panel).getProperties();
            return Dictionary.getEntry("actions-warp-expanded").replaceAll("\\$apply", who)
                    .replaceAll("\\$x", to_x.toString())
                    .replaceAll("\\$y", to_y.toString())
                    .replaceAll("\\$\\$", "$");
        }
        return Dictionary.getEntry("actions-warp-text");
    }

    public String generateGCL(JComponent panel) {
        if(panel != null&& panel instanceof PropertySheetPanel){
            save(panel);
            String s = "";
            s += "(" + who + ").setX(" + to_x.toString() + ");\n";
            s += "(" + who + ").setY(" + to_y.toString() + ");\n";
            return s;
        }
        return "";
    }
}