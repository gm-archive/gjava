package org.gcreator.compilers.gjava;

import java.awt.Color;
//import org.gcreator.compilers.gjava.core.*;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;


public class newScene1 extends org.gcreator.compilers.gjava.gtge.Scene2D {

    newScene1() {
        super(Game.frame,"newScene1",9999,640,480, new Color(155,51,51));
    setupScene();
   // SortDepth();
    }
    
    private void setupScene() {
      System.out.println("setup scene");
     //   backgrounds.add(new Background(true,0,0,0,0,0,0,0,0,0,0,0,0,0,Game.sprite1.imshow()));
instances.add(new TestActor2(new Integer(0),new Integer(0),new Double(100001)));
Game.allinstances.put(100001, "");

//instances.add(new TestActor(new Integer(0),new Integer(0),new Double(1.0)));

//instances.add(new act_1(100,200,1));
System.out.println("instances size:"+instances.size());

//instances.add(new TestActor(new Integer(16),new Integer(90),new Double(1.0)));
    }

////    @Override
////    public void init(GameContainer container) throws SlickException {
////        super.init(container);
////        setupScene();
////    }

}
