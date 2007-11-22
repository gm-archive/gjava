/*
 * popups.java
 * 
 * Created on 11-Sep-2007, 04:12:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.awt.Color;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.gcreator.compilers.gjava.core.basicgame;

/**
     *
     */
    public class Popups {

        /**
         * Displays a dialog box with the string as a message.
         * @param str
         */
        public static void show_message(String str) {
            GScript.msgbox(str, 0);
        }

        /**
         * Displays a question; returns true when the user selects yes and false otherwise.
         * @param str
         * @return
         */
        public static boolean show_question(String str) {
            return JOptionPane.showConfirmDialog(null, str, "Question:", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }

        /**
         * Asks the player in a dialog box for a string. str is the message. def is the default value shown.
         * @param str
         * @param def
         * @return
         */
        public static String get_string(String str, String def) {
            return JOptionPane.showInputDialog(null, str, def);
        }

        /**
         * Asks the player in a dialog box for a number. str is the message. def is the default number shown.
         * @param str
         * @param def
         * @return
         */
        public static double get_integer(String str, double def) {
            return Double.parseDouble(JOptionPane.showInputDialog(null, str, "" + def));
        }

        /**
         * Asks the player for a color. defcol is the default color. If the user presses Cancel the value -1 is returned.
         * @param defcol
         * @return
         */
        public static Color get_color(Color defcol) {
            return new JColorChooser(defcol).showDialog(null, "Choose color", defcol);
        }


        /**
         * Asks the player for a filename to open with the given filter.
         * @param filter You need to create a new FileFilter class
         * @param fname
         * @return
         */
        public static String get_open_filename(javax.swing.filechooser.FileFilter filter, String fname) {
            JFileChooser jfc = new JFileChooser();
            jfc.setSelectedFile(new File(fname));
            jfc.setFileFilter(filter);
            if (jfc.showOpenDialog(null) == (JFileChooser.APPROVE_OPTION)) {
                return jfc.getName();
            } else {
                return "";
            }
        }

        /**
         * Asks for a filename to save with the given filter. If the user presses Cancel an empy string is returned.
         * @param filter
         * @param fname
         * @return
         */
        public static String get_save_filename(javax.swing.filechooser.FileFilter filter, String fname) {
            JFileChooser jfc = new JFileChooser();
            jfc.setSelectedFile(new File(fname));
            jfc.setFileFilter(filter);
            if (jfc.showSaveDialog(null) == (JFileChooser.APPROVE_OPTION)) {
                return jfc.getName();
            } else {
                return "";
            }
        }

        /**
         * Asks for a directory. dname is the default name. If the user presses Cancel an empy string is returned.
         * @param dname
         * @return
         */
        public static String get_directory(String dname) {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.setSelectedFile(new File(dname));
            if (jfc.showOpenDialog(null) == (JFileChooser.APPROVE_OPTION)) {
                return jfc.getName();
            } else {
                return "";
            }
        }

        /**
         * Displays a standard error message (and/or writes it to the log file). abort indicates whether the game should abort.
         * @param str
         * @param abort
         */
        public static void show_error(String str, boolean abort) {
            GScript.msgbox(str, 1);
            if (abort) {
                System.exit(1);
            }
        }
    }

