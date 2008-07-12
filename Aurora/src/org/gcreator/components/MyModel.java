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
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class MyModel extends DefaultComboBoxModel{
    public MyModel(){
        super();
    }
    
    @Override
    public Object getElementAt(int pos){
        if(gcreator.window!=null)
            return gcreator.panel.getWindowListElementAt(pos);
        return null;
    }
    
    @Override
    public int getSize(){
        if(gcreator.window!=null)
            return gcreator.panel.getWindowListSize();
        return 0;
    }
}
