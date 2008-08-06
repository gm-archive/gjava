package org.gcreator.compilers.gjava;

import java.awt.Color;
//import org.gcreator.compilers.gjava.core.*;
import org.gcreator.compilers.gjava.api.Integer;
import org.gcreator.compilers.gjava.api.Double;


public class newScene1 extends org.gcreator.compilers.gjava.gtge.Scene2D {

    newScene1() {
        super(Game.frame,"newScene1",9999,640,480, new Color(0,51,51));
    setupScene();
    SortDepth();
    }
    
     private void setupScene() {
instances.add(new wall_object(0,24,100002.0));
instances.add(new wall_object(0,48,100003.0));
instances.add(new wall_object(0,72,100004.0));
instances.add(new wall_object(0,96,100005.0));
instances.add(new wall_object(0,120,100006.0));
instances.add(new wall_object(0,144,100007.0));
instances.add(new wall_object(0,168,100008.0));
instances.add(new wall_object(0,192,100009.0));
instances.add(new wall_object(0,216,100010.0));
instances.add(new wall_object(24,216,100011.0));
instances.add(new wall_object(48,216,100012.0));
instances.add(new wall_object(72,216,100013.0));
instances.add(new wall_object(96,216,100014.0));
instances.add(new wall_object(120,216,100015.0));
instances.add(new wall_object(144,216,100016.0));
instances.add(new wall_object(168,216,100017.0));
instances.add(new wall_object(192,216,100018.0));
instances.add(new wall_object(216,216,100019.0));
instances.add(new wall_object(240,216,100020.0));
instances.add(new wall_object(264,216,100021.0));
instances.add(new wall_object(288,216,100022.0));
instances.add(new wall_object(312,216,100023.0));
instances.add(new wall_object(336,216,100024.0));
instances.add(new wall_object(360,216,100025.0));
instances.add(new wall_object(384,216,100026.0));
instances.add(new wall_object(408,216,100027.0));
instances.add(new wall_object(432,216,100028.0));
instances.add(new wall_object(456,216,100029.0));
instances.add(new wall_object(456,192,100030.0));
instances.add(new wall_object(456,168,100031.0));
instances.add(new wall_object(456,144,100032.0));
instances.add(new wall_object(456,120,100033.0));
instances.add(new wall_object(456,96,100034.0));
instances.add(new wall_object(456,72,100035.0));
instances.add(new wall_object(456,48,100036.0));
instances.add(new wall_object(456,24,100037.0));
instances.add(new wall_object(456,0,100038.0));
instances.add(new wall_object(432,0,100039.0));
instances.add(new wall_object(408,0,100040.0));
instances.add(new wall_object(384,0,100041.0));
instances.add(new wall_object(360,0,100042.0));
instances.add(new wall_object(336,0,100043.0));
instances.add(new wall_object(312,0,100044.0));
instances.add(new wall_object(288,0,100045.0));
instances.add(new wall_object(264,0,100046.0));
instances.add(new wall_object(240,0,100047.0));
instances.add(new wall_object(216,0,100048.0));
instances.add(new wall_object(192,0,100049.0));
instances.add(new wall_object(168,0,100050.0));
instances.add(new wall_object(144,0,100051.0));
instances.add(new wall_object(120,0,100052.0));
instances.add(new wall_object(96,0,100053.0));
instances.add(new wall_object(72,0,100054.0));
instances.add(new wall_object(48,0,100055.0));
instances.add(new wall_object(24,0,100056.0));
instances.add(new wall_object(0,0,100057.0));
instances.add(new ball_object(72,96,100058.0));
instances.add(new ball_object(360,48,100059.0));
    }

////    @Override
////    public void init(GameContainer container) throws SlickException {
////        super.init(container);
////        setupScene();
////    }

}
