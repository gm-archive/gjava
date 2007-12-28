/**
 * EGML.java Provides GML like functions for java!
 * @author G-Java development team (http://www.g-java.com)
 * @version 1.0
 */
package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.java2d.basicgame;
import java.awt.*;
import java.awt.datatransfer.*;
import java.lang.reflect.Method;
import javax.swing.*;
import java.util.*;
import org.gcreator.compilers.gjava.api.components.Actor;
import org.gcreator.compilers.gjava.java2d.Scene2D;
import org.gcreator.compilers.gjava.api.components.Timeline;
import org.gcreator.compilers.gjava.api.components.font;
import org.gcreator.compilers.gjava.api.components.sound;
import org.gcreator.compilers.gjava.api.components.Sprite;

import org.gcreator.compilers.gjava.core.*;




/**
 * Functions provides GML like functions for java!
 * @author G-Java development team
 * @version 1.0
 */
public class GScript {

    

   

    //private static Image backImage;
   

    

    
    /**
     * This is run at the start of the game.
     */
    static {
        Setup_Functions();
        // load_image();
    }


    /**
     *
     * @param actor
     * @return number of a certain actor as int
     */
    public static int actor_get_number(Actor actor) {
        // get the number of instances as a value
        int no_of_instances = 0;
        int jii = 0;
        while (jii < basicgame.Current.instances.size()) {
            Actor dt = (Actor) basicgame.Current.instances.get(jii);
            if (dt.equals(actor)) {
                // add onto the number of instances
                no_of_instances = no_of_instances + 1;
            }
            jii++;
        }
        return no_of_instances;
    }



 

    



    /**
     * Show a message
     * @param message
     * @param icon the image icon
     */
    public static void msgbox(String message, int icon) {
        JOptionPane.showMessageDialog(null, message, "G-java", icon);
    }
}
