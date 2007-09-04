/*
 * English.java
 * 
 * Created on 4/Set/2007, 11:22:39
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package languages;

import components.*;
import exceptions.*;

/**
 *
 * @author Luís
 */
public class English extends Dictionary{
    public English(){
        status = "In Development";
        language = "English";
        entry = new String[100];
        entry[0] = "File";
        entry[1] = "Edit";
        entry[2] = "View";
        entry[3] = "Build&Run";
        entry[4] = "Help";
        entry[5] = "New Project";
        entry[6] = "New File";
        entry[7] = "Open Project";
        entry[8] = "Save";
        entry[9] = "Save As";
        entry[10] = "Import File";
        entry[11] = "Export File";
        entry[12] = "Close Project";
        entry[13] = "Exit";
        entry[14] = "Clear Console";
        entry[15] = "Look&Feel";
        entry[16] = "Display mode";
        entry[17] = "Native look";
        entry[18] = "Cross-platform look";
        entry[19] = "Motif look";
        entry[20] = "Tabs";
        entry[21] = "MDI";
        entry[22] = "Display output box";
        entry[23] = "Select language";
        entry[24] = "About";
        entry[25] = "Help"; //The menu item, not the menu itself
        entry[26] = "Welcome!"; //Tab name
        entry[27] = "Help!"; //Tab name
        entry[28] = "Select language"; //Tab name
        entry[29] = "Finished loading application.";
        entry[30] = "Error creating settings file";
        entry[31] = "Error writing settings file";
        entry[32] = "Error reading settings file";
        entry[33] = "Bad settings file structure";
        entry[34] = "Doubled setting node";
        entry[35] = "Missing setting property";
        entry[36] = "Language unavailable";
        entry[37] = "Welcome to Aurora,";
        entry[38] = "the next generation of G-Creator.";
        //Toolbar
	entry[39] = "New"; 
	entry[40] = "Open"; 
	entry[41] = "Save"; 
	entry[42] = "Save As"; 
	entry[43] = "Add Sprite";
	entry[44] = "Add Sound"; 
	entry[45] = "Add Actor";
	entry[46] = "Add Scene";   
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
}
