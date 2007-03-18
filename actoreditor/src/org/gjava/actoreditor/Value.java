/*
 * Value.java
 *
 * Created on 04 March 2007, 20:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class Value
    {
        public String value;
        public ImageIcon image;
        public DefaultListModel actions = new DefaultListModel();
        public Value(String value, ImageIcon image,DefaultListModel actions)
        {
            this.value = value;
            this.image = image;
        }
        
    }
