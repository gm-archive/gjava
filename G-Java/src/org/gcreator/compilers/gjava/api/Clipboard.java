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
     * <p>The following functions deal with the clipboard for storing text. </p>
     * <p>   To use:<br>
     * Functions.clipboard.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after clipboard, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ctext = Functions.clipboard.clipboard_get_text();</p>
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
        public static double clipboard_has_text() {
            Transferable clipboardContents = systemClipboard.getContents(null);
            return clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor) ? 1 : 0;
        }

        /**
         * Returns the current text on the clipboard.
         * @return
         */
        public static String clipboard_get_text() {
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
         * Sets the string str on the clipboard.
         * @param s
         * @return
         */
        public static double clipboard_set_text(String s) {
            Transferable transferableText = new StringSelection(s);
            systemClipboard.setContents(transferableText, null);
            return 0;
        }
    }
