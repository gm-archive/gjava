/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api;

import java.text.DecimalFormat;
import org.gcreator.compilers.gjava.api.*;

/**
 * The String class wraps a value of the primitive type string  in an object.
 * In addition, this class provides several methods for manipulating string primatives.
 *
 * @author TGMG
 */
public class String extends org.gcreator.compilers.gjava.api.Object {

    java.lang.String s = "";

    public String(java.lang.String ss) {
        s = ss;
    }
    
    public String(byte[] b) {
        s = new java.lang.String(b);
    }
    
    public String(char[] c) {
        s = new java.lang.String(c);
    }

    /**
     * Returns the value of this String object as a string primitive.
     * @return
     */
    public java.lang.String getPrimitive() {
        return s;
    }

    
    public java.lang.String toString() {
        return s;
    }

    /**
     * Returns a string containing the character with asci code val.
     * @param v
     * @return
     */
    public static java.lang.String chr(double v) {
        return "" + (char) (int) v;
    }
    
     /**
         *  Returns the asci code of the first character in str.
         * @param s
         * @return
         */
        public static double ord(java.lang.String s) {
            return (int) s.charAt(0);
        }
        
           /**
         * Turns val into a string using your own format: tot indicates the total number of places and dec indicated the number of decimal places.
         * @param v
         * @param t
         * @param d
         * @return
         */
        public static java.lang.String stringFormat(double v, double t, double d) {
            java.lang.String form = "";
            for (int i = 0; i < (int) t; i++) {
                form += "0";
            }
            if (d > 0) {
                form += ".";
                for (int i = 0; i < (int) d; i++) {
                    form += "0";
                }
            }
            DecimalFormat df = new DecimalFormat(form);
            return df.format(v, new java.lang.StringBuffer(), null).toString();
        }
        
        /**
         * Returns the number of characters in the string.
         * @param s
         * @return
         */
        public static double length(java.lang.String s) {
            return s.length();
        }
        
        /**
         * Returns the position of substr in str (0=no occurrence).
         * @param sub
         * @param s
         * @return
         */
        public static double pos(java.lang.String sub, java.lang.String s) {
            return s.indexOf(sub) != -1 ? s.indexOf(sub) : 0;
        }
        
        /**
         * Returns a substring of str, starting at position index, and of length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static java.lang.String substring(java.lang.String s, double i, double c) {
            return s.substring((int) i, (int) (i + c));
        }
        
        /**
         * Returns the character in str at position index.
         * @param s
         * @param i
         * @return
         */
        public static java.lang.String charAt(java.lang.String s, double i) {
            return "" + s.charAt((int) i);
        }
        
         /**
         * Returns a copy of str with the part removed that starts at position index and has length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static java.lang.String delete(java.lang.String s, double i, double c) {
            return s.substring(0, (int) i) + s.substring((int) (i + c));
        }
        
          /**
         * Returns a copy of str with substr added at position index.
         * @param sub
         * @param s
         * @param i
         * @return
         */
        public static java.lang.String insert(java.lang.String sub, java.lang.String s, double i) {
            return s.substring(0, (int) i) + sub + s.substring((int) i + 1);
        }
        
        /**
         * Returns a copy of str with the first occurrence of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static java.lang.String replace(java.lang.String s, java.lang.String sub, java.lang.String n) {
            return s.replaceFirst(sub, n);
        }
        
        /**
         * Returns a copy of str with all occurrences of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static java.lang.String replaceAll(java.lang.String s, java.lang.String sub, java.lang.String n) {
            return s.replaceAll(sub, n);
        }
        
         /**
         * Returns the number of occurrences of substr in str.
         * @param sub
         * @param str
         * @return
         */
        public static double count(java.lang.String sub, java.lang.String str) {
            int c = 0;
            for (c = 0; str.indexOf(sub) != -1; c++) {
                str.replaceFirst(sub, "");
            }
            return c;
        }
        
          /**
         * Returns a lowercase copy of str.
         * @param s
         * @return
         */
        public static java.lang.String lower(java.lang.String s) {
            return s.toLowerCase();
        }

        /**
         * Returns an uppercase copy of str.
         * @param s
         * @return
         */
        public static java.lang.String upper(java.lang.String s) {
            return s.toUpperCase();
        }
        
         /**
         * Returns a string consisting of count copies of str.
         * @param s
         * @param c
         * @return
         */
        public static java.lang.String repeat(java.lang.String s, double c) {
            for (int i = 0; i < c - 1; i++) {
                s += s;
            }
            return s;
        }
        
          /**
         * Returns a string that only contains the letters in str.
         * @param s
         * @return
         */
        public static java.lang.String letters(java.lang.String s) {
            for (int i = 0; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)) {
                } else {
                    s.replaceFirst(s.charAt(i) + "", "");
                    i--;
                }
            }
            return s;
        }
        
         /**
         * Returns a string that only contains the digits in str.
         * @param s
         * @return
         */
        public static java.lang.String digits(java.lang.String s) {
            for (int i = 0; i < s.length(); i++) {
                if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                } else {
                    s.replaceFirst(s.charAt(i) + "", "");
                    i--;
                }
            }
            return s;
        }
        
         /**
         * Returns a string that contains the letters and digits in str.
         * @param s
         * @return
         */
        public static java.lang.String lettersDigits(java.lang.String s) {
            for (int i = 0; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) || ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {
                } else {
                    s.replaceFirst(s.charAt(i) + "", "");
                    i--;
                }
            }
            return s;
        }
}
