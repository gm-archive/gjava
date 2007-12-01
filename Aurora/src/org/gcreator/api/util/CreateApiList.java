/*
 * Don't modify this file it is computer generated!
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

    public static void setup() {
       
        clas = new ApiClass("Clipboard");
        clas.add(new ApiFunction("clipboard_has_text ()", "<b>double</b> clipboard_has_text <i>()</i><br><br>   Returns whether there is any text on the clipboard "));
        clas.add(new ApiFunction("clipboard_get_text ()", "<b>String</b> clipboard_get_text <i>()</i><br><br>   Returns the current text on the clipboard "));
        clas.add(new ApiFunction("clipboard_set_text (String s)", "<b>double</b> clipboard_set_text <i>(String s)</i><br><br>   Sets the string str on the clipboard "));
        classes.add(clas);
    //classes.add(test2);
    }
}
