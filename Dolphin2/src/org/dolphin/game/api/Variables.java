/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

import java.util.Calendar;

import org.dolphin.game.Game;
import org.dolphin.game.api.types.Color;

/**
 * Main Variables
 * @author TGMG
 */
public class Variables extends Constants {
public static Object   argument
= false,  argument0
= false,  argument1
= false,  argument10
= false,  argument11
= false,  argument12
= false,  argument13
= false,  argument14
= false,  argument15
= false,  argument2
= false,  argument3
= false,  argument4
= false,  argument5
= false,  argument6
= false,  argument7
= false,  argument8
= false,  argument9
= false,  argument_relative
= false,  background_alpha
= false,  background_blend
= false,  background_color
= false,  background_foreground
= false,  background_height
= false,  background_hspeed
= false,  background_htiled
= false,  background_index
= false,  background_showcolor
= false,  background_visible
= false,  background_vspeed
= false,  background_vtiled
= false,  background_width
= false,  background_x
= false,  background_xscale
= false,  background_y
= false,  background_yscale
,  caption_health  = new String("Health:")
,  caption_lives = new String("Lives:")
,  caption_score  = new String("Score:")
,  current_day
= false,  current_hour
= false,  current_minute
= false,  current_month
= false,  current_second
= false,  current_time
= false,  current_weekday
= false,  current_year
= false,  cursor_sprite
= false,  error_last
= false,  error_occurred
= false,  event_action
= false,  event_number
= false,  event_Object
= false,  event_type
= false,  fps
= false,  game_id
= (double)((int)Math.ceil(Math.random(9000))),  health = 100d
,  instance_count
= false,  instance_id
= false,  keyboard_key
= false,  keyboard_lastchar
= false,  keyboard_lastkey
= false,  keyboard_string
= false,  lives = 5d
,  mouse_button
= false,  mouse_lastbutton
= false,    program_directory
= new String(""),  room
= false,  room_caption
= false,  room_first
= false,  room_last
= false,  room_persistent
= false,  room_speed
= false,  score =
0d,  secure_mode
= false,  show_health
= false,  show_lives
= false,  show_score
= false,  temp_directory
= new String(System.getProperty("java.io.tmpdir")),  transition_kind
= false,  transition_steps
= false,  view_angle
= false,  view_current
= false,  view_enabled
= false,  view_hborder
= false,  view_hport
= false,  view_hspeed
= false,  view_hview
= false,  view_Object
= false,  view_vborder
= false,  view_visible
= false,  view_vspeed
= false,  view_wport
= false,  view_wview
= false,  view_xport
= false,  view_xview
= false,  view_yport
= false,  view_yview
= false,  working_directory
        = new String(System.getProperty("user.dir"));

    public static Object getArgument() {
        return argument;
    }

    public static void setArgument(Object argument) {
        Variables.argument = argument;
    }

    public static Object getArgument0() {
        return argument0;
    }

    public static void setArgument0(Object argument0) {
        Variables.argument0 = argument0;
    }

    public static Object getArgument1() {
        return argument1;
    }

    public static void setArgument1(Object argument1) {
        Variables.argument1 = argument1;
    }

    public static Object getArgument10() {
        return argument10;
    }

    public static void setArgument10(Object argument10) {
        Variables.argument10 = argument10;
    }

    public static Object getArgument11() {
        return argument11;
    }

    public static void setArgument11(Object argument11) {
        Variables.argument11 = argument11;
    }

    public static Object getArgument12() {
        return argument12;
    }

    public static void setArgument12(Object argument12) {
        Variables.argument12 = argument12;
    }

    public static Object getArgument13() {
        return argument13;
    }

    public static void setArgument13(Object argument13) {
        Variables.argument13 = argument13;
    }

    public static Object getArgument14() {
        return argument14;
    }

    public static void setArgument14(Object argument14) {
        Variables.argument14 = argument14;
    }

    public static Object getArgument15() {
        return argument15;
    }

    public static void setArgument15(Object argument15) {
        Variables.argument15 = argument15;
    }

    public static Object getArgument2() {
        return argument2;
    }

    public static void setArgument2(Object argument2) {
        Variables.argument2 = argument2;
    }

    public static Object getArgument3() {
        return argument3;
    }

