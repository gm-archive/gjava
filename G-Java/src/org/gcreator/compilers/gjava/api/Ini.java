/*
 * ini.java
 * 
 * Created on 11-Sep-2007, 01:43:52
 * 
 */

package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.api.res.INIFile;


/**
     * Work with .ini files in G-creator!
 * Version 1.0
     */
    public class Ini {
 private static INIFile ini;
        /**
         * Opens the INI file with the given name.
         * @param name
         */
        public static void Open(String name) {
            ini = new INIFile(""+name);
        }

        /**
         * Closes the currently open INI file.
         */
        public static void Close() {
            ini.save();
        }

        /**
         * Reads the string value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static String readString(String section, String key, String def) {
            return new String(ini.getStringProperty(""+section, ""+key));
        }

        /**
         * Reads the real value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static double readReal(String section, String key, double def) {
            return ini.getDoubleProperty(""+section, ""+key).doubleValue();
        }

        /**
         * Writes the string value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void writeString(String section, String key, String value) {
            ini.setStringProperty(""+section, ""+key, ""+value, "");
        }

        /**
         * Writes the real value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void writeReal(String section, String key, double value) {
            ini.setDoubleProperty(""+section, ""+key, value, "");
        }

        /**
         * Returns whether the key exists in the section.
         * @param section
         * @param key
         * @return
         */
        public static boolean keyExists(String section, String key) {
            java.lang.String[] keys = ini.getPropertyNames(""+section);
            for (int i = 0; i <= keys.length; i++) {
                if (keys[i].equals(key)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Returns whether the section exists.
         * @param section
         * @return
         */
        public static boolean sectionExists(String section) {
            java.lang.String[] sections = ini.getAllSectionNames();
            for (int i = 0; i <= ini.getTotalSections(); i++) {
                if (sections[i].equals(section)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Deletes the key from the section.
         * @param section
         * @param key
         */
        public static void keyDelete(String section, String key) {
            ini.removeProperty(""+section, ""+key);
        }

        /**
         * Deletes the section.
         * @param section
         */
        public static void sectionDelete(String section) {
            ini.removeSection(""+section);
        }
    }

