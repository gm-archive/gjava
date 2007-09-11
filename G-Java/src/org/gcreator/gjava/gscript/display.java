/*
 * display.java
 * 
 * Created on 11-Sep-2007, 00:52:57
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.gjava.gscript;

import java.awt.AWTException;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Toolkit;

/**
     * <h2>The Display Functions</h2>
     * <p>The display represents the whole area on the monitor. It has a size (typically   1024x768, or 1280x1024), a color depth, that is, the number of bits that are   used to represent a single pixel (typically 16 = High Color or 32 = Full Color)   and a refresh frequency, that is, the number of times per second the display is   refreshed (typically between 60 and 120). These settings can normally be changed   though the display properties. For games though, in particular when they run in   full-screen mode, it is important to be able to change these settings. All these   settings can be initialized for the game in the <strong>Project Settings</strong>. For use   during game play the following functions exist. Note though that changing the   settings during game play will result in a time delay as things has to be   rebuilt.</p>
     * <p>To use:<br>
     * Functions.display.<strong>&lt;functionname&gt;</strong>(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after display, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * double w = Functions.display.<strong>display_get_width()</strong>;</p>
     */
    public class display {

        static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        static GraphicsDevice gs = ge.getDefaultScreenDevice();
        static DisplayMode dm = gs.getDisplayMode();
        static DisplayMode original = gs.getDisplayMode();

        /**
         * Returns the width of the display in pixels.
         * @return width of the display in pixels.
         * @since 2.0
         */
        public static double display_get_width() {
            return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }

        /**
         * Returns the height of the display in pixels.
         * @return
         * @since 2.0
         */
        public static double display_get_height() {
            return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        }

        /**
         * Returns the color depth in bits.
         * @return the color depth in bits.
         * @since 2.0
         */
        public static int display_get_colordepth() {
            // Get number of colors
            int bitDepth = dm.getBitDepth();
            if (bitDepth == DisplayMode.BIT_DEPTH_MULTI) {
                // Multiple bit depths are supported in this display mode
                return 0;
            } else {
                return (int) Math.pow(2, bitDepth);
            }
        }

        /**
         * Returns the refresh frequency of the display.
         * @return
         * @since 2.0
         */
        public static int display_get_frequency() {
            // Get refresh rate in Hz
            return dm.getRefreshRate();
        }

        /**
         * Sets the width and height of the display in pixels. Returns whether this was successful. (Realize that only certain combinations are allowed.)
         * @param w
         * @param h
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_size(int w, int h) {
            DisplayMode displayMode = new DisplayMode(w, h, display_get_colordepth(), display_get_frequency());
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }

        /**
         * Sets the color depth. In general only 16 and 32 are allowed values. Returns whether successful.
         * @param coldepth
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_colordepth(int coldepth) {
            DisplayMode displayMode = new DisplayMode((int) display_get_width(), (int) display_get_height(), coldepth, display_get_frequency());
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }

        /**
         * Sets the refresh frequency for the display. Only few frequencies are allowed. Typically you could set this to 60 with a same room speed to get smooth 60 frames per second motion. Returns whether successful.
         * @param frequency
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_frequency(double frequency) {
            DisplayMode displayMode = new DisplayMode((int) display_get_width(), (int) display_get_height(), display_get_colordepth(), (int) frequency);
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }

        /**
         * Sets all at once. Returns whether successful.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether successful.
         * @since 2.0
         */
        public static boolean display_set_all(double w, double h, double frequency, double coldepth) {
            DisplayMode displayMode = new DisplayMode((int) w, (int) h, (int) coldepth, (int) frequency);
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported
                return false;
            }
        }

        /**
         * Tests whether the indicated settings are allowed. It does not change the settings. Returns whether the settings are allowed.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether the settings are allowed.
         * @since 2.0
         */
        public static boolean display_test_all(double w, double h, double frequency, double coldepth) {
            DisplayMode displayMode = new DisplayMode((int) w, (int) h, (int) coldepth, (int) frequency);
            try {
                DisplayMode backup = gs.getDisplayMode();
                gs.setDisplayMode(displayMode);
                gs.setDisplayMode(backup);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported
                return false;
            }
        }

        /**
         * Resets the display settings to the ones when the program was started.
         * @since 2.0
         */
        public static void display_reset() {
            gs.setDisplayMode(original);
        }

        /**
         * Returns the x-coordinate of the mouse on the display.<br>
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return the x-coordinate of the mouse on the display.
         * @since 2.0
         */
        public static double display_mouse_get_x() {
            return MouseInfo.getPointerInfo().getLocation().getX();
        }

        /**
         * Returns the y-coordinate of the mouse on the display.
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return
         * @since 2.0
         */
        public static double display_mouse_get_y() {
            return MouseInfo.getPointerInfo().getLocation().getY();
        }

        /**
         * Sets the position of the mouse on the display to the indicated values.
         * @param x
         * @param y
         * @since 2.0
         */
        public static void display_mouse_set(double x, double y) {
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.mouseMove((int) x, (int) y);
            } catch (AWTException ex) {
                ex.printStackTrace();
            }
        }
    }

