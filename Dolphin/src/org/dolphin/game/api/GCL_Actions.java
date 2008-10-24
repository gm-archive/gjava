/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

/**
 *
 * Use for releative:
 * if (argument_relative.getBoolean())
 *
 * @author TGMG
 */
public class GCL_Actions extends GCL {

public static Object action_another_room(Object... obj)
{
return new Object();
}

public static Object action_bounce(Object... obj)
{
   // System.out.println("sign:"+sign(sin(degtorad(point_direction( self.getX(),self.getY(),other.getX(),other.getY()).sub(self.getImage_angle())))));
self.hspeed=-self.hspeed;
self.vspeed=-self.vspeed;
    System.out.println("bounce");
    return new Object();
}

public static Object action_cd_pause(Object... obj)
{
return new Object();
}

public static Object action_cd_play(Object... obj)
{
return new Object();
}

public static Object action_cd_playing(Object... obj)
{
return new Object();
}

public static Object action_cd_present(Object... obj)
{
return new Object();
}

public static Object action_cd_resume(Object... obj)
{
return new Object();
}

public static Object action_cd_stop(Object... obj)
{
return new Object();
}

public static Object action_change_object(Object... obj)
{
return new Object();
}

public static Object action_color(Object... obj)
{
return new Object();
}

public static Object action_create_object(Object... obj)
{
return new Object();
}

public static Object action_create_object_motion(Object... obj)
{
return new Object();
}

public static Object action_create_object_random(Object... obj)
{
return new Object();
}

public static Object action_current_room(Object... obj)
{
return new Object();
}

public static Object action_draw_arrow(Object... obj)
{
return new Object();
}

public static Object action_draw_background(Object... obj)
{
return new Object();
}

public static Object action_draw_ellipse(Object... obj)
{
return new Object();
}

public static Object action_draw_ellipse_gradient(Object... obj)
{
return new Object();
}

public static Object action_draw_gradient_hor(Object... obj)
{
return new Object();
}

public static Object action_draw_gradient_vert(Object... obj)
{
return new Object();
}

public static Object action_draw_health(Object... obj)
{
return new Object();
}

public static Object action_draw_life(Object... obj)
{
return new Object();
}

public static Object action_draw_life_images(Object... obj)
{
return new Object();
}

public static Object action_draw_line(Object... obj)
{
return new Object();
}

public static Object action_draw_rectangle(Object... obj)
{
return new Object();
}

public static Object action_draw_score(Object... obj)
{

return new Object();
}

public static Object action_draw_sprite(Object... obj)
{
return new Object();
}

public static Object action_draw_text(Object... obj)
{
return new Object();
}

public static Object action_draw_text_transformed(Object... obj)
{
return new Object();
}

public static Object action_draw_variable(Object... obj)
{
return new Object();
}

public static Object action_effect(Object... obj)
{
return new Object();
}

public static Object action_end_game(Object... obj)
{
return new Object();
}

public static Object action_end_sound(Object... obj)
{
return new Object();
}

public static Object action_execute_script(Object... obj)
{
return new Object();
}

public static Object action_font(Object... obj)
{
return new Object();
}

public static Object action_fullscreen(Object... obj)
{
return new Object();
}

public static Object action_highscore_clear(Object... obj)
{
return new Object();
}

public static Object action_highscore_show(Object... obj)
{
return new Object();
}

public static Object action_if(Object... obj)
{
return new Object();
}

public static Object action_if_aligned(Object... obj)
{
return new Object();
}

public static Object action_if_collision(Object... obj)
{
return new Object();
}

public static Object action_if_dice(Object... obj)
{
return new Object();
}

public static Object action_if_empty(Object... obj)
{
return new Object();
}

public static Object action_if_health(Object... obj)
{
return new Object();
}

public static Object action_if_life(Object... obj)
{
return new Object();
}

public static Object action_if_mouse(Object... obj)
{
return new Object();
}

public static Object action_if_next_room(Object... obj)
{
return new Object();
}

public static Object action_if_number(Object... obj)
{
return new Object();
}

public static Object action_if_object(Object... obj)
{
return new Object();
}

public static Object action_if_previous_room(Object... obj)
{
return new Object();
}

public static Object action_if_question(Object... obj)
{
return new Object();
}

public static Object action_if_score(Object... obj)
{
return new Object();
}

public static Object action_if_sound(Object... obj)
{
return new Object();
}

public static Object action_if_variable(Object... obj)
{
    if (obj[2].getInt() ==0) {
        System.out.println("action_if_variable, equals:"+obj[0].equals(obj[1]));
    return obj[0].equals(obj[1]);
    }//==
			if (obj[2].getInt() ==1) {//<
                            System.out.println("action_if_variable, <:"+obj[0].lt(obj[1]));
                            return obj[0].lt(obj[1]);
                        }
			if (obj[2].getInt() ==2) {//">(";
                            System.out.println("action_if_variable, >:"+obj[0].gt(obj[1]));
                            return obj[0].gt(obj[1]);
                        }
    System.out.println("action_if_variable, error:"+obj[2]);
return new Object();
}

public static Object action_inherited(Object... obj)
{
return new Object();
}

public static Object action_kill_object(Object... obj)
{
return new Object();
}

public static Object action_kill_position(Object... obj)
{
return new Object();
}

public static Object action_linear_step(Object... obj)
{
return new Object();
}

public static Object action_load_game(Object... obj)
{
return new Object();
}

public static Object action_message(Object obj)
{
    show_message(obj);
return new Object();
}

public static Object action_move(Object dirs, Object speed)
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
                                    //action_move(new Object[5]);

    }}
