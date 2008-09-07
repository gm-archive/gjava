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
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import org.gcreator.actions.ActionPattern;
import org.gcreator.actions.components.VariableName;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;

/**
 * Set Variable action.
 * @author Luís Reis
 * @author TGMG
 */
public class SetVariable extends ActionPattern {

    static final long serialVersionUID = 1L;
    public String to = "0.0";
    public VariableName var = new VariableName();
    public Boolean relative = false;
    public static ImageIcon icon =
            new ImageIcon(
            SetVariable.class.getResource("/org/gcreator/actions/images/Setvar.png"));

    public SetVariable() {
    }

    @Override
    public void save(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("to")) {
                p.setValue(to);
            } else if (p.getName().equals("var")) {
                p.setValue(var);
            } else if (p.getName().equals("relative")) {
                p.setValue(relative);
            }
        }
    }

    @Override
    public void load(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("to")) {
                to = (String) p.getValue();
            } else if (p.getName().equals("var")) {
                var = (VariableName) p.getValue();
            } else if (p.getName().equals("relative")) {
                relative = (Boolean) p.getValue();
            }
        }
    }

    @Override
    public ImageIcon getStandardImage() {
        return icon;
    }

    @Override
    public void setStandardImage(ImageIcon img) {
        icon = img;
    }

    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project, org.gcreator.fileclass.res.Resource r) {
        PropertyManager propertySheetPanel1 = new PropertyManager(project, r);

        DefaultProperty p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("var");
        p.setDisplayName("Variable");
        p.setEditable(true);
        p.setType(VariableName.class);
        p.setValue(var);
        p.setShortDescription("The variable to modify");
        propertySheetPanel1.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("to");
        p.setDisplayName("Value");
        p.setEditable(true);
        p.setType(String.class);
        p.setValue(to);
        p.setShortDescription("The value expression");
        propertySheetPanel1.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("relative");
        p.setDisplayName("Relative");
        p.setEditable(true);
        p.setType(Boolean.class);
        p.setValue(relative);
        p.setShortDescription("Is the new value absolute or relative to the old one.");
        propertySheetPanel1.addProperty(p);

        return propertySheetPanel1;
    }

    @Override
    public String getStandardText(JComponent panel) {
        if (panel != null && panel instanceof PropertySheetPanel) {
            save(panel);
            String who = var.toString();
            String what = to;
            return "Set $apply to $value".replaceAll("\\$apply", who).
                    replaceAll("\\$value", what).replaceAll("\\$\\$", "$");
        }
        return "Set variable";
    }

    @Override
    public String generateGCL(JComponent panel) {
        if (panel != null && panel instanceof PropertySheetPanel) {
            PropertySheetPanel editor = (PropertySheetPanel) panel;
            save(panel);
            if (relative) {
                return var + " += (" + to + ");";
            } else {
                return var + " = (" + to + ");";
            }
        }
        return "";
    }
}
