package org.dolphin.game;

import java.awt.Graphics2D;
import java.util.Random;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Sound;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.GMResource;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Boolean;

public class Actor0 extends Actor {

	public Actor0(double x,double y,double instance_id){
                super("act_1", Game.thegame.loadSprite("wall"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
        self=this;
	}

    public void Create(){
    //action_move((new String("000001000")), (new Integer(6)));
        hspeed=1;
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
       // if(!action_if_sound(new String("sound0")).getBoolean())
      action_sound(new String("sound0"),Boolean.FALSE);
      action_end_sound(new String("sound0"));
        if (keycode==67){
            self=this;
            System.out.println("s.hspeed:"+self.hspeed+" hpseed"+hspeed);
        action_change_object(new GMResource(Actor1.class));
        System.out.println("!!!!!after: s.hspeed:"+self.hspeed+" hpseed"+hspeed);
        }
    }

    @Override
    public void KeyReleased(int keycode) throws DestroyException {
        
    }

    public void Keyboard(){
    
    }

    public void Step(){
        //if(Game.thegame.bsSound.getAudioRenderer("sound0..wav")!=null)
             }


}
