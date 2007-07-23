/*
 * Utilities.java
 *
 * Created on December 21, 2006, 2:10 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.gmscript.manifest;

import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Geertjan Wielenga
 */
public class Utilities {
    
    static int indexOfWhite(char[] line){
        int i = line.length;
        while(--i > -1){
            final char c = line[i];
            if(Character.isWhitespace(c)){
                return i;
            }
        }
        return -1;
    }
    
    static int getRowFirstNonWhite(StyledDocument doc, int offset) throws BadLocationException {
        Element lineElement = doc.getParagraphElement(offset);
        int start = lineElement.getStartOffset();
        while (start + 1 < lineElement.getEndOffset()) {
            try {
                if (doc.getText(start, 1).charAt(0) != ' ') {
                    break;
                }
            } catch (BadLocationException ex) {
                throw (BadLocationException)new BadLocationException(
                        "calling getText(" + start + ", " + (start + 1) +
                        ") on doc of length: " + doc.getLength(), start
                        ).initCause(ex);
            }
            start++;
        }
        return start;
    }
    
}
