/*
 * Object.java
 * 
 * Created on 4/Set/2007, 20:12:03
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import org.gcreator.units.ObjectNode;
import org.gcreator.components.*;

/**
 *
 * @author Luís
 */
public class Object {
    public String name;
    public ObjectNode node;
    
    public Object(String name){
        this.name = name;
    }
    
    public void setObjectNode(ObjectNode node){
        this.node = node;
    }
    
    public String getObjectType(){
        return "Object";
    }
    
    public boolean editable = true;
    
     
    public Object clone(){
        Object o = new Object(name);
        o.node = (ObjectNode) node.clone();
        return o;
    }
    
    public String getPath(){
        return name;
    }
}
