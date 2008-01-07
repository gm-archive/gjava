/*
 * Platform.java
 * 
 * 
 */

package org.gcreator.compilers.gjava.api;

import java.lang.reflect.Method;
import javax.swing.JOptionPane;

public class Platform {
    
    /**
     * Open a webpage in the default webbrowser
     * @param url the website url
     */
    public static void openURL(java.lang.String url) {
        java.lang.String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{java.lang.String.class});
                openURL.invoke(null, new java.lang.Object[]{url});
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else {
                // assume Unix or Linux
                java.lang.String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                java.lang.String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(new java.lang.String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                if (browser == null) {
                    throw new Exception("Could not find web browser");
                } else {
                    Runtime.getRuntime().exec(new java.lang.String[]{browser, url});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error attempting to launch web browser:\n" + e.getLocalizedMessage());
        }
    }


        public static java.lang.String getOsName() {
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
        
        public static java.lang.String getOSVersion(){
            return System.getProperty("os.version", "-1");
        }
        
        public static void printCmd(java.lang.String message){
            System.out.println(message);
        }
        
        public static void printError(java.lang.String message){
            System.err.println(message);
        }
    }
