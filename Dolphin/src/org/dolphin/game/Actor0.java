package org.dolphin.game;

import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Vector;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Game_Information;
import org.dolphin.game.api.components.Sound;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.GMResource;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Boolean;
import org.dolphin.game.api.exceptions.RoomChangedException;
import org.dolphin.game.api.types.Variable;

public class Actor0 extends Actor {

    public Actor0() {
    }

    public Actor0(double x, double y, double instance_id) {
        super("act_1", Game.thegame.loadSprite("wall"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
        self = this;
    }

    public void Create() {
        //action_move((new String("000001000")), (new Integer(6)));
        hspeed = 1;
    //setTimeline_index(new timeline0());
        for (self.setVariable("c",(new Integer(0)));self.getVariable("c").lt((new Integer(7))).getBoolean(); self.setVariable("c",self.getVariable("c") .add((new Integer(1))))) { 
        	self.setVariable("ran",round(random((new Integer(3)))));}
        { 
        	{Actor[] ac =Game.currentRoom.setActorwithname(self.getVariable("i").getActor().getClass()); for (int i = 0; i < ac.length; i++) ac[i].setVariable("letter",self.getVariable("word"+self.getVariable("c")+"]"));};
        	} 
    }

    @Override
    public void performAlarm(int alarmid) {
        if (alarmid == 0) {
            System.out.println("alarm event!!!!");

        }
    }

    public void Collision(java.lang.String name) {
        //if(name.equals("")){}
    }

    @Override
    public void EndStep() throws DestroyException {
        //System.out.println("alarm[0]"+alarm[0]);
    }
    ;

    
    @Override
    public void KeyPressed(int keycode) throws DestroyException {
        // if(!action_if_sound(new String("sound0")).getBoolean())

        //action_sound(new String("sound0"),Boolean.FALSE);
        //action_end_sound(new String("sound0"));
        //setTimeline_index(new timeline0());
        // action_if_empty(new Integer(0),new Integer(0),new Integer(0));
        // action_load_game();
//        {
//            for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
//                Game.currentRoom.instances.get(i).x = 1;
//            }
//        }
        
        //with actor0
        Actor[] ac = Game.currentRoom.with(all);
        for (int i = 0; i < ac.length; i++)
        {
            selfs.push(self);
            self = ac[i];
            {
                //code
                setX(new Integer(1));
            }
            self = selfs.pop();
        }
        


    // System.out.println("x"+Game.currentRoom.getActorwithname(Actor0.class).x);
//        if (keycode==67){
//            self=this;
//            System.out.println("s.hspeed:"+self.hspeed+" hpseed"+hspeed);
//        action_change_object(new GMResource(Actor1.class));
//        System.out.println("!!!!!after: s.hspeed:"+self.hspeed+" hpseed"+hspeed);
//        }
    }

    @Override
    public void KeyReleased(int keycode) throws DestroyException {
    }

    public void Keyboard() {
    }

    public void Step() {
        //if(Game.thegame.bsSound.getAudioRenderer("sound0..wav")!=null)
    }
    
    public int s(){
    	//if(true)
    	return 1;
    	
    	
    }
}