    public static void setArgument3(Object argument3) {
        Variables.argument3 = argument3;
    }

    public static Object getArgument4() {
        return argument4;
    }

    public static void setArgument4(Object argument4) {
        Variables.argument4 = argument4;
    }

    public static Object getArgument5() {
        return argument5;
    }

    public static void setArgument5(Object argument5) {
        Variables.argument5 = argument5;
    }

    public static Object getArgument6() {
        return argument6;
    }

    public static void setArgument6(Object argument6) {
        Variables.argument6 = argument6;
    }

    public static Object getArgument7() {
        return argument7;
    }

    public static void setArgument7(Object argument7) {
        Variables.argument7 = argument7;
    }

    public static Object getArgument8() {
        return argument8;
    }

    public static void setArgument8(Object argument8) {
        Variables.argument8 = argument8;
    }

    public static Object getArgument9() {
        return argument9;
    }

    public static void setArgument9(Object argument9) {
        Variables.argument9 = argument9;
    }

    public static Object getArgument_relative() {
        return argument_relative;
    }

    public static void setArgument_relative(Object argument_relative) {
        Variables.argument_relative = argument_relative;
    }

    public static Object getBackground_alpha(int back) {
        return background_alpha;
    }

    public static void setBackground_alpha(int back,Object background_alpha) {
        Variables.background_alpha = background_alpha;
    }

    public static Object getBackground_blend(int back) {
        return background_blend;
    }

    public static void setBackground_blend(int back,Object background_blend) {
        Variables.background_blend = background_blend;
    }

    public static Object getBackground_color() {
        return new Color(Game.currentRoom.backcolor);
    }

    public static void setBackground_color(Object background_color) {
        Game.currentRoom.backcolor = ((Color)background_color).c;
    }

    public static Object getBackground_showcolor() {
        return new Boolean(Game.currentRoom.showcolor);
    }

    public static void setBackground_showcolor(Object background_showcolor) {
        Game.currentRoom.showcolor = (Boolean)background_showcolor;
    }

    public static Object getBackground_foreground(int back) {
        return background_foreground;
    }

    public static void setBackground_foreground(int back,Object background_foreground) {
        Variables.background_foreground = background_foreground;
    }

