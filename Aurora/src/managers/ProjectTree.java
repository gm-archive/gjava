/*
 * ProjectTree.java
 * 
 * Created on 5/Set/2007, 21:56:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managers;

import units.ObjectNode;
import javax.swing.*;
import javax.swing.tree.*;

import components.*;
import fileclass.*;

/**
 *
 * @author Luís
 */
public class ProjectTree {
    public static DefaultMutableTreeNode importFolderToTree(Folder folder, DefaultMutableTreeNode root){
        return importFolderToTree(folder, root, true);
    }
    
    public static DefaultMutableTreeNode importFolderToTree(Folder folder, DefaultMutableTreeNode root, boolean decnew){
        DefaultMutableTreeNode froot;
        if(decnew){
            froot = new ObjectNode(folder);
            root.add(froot);
        }
        else
            froot = root;
        fileclass.Object childNode;
        for(int i = 0; i < folder.getChildArrayNum(); i++){
            if((childNode = folder.childAt(i))!=null){
                DefaultMutableTreeNode node = new ObjectNode(childNode);
                froot.add(node);
                if(childNode instanceof File)
                    node.setAllowsChildren(false);
                if(childNode instanceof Folder){
                    importFolderToTree((Folder) childNode, node, false);
                    node.setAllowsChildren(true);
                }
            }
        }
        core.Aurwindow.workspace.updateUI();
        return froot;
    }
}
