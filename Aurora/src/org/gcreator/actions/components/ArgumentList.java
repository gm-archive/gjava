/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.actions.components;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 *
 * @author Luís
 */
public class ArgumentList implements Serializable{

    public Vector<String> arguments = new Vector<String>();

    
    @Override
    public String toString() {
        String res = "";
        try {
            String last = arguments.lastElement();
            for (String arg : arguments) {
                res += arg;
                if (arg!=last) { //I KNOW I'M NOT USING equals
                    res += ", ";
                }
            }
            return res;
        } catch (NoSuchElementException e) {
            return "";
        }
    }
}
