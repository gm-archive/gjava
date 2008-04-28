package org.gcreator.compilers.gjava;

import java.awt.Color;
import org.gcreator.compilers.gjava.core.*;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.Object;
import org.gcreator.compilers.gjava.api.components.Background;


public class newScene1 extends org.gcreator.compilers.gjava.gtge.Scene2D {

    newScene1() {
        super(Game.frame,"",60,640,480, new Color(155,51,51));
    setupScene();
    SortDepth();
    }
    
    private void setupScene() {
      System.out.println("setup scene");
        backgrounds.add(new Background(true,0,0,0,0,0,0,0,0,0,0,0,0,0,Game.sprite1.imshow()));

instances.add(new TestActor(new Integer(0),new Integer(0),new Double(1.0)));
System.out.println("instances size:"+instances.size());
//instances.add(new TestActor(new Integer(16),new Integer(90),new Double(1.0)));
    }

////    @Override
////    public void init(GameContainer container) throws SlickException {
////        super.init(container);
////        setupScene();
////    }

}
