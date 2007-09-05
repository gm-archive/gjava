/*
 * aurora.java
 * 
 * Created on 24/Ago/2007, 13:32:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

/**
 *
 * @author Luís
 */
public class aurora {
    private static String[] arguments;
    public static Aurwindow window;
    
    public static String[] getargs(){
        return arguments;
    }
    
    public static void main(String[] args){
        arguments = args;
        new SplashScreen();
    }
    
    public static void start(){
        window = new Aurwindow();
    }
}
