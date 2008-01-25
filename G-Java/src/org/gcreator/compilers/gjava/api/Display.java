/*
 * Display.java
 * 
 */

package org.gcreator.compilers.gjava.api;

import java.awt.AWTException;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Toolkit;

/**
     * <h2>The Display Functions</h2>
     * <p>The display represents the whole area on the monitor. It has a size, color depth, and a refresh frequency. These settings can normally be changed   though the display properties. For games though, in particular when they run in   full-screen mode, it is important to be able to change these settings. All these   settings can be initialized for the game in the <strong>Project Settings</strong>. For use   during game play the following functions exist. Note though that changing the   settings during game play will result in a time delay as things has to be   rebuilt.</p>
     * Version 1.0
     */
    public class Display {

        static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        static GraphicsDevice gs = ge.getDefaultScreenDevice();
        static DisplayMode dm = gs.getDisplayMode();
        static DisplayMode original = gs.getDisplayMode();

        /**
         * Returns the width of the display in pixels.
         * @return width of the display in pixels.
         * @since 1.0
         */
        public static double getWidth() {
            return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }

        /**
         * Returns the height of the display in pixels.
         * @return height
         * @since 1.0
         */
        public static double getHeight() {
            return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        }

        /**
         * Returns the color depth in bits.
         * @return the color depth in bits.
         * @since 1.0
         */
        public static int getColordepth() {
            // Get number of colors
            int bitDepth = dm.getBitDepth();
            
            if (bitDepth == DisplayMode.BIT_DEPTH_MULTI) {
                // Multiple bit depths are supported in this display mode
                return 0;
            } else {
                return bitDepth;
            }
        }

        /**
         * Returns the refresh frequency of the display.
         * @return frequency
         * @since 1.0
         */
        public static int getFrequency() {
            // Get refresh rate in Hz
            return dm.getRefreshRate();
        }

        /**
         * Sets the width and height of the display in pixels. Returns whether this was successful. (Realize that only certain combinations are allowed.)
         * @param w
         * @param h
         * @return whether this was successful
         * @since 1.0
         */
        public static boolean setSize(int w, int h) {
            DisplayMode displayMode = new DisplayMode(w, h, getColordepth(), getFrequency());
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Exception e) {
                // Desired display mode is not supported; leave full-screen mode
                System.out.println("Error not supported");
                return false;
            }
        }

        /**
         * Sets the color depth. In general only 16 and 32 are allowed values. Returns whether successful.
         * @param coldepth
         * @return whether this was successful
         * @since 1.0
         */
        public static boolean setColordepth(int coldepth) {
            DisplayMode displayMode = new DisplayMode((int) getWidth(), (int) getHeight(), coldepth, getFrequency());
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
         * @since 1.0
         */
        public static boolean setFrequency(double frequency) {
            DisplayMode displayMode = new DisplayMode((int) getWidth(), (int) getHeight(), getColordepth(), (int) frequency);
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
         * @since 1.0
         */
        public static boolean setAll(double w, double h, double frequency, double coldepth) {
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
         * Tests whether the indicated settings are allowed. Returns whether the settings are allowed.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether the settings are allowed.
         * @since 1.0
         */
        public static boolean testAll(double w, double h, double frequency, double coldepth) {
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
         * @since 1.0
         */
        public static void reset() {
            gs.setDisplayMode(original);
        }

        /**
         * Returns the x-coordinate of the mouse on the display.<br>
         * 
         * @return the x-coordinate of the mouse on the display.
         * @since 1.0
         */
        public static double mouseGetX() {
            return MouseInfo.getPointerInfo().getLocation().getX();
        }

        /**
         * Returns the y-coordinate of the mouse on the display.
         * 
         * @return
         * @since 1.0
         */
        public static double mouseGetY() {
            return MouseInfo.getPointerInfo().getLocation().getY();
        }

        /**
         * Sets the position of the mouse on the display to the indicated values.
         * @param x
         * @param y
         * @since 1.0
         */
        public static void mouseSet(double x, double y) {
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.mouseMove((int) x, (int) y);
            } catch (AWTException ex) {
                ex.printStackTrace();
            }
        }
    }

