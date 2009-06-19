package org.dolphin.game;
import java.awt.Graphics;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.*;
import org.dolphin.game.api.exceptions.RoomChangedException;
import java.awt.Graphics2D;

public class object1 extends Actor {

 public object1(){}

 public   object1(double X,double Y,double instance_id) {
        super("object1", Game.thegame.loadSprite("sprite0"),true, true, 0.0 , false);
        xstart = X;xprevious=X;yprevious=Y;
        ystart = Y;
        x = X;
        y = Y;
        setObject_index(Game.object1);
        this.instance_id = instance_id;
        self=this;
    }
   public void performAlarm(int alarmid) throws RoomChangedException {
    }
   public void Collision(java.lang.String name) throws RoomChangedException{
   if(name.equals("object0")){

 {
{self.setX(0d);}
{Global.setVariable("collision",true);}
}
}
}
   public void Keyboard() throws RoomChangedException {
}
public void callEvents() throws RoomChangedException {
try{
Alarm();checkCollision();Keyboard();Move();
} catch (Exception d) {}
}

}
