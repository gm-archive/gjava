/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;
import com.l2fprod.common.propertysheet.*;

/**
 *
 * @author Luís, TGMG
 */
public class SetVSpeed extends ActionPattern {
static final long serialVersionUID = 1L;
    
    public Double to = 0.0;
    public String with ="this";
    public Boolean relative = false;
    
    public static ImageIcon icon = new ImageIcon(SetVSpeed.class.getResource("/org/gcreator/actions/images/hspeed.png"));

//    private static final ObjectStreamField[] serialPersistentFields
//                 = {new ObjectStreamField(
//      "text", String.class)};

    public SetVSpeed() {
        super();  
    }

    @Override
    public void load(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for(int i = 0; i < plist.length; i++){
            Property p = plist[i];
            if(p.getName().equals("to"))
                p.setValue(to);
            else if(p.getName().equals("with"))
                p.setValue(with);
            else if(p.getName().equals("relative"))
                p.setValue(relative);
        }
        //System.out.println("TEXT LOADED AS:"+to);
    }

    @Override
    public void save(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for(int i = 0; i < plist.length; i++){
            Property p = plist[i];
            if(p.getName().equals("to"))
                to = (Double) p.getValue();
            else if(p.getName().equals("with"))
                with = (String) p.getValue();
            else if(p.getName().equals("relative"))
                relative = (Boolean) p.getValue();
        }
        //System.out.println("text saved as:"+text);
    }
    
    
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public void setStandardImage(ImageIcon img){
        icon = img;
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
         PropertySheetPanel propertySheetPanel1 = new PropertySheetPanel();
         propertySheetPanel1.setDescriptionVisible(true);
         propertySheetPanel1.setMode(PropertySheetPanel.VIEW_AS_CATEGORIES);
         
        DefaultProperty p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("with");
        p.setDisplayName("Apply To");
        p.setEditable(true);
        p.setType(String.class);
        p.setValue("this");
        p.setShortDescription("The actor that will modify its vertical speed.");
        propertySheetPanel1.addProperty(p);
        
        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("to");
        p.setDisplayName("Speed");
        p.setEditable(true);
        p.setType(Double.class);
        p.setValue(0.0);
        p.setShortDescription("The new vertical speed");
        propertySheetPanel1.addProperty(p);
        
        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("relative");
        p.setDisplayName("Relative");
        p.setEditable(true);
        p.setType(Boolean.class);
        p.setValue(false);
        p.setShortDescription("Is the new value absolute or relative to the old one.");
        propertySheetPanel1.addProperty(p);
         
        return propertySheetPanel1;
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof PropertySheetPanel){
            save(panel);
            PropertySheetPanel editor = (PropertySheetPanel) panel;
            String who = with;
            Double what = to;
            Property[] plist = ((PropertySheetPanel) panel).getProperties();
            return LangSupporter.activeLang.getEntry(226).replaceAll("\\$apply", who)
                    .replaceAll("\\$value", what.toString())
                    .replaceAll("\\$\\$", "$");
        }
        return LangSupporter.activeLang.getEntry(225);
    }

    public String generateGCL(JComponent panel) {
        if(panel != null&& panel instanceof PropertySheetPanel){
            PropertySheetPanel editor = (PropertySheetPanel) panel;
            save(panel);
            if(relative)
                return "(" + with + ").vspeed += " + to.toString() + ";";
            else
                return "(" + with + ").vspeed = " + to.toString() + ";";
        }
        return "";
    }
}