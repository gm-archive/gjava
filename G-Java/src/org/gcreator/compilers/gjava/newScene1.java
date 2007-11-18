package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.components.Scene;
import org.gcreator.compilers.gjava.core.*;
import java.awt.Color;

public class newScene1 extends Scene {

    newScene1() {
        super(basicgame.frame,"",60,640,480, new Color(255,0,51));
    }
    private void setupScene() {
instances.add(new newActor1(41,110,1.0));
    }

}
