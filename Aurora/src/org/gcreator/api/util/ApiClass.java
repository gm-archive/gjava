/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.api.util;

import java.util.Vector;

/**
 *
 * @author Ali
 */
public class ApiClass {
    public String name="",doc="";
    public Vector functions = new Vector<ApiFunction>();
   // ApiFunction[] functions;
    ApiClass(String name )
    {
        this.name = name;
        //this.functions = functions;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @SuppressWarnings("unchecked")
    public void add(ApiFunction af) {
      functions.add(af);  
    }
}
