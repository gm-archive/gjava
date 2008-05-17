/*
 * ProjectTree.java
 * 
 * Created on 5/Set/2007, 21:56:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import org.gcreator.units.ObjectNode;
import javax.swing.*;
import javax.swing.tree.*;

import org.gcreator.components.*;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class ProjectTree {
    public static DefaultMutableTreeNode importFolderToTree(Folder folder, DefaultMutableTreeNode root){
        return importFolderToTree(folder, root, true, true);
    }
    
    public static DefaultMutableTreeNode importFolderToTree(Folder folder, DefaultMutableTreeNode root, boolean decnew, boolean expand){
        DefaultMutableTreeNode froot;
        if(decnew){
            froot = new ObjectNode(folder);
            root.add(froot);
        }
        else
            froot = root;
        //if (folder instanceof Project) {
            //((Project)folder).froot = froot;
            //((Project)folder).node.setParent(froot);
        //}
        
        
        org.gcreator.fileclass.GObject childNode;
        for(int i = 0; i < folder.getChildArrayNum(); i++){
            if((childNode = folder.childAt(i))!=null){
                DefaultMutableTreeNode node = new ObjectNode(childNode);
                froot.add(node);
                if(childNode instanceof GFile)
                    node.setAllowsChildren(false);
                if(childNode instanceof Folder){
                    importFolderToTree((Folder) childNode, node, false, true);
                    node.setAllowsChildren(true);
                    if(expand){
                        gcreator.panel.workspace.expandPath(new TreePath(node.getPath()));
                    }
                }
            }
        }
        if(expand){
                    gcreator.panel.workspace.expandPath(new TreePath(froot.getPath()));
            }
        try{
        gcreator.panel.workspace.updateUI();
        }
        catch(Exception e){}
        return froot;
    }
}
