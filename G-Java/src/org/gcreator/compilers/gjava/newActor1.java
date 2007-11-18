package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.components.*;

public class newActor1 extends Actor {

    newActor1(int X,int Y,double instance_id) {
        super("newActor1", Game.newSprite1,false, true, 0, false);
        xstart = X;
        ystart = Y;
        this.instance_id = instance_id;
    }

    
    public void Create_event(){
    System.out.println("create");
    }
}
