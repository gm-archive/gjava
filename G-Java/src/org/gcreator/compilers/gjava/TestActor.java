/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import java.io.File;
import org.gcreator.compilers.gjava.api.Actor;
import org.gcreator.compilers.gjava.api.Object;
import org.gcreator.compilers.gjava.api.String;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Boolean;
import org.gcreator.compilers.gjava.api.components.Sprite;
import org.newdawn.slick.Image;

/**
 *
 * @author TGMG
 */
public class TestActor extends Actor {

   public TestActor()
    {
        super();
    }

    public TestActor(Object X, Object Y, Object instance_id) {
        try {
            
        sprite = new Sprite(new Image[] {new Image("/close.jpg")});
        } catch(Exception e ){
        System.out.println(""+e.getMessage());}
        // super(new String("newActor1"), new Object(), new Boolean(false), new Boolean(false), new Integer(0), new Boolean(false));
         this.xstart =  X.getFloat();
        this.ystart = Y.getFloat();
        this.id = instance_id;
        this.x = X.getFloat();
        this.y = Y.getFloat();
        Create_event();
    }

    @Override
    public Object Create_event() {
       // show_message(new String("Test worked :)"+java.lang.Math.PI));
        x=1;
Object n=new Integer(1),
x1=new Integer(0),
y1=new Integer(0),
x2=new Integer(10),
y2=new Integer(10),
len=new Integer(5),
dir = new Integer(0);

show_message(string(point_direction(x1,y1,x2,y2))); //Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.

show_message(string(clipboard_has_text()));// Returns whether there is any text on the clipboard.
show_message(string(clipboard_get_text()));// Returns the current text on the clipboard.
show_message(string(clipboard_set_text(new String("G-Creator"))));// Sets the string str on the clipboard.


        return null;
    }
    
   
}
