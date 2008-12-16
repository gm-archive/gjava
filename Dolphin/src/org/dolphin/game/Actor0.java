package org.dolphin.game;

import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;

public class Actor0 extends Actor {

	public Actor0(double x,double y,double instance_id){
                super("act_1", Game.thegame.loadSprite("wall"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
        
	}

    @Override
    public void performAlarm(int alarmid) {
        if (alarmid==0)
        {
            System.out.println("alarm event!!!!");
        }
    }

    @Override
    public void EndStep() throws DestroyException {
        //System.out.println("alarm[0]"+alarm[0]);
    }

    @Override
    public void KeyPressed(int keycode) throws DestroyException {
        System.out.println("key pressed");
    }

    @Override
    public void KeyReleased(int keycode) throws DestroyException {
        System.out.println("key released");
    }

    


}
