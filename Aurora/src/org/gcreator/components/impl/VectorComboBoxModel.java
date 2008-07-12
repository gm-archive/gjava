/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author luis
 */
public class VectorComboBoxModel extends VectorListModel implements ComboBoxModel{
    private int selindex = -1;
    public VectorComboBoxModel(Vector v){
        super(v);
    }
    public Object getSelectedItem(){
        if(selindex<0||selindex>=getSize())
            return null;
        return getElementAt(selindex);
    }
    public void setSelectedItem(Object o){
        selindex = getIndexOf(o);
    }
}
