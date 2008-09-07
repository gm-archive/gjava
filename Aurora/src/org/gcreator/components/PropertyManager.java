/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertyEditorFactory;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.Hashtable;
import org.gcreator.actions.components.ArgumentList;
import org.gcreator.actions.components.ArgumentListEditor;
import org.gcreator.actions.components.FunctionName;
import org.gcreator.actions.components.FunctionNameEditor;
import org.gcreator.actions.components.VariableName;
import org.gcreator.actions.components.VariableNameEditor;
import org.gcreator.fileclass.Project;

/**
 *
 * @author luis
 */
public class PropertyManager extends PropertySheetPanel {

    private static final long serialVersionUID = 1;
    public Hashtable<Class, PropertyEditorSupport> editors = new Hashtable<Class, PropertyEditorSupport>();
    protected Project project;

    public PropertyManager(Project p, org.gcreator.fileclass.res.Resource r) {
        super();
        this.project = p;
        editors.put(FunctionName.class, new FunctionNameEditor(p));
        editors.put(VariableName.class, new VariableNameEditor(r));
        editors.put(ArgumentList.class, new ArgumentListEditor());
        setDescriptionVisible(true);
        setToolBarVisible(true);
        setMode(VIEW_AS_CATEGORIES);
        final PropertyEditorFactory std = getEditorFactory();
        setEditorFactory(new PropertyEditorFactory() {

            @Override
            public PropertyEditor createPropertyEditor(Property p) {
                Class c = p.getType();
                PropertyEditorSupport s = editors.get(c);
                if (s != null) {
                    return s;
                }
                return std.createPropertyEditor(p);
            }
        });
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);

        super.getTable().setEnabled(enabled);
    }
}
