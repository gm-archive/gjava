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
import org.gjava.actoreditor.Action.ActionData;
import org.openide.util.Utilities;

/**
 *
 * @author ali1
 */
public class ActionValue {
    
    public String value,img,code,args;
    public ImageIcon image;
    public String arg0 = "";
    public String arg1 = "";
    public String arg2 = "";
    public String arg3 = "";
    public String arg4 = "";
    public String arg5 = "";
    public String arg6 = "";
    public String arg7 = "";
    
    public  ActionValue(ActionData ad) {
        this.image = new ImageIcon(Utilities.loadImage(ad.img));
        this.value = ad.getDisplayName();
        this.img = ad.img;
        this.code = ad.code;
        this.arg0 = ad.arg0;
        this.arg1 = ad.arg1;
        this.arg2 = ad.arg2;
        this.arg3 = ad.arg3;
        this.arg4 = ad.arg4;
        this.arg5 = ad.arg5;
        this.arg6 = ad.arg6;
        this.arg7 = ad.arg7;
    }
    
    
}
