/*
 * TreeImageManager.java
 *
 * Created on 6/Set/2007, 11:57:41
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import core.aurora;
import fileclass.ExtensionProject;
import units.ObjectNode;
import javax.swing.*;
import java.awt.*;
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
    public ImageIcon project_game;
    public ImageIcon project_pkg;
    public ImageIcon project_ext;

    public TreeImageManager() {
        workspace = new ImageIcon(getClass().getResource("/resources/workspace.png"));
        text = new ImageIcon(getClass().getResource("/resources/text.png"));
        image = new ImageIcon(getClass().getResource("/resources/img.png"));
        java = new ImageIcon(getClass().getResource("/resources/java.png"));
        actor = new ImageIcon(getClass().getResource("/resources/actor.png"));
        project_game = new ImageIcon(getClass().getResource("/resources/game.png"));
        project_pkg = new ImageIcon(getClass().getResource("/resources/package.png"));
        project_ext = new ImageIcon(getClass().getResource("/resources/extension.png"));
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
        if(node instanceof ObjectNode){
            ObjectNode noder = (ObjectNode) node;
            if(!tree.isEditing())
                tree.setEditable(noder.object.editable);
            labelText = noder.object.name;
            val = noder.getUserObject().toString();
            if(edition!=tree.isEditing()&&tree.isEditing()==false){
                //Finished editing
                noder.object.name = val;
            }
        }
        else{
            if(!tree.isEditing())
                tree.setEditable(false);
        }
        
        edition = tree.isEditing();
        if(aurora.window!=null)
            if(aurora.window.getCurrentObject()!=null)
                val = aurora.window.getCurrentObject().node.getUserObject().toString();

        this.bSelected = bSelected;
        try{
            this.isCurProject = 
                    (node == core.aurora.window.getCurrentProject().node);
        }
        catch(NullPointerException e){
            this.isCurProject = false;
        }

        if (!(node instanceof ObjectNode))
            setIcon(workspace);
        else{
            ObjectNode noder = (ObjectNode) node;
            if(noder.object instanceof fileclass.File)
                if(((fileclass.File) noder.object).type.equals("txt"))
                    setIcon(text);
                else if(((fileclass.File) noder.object).type.equals("gif"))
                    setIcon(image);
                else if(((fileclass.File) noder.object).type.equals("jpg"))
                    setIcon(image);
                else if(((fileclass.File) noder.object).type.equals("png"))
                    setIcon(image);
                else if(((fileclass.File) noder.object).type.equals("java"))
                    setIcon(java);
                else if(((fileclass.File) noder.object).type.equals("actor"))
                    setIcon(actor);
                else
                    if(UIManager.get("Tree.leafIcon")!=null)
                        setIcon((Icon) UIManager.get("Tree.leafIcon"));
                    else
                        setIcon(null);
            else{
                if(noder.object instanceof fileclass.GameProject)
                    setIcon(project_game);
                else if(noder.object instanceof fileclass.PackageProject)
                    setIcon(project_pkg);
                else if(noder.object instanceof fileclass.ExtensionProject)
                    setIcon(project_ext);
                else if(bExpanded)
                    if(UIManager.get("Tree.openIcon")!=null)
                        setIcon((Icon) UIManager.get("Tree.openIcon"));
                    else
                        setIcon(null);
                else
                    if(UIManager.get("Tree.closedIcon")!=null)
                        setIcon((Icon) UIManager.get("Tree.closedIcon"));
                    else
                        setIcon(null);
            }
        }
// Add the text to the cell
        if(core.Aurwindow.getMainProject()!=null&&node==core.Aurwindow.getMainProject().node)
            setText("<HTML><B>" + labelText);
        else
            setText(labelText);

        return this;
    }

// This is a hack to paint the background. Normally a JLabel can
// paint its own background, but due to an apparent bug or
// limitation in the TreeCellRenderer, the paint method is
// required to handle this.
    public void paint(Graphics g) {
        Color bColor;
        Icon currentI = getIcon();

// Set the correct background color
        if(bSelected)
            bColor = Color.yellow;
        else if(isCurProject)
            bColor = Color.orange;
        else
            bColor = Color.white;
        g.setColor(bColor);

// Draw a rectangle in the background of the cell
        g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

        super.paint(g);
    }
}
