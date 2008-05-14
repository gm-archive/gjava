/*
 * utilities.java
 * 
 * Created on 6/Set/2007, 10:52:11
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.core;

import org.gcreator.managers.*;
import javax.crypto.*;
import java.security.*;
import java.io.*;

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
        
        gcreator.output += out;
        if(gcreator.panel!=null&&gcreator.panel.console!=null)
            gcreator.panel.console.setText(gcreator.output);
    }
    
    static Cipher ecipher;
    static Cipher dcipher;
        static{
            try{
                ecipher = Cipher.getInstance("DES");
                dcipher = Cipher.getInstance("DES");
            }
            catch(Exception e){}
        }
    
        public static String encrypt(String str){
            /*try {
                // Encode the string into bytes using utf-8
                byte[] utf8 = str.getBytes("UTF8");
    
                // Encrypt
                byte[] enc = ecipher.doFinal(utf8);
    
                // Encode bytes to base64 to get a string
                return new sun.misc.BASE64Encoder().encode(enc);
            } catch (Exception e) {
                
            }
            return null;*/
            String output = "";
            int seed = (int) Math.floor(Math.random()*100);
            output += (char) seed;
            char t;
            for(int i = 0; i < str.length(); i++){
                t = str.charAt(i);
                int s = t;
                s+=seed;
                s %= Character.MAX_VALUE;
                t = (char) s;
                output += t; 
            }
            return output;
        }
    
        public static String decrypt(String str) {
            String output = "";
            int seed = str.charAt(0);
            char t;
            for(int i = 1; i < str.length(); i++){
                t = str.charAt(i);
                int s = t;
                s += (Character.MAX_VALUE-seed);
                s %= Character.MAX_VALUE;
                t = (char) s;
                output += t; 
            }
            return output;
        }
}
