/**
 * EGML.java Provides GML like functions for java!
 * @author G-Java development team (http://www.g-java.com)
 * @version 1.0
 */
package org.gcreator.compilers.gjava.api;

import java.awt.*;
import java.awt.datatransfer.*;
import java.lang.reflect.Method;
import javax.swing.*;
import java.util.*;
import org.gcreator.compilers.gjava.components.*;
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
     * These functions will give you information about a sprite
     */
    public static class resources_sprite {

        /**
         * Just for compatibility with gm! Don't use!
         * @deprecated Just for compatibility with gm
         * @param ind
         * @return
         */
        public static boolean sprite_exists(sprite ind) {
            if(ind!=null)
                return true;
            return false;
        }


        /**
         * Returns the name of the sprite.
         * @param ind
         * @return
         */
        public static String sprite_get_name(sprite ind) {
            return "";
        }

        /**
         * Returns the number of subimages of the sprite.
         * @param ind
         * @return
         */
        public static int sprite_get_number(sprite ind) {
            return ind.subimages;
        }

        /**
         * Returns the width of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_width(sprite ind) {
            return ind.sprite_width;
        }

        /**
         * Returns the height of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_height(sprite ind) {
            return ind.sprite_height;
        }

        /**
         * Returns whether the sprite with the given index is transparent.
         * @param ind
         * @return
         */
        public static boolean sprite_get_transparent(sprite ind) {
            return ind.Transparent == 1;
        }

        /**
         * Not used for G-Java!
         * @deprecated does nothing, used for GM compatibility
         * @param ind
         * @return false
         */
        public static boolean sprite_get_smooth(sprite ind) {
            return false;
        }

        /**
         * Returns the x-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_xoffset(sprite ind) {
            return ind.sprite_xoffset;
        }

        /**
         * Returns the y-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_yoffset(sprite ind) {
            return ind.sprite_yoffset;
        }

        /**
         * Returns the left side of the bounding box of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_left(sprite ind) {
            return ind.BBLeft;
        }

        /**
         * Returns the right side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_right(sprite ind) {
            return ind.BBRight;
        }

        /**
         * Returns the top side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_top(sprite ind) {
            return ind.BBTop;
        }

        /**
         * Returns the bottom side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_bottom(sprite ind) {
            return ind.BBBottom;
        }

        /**
         * Not used in G-Java.
         * @deprecated Only used for GM compatibility
         * @param ind
         * @return 2
         */
        public static int sprite_get_bbox_mode(sprite ind) {
            return 2;
        }

        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_precise(sprite ind) {
            return false;
        }

        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_preload(sprite ind) {
            return false;
        }
    }

/**
     * These functions will give you information about a sound
     */
    public static class resources_sound {

        /**
         * Returns whether a sound exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return true
         */
        public static boolean sound_exists(sound ind) {
            return true;
        }

        /**
         * Returns the name of the sound.
         * @param ind
         * @return
         */
        public static String sound_get_name(sound ind) {
            return ind.sound_name;
        }

        /**
         * Not used for G-java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return 0
         */
        public static int sound_get_kind(sound ind) {
            return 0;
        }

        /**
         * Not used for G-Java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return false
         */
        public static boolean sound_get_preload(sound ind) {
            return false;
        }

        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_discard(sound ind) {
        }

        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_restore(sound ind) {
        }
    }


/**
     * These functions will give you information about a font
     */
    public static class resources_font {

        /**
         * Returns whether a font exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean font_exists(font ind) {
            return true;
        }

        /**
         * Returns the name of the font.
         * @param ind
         * @return
         */
        public static String font_get_name(font ind) {
            return ind.fontname;
        }

        /**
         * Returns the fontname of the font.
         * @param ind
         * @return
         */
        public static String font_get_fontname(font ind) {
            return ind.fname;
        }

        /**
         * Returns whether the font is bold.
         * @param ind
         * @return
         */
        public static boolean font_get_bold(font ind) {
            return ind.font.isBold();
        }

        /**
         * Returns whether the font is italic.
         * @param ind
         * @return
         */
        public static boolean font_get_italic(font ind) {
            return ind.font.isItalic();
        }
    }

/**
     * These functions will give you information about a timeline
     */
    public static class resources_timeline {

        /**
         * Returns whether a timeline exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean timeline_exists(Timeline ind) {
            return true;
        }

        /**
         * Returns the name of the time line.
         * @param ind
         * @return
         */
        public static String timeline_get_name(Timeline ind) {
            return ind.name;
        }
    }

