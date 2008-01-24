/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Calendar;
import org.gcreator.compilers.gjava.Game;

/**
 *
 * @author Ali
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
= new Boolean(false),  room_height
= new Boolean(false),  room_last
= new Boolean(false),  room_persistent
= new Boolean(false),  room_speed
= new Boolean(false),  room_width
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

    public Object getArgument() {
        return argument;
    }

    public void setArgument(Object argument) {
        this.argument = argument;
    }

    public Object getArgument0() {
        return argument0;
    }

    public void setArgument0(Object argument0) {
        this.argument0 = argument0;
    }

    public Object getArgument1() {
        return argument1;
    }

    public void setArgument1(Object argument1) {
        this.argument1 = argument1;
    }

    public Object getArgument10() {
        return argument10;
    }

    public void setArgument10(Object argument10) {
        this.argument10 = argument10;
    }

    public Object getArgument11() {
        return argument11;
    }

    public void setArgument11(Object argument11) {
        this.argument11 = argument11;
    }

    public Object getArgument12() {
        return argument12;
    }

    public void setArgument12(Object argument12) {
        this.argument12 = argument12;
    }

    public Object getArgument13() {
        return argument13;
    }

    public void setArgument13(Object argument13) {
        this.argument13 = argument13;
    }

    public Object getArgument14() {
        return argument14;
    }

    public void setArgument14(Object argument14) {
        this.argument14 = argument14;
    }

    public Object getArgument15() {
        return argument15;
    }

    public void setArgument15(Object argument15) {
        this.argument15 = argument15;
    }

    public Object getArgument2() {
        return argument2;
    }

    public void setArgument2(Object argument2) {
        this.argument2 = argument2;
    }

    public Object getArgument3() {
        return argument3;
    }

    public void setArgument3(Object argument3) {
        this.argument3 = argument3;
    }

    public Object getArgument4() {
        return argument4;
    }

    public void setArgument4(Object argument4) {
        this.argument4 = argument4;
    }

    public Object getArgument5() {
        return argument5;
    }

    public void setArgument5(Object argument5) {
        this.argument5 = argument5;
    }

    public Object getArgument6() {
        return argument6;
    }

    public void setArgument6(Object argument6) {
        this.argument6 = argument6;
    }

    public Object getArgument7() {
        return argument7;
    }

    public void setArgument7(Object argument7) {
        this.argument7 = argument7;
    }

    public Object getArgument8() {
        return argument8;
    }

    public void setArgument8(Object argument8) {
        this.argument8 = argument8;
    }

    public Object getArgument9() {
        return argument9;
    }

    public void setArgument9(Object argument9) {
        this.argument9 = argument9;
    }

    public Object getArgument_relative() {
        return argument_relative;
    }

    public void setArgument_relative(Object argument_relative) {
        this.argument_relative = argument_relative;
    }

    public Object getBackground_alpha() {
        return background_alpha;
    }

    public void setBackground_alpha(Object background_alpha) {
        this.background_alpha = background_alpha;
    }

    public Object getBackground_blend() {
        return background_blend;
    }

    public void setBackground_blend(Object background_blend) {
        this.background_blend = background_blend;
    }

    public Object getBackground_color() {
        return background_color;
    }

    public void setBackground_color(Object background_color) {
        this.background_color = background_color;
    }

    public Object getBackground_foreground() {
        return background_foreground;
    }

    public void setBackground_foreground(Object background_foreground) {
        this.background_foreground = background_foreground;
    }

    public Object getBackground_height() {
        return background_height;
    }

    public void setBackground_height(Object background_height) {
        this.background_height = background_height;
    }

    public Object getBackground_hspeed() {
        return background_hspeed;
    }

    public void setBackground_hspeed(Object background_hspeed) {
        this.background_hspeed = background_hspeed;
    }

    public Object getBackground_htiled() {
        return background_htiled;
    }

    public void setBackground_htiled(Object background_htiled) {
        this.background_htiled = background_htiled;
    }

    public Object getBackground_index() {
        return background_index;
    }

    public void setBackground_index(Object background_index) {
        this.background_index = background_index;
    }

    public Object getBackground_showcolor() {
        return background_showcolor;
    }

    public void setBackground_showcolor(Object background_showcolor) {
        this.background_showcolor = background_showcolor;
    }

    public Object getBackground_visible() {
        return background_visible;
    }

    public void setBackground_visible(Object background_visible) {
        this.background_visible = background_visible;
    }

    public Object getBackground_vspeed() {
        return background_vspeed;
    }

    public void setBackground_vspeed(Object background_vspeed) {
        this.background_vspeed = background_vspeed;
    }

    public Object getBackground_vtiled() {
        return background_vtiled;
    }

    public void setBackground_vtiled(Object background_vtiled) {
        this.background_vtiled = background_vtiled;
    }

    public Object getBackground_width() {
        return background_width;
    }

    public void setBackground_width(Object background_width) {
        this.background_width = background_width;
    }

    public Object getBackground_x() {
        return background_x;
    }

    public void setBackground_x(Object background_x) {
        this.background_x = background_x;
    }

    public Object getBackground_xscale() {
        return background_xscale;
    }

    public void setBackground_xscale(Object background_xscale) {
        this.background_xscale = background_xscale;
    }

    public Object getBackground_y() {
        return background_y;
    }

    public void setBackground_y(Object background_y) {
        this.background_y = background_y;
    }

    public Object getBackground_yscale() {
        return background_yscale;
    }

    public void setBackground_yscale(Object background_yscale) {
        Variables.background_yscale = background_yscale;
    }

    public Object getCaption_health() {
        return caption_health;
    }

    public void setCaption_health(Object caption_health) {
        Variables.caption_health = caption_health;
        Game.Current.updateCaption();
    }

    public Object getCaption_lives() {
        return caption_lives;
    }

    public void setCaption_lives(Object caption_lives) {
        Variables.caption_lives = caption_lives;
        Game.Current.updateCaption();
    }

    public Object getCaption_score() {
        return caption_score;
    }

    public void setCaption_score(Object caption_score) {
        Variables.caption_score = caption_score;
        Game.Current.updateCaption();
    }

    public Object getCurrent_day() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.DAY_OF_MONTH));
    }

    public void setCurrent_day(Object current_day) {
        //constant
    }

    public Object getCurrent_hour() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.HOUR_OF_DAY));
    }

    public void setCurrent_hour(Object current_hour) {
        //constant
    }

    public Object getCurrent_minute() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MINUTE));
    }

    public void setCurrent_minute(Object current_minute) {
       //constant
    }

    public Object getCurrent_month() {
         Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MONTH)+1);
        //return current_month;
    }

    public void setCurrent_month(Object current_month) {
        //constant
    }

    public Object getCurrent_second() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.SECOND));
        //return current_second;
    }

    public void setCurrent_second(Object current_second) {
        //constant
    }

    public Object getCurrent_time() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.MILLISECOND));
        
    }

    public void setCurrent_time(Object current_time) {
        //constant
    }

    public Object getCurrent_weekday() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.DAY_OF_WEEK));
    }

    public void setCurrent_weekday(Object current_weekday) {
        //constant
    }

    public Object getCurrent_year() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.YEAR));
        
    }

    public void setCurrent_year(Object current_year) {
        //constant
    }

    public Object getCursor_sprite() {
        return cursor_sprite;
    }

    public void setCursor_sprite(Object cursor_sprite) {
        this.cursor_sprite = cursor_sprite;
    }

    public Object getError_last() {
        return error_last;
    }

    public void setError_last(Object error_last) {
        this.error_last = error_last;
    }

    public Object getError_occurred() {
        return error_occurred;
    }

    public void setError_occurred(Object error_occurred) {
        this.error_occurred = error_occurred;
    }

    public Object getEvent_action() {
        return event_action;
    }

    public void setEvent_action(Object event_action) {
        this.event_action = event_action;
    }

    public Object getEvent_number() {
        return event_number;
    }

    public void setEvent_number(Object event_number) {
        this.event_number = event_number;
    }

    public Object getEvent_object() {
        return event_object;
    }

    public void setEvent_object(Object event_object) {
        this.event_object = event_object;
    }

    public Object getEvent_type() {
        return event_type;
    }

    public void setEvent_type(Object event_type) {
        this.event_type = event_type;
    }

    public Object getFps() {
        return new Integer(Game.Current.getFPS());
    }

    public void setFps(Object fps) {
        //constant
    }

    public Object getGame_id() {
        return game_id;
    }

    public void setGame_id(Object game_id) {
        //constant
    }

    public Object getHealth() {
        return health;
    }

    public void setHealth(Object health) {
        this.health = health;
        Game.Current.updateCaption();
    }

    public Object getInstance_count() {
        return new Integer(Game.Current.instances.size());
    }

    public void setInstance_count(Object instance_count) {
        //constant
    }

    public Object getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(Object instance_id) {
        this.instance_id = instance_id;
    }

    public Object getKeyboard_key() {
        return keyboard_key;
    }

    public void setKeyboard_key(Object keyboard_key) {
        this.keyboard_key = keyboard_key;
    }

    public Object getKeyboard_lastchar() {
        return keyboard_lastchar;
    }

    public void setKeyboard_lastchar(Object keyboard_lastchar) {
        this.keyboard_lastchar = keyboard_lastchar;
    }

    public Object getKeyboard_lastkey() {
        return keyboard_lastkey;
    }

    public void setKeyboard_lastkey(Object keyboard_lastkey) {
        this.keyboard_lastkey = keyboard_lastkey;
    }

    public Object getKeyboard_string() {
        return keyboard_string;
    }

    public void setKeyboard_string(Object keyboard_string) {
        this.keyboard_string = keyboard_string;
    }

    public Object getLives() {
        return lives;
    }

    public void setLives(Object lives) {
        this.lives = lives;
        Game.Current.updateCaption();
    }

    public Object getMouse_button() {
        return mouse_button;
    }

    public void setMouse_button(Object mouse_button) {
        this.mouse_button = mouse_button;
    }

    public Object getMouse_lastbutton() {
        return mouse_lastbutton;
    }

    public void setMouse_lastbutton(Object mouse_lastbutton) {
        this.mouse_lastbutton = mouse_lastbutton;
    }

    public Object getMouse_x() {
        return mouse_x;
    }

    public void setMouse_x(Object mouse_x) {
        this.mouse_x = mouse_x;
    }

    public Object getMouse_y() {
        return mouse_y;
    }

    public void setMouse_y(Object mouse_y) {
        this.mouse_y = mouse_y;
    }

    public Object getProgram_directory() {
        return program_directory;
    }

    public void setProgram_directory(Object program_directory) {
        this.program_directory = program_directory;
    }

    public Object getRoom() {
        return room;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public Object getRoom_caption() {
        return room_caption;
    }

    public void setRoom_caption(Object room_caption) {
        this.room_caption = room_caption;
    }

    public Object getRoom_first() {
        return room_first;
    }

    public void setRoom_first(Object room_first) {
        this.room_first = room_first;
    }

    public Object getRoom_height() {
        return room_height;
    }

    public void setRoom_height(Object room_height) {
        this.room_height = room_height;
    }

    public Object getRoom_last() {
        return room_last;
    }

    public void setRoom_last(Object room_last) {
        this.room_last = room_last;
    }

    public Object getRoom_persistent() {
        return room_persistent;
    }

    public void setRoom_persistent(Object room_persistent) {
        this.room_persistent = room_persistent;
    }

    public Object getRoom_speed() {
        return new Double(Game.Current.speed);
    }

    public void setRoom_speed(Object room_speed) {
        Game.Current.speed = room_speed.getDouble();
    }

    public Object getRoom_width() {
        return room_width;
    }

    public void setRoom_width(Object room_width) {
        this.room_width = room_width;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
        Game.Current.updateCaption();
    }

    public Object getSecure_mode() {
        return secure_mode;
    }

    public void setSecure_mode(Object secure_mode) {
        //constant
    }

    public Object getShow_health() {
        return show_health;
    }

    public void setShow_health(Object show_health) {
        this.show_health = show_health;
        Game.Current.updateCaption();
    }

    public Object getShow_lives() {
        return show_lives;
    }

    public void setShow_lives(Object show_lives) {
        this.show_lives = show_lives;
        Game.Current.updateCaption();
    }

    public Object getShow_score() {
        return show_score;
    }

    public void setShow_score(Object show_score) {
        this.show_score = show_score;
        Game.Current.updateCaption();
    }

    public Object getTemp_directory() {
        return temp_directory;
    }

    public void setTemp_directory(Object temp_directory) {
        this.temp_directory = temp_directory;
    }

    public Object getTransition_kind() {
        return transition_kind;
    }

    public void setTransition_kind(Object transition_kind) {
        this.transition_kind = transition_kind;
    }

    public Object getTransition_steps() {
        return transition_steps;
    }

    public void setTransition_steps(Object transition_steps) {
        this.transition_steps = transition_steps;
    }

    public Object getView_angle() {
        return view_angle;
    }

    public void setView_angle(Object view_angle) {
        this.view_angle = view_angle;
    }

    public Object getView_current() {
        return view_current;
    }

    public void setView_current(Object view_current) {
        this.view_current = view_current;
    }

    public Object getView_enabled() {
        return view_enabled;
    }

    public void setView_enabled(Object view_enabled) {
        this.view_enabled = view_enabled;
    }

    public Object getView_hborder() {
        return view_hborder;
    }

    public void setView_hborder(Object view_hborder) {
        this.view_hborder = view_hborder;
    }

    public Object getView_hport() {
        return view_hport;
    }

    public void setView_hport(Object view_hport) {
        this.view_hport = view_hport;
    }

    public Object getView_hspeed() {
        return view_hspeed;
    }

    public void setView_hspeed(Object view_hspeed) {
        this.view_hspeed = view_hspeed;
    }

    public Object getView_hview() {
        return view_hview;
    }

    public void setView_hview(Object view_hview) {
        this.view_hview = view_hview;
    }

    public Object getView_object() {
        return view_object;
    }

    public void setView_object(Object view_object) {
        this.view_object = view_object;
    }

    public Object getView_vborder() {
        return view_vborder;
    }

    public void setView_vborder(Object view_vborder) {
        this.view_vborder = view_vborder;
    }

    public Object getView_visible() {
        return view_visible;
    }

    public void setView_visible(Object view_visible) {
        this.view_visible = view_visible;
    }

    public Object getView_vspeed() {
        return view_vspeed;
    }

    public void setView_vspeed(Object view_vspeed) {
        this.view_vspeed = view_vspeed;
    }

    public Object getView_wport() {
        return view_wport;
    }

    public void setView_wport(Object view_wport) {
        this.view_wport = view_wport;
    }

    public Object getView_wview() {
        return view_wview;
    }

    public void setView_wview(Object view_wview) {
        this.view_wview = view_wview;
    }

    public Object getView_xport() {
        return view_xport;
    }

    public void setView_xport(Object view_xport) {
        this.view_xport = view_xport;
    }

    public Object getView_xview() {
        return view_xview;
    }

    public void setView_xview(Object view_xview) {
        this.view_xview = view_xview;
    }

    public Object getView_yport() {
        return view_yport;
    }

    public void setView_yport(Object view_yport) {
        this.view_yport = view_yport;
    }

    public Object getView_yview() {
        return view_yview;
    }

    public void setView_yview(Object view_yview) {
        this.view_yview = view_yview;
    }

    public Object getWorking_directory() {
        return working_directory;
    }

    public void setWorking_directory(Object working_directory) {
        this.working_directory = working_directory;
    }


}
