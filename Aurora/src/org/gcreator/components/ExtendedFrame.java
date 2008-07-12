/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ExtendedFrame extends JInternalFrame {
    private TabPanel pane = null;
            
    public void setPanel(TabPanel pane){
        this.pane = pane;
    }
    
    public TabPanel getPanel(){
        return pane;
    }
    
     
    @Override
    public void dispose(){
        if (pane != null)
            pane.dispose();
    }
}