/**
     * These functions will give you information about a actor
     */
    public static class resources_actor {

        /**
         * Returns whether a actor exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean actor_exists(Actor ind) {
            return true;
        }

        /**
         * Returns the name of the actor.
         * @param ind
         * @return
         */
        public static String actor_get_name(Actor ind) {
            return ind.name;
        }

        /**
         * Returns the sprite of the actor.
         *
         * @param ind
         * @return
         */
        public static sprite actor_get_sprite(Actor ind) {
            return ind.sprite;
        }

        /**
         * Returns whether the actor is solid.
         * @param ind
         * @return
         */
        public static boolean object_get_solid(Actor ind) {
            return ind.solid;
        }

        /**
         * Returns whether the actor is visible.
         * @param ind
         * @return
         */
        public static boolean object_get_visible(Actor ind) {
            return ind.visible;
        }

        /**
         * Returns the depth of the actor.
         * @param ind
         * @return
         */
        public static double object_get_depth(Actor ind) {
            return ind.depth;
        }

        /**
         * Returns whether the actor is persistent.
         * @param ind
         * @return
         */
        public static boolean object_get_persistent(Actor ind) {
            return ind.persistent;
        }
    }



/**
     * These functions will give you information about a room
     */
    public static class resources_room {

        /**
         * Returns whether a room exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean room_exists(Scene ind) {
            return true;
        }

        /**
         * Returns the name of the room.
         * @param ind
         * @return
         */
//        public static String room_get_name(Scene ind) {
//            return ind.name;
//        }
    }




/**
     * G-Java also has the possibility to start external programs.
     * @since 2.0
     */
    






    


