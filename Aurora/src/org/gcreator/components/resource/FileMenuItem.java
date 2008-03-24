/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.event.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.components.popupmenus.CollisionListPopup;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class FileMenuItem extends JMenuItem implements ActionListener{
    public GFile file = null;
    private FileLabel l = null;
    private CollisionListPopup p = null;
    public FileMenuItem(FileLabel l){
        super();
        this.l = l;
        this.addActionListener(this);
    }
    
    public FileMenuItem(CollisionListPopup p){
        super();
        this.p = p;
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt){
        if(l!=null)
            l.setFile(file, true);
        if(p!=null)
            p.done(file);
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
