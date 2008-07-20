/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
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
        
        /**
     * Copies a file to a specific destination.
     * @param src The file to copy.
     * @param dest The file to copy the file to. If it is a drectory, then
     * the name of the <tt>src</tt> file is used.
     * @return The new file that was created when the file was copied.
     * @throws java.io.IOException if <tt>dest</tt> is a directory and does
     * not exist, or if an error occurs while copying the file.
     */
    public static File copyFile(File src, File dest) throws IOException {
        //long startTime = System.nanoTime();
        if (!src.exists()) {
            throw new IOException("File"+src.getPath()+" does not exist.");
        } else if (dest.isDirectory() && !dest.exists()) {
            throw new IOException("Directory "+dest+" does not exist.");
        }
        if (dest.isDirectory()) {
            dest = new File(dest.getPath()+"/"+src.getName());
        }
        if (!dest.exists()) {
            dest.createNewFile();
        }
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        int data;
        while( (data = in.read()) != -1) {
            out.write(data);
        }
        in.close();
        out.flush();
        out.close();
        /*
        long time = System.nanoTime()-startTime;
        System.out.println("It took "+time+" nano-secoonds to copy "+src.getName());
        System.out.println("(That's "+time*10e9+" seconds.)");
        */
        return dest;
    }
}