/**
     * These are functions to ensure compatibility with GM4.
     * @deprecated No need to use these functions unless you are used to gm4!
     */
    public static class GM4 {

        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.min instead
         * @param a
         * @param b
         * @param c
         * @return the minimum of the 3 values
         * @author luiscubal
         */
        public static double min3(double a, double b, double c) {
            return math.min(a, b, c);
        }

        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.max instead
         * @param a
         * @param b
         * @param c
         * @return the max of the 3 values
         * @author luiscubal
         */
        public static double max3(double a, double b, double c) {
            return math.max(a, b, c);
        }

        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.mean instead
         * @param a
         * @param b
         * @param c
         * @return the mean of the 3 values
         * @author luiscubal
         */
        public static double mean3(double a, double b, double c) {
            return math.mean(a, b, c);
        }
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

    /*
     * public static int min(int... args) { int mini = 0; mini = args[0]; for (int i = 0; i < args.length; i++) {
     * mini = Math.min(mini,args[i]); } return mini; }
     */
    // Can't be used below 1.5 :(
/*
     * public static int max(int... args) { int maxi = 0; maxi = args[0]; for (int i = 0; i < args.length; i++) {
     * maxi = Math.max(maxi,args[i]); } return maxi; }
     */



    /**
     *
     */
    //    public void load_image() {
    //        backImage = new ImageIcon(getClass().getResource("dialog.png")).getImage();
    //
    //    }
    /**
     * Tell the UIManager to use the platform look and feel
     */
    public void set_native() {
        try {
            // Tell the UIManager to use the platform look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Do nothing
        }
    }

    /**
     * @deprecated Does nothing
     * @param message
     * @return
     */
    public static boolean action_if_question(String message) {
        // return true if the answer is yes
        //MessageBox box = new MessageBox();
        /* boolean iii = */
        //box.action_if_question(message);
return true;
    }

    /**
     *@return EGML version
     */

    

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a) {
        return a;
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c) {
        double[] x = new double[]{a, b, c};
        Arrays.sort(x);
        return x[1];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d) {
        double[] x = new double[]{a, b, c, d};
        Arrays.sort(x);
        return x[2];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e) {
        double[] x = new double[]{a, b, c, d, e};
        Arrays.sort(x);
        return x[2];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f) {
        double[] x = new double[]{a, b, c, d, e, f};
        Arrays.sort(x);
        return x[3];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g) {
        double[] x = new double[]{a, b, c, d, e, f, g};
        Arrays.sort(x);
        return x[3];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h) {
        double[] x = new double[]{a, b, c, d, e, f, g, h};
        Arrays.sort(x);
        return x[4];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i};
        Arrays.sort(x);
        return x[4];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j};
        Arrays.sort(x);
        return x[5];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k};
        Arrays.sort(x);
        return x[5];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     * @param j
     * @param k
     * @param l
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l};
        Arrays.sort(x);
        return x[6];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     * @param j
     * @param k
     * @param l
     * @param m
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
        Arrays.sort(x);
        return x[6];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     * @param j
     * @param k
     * @param l
     * @param m
     * @param n
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
        Arrays.sort(x);
        return x[7];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     * @param j
     * @param k
     * @param l
     * @param m
     * @param n
     * @param o
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
        Arrays.sort(x);
        return x[7];
    }

    /**
     * Very looked like median, but if the number of arguments is even, the bigger one is returned.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     * @param j
     * @param k
     * @param l
     * @param m
     * @param n
     * @param o
     * @param p
     * @return
     * @since 2.0
     * @author luiscubal
     */
    public double reversed_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p) {
        double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
        Arrays.sort(x);
        return x[8];
    }

    public double sum(double a) {
        return a;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }

    public double sum(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public double sum(double a, double b, double c, double d, double e) {
        return a + b + c + d + e;
    }

    public double sum(double a, double b, double c, double d, double e, double f) {
        return a + b + c + d + e + f;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g) {
        return a + b + c + d + e + f + g;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h) {
        return a + b + c + d + e + f + g + h;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
        return a + b + c + d + e + f + g + h + i;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        return a + b + c + d + e + f + g + h + i + j;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k) {
        return a + b + c + d + e + f + g + h + i + j + k;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l) {
        return a + b + c + d + e + f + g + h + i + j + k + l;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m) {
        return a + b + c + d + e + f + g + h + i + j + k + l + m;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n) {
        return a + b + c + d + e + f + g + h + i + j + k + l + m + n;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o) {
        return a + b + c + d + e + f + g + h + i + j + k + l + m + n + o;
    }

    public double sum(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p) {
        return a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p;
    }

    public double mult(double a) {
        return a;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double mult(double a, double b, double c) {
        return a * b * c;
    }

    public double mult(double a, double b, double c, double d) {
        return a * b * c * d;
    }

    public double mult(double a, double b, double c, double d, double e) {
        return a * b * c * d * e;
    }

    public double mult(double a, double b, double c, double d, double e, double f) {
        return a * b * c * d * e * f;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g) {
        return a * b * c * d * e * f * g;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h) {
        return a * b * c * d * e * f * g * h;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
        return a * b * c * d * e * f * g * h * i;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        return a * b * c * d * e * f * g * h * i * j;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k) {
        return a * b * c * d * e * f * g * h * i * j * k;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l) {
        return a * b * c * d * e * f * g * h * i * j * k * l;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m) {
        return a * b * c * d * e * f * g * h * i * j * k * l * m;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n) {
        return a * b * c * d * e * f * g * h * i * j * k * l * m * n;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o) {
        return a * b * c * d * e * f * g * h * i * j * k * l * m * n * o;
    }

    public double mult(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p) {
        return a * b * c * d * e * f * g * h * i * j * k * l * m * n * o * p;
    }

    private static void show_message(String str) {
        // show a message
        // pause the room
        basicgame.Current.Paused = true;

        // show the message box
        // Room.center(messagebox);
        // JPanel messagepanel = new messagepanel(str);
        // JButton Ok = new JButton("OK");
        // messagebox.add(new Button("OK"), new Rectangle(0,4,1,1));
        // messagepanel.add_OK();
        // Ok.setLocation(150,90);
        // messagebox = load_Rooms.Room;
        // messagebox.getContentPane().add(BorderLayout.CENTER, messagepanel);
        // messagebox.show();
        popups.show_message(str);
        basicgame.Current.Paused = false;
    }

    /**
     *
     * @param url
     */
    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{String.class});
                openURL.invoke(null, new Object[]{url});
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else {
                // assume Unix or Linux
                String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                if (browser == null) {
                    throw new Exception("Could not find web browser");
                } else {
                    Runtime.getRuntime().exec(new String[]{browser, url});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error attempting to launch web browser:\n" + e.getLocalizedMessage());
        }
    }

    private static void Setup_Functions() {
       
        
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
