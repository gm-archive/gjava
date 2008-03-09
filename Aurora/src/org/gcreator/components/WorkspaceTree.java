/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components;

import java.awt.datatransfer.*;
import javax.swing.*;
import javax.swing.tree.*;

import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.units.*;

/**
 * @author Luís Reis
 */
public class WorkspaceTree extends JTree{
    public WorkspaceTree(TreeNode root){
        super(root);
        setScrollsOnExpand(true);
        int ver = Integer.parseInt(gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
        if (ver >= 6) {
            setDragEnabled(true);
            setDropMode(DropMode.ON_OR_INSERT);
        }
        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        try {
            if (ver >= 6) {
                // Tree drag and drop support

                setDropMode(DropMode.ON_OR_INSERT);

                setTransferHandler(new TransferHandler() {

                            protected Transferable createTransferable(JComponent c) {
                                ObjectNode f = (ObjectNode) getLastSelectedPathComponent();
                                if (f.object instanceof org.gcreator.fileclass.File) {
                                    System.out.println("" + ((org.gcreator.fileclass.File) f.object).name);
                                    return ((org.gcreator.fileclass.File) f.object);
                                } else {
                                    return null;
                                }
                            }

                            public int getSourceActions(JComponent c) {
                                return MOVE;
                            }

                            public boolean canImport(TransferHandler.TransferSupport support) {
                               // System.out.println(""+support);
                                TreePath drop = ((JTree.DropLocation) support.getDropLocation()).getPath();
                                if (drop == null) {
                                    return false;
                                }
                                if (!(drop.getLastPathComponent() instanceof ObjectNode))
                                {return false;}
                                ObjectNode dropNode = (ObjectNode) drop.getLastPathComponent();
                                ObjectNode dragNode = (ObjectNode) ((JTree) support.getComponent()).getLastSelectedPathComponent();
                                //if (dragNode == dropNode) return false;
		//if (dragNode.isNodeDescendant(dropNode)) return false;
                                if (dropNode.object instanceof org.gcreator.fileclass.Group) {
                                    if (((org.gcreator.fileclass.Group) dropNode.object).allowsFileType(((org.gcreator.fileclass.File) dragNode.object).type)) {
                                        return true;
                                    } else {
                                        return false;
                                    }

                                }

                                return false;
                            }

                            public boolean importData(TransferHandler.TransferSupport support) {
                                if (!canImport(support)) {
                                    return false;
                                }
                                JTree.DropLocation drop = (JTree.DropLocation) support.getDropLocation();
                                int dropIndex = drop.getChildIndex();
                                ObjectNode dropNode = (ObjectNode) drop.getPath().getLastPathComponent();
                                ObjectNode dragNode = (ObjectNode) ((JTree) support.getComponent()).getLastSelectedPathComponent();
                                if (dropIndex == -1) {
                                    dropIndex = dropNode.getChildCount();
                                }
                                if (dropNode == dragNode.getParent() && dropIndex > dragNode.getParent().getIndex(dragNode)) {
                                    dropIndex--;
                                }
                                dropNode.insert(dragNode, dropIndex);
                                expandPath(new TreePath(dropNode.getPath()));
                                updateUI();
                                return true;

                            }
                        });
            }
            else{
                System.out.println(ver);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setCellRenderer(new WorkspaceCellRenderer());
        expandRow(0);
    }
}