return new Object();
}

public static Object action_move_contact(Object... obj)
{
return new Object();
}

public static Object action_move_point(Object... obj)
{
return new Object();
}

public static Object action_move_random(Object... obj)
{
    move_random(obj[0], obj[1]);
return new Object();
}

public static Object action_move_start(Object... obj)
{
return new Object();
}

public static Object action_move_to(Object... obj)
{
    self.hspeed=1;
    System.out.println("move to x:"+self.x+"id"+self.id);
    if (argument_relative.getBoolean()){
    self.x=obj[0].getDouble();
    self.y=obj[1].getDouble();
    }
    else
    {
       self.x=self.x+obj[0].getDouble();
    self.y=self.y+obj[1].getDouble();
    }
    System.out.println("x:"+self.x);
return new Object();
}

public static Object action_next_room(Object... obj)
{
return new Object();
}

public static Object action_partemit_burst(Object... obj)
{
return new Object();
}

public static Object action_partemit_create(Object... obj)
{
return new Object();
}

public static Object action_partemit_destroy(Object... obj)
{
return new Object();
}

public static Object action_partemit_stream(Object... obj)
{
return new Object();
}

public static Object action_partsyst_clear(Object... obj)
{
return new Object();
}

public static Object action_partsyst_create(Object... obj)
{
return new Object();
}

public static Object action_partsyst_destroy(Object... obj)
{
return new Object();
}

public static Object action_parttype_color(Object... obj)
{
return new Object();
}

public static Object action_parttype_create(Object... obj)
{
return new Object();
}

public static Object action_parttype_gravity(Object... obj)
{
return new Object();
}

public static Object action_parttype_life(Object... obj)
{
return new Object();
}

public static Object action_parttype_secondary(Object... obj)
{
return new Object();
}

public static Object action_parttype_speed(Object... obj)
{
return new Object();
}

public static Object action_path(Object... obj)
{
return new Object();
}

public static Object action_path_end(Object... obj)
{
return new Object();
}

public static Object action_path_position(Object... obj)
{
return new Object();
}

public static Object action_path_speed(Object... obj)
{
return new Object();
}

public static Object action_potential_step(Object... obj)
{
return new Object();
}

public static Object action_previous_room(Object... obj)
{
return new Object();
}

public static Object action_replace_background(Object... obj)
{
return new Object();
}

public static Object action_replace_sound(Object... obj)
{
return new Object();
}

public static Object action_replace_sprite(Object... obj)
{
return new Object();
}

public static Object action_restart_game(Object... obj)
{
return new Object();
}

public static Object action_reverse_xdir(Object... obj)
{
    self.hspeed=-self.hspeed;
return new Object();
}

public static Object action_reverse_ydir(Object... obj)
{
    self.vspeed=-self.vspeed;
return new Object();
}

public static Object action_save_game(Object... obj)
{
return new Object();
}

public static Object action_set_alarm(Object... obj)
{
return new Object();
}

public static Object action_set_caption(Object... obj)
{
return new Object();
}

public static Object action_set_cursor(Object... obj)
{
return new Object();
}

public static Object action_set_friction(Object... obj)
{
return new Object();
}

public static Object action_set_gravity(Object... obj)
{
    if (argument_relative.getBoolean())
        self.setGravity(self.getGravity().add(obj[0]));
    else
    self.setGravity(obj[0]);
return new Object();
}

public static Object action_set_health(Object... obj)
{
    if (argument_relative.getBoolean())
        setHealth(getHealth().add(obj[0]));
    else
       setHealth(obj[0]);
return new Object();
}

public static Object action_set_hspeed(Object... obj)
{
    if (argument_relative.getBoolean())
      self.hspeed=self.hspeed+obj[0].getDouble();
    else
    self.hspeed=obj[0].getDouble();
return new Object();
}

public static Object action_set_life(Object... obj)
{
//    if (argument_relative.getBoolean())
//        setLife(obj[0]);
//    else
//        setLife(obj[0]);
return new Object();
}

public static Object action_set_motion(Object... obj)
{
    if (argument_relative.getBoolean())
    {
    motion_add(obj[0],obj[1]);
    }
    else{
    self.setDirection(obj[0]);
    self.setSpeed(obj[1]);
    }
return new Object();
}

public static Object action_set_score(Object score)
{
    if (argument_relative.getBoolean())
        setScore(getScore().add(score));
    else
    setScore(score);
return new Object();
}

public static Object action_set_timeline(Object... obj)
{
return new Object();
}

public static Object action_set_timeline_position(Object... obj)
{
return new Object();
}

public static Object action_set_vspeed(Object... obj)
{
    self.vspeed=obj[0].getDouble();
return new Object();
}

public static Object action_show_info(Object... obj)
{
return new Object();
}

public static Object action_show_video(Object... obj)
{
return new Object();
}

public static Object action_sleep(Object... obj)
{
return new Object();
}

public static Object action_snap(Object... obj)
{
return new Object();
}

public static Object action_snapshot(Object... obj)
{
return new Object();
}

public static Object action_sound(Object... obj)
{
return new Object();
}

public static Object action_sprite_color(Object... obj)
{
return new Object();
}

public static Object action_sprite_set(Object... obj)
{
return new Object();
}

public static Object action_sprite_transform(Object... obj)
{
return new Object();
}

public static Object action_webpage(Object... obj)
{
return new Object();
}

public static Object action_wrap(Object... obj)
{
return new Object();
}
}
