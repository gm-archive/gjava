/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class FolderMenuItem extends JMenu{
    public Folder file = null;
    public FolderMenuItem(){
        super();
    }
    
    public String getText(){
        if(file==null)
            return "<none>";
        return file.name;
    }
    
    public Icon getIcon(){
        if(file==null)
            return null;
        return ((WorkspaceCellRenderer) Aurwindow.workspace.getCellRenderer()).getImageFor(file.node);
    }
}
