 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava;

import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gcreator.compilers.gjava.api.Actor;
import org.gcreator.compilers.gjava.api.DestroyException;
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
        //test gravity
        setGravity(new Double(1));
        System.out.println("h:"+hspeed+"v:"+vspeed);
        instance_create(new Integer(30), new Integer(30), new String("TestActor2"));
        //instance_change(new String("TestActor2"), new Boolean(true));

    }
    Object sid;
    
    @Override
    public void Step(){
        System.out.println("x:"+x+"y:"+y);
        //screen_redraw();
        //return new Object();
//        sprite.BBLeft=94;
//        sprite.BBTop=116;
//        sprite.BBRight=509;
//        sprite.BBBottom=221;
//        x=0;
//        y=0;
        
//        System.out.println("Speed:"+getSpeed());
        
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
        try {
            //super.callEvents();
            System.out.println("call events");
            BeginStep();
            Step();
            EndStep();
            Move();
        } catch (DestroyException ex) {
            //Logger.getLogger(TestActor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    @Override
    public void Create() {
        System.out.println("create event");
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

//    @Override
//    public void Draw_event(Graphics2D g) {
        //draw_sprite_stretched(Game.sprite1,new Integer(1),new Integer(10),new Integer(10),new Integer(310),new Integer(310));
        //draw_clear(getC_black());
//        draw_set_color(getC_aqua());
        //draw_set_color(self.getC_aqua());
//        
//        draw_text(new Integer(10), new Integer(30), new String("FPS:"+getFps()));
        //Game.Current.g2d.drawString("test", 100, 100);
        //test surface
        //draw_rectangle(new Integer(509),new Integer(116),new Integer(94),new Integer(221), new Boolean(true));

        //draw_surface(sid, new Integer(100), new Integer(100));
        //System.out.println("paint");
//    }

//    @Override
//    public void Draw_event() {
//        draw_ellipse(new Integer(1),new Integer(1),new Integer(10),new Integer(10),new Boolean(true));
//    }
}
