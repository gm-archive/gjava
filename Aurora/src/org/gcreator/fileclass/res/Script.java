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
public class Script implements Resource {
    static final long serialVersionUID = 1L;
    public String value = "";
    
    public Script(String value){
        this.value = value;
    }

    /*@Override
    public String exportToHtml(boolean xhtml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/

    @Override
    public Object clone() {
        return new Script(value);
    }
    
    public String toString(){
        return value;
    }
}
