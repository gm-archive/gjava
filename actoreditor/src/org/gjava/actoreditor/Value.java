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
import org.openide.util.Utilities;

public class Value
    {
        public String value,img;
        public ImageIcon image;
        public DefaultListModel actions = new DefaultListModel();
        public Value(String value, String img,DefaultListModel actions)
        {
            this.img = img;
            this.image = new ImageIcon(Utilities.loadImage(img));
            this.value = value;
            
        }
        
    }
