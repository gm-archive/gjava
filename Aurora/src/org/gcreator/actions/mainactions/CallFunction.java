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
import org.gcreator.actions.components.ArgumentList;
import org.gcreator.actions.components.FunctionName;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Resource;

/**
 * Call Function action.
 * @author Luís Reis
 * @author TGMG
 */
public class CallFunction extends ActionPattern {

    static final long serialVersionUID = 1L;
    public String ret = "x";
    public FunctionName fname = new FunctionName();
    public Boolean relative = false;
    public ArgumentList args = new ArgumentList();
    public static ImageIcon icon = new ImageIcon(CallFunction.class.getResource("/org/gcreator/actions/images/function.png"));

    public CallFunction() {
        super();
    }

    @Override
    public void load(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("ret")) {
                p.setValue(ret);
            } else if (p.getName().equals("fname")) {
                p.setValue(fname);
            } else if (p.getName().equals("args")) {
                p.setValue(args);
            } else if (p.getName().equals("relative")) {
                p.setValue(relative);
            }
        }
    }

    @Override
    public void save(JComponent panel) {
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("ret")) {
                ret = (String) p.getValue();
            } else if (p.getName().equals("fname")) {
                fname = (FunctionName) p.getValue();
            } else if (p.getName().equals("args")) {
                args = (ArgumentList) p.getValue();
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
    public JComponent createNewPanel(org.gcreator.actions.Action action, 
            Project project, Resource r) {
        PropertyManager propertySheetPanel1 = new PropertyManager(project, r);

        DefaultProperty p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("ret");
        p.setDisplayName("Return");
        p.setEditable(true);
        p.setType(String.class);
        p.setValue("");
        p.setShortDescription("The variable to store the return value.<br>Leave empty for none");
        propertySheetPanel1.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("fname");
        p.setDisplayName("Function");
        p.setEditable(true);
        p.setType(FunctionName.class);
        p.setValue(fname);
        p.setShortDescription("The function to call");
        propertySheetPanel1.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("args");
        p.setDisplayName("Arguments");
        p.setEditable(true);
        p.setType(ArgumentList.class);
        p.setValue(args);
        p.setShortDescription("The arguments of the function");
        propertySheetPanel1.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("relative");
        p.setDisplayName("Relative?");
        p.setEditable(true);
        p.setType(Boolean.class);
        p.setValue(relative);
        p.setShortDescription("Should the result of the function be relative to previous value?");
        propertySheetPanel1.addProperty(p);
        return propertySheetPanel1;
    }

    @Override
    public String getStandardText(JComponent panel) {
        if (panel != null && panel instanceof PropertySheetPanel) {
            save(panel);
            return "Call $func".replaceAll("\\$func", fname.toString());
        }
        return "Call function";
    }

    @Override
    public String generateGCL(JComponent panel) {
        if (panel != null && panel instanceof PropertySheetPanel) {
            save(panel);
            String rel = "{", endrel = "}";
            if (this.relative) {
                rel += "argument_relative=true;";
                endrel = "argument_relative=false;}";
            }
            if (ret.equals("")) {
                return rel + " " + fname + "(" + args.toString() + ")}";
            } else {
                return rel + " " + ret + " = " + fname + "(" + args.toString() + ")" + endrel;
            }
        }
        return "";
    }
}
