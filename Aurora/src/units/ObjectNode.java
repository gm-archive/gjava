/*
 * ObjectNode.java
 * 
 * Created on 5/Set/2007, 22:13:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package units;

import javax.swing.tree.*;

import fileclass.*;

/**
 *
 * @author Luís
 */
public class ObjectNode extends DefaultMutableTreeNode{
    public fileclass.Object object;
    public ObjectNode(fileclass.Object object){
        super(object.name);
        this.object = object;
        object.setObjectNode(this);
    }
}
