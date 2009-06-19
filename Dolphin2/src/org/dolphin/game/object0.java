package org.dolphin.game;
import java.awt.Graphics;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.*;
import org.dolphin.game.api.exceptions.RoomChangedException;
import java.awt.Graphics2D;

public class object0 extends Actor {

 public object0(){}

 public   object0(double X,double Y,double instance_id) {
        super("object0", Game.thegame.loadSprite("sprite0"),true, true, 0.0 , false);
        xstart = X;xprevious=X;yprevious=Y;
        ystart = Y;
        x = X;
        y = Y;
        setObject_index(Game.object0);
        this.instance_id = instance_id;
        self=this;
    }
   public void performAlarm(int alarmid) throws RoomChangedException {
    }
   public void Step() throws DestroyException,RoomChangedException {

 {
{self.setRoom_caption(Variable.add(string(self.getFps()),Variable.add(" Instances:",Variable.add(string(self.getInstance_count()),Variable.add(" col:",string(Global.getVariable("collision")))))));}
}
    }
   public void Collision(java.lang.String name) throws RoomChangedException{
}
   public void Keyboard() throws RoomChangedException {
}
   public void _SpaceKeyPressed(int keycode) throws DestroyException, RoomChangedException {
     if (keycode==32){

 {
for(int G_CREATOR__repeat1=0; G_CREATOR__repeat1<((Double) (100d)); G_CREATOR__repeat1++){
{
instance_create(0d, 0d, (Game.object1));
} }
}
     }
     }
   public void KeyPressed(int keycode) throws DestroyException, RoomChangedException {
if (keycode==32){_SpaceKeyPressed(keycode);}

   }
public void callEvents() throws RoomChangedException {
try{
Alarm();Step();checkCollision();Keyboard();Move();
} catch (DestroyException d) {}
}

}
