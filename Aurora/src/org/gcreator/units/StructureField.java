/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

/**
 *
 * @author luis
 */
public class StructureField {
    public String type;
    public String name;
    public String value;
    public boolean constructor;
    
    public StructureField clone(){
        StructureField field = new StructureField();
        field.type = type;
        field.name = name;
        field.value = value;
        field.constructor = constructor;
        return field;
    }
}
