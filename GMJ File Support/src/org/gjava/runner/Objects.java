package org.gjava.runner;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Objects extends tile
	{
	public String G_JAVA_Object_name, G_JAVA_value;
	
	public Timeline G_JAVA_timeline;
	
	public Path G_JAVA_path;
	
	public double G_JAVA_path_position;

	// local vars:
	public int[] G_JAVA_alarm;

	public int G_JAVA_jii, G_JAVA_xx, G_JAVA_yy;

	public sprite G_JAVA_Object_sprite, G_JAVA_Object_mask;

	public double xstart=0, ystart=0,depth = 0, direction = 0, hspeed = 0, vspeed = 0, gravity = 0, gravdir = 0, gravityh = 0, gravityv = 0,
			friction = 0, point_speed = 0, point_x = 0, point_y = 0,instance_id,x=0,y=0,xprevious=0,yprevious=0;

	public int id, G_JAVA_ii, action_x, action_y,  speed;

	public int solid, G_JAVA_Object_visible, G_JAVA_Object_persistent;

	int G_JAVA_applies_ii = 0;

	public Objects G_JAVA_dt;

	//public static Vector variable_n = new Vector();

	//public static Vector variable_v = new Vector();

	public static Vector G_JAVA_keyboard = new Vector();

	public static Random G_JAVA_random = new Random(149L);

	public int G_JAVA_locali,dir = 0, subimage = 0, csubimage = 0, G_JAVA_i = 0, bbwidth = 10, bbheight = 10, parent;

	public Rectangle G_JAVA_r1;

	public Global global = new Global();

	public boolean G_JAVA_move_towards_point = false, G_JAVA_folow_path = false;

	Objects(int X,int Y,int objid,double instance_id)
		{
		xstart = X;
		ystart = Y;
		this.instance_id = instance_id;
		}

	Objects(int id,String Object_name,int Object_sprite,int Solid,int Visible,int Depth,int Persistent,
			int Parent,int Mask)
		{
		/*
		 * Objects(int id,String Object_name,sprite Object_sprite,sprite Object_mask,double Object_depth, int
		 * Object_solid,int Object_visible,int parent,boolean Object_persistent)
		 */
		this.G_JAVA_alarm = new int[12];
		this.G_JAVA_Object_name = Object_name;
		if (Object_sprite != -1) this.G_JAVA_Object_sprite = basicgame.sprite[Object_sprite];
		this.G_JAVA_Object_visible = Visible;
		this.depth = Depth;
		this.id = id;
		this.solid = Solid;
		this.G_JAVA_move_towards_point = false;
		this.G_JAVA_folow_path = false;
		this.parent = Parent;
		Create_event();
		}

	public void Create_event()
		{
		// Create event goes here
		}

	public void Destroy_event()
		{
		// Destory event goes here
		}

	public void Begin_Step_event()
		{

		}

	public void Alarm()
		{

		}

	public void Step()
		{

		}

	public void decrease_alarms()
		{
		int dd = 0;
		while (dd < 12)
			{
			if (G_JAVA_alarm[dd] > 0)
				{
				G_JAVA_alarm[dd]--;
				}
			dd++;
			}
		}

	public void End_Step_event()
		{

		}

	public void Key_Pressed(int keycode)
		{
		if (!G_JAVA_keyboard.contains(new Integer(keycode)))
			{

			G_JAVA_keyboard.add(0,new Integer(keycode));
			}
		// any key
		if (!G_JAVA_keyboard.contains(new Integer(1)))
			{

			G_JAVA_keyboard.add(0,new Integer(1));
			}
		// evt.consume();
		}

	public void Key_Released(int keycode)
		{
		// remove keyboard
		G_JAVA_ii = G_JAVA_keyboard.size() - 1;
		while (G_JAVA_ii > -1)
			{
			Integer o = (Integer) G_JAVA_keyboard.get(G_JAVA_ii);
			if (o.intValue() == keycode)
				{
				G_JAVA_keyboard.remove(G_JAVA_ii);
				}
			G_JAVA_ii--;
			}
		// evt.consume();
		if (G_JAVA_keyboard.size() == 1)
			{
			G_JAVA_keyboard.remove(0);
			}
		}

	public void Keyboard_event()
		{

		}

	public void Mouse_event()
		{

		}

	public void mouse_Pressed(int keycode,int xx,int yy)
		{

		}

	public synchronized void Key_Typed(KeyEvent evt)
		{
		// evt.consume();
		}

	public void Collision_event()
		{
		Rectangle thisBounds = getBounds((int)X,(int)Y);
		G_JAVA_ii = 0;
		while (G_JAVA_ii < basicgame.Current_room.instances.size())
			{
			Objects o = (Objects) basicgame.Current_room.instances.get(G_JAVA_ii);
			G_JAVA_r1 = o.getBounds((int)(o.x),(int)(o.y));
			if (G_JAVA_r1.intersects(thisBounds))
				{
				if (this.solid == 1)
					{
					X = xprevious;
					Y = yprevious;
					// o.X = o.xprevious;
					// o.Y = o.yprevious;
					}
				}
			G_JAVA_ii++;
			}
		}

	public void Outside()
		{

		}

	public void End_animation()
		{
		}

	public void No_lives()
		{
		}

	public void No_health()
		{
		}

	public void Move()
		{
		// this method will move the object
		xprevious = X;
		yprevious = Y;
		// if ((move_towards_point==true)) {
		// hspeed2 = point_speed * Math.cos((Math.atan2(Y - point_y, point_x-X)*180/Math.PI) * (Math.PI/180));
		// vspeed2 = point_speed * Math.sin((Math.atan2(Y - point_y, point_x-X)*180/Math.PI) * (Math.PI/180));
		// if ((this.X == point_x)&&(this.Y == point_y)) {
		// move_towards_point = false;
		// }

		if (G_JAVA_path !=null)
			{
			if (G_JAVA_path.relative == 0)
				{
				Double vectorx = (Double)(G_JAVA_path.x.get((int)(G_JAVA_path_position)));
				Double vectory = (Double)(G_JAVA_path.y.get((int)(G_JAVA_path_position)));
				double distance = Math.sqrt (((vectorx.doubleValue()-X)*(vectorx.doubleValue()-X)) + ((vectory.doubleValue()-Y)*(vectory.doubleValue()-Y))); 
				X = X + G_JAVA_path.rel_speed * Math.cos((Math.atan2(vectory.doubleValue(), vectorx.doubleValue())*180/Math.PI) * (Math.PI/180));
				Y = Y + G_JAVA_path.rel_speed * Math.sin((Math.atan2(vectory.doubleValue(), vectorx.doubleValue())*180/Math.PI) * (Math.PI/180));

				if (distance-Math.sqrt((X*X)+(Y*Y)) >0)
					{
					}
				else {
				//X = xprevious;
				//Y = yprevious;
				if (G_JAVA_path_position+1 >= G_JAVA_path.points)
					G_JAVA_path_position = 0;
					else
						G_JAVA_path_position++;
				}
				//if ((((Double)(path.x.get(path_position))).equals(new Double(X))) && (((Double)(path.y.get(path_position))).equals(new Double(Y))))
					{
					
					}
				} else {
				
				}
			} else {
		
		X = X + hspeed;// +(int)gravityh;
		Y = Y + vspeed;// +(int)gravityv;
			}
		}

	/*public void set_variable(String variablename,String value)
		{
		// this methods sets local variables for this object
		variable_n.add(0,variablename);
		variable_v.add(0,value);
		}*/

	public Rectangle getBounds(double X,double Y)
		{
		// this.X = X;
		// this.Y = Y;
		if (G_JAVA_Object_sprite == null)
			{
			return new Rectangle(0,0,0,0);

			}
		else
			{

			// bbheight = Object_sprite.sprite_height; //- Object_sprite.BBTop - Object_sprite.BBBottom;
			// bbwidth = Object_sprite.sprite_width; //- Object_sprite.BBLeft - Object_sprite.BBRight;
			bbheight = G_JAVA_Object_sprite.BBBottom - G_JAVA_Object_sprite.BBTop + 1;
			bbwidth = G_JAVA_Object_sprite.BBRight - G_JAVA_Object_sprite.BBLeft + 1;

			Rectangle rect = new Rectangle((int)(X) + G_JAVA_Object_sprite.BBLeft - G_JAVA_Object_sprite.sprite_xoffset,(int)(Y)
					+ G_JAVA_Object_sprite.BBTop - G_JAVA_Object_sprite.sprite_yoffset,bbwidth,bbheight);

			return rect;
			}

		}

	public static boolean get_parent(int id)
		{
		// check if the id is one of this objects parents
		return false;
		}

	public Image get_image()
		{
		return tileimage;
		}

	public void Draw_event(Graphics g)
		{

		if (G_JAVA_Object_visible == 1)
			{

			if (G_JAVA_Object_sprite == null)
				{
				// don't draw sprite
				}
			else
				{
				if (subimage == 0)
					{

					if (csubimage > G_JAVA_Object_sprite.subimages - 1)
						{
						csubimage = 0;

						}
					// draw sprite
					g.drawImage(G_JAVA_Object_sprite.imshow(csubimage),(int) X - G_JAVA_Object_sprite.sprite_xoffset,(int) Y
							- G_JAVA_Object_sprite.sprite_yoffset,null);
					csubimage++;
					}
				else
					{
					// draw the still sprite
					g.drawImage(G_JAVA_Object_sprite.imshow(subimage),(int) X - G_JAVA_Object_sprite.sprite_xoffset,(int) Y
							- G_JAVA_Object_sprite.sprite_yoffset,null);

					}

				}
			// draw bb
			// g.drawRect(getBounds(X,Y).x,getBounds(X,Y).y,getBounds(X,Y).width,getBounds(X,Y).height);
			// }

			}
		// bbheight = Object_sprite.sprite_height; //- Object_sprite.BBTop - Object_sprite.BBBottom;
		// bbwidth = Object_sprite.sprite_width; //- Object_sprite.BBLeft - Object_sprite.BBRight;

		// g.drawRect(X+Object_sprite.BBLeft-Object_sprite.sprite_xoffset ,Y +
		// Object_sprite.BBTop-Object_sprite.sprite_yoffset, bbwidth ,bbheight);
		}
	}