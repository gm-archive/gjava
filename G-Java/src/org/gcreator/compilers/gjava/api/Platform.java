/*
 * platform.java
 * 
 * Created on 11-Sep-2007, 04:13:49
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

public class Platform {

        public static String get_os_name() {
            return System.getProperty("os.name", "unknown");
        }
        
        public static boolean is_windows(){
            return get_os_name().toLowerCase().indexOf("windows") > -1;
        }
        
        public static boolean is_linux(){
            return get_os_name().toLowerCase().indexOf("linux") > -1;
        }
        
        public static boolean is_mac(){
            return get_os_name().toLowerCase().indexOf("mac os") > -1;
        }
        
        public static boolean is_solaris(){
            return get_os_name().toLowerCase().indexOf("solaris") > -1;
        }
        
        public static boolean is_free_bsd(){
            return get_os_name().toLowerCase().indexOf("freebsd") > -1;
        }
        
        public static boolean is_windows_xp(){
            return is_windows() && get_os_name().toLowerCase().indexOf("xp") > -1;
        }
        
        public static boolean is_unknown_os(){
            return get_os_name().equals("unknown");
        }
        
        public static boolean is_windows_nt(){
            return is_windows() && get_os_name().toLowerCase().indexOf("nt") > -1;
        }
        
        public static boolean is_windows_vista(){
            return is_windows() && get_os_name().toLowerCase().indexOf("vista") > -1;
        }
        
        public static String get_os_version(){
            return System.getProperty("os.version", "-1");
        }
        
        public static void printCmd(String message){
            System.out.println(message);
        }
        
        public static void printError(String message){
            System.err.println(message);
        }
    }
