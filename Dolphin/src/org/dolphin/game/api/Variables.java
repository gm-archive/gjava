/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

import java.util.Calendar;

import org.dolphin.game.Game;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.Variable;
import org.dolphin.game.api.types.Boolean;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Double;
import org.dolphin.game.api.types.Integer;

/**
 * Main Variables
 * @author TGMG
 */
public class Variables extends Constants {
public static Variable   argument
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
,  caption_health  = new String("Health:")
,  caption_lives = new String("Lives:")
,  caption_score  = new String("Score:")
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
= new Boolean(false),  event_Variable
= new Boolean(false),  event_type
= new Boolean(false),  fps
= new Boolean(false),  game_id
= new Integer((int)Math.ceil(Math.random(9000))),  health = new Integer(100)
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
= new String(""),  room
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
= new Boolean(true),  temp_directory
= new String(System.getProperty("java.io.tmpdir")),  transition_kind
= new Boolean(false),  transition_steps
= new Boolean(false),  view_angle
= new Boolean(false),  view_current
= new Boolean(false),  view_enabled
= new Boolean(false),  view_hborder
= new Boolean(false),  view_hport
= new Boolean(false),  view_hspeed
= new Boolean(false),  view_hview
= new Boolean(false),  view_Variable
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
        = new String(System.getProperty("user.dir"));

    public static Variable getArgument() {
        return argument;
    }

    public static void setArgument(Variable argument) {
        Variables.argument = argument;
    }

    public static Variable getArgument0() {
        return argument0;
    }

    public static void setArgument0(Variable argument0) {
        Variables.argument0 = argument0;
    }

    public static Variable getArgument1() {
        return argument1;
    }

    public static void setArgument1(Variable argument1) {
        Variables.argument1 = argument1;
    }

    public static Variable getArgument10() {
        return argument10;
    }

    public static void setArgument10(Variable argument10) {
        Variables.argument10 = argument10;
    }

    public static Variable getArgument11() {
        return argument11;
    }

    public static void setArgument11(Variable argument11) {
        Variables.argument11 = argument11;
    }

    public static Variable getArgument12() {
        return argument12;
    }

    public static void setArgument12(Variable argument12) {
        Variables.argument12 = argument12;
    }

    public static Variable getArgument13() {
        return argument13;
    }

    public static void setArgument13(Variable argument13) {
        Variables.argument13 = argument13;
    }

    public static Variable getArgument14() {
        return argument14;
    }

    public static void setArgument14(Variable argument14) {
        Variables.argument14 = argument14;
    }

    public static Variable getArgument15() {
        return argument15;
    }

    public static void setArgument15(Variable argument15) {
        Variables.argument15 = argument15;
    }

    public static Variable getArgument2() {
        return argument2;
    }

    public static void setArgument2(Variable argument2) {
        Variables.argument2 = argument2;
    }

    public static Variable getArgument3() {
        return argument3;
    }

    public static void setArgument3(Variable argument3) {
        Variables.argument3 = argument3;
    }

    public static Variable getArgument4() {
        return argument4;
    }

    public static void setArgument4(Variable argument4) {
        Variables.argument4 = argument4;
    }

    public static Variable getArgument5() {
        return argument5;
    }

    public static void setArgument5(Variable argument5) {
        Variables.argument5 = argument5;
    }

    public static Variable getArgument6() {
        return argument6;
    }

    public static void setArgument6(Variable argument6) {
        Variables.argument6 = argument6;
    }

    public static Variable getArgument7() {
        return argument7;
    }

    public static void setArgument7(Variable argument7) {
        Variables.argument7 = argument7;
    }

    public static Variable getArgument8() {
        return argument8;
    }

    public static void setArgument8(Variable argument8) {
        Variables.argument8 = argument8;
    }

    public static Variable getArgument9() {
        return argument9;
    }

    public static void setArgument9(Variable argument9) {
        Variables.argument9 = argument9;
    }

    public static Variable getArgument_relative() {
        return argument_relative;
    }

    public static void setArgument_relative(Variable argument_relative) {
        Variables.argument_relative = argument_relative;
    }

