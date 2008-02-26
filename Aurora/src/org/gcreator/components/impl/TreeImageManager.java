/*
 * TreeImageManager.java
 *
 * Created on 6/Set/2007, 11:57:41
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import org.gcreator.core.gcreator;
import org.gcreator.fileclass.ExtensionProject;
import org.gcreator.units.ObjectNode;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.tree.*;

/**
 *
 * @author Luís
 */
public class TreeImageManager extends JLabel implements TreeCellRenderer {

    private boolean bSelected;
    private boolean isCurProject;
    boolean logfileDeleted;
    public ImageIcon workspace;
    public ImageIcon text;
    public ImageIcon image;
    public ImageIcon java;
    public ImageIcon actor;
    public ImageIcon tileset;
    public ImageIcon sprite;
    public ImageIcon GCL;
    public ImageIcon script;
    public ImageIcon timeline;
    public ImageIcon scene;
    public ImageIcon img;
    public ImageIcon sound;
    
    public TreeImageManager() {
        workspace = new ImageIcon(getClass().getResource("/org/gcreator/resources/workspace.png"));
        text = new ImageIcon(getClass().getResource("/org/gcreator/resources/text.png"));
        image = new ImageIcon(getClass().getResource("/org/gcreator/resources/img.png"));
        java = new ImageIcon(getClass().getResource("/org/gcreator/resources/java.png"));
        actor = new ImageIcon(getClass().getResource("/org/gcreator/resources/actor.png"));
        tileset = new ImageIcon(getClass().getResource("/org/gcreator/resources/tile.png"));
        sprite = new ImageIcon(getClass().getResource("/org/gcreator/resources/sprite.png"));
        GCL = new ImageIcon(getClass().getResource("/org/gcreator/resources/class.png"));
        script = new ImageIcon(getClass().getResource("/org/gcreator/resources/script.png"));
        timeline = new ImageIcon(getClass().getResource("/org/gcreator/resources/timeline.png"));
        scene = new ImageIcon(getClass().getResource("/org/gcreator/resources/scene.png"));
        img = new ImageIcon(getClass().getResource("/org/gcreator/resources/img.png"));
        sound = new ImageIcon(getClass().getResource("/org/gcreator/resources/sound.png"));
    }

    public TreeImageManager(boolean logfileDeleted) {
        this.logfileDeleted = logfileDeleted;
    }
    boolean edition = false;
    String val = "";

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean bSelected, boolean bExpanded, boolean bLeaf, int iRow, boolean bHasFocus) {
// Find out which node we are rendering and get its text

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String labelText = (String) node.getUserObject();
        if (node instanceof ObjectNode) {
            ObjectNode noder = (ObjectNode) node;
            /*if (!tree.isEditing()) {
                tree.setEditable(noder.object.editable);
            }*/
            labelText = noder.object.name;
//            val = noder.getUserObject().toString();
//            if (edition != tree.isEditing() && tree.isEditing() == false) {
//                //Finished editing
//                noder.object.name = "hey";//val;
//            }
        } else {
            /*if (!tree.isEditing()) {
                tree.setEditable(false);
            }*/
        }
        tree.setEditable(false);

        edition = tree.isEditing();
        try{
        if (gcreator.window != null) {
            if (gcreator.window.getCurrentObject() != null) {
                val = gcreator.window.getCurrentObject().node.getUserObject().toString();
            }
        }
        }
        catch(NullPointerException e){}
        this.bSelected = bSelected;
        try {
            this.isCurProject = (node == org.gcreator.core.gcreator.window.getCurrentProject().node);
        } catch (NullPointerException e) {
            this.isCurProject = false;
        }

        if (!(node instanceof ObjectNode)) {
            setIcon(workspace);
        } else {
            ObjectNode noder = (ObjectNode) node;
            if (noder.object instanceof org.gcreator.fileclass.File) {
                if (((org.gcreator.fileclass.File) noder.object).type.equals("txt")) {
                    setIcon(text);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("gif")) {
                    //setIcon((ImageIcon) ((org.gcreator.fileclass.File) noder.object).value);
                    setIcon(img);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("jpg")) {
                    //setIcon(((org.gcreator.fileclass.File) noder.object).treeimage);
                    setIcon(img);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("png")) {
                    //setIcon(((org.gcreator.fileclass.File) noder.object).treeimage);
                    setIcon(img);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("java")) {
                    setIcon(java);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("actor")) {
                    setIcon(actor);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("tileset")) {
                    setIcon(tileset);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("sprite")) {
                    setIcon(sprite);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("egml")) {
                    setIcon(GCL);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("gcl")) {
                    setIcon(GCL);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("gs")) {
                    setIcon(script);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("timeline")) {
                    setIcon(timeline);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("scene")) {
                    setIcon(scene);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("wav"))  {
                    setIcon(sound);
                } else if (((org.gcreator.fileclass.File) noder.object).type.equals("mid"))  {
                    setIcon(sound);
                } else if (UIManager.get("Tree.leafIcon") != null) {
                    setIcon((Icon) UIManager.get("Tree.leafIcon"));
                } else {
                    setIcon(null);
                }
            } else {
                if (noder.object instanceof org.gcreator.fileclass.Folder && ((org.gcreator.fileclass.Folder) noder.object).getImage()!=null) {
                    setIcon(((org.gcreator.fileclass.Folder) noder.object).getImage());
                } else if (bExpanded) {
                    if (UIManager.get("Tree.openIcon") != null) {
                        setIcon((Icon) UIManager.get("Tree.openIcon"));
                    } else {
                        setIcon(null);
                    }
                } else if (UIManager.get("Tree.closedIcon") != null) {
                    setIcon((Icon) UIManager.get("Tree.closedIcon"));
                } else {
                    setIcon(null);
                }
            }
        }
// Add the text to the cell
        if (org.gcreator.core.Aurwindow.getMainProject() != null && node == org.gcreator.core.Aurwindow.getMainProject().node) {
            setText("<HTML><B>" + labelText);
        } else {
            setText(labelText);
        }
        return this;
    }

// This is a hack to paint the background. Normally a JLabel can
// paint its own background, but due to an apparent bug or
// limitation in the TreeCellRenderer, the paint method is
// required to handle this.
    
    public void paint(Graphics g) {
        if(!UIManager.getLookAndFeel().getClass().getName().equals("com.sun.java.swing.plaf.gtk.GTKLookAndFeel")){
        Color bColor;
        Icon currentI = getIcon();

// Set the correct background color
        if (bSelected) {
            bColor = Color.yellow;
        } else if (isCurProject) {
            bColor = Color.orange;
        } else {
            bColor = Color.white;
        }
        g.setColor(bColor);

// Draw a rectangle in the background of the cell
        g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
        }
        super.paint(g);
    }
}