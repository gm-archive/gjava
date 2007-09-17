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
import javax.crypto.*;

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
    
    static Cipher ecipher;
    static Cipher dcipher;
        static{
            try{
                ecipher = Cipher.getInstance("DES");
                dcipher = Cipher.getInstance("DES");
            }
            catch(Exception e){}
        }
    
        public static String encrypt(String str) {
            try {
                // Encode the string into bytes using utf-8
                byte[] utf8 = str.getBytes("UTF8");
    
                // Encrypt
                byte[] enc = ecipher.doFinal(utf8);
    
                // Encode bytes to base64 to get a string
                return new sun.misc.BASE64Encoder().encode(enc);
            } catch (Exception e) {
            }
            return null;
        }
    
        public static String decrypt(String str) {
            try {
                // Decode base64 to get bytes
                byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
    
                // Decrypt
                byte[] utf8 = dcipher.doFinal(dec);
    
                // Decode using utf-8
                return new String(utf8, "UTF8");
            } catch (Exception e) {
            }
            return null;
        }
}
