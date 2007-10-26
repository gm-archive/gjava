/*
 * debug.java
 * 
 * Created on 11-Sep-2007, 04:20:25
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

/**
     * Here are some variables and functions that deal with errors.
     */
    public class debug {

        /**
         * Indicates whether an error has occurred, either true or false
         */
        public static boolean error_occurred;
        /**
         * String indicating the last error message
         */
        public static String error_last = "";

        /**
         * 
         * 
         * @param str
         */
        public static void show_debug_message(String str) {
            System.err.println(str);
        }
    }