    public static Variable getBackground_alpha(int back) {
        return background_alpha;
    }

    public static void setBackground_alpha(int back,Variable background_alpha) {
        Variables.background_alpha = background_alpha;
    }

    public static Variable getBackground_blend(int back) {
        return background_blend;
    }

    public static void setBackground_blend(int back,Variable background_blend) {
        Variables.background_blend = background_blend;
    }

    public static Variable getBackground_color() {
        return new Color(Game.currentRoom.backcolor);
    }

    public static void setBackground_color(Variable background_color) {
        Game.currentRoom.backcolor = ((Color)background_color).c;
    }

    public static Variable getBackground_showcolor() {
        return new Boolean(Game.currentRoom.showcolor);
    }

    public static void setBackground_showcolor(Variable background_showcolor) {
        Game.currentRoom.showcolor = background_showcolor.getBoolean();
    }

    public static Variable getBackground_foreground(int back) {
        return background_foreground;
    }

    public static void setBackground_foreground(int back,Variable background_foreground) {
        Variables.background_foreground = background_foreground;
    }

    public static Variable getBackground_height(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_image.getHeight());
    }

    public static void setBackground_height(int back,Variable background_height) {
        //constant
    }

    public static Variable getBackground_hspeed(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_hspeed);
    }

    public static void setBackground_hspeed(int back,Variable background_hspeed) {
        Game.currentRoom.backgrounds.elementAt(back).background_hspeed = (int)background_hspeed.getDouble();
    }

    public static Variable getBackground_htiled(int back) {
        return background_htiled;
    }

    public static void setBackground_htiled(int back,Variable background_htiled) {
        Variables.background_htiled = background_htiled;
    }

    public static Variable getBackground_index(int back) {
        return background_index;
    }

    public static void setBackground_index(int back,Variable background_index) {
        Variables.background_index = background_index;
    }

   public static Variable getBackground_visible(int back) {
       return new Boolean(Game.currentRoom.backgrounds.elementAt(back).background_visible);
    }

    public static void setBackground_visible(int back,Variable background_visible) {
        Game.currentRoom.backgrounds.elementAt(back).background_visible = background_visible.getBoolean();
    }

    public static Variable getBackground_vspeed(int back) {
         return new Double(Game.currentRoom.backgrounds.elementAt(back).background_vspeed);
    }

    public static void setBackground_vspeed(int back,Variable background_vspeed) {
        Game.currentRoom.backgrounds.elementAt(back).background_vspeed = (int)background_vspeed.getDouble();
    }

    public static Variable getBackground_vtiled(int back) {
        return background_vtiled;
    }

    public static void setBackground_vtiled(int back,Variable background_vtiled) {
        Variables.background_vtiled = background_vtiled;
    }

    public static Variable getBackground_width(int back) {
         return new Double(Game.currentRoom.backgrounds.elementAt(back).background_image.getWidth());
    }

    public static void setBackground_width(int back,Variable background_width) {
        //constant
    }

    public static Variable getBackground_x(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_x);
    }

    public static void setBackground_x(int back,Variable background_x) {
        Game.currentRoom.backgrounds.elementAt(back).background_x = (int)background_x.getDouble();
    }

    public static Variable getBackground_xscale(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_xscale);
    }

    public static void setBackground_xscale(int back,Variable background_xscale) {
        Game.currentRoom.backgrounds.elementAt(back).background_xscale = (int)background_xscale.getDouble();
    Game.currentRoom.backgrounds.elementAt(back).xscale();
    }

    public static Variable getBackground_y(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_y);
    }

    public static void setBackground_y(int back,Variable background_y) {
        Game.currentRoom.backgrounds.elementAt(back).background_y = (int)background_y.getDouble();
    }

    public static Variable getBackground_yscale(int back) {
        return new Double(Game.currentRoom.backgrounds.elementAt(back).background_yscale);
    }

    public static void setBackground_yscale(int back,Variable background_yscale) {
        Game.currentRoom.backgrounds.elementAt(back).background_yscale = (int)background_yscale.getDouble();
    Game.currentRoom.backgrounds.elementAt(back).yscale();
    }

    public static Variable getCaption_health() {
        return caption_health;
    }

    public static void setCaption_health(Variable caption_health) {
        Variables.caption_health = caption_health;
        Game.currentRoom.updateCaption();
    }

    public static Variable getCaption_lives() {
        return caption_lives;
    }

    public static void setCaption_lives(Variable caption_lives) {
        Variables.caption_lives = caption_lives;
        Game.currentRoom.updateCaption();
    }

    public static Variable getCaption_score() {
        return caption_score;
    }

    public static void setCaption_score(Variable caption_score) {
        Variables.caption_score = caption_score;
        Game.currentRoom.updateCaption();
    }

    public static Variable getCurrent_day() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.DAY_OF_MONTH));
    }

    public static void setCurrent_day(Variable current_day) {
        //constant
    }

    public static Variable getCurrent_hour() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.HOUR_OF_DAY));
    }

    public static void setCurrent_hour(Variable current_hour) {
        //constant
    }

    public static Variable getCurrent_minute() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MINUTE));
    }

    public static void setCurrent_minute(Variable current_minute) {
       //constant
    }

    public static Variable getCurrent_month() {
         Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.MONTH)+1);
        //return current_month;
    }

    public static void setCurrent_month(Variable current_month) {
        //constant
    }

    public static Variable getCurrent_second() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.SECOND));
        //return current_second;
    }

    public static void setCurrent_second(Variable current_second) {
        //constant
    }

    public static Variable getCurrent_time() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.MILLISECOND));
        
    }

    public static void setCurrent_time(Variable current_time) {
        //constant
    }

    public static Variable getCurrent_weekday() {
        Calendar toDay = Calendar.getInstance();
        return new Integer(toDay.get(Calendar.DAY_OF_WEEK));
    }

    public static void setCurrent_weekday(Variable current_weekday) {
        //constant
    }

    public static Variable getCurrent_year() {
        Calendar toDay = Calendar.getInstance();
        return new Double(toDay.get(Calendar.YEAR));
        
    }

    public static void setCurrent_year(Variable current_year) {
        //constant
    }

    public static Variable getCursor_sprite() {
        return cursor_sprite;
    }

    public static void setCursor_sprite(Variable cursor_sprite) {
        Variables.cursor_sprite = cursor_sprite;
    }

    public static Variable getError_last() {
        return error_last;
    }

    public static void setError_last(Variable error_last) {
        Variables.error_last = error_last;
    }

    public static Variable getError_occurred() {
        return error_occurred;
    }

    public static void setError_occurred(Variable error_occurred) {
        Variables.error_occurred = error_occurred;
    }

    public static Variable getEvent_action() {
        return event_action;
    }

    public static void setEvent_action(Variable event_action) {
        Variables.event_action = event_action;
    }

    public static Variable getEvent_number() {
        return event_number;
    }

    public static void setEvent_number(Variable event_number) {
        Variables.event_number = event_number;
    }

    public static Variable getEvent_Variable() {
        return event_Variable;
    }

    public static void setEvent_Variable(Variable event_Variable) {
        Variables.event_Variable = event_Variable;
    }

    public static Variable getEvent_type() {
        return event_type;
    }

    public static void setEvent_type(Variable event_type) {
        Variables.event_type = event_type;
    }

    public static Variable getFps() {
        return new Integer(Game.game.getGame().getCurrentFPS());
    }

    public static void setFps(Variable fps) {
        //constant
    }

    public static Variable getGame_id() {
        return game_id;
    }

    public static void setGame_id(Variable game_id) {
        //constant
    }

    public static Variable getHealth() {
        return health;
    }

    public static void setHealth(Variable health) {
        Variables.health = health;
        Game.currentRoom.updateCaption();
    }

    public static Variable getInstance_count() {
        return new Integer(Game.currentRoom.instances.size());
    }

    public static void setInstance_count(Variable instance_count) {
        //constant
    }

    public static Variable getInstance_id() {
        return instance_id;
    }

    public static void setInstance_id(Variable instance_id) {
        Variables.instance_id = instance_id;
    }

    public static Variable getKeyboard_key() {
        return keyboard_key;
    }

    public static void setKeyboard_key(Variable keyboard_key) {
        Variables.keyboard_key = keyboard_key;
    }

    public static Variable getKeyboard_lastchar() {
        return keyboard_lastchar;
    }

    public static void setKeyboard_lastchar(Variable keyboard_lastchar) {
        Variables.keyboard_lastchar = keyboard_lastchar;
    }

    public static Variable getKeyboard_lastkey() {
        return keyboard_lastkey;
    }

    public static void setKeyboard_lastkey(Variable keyboard_lastkey) {
        Variables.keyboard_lastkey = keyboard_lastkey;
    }

    public static Variable getKeyboard_string() {
        return keyboard_string;
    }

    public static void setKeyboard_string(Variable keyboard_string) {
        Variables.keyboard_string = keyboard_string;
    }

    public static Variable getLives() {
        return lives;
    }

    public static void setLives(Variable lives) {
        Variables.lives = lives;
        Game.currentRoom.updateCaption();
    }

    public static Variable getMouse_button() {
        return mouse_button;
    }

    public static void setMouse_button(Variable mouse_button) {
        Variables.mouse_button = mouse_button;
    }

    public static Variable getMouse_lastbutton() {
        return mouse_lastbutton;
    }

    public static void setMouse_lastbutton(Variable mouse_lastbutton) {
        Variables.mouse_lastbutton = mouse_lastbutton;
    }

    public static Variable getMouse_x() {
        return new Integer(Game.game.getGame().getMouseX());
    }

    public static void setMouse_x(Variable mouse_x) {
       //constant
    }

    public static Variable getMouse_y() {
        return new Integer(Game.game.getGame().getMouseY());
    }

    public static void setMouse_y(Variable mouse_y) {
        //constant
    }

    public static Variable getProgram_directory() {
        try{
        return new String(""+(Variables.class.getProtectionDomain()
.getCodeSource().getLocation().toURI()));
        }catch(Exception ee){ee.printStackTrace();}
        return program_directory;
    }

    public static void setProgram_directory(Variable program_directory) {
        //Variables.program_directory = program_directory;
    }

    public static Variable getRoom() {
        return room;
    }

    public static void setRoom(Variable room) {
        Variables.room = room;
    }

    public static Variable getRoom_caption() {
        return room_caption;
    }

    public static void setRoom_caption(Variable room_caption) {
        Variables.room_caption = room_caption;
    }

    public static Variable getRoom_first() {
        return room_first;
    }

    public static void setRoom_first(Variable room_first) {
        Variables.room_first = room_first;
    }

    public static Variable getRoom_height() {
        return new Double(Game.currentRoom.height);
    }

    public static void setRoom_height(Variable room_height) {
        Game.currentRoom.height = (int)room_height.getDouble();
        Game.canvas.setSize(Game.currentRoom.width, Game.currentRoom.height);
    }

    public static Variable getRoom_last() {
        return room_last;
    }

    public static void setRoom_last(Variable room_last) {
        Variables.room_last = room_last;
    }

    public static Variable getRoom_persistent() {
        return room_persistent;
    }

    public static void setRoom_persistent(Variable room_persistent) {
        Variables.room_persistent = room_persistent;
    }

    public static Variable getRoom_speed() {
        return new Double(Game.currentRoom.speed);
    }

    public static void setRoom_speed(Variable room_speed) {
        Game.currentRoom.speed = (long) room_speed.getDouble();
    }

    public static Variable getRoom_width() {
        return new Double(Game.currentRoom.width);
    }

    public static void setRoom_width(Variable room_width) {
        Game.currentRoom.width = (int)room_width.getDouble();
        Game.canvas.setSize(Game.currentRoom.width, Game.currentRoom.height);
    }

    public static Variable getScore() {
        return score;
    }

    public static void setScore(Variable score) {
        Variables.score = score;
        Game.currentRoom.updateCaption();
    }

    public static Variable getSecure_mode() {
        return secure_mode;
    }

    public static void setSecure_mode(Variable secure_mode) {
        //constant
    }

    public static Variable getShow_health() {
        return show_health;
    }

    public static void setShow_health(Variable show_health) {
        Variables.show_health = show_health;
        Game.currentRoom.updateCaption();
    }

    public static Variable getShow_lives() {
        return show_lives;
    }

    public static void setShow_lives(Variable show_lives) {
        Variables.show_lives = show_lives;
        Game.currentRoom.updateCaption();
    }

    public static Variable getShow_score() {
        return show_score;
    }

    public static void setShow_score(Variable show_score) {
        Variables.show_score = show_score;
        Game.currentRoom.updateCaption();
    }

    public static Variable getTemp_directory() {
        return temp_directory;
    }

    public static void setTemp_directory(Variable temp_directory) {
       // Variables.temp_directory = temp_directory;
    }

    public static Variable getTransition_kind() {
        return transition_kind;
    }

    public static void setTransition_kind(Variable transition_kind) {
        Variables.transition_kind = transition_kind;
    }

    public static Variable getTransition_steps() {
        return transition_steps;
    }

    public static void setTransition_steps(Variable transition_steps) {
        Variables.transition_steps = transition_steps;
    }

    public static Variable getView_angle() {
        return view_angle;
    }

    public static void setView_angle(Variable view_angle) {
        Variables.view_angle = view_angle;
    }

    public static Variable getView_current() {
        return view_current;
    }

    public static void setView_current(Variable view_current) {
        Variables.view_current = view_current;
    }

    public static Variable getView_enabled() {
        return view_enabled;
    }

    public static void setView_enabled(Variable view_enabled) {
        Variables.view_enabled = view_enabled;
    }

    public static Variable getView_hborder() {
        return view_hborder;
    }

    public static void setView_hborder(Variable view_hborder) {
        Variables.view_hborder = view_hborder;
    }

    public static Variable getView_hport() {
        return view_hport;
    }

    public static void setView_hport(Variable view_hport) {
        Variables.view_hport = view_hport;
    }

    public static Variable getView_hspeed() {
        return view_hspeed;
    }

    public static void setView_hspeed(Variable view_hspeed) {
        Variables.view_hspeed = view_hspeed;
    }

    public static Variable getView_hview() {
        return view_hview;
    }

    public static void setView_hview(Variable view_hview) {
        Variables.view_hview = view_hview;
    }

    public static Variable getView_Variable() {
        return view_Variable;
    }

    public static void setView_Variable(Variable view_Variable) {
        Variables.view_Variable = view_Variable;
    }

    public static Variable getView_vborder() {
        return view_vborder;
    }

    public static void setView_vborder(Variable view_vborder) {
        Variables.view_vborder = view_vborder;
    }

    public static Variable getView_visible() {
        return view_visible;
    }

    public static void setView_visible(Variable view_visible) {
        Variables.view_visible = view_visible;
    }

    public static Variable getView_vspeed() {
        return view_vspeed;
    }

    public static void setView_vspeed(Variable view_vspeed) {
        Variables.view_vspeed = view_vspeed;
    }

    public static Variable getView_wport() {
        return view_wport;
    }

    public static void setView_wport(Variable view_wport) {
        Variables.view_wport = view_wport;
    }

    public static Variable getView_wview() {
        return view_wview;
    }

    public static void setView_wview(Variable view_wview) {
        Variables.view_wview = view_wview;
    }

    public static Variable getView_xport() {
        return view_xport;
    }

    public static void setView_xport(Variable view_xport) {
        Variables.view_xport = view_xport;
    }

    public static Variable getView_xview() {
        return view_xview;
    }

    public static void setView_xview(Variable view_xview) {
        Variables.view_xview = view_xview;
    }

    public static Variable getView_yport() {
        return view_yport;
    }

    public static void setView_yport(Variable view_yport) {
        Variables.view_yport = view_yport;
    }

    public static Variable getView_yview() {
        return view_yview;
    }

    public static void setView_yview(Variable view_yview) {
        Variables.view_yview = view_yview;
    }

    public static Variable getWorking_directory() {
        return working_directory;
    }

    public static void setWorking_directory(Variable working_directory) {
        Variables.working_directory = working_directory;
    }


}
