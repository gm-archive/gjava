/*
 * Object.java
 * 
 * Created on 4/Set/2007, 20:12:03
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

import units.ObjectNode;
import components.*;

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
}
