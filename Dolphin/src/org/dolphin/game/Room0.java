package org.dolphin.game;

import java.awt.Color;

import org.dolphin.game.api.components.Background;
import org.dolphin.game.api.components.Room2D;
import org.dolphin.game.api.components.Tile;
import org.dolphin.game.api.components.View;

public class Room0 extends Room2D {
	public Room0(int vectorid){
		super(Game.frame,"caption works!",30,640,480,Color.BLUE,true,false,1);
		this.vectorid=vectorid;
		
	}
	
	protected void setupScene() {
	    instances.add(new Actor0(10,10,100002));
	    //backgrounds.add(new Background(true,true,0,200,32,32,true,true,true,0,1,0,0,Game.thegame.loadBackground("sprimg_wall_0")));
	    tiles.add(new Tile(100, 100, 0, 0, 32,32, 1, 1, Game.thegame.loadBackground("sprimg_wall_0")));
            //backgrounds.add(new Background(true,true,0,200,32,32,true,true,true,0,1,0,0,Game.thegame.loadBackground("image")));
            this.showviews=true;
            views.add(new View(20,10,200,200,0,10,200,200,1,1,1,1,false));
            views.add(new View(20,10,200,200,300,10,200,200,1,1,1,1,true));
	}
	
	
}
