/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava;

import java.awt.Graphics2D;
import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.gcreator.compilers.gjava.api.Actor;
import org.gcreator.compilers.gjava.api.DestroyException;
import org.gcreator.compilers.gjava.api.Object;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.String;
import org.gcreator.compilers.gjava.api.Boolean;
import org.gcreator.compilers.gjava.api.Color;
import org.gcreator.compilers.gjava.api.Variables;

/**
 *
 * @author Ali
 */
public class TestActor2 extends Actor {

    Integer returnvalue = new Integer(0);

    public Object testfunction(Object o, Object o2) {
        return o2;
    }

    public void keyboardright() {
        //Game.game.getGame().bsInput.
        int key = 39;
        if (Game.game.getGame().keyDown(key)) {
        } else if (Game.keymap != null) {

            if (Game.keymap.containsValue(key)) {

                Enumeration e = Game.keymap.keys();
                boolean success = false;
                while (e.hasMoreElements()) {
                    int keycode = ((java.lang.Integer) (e.nextElement())).intValue();
                    int value = ((java.lang.Integer) Game.keymap.get(keycode)).intValue();


                    if (value == key && (Game.game.getGame().keyDown(keycode))) {
                        success = true;
                        break;
                    }
                }
                if (!success) {
                    return;
                }
            }
        } else {
            return;
        }

        {
            System.out.println("right");
        }
    }
    //Vector numbers = new Vector(200);
    Integer[] numbers = new Integer[200];
    Integer o;
    public Integer convert(int i){
        
        try{
    o = numbers[i];
        } catch(Exception e){
    //if (o==null)
    {
   o=new Integer(i);
    numbers[i] = o;
    }
        }
    return o;
    }

    public TestActor2(Object X, Object Y, Object instance_id) {
        super(X, Y, instance_id);
        this.sprite = Game.sprite1;
        System.out.println("testActor2 is created!");
        setSolid(new Integer(1));
        // execute_shell(new String("C:\\game.exe"), new String(""));
        keyboard_set_map(new Integer(38), new Integer(39));


             final Integer arg0=new Integer(10),  arg1 = new Integer(2);
             file_delete(new String("C:\\game33.exe"));
             try{
          // System.out.println("filename_name:"+filename_change_ext(new String("C:\\test\\game.exe"),new String(".exe2")));  
            
                 
            
             }catch(Exception ee){ee.printStackTrace();}
        //test new system
       double start = System.currentTimeMillis();
//       for (double i=0;i<999679999;i++)
//       testfunction(convert(10),convert(2));
       //testfunction(new Integer(10),new Integer(2));
       
       double endt = System.currentTimeMillis()-start;
        System.out.println("endtime:"+endt);
        //end new system

        System.out.println("col:" + window_get_color());
        //window_set_color(new Color(0,0,0));
        window_set_rectangle(new Integer(0), new Integer(0), new Integer(800), new Integer(800));
    //setGravity(new Double(0.01));
    //setFriction(new Double(0.009));
    //setGravity_direction(new Double(0));
    // motion_set(new Double(270), new Double(0.1));
    // motion_add(new Double(90), new Double(0.1));
    // System.out.println("h:"+hspeed+"v:"+vspeed);
    //  System.out.println("copy id:"+instance_copy(new Boolean(false)).getDouble());
//        Object o;
//        test();
    // hspeed=1;
    }

    public void test(Object X, Object Y) {
    }

    @Override
    public void BeginStep() throws DestroyException {
        //System.out.println("pos:"+string_width(new String("test")));
        //keyboardright();
       // System.out.println("lastchar:"+Game.lastchar);
    //  System.out.println("x:"+x+"y:"+y);
//       double start= System.currentTimeMillis();
//       for(int i=0; i<999;i++)
//       {
//          // java.lang.Object o =3;
//           //o=o+4;
////           int o = 0+100+200+i;
////         java.lang.String s = "t"+"e"+"s"+i; 
//          // System.out.println("int:"+((java.lang.Integer)o).intValue());
//           //System.out.println(""+((int)o));
////           (n0).add(n100).mult(n200);
//        (new Integer(0)).add(new Integer(100)).mult(new Integer(200));
//        }
//        double end= System.currentTimeMillis();
//        System.out.println("Time:"+(end-start));
    }//    public void Draw_event(Graphics2D g) {
//        System.out.println("drawid:"+id);
//        if (place_free(new Integer(0), new Integer(0)).getBoolean())
//        {
//            System.out.println("free");
//        } else
//            System.out.println("not free");
//    }
     Integer   n0=new Integer(0), n100 = new Integer(100), n200 = new Integer(200);

    @Override
    public void Draw_event(Graphics2D g) {
        //draw_sprite_stretched(Game.sprite1,new Integer(1),new Integer(10),new Integer(10),new Integer(310),new Integer(310));
        //draw_clear(getC_black());
        draw_set_color(getC_green());
        //Game.Current.g2d.setColor(java.awt.Color.GREEN);
//    self.setVariable("px",(new Integer(3)) .add((new Integer(4)) .mult((new Integer(6)))));
// self.setVariable("py",(new Integer(10)) .add((new Integer(8))));
        draw_text(new Double(x + 10), new Double(y + 10), getFps());
//System.out.println("height:"+string_height(new String("test")));
draw_text_rotated(new Double(x + 10), new Double(y + 10), getFps(), new Integer(180));
//System.out.println("pos:"+string_width(new String("test")));
    // Game.Current.g2d.drawString("fps:"+Game.game.getGame().getCurrentFPS(), n0.getInt(), n10.getInt());
//        
    //draw_text(n0, n10, new String("FPS:"+getFps()));
    // Game.Current.g2d.drawString("test", 100, 100);
    //test surface
    //draw_rectangle(test.setValue(509),test.setValue(116),test.setValue(94),test.setValue(100), new Boolean(true));

    //draw_surface(sid, new Integer(100), new Integer(100));
    //System.out.println("paint");
    }
}
