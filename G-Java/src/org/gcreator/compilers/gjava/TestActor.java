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
import org.gcreator.compilers.gjava.api.Double;
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
        self=this;
        try {
            
        sprite = new Sprite(new Image[] {new Image("/close.jpg")});
        } catch(Exception e ){
        System.out.println(""+e.getMessage());}
        // super(new String("newActor1"), new Object(), new Boolean(false), new Boolean(false), new Integer(0), new Boolean(false));
         this.xstart =  X.getFloat();
        this.ystart = Y.getFloat();
        this.id = instance_id;
        setX(X);
        setY(Y);
      //  Create_event();
       // motion_set(new Integer(90), new Integer(1));
        TestActor a = new TestActor();
        a.x = 10;
        System.out.println("Distance:"+distance_to_object(a)+" from " + x + ", " + y);
        System.out.println(""+point_direction(new Integer(0),new Integer(0),new Integer(60),new Integer(60)));
        setSpeed(new Integer(10));
        System.out.println("Speed"+getSpeed());
       setDirection(new Double(45));
       System.out.println("Speed"+getSpeed());
        
       //test file functions
       Object fileid = file_text_open_write(new String("C:\\testG-Java.txt"));
file_text_write_string(fileid,new String("Test worked!"));
file_text_close(fileid);
       
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

//show_message(string(point_direction(x1,y1,x2,y2))); //Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.
x= 17; 
y=17;
//motion_set(new Integer(90), new Integer(1));
System.out.println("Snapped:"+place_snapped(new Integer(16),new Integer(16)).getBoolean()+"X:"+self.getX()+"Y"+self.getY());
move_snap(new Integer(16),new Integer(16));

System.out.println("Snapped:"+place_snapped(new Integer(16),new Integer(16)).getBoolean()+"X:"+self.getX()+"Y"+self.getY());
System.out.println(""+getInstance_count().getDouble()); 

execute_shell(new String("file:\\\\C:\\\\run.bat"), new String(""));

show_message(string(getVk_nokey()));


//show_message(string(display_set_size(new Integer(1280),new Integer(80))));
return null;
    }
    
   
}
