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
public static Vector classes= new Vector<ApiClass>();
static ApiClass clas;

public static void setup() {
    clas = new ApiClass("Test");
    clas.add(new ApiFunction("test","test doc"));
    clas.add(new ApiFunction("test2","test2 doc"));
    classes.add(clas);
     clas = new ApiClass("Test2");
     clas.add(new ApiFunction("test2","test2 doc"));
    classes.add(clas);
    clas = new ApiClass("Draw2d");
    clas.add(new ApiFunction("clear","<b>void</b> clear <i>(Color col)</i><br><br>   Clears the entire room in the given color (no alpha blending) "));

    //classes.add(test2);
}


}
