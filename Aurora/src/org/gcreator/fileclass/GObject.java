/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass;

import java.io.Serializable;
import org.gcreator.units.ObjectNode;
import org.gcreator.components.*;

/**
 *
 * @author Luís
 */
public class GObject implements Serializable {
    static final long serialVersionUID = 1L;
    public boolean allowDrag = true;
    public String name;
    public transient ObjectNode node;
    
    //Used for serilization only
    public GObject(){}
    
    public GObject(String name){
        this.name = name;
    }
    
    public void setObjectNode(ObjectNode node){
        this.node = node;
    }
    
    public String getObjectType(){
        return "Object";
    }
    
    public boolean editable = true;
    
    public boolean allowDrag(){
        return allowDrag;
    }
     
    @Override
    public GObject clone(){
        GObject o = new GObject(name);
        o.node = (ObjectNode) node.clone();
        return o;
    }
    
    public String getPath(){
        return name;
    }
    
    public Project getProject(){
        return null;
    }
}
