package org.dolphin.game;

import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.AllOfObject;

public class Actor1 extends Actor {

	public Actor1(double x,double y,double instance_id){
                super("act_1", Game.thegame.loadSprite("image"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
        self=this;
	}

    public Actor1() {
		// TODO Auto-generated constructor stub
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
static int i=1;
    @Override
    public void KeyPressed(int keycode) throws DestroyException {

    }

    @Override
    public void KeyReleased(int keycode) throws DestroyException {
        //System.out.println("key released");
    }




}

