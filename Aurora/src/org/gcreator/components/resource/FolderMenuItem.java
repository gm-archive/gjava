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
/*internal*/ class FolderMenuItem extends JMenu{
    public Folder file = null;
    private FileLabel l = null;
    public FolderMenuItem(FileLabel l){
        super();
        this.l = l;
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
