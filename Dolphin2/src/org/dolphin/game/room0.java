package org.dolphin.game;

import java.awt.Color;

import org.dolphin.game.api.*;
import org.dolphin.game.api.components.Background;
import org.dolphin.game.api.components.Room2D;
import org.dolphin.game.api.components.Tile;
import org.dolphin.game.api.components.View;
import org.dolphin.game.api.components.*;
import org.dolphin.game.api.types.*;
public class room0 extends org.dolphin.game.api.components.Room2D {

	public room0(int vectorid) {
		super(Game.frame,"",30,640,480,new Color(192,192,192),true,false,0);
          this.vectorid=vectorid;
  }
public void Creation_code(){
 
}

  protected void setupScene() {

    instances.add(new object0(128, 128, 100001));
    /*Create the backgrounds*/
    /*Create the tiles*/
    /*Create the views*/
     this.showviews=false;
createEvents();

  }
}
