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
import org.gcreator.units.ObjectNode;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import org.gcreator.fileclass.Group;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class WorkspaceCellRenderer extends JLabel implements TreeCellRenderer {

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
    public ImageIcon settings;
    
    public WorkspaceCellRenderer() {
        workspace = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/workspace.png"));
        text = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/text.png"));
        image = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/img.png"));
        java = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/java.png"));
        actor = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/actor.png"));
        tileset = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/tile.png"));
        sprite = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/sprite.png"));
        GCL = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/class.png"));
        script = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/script.png"));
        timeline = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/timeline.png"));
        scene = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/scene.png"));
        img = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/img.png"));
        sound = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/sound.png"));
        settings = new ImageIcon(getClass().getResource("/org/gcreator/resources/tree/settings.png"));
    }

    public /*Image*/Icon getImageFor(ObjectNode noder){
        if(noder.object instanceof Group) {
            Icon ico = (Icon) UIManager.get("Tree.openIcon");
            if (ico != null)
                return ico;
            return new ImageIcon(getClass().getResource("/org/gcreator/resources/defaultfoldericon.png"));
        }
        if (((org.gcreator.fileclass.GFile) noder.object).type.equals("txt")) {
                    return text;
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("gif")) {
                    //setIcon((ImageIcon) ((org.gcreator.fileclass.File) noder.object).value);
                    return(img);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("jpg")) {
                    //setIcon(((org.gcreator.fileclass.File) noder.object).treeimage);
                    return(img);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("png")) {
                    //setIcon(((org.gcreator.fileclass.File) noder.object).treeimage);
                    return(img);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("java")) {
                    return(java);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("actor")) {
                    return(actor);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("tileset")) {
                    return(tileset);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("sprite")) {
                    return(sprite);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("egml")) {
                    return(GCL);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("gcl")) {
                    return(GCL);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("gs")) {
                    return(script);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("timeline")) {
                    return(timeline);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("scene")) {
                    return(scene);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("wav"))  {
                    return(sound);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("mid"))  {
                    return(sound);
                } else if (((org.gcreator.fileclass.GFile) noder.object).type.equals("settings"))  {
                    return settings;
                } else if (UIManager.get("Tree.leafIcon") != null) {
                    return((Icon) UIManager.get("Tree.leafIcon"));
                }
            return null;
    }
    
    public WorkspaceCellRenderer(boolean logfileDeleted) {
        this.logfileDeleted = logfileDeleted;
    }
    boolean edition = false;
    String val = "";

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean bSelected, boolean bExpanded, boolean bLeaf, int iRow, boolean bHasFocus) {
// Find out which node we are rendering and get its text
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String labelText = (String) node.getUserObject();
        if (node instanceof ObjectNode&&((ObjectNode) node).object!=null) {
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
            if (noder.object instanceof org.gcreator.fileclass.GFile) {
                setIcon(getImageFor(noder));
            } else {
                if (noder.object instanceof org.gcreator.fileclass.Folder && ((org.gcreator.fileclass.Folder) noder.object).getImage()!=null) {
                    setIcon(((org.gcreator.fileclass.Folder) noder.object).getImage());
                } else if (bExpanded) {
                    if (UIManager.get("Tree.openIcon") != null) {
                        setIcon((Icon) UIManager.get("Tree.openIcon"));
                    } else {
                        setIcon(getImageFor(new ObjectNode(new Group())));
                    }
                } else if (UIManager.get("Tree.closedIcon") != null) {
                    setIcon((Icon) UIManager.get("Tree.closedIcon"));
                } else {
                    setIcon(getImageFor(new ObjectNode(new Group())));
                }
            }
        }
        try{
        if(labelText.startsWith("$"))
            labelText = LangSupporter.activeLang.getEntry(Integer.parseInt(labelText.substring(1)));
        }
        catch(Exception e){
            
        }
        
// Add the text to the cell
        if (org.gcreator.core.Aurwindow.getMainProject() != null && node == org.gcreator.core.Aurwindow.getMainProject().node) {
            setText("<HTML><B>" + labelText);
        } else {
            setText(labelText);
        }
        if(bSelected){
            setForeground(UIManager.getColor("Tree.selectionForeground"));
            setBackground(UIManager.getColor("Tree.selectionBackground"));
        }
        else{
            setForeground(UIManager.getColor("Tree.textForeground"));
            setBackground(UIManager.getColor("Tree.textBackground"));
        }
        return this;
    }

// This is a hack to paint the background. Normally a JLabel can
// paint its own background, but due to an apparent bug or
// limitation in the TreeCellRenderer, the paint method is
// required to handle this.
    
    public void paint(Graphics g) {
        if(!UIManager.getLookAndFeel().getClass().getName().equals("com.sun.java.swing.plaf.gtk.GTKLookAndFeel")){
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        g.setColor(getForeground());
        super.paint(g);
    }
}