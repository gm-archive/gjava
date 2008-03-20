/*
 * ObjectNode.java
 * 
 * Created on 5/Set/2007, 22:13:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.Serializable;
import javax.swing.tree.*;

import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class ObjectNode extends DefaultMutableTreeNode implements Serializable {
    static final long serialVersionUID = 1L;
    public org.gcreator.fileclass.GObject object;
    public ObjectNode(org.gcreator.fileclass.GObject object){
        super(object.name);
        this.object = object;
        object.setObjectNode(this);
    }
}
