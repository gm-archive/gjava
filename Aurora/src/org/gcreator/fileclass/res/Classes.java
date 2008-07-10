/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
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
public class Classes implements Resource {
    static final long serialVersionUID = 1L;
    public String value = "";
    
    public Classes(String value){
        this.value = value;
    }
    
    public String writeXml() {
        return value;
    }

     
    public void readXml(String xml) {
        value = xml;
    }

     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone(){
        Classes a = new Classes(value);
        //a.name = name;
        return a;
    }
    
     
    public String toString(){
        return value;
    }
}
