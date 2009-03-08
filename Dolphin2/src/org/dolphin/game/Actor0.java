package org.dolphin.game;

import java.awt.Graphics;
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
import org.dolphin.game.api.types.Global;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.Double;
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

		/*{for (int i = 0; i < Game.currentRoom.instances.size(); i++)   Game.currentRoom.instances.get(i).setX(self.getY());}
		
		{for (int i = 0; i < Game.currentRoom.instances.size(); i++)
			Game.currentRoom.instances.get(i).setVariable("s",Game.currentRoom.instances.get(i).getVariable("s").mult(self.getX()));
					//{
				//for (int ii = 0; ii < Game.currentRoom.instances.size(); ii++)   Game.currentRoom.instances.get(i).getVariable("s").mult(self.getX()));}
		}*/
		this.setVariable("s",Game.getValueOf(2));
		this.multVariable("s",Game.getValueOf(20));
		System.out.println("Value:"+this.getVariable("s").getInt());
	}

	Vector ints = new Vector(1);

	public int add(int i1, int i2) {
		return i1 + i2;
	}

	public Variable add(Variable i1, int i2) {
		return new Integer(i1.getInt() + i2);
	}

	public void Create() {
		// action_move((new String("000001000")), (new Integer(6)));
		hspeed = 1;
		// setTimeline_index(new timeline0());
		{
			Actor[] ac = Game.currentRoom.setActorwithname(self
					.getVariable("i").getActor().getClass());
			
			
			
			

			int loc = 1;
			ints = new Vector(5);
			ints.add(1);
			ints.add(2);
			Integer iii = new Integer(9);
			Variable[] vars = {new Variable()};
			Variable v;
			long start = System.currentTimeMillis();
			for (int i = 0; i < 999999; i++) {
				v =  iii.add(Game.getValueOf(1));//550
				//test to see if in new branch
				// add(iii,2);//26 to 52
				// iii.add(iii.getValueOf(2));//50 to 59 (23to78)
				//self.setVariable("s",iii); //448 to 188
				//vars[0]=iii; //275
				//iii.add(iii);// 269 to 331(hashtable),223 to 258
				// self.getVariable("i").add(new Integer(1));
				// self.getVariable("i").add(1);//.);
			}
			long end = System.currentTimeMillis();
			System.out.println("end of loop:" + (end - start));
		}
		self.setX(Game.getValueOf(10));
		self.setY(Game.getValueOf(10));
		while ((self.getX().gt((Game.getValueOf(0)))).getBoolean()) {
			self.setX(self.getX().sub((Game.getValueOf(1))));
			if ((((Boolean.TRUE))).getBoolean())
				break;
			;

			self.setY(self.getY().sub((Game.getValueOf(1))));
		}

		//show_message(self.getX());
		//show_message(self.getY());

		for (self.setVariable("i", (Game.getValueOf(1))); self.getVariable("i")
				.lt((Game.getValueOf(100))).getBoolean(); self.setVariable("i",
				self.getVariable("i").add((Game.getValueOf(1))))) {
			self.setY(self.getY().add((Game.getValueOf(1))));
		}
		//show_message(self.getY());
		
		//{Actor[] ac =Game.currentRoom.setActorwithname(new GMResource(Actor0.class).getActor().getClass()); for (int i = 0; i < ac.length; i++) ac[i].setVariable("uuu",(Game.getValueOf(200)));};
		
	}

	@Override
	public void performAlarm(int alarmid) {
		if (alarmid == 0) {
			System.out.println("alarm event!!!!");

		}
	}

	public void Collision(java.lang.String name) {
		// if(name.equals("")){}
	}

	@Override
	public void EndStep() throws DestroyException {
		// System.out.println("alarm[0]"+alarm[0]);
		// {Actor[] ac
		// =Game.currentRoom.setActorwithname(self.getVariable("targetHandle").getActor().getClass());

	}

	@Override
	public void KeyPressed(int keycode) throws DestroyException {
		System.out.println(""+Game.game.getGame().getMouseX());
		
		
		
		// self.setVariable("letter[3]",Game.currentRoom.getActorwithname(self.getVariable("letter[(Game").getActor().getClass()).getVariable(""+Game.getValueOf(2))+"]");};
		
		// if(!action_if_sound(new String("sound0")).getBoolean())

		// action_sound(new String("sound0"),Boolean.FALSE);
		// action_end_sound(new String("sound0"));
		// setTimeline_index(new timeline0());
		// action_if_empty(new Integer(0),new Integer(0),new Integer(0));
		// action_load_game();
		// {
		// for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
		// Game.currentRoom.instances.get(i).x = 1;
		// }
		// }

		// with actor0
		
		//}

		// System.out.println("x"+Game.currentRoom.getActorwithname(Actor0.class).x);
		// if (keycode==67){
		// self=this;
		// System.out.println("s.hspeed:"+self.hspeed+" hpseed"+hspeed);
		// action_change_object(new GMResource(Actor1.class));
		// System.out.println("!!!!!after: s.hspeed:"+self.hspeed+"
		// hpseed"+hspeed);
		// }
	}

	@Override
	public void KeyReleased(int keycode) throws DestroyException {
	}

	public void Keyboard() {
	}

	public void Step() {
		// if(Game.thegame.bsSound.getAudioRenderer("sound0..wav")!=null)
	}

	public int s() {
		// if(true)
		return 1;

	}

	public void Draw_event(Graphics g) {

	}
}
