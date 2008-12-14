package org.dolphin.game;

import java.awt.Color;

import org.dolphin.game.api.components.Room2D;

public class Room1 extends Room2D {
	public Room1(int vectorid){
		super(Game.frame,"caption",30,200,300,Color.GREEN,true,false,1); 
		this.vectorid=vectorid;
	}
}
