/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.macro;

import java.util.*;

/**
 * A list of actions that can be recorded and played
 * @author Luís
 */
public class Macro {
    private Vector<MacroAction> actions = new Vector<MacroAction>();
    private String name;
    public static Macro recordingMacro = null;
    public String author;
    public String description;
    
    //Should this be public?
    public Macro(String name){
        this(name, "", "");
    }
    
    public Macro(String name, String author){
        this(name, author, "");
    }
    
    public Macro(String name, String author, String description){
        this.name = name;
        this.author = author;
        this.description = description;
    }
    
    /**
     * Gets the name of the macro
     * @return The name of the macro
     */
    public String getName(){
        return name;
    }
    
    
    /**
     * Defines a new name for the macro
     * @param name
     */
    public void rename(String name){
        this.name = name;
    }
    
    /**
     * Starts to record a new macro
     * @param name The name of the macro to be recorded
     */
    public static void record(String name){
        recordingMacro = new Macro(name);
    }
    
    
    /**
     * Add a new action to the recording macro
     * @param action The action to be added
     */
    public static void macroAction(MacroAction action){
        if(recordingMacro!=null)
            recordingMacro.actions.add(action);
    }
    
    /**
     * Plays the macro
     */
    public void play(){
        Enumeration<MacroAction> gnum = actions.elements();
        MacroAction macro;
        while(gnum.hasMoreElements()){
            macro = gnum.nextElement();
            macro.play();
        }
    }
    
    /**
     * Plays the macro
     */
    public static void play(Macro macro){
        macro.play();
    }
}
