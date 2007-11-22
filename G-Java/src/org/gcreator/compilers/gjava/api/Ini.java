/*
 * ini.java
 * 
 * Created on 11-Sep-2007, 01:43:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.api.res.INIFile;


/**
     * To pass certain parameter settings to programs a standard mechanism is the use of INI files. INI files contain sections and each section contains a number of name-value pairs. For example, here is a typical INI file:
     * <br>
     * [Form]<br>
     * Top=100<br>
     * Left=100<br>
     * Caption=The best game ever<br>
     * [Game]<br>
     * MaxScore=12324<br>
     * <br>
     * This file contains two sections, one call Form and the other called Game. The first section contains three pairs. The first two have a real value while the third has a string value. Such INI files are easy to create and change.
     *
     */
    public class Ini {
 private static INIFile ini;
        /**
         * Opens the INI file with the given name.
         * @param name
         */
        public static void ini_open(String name) {
            ini = new INIFile(name);
        }

        /**
         * Closes the currently open INI file.
         */
        public static void ini_close() {
            ini.save();
        }

        /**
         * Reads the string value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static String ini_read_string(String section, String key, String def) {
            return ini.getStringProperty(section, key);
        }

        /**
         * Reads the real value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static double ini_read_real(String section, String key, double def) {
            return ini.getDoubleProperty(section, key).doubleValue();
        }

        /**
         * Writes the string value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void ini_write_string(String section, String key, String value) {
            ini.setStringProperty(section, key, value, "");
        }

        /**
         * Writes the real value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void ini_write_real(String section, String key, double value) {
            ini.setDoubleProperty(section, key, value, "");
        }

        /**
         * Returns whether the indicated key exists in the indicated section.
         * @param section
         * @param key
         * @return
         */
        public static boolean ini_key_exists(String section, String key) {
            String[] keys = ini.getPropertyNames(section);
            for (int i = 0; i <= keys.length; i++) {
                if (keys[i].equals(key)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Returns whether the indicated section exists.
         * @param section
         * @return
         */
        public static boolean ini_section_exists(String section) {
            String[] sections = ini.getAllSectionNames();
            for (int i = 0; i <= ini.getTotalSections(); i++) {
                if (sections[i].equals(section)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Deletes the indicated key from the indicated section.
         * @param section
         * @param key
         */
        public static void ini_key_delete(String section, String key) {
            ini.removeProperty(section, key);
        }

        /**
         * Deletes the indicated section.
         * @param section
         */
        public static void ini_section_delete(String section) {
            ini.removeSection(section);
        }
    }

