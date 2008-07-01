/*
 * Group.java
 * 
 * Created on 4/Set/2007, 20:14:26
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Luís
 */
public class Group extends Folder implements Serializable, Transferable {
    static final long serialVersionUID = 1L;
    public Folder root;
    public static final DataFlavor GROUP_FLAVOR = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType, "Group");
    private static DataFlavor[] flavors = {GROUP_FLAVOR};
    
    public Group(){super("");}
    
    public Group(Folder root, String name){
        super(name);
        this.root = root;
       if (root instanceof Project)
           editable = false;
    }
    
    public Folder magicAddition(String type){
        if(allowsFileType(type))
            return this;
        return root.magicAddition(type);
    }
     
    public Folder magicAddition(Group folder){
        if(allowsGroup(folder))
            return this;
        return root.magicAddition(folder);
    }
    
    public Group newGroup(String name){
        Group group = new Group(this, name);
        add(group);
        return group;
    }
     
    public String getObjectType(){
        return "Group";
    }
    
     
    public String getPath(){
        return root.getPath() + "/" + super.getPath();
    }
    
    public Project getProject(){
        return root.getProject();
    }

    public DataFlavor[] getTransferDataFlavors() {
        return flavors;
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return flavor == GROUP_FLAVOR;
    }

    public GObject getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (flavor != GROUP_FLAVOR) {
            throw new UnsupportedFlavorException(flavor);
        }
        return this;
    }
}
