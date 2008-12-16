package org.dolphin.game;

import org.dolphin.game.api.components.Actor;

public class Actor0 extends Actor {

	public Actor0(double x,double y,double instance_id){
                super("act_1", Game.thegame.loadSprite("wall"), true, true, 0, false);
        xstart = x;
        ystart = y;
        this.x = x;
        this.y = y;
        this.instance_id = instance_id;
	}


}
