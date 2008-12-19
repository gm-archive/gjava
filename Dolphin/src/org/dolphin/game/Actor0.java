package org.dolphin.game;

import java.awt.Graphics2D;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.GMResource;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.String;

public class Actor0 extends Actor {

	public Actor0(double x,double y,double instance_id){
                super("act_1", Game.thegame.loadSprite("wall"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
        
	}

    public void Create(){
    action_move((new String("000001000")), (new Integer(6)));
    }

    @Override
    public void performAlarm(int alarmid) {
        if (alarmid==0)
        {
            System.out.println("alarm event!!!!");

        }
    }

    public void Collision(java.lang.String name)
    {
        if(name.equals("")){}
    }

    @Override
    public void EndStep() throws DestroyException {
        //System.out.println("alarm[0]"+alarm[0]);
    }

    @Override
    public void KeyPressed(int keycode) throws DestroyException {
        
        if (keycode==67){
        action_create_object(new GMResource(Actor0.class),new Integer(10),new Integer(10));
        }
    }

    @Override
    public void KeyReleased(int keycode) throws DestroyException {
        
    }

    public void Keyboard(){
    
    }
    


}
