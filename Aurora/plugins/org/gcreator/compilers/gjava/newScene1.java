package org.gcreator.compilers.gjava;

import java.awt.Color;
import org.gcreator.compilers.gjava.core.*;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;
import org.gcreator.compilers.gjava.api.components.Background;
public class newScene1 extends org.gcreator.compilers.gjava.gtge.Scene2D {

    newScene1() {
        super(Game.frame,"",60,640,480, new Color(192,192,192));
    setupScene();
    SortDepth();
    }
    private void setupScene() {
instances.add(new newActor1(143,51,1.0));
backgrounds.add(new Background(false,0,0,0,0,0,0,0,0,0,0,0,0,0,null));
    }

}
