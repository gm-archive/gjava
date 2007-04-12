/*
 * ActionValue.java
 *
 * Created on 12 April 2007, 10:10
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import javax.swing.ImageIcon;
import org.openide.util.Utilities;

/**
 *
 * @author ali1
 */
public class ActionValue
{
    
     public String value,img,code;
        public ImageIcon image;
      public  ActionValue(String value, String img, String code)
        {
          this.image = new ImageIcon(Utilities.loadImage(img)); 
          this.value = value;
            this.img = img;
            this.code = code;
        }
   
    
}
