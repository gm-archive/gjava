package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.java2d.basicgame;
import org.gcreator.compilers.gjava.java2d.Scene2D;
import org.gcreator.compilers.gjava.core.*;
import java.awt.Color;

public class newScene1 extends Scene2D {

    newScene1() {
        super(basicgame.frame,"",60,640,480, Color.BLUE);
        setupScene();
        this.SortDepth();
        
    }
    private void setupScene() {
        System.out.println("setup real scene!!!");
instances.add(new newActor1(10,10,1.0));
    }

}
