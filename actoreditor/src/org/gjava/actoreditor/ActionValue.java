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
    public  String description = "";
    public  boolean showrelative=false;
    public  boolean relative=false;
    public  boolean applies=false;
    public ImageIcon image;
    public String arg0 = "";
    public String arg1 = "";
    public String arg2 = "";
    public String arg3 = "";
    public String arg4 = "";
    public String arg5 = "";
    public String arg6 = "";
    public String arg7 = "";
    public String caption0 = "";
    public String caption1 = "";
    public String caption2 = "";
    public String caption3 = "";
    public String caption4 = "";
    public String caption5 = "";
    public String caption6 = "";
    public String caption7 = "";
    
    public  ActionValue(){
    
    }
    
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
        this.caption0 = ad.caption0;
        this.caption1 = ad.caption1;
        this.caption2 = ad.caption2;
        this.caption3 = ad.caption3;
        this.caption4 = ad.caption4;
        this.caption5 = ad.caption5;
        this.caption6 = ad.caption6;
        this.caption7 = ad.caption7;
        this.description = ad.description;
        this.showrelative = ad.showrelative;
        this.relative = ad.relative;
        this.applies = ad.applies;
    }
    
    
}