    public static Object getBackground_height(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_image.getHeight());
    }

    public static void setBackground_height(int back,Object background_height) {
        //constant
    }

    public static Object getBackground_hspeed(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_hspeed);
    }

    public static void setBackground_hspeed(int back,Object background_hspeed) {
        Game.currentRoom.backgrounds.elementAt(back).background_hspeed = ((Double)background_hspeed).intValue();
    }

    public static Object getBackground_htiled(int back) {
        return background_htiled;
    }

    public static void setBackground_htiled(int back,Object background_htiled) {
        Variables.background_htiled = background_htiled;
    }

    public static Object getBackground_index(int back) {
        return background_index;
    }

    public static void setBackground_index(int back,Object background_index) {
        Variables.background_index = background_index;
    }

   public static Object getBackground_visible(int back) {
       return new Boolean(Game.currentRoom.backgrounds.elementAt(back).background_visible);
    }

    public static void setBackground_visible(int back,Object background_visible) {
        Game.currentRoom.backgrounds.elementAt(back).background_visible = (Boolean)background_visible;
    }

    public static Object getBackground_vspeed(int back) {
         return new Double(Game.currentRoom.backgrounds.elementAt(back).background_vspeed);
    }

    public static void setBackground_vspeed(int back,Object background_vspeed) {
        Game.currentRoom.backgrounds.elementAt(back).background_vspeed = ((Double)background_vspeed).intValue();
    }

    public static Object getBackground_vtiled(int back) {
        return background_vtiled;
    }

    public static void setBackground_vtiled(int back,Object background_vtiled) {
        Variables.background_vtiled = background_vtiled;
    }

    public static Object getBackground_width(int back) {
         return new Double(Game.currentRoom.backgrounds.elementAt(back).background_image.getWidth());
    }

    public static void setBackground_width(int back,Object background_width) {
        //constant
    }

    public static Object getBackground_x(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_x);
    }

    public static void setBackground_x(int back,Object background_x) {
        Game.currentRoom.backgrounds.elementAt(back).background_x = ((Double)background_x).intValue();
    }

    public static Object getBackground_xscale(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_xscale);
    }

    public static void setBackground_xscale(int back,Object background_xscale) {
        Game.currentRoom.backgrounds.elementAt(back).background_xscale = ((Double)background_xscale).intValue();
    Game.currentRoom.backgrounds.elementAt(back).xscale();
    }

    public static Object getBackground_y(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_y);
    }

    public static void setBackground_y(int back,Object background_y) {
        Game.currentRoom.backgrounds.elementAt(back).background_y = ((Double)background_y).intValue();
    }

    public static Object getBackground_yscale(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_yscale);
    }

    public static void setBackground_yscale(int back,Object background_yscale) {
        Game.currentRoom.backgrounds.elementAt(back).background_yscale = ((Double)background_yscale).intValue();
    Game.currentRoom.backgrounds.elementAt(back).yscale();
    }

    public static Object getCaption_health() {
        return caption_health;
    }

    public static void setCaption_health(Object caption_health) {
        Variables.caption_health = caption_health;
        Game.currentRoom.updateCaption();
    }

    public static Object getCaption_lives() {
        return caption_lives;
    }

    public static void setCaption_lives(Object caption_lives) {
        Variables.caption_lives = caption_lives;
        Game.currentRoom.updateCaption();
    }

    public static Object getCaption_score() {
        return caption_score;
    }

    public static void setCaption_score(Object caption_score) {
        Variables.caption_score = caption_score;
        Game.currentRoom.updateCaption();
    }

    public static Object getCurrent_day() {
        Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.DAY_OF_MONTH));
    }

    public static void setCurrent_day(Object current_day) {
        //constant
    }

    public static Object getCurrent_hour() {
        Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.HOUR_OF_DAY));
    }

    public static void setCurrent_hour(Object current_hour) {
        //constant
    }

    public static Object getCurrent_minute() {
        Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.MINUTE));
    }

    public static void setCurrent_minute(Object current_minute) {
       //constant
    }

    public static Object getCurrent_month() {
         Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.MONTH)+1);
        //return current_month;
    }

    public static void setCurrent_month(Object current_month) {
        //constant
    }

    public static Object getCurrent_second() {
        Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.SECOND));
        //return current_second;
    }

    public static void setCurrent_second(Object current_second) {
        //constant
    }

    public static Object getCurrent_time() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.MILLISECOND));
        
    }

    public static void setCurrent_time(Object current_time) {
        //constant
    }

    public static Object getCurrent_weekday() {
        Calendar toDay = Calendar.getInstance();
        return (double)(toDay.get(Calendar.DAY_OF_WEEK));
    }

    public static void setCurrent_weekday(Object current_weekday) {
        //constant
    }

    public static Object getCurrent_year() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.YEAR));
        
    }

    public static void setCurrent_year(Object current_year) {
        //constant
    }

    public static Object getCursor_sprite() {
        return cursor_sprite;
    }

    public static void setCursor_sprite(Object cursor_sprite) {
        Variables.cursor_sprite = cursor_sprite;
    }

    public static Object getError_last() {
        return error_last;
    }

    public static void setError_last(Object error_last) {
        Variables.error_last = error_last;
    }

    public static Object getError_occurred() {
        return error_occurred;
    }

    public static void setError_occurred(Object error_occurred) {
        Variables.error_occurred = error_occurred;
    }

    public static Object getEvent_action() {
        return event_action;
    }

    public static void setEvent_action(Object event_action) {
        Variables.event_action = event_action;
    }

    public static Object getEvent_number() {
        return event_number;
    }

    public static void setEvent_number(Object event_number) {
        Variables.event_number = event_number;
    }

    public static Object getEvent_Object() {
        return event_Object;
    }

    public static void setEvent_Object(Object event_Object) {
        Variables.event_Object = event_Object;
    }

    public static Object getEvent_type() {
        return event_type;
    }

    public static void setEvent_type(Object event_type) {
        Variables.event_type = event_type;
    }

    public static Object getFps() {
        return (double)(Game.game.getGame().getCurrentFPS());
    }

    public static void setFps(Object fps) {
        //constant
    }

    public static Object getGame_id() {
        return game_id;
    }

    public static void setGame_id(Object game_id) {
        //constant
    }

    public static Object getHealth() {
        return health;
    }

    public static void setHealth(Object health) {
        Variables.health = health;
        Game.currentRoom.updateCaption();
    }

    public static Object getInstance_count() {
        return (double)(Game.currentRoom.instances.size());
    }

    public static void setInstance_count(Object instance_count) {
        //constant
    }

    public static Object getInstance_id() {
        return instance_id;
    }

    public static void setInstance_id(Object instance_id) {
        Variables.instance_id = instance_id;
    }

    public static Object getKeyboard_key() {
        return keyboard_key;
    }

    public static void setKeyboard_key(Object keyboard_key) {
        Variables.keyboard_key = keyboard_key;
    }

    public static Object getKeyboard_lastchar() {
        return keyboard_lastchar;
    }

    public static void setKeyboard_lastchar(Object keyboard_lastchar) {
        Variables.keyboard_lastchar = keyboard_lastchar;
    }

    public static Object getKeyboard_lastkey() {
        return keyboard_lastkey;
    }

    public static void setKeyboard_lastkey(Object keyboard_lastkey) {
        Variables.keyboard_lastkey = keyboard_lastkey;
    }

    public static Object getKeyboard_string() {
        return keyboard_string;
    }

    public static void setKeyboard_string(Object keyboard_string) {
        Variables.keyboard_string = keyboard_string;
    }

    public static Object getLives() {
        return lives;
    }

    public static void setLives(Object lives) {
        Variables.lives = lives;
        Game.currentRoom.updateCaption();
    }

    public static Object getMouse_button() {
        return mouse_button;
    }

    public static void setMouse_button(Object mouse_button) {
        Variables.mouse_button = mouse_button;
    }

    public static Object getMouse_lastbutton() {
        return mouse_lastbutton;
    }

    public static void setMouse_lastbutton(Object mouse_lastbutton) {
        Variables.mouse_lastbutton = mouse_lastbutton;
    }

    public static Object getMouse_x() {
        return (double)(Game.thegame.getMouseX());
    }

    public static void setMouse_x(Object mouse_x) {
       //constant
    }

    public static Object getMouse_y() {
        return (double)(Game.game.getGame().getMouseY());
    }

    public static void setMouse_y(Object mouse_y) {
        //constant
    }

    public static Object getProgram_directory() {
        try{
        return new String(""+(Variables.class.getProtectionDomain()
.getCodeSource().getLocation().toURI()));
        }catch(Exception ee){ee.printStackTrace();}
        return program_directory;
    }

    public static void setProgram_directory(Object program_directory) {
        //Variables.program_directory = program_directory;
    }

    public static Object getRoom() {
        return room;
    }

    public static void setRoom(Object room) {
        Variables.room = room;
    }

    public static Object getRoom_caption() {
        return room_caption;
    }

    public static void setRoom_caption(Object room_caption) {
        Variables.room_caption = room_caption;
        Game.frame.setTitle(room_caption.toString());
    }

    public static Object getRoom_first() {
        return room_first;
    }

    public static void setRoom_first(Object room_first) {
        Variables.room_first = room_first;
    }

    public static Object getRoom_height() {
        return new Double(Game.currentRoom.height);
    }

    public static void setRoom_height(Object room_height) {
        Game.currentRoom.height = ((Double)room_height).intValue();
        Game.canvas.setSize(Game.currentRoom.width, Game.currentRoom.height);
    }

    public static Object getRoom_last() {
        return room_last;
    }

    public static void setRoom_last(Object room_last) {
        Variables.room_last = room_last;
    }

    public static Object getRoom_persistent() {
        return room_persistent;
    }

    public static void setRoom_persistent(Object room_persistent) {
        Variables.room_persistent = room_persistent;
    }

    public static Object getRoom_speed() {
        return new Double(Game.currentRoom.speed);
    }

    public static void setRoom_speed(Object room_speed) {
        Game.currentRoom.speed = ((Double)room_speed).longValue();
    }

    public static Object getRoom_width() {
        return new Double(Game.currentRoom.width);
    }

    public static void setRoom_width(Object room_width) {
        Game.currentRoom.width = ((Double)room_width).intValue();
        Game.canvas.setSize(Game.currentRoom.width, Game.currentRoom.height);
    }

    public static Object getScore() {
        return score;
    }

    public static void setScore(Object score) {
        Variables.score = score;
        Game.currentRoom.updateCaption();
    }

    public static Object getSecure_mode() {
        return secure_mode;
    }

    public static void setSecure_mode(Object secure_mode) {
        //constant
    }

    public static Object getShow_health() {
        return show_health;
    }

    public static void setShow_health(Object show_health) {
        Variables.show_health = show_health;
        Game.currentRoom.updateCaption();
    }

    public static Object getShow_lives() {
        return show_lives;
    }

    public static void setShow_lives(Object show_lives) {
        Variables.show_lives = show_lives;
        Game.currentRoom.updateCaption();
    }

    public static Object getShow_score() {
        return show_score;
    }

    public static void setShow_score(Object show_score) {
        Variables.show_score = show_score;
        Game.currentRoom.updateCaption();
    }

    public static Object getTemp_directory() {
        return temp_directory;
    }

    public static void setTemp_directory(Object temp_directory) {
       // Variables.temp_directory = temp_directory;
    }

    public static Object getTransition_kind() {
        return transition_kind;
    }

    public static void setTransition_kind(Object transition_kind) {
        Variables.transition_kind = transition_kind;
    }

    public static Object getTransition_steps() {
        return transition_steps;
    }

    public static void setTransition_steps(Object transition_steps) {
        Variables.transition_steps = transition_steps;
    }

    public static Object getView_angle() {
        return view_angle;
    }

    public static void setView_angle(Object view_angle) {
        Variables.view_angle = view_angle;
    }

    public static Object getView_current() {
        return view_current;
    }

    public static void setView_current(Object view_current) {
        Variables.view_current = view_current;
    }

    public static Object getView_enabled() {
        return view_enabled;
    }

    public static void setView_enabled(Object view_enabled) {
        Variables.view_enabled = view_enabled;
    }

    public static Object getView_hborder() {
        return view_hborder;
    }

    public static void setView_hborder(Object view_hborder) {
        Variables.view_hborder = view_hborder;
    }

    public static Object getView_hport() {
        return view_hport;
    }

    public static void setView_hport(Object view_hport) {
        Variables.view_hport = view_hport;
    }

    public static Object getView_hspeed() {
        return view_hspeed;
    }

    public static void setView_hspeed(Object view_hspeed) {
        Variables.view_hspeed = view_hspeed;
    }

    public static Object getView_hview() {
        return view_hview;
    }

    public static void setView_hview(Object view_hview) {
        Variables.view_hview = view_hview;
    }

    public static Object getView_Object() {
        return view_Object;
    }

    public static void setView_Object(Object view_Object) {
        Variables.view_Object = view_Object;
    }

    public static Object getView_vborder() {
        return view_vborder;
    }

    public static void setView_vborder(Object view_vborder) {
        Variables.view_vborder = view_vborder;
    }

    public static Object getView_visible() {
        return view_visible;
    }

    public static void setView_visible(Object view_visible) {
        Variables.view_visible = view_visible;
    }

    public static Object getView_vspeed() {
        return view_vspeed;
    }

    public static void setView_vspeed(Object view_vspeed) {
        Variables.view_vspeed = view_vspeed;
    }

    public static Object getView_wport() {
        return view_wport;
    }

    public static void setView_wport(Object view_wport) {
        Variables.view_wport = view_wport;
    }

    public static Object getView_wview() {
        return view_wview;
    }

    public static void setView_wview(Object view_wview) {
        Variables.view_wview = view_wview;
    }

    public static Object getView_xport() {
        return view_xport;
    }

    public static void setView_xport(Object view_xport) {
        Variables.view_xport = view_xport;
    }

    public static Object getView_xview() {
        return view_xview;
    }

    public static void setView_xview(Object view_xview) {
        Variables.view_xview = view_xview;
    }

    public static Object getView_yport() {
        return view_yport;
    }

    public static void setView_yport(Object view_yport) {
        Variables.view_yport = view_yport;
    }

    public static Object getView_yview() {
        return view_yview;
    }

    public static void setView_yview(Object view_yview) {
        Variables.view_yview = view_yview;
    }

    public static Object getWorking_directory() {
        return working_directory;
    }

    public static void setWorking_directory(Object working_directory) {
        Variables.working_directory = working_directory;
    }


}
