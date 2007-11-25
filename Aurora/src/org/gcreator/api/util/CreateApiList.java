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

public static void setup() {
    ApiClass test = new ApiClass("Test");
    test.add(new ApiFunction("test","test doc"));
    test.add(new ApiFunction("test2","test2 doc"));
    classes.add(test);
}


}
