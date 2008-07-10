/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
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
 * @author Luís
 */
public class VectorListModel extends AbstractListModel{
    private Vector v;
    public VectorListModel(Vector v){
        this.v = v;
    }
    
    public Object getElementAt(int pos){
        return v.get(pos);
    }
    
    public int getSize(){
        return v.size();
    }
    
    public void setVector(Vector v){
        this.v = v;
    }
    
    public int getIndexOf(Object o){
        return v.indexOf(o);
    }
}
