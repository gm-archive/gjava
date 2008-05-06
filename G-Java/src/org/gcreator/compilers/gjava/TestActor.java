 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava;

import java.awt.Graphics2D;
import org.gcreator.compilers.gjava.api.Actor;
import org.gcreator.compilers.gjava.api.Object;
import org.gcreator.compilers.gjava.api.String;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.Boolean;
import org.gcreator.compilers.gjava.api.Color;

/**
 *
 * @author TGMG
 */
public class TestActor extends Actor {

    public TestActor() {
        super();
    }
    
    public void KeyPressed(int keycode) {Keypress39(keycode); } public void KeyReleased(int keycode) {Keyrelease37(keycode); }

    public void Keypress39(int keycode){
        System.out.println("keycode:"+keycode);
if (keycode == (39))
    {

 show_message((new String("left release")));
    }
    }
  public void Keyrelease37(int keycode){
if (keycode == (37))
    {

 show_message((new String("left release")));
    }
    }

    public TestActor(Object X, Object Y, Object instance_id) {
        self = this;
        //draw_set_color(self.getC_aqua());
        
        
        double start = System.currentTimeMillis();
        for(int i=0;i<=9999;i++)
        getVariable(new String("argument0"));
        double end = System.currentTimeMillis();
        System.out.println("Time to get var with reflec:"+(end-start));
        
        start = System.currentTimeMillis();
        for(int i=0;i<=9999;i++)
        self.getArgument0();//getVariable(("argument0"));
        end = System.currentTimeMillis();
        System.out.println("time to get var without reflec:"+(end-start));
        
        setVariable(new String("argument0"),new Integer(10));
        System.out.println("2;"+getVariable(new String("argument0")));
        //System.out.println("choose"+choose(new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)));
        //window_set_rectangle(new Integer(0), new Integer(00),new Integer(50), new Integer(50));
        //window_default();
        //set_automatic_draw(new Boolean(false));
        //window_mouse_set(new Integer(0), new Integer(00));
        System.out.println("window_get_x:" + window_get_x());
        

        sid = surface_create(new Integer(300), new Integer(300));
        surface_set_target(sid);
        draw_roundrect(new Integer(300), new Integer(300), new Integer(200), new Integer(200), new Boolean(false));

        surface_reset_target();
//System.out.println(""+color_get_red(surface_getpixel(sid,new Integer(220),new Integer(220))));
//show_error(new String("Test error"),new Boolean(true));
        try {

            //sprite = Game.sprite1;
            setSprite_index(Game.sprite1);
            System.out.println("set sprite");
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        // super(new String("newActor1"), new Object(), new Boolean(false), new Boolean(false), new Integer(0), new Boolean(false));
        this.xstart = X.getFloat();
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
       setSpeed(new Integer(-2));
        System.out.println("Init speed:"+getSpeed());
        setFriction(new Double(0.01));
        
        //test file functions
//        Object fileid = file_text_open_read(new String("C:\\testG-Java.txt"));
//        Object str = file_text_read_string(fileid);
//        System.out.println("Test:" + str.getString());
//        file_text_close(fileid);

//test sprite func
//setVisible(new Boolean(true));
//        System.out.println("getBackground_xscale(0):" + getBackground_xscale(0));
//        setBackground_xscale(0, new Double(9));
//        System.out.println("getBackground_xscale(0):" + getBackground_xscale(0));

        x = 0;
        y = 0;
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
    Object sid;
    
    @Override
    public void Step(){
        //screen_redraw();
        //return new Object();
        sprite.BBLeft=94;
        sprite.BBTop=116;
        sprite.BBRight=509;
        sprite.BBBottom=221;
        x=0;
        y=0;
        
        System.out.println("Speed:"+getSpeed());
        
        checkCollision();
//        System.out.println("left:"+(int)(sprite.BBLeft+x-sprite.sprite_xoffset)); 
//        System.out.println("Top:"+(int)(sprite.BBTop+y-sprite.sprite_yoffset)); 
//        System.out.println("right:"+(int)(x-sprite.sprite_xoffset+sprite.BBRight)); 
//        System.out.println("bottom:"+(int)(y-sprite.sprite_yoffset+sprite.BBBottom)); 
        
               // Game.game.getGame().bsInput.

      // if (Game.game.getGame().checkPosMouse((int)(sprite.BBLeft+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBRight), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMouseReleased(background);.isMousePressed(background);.isMouseDown(java.awt.event.MouseEvent.BUTTON3))
//        if (Game.game.getGame().checkPosMouse(94,221,509,116)) //&& Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON1))
       
       // if (Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON1))
      //  System.out.println("Mouse over!");
            ;
    }

    @Override
    public void checkCollision() {
        double start = System.currentTimeMillis();
        for (int i = 0; i < Game.Current.instances.size(); i++)
        {
        Actor G_Java_a = ((Actor)Game.Current.instances.elementAt(i));
        if (G_Java_a == this) return;
        if (G_Java_a.getBounds().intersects(getBounds()) && G_Java_a instanceof TestActor){
            if (G_Java_a.getSolid().getBoolean()){x=xprevious;y=yprevious;}
                System.out.println("Collided");
            
        }
        }
        double end = System.currentTimeMillis();
        System.out.println("Time taken:"+(end-start));
    }

    
    
    @Override
    public void callEvents() {
        //super.callEvents();
        BeginStep();
        Step();
        EndStep();
        Move();
    }

    
    
    @Override
    public void Create() {

        // show_message(new String("Test worked :)"+java.lang.Math.PI));
        x = 1;
        Object n = new Integer(1),
                x1 = new Integer(0),
                y1 = new Integer(0),
                x2 = new Integer(10),
                y2 = new Integer(10),
                len = new Integer(5),
                dir = new Integer(0);

//show_message(string(point_direction(x1,y1,x2,y2))); //Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.
        x = 17;
        y = 17;
//motion_set(new Integer(90), new Integer(1));
        System.out.println("Snapped:" + place_snapped(new Integer(16), new Integer(16)).getBoolean() + "X:" + self.getX() + "Y" + self.getY());
        move_snap(new Integer(16), new Integer(16));

        System.out.println("Snapped:" + place_snapped(new Integer(16), new Integer(16)).getBoolean() + "X:" + self.getX() + "Y" + self.getY());
        System.out.println("" + getInstance_count().getDouble());

        execute_shell(new String("file:\\\\C:\\\\run.bat"), new String(""));

        show_message(string(getVk_nokey()));


//show_message(string(display_set_size(new Integer(1280),new Integer(80))));
//        return null;
    }

    @Override
    public void Draw_event(Graphics2D g) {
        //draw_sprite_stretched(Game.sprite1,new Integer(1),new Integer(10),new Integer(10),new Integer(310),new Integer(310));
        //draw_clear(getC_black());
        draw_set_color(getC_aqua());
        draw_set_color(self.getC_aqua());
//        
        draw_text(new Integer(0), new Integer(10), new String("FPS:"+getFps()));
        Game.Current.g2d.drawString("test", 100, 100);
        //test surface
        draw_rectangle(new Integer(509),new Integer(116),new Integer(94),new Integer(221), new Boolean(true));

        //draw_surface(sid, new Integer(100), new Integer(100));
        //System.out.println("paint");
    }

//    @Override
//    public void Draw_event() {
//        draw_ellipse(new Integer(1),new Integer(1),new Integer(10),new Integer(10),new Boolean(true));
//    }
}
