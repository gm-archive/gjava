/*
 * clipboard.java
 * 
 * Created on 11-Sep-2007, 00:42:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.gcreator.compilers.gjava.java2d.basicgame;

/**
     * <h2>Clipboard Functions</h2>
     * Functions for modifying the Operating system clipboard!
 * Version 1.0
     */
    public class Clipboard {

        
        private static java.awt.datatransfer.Clipboard systemClipboard;
        
        static{
            // setup clipboard
        if (basicgame.Runningas.equals("EApplet")) {
            systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        }
        }
        /**
         * Returns whether there is any text on the clipboard.
         * @return
         */
        public static boolean hasText() {
            Transferable clipboardContents = systemClipboard.getContents(null);
            return clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor) ;
        }

        /**
         * Returns the current text on the clipboard.
         * @return
         */
        public static String getText() {
            Transferable clipboardContents = systemClipboard.getContents(null);
            if (clipboardContents == null) {
                return "";
            } else {
                try {
                    if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                        String returnText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                        return returnText;
                    }
                } catch (UnsupportedFlavorException ufe) {
                } catch (IOException ioe) {
                }
            }
            return "";
        }

        /**
         * Sets the Clipboard to string s.
         * @param s String to set clipboard to
         */
        public static void setText(String s) {
            Transferable transferableText = new StringSelection(s);
            systemClipboard.setContents(transferableText, null);
            
        }
    }
