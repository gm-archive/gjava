/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import java.awt.Graphics2D;
import org.gcreator.compilers.gjava.api.Actor;
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
 * @author Ali
 */
public class TestActor2 extends Actor {
    
    public TestActor2(Object X, Object Y, Object instance_id) {
        super(X,Y,instance_id);
        System.out.println("testActor2 is created!");
      //  System.out.println("copy id:"+instance_copy(new Boolean(false)).getDouble());
//        Object o;
//        test();
    }
    public void test(Object X, Object Y)
    {
        
    }

    @Override
    public void BeginStep() throws DestroyException {
       double start= System.currentTimeMillis();
       for(int i=0; i<999;i++)
       {
          // java.lang.Object o =3;
           //o=o+4;
//           int o = 0+100+200+i;
//         java.lang.String s = "t"+"e"+"s"+i; 
          // System.out.println("int:"+((java.lang.Integer)o).intValue());
           //System.out.println(""+((int)o));
//           (n0).add(n100).mult(n200);
        (new Integer(0)).add(new Integer(100)).mult(new Integer(200));
        }
        double end= System.currentTimeMillis();
        System.out.println("Time:"+(end-start));
    }
    
    
    
    Integer n0=new Integer(0),n100=new Integer(100),n200=new Integer(200);
@Override
    public void Draw_event(Graphics2D g) {
        //draw_sprite_stretched(Game.sprite1,new Integer(1),new Integer(10),new Integer(10),new Integer(310),new Integer(310));
        //draw_clear(getC_black());
        //draw_set_color(getC_green());
    Game.Current.g2d.setColor(java.awt.Color.GREEN);
    self.setVariable("px",(new Integer(3)) .add((new Integer(4)) .mult((new Integer(6)))));
 self.setVariable("py",(new Integer(10)) .add((new Integer(8))));
 draw_text(self.getVariable("px"), self.getVariable("py"),getFps());

        
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
