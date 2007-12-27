/*
 * Platform.java
 * 
 * 
 */

package org.gcreator.compilers.gjava.api;

public class Platform {

        public static String getOsName() {
            return System.getProperty("os.name", "unknown");
        }
        
        public static boolean isWindows(){
            return getOsName().toLowerCase().startsWith("Win");
        }
        
        public static boolean isLinux(){
            return getOsName().toLowerCase().startsWith("Linux") ;
        }
        
        public static boolean isMac(){
            return getOsName().toLowerCase().startsWith("Mac");
        }
        
        public static boolean isSolaris(){
            return getOsName().toLowerCase().startsWith("SunOS");
        }
        
        public static boolean isFreeBSD(){
            return getOsName().toLowerCase().startsWith("FreeBSD");
        }
        
        public static boolean isWindowsXP(){
            return isWindows() && getOsName().toLowerCase().indexOf("xp") > -1;
        }
        
        public static boolean isUnknown(){
            return getOsName().equals("unknown");
        }
        
        public static boolean isWindowsNT(){
            return isWindows() && getOsName().toLowerCase().indexOf("nt") > -1;
        }
        
        public static boolean isWindowsVista(){
            return isWindows() && getOsName().toLowerCase().indexOf("vista") > -1;
        }
        
        public static String getOSVersion(){
            return System.getProperty("os.version", "-1");
        }
        
        public static void printCmd(String message){
            System.out.println(message);
        }
        
        public static void printError(String message){
            System.err.println(message);
        }
    }
