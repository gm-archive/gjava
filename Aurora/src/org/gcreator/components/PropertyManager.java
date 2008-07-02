/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import com.l2fprod.common.propertysheet.*;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.Enumeration;
import java.util.Hashtable;
import org.gcreator.actions.components.ArgumentList;
import org.gcreator.actions.components.ArgumentListEditor;
import org.gcreator.actions.components.FailureBehavior;
import org.gcreator.actions.components.FailureBehaviorEditor;

/**
 *
 * @author luis
 */
public class PropertyManager extends PropertySheetPanel{
    public static Hashtable<Class, PropertyEditorSupport>
            editors = new Hashtable<Class, PropertyEditorSupport>();
    
    static{
        editors.put(FailureBehavior.class, new FailureBehaviorEditor());
        editors.put(ArgumentList.class, new ArgumentListEditor());
    }
    
    public PropertyManager(){
        super();
        setDescriptionVisible(true);
        setToolBarVisible(true);
        setMode(VIEW_AS_CATEGORIES);
        final PropertyEditorFactory std = getEditorFactory();
        setEditorFactory(new PropertyEditorFactory(){
            public PropertyEditor createPropertyEditor(Property p){
                Class c = p.getType();
                PropertyEditorSupport s = editors.get(c);
                if(s!=null) return s;
                return std.createPropertyEditor(p);
            }
        });
    }
    
    public void setEnabled(boolean enabled){
        super.setEnabled(enabled);
        
        super.getTable().setEnabled(enabled);
    }
}
