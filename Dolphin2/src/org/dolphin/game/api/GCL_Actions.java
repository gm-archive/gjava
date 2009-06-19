/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.dolphin.game.Game;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Game_Information;
import org.dolphin.game.api.components.Highscore;
import org.dolphin.game.api.components.Path;
import org.dolphin.game.api.components.SaveFile;
import org.dolphin.game.api.exceptions.RoomChangedException;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.AllOfObject;
import org.dolphin.game.api.types.Variable;


/**
 * This class is used for all the gcl action functions.
 * All variables should extend this class
 * To use reative use :
 * argument_relative
 * Only set it to false after it has been true
 *
 * @author TGMG
 */
public class GCL_Actions extends GCL {

public Object action_another_room(Object... obj) throws RoomChangedException
{
    Game.certainRoom(((Double)obj[0]).intValue());
return false;
}

public Object action_bounce(Object... obj)
{
   // System.out.println("sign:"+sign(sin(degtorad(point_direction( self.getX(),self.getY(),other.getX(),other.getY()).sub(self.getImage_angle())))));
self.hspeed=-self.hspeed;
self.vspeed=-self.vspeed;
    //System.out.println("bounce");
    return false;
}

public Object action_cd_pause(Object... obj)
{
return false;
}

public Object action_cd_play(Object... obj)
{
return false;
}

public Object action_cd_playing(Object... obj)
{
return false;
}

public Object action_cd_present(Object... obj)
{
return false;
}

public Object action_cd_resume(Object... obj)
{
return false;
}

public Object action_cd_stop(Object... obj)
{
return false;
}

public Object action_change_object(Object... obj)
{
    
    int thesize=Game.currentRoom.instances.size();
    for (int i = 0; i < thesize; i++) {
        Actor object = Game.currentRoom.instances.elementAt(i);
        
        if (object.instance_id == self.instance_id){
            Actor a=null,s=self;
            try{
                
        a = (Actor)((AllOfObject)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(self.x,self.y+20,self.instance_id);
           
            }catch(Exception e){
            e.printStackTrace();
            }
            
        a.instance_id=s.instance_id;
        a.variables=s.variables;
            
        a.hspeed=(Double)s.getHspeed();
        a.vspeed=s.vspeed;
        a.xstart=s.xstart;
        a.ystart=s.ystart;
        a.gravity=s.gravity;
        a.gravity_direction=s.gravity_direction;
        a.alarm=s.alarm;
        a.friction=s.friction;
        Game.currentRoom.instances.set(i, a);
        Game.currentRoom.depth.set(Game.currentRoom.depth.indexOf(object),a);
        //a.self=self;
        //self=a;
        
        //a.setVspeed(2);
        }
    }
return false;
}

public Object action_color(Object... obj)
{
return false;
}

/*
 * action_create_object needs to be different to instance_create due to relative option
 * make sure to do any changes to both functions
 */
public Object action_create_object(Object... obj)
{
    try{
    if (obj[0] instanceof AllOfObject){
        Actor a;
        if ((Boolean)argument_relative)
        a = (Actor)((AllOfObject)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(self.x+((Double)obj[1]),self.y+((Double)obj[2]),Game.maxInstanceId);
        else
            a = (Actor)((AllOfObject)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(((Double)obj[1]),((Double)obj[2]),Game.maxInstanceId);
        Game.maxInstanceId++;
        Game.currentRoom.instances.add(a);
    Game.currentRoom.depth.add(a);
    Game.currentRoom.SortDepth();
    a.Create();
    return a;
    }
    }catch(Exception e){e.printStackTrace();}

return false;
}

public Object action_create_object_motion(Object... obj)
{
 try{
    if (obj[0] instanceof AllOfObject){
        Actor a;
        if ((Boolean)argument_relative)
        a = (Actor)((AllOfObject)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(self.x+((Double)obj[1]),self.y+((Double)obj[2]),Game.maxInstanceId);
        else
            a = (Actor)((AllOfObject)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(((Double)obj[1]),((Double)obj[2]),Game.maxInstanceId);
        Game.maxInstanceId++;
        Game.currentRoom.instances.add(a);
    Game.currentRoom.depth.add(a);
    Game.currentRoom.SortDepth();
    if ((Boolean)argument_relative){
    a.setSpeed(Variable.add(a.getSpeed(),obj[3]));
    a.setDirection(Variable.add(a.getDirection(),obj[4]));
    } else {
    a.setSpeed(obj[3]);
    a.setDirection(obj[4]);
    }
    }
    }catch(Exception e){e.printStackTrace();}
return false;
}

public Object action_create_object_random(Object... obj)
{

    action_create_object(obj[(int)Math.random(4)],obj[4],obj[5]);
return false;
}

public Object action_current_room(Object... obj) throws RoomChangedException
{
    Game.currentRoom();
return false;
}

public Object action_draw_arrow(Object... obj)
{
return false;
}

public Object action_draw_background(Object... obj)
{
return false;
}

public Object action_draw_ellipse(Object... obj)
{
return false;
}

public Object action_draw_ellipse_gradient(Object... obj)
{
return false;
}

public Object action_draw_gradient_hor(Object... obj)
{
return false;
}

public Object action_draw_gradient_vert(Object... obj)
{
return false;
}

public Object action_draw_health(Object... obj)
{
	//uses numbers to select the colour
	Object prev = draw_get_color();
	
	
	//background color
	double num = (Double)obj[4];
	if (num==1)
	draw_set_color(getC_black());
	else if (num==2)
		draw_set_color(getC_dkgray());
	else if (num==3)
		draw_set_color(getC_silver());
	else if (num==4)
		draw_set_color(getC_white());
	else if (num==5)
		draw_set_color(getC_maroon());
	else if (num==6)
		draw_set_color(getC_green());
	else if (num==7)
		draw_set_color(getC_olive());
	else if (num==8)
		draw_set_color(getC_navy());
	else if (num==9)
		draw_set_color(getC_purple());
	else if (num==10)
		draw_set_color(getC_teal());
	else if (num==11)
		draw_set_color(getC_red());
	else if (num==12)
		draw_set_color(getC_lime());
	else if (num==13)
		draw_set_color(getC_yellow());
	else if (num==14)
		draw_set_color(getC_blue());
	else if (num==15)
		draw_set_color(getC_fuchsia());
	else if (num==16)
		draw_set_color(getC_aqua());
	if (num!=0)
		draw_rectangle(obj[0], obj[1],obj[2], obj[3], false);
	
	
	//foreground color
	System.out.println("action_draw_health color:"+obj[5]);
	num = (Double)obj[5];
	num--;
	//num=0 and num=-1 are different
	if (num==1)
	draw_set_color(getC_black());
	else if (num==2)
		draw_set_color(getC_dkgray());
	else if (num==3)
		draw_set_color(getC_silver());
	else if (num==4)
		draw_set_color(getC_white());
	else if (num==5)
		draw_set_color(getC_maroon());
	else if (num==6)
		draw_set_color(getC_green());
	else if (num==7)
		draw_set_color(getC_olive());
	else if (num==8)
		draw_set_color(getC_navy());
	else if (num==9)
		draw_set_color(getC_purple());
	else if (num==10)
		draw_set_color(getC_teal());
	else if (num==11)
		draw_set_color(getC_red());
	else if (num==12)
		draw_set_color(getC_lime());
	else if (num==13)
		draw_set_color(getC_yellow());
	else if (num==14)
		draw_set_color(getC_blue());
	else if (num==15)
		draw_set_color(getC_fuchsia());
	else if (num==16)
		draw_set_color(getC_aqua());
	if (num>0)
		draw_rectangle(obj[0], obj[1],((Double)getHealth()/100)*(Double)obj[2], obj[3], false);
	
	
	draw_set_color(prev);
return false;
}

public Object action_draw_life(Object... obj)
{
	draw_text(obj[0], obj[1], ""+obj[2]+getLives());
return false;
}

public Object action_draw_life_images(Object... obj)
{
return false;
}

public Object action_draw_line(Object... obj)
{
return false;
}

public Object action_draw_rectangle(Object... obj)
{
return false;
}

public Object action_draw_score(Object... obj)
{
	draw_text(obj[0], obj[1], ""+obj[2]+getScore());
return false;
}

public Object action_draw_sprite(Object... obj)
{
return false;
}

public Object action_draw_text(Object... obj)
{
	draw_text(obj[1], obj[2], obj[0]);
return false;
}

public Object action_draw_text_transformed(Object... obj)
{
return false;
}

public Object action_draw_variable(Object... obj)
{
	draw_text(obj[1], obj[2], obj[0]);
return false;
}

public Object action_effect(Object... obj)
{
return false;
}

public Object action_end_game(Object... obj)
{
    game_end();
return false;
}

public Object action_end_sound(Object... obj)
{
    Game.thegame.loadSound(obj[0].toString()).stop();
return false;
}

public Object action_execute_script(Object... obj)
{
return false;
}

public Object action_font(Object... obj)
{
return false;
}

public Object action_fullscreen(Object... obj)
{
return false;
}

public Object action_highscore_clear(Object... obj)
{
	Highscore.clear();
return false;
}

public Object action_highscore_show(Object... obj)
{
	new Highscore(Game.frame,((Double)getScore()).intValue());
return false;
}

public Object action_if(Object... obj)
{
return obj[0];
}

public Object action_if_aligned(Object... obj)
{
	return place_snapped(obj[0],obj[1]);
}

public Object action_if_collision(Object... obj)
{

if (obj.length>3 && ((Boolean)obj[3])){
        obj[0]=Variable.add(obj[0],self.getX());
        obj[1]=Variable.add(obj[1],self.getY());
    }
    if(((Double)obj[2]) == 0){

    return !(Boolean)(place_free(obj[0],obj[1]));
    }
    else{

    return !(Boolean)place_empty(obj[0],obj[1]);
    }
}

public Object action_if_dice(Object... obj)
{
	if ( (Math.random(((Double)obj[0]))  ) <1){
		return true;
	}
return false;
}

public Object action_if_empty(Object... obj)
{
    if (obj.length>3 && (Boolean)obj[3]){
    	obj[0]=Variable.add(obj[0],self.getX());
    	obj[1]=Variable.add(obj[1],self.getY());
        
    }
    if(((Double)obj[2]) == 0){
        
    return place_free(obj[0],obj[1]);
    }
    else{
       
    return place_empty(obj[0],obj[1]);
    }

}

public Object action_if_health(Object... obj)
{
	if (((Double)obj[1]) ==0)// ==
    {
    return obj[0].equals(getHealth());
    }
			if (((Double)obj[1]) ==1) //>
				{
                            return (Double)obj[0]>((Double)getHealth());
                        }
			if (((Double)obj[1]) ==2) //<
			{
                            return (Double)obj[0]<((Double)getHealth());
                        }
return false;
}

public Object action_if_life(Object... obj)
{
	if (((Double)obj[1]) ==0)// ==
    {
    return obj[0].equals(getLives());
    }
			if (((Double)obj[1]) ==1) //>
				{
                            return (Double)obj[0]>((Double)getLives());
                        }
			if (((Double)obj[1]) ==2) //<
			{
                            return (Double)obj[0]<((Double)getLives());
                        }
    return false;
}

public Object action_if_mouse(Object... obj)
{
	//no=0,left=1,right=2,middle=3
	if ((Double)obj[0] == 0) //nokey
	{
		if (Game.thegame.bsInput.getMousePressed() == Game.thegame.bsInput.NO_BUTTON)
			return true;
		else
			return false;
	}
	else if ((Double)obj[0] == 1) //left
		return (Game.thegame.bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON1));
	else if ((Double)obj[0] == 2) //middle
		return (Game.thegame.bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON3));
	else if ((Double)obj[0] == 3) //middle
		return (Game.thegame.bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON2));
	
	
	return Game.thegame.bsInput.isMousePressed(1);
//return false;
}

public Object action_if_next_room(Object... obj)
{
if(Game.currentRoom.vectorid <Game.rooms.size()-1)
        return true;
    else
        return false;
}

public Object action_if_number(Object... obj)
{
	java.lang.String name="";
    if (obj[0] instanceof AllOfObject){
    name=((AllOfObject)obj[0]).theclass.getName();
    } else{
    name=obj.getClass().getName();
    }
    int number=0;
	for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
		if (Game.currentRoom.instances.elementAt(i) !=null){
            Actor a = (Game.currentRoom.instances.elementAt(i));
           // System.out.println("name:"+name+" a.getClass().getName():"+a.getClass().getName());
            if (a.getClass().getName().equals(name)) {
                     number++;
            }
		}
	}
	
	if (((Double)obj[2]) == 0){
		//equal to
		if( ((Double)obj[1]) == number){
			return true;
		}
		
	}
	else if (((Double)obj[2]) == 1){
		//less than
		if( ((Double)obj[1]) > number){
			return true;
		}
	}
	else if (((Double)obj[2]) == 2){
		//greater than
		if( ((Double)obj[1]) < number){
			return true;
		}
	}
	
	return false;
}

public Object action_if_object(Object... obj)
{
    if (obj.length>3 && (Boolean)obj[3]){
    	obj[1]=Variable.add(obj[1],self.getX());
    	obj[2]=Variable.add(obj[2],self.getX());
    }
    return place_meeting(obj[1],obj[2],obj[0]);
//return false;
}
/*if previous room exists*/
public Object action_if_previous_room(Object... obj)
{
    if(Game.currentRoom.vectorid !=0)
        return true;
    else
        return false;
}

public Object action_if_question(Object... param)
{
	JOptionPane pane = new JOptionPane(
    param[0].toString());
Object[] options = new java.lang.String[] { "Yes", "No" };
pane.setOptions(options);
JDialog dialog = pane.createDialog(null, "");
dialog.show();
Object obj = pane.getValue(); 
int result = -1;
for (int k = 0; k < options.length; k++)
  if (options[k].equals(obj))
    result = k;

if (result==0) return true;
return false;
}

public Object action_if_score(Object... obj)
{
	
	if (((Double)obj[1]) ==0)// ==
    {
    return obj[0].equals(getScore());
    }
			if (((Double)obj[1]) ==1) //>
				{
                            return (Double)obj[0]>((Double)getScore());
                        }
			if (((Double)obj[1]) ==2) //<
			{
                            return (Double)obj[0]<((Double)getScore());
                        }
    
return false;
}

public Object action_if_sound(Object... obj)
{
    if (Game.thegame.loadSound(obj[0].toString()).isPlaying())return true;
return false;
}

public Object action_if_variable(Object... obj)
{
    if (((Double)obj[2]) ==0)// ==
    {
    return obj[0].equals(obj[1]);
    }
			if (((Double)obj[2]) ==1) //<
				{
                            return (Double)obj[0]<((Double)obj[1]);
                        }
			if (((Double)obj[2]) ==2) //>
			{
                            return (Double)obj[0]>((Double)obj[1]);
                        }
    
return false;
}

public Object action_inherited(Object... obj)
{
return false;
}

public Object action_kill_object(Object... obj)
{
    Game.currentRoom.depth.remove(Game.currentRoom.depth.indexOf(self));
    Game.currentRoom.instances.remove(Game.currentRoom.instances.indexOf(self));
return false;
}

public Object action_kill_position(Object... obj)
{
    if((Boolean)argument_relative){
        if(self.getBounds().contains(self.x+((Double)obj[0]), self.y+((Double)obj[1]))){
        self.action_kill_object();}
    } else {
    if(self.getBounds().contains(((Double)obj[0]), ((Double)obj[1]))){
        self.action_kill_object();}}
return false;
}

public Object action_linear_step(Object... obj)
{
return false;
}

public Object action_load_game(Object... obj)
{
        //"C:\\\\Dolphin_save.sav"
        FileInputStream istream = null;
        try {
            istream = new FileInputStream("C:\\\\Dolphin_save.sav");
            ObjectInputStream p = new ObjectInputStream(istream);

            SaveFile sf = (SaveFile)p.readObject();
            Game.rooms=sf.rooms;
            Game.currentRoom=sf.currentRoom;
            System.out.println("size after load:"+Game.currentRoom.instances.size());

            istream.close();

            return false;
        } catch (Exception ex) {
            Logger.getLogger(GCL_Actions.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                istream.close();
            } catch (IOException ex) {
                Logger.getLogger(GCL_Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
}

public Object action_message(Object obj)
{
    show_message(obj);
return false;
}

public Object action_move(Object dirs, Object speed)
{
	System.out.println("action_move speed:"+(Double)speed+ "game4:"+Game.getValueOf(4));
    
	int no = ((Double)round(random(string_count("1",dirs)))).intValue()+1;
    
    int cur=0;
    
    self.setSpeed(speed);
    System.out.println("action_move speed of self:"+self.getSpeed());
    for (int subi = 1; subi <= 9; subi++)
				{
				java.lang.String lcurchar = "" + dirs.toString().substring(subi - 1,subi);
				if (lcurchar.equals("1")){
                                    cur++;
                                    if (cur == no){
                                    if (subi==1){
                                    self.setDirection(225d);
                                    }
                                    if (subi==2){
                                    self.setDirection(270d);
                                    }

                                    if (subi==3){
                                    self.setDirection(315d);
                                    }

                                    if (subi==4){
                                    self.setDirection(180d);
                                    }

                                    if (subi==5){
                                    self.setSpeed(0d);//stop
                                    }

                                    if (subi==6){
                                    self.setDirection(0d);
                                    }
                                    if (subi==7){
                                    self.setDirection(135d);
                                    }
                                    if (subi==8){
                                    self.setDirection(90d);
                                    }
                                    if (subi==9){
                                    self.setDirection(45d);
                                    }
                                    }
                                    //action_move(new Object[5]);

    }}
    
return false;
}

public Object action_move_contact(Object... obj)
{
return false;
}

public Object action_move_point(Object... obj)
{
    if ((Boolean)argument_relative)
 return   move_towards_point(obj[0],obj[1],Variable.add(self.getSpeed(),obj[2]));
    else
        return   move_towards_point(obj[0],obj[1],obj[2]);
}

public Object action_move_random(Object... obj)
{
    move_random(obj[0], obj[1]);
return false;
}

public Object action_move_start(Object... obj)
{
    self.x=(Double)self.getXstart();
    self.y=(Double)self.getYstart();
return false;
}

public Object action_move_to(Object... obj)
{
    if ((Boolean)argument_relative){
    self.x=self.x+((Double)obj[0]);
    self.y=self.y+((Double)obj[1]);
    }
    else
    {
       self.x=((Double)obj[0]);
    self.y=((Double)obj[1]);
    }
    
return false;
}

public Object action_next_room(Object... obj) throws RoomChangedException
{
    Game.nextRoom();
return false;
}

public Object action_partemit_burst(Object... obj)
{
return false;
}

public Object action_partemit_create(Object... obj)
{
return false;
}

public Object action_partemit_destroy(Object... obj)
{
return false;
}

public Object action_partemit_stream(Object... obj)
{
return false;
}

public Object action_partsyst_clear(Object... obj)
{
return false;
}

public Object action_partsyst_create(Object... obj)
{
return false;
}

public Object action_partsyst_destroy(Object... obj)
{
return false;
}

public Object action_parttype_color(Object... obj)
{
return false;
}

public Object action_parttype_create(Object... obj)
{
return false;
}

public Object action_parttype_gravity(Object... obj)
{
return false;
}

public Object action_parttype_life(Object... obj)
{
return false;
}

public Object action_parttype_secondary(Object... obj)
{
return false;
}

public Object action_parttype_speed(Object... obj)
{
return false;
}

public Object action_path(Object... obj)
{
	path_start(obj[0], obj[1], obj[2], obj[3]);
	
return false;
}

public Object action_path_end(Object... obj)
{
	path_end();
return false;
}

public Object action_path_position(Object... obj)
{
return false;
}

public Object action_path_speed(Object... obj)
{
	if ((Boolean)argument_relative)
		self.setPath_speed((Double)self.getPath_speed()+(Double)obj[0]);
	else
	self.setPath_speed(obj[0]);
return false;
}

public Object action_potential_step(Object... obj)
{
return false;
}

public Object action_previous_room(Object... obj) throws RoomChangedException
{
        Game.previousRoom();
return false;
}

public Object action_replace_background(Object... obj)
{
return false;
}

public Object action_replace_sound(Object... obj)
{
return false;
}

public Object action_replace_sprite(Object... obj)
{
return false;
}

public Object action_restart_game(Object... obj)
{
    Game.initRooms();
return false;
}

public Object action_reverse_xdir(Object... obj)
{
    self.hspeed=-self.hspeed;
return false;
}

public Object action_reverse_ydir(Object... obj)
{
    self.vspeed=-self.vspeed;
return false;
}

public Object action_save_game(Object... obj)
{
    try
      {
         /* Scanning for saving file */

         File game = new File( "C:\\\\Dolphin_save.sav" );
         FileOutputStream ostream = new FileOutputStream( game );
         ObjectOutputStream p = new ObjectOutputStream(ostream);
         SaveFile sf = new SaveFile();
         sf.rooms=Game.rooms;
         sf.currentRoom=Game.currentRoom;
          p.writeObject( sf );

         p.flush();
         ostream.close();


      } catch (Exception e) {
         System.out.println( e.getMessage() );
         e.printStackTrace();
      }

return false;
}

public Object action_set_alarm(Object... obj)
{
    self.alarm[(((Double)obj[1]).intValue())]=((Double)obj[0]).intValue();
return false;
}

public Object action_set_caption(Object... obj)
{
	setShow_score((((Double)obj[0])==1)?true:false);
	setCaption_score(obj[1]);
	setShow_lives((((Double)obj[2])==1)?true:false);
	setCaption_lives(obj[3]);
	setShow_health((((Double)obj[4])==1)?true:false);
	setCaption_health(obj[5]);
return false;
}

public Object action_set_cursor(Object... obj)
{
return false;
}

public Object action_set_friction(Object... obj)
{
    if ((Boolean)getArgument_relative())
      self.setFriction(Variable.add(self.getFriction(),obj[0]));
    else
    self.setFriction(obj[0]);
return false;
}

/*
 * TODO: Doesn't add direction when relative
 */
public Object action_set_gravity(Object... obj)
{
    if ((Boolean)argument_relative){
        self.setGravity(Variable.add(self.getGravity(),obj[1]));
        self.setGravity_direction(obj[0]);}
 else{
    self.setGravity(obj[1]);
    self.setGravity_direction(obj[0]);
    }
return false;
}

public Object action_set_health(Object... obj)
{
    if ((Boolean)argument_relative)
        setHealth(Variable.add(getHealth(),obj[0]));
    else
       setHealth(obj[0]);
return false;
}

public Object action_set_hspeed(Object... obj)
{
	if ((Boolean)argument_relative)
   
      self.hspeed=self.hspeed+((Double)obj[0]);
    else
    self.hspeed=((Double)obj[0]);
return false;
}

public Object action_set_life(Object... obj)
{
	if ((Boolean)argument_relative)
        setLives(Variable.add(getLives(),obj[0]));
    else
    setLives(obj[0]);
return false;
}

public Object action_set_motion(Object... obj)
{
    if ((Boolean)argument_relative)
    {
    motion_add(obj[0],obj[1]);
    }
    else{
    self.setDirection(obj[0]);
    self.setSpeed(obj[1]);
    }
return false;
}

public Object action_set_score(Object score)
{
    if ((Boolean)argument_relative)
        setScore(Variable.add(getScore(),score));
    else
    setScore(score);
return false;
}

public Object action_set_timeline(Object... obj)
{
    self.timeline_index=obj[0];
    self.timeline_position=((Double)obj[1]);
return false;
}

public Object action_set_timeline_position(Object... obj)
{
    if ((Boolean)argument_relative)
    self.timeline_position+=((Double)obj[0]);
    else
        self.timeline_position=((Double)obj[0]);
return false;
}

public Object action_set_vspeed(Object... obj)
{
    if ((Boolean) getArgument_relative())
      self.vspeed=self.vspeed+((Double)obj[0]);
    else
    self.vspeed=((Double)obj[0]);
return false;
}

public Object action_show_info(Object... obj)
{
   Game_Information.mainFrame.setVisible(true);
return false;
}

public Object action_show_video(Object... obj)
{
return false;
}

public Object action_sleep(Object... obj)
{
    sleep(obj[0]);
return false;
}

public Object action_snap(Object... obj)
{
   move_snap(obj[0], obj[1]);
return false;
}

public Object action_snapshot(Object... obj)
{
return false;
}

public Object action_sound(Object... obj)
{
	if (obj[1] instanceof Double){
		if ((Double)obj[1] == 1)
			Game.thegame.loadSound(obj[0].toString()).loop();
		else
		    Game.thegame.loadSound(obj[0].toString()).play();
	} else if ((Double)obj[1]==1)
        Game.thegame.loadSound(obj[0].toString()).loop();
    else
    Game.thegame.loadSound(obj[0].toString()).play();
return false;
}

public Object action_sprite_color(Object... obj)
{
return false;
}

public Object action_sprite_set(Object... obj)
{
   // System.out.println("action_sprite_set");
   self.sprite= Game.thegame.loadSprite(obj[0].toString());
   System.out.println("v2 action set sprite to:"+obj[0].toString());
   /*if (((Double)obj[1]) == -1) self.sprite_index=0;
   else
   self.sprite_index=((Double)obj[1]);
   self.sprite_speed=((Double)obj[2]);*/
return false;
}

public Object action_sprite_transform(Object... obj)
{
    System.out.println("action_sprite_transform"+self.instance_id);
    self.setImage_xscale(obj[0]);
    self.setImage_yscale(obj[1]);
    self.setImage_angle(obj[2]);
return false;
}

public Object action_webpage(Object... obj)
{
return false;
}

public Object action_wrap(Object... obj)
{
    System.out.println("action_wrap:"+obj[0]);
    if (obj[0].equals(0d))
    move_wrap(false, false, 0d);
    else if (obj[0].equals(0d))
    move_wrap(false, false, 0d);
    else
        move_wrap(false, false, 0d);
return false;
}
}
