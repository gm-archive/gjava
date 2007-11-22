/*
 * instances.java
 * 
 * Created on 11-Sep-2007, 00:47:16
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Vector;
import org.gcreator.compilers.gjava.components.Actor;
import org.gcreator.compilers.gjava.core.basicgame;

/**
     * <h2>Instances</h2>
     * <p>In the game, the basic units are the instances of the different actors. During   game play you can change a number of aspects of these instances. Also you can   create new instances and destroy instances.
     * <p>To use:<br>
     * Functions.instance.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after instance, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     *
     */
    public class Instances {

        /**
         * Number of instances that currently exist in the room.
         * @return
         */
        public static int count() {
            return basicgame.Current.instances.size();
        }

        /**
         * The Actor object of the particular instance. Here n is the number of instance.
         * @param id
         * @return
         */
        public static Actor get_actor(int id) {
            return (Actor) basicgame.Current.instances.get(id);
        }
        
         /**
         * Creates an instance of act at position (x,y). The function returns the Actor object of the new instance.
         * @param x
         * @param y
         * @param act
         */
        public static void create(double x, double y, Actor act) {
            // (act.getClass()) instance = new act.getClass()(x,y,basicgame.Current.instance_id);
            basicgame.Current.instance_id += 1;
            basicgame.Current.SortDepth();
            // basicgame.Current.instances.add(0, instance);
        }

        /**
         * Destroys the current instance.
         * @param instance
         */
        public static void destroy(Actor instance) {
            // run the destory event
            instance.Destroy_event();
           // basicgame.Current.instances.remove(instance.id);
        }
        
        /**
         * Deactivates all instances in the room. If notme is true the calling instance is not deactivated (which is normally what you want).
         * @param act
         * @param notme
         */
        public static void instance_deactivate_all(Actor act, boolean notme) {
            basicgame.Current.deactivated = basicgame.Current.instances;
            basicgame.Current.instances = new Vector();
        }

        /**
         * Activates all instances in the room.
         */
        public static void instance_activate_all() {
            basicgame.Current.instances.addAll(basicgame.Current.deactivated);
        }
    }

