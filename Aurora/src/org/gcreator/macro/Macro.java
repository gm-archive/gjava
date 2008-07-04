/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.macro;

import javax.script.*;
import javax.swing.JOptionPane;

/**
 * A list of actions that can be recorded and played
 * @author Luís
 */
/*public class Macro {
    public String javascript = "";
    private String name;
    public static Macro recordingMacro = null;
    public String author;
    public String description;
    private ScriptEngineManager manager = new ScriptEngineManager();
    
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
    */
    /**
     * Gets the name of the macro
     * @return The name of the macro
     */
    /*public String getName(){
        return name;
    }
    
    */
    /**
     * Defines a new name for the macro
     * @param name
     *//*
    public void rename(String name){
        this.name = name;
    }
    */
    /**
     * Starts to record a new macro
     * @param name The name of the macro to be recorded
     *//*
    public static Macro record(String name){
        return recordingMacro = new Macro(name);
    }
    
    */
    /**
     * Add a new action to the recording macro
     * @param action The action to be added
     *//*
    public static void macroAction(String action){
        if(recordingMacro!=null)
            recordingMacro.javascript += action;
    }
    */
    /**
     * Plays the macro
     *//*
    public void play(){
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try{
            engine.eval(javascript);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(
                    org.gcreator.core.gcreator.panel.getICore().getParentWindow(),
                    "Error executing macro:\n" + e.toString(), "Macro Execution Error", JOptionPane.WARNING_MESSAGE);
        }
        if(recordingMacro!=this) //Avoid cyclic references.
            Macro.macroAction(
                    "org.gcreator.macro.MacroLibrary.playMacroWithName(\"" + getName() + "\");\n");
    }
    */
    /**
     * Plays the macro
     *//*
    public static void play(Macro macro){
        macro.play();
    }
}*/
