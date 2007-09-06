/*
 * TreeImageManager.java
 *
 * Created on 6/Set/2007, 11:57:41
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

/**
 *
 * @author Luís
 */
public class TreeImageManager extends JLabel implements TreeCellRenderer {

    private boolean bSelected;
    boolean logfileDeleted;
    public ImageIcon workspace;
    public ImageIcon text;

    public TreeImageManager() {
        workspace = new ImageIcon(getClass().getResource("/resources/workspace.png"));
        text = new ImageIcon(getClass().getResource("/resources/txt.png"));
    }

    public TreeImageManager(boolean logfileDeleted) {
        this.logfileDeleted = logfileDeleted;
    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean bSelected, boolean bExpanded, boolean bLeaf, int iRow, boolean bHasFocus) {
// Find out which node we are rendering and get its text
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String labelText = (String) node.getUserObject();

        this.bSelected = bSelected;

        if (!(node instanceof ObjectNode))
            setIcon(workspace);
        else{
            ObjectNode noder = (ObjectNode) node;
            if(noder.object instanceof fileclass.File)
                if(((fileclass.File) noder.object).type.equals("txt"))
                    setIcon(text);
                else
                    if(UIManager.get("Tree.leafIcon")!=null)
                        setIcon((Icon) UIManager.get("Tree.leafIcon"));
                    else
                        setIcon(null);
            else{
                if(bExpanded)
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
        bColor = bSelected ? Color.yellow : Color.white;
        g.setColor(bColor);

// Draw a rectangle in the background of the cell
        g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

        super.paint(g);
    }
}
