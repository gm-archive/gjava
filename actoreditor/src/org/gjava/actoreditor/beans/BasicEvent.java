/*
 * BasicEvent.java
 *
 * Created on 28 de Fevereiro de 2007, 13:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor.beans;

import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Porfirio
 */
public class BasicEvent {
    /**
     * The name of the Event
     */
    public String name="";
    /**
     * The text of the Event
     */
    public String text="";
    /**
     * The icon of the Event
     */
    public Icon icon=new ImageIcon(new BufferedImage(16,16,BufferedImage.TYPE_INT_ARGB));
    /** Creates a new instance of BasicEvent */
    public BasicEvent() {
    }
    
}
