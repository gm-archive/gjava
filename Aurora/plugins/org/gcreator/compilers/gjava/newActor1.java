package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.api.*; import java.awt.Graphics2D; import org.gcreator.compilers.gjava.api.Actor;import org.gcreator.compilers.gjava.api.Object;import org.gcreator.compilers.gjava.api.String;import org.gcreator.compilers.gjava.api.Integer;import org.gcreator.compilers.gjava.api.Double;import org.gcreator.compilers.gjava.api.Boolean;

public class newActor1 extends Actor {

    newActor1(int X,int Y,double instance_id) {
        super("newActor1", null, false, true, 0, false);
        xstart = X;
        ystart = Y;
        x = X;
        y = Y;
        this.instance_id = instance_id;
    }
  public void Draw_event(Graphics2D g)
    {


    }
  public void Create_event()
    {

 show_message((new String("hello world!")));
    }

}
