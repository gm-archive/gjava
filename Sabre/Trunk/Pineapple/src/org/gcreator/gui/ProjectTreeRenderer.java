/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package org.gcreator.gui;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.gcreator.core.Project;

/**
 * A Project tree cell renderer
 * @author Luís Reis
 */
public class ProjectTreeRenderer extends DefaultTreeCellRenderer{
    public ProjectTreeRenderer(){
        setOpaque(false);
    }
    
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object val,
            boolean isSelected, boolean isExpanded, boolean isLeaf, int row,
            boolean hasFocus){
        
        super.getTreeCellRendererComponent(tree, val, isSelected, isExpanded, isLeaf, row, hasFocus);
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) val;
        Object value = node.getUserObject();
        
        if(value instanceof Project){
            try{
                setText(((Project) value).getSettings().get("name"));
            }
            catch(Exception e){
                setText("invalid");
            }
        }
        
        return this;
        
    }
}
