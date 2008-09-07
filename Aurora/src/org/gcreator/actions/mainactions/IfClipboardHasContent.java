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
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import org.gcreator.actions.ActionPattern;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.units.Dictionary;

/**
 *
 * @author luis
 */
public class IfClipboardHasContent extends ActionPattern {

    static final long serialVersionUID = 1L;
    public boolean not = false;
    public static ImageIcon img = null;

    public IfClipboardHasContent() {
        super();
    }

    @Override
    public void save(JComponent panel) {
        Property[] ps = ((PropertyManager) panel).getProperties();
        for (Property p : ps) {
            if (p.getName().equals("not")) {
                not = (Boolean) p.getValue();
            }
        }
    }

    @Override
    public void load(JComponent panel) {
        Property[] ps = ((PropertyManager) panel).getProperties();
        for (Property p : ps) {
            if (p.getName().equals("not")) {
                p.setValue(not);
            }
        }
    }

    @Override
    public void setStandardImage(ImageIcon img) {
        IfClipboardHasContent.img = img;
    }

    @Override
    public ImageIcon getStandardImage() {
        return img;
    }

    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project, org.gcreator.fileclass.res.Resource r) {
        PropertyManager panel = new PropertyManager(project, r);

        DefaultProperty p = new DefaultProperty();
        p.setValue(false);
        p.setType(Boolean.TYPE);
        p.setCategory("<html><b>Main");
        p.setName("not");
        p.setDisplayName("NOT");
        p.setShortDescription("If clipboard has text(false) / If clipboard has <b>no</b> text(true)");
        panel.addProperty(p);

        return panel;
    }

    @Override
    public String getStandardText(JComponent panel) {
        if (panel != null) {
            save(panel);
        }
        if (not) {
            return Dictionary.getEntry("actions-ifclipboardtext-not");
        }
        return Dictionary.getEntry("actions-ifclipboardtext-text");
    }

    @Override
    public String generateGCL(JComponent panel) {
        save(panel);
        if (!not) {
            return "if(clipboard_has_text())\n";
        }
        return "if(!clipboard_has_text())\n";
    }
}
