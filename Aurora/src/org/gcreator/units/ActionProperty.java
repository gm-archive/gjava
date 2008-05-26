/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

/**
 *
 * @author luis
 */
public class ActionProperty {
    public String name = "";
    public String title = "";
    public String description = "";
    public String category = "";
    
    public Class type = String.class;
    public Object value = "";
    
    public ActionProperty clone(){
        ActionProperty p = new ActionProperty();
        
        p.name = name;
        p.title = title;
        p.description = description;
        p.category = category;
        
        p.type = type;
        p.value = value;
        
        return p;
    }
}
