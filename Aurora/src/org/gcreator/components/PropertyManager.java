/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import com.l2fprod.common.propertysheet.*;

/**
 *
 * @author luis
 */
public class PropertyManager extends PropertySheetPanel{
    public PropertyManager(){
        super();
        setDescriptionVisible(true);
        setToolBarVisible(true);
        setMode(VIEW_AS_CATEGORIES);
    }
}
