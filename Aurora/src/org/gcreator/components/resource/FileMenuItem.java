/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.event.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
/*internal*/ class FileMenuItem extends JMenuItem implements ActionListener{
    public GFile file = null;
    private FileLabel l = null;
    public FileMenuItem(FileLabel l){
        super();
        this.l = l;
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt){
        l.setFile(file);
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
