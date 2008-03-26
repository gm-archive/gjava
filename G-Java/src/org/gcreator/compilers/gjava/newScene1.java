package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.core.*;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.Object;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class newScene1 extends org.gcreator.compilers.gjava.lwjgl.Scene2D {

    newScene1() {
        super(Game.frame,"",60,640,480, new Color(255,51,51));
    
    SortDepth();
    }
    
    private void setupScene() {
      //  instances.add(new TestActor());
        System.out.println("setup scene");
instances.add(new TestActor(new Integer(16),new Integer(90),new Double(1.0)));
instances.add(new TestActor(new Integer(160),new Integer(290),new Double(1.0)));
System.out.println("size"+instances.size());
//instances.add(new TestActor(new Integer(16),new Integer(90),new Double(1.0)));
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        super.init(container);
        setupScene();
    }

}
