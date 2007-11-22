/*
 * string.java
 * 
 * Created on 11-Sep-2007, 00:35:44
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.text.DecimalFormat;

/**
     * <h2>String Functions</h2>
     * <p>The following functions deal with characters and string. </p>
     * <p>To use:<br>
     * Functions.string.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after string, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ascivalue = Functions.string.chr(40);</p>
     */
    public class string {

        // String functions
        /**
         * Returns a string containing the character with asci code val.
         * @param v
         * @return
         */
        public static String chr(double v) {
            return "" + (char) (int) v;
        }

        /**
         *  Returns the asci code of the first character in str.
         * @param s
         * @return
         */
        public static double ord(String s) {
            return (int) s.charAt(0);
        }

        /**
         * Turns str into a real number. str can contain a minus sign, a decimal dot and even an exponential part.
         * @param s
         * @return
         */
        public static double real(String s) {
            return Double.parseDouble(s);
        }

        /**
         * Turns the real value into a string using a standard format (no decimal places when it is an integer, and two decimal places otherwise).
         * @param v
         * @return
         */
        public static String string(double v) {
            return "" + v;
        }

        /**
         * Turns val into a string using your own format: tot indicates the total number of places and dec indicated the number of decimal places.
         * @param v
         * @param t
         * @param d
         * @return
         */
        public static String string_format(double v, double t, double d) {
            String form = "";
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
            return df.format(v, new StringBuffer(), null).toString();
        }

        /**
         * Returns the number of characters in the string.
         * @param s
         * @return
         */
        public static double string_length(String s) {
            return s.length();
        }

        /**
         * Returns the position of substr in str (0=no occurrence).
         * @param sub
         * @param s
         * @return
         */
        public static double string_pos(String sub, String s) {
            return s.indexOf(sub) != -1 ? s.indexOf(sub) : 0;
        }

        /**
         * Returns a substring of str, starting at position index, and of length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_copy(String s, double i, double c) {
            return s.substring((int) i, (int) (i + c));
        }

        /**
         * Returns the character in str at position index.
         * @param s
         * @param i
         * @return
         */
        public static String string_char_at(String s, double i) {
            return "" + s.charAt((int) i);
        }

        /**
         * Returns a copy of str with the part removed that starts at position index and has length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_delete(String s, double i, double c) {
            return s.substring(0, (int) i) + s.substring((int) (i + c));
        }

        /**
         * Returns a copy of str with substr added at position index.
         * @param sub
         * @param s
         * @param i
         * @return
         */
        public static String string_insert(String sub, String s, double i) {
            return s.substring(0, (int) i) + sub + s.substring((int) i + 1);
        }

        /**
         * Returns a copy of str with the first occurrence of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace(String s, String sub, String n) {
            return s.replaceFirst(sub, n);
        }

        /**
         * Returns a copy of str with all occurrences of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace_all(String s, String sub, String n) {
            return s.replaceAll(sub, n);
        }

        /**
         * Returns the number of occurrences of substr in str.
         * @param sub
         * @param s
         * @return
         */
        public static double string_count(String sub, String s) {
            int c = 0;
            for (c = 0; s.indexOf(sub) != -1; c++) {
                s.replaceFirst(sub, "");
            }
            return c;
        }

        /**
         * Returns a lowercase copy of str.
         * @param s
         * @return
         */
        public static String string_lower(String s) {
            return s.toLowerCase();
        }

        /**
         * Returns an uppercase copy of str.
         * @param s
         * @return
         */
        public static String string_upper(String s) {
            return s.toUpperCase();
        }

        /**
         * Returns a string consisting of count copies of str.
         * @param s
         * @param c
         * @return
         */
        public static String string_repeat(String s, double c) {
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
        public static String string_letters(String s) {
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
        public static String string_digits(String s) {
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
        public static String string_lettersdigits(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) || ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {
                } else {
                    s.replaceFirst(s.charAt(i) + "", "");
                    i--;
                }
            }
            GScript i = new GScript();

            return s;
        }
    }

