/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Calendar;
import org.gcreator.compilers.gjava.Game;

/**
 * Main Variables
 * @author TGMG
 */
public class Variables extends Constants {
public static Object   argument
= new Boolean(false),  argument0
= new Boolean(false),  argument1
= new Boolean(false),  argument10
= new Boolean(false),  argument11
= new Boolean(false),  argument12
= new Boolean(false),  argument13
= new Boolean(false),  argument14
= new Boolean(false),  argument15
= new Boolean(false),  argument2
= new Boolean(false),  argument3
= new Boolean(false),  argument4
= new Boolean(false),  argument5
= new Boolean(false),  argument6
= new Boolean(false),  argument7
= new Boolean(false),  argument8
= new Boolean(false),  argument9
= new Boolean(false),  argument_relative
= new Boolean(false),  background_alpha
= new Boolean(false),  background_blend
= new Boolean(false),  background_color
= new Boolean(false),  background_foreground
= new Boolean(false),  background_height
= new Boolean(false),  background_hspeed
= new Boolean(false),  background_htiled
= new Boolean(false),  background_index
= new Boolean(false),  background_showcolor
= new Boolean(false),  background_visible
= new Boolean(false),  background_vspeed
= new Boolean(false),  background_vtiled
= new Boolean(false),  background_width
= new Boolean(false),  background_x
= new Boolean(false),  background_xscale
= new Boolean(false),  background_y
= new Boolean(false),  background_yscale
,  caption_health  = new String("health:")
,  caption_lives = new String("lives:")
,  caption_score  = new String("scroe:")
,  current_day
= new Boolean(false),  current_hour
= new Boolean(false),  current_minute
= new Boolean(false),  current_month
= new Boolean(false),  current_second
= new Boolean(false),  current_time
= new Boolean(false),  current_weekday
= new Boolean(false),  current_year
= new Boolean(false),  cursor_sprite
= new Boolean(false),  error_last
= new Boolean(false),  error_occurred
= new Boolean(false),  event_action
= new Boolean(false),  event_number
= new Boolean(false),  event_object
= new Boolean(false),  event_type
= new Boolean(false),  fps
= new Boolean(false),  game_id
= new Boolean(false),  health = new Integer(100)
,  instance_count
= new Boolean(false),  instance_id
= new Boolean(false),  keyboard_key
= new Boolean(false),  keyboard_lastchar
= new Boolean(false),  keyboard_lastkey
= new Boolean(false),  keyboard_string
= new Boolean(false),  lives = new Integer(5)
,  mouse_button
= new Boolean(false),  mouse_lastbutton
= new Boolean(false),  mouse_x
= new Boolean(false),  mouse_y
= new Boolean(false),  program_directory
= new Boolean(false),  room
= new Boolean(false),  room_caption
= new Boolean(false),  room_first
= new Boolean(false),  room_last
= new Boolean(false),  room_persistent
= new Boolean(false),  room_speed
= new Boolean(false),  score
= new Boolean(false),  secure_mode
= new Boolean(false),  show_health
= new Boolean(false),  show_lives
= new Boolean(false),  show_score
= new Boolean(false),  temp_directory
= new Boolean(false),  transition_kind
= new Boolean(false),  transition_steps
= new Boolean(false),  view_angle
= new Boolean(false),  view_current
= new Boolean(false),  view_enabled
= new Boolean(false),  view_hborder
= new Boolean(false),  view_hport
= new Boolean(false),  view_hspeed
= new Boolean(false),  view_hview
= new Boolean(false),  view_object
= new Boolean(false),  view_vborder
= new Boolean(false),  view_visible
= new Boolean(false),  view_vspeed
= new Boolean(false),  view_wport
= new Boolean(false),  view_wview
= new Boolean(false),  view_xport
= new Boolean(false),  view_xview
= new Boolean(false),  view_yport
= new Boolean(false),  view_yview
= new Boolean(false),  working_directory
        = new Boolean(false);

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
        return new Color(Game.Current.backcolor);
    }

    public static void setBackground_color(Object background_color) {
        Game.Current.backcolor = ((Color)background_color).c;
    }

    public static Object getBackground_showcolor() {
        return new Boolean(Game.Current.showcolor);
    }

    public static void setBackground_showcolor(Object background_showcolor) {
        Game.Current.showcolor = background_showcolor.getBoolean();
    }

    public static Object getBackground_foreground(int back) {
        return background_foreground;
    }

    public static void setBackground_foreground(int back,Object background_foreground) {
        Variables.background_foreground = background_foreground;
    }

    public static Object getBackground_height(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_image.getHeight());
    }

    public static void setBackground_height(int back,Object background_height) {
        //constant
    }

    public static Object getBackground_hspeed(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_hspeed);
    }

    public static void setBackground_hspeed(int back,Object background_hspeed) {
        Game.Current.backgrounds.elementAt(back).background_hspeed = (int)background_hspeed.getDouble();
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
       return new Boolean(Game.Current.backgrounds.elementAt(back).background_visible);
    }

    public static void setBackground_visible(int back,Object background_visible) {
        Game.Current.backgrounds.elementAt(back).background_visible = background_visible.getBoolean();
    }

    public static Object getBackground_vspeed(int back) {
         return new Double(Game.Current.backgrounds.elementAt(back).background_vspeed);
    }

    public static void setBackground_vspeed(int back,Object background_vspeed) {
        Game.Current.backgrounds.elementAt(back).background_vspeed = (int)background_vspeed.getDouble();
    }

    public static Object getBackground_vtiled(int back) {
        return background_vtiled;
    }

    public static void setBackground_vtiled(int back,Object background_vtiled) {
        Variables.background_vtiled = background_vtiled;
    }

    public static Object getBackground_width(int back) {
         return new Double(Game.Current.backgrounds.elementAt(back).background_image.getWidth());
    }

    public static void setBackground_width(int back,Object background_width) {
        //constant
    }

    public static Object getBackground_x(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_x);
    }

    public static void setBackground_x(int back,Object background_x) {
        Game.Current.backgrounds.elementAt(back).background_x = (int)background_x.getDouble();
    }

    public static Object getBackground_xscale(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_xscale);
    }

    public static void setBackground_xscale(int back,Object background_xscale) {
        Game.Current.backgrounds.elementAt(back).background_xscale = (int)background_xscale.getDouble();
    Game.Current.backgrounds.elementAt(back).xscale();
    }

    public static Object getBackground_y(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_y);
    }

    public static void setBackground_y(int back,Object background_y) {
        Game.Current.backgrounds.elementAt(back).background_y = (int)background_y.getDouble();
    }

    public static Object getBackground_yscale(int back) {
        return new Double(Game.Current.backgrounds.elementAt(back).background_yscale);
    }

    public static void setBackground_yscale(int back,Object background_yscale) {
        Game.Current.backgrounds.elementAt(back).background_yscale = (int)background_yscale.getDouble();
    Game.Current.backgrounds.elementAt(back).yscale();
    }

    public static Object getCaption_health() {
        return caption_health;
    }

    public static void setCaption_health(Object caption_health) {
        Variables.caption_health = caption_health;
        Game.Current.updateCaption();
    }

    public static Object getCaption_lives() {
        return caption_lives;
    }

    public static void setCaption_lives(Object caption_lives) {
        Variables.caption_lives = caption_lives;
        Game.Current.updateCaption();
    }

    public static Object getCaption_score() {
        return caption_score;
    }

    public static void setCaption_score(Object caption_score) {
        Variables.caption_score = caption_score;
        Game.Current.updateCaption();
    }

    public static Object getCurrent_day() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.DAY_OF_MONTH));
    }

    public static void setCurrent_day(Object current_day) {
        //constant
    }

    public static Object getCurrent_hour() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.HOUR_OF_DAY));
    }

    public static void setCurrent_hour(Object current_hour) {
        //constant
    }

    public static Object getCurrent_minute() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MINUTE));
    }

    public static void setCurrent_minute(Object current_minute) {
       //constant
    }

    public static Object getCurrent_month() {
         Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MONTH)+1);
        //return current_month;
    }

    public static void setCurrent_month(Object current_month) {
        //constant
    }

    public static Object getCurrent_second() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.SECOND));
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
        return new Integer(toDay.get(Calendar.DAY_OF_WEEK));
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

    public static Object getEvent_object() {
        return event_object;
    }

    public static void setEvent_object(Object event_object) {
        Variables.event_object = event_object;
    }

    public static Object getEvent_type() {
        return event_type;
    }

    public static void setEvent_type(Object event_type) {
        Variables.event_type = event_type;
    }

    public static Object getFps() {
        return new Integer((int) Game.Current.getFPS());
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
        Game.Current.updateCaption();
    }

    public static Object getInstance_count() {
        return new Integer(Game.Current.instances.size());
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
        Game.Current.updateCaption();
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
        return mouse_x;
    }

    public static void setMouse_x(Object mouse_x) {
        Variables.mouse_x = mouse_x;
    }

    public static Object getMouse_y() {
        return mouse_y;
    }

    public static void setMouse_y(Object mouse_y) {
        Variables.mouse_y = mouse_y;
    }

    public static Object getProgram_directory() {
        return program_directory;
    }

    public static void setProgram_directory(Object program_directory) {
        Variables.program_directory = program_directory;
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
    }

    public static Object getRoom_first() {
        return room_first;
    }

    public static void setRoom_first(Object room_first) {
        Variables.room_first = room_first;
    }

    public static Object getRoom_height() {
        return new Double(Game.Current.width);
    }

    public static void setRoom_height(Object room_height) {
        Game.Current.height = (int)room_height.getDouble();
        Game.canvas.setSize(Game.Current.width, Game.Current.height);
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
        return new Double(Game.Current.speed);
    }

    public static void setRoom_speed(Object room_speed) {
        Game.Current.speed = (long) room_speed.getDouble();
    }

    public static Object getRoom_width() {
        return new Double(Game.Current.width);
    }

    public static void setRoom_width(Object room_width) {
        Game.Current.width = (int)room_width.getDouble();
        Game.canvas.setSize(Game.Current.width, Game.Current.height);
    }

    public static Object getScore() {
        return score;
    }

    public static void setScore(Object score) {
        Variables.score = score;
        Game.Current.updateCaption();
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
        Game.Current.updateCaption();
    }

    public static Object getShow_lives() {
        return show_lives;
    }

    public static void setShow_lives(Object show_lives) {
        Variables.show_lives = show_lives;
        Game.Current.updateCaption();
    }

    public static Object getShow_score() {
        return show_score;
    }

    public static void setShow_score(Object show_score) {
        Variables.show_score = show_score;
        Game.Current.updateCaption();
    }

    public static Object getTemp_directory() {
        return temp_directory;
    }

    public static void setTemp_directory(Object temp_directory) {
        Variables.temp_directory = temp_directory;
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

    public static Object getView_object() {
        return view_object;
    }

    public static void setView_object(Object view_object) {
        Variables.view_object = view_object;
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
