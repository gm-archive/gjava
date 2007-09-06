/*
 * utilities.java
 * 
 * Created on 6/Set/2007, 10:52:11
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import managers.*;

/**
 *
 * @author Luís
 */
public class utilities {
    public static void addMessage(int message) {
        addFormatedMessage(message, null, false);
    }

    public static void addStringMessage(String message) {
        addStringFormatedMessage(message, null, false);
    }

    public static void addError(int message) {
        addFormatedMessage(message, "red", true);
    }

    public static void addFormatedMessage(int message, String color, boolean bold) {
        addStringFormatedMessage(LangSupporter.activeLang.getEntry(message), color, bold);
    }

    public static void addStringFormatedMessage(String message, String color, boolean bold) {
        String out = "";
        if (color != null) {
            out += "<font color='" + color + "'>";
        }
        if (bold) {
            out += "<b>";
        }
        out += message;
        if (bold) {
            out += "</b>";
        }
        if (color != null) {
            out += "</font>";
        }
        out += "<br/>";
        
        aurora.output += out;
        if(aurora.window!=null&&aurora.window.console!=null)
            aurora.window.console.setText(aurora.output);
    }
}
