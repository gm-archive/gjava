/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
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
        return ((WorkspaceCellRenderer) gcreator.panel.workspace.getCellRenderer()).getImageFor(file.node);
    }
}
