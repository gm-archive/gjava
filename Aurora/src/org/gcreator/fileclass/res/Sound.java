/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

/**
 *
 * @author TGMG
 */
public class Sound implements Resource  {
static final long serialVersionUID = 1L;
    // String name;
    public byte[] sound;
    public String extension="";

    /**@deprecated*/
    public Sound(String name) {
        //this.name = name;
        this();
    }
    
    public Sound(){
        
    }
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
