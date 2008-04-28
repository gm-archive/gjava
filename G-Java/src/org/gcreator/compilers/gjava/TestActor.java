/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import java.awt.Graphics2D;
import java.io.File;
import org.gcreator.compilers.gjava.api.Actor;
import org.gcreator.compilers.gjava.api.Object;
import org.gcreator.compilers.gjava.api.String;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.Boolean;
import org.gcreator.compilers.gjava.api.components.Sprite;
//import org.newdawn.slick.Image;

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
            
        //sprite = Game.sprite1;
        setSprite_index(Game.sprite1);
            System.out.println("set sprite");
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
//        TestActor a = new TestActor();
//        a.x = 3;
//        a.y = 4;
//        System.out.println("Distance:"+distance_to_object(a)+" from " + x + ", " + y);
//        System.out.println(""+point_direction(new Integer(0),new Integer(0),new Integer(60),new Integer(60)));
//        setSpeed(new Integer(10));
//        System.out.println("Speed"+getSpeed());
//       setDirection(new Double(45));
//       System.out.println("Speed"+getSpeed());
        
       //test file functions
       Object fileid = file_text_open_read(new String("C:\\testG-Java.txt"));
Object str = file_text_read_string(fileid);
System.out.println("Test:"+str.getString());
file_text_close(fileid);

//test sprite func
//setVisible(new Boolean(true));
System.out.println("getBackground_xscale(0):"+getBackground_xscale(0));
setBackground_xscale(0,new Double(9));
System.out.println("getBackground_xscale(0):"+getBackground_xscale(0));

x=0;
y=0;
//test stack
//Object sid = sid = ds_queue_create() ;
//ds_queue_enqueue(sid,new Integer(99)) ;
//ds_queue_enqueue(sid,new Integer(12)) ;
//ds_queue_enqueue(sid,new Integer(24)) ;
//
//show_message(string(ds_queue_size(sid)));//3
// 
//show_message(string(ds_queue_dequeue(sid)));//99
//show_message(string(ds_queue_head(sid)));//12
//show_message(string(ds_queue_tail(sid)));//24

//ds_queue_clear(sid);
//show_message(new String("Ip: ").add(string(mplay_ipaddress())));//1/true
//ds_queue_destroy(sid);
       
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

    @Override
    public void Draw_event(Graphics2D g) {
        //draw_sprite_stretched(Game.sprite1,new Integer(1),new Integer(10),new Integer(10),new Integer(310),new Integer(310));
    //draw_clear(getC_black());
        draw_set_color(make_color_hsv(new Integer(16),new Integer(100),new Integer(100)));
        System.out.println("red:"+color_get_red(draw_get_color()));
        System.out.println("green:"+color_get_green(draw_get_color()));
        System.out.println("blue:"+color_get_blue(draw_get_color()));
        draw_roundrect(new Integer(300),new Integer(300),new Integer(200),new Integer(200),new Boolean(false));
    }

//    @Override
//    public void Draw_event() {
//        draw_ellipse(new Integer(1),new Integer(1),new Integer(10),new Integer(10),new Boolean(true));
//    }
    
   
}
