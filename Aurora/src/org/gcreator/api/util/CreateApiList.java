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
 * @author TGMG
 */
public class CreateApiList {

    public static Vector classes = new Vector<ApiClass>();
    static ApiClass clas;

    @SuppressWarnings("unchecked")
    public static void setup() {
       
        clas = new ApiClass("Clipboard");
        clas.add(new ApiFunction("clipboard_has_text ()", "<b>double</b> clipboard_has_text <i>()</i><br><br>   Returns whether there is any text on the clipboard "));
        clas.add(new ApiFunction("clipboard_get_text ()", "<b>String</b> clipboard_get_text <i>()</i><br><br>   Returns the current text on the clipboard "));
        clas.add(new ApiFunction("clipboard_set_text (String s)", "<b>double</b> clipboard_set_text <i>(String s)</i><br><br>   Sets the string str on the clipboard "));
        classes.add(clas);
    //classes.add(test2);
    }
}
