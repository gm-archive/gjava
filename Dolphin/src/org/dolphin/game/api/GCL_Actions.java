/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

import org.dolphin.game.Game;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.types.GMResource;
import org.dolphin.game.api.types.Variable;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.Boolean;

/**
 * This class is used for all the gcl action functions.
 * All Objects should extend this class
 * To use reative use :
 * argument_relative.getBoolean()
 * Only set it to false after it has been true
 *
 * @author TGMG
 */
public class GCL_Actions extends GCL {

public static Variable action_another_room(Variable... obj)
{
return new Variable();
}

public static Variable action_bounce(Variable... obj)
{
   // System.out.println("sign:"+sign(sin(degtorad(point_direction( self.getX(),self.getY(),other.getX(),other.getY()).sub(self.getImage_angle())))));
self.hspeed=-self.hspeed;
self.vspeed=-self.vspeed;
    System.out.println("bounce");
    return new Variable();
}

public static Variable action_cd_pause(Variable... obj)
{
return new Variable();
}

public static Variable action_cd_play(Variable... obj)
{
return new Variable();
}

public static Variable action_cd_playing(Variable... obj)
{
return new Variable();
}

public static Variable action_cd_present(Variable... obj)
{
return new Variable();
}

public static Variable action_cd_resume(Variable... obj)
{
return new Variable();
}

public static Variable action_cd_stop(Variable... obj)
{
return new Variable();
}

public static Variable action_change_object(Variable... obj)
{
return new Variable();
}

public static Variable action_color(Variable... obj)
{
return new Variable();
}

public static Variable action_create_object(Variable... obj)
{
    try{
    if (obj[0] instanceof GMResource){
        Actor a;
        if (argument_relative.getBoolean())
        a = (Actor)((GMResource)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(self.x+obj[1].getDouble(),self.y+obj[2].getDouble(),Game.maxInstanceId);
        else
            a = (Actor)((GMResource)obj[0]).theclass.getConstructor(double.class,double.class,double.class).newInstance(obj[1].getDouble(),obj[2].getDouble(),Game.maxInstanceId);
        Game.maxInstanceId++;
        Game.currentRoom.instances.add(a);
    Game.currentRoom.depth.add(a);
    Game.currentRoom.SortDepth();
    }
    }catch(Exception e){e.printStackTrace();}

return new Variable();
}

public static Variable action_create_object_motion(Variable... obj)
{
return new Variable();
}

public static Variable action_create_object_random(Variable... obj)
{
return new Variable();
}

public static Variable action_current_room(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_arrow(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_background(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_ellipse(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_ellipse_gradient(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_gradient_hor(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_gradient_vert(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_health(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_life(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_life_images(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_line(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_rectangle(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_score(Variable... obj)
{

return new Variable();
}

public static Variable action_draw_sprite(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_text(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_text_transformed(Variable... obj)
{
return new Variable();
}

public static Variable action_draw_variable(Variable... obj)
{
return new Variable();
}

public static Variable action_effect(Variable... obj)
{
return new Variable();
}

public static Variable action_end_game(Variable... obj)
{
return new Variable();
}

public static Variable action_end_sound(Variable... obj)
{
return new Variable();
}

public static Variable action_execute_script(Variable... obj)
{
return new Variable();
}

public static Variable action_font(Variable... obj)
{
return new Variable();
}

public static Variable action_fullscreen(Variable... obj)
{
return new Variable();
}

public static Variable action_highscore_clear(Variable... obj)
{
return new Variable();
}

public static Variable action_highscore_show(Variable... obj)
{
return new Variable();
}

public static Variable action_if(Variable... obj)
{
return new Variable();
}

public static Variable action_if_aligned(Variable... obj)
{
return new Variable();
}

public static Variable action_if_collision(Variable... obj)
{
return new Variable();
}

public static Variable action_if_dice(Variable... obj)
{
return new Variable();
}

public static Variable action_if_empty(Variable... obj)
{
return new Variable();
}

public static Variable action_if_health(Variable... obj)
{
return new Variable();
}

public static Variable action_if_life(Variable... obj)
{
return new Variable();
}

public static Variable action_if_mouse(Variable... obj)
{
return new Variable();
}

public static Variable action_if_next_room(Variable... obj)
{
return new Variable();
}

public static Variable action_if_number(Variable... obj)
{
return new Variable();
}

public static Variable action_if_object(Variable... obj)
{
return new Variable();
}

public static Variable action_if_previous_room(Variable... obj)
{
return new Variable();
}

public static Variable action_if_question(Variable... obj)
{
return new Variable();
}

public static Variable action_if_score(Variable... obj)
{
return new Variable();
}

public static Variable action_if_sound(Variable... obj)
{
return new Variable();
}

public static Variable action_if_variable(Variable... obj)
{
    if (obj[2].getInt() ==0) {
        //System.out.println("action_if_variable, equals:"+obj[0].equals(obj[1]));
    return obj[0].equals(obj[1]);
    }//==
			if (obj[2].getInt() ==1) {//<
                           // System.out.println("action_if_variable, <:"+obj[0].lt(obj[1]));
                            return obj[0].lt(obj[1]);
                        }
			if (obj[2].getInt() ==2) {//">(";
                            //System.out.println("action_if_variable, >:"+obj[0].gt(obj[1]));
                            return obj[0].gt(obj[1]);
                        }
    //System.out.println("action_if_variable, error:"+obj[2]);
return new Variable();
}

public static Variable action_inherited(Variable... obj)
{
return new Variable();
}

public static Variable action_kill_object(Variable... obj)
{
return new Variable();
}

public static Variable action_kill_position(Variable... obj)
{
return new Variable();
}

public static Variable action_linear_step(Variable... obj)
{
return new Variable();
}

public static Variable action_load_game(Variable... obj)
{
return new Variable();
}

public static Variable action_message(Variable obj)
{
    show_message(obj);
return new Variable();
}

public static Variable action_move(Variable dirs, Variable speed)
{
    int no = round(random(string_count(new String("1"),dirs))).getInt()+1;
    System.out.println("no"+no);
    int cur=0;
    self.setSpeed(speed);
    for (int subi = 1; subi <= 9; subi++)
				{
				java.lang.String lcurchar = "" + dirs.toString().substring(subi - 1,subi);
				if (lcurchar.equals("1")){
                                    cur++;
                                    if (cur == no){
                                    if (subi==1){
                                    self.setDirection(new Integer(225));
                                    }
                                    if (subi==2){
                                    self.setDirection(new Integer(270));
                                    }

                                    if (subi==3){
                                    self.setDirection(new Integer(315));
                                    }

                                    if (subi==4){
                                    self.setDirection(new Integer(180));
                                    }

                                    if (subi==5){
                                    self.setSpeed(new Integer(0));//stop
                                    }

                                    if (subi==6){
                                    self.setDirection(new Integer(0));
                                    }
                                    if (subi==7){
                                    self.setDirection(new Integer(135));
                                    }
                                    if (subi==8){
                                    self.setDirection(new Integer(90));
                                    }
                                    if (subi==9){
                                    self.setDirection(new Integer(45));
                                    }
                                    }
                                    //action_move(new Variable[5]);

    }}
return new Variable();
}

public static Variable action_move_contact(Variable... obj)
{
return new Variable();
}

public static Variable action_move_point(Variable... obj)
{
    if (argument_relative.getBoolean())
 return   move_towards_point(obj[0],obj[1],self.getSpeed().add(obj[2]));
    else
        return   move_towards_point(obj[0],obj[1],obj[2]);
}

public static Variable action_move_random(Variable... obj)
{
    move_random(obj[0], obj[1]);
return new Variable();
}

public static Variable action_move_start(Variable... obj)
{
    self.x=self.getXstart().getDouble();
    self.y=self.getYstart().getDouble();
return new Variable();
}

public static Variable action_move_to(Variable... obj)
{
    if (argument_relative.getBoolean()){
    self.x=self.x+obj[0].getDouble();
    self.y=self.y+obj[1].getDouble();
    }
    else
    {
       self.x=obj[0].getDouble();
    self.y=obj[1].getDouble();
    }
    
return new Variable();
}

public static Variable action_next_room(Variable... obj)
{
return new Variable();
}

public static Variable action_partemit_burst(Variable... obj)
{
return new Variable();
}

public static Variable action_partemit_create(Variable... obj)
{
return new Variable();
}

public static Variable action_partemit_destroy(Variable... obj)
{
return new Variable();
}

public static Variable action_partemit_stream(Variable... obj)
{
return new Variable();
}

public static Variable action_partsyst_clear(Variable... obj)
{
return new Variable();
}

public static Variable action_partsyst_create(Variable... obj)
{
return new Variable();
}

public static Variable action_partsyst_destroy(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_color(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_create(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_gravity(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_life(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_secondary(Variable... obj)
{
return new Variable();
}

public static Variable action_parttype_speed(Variable... obj)
{
return new Variable();
}

public static Variable action_path(Variable... obj)
{
return new Variable();
}

public static Variable action_path_end(Variable... obj)
{
return new Variable();
}

public static Variable action_path_position(Variable... obj)
{
return new Variable();
}

public static Variable action_path_speed(Variable... obj)
{
return new Variable();
}

public static Variable action_potential_step(Variable... obj)
{
return new Variable();
}

public static Variable action_previous_room(Variable... obj)
{
return new Variable();
}

public static Variable action_replace_background(Variable... obj)
{
return new Variable();
}

public static Variable action_replace_sound(Variable... obj)
{
return new Variable();
}

public static Variable action_replace_sprite(Variable... obj)
{
return new Variable();
}

public static Variable action_restart_game(Variable... obj)
{
return new Variable();
}

public static Variable action_reverse_xdir(Variable... obj)
{
    self.hspeed=-self.hspeed;
return new Variable();
}

public static Variable action_reverse_ydir(Variable... obj)
{
    self.vspeed=-self.vspeed;
return new Variable();
}

public static Variable action_save_game(Variable... obj)
{
return new Variable();
}

public static Variable action_set_alarm(Variable... obj)
{
return new Variable();
}

public static Variable action_set_caption(Variable... obj)
{
return new Variable();
}

public static Variable action_set_cursor(Variable... obj)
{
return new Variable();
}

public static Variable action_set_friction(Variable... obj)
{
    if (getArgument_relative().getBoolean())
      self.setFriction(self.getFriction().add(obj[0]));
    else
    self.setFriction(obj[0]);
return new Variable();
}

/*
 * TODO: Doesn't add direction when relative
 */
public static Variable action_set_gravity(Variable... obj)
{
    if (argument_relative.getBoolean()){
        self.setGravity(self.getGravity().add(obj[1]));
        self.setGravity_direction(obj[0]);}
 else{
    self.setGravity(obj[1]);
    self.setGravity_direction(obj[0]);
    }
return new Variable();
}

public static Variable action_set_health(Variable... obj)
{
    if (argument_relative.getBoolean())
        setHealth(getHealth().add(obj[0]));
    else
       setHealth(obj[0]);
return new Variable();
}

public static Variable action_set_hspeed(Variable... obj)
{
    
    if (getArgument_relative().getBoolean())
      self.hspeed=self.hspeed+obj[0].getDouble();
    else
    self.hspeed=obj[0].getDouble();
return new Variable();
}

public static Variable action_set_life(Variable... obj)
{
//    if (argument_relative.getBoolean())
//        setLife(obj[0]);
//    else
//        setLife(obj[0]);
return new Variable();
}

public static Variable action_set_motion(Variable... obj)
{
    if (argument_relative.getBoolean())
    {
    motion_add(obj[0],obj[1]);
    }
    else{
    self.setDirection(obj[0]);
    self.setSpeed(obj[1]);
    }
return new Variable();
}

public static Variable action_set_score(Variable score)
{
    if (argument_relative.getBoolean())
        setScore(getScore().add(score));
    else
    setScore(score);
return new Variable();
}

public static Variable action_set_timeline(Variable... obj)
{
return new Variable();
}

public static Variable action_set_timeline_position(Variable... obj)
{
return new Variable();
}

public static Variable action_set_vspeed(Variable... obj)
{
    if (getArgument_relative().getBoolean())
      self.vspeed=self.vspeed+obj[0].getDouble();
    else
    self.vspeed=obj[0].getDouble();
return new Variable();
}

public static Variable action_show_info(Variable... obj)
{
return new Variable();
}

public static Variable action_show_video(Variable... obj)
{
return new Variable();
}

public static Variable action_sleep(Variable... obj)
{
return new Variable();
}

public static Variable action_snap(Variable... obj)
{
   move_snap(obj[0], obj[1]);
return new Variable();
}

public static Variable action_snapshot(Variable... obj)
{
return new Variable();
}

public static Variable action_sound(Variable... obj)
{
return new Variable();
}

public static Variable action_sprite_color(Variable... obj)
{
return new Variable();
}

public static Variable action_sprite_set(Variable... obj)
{
return new Variable();
}

public static Variable action_sprite_transform(Variable... obj)
{
return new Variable();
}

public static Variable action_webpage(Variable... obj)
{
return new Variable();
}

public static Variable action_wrap(Variable... obj)
{
    System.out.println("action_wrap:"+obj[0]);
    if (obj[0].equals(new Integer(0)).getBoolean())
    GCL_Actions.move_wrap(Boolean.TRUE, Boolean.FALSE, new Integer(0));
    else if (obj[0].equals(new Integer(0)).getBoolean())
    GCL_Actions.move_wrap(Boolean.FALSE, Boolean.TRUE, new Integer(0));
    else
        GCL_Actions.move_wrap(Boolean.TRUE, Boolean.TRUE, new Integer(0));
return new Variable();
}
}
