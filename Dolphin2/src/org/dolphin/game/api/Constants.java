
package org.dolphin.game.api;

import java.util.LinkedList;

import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.types.All;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.Cursor;


/**
 *
 * @author TGMG
 */
public class Constants extends Object {
protected Actor self;
public static Actor noone=new Actor(),other=noone,all=new All();
public LinkedList<Actor> selfs = new LinkedList();

    public Object getBm_add() {
        return new Object(); //  new Object(); //  bm_add;
    }

    public void setBm_add(Object bm_add) {
       // Constants.bm_add = bm_add;
    }

    public Object getBm_dest_alpha() {
        return new Object(); //  new Object(); //  bm_dest_alpha;
    }

    public void setBm_dest_alpha(Object bm_dest_alpha) {
        // Constant: this.bm_dest_alpha = bm_dest_alpha;
    }

    public Object getBm_dest_color() {
        return new Object(); //  new Object(); //  bm_dest_color;
    }

    public void setBm_dest_color(Object bm_dest_color) {
        // Constant: this.bm_dest_color = bm_dest_color;
    }

    public Object getBm_inv_dest_alpha() {
        return new Object(); //  new Object(); //  bm_inv_dest_alpha;
    }

    public void setBm_inv_dest_alpha(Object bm_inv_dest_alpha) {
        // Constant: this.bm_inv_dest_alpha = bm_inv_dest_alpha;
    }

    public Object getBm_inv_dest_color() {
        return new Object(); //  new Object(); //  bm_inv_dest_color;
    }

    public void setBm_inv_dest_color(Object bm_inv_dest_color) {
        // Constant: this.bm_inv_dest_color = bm_inv_dest_color;
    }

    public Object getBm_inv_src_alpha() {
        return new Object(); //  new Object(); //  bm_inv_src_alpha;
    }

    public void setBm_inv_src_alpha(Object bm_inv_src_alpha) {
        // Constant: this.bm_inv_src_alpha = bm_inv_src_alpha;
    }

    public Object getBm_inv_src_color() {
        return new Object(); //  new Object(); //  bm_inv_src_color;
    }

    public void setBm_inv_src_color(Object bm_inv_src_color) {
        // Constant: this.bm_inv_src_color = bm_inv_src_color;
    }

    public Object getBm_max() {
        return new Object(); //  new Object(); //  bm_max;
    }

    public void setBm_max(Object bm_max) {
        // Constant: this.bm_max = bm_max;
    }

    public Object getBm_normal() {
        return new Object(); //  new Object(); //  bm_normal;
    }

    public void setBm_normal(Object bm_normal) {
        // Constant: this.bm_normal = bm_normal;
    }

    public Object getBm_one() {
        return new Object(); //  bm_one;
    }

    public void setBm_one(Object bm_one) {
        // Constant: this.bm_one = bm_one;
    }

    public Object getBm_src_alpha() {
        return new Object(); //  bm_src_alpha;
    }

    public void setBm_src_alpha(Object bm_src_alpha) {
        // Constant: this.bm_src_alpha = bm_src_alpha;
    }

    public Object getBm_src_alpha_sat() {
        return new Object(); //  bm_src_alpha_sat;
    }

    public void setBm_src_alpha_sat(Object bm_src_alpha_sat) {
        // Constant: this.bm_src_alpha_sat = bm_src_alpha_sat;
    }

    public Object getBm_src_color() {
        return new Object(); //  bm_src_color;
    }

    public void setBm_src_color(Object bm_src_color) {
        // Constant: this.bm_src_color = bm_src_color;
    }

    public Object getBm_subtract() {
        return new Object(); //  bm_subtract;
    }

    public void setBm_subtract(Object bm_subtract) {
        // Constant: this.bm_subtract = bm_subtract;
    }

    public Object getBm_zero() {
        return new Object(); //  bm_zero;
    }

    public void setBm_zero(Object bm_zero) {
        // Constant: this.bm_zero = bm_zero;
    }
Color c_aqua = new Color(new java.awt.Color(0,255,255));
    public Object getC_aqua() {
        return c_aqua; //  c_aqua;
    }

    public void setC_aqua(Object c_aqua) {
        // Constant: this.c_aqua = c_aqua;
    }

    public Object getC_black() {
        return  new Color(java.awt.Color.black); //  c_black;
    }

    public void setC_black(Object c_black) {
        // Constant: this.c_black = c_black;
    }

    public Object getC_blue() {
        return  new Color(java.awt.Color.blue); //  c_blue;
    }

    public void setC_blue(Object c_blue) {
        // Constant: this.c_blue = c_blue;
    }

    public Object getC_dkgray() {
        return  new Color(java.awt.Color.DARK_GRAY); //  c_dkgray;
    }

    public void setC_dkgray(Object c_dkgray) {
        // Constant: this.c_dkgray = c_dkgray;
    }

    public Object getC_fuchsia() {
        return new Color(new java.awt.Color(255,0,255)); //  c_fuchsia;
    }

    public void setC_fuchsia(Object c_fuchsia) {
        // Constant: this.c_fuchsia = c_fuchsia;
    }

    public Object getC_gray() {
        return  new Color(java.awt.Color.GRAY); //  c_gray;
    }

    public void setC_gray(Object c_gray) {
        // Constant: this.c_gray = c_gray;
    }
Color c_green = new Color(java.awt.Color.GREEN);
    public Object getC_green() {
        return  c_green; //  c_green;
    }

    public void setC_green(Object c_green) {
        // Constant: this.c_green = c_green;
    }

    public Object getC_lime() {
        return  new Color(new java.awt.Color(0,255,0)); //  c_lime;
    }

    public void setC_lime(Object c_lime) {
        // Constant: this.c_lime = c_lime;
    }

    public Object getC_ltgray() {
        return  new Color(java.awt.Color.LIGHT_GRAY); //  c_ltgray;
    }

    public void setC_ltgray(Object c_ltgray) {
        // Constant: this.c_ltgray = c_ltgray;
    }

    public Object getC_maroon() {
        return  new Color(new java.awt.Color(128,0,0)); //  c_maroon;
    }

    public void setC_maroon(Object c_maroon) {
        // Constant: this.c_maroon = c_maroon;
    }

    public Object getC_navy() {
        return  new Color(new java.awt.Color(0,0,128)); //  c_navy;
    }

    public void setC_navy(Object c_navy) {
        // Constant: this.c_navy = c_navy;
    }

    public Object getC_olive() {
        return  new Color(new java.awt.Color(128,128,0)); //  c_olive;
    }

    public void setC_olive(Object c_olive) {
        // Constant: this.c_olive = c_olive;
    }

    public Object getC_orange() {
        return  new Color(java.awt.Color.orange); //  c_orange;
    }

    public void setC_orange(Object c_orange) {
        // Constant: this.c_orange = c_orange;
    }

    public Object getC_purple() {
        return  new Color(new java.awt.Color(128,0,128)); //  c_purple;
    }

    public void setC_purple(Object c_purple) {
        // Constant: this.c_purple = c_purple;
    }

    public Object getC_red() {
        return  new Color(java.awt.Color.red); //  c_red;
    }

    public void setC_red(Object c_red) {
        // Constant: this.c_red = c_red;
    }

    public Object getC_silver() {
        return  new Color(new java.awt.Color(192,192,192)); //  c_silver;
    }

    public void setC_silver(Object c_silver) {
        // Constant: this.c_silver = c_silver;
    }

    public Object getC_teal() {
        return  new Color(new java.awt.Color(0,128,128)); //  c_teal;
    }

    public void setC_teal(Object c_teal) {
        // Constant: this.c_teal = c_teal;
    }

    public Object getC_white() {
        return  new Color(java.awt.Color.WHITE); //  c_white;
    }

    public void setC_white(Object c_white) {
        // Constant: this.c_white = c_white;
    }

    public Object getC_yellow() {
        return  new Color(java.awt.Color.yellow); //  c_yellow;
    }

    public void setC_yellow(Object c_yellow) {
        // Constant: this.c_yellow = c_yellow;
    }

    public Object getCr_appstart() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_appstart;
    }

    public void setCr_appstart(Object cr_appstart) {
        // Constant: this.cr_appstart = cr_appstart;
    }

    public Object getCr_arrow() {
            return new Cursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); //  cr_arrow;
   }

    public void setCr_arrow(Object cr_arrow) {
        // Constant: this.cr_arrow = cr_arrow;
    }

    public Object getCr_arrrow() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_arrrow;
    }

    public void setCr_arrrow(Object cr_arrrow) {
        // Constant: this.cr_arrrow = cr_arrrow;
    }

    public Object getCr_beam() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_beam;
    }

    public void setCr_beam(Object cr_beam) {
        // Constant: this.cr_beam = cr_beam;
    }

    public Object getCr_cross() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    }

    public void setCr_cross(Object cr_cross) {
        // Constant: this.cr_cross = cr_cross;
    }

    public Object getCr_default() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_default;
    }

    public void setCr_default(Object cr_default) {
        // Constant: this.cr_default = cr_default;
    }

    public Object getCr_drag() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_drag;
    }

    public void setCr_drag(Object cr_drag) {
        // Constant: this.cr_drag = cr_drag;
    }

    public Object getCr_handpoint() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); //  cr_handpoint;
    }

    public void setCr_handpoint(Object cr_handpoint) {
        // Constant: this.cr_handpoint = cr_handpoint;
    }

    public Object getCr_help() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_help;
    }

    public void setCr_help(Object cr_help) {
        // Constant: this.cr_help = cr_help;
    }

    public Object getCr_hourglass() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR)); //  cr_hourglass;
    }

    public void setCr_hourglass(Object cr_hourglass) {
        // Constant: this.cr_hourglass = cr_hourglass;
    }

    public Object getCr_hsplit() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_hsplit;
    }

    public void setCr_hsplit(Object cr_hsplit) {
        // Constant: this.cr_hsplit = cr_hsplit;
    }

    public Object getCr_multidrag() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_multidrag;
    }

    public void setCr_multidrag(Object cr_multidrag) {
        // Constant: this.cr_multidrag = cr_multidrag;
    }

    public Object getCr_no() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_no;
    }

    public void setCr_no(Object cr_no) {
        // Constant: this.cr_no = cr_no;
    }

    public Object getCr_nodrop() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_nodrop;
    }

    public void setCr_nodrop(Object cr_nodrop) {
        // Constant: this.cr_nodrop = cr_nodrop;
    }

    public Object getCr_none() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_none;
    }

    public void setCr_none(Object cr_none) {
        // Constant: this.cr_none = cr_none;
    }

    public Object getCr_size_all() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_all;
    }

    public void setCr_size_all(Object cr_size_all) {
        // Constant: this.cr_size_all = cr_size_all;
    }

    public Object getCr_size_nesw() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR)); //  cr_size_nesw;
    }

    public void setCr_size_nesw(Object cr_size_nesw) {
        // Constant: this.cr_size_nesw = cr_size_nesw;
    }

    public Object getCr_size_ns() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_ns;
    }

    public void setCr_size_ns(Object cr_size_ns) {
        // Constant: this.cr_size_ns = cr_size_ns;
    }

    public Object getCr_size_nwse() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR)); //  cr_size_nwse;
    }

    public void setCr_size_nwse(Object cr_size_nwse) {
        // Constant: this.cr_size_nwse = cr_size_nwse;
    }

    public Object getCr_size_we() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_we;
    }

    public void setCr_size_we(Object cr_size_we) {
        // Constant: this.cr_size_we = cr_size_we;
    }

    public Object getCr_sqlwait() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_sqlwait;
    }

    public void setCr_sqlwait(Object cr_sqlwait) {
        // Constant: this.cr_sqlwait = cr_sqlwait;
    }

    public Object getCr_uparrow() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_uparrow;
    }

    public void setCr_uparrow(Object cr_uparrow) {
        // Constant: this.cr_uparrow = cr_uparrow;
    }

    public Object getCr_vsplit() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_vsplit;
    }

    public void setCr_vsplit(Object cr_vsplit) {
        // Constant: this.cr_vsplit = cr_vsplit;
    }

    public Object getDll_cdecl() {
        return new Object(); //  dll_cdecl;
    }

    public void setDll_cdecl(Object dll_cdecl) {
        // Constant: this.dll_cdecl = dll_cdecl;
    }

    public Object getDll_stdcall() {
        return new Object(); //  dll_stdcall;
    }

    public void setDll_stdcall(Object dll_stdcall) {
        // Constant: this.dll_stdcall = dll_stdcall;
    }

    public Object getEf_cloud() {
        return new Object(); //  ef_cloud;
    }

    public void setEf_cloud(Object ef_cloud) {
        // Constant: this.ef_cloud = ef_cloud;
    }

    public Object getEf_ellipse() {
        return new Object(); //  ef_ellipse;
    }

    public void setEf_ellipse(Object ef_ellipse) {
        // Constant: this.ef_ellipse = ef_ellipse;
    }

    public Object getEf_explosion() {
        return new Object(); //  ef_explosion;
    }

    public void setEf_explosion(Object ef_explosion) {
        // Constant: this.ef_explosion = ef_explosion;
    }

    public Object getEf_firework() {
        return new Object(); //  ef_firework;
    }

    public void setEf_firework(Object ef_firework) {
        // Constant: this.ef_firework = ef_firework;
    }

    public Object getEf_flare() {
        return new Object(); //  ef_flare;
    }

    public void setEf_flare(Object ef_flare) {
        // Constant: this.ef_flare = ef_flare;
    }

    public Object getEf_rain() {
        return new Object(); //  ef_rain;
    }

    public void setEf_rain(Object ef_rain) {
        // Constant: this.ef_rain = ef_rain;
    }

    public Object getEf_ring() {
        return new Object(); //  ef_ring;
    }

    public void setEf_ring(Object ef_ring) {
        // Constant: this.ef_ring = ef_ring;
    }

    public Object getEf_smoke() {
        return new Object(); //  ef_smoke;
    }

    public void setEf_smoke(Object ef_smoke) {
        // Constant: this.ef_smoke = ef_smoke;
    }

    public Object getEf_smokeup() {
        return new Object(); //  ef_smokeup;
    }

    public void setEf_smokeup(Object ef_smokeup) {
        // Constant: this.ef_smokeup = ef_smokeup;
    }

    public Object getEf_snow() {
        return new Object(); //  ef_snow;
    }

    public void setEf_snow(Object ef_snow) {
        // Constant: this.ef_snow = ef_snow;
    }

    public Object getEf_spark() {
        return new Object(); //  ef_spark;
    }

    public void setEf_spark(Object ef_spark) {
        // Constant: this.ef_spark = ef_spark;
    }

    public Object getEf_star() {
        return new Object(); //  ef_star;
    }

    public void setEf_star(Object ef_star) {
        // Constant: this.ef_star = ef_star;
    }

    public Object getEv_alarm() {
        return new Object(); //  ev_alarm;
    }

    public void setEv_alarm(Object ev_alarm) {
        // Constant: this.ev_alarm = ev_alarm;
    }

    public Object getEv_animation_end() {
        return new Object(); //  ev_animation_end;
    }

    public void setEv_animation_end(Object ev_animation_end) {
        // Constant: this.ev_animation_end = ev_animation_end;
    }

    public Object getEv_boundary() {
        return new Object(); //  ev_boundary;
    }

    public void setEv_boundary(Object ev_boundary) {
        // Constant: this.ev_boundary = ev_boundary;
    }

    public Object getEv_close_button() {
        return new Object(); //  ev_close_button;
    }

    public void setEv_close_button(Object ev_close_button) {
        // Constant: this.ev_close_button = ev_close_button;
    }

    public Object getEv_collision() {
        return new Object(); //  ev_collision;
    }

    public void setEv_collision(Object ev_collision) {
        // Constant: this.ev_collision = ev_collision;
    }

    public Object getEv_create() {
        return new Object(); //  ev_create;
    }

    public void setEv_create(Object ev_create) {
        // Constant: this.ev_create = ev_create;
    }

    public Object getEv_destroy() {
        return new Object(); //  ev_destroy;
    }

    public void setEv_destroy(Object ev_destroy) {
        // Constant: this.ev_destroy = ev_destroy;
    }

    public Object getEv_draw() {
        return new Object(); //  ev_draw;
    }

    public void setEv_draw(Object ev_draw) {
        // Constant: this.ev_draw = ev_draw;
    }

    public Object getEv_end_of_path() {
        return new Object(); //  ev_end_of_path;
    }

    public void setEv_end_of_path(Object ev_end_of_path) {
        // Constant: this.ev_end_of_path = ev_end_of_path;
    }

    public Object getEv_game_end() {
        return new Object(); //  ev_game_end;
    }

    public void setEv_game_end(Object ev_game_end) {
        // Constant: this.ev_game_end = ev_game_end;
    }

    public Object getEv_game_start() {
        return new Object(); //  ev_game_start;
    }

    public void setEv_game_start(Object ev_game_start) {
        // Constant: this.ev_game_start = ev_game_start;
    }

    public Object getEv_global_left_button() {
        return new Object(); //  ev_global_left_button;
    }

    public void setEv_global_left_button(Object ev_global_left_button) {
        // Constant: this.ev_global_left_button = ev_global_left_button;
    }

    public Object getEv_global_left_press() {
        return new Object(); //  ev_global_left_press;
    }

    public void setEv_global_left_press(Object ev_global_left_press) {
        // Constant: this.ev_global_left_press = ev_global_left_press;
    }

    public Object getEv_global_left_release() {
        return new Object(); //  ev_global_left_release;
    }

    public void setEv_global_left_release(Object ev_global_left_release) {
        // Constant: this.ev_global_left_release = ev_global_left_release;
    }

    public Object getEv_global_middle_button() {
        return new Object(); //  ev_global_middle_button;
    }

    public void setEv_global_middle_button(Object ev_global_middle_button) {
        // Constant: this.ev_global_middle_button = ev_global_middle_button;
    }

    public Object getEv_global_middle_press() {
        return new Object(); //  ev_global_middle_press;
    }

    public void setEv_global_middle_press(Object ev_global_middle_press) {
        // Constant: this.ev_global_middle_press = ev_global_middle_press;
    }

    public Object getEv_global_middle_release() {
        return new Object(); //  ev_global_middle_release;
    }

    public void setEv_global_middle_release(Object ev_global_middle_release) {
        // Constant: this.ev_global_middle_release = ev_global_middle_release;
    }

    public Object getEv_global_press() {
        return new Object(); //  ev_global_press;
    }

    public void setEv_global_press(Object ev_global_press) {
        // Constant: this.ev_global_press = ev_global_press;
    }

    public Object getEv_global_release() {
        return new Object(); //  ev_global_release;
    }

    public void setEv_global_release(Object ev_global_release) {
        // Constant: this.ev_global_release = ev_global_release;
    }

    public Object getEv_global_right_button() {
        return new Object(); //  ev_global_right_button;
    }

    public void setEv_global_right_button(Object ev_global_right_button) {
        // Constant: this.ev_global_right_button = ev_global_right_button;
    }

    public Object getEv_global_right_press() {
        return new Object(); //  ev_global_right_press;
    }

    public void setEv_global_right_press(Object ev_global_right_press) {
        // Constant: this.ev_global_right_press = ev_global_right_press;
    }

    public Object getEv_global_right_release() {
        return new Object(); //  ev_global_right_release;
    }

    public void setEv_global_right_release(Object ev_global_right_release) {
        // Constant: this.ev_global_right_release = ev_global_right_release;
    }

    public Object getEv_joystick1_button1() {
        return new Object(); //  ev_joystick1_button1;
    }

    public void setEv_joystick1_button1(Object ev_joystick1_button1) {
        // Constant: this.ev_joystick1_button1 = ev_joystick1_button1;
    }

    public Object getEv_joystick1_button2() {
        return new Object(); //  ev_joystick1_button2;
    }

    public void setEv_joystick1_button2(Object ev_joystick1_button2) {
        // Constant: this.ev_joystick1_button2 = ev_joystick1_button2;
    }

    public Object getEv_joystick1_button3() {
        return new Object(); //  ev_joystick1_button3;
    }

    public void setEv_joystick1_button3(Object ev_joystick1_button3) {
        // Constant: this.ev_joystick1_button3 = ev_joystick1_button3;
    }

    public Object getEv_joystick1_button4() {
        return new Object(); //  ev_joystick1_button4;
    }

    public void setEv_joystick1_button4(Object ev_joystick1_button4) {
        // Constant: this.ev_joystick1_button4 = ev_joystick1_button4;
    }

    public Object getEv_joystick1_button5() {
        return new Object(); //  ev_joystick1_button5;
    }

    public void setEv_joystick1_button5(Object ev_joystick1_button5) {
        // Constant: this.ev_joystick1_button5 = ev_joystick1_button5;
    }

    public Object getEv_joystick1_button6() {
        return new Object(); //  ev_joystick1_button6;
    }

    public void setEv_joystick1_button6(Object ev_joystick1_button6) {
        // Constant: this.ev_joystick1_button6 = ev_joystick1_button6;
    }

    public Object getEv_joystick1_button7() {
        return new Object(); //  ev_joystick1_button7;
    }

    public void setEv_joystick1_button7(Object ev_joystick1_button7) {
        // Constant: this.ev_joystick1_button7 = ev_joystick1_button7;
    }

    public Object getEv_joystick1_button8() {
        return new Object(); //  ev_joystick1_button8;
    }

    public void setEv_joystick1_button8(Object ev_joystick1_button8) {
        // Constant: this.ev_joystick1_button8 = ev_joystick1_button8;
    }

    public Object getEv_joystick1_down() {
        return new Object(); //  ev_joystick1_down;
    }

    public void setEv_joystick1_down(Object ev_joystick1_down) {
        // Constant: this.ev_joystick1_down = ev_joystick1_down;
    }

    public Object getEv_joystick1_left() {
        return new Object(); //  ev_joystick1_left;
    }

    public void setEv_joystick1_left(Object ev_joystick1_left) {
        // Constant: this.ev_joystick1_left = ev_joystick1_left;
    }

    public Object getEv_joystick1_right() {
        return new Object(); //  ev_joystick1_right;
    }

    public void setEv_joystick1_right(Object ev_joystick1_right) {
        // Constant: this.ev_joystick1_right = ev_joystick1_right;
    }

    public Object getEv_joystick1_up() {
        return new Object(); //  ev_joystick1_up;
    }

    public void setEv_joystick1_up(Object ev_joystick1_up) {
        // Constant: this.ev_joystick1_up = ev_joystick1_up;
    }

    public Object getEv_joystick2_button1() {
        return new Object(); //  ev_joystick2_button1;
    }

    public void setEv_joystick2_button1(Object ev_joystick2_button1) {
        // Constant: this.ev_joystick2_button1 = ev_joystick2_button1;
    }

    public Object getEv_joystick2_button2() {
        return new Object(); //  ev_joystick2_button2;
    }

    public void setEv_joystick2_button2(Object ev_joystick2_button2) {
        // Constant: this.ev_joystick2_button2 = ev_joystick2_button2;
    }

    public Object getEv_joystick2_button3() {
        return new Object(); //  ev_joystick2_button3;
    }

    public void setEv_joystick2_button3(Object ev_joystick2_button3) {
        // Constant: this.ev_joystick2_button3 = ev_joystick2_button3;
    }

    public Object getEv_joystick2_button4() {
        return new Object(); //  ev_joystick2_button4;
    }

    public void setEv_joystick2_button4(Object ev_joystick2_button4) {
        // Constant: this.ev_joystick2_button4 = ev_joystick2_button4;
    }

    public Object getEv_joystick2_button5() {
        return new Object(); //  ev_joystick2_button5;
    }

    public void setEv_joystick2_button5(Object ev_joystick2_button5) {
        // Constant: this.ev_joystick2_button5 = ev_joystick2_button5;
    }

    public Object getEv_joystick2_button6() {
        return new Object(); //  ev_joystick2_button6;
    }

    public void setEv_joystick2_button6(Object ev_joystick2_button6) {
        // Constant: this.ev_joystick2_button6 = ev_joystick2_button6;
    }

    public Object getEv_joystick2_button7() {
        return new Object(); //  ev_joystick2_button7;
    }

    public void setEv_joystick2_button7(Object ev_joystick2_button7) {
        // Constant: this.ev_joystick2_button7 = ev_joystick2_button7;
    }

    public Object getEv_joystick2_button8() {
        return new Object(); //  ev_joystick2_button8;
    }

    public void setEv_joystick2_button8(Object ev_joystick2_button8) {
        // Constant: this.ev_joystick2_button8 = ev_joystick2_button8;
    }

    public Object getEv_joystick2_down() {
        return new Object(); //  ev_joystick2_down;
    }

    public void setEv_joystick2_down(Object ev_joystick2_down) {
        // Constant: this.ev_joystick2_down = ev_joystick2_down;
    }

    public Object getEv_joystick2_left() {
        return new Object(); //  ev_joystick2_left;
    }

    public void setEv_joystick2_left(Object ev_joystick2_left) {
        // Constant: this.ev_joystick2_left = ev_joystick2_left;
    }

    public Object getEv_joystick2_right() {
        return new Object(); //  ev_joystick2_right;
    }

    public void setEv_joystick2_right(Object ev_joystick2_right) {
        // Constant: this.ev_joystick2_right = ev_joystick2_right;
    }

    public Object getEv_joystick2_up() {
        return new Object(); //  ev_joystick2_up;
    }

    public void setEv_joystick2_up(Object ev_joystick2_up) {
        // Constant: this.ev_joystick2_up = ev_joystick2_up;
    }

    public Object getEv_keyboard() {
        return new Object(); //  ev_keyboard;
    }

    public void setEv_keyboard(Object ev_keyboard) {
        // Constant: this.ev_keyboard = ev_keyboard;
    }

    public Object getEv_keypress() {
        return new Object(); //  ev_keypress;
    }

    public void setEv_keypress(Object ev_keypress) {
        // Constant: this.ev_keypress = ev_keypress;
    }

    public Object getEv_keyrelease() {
        return new Object(); //  ev_keyrelease;
    }

    public void setEv_keyrelease(Object ev_keyrelease) {
        // Constant: this.ev_keyrelease = ev_keyrelease;
    }

    public Object getEv_left_button() {
        return new Object(); //  ev_left_button;
    }

    public void setEv_left_button(Object ev_left_button) {
        // Constant: this.ev_left_button = ev_left_button;
    }

    public Object getEv_left_press() {
        return new Object(); //  ev_left_press;
    }

    public void setEv_left_press(Object ev_left_press) {
        // Constant: this.ev_left_press = ev_left_press;
    }

    public Object getEv_left_release() {
        return new Object(); //  ev_left_release;
    }

    public void setEv_left_release(Object ev_left_release) {
        // Constant: this.ev_left_release = ev_left_release;
    }

    public Object getEv_middle_button() {
        return new Object(); //  ev_middle_button;
    }

    public void setEv_middle_button(Object ev_middle_button) {
        // Constant: this.ev_middle_button = ev_middle_button;
    }

    public Object getEv_middle_press() {
        return new Object(); //  ev_middle_press;
    }

    public void setEv_middle_press(Object ev_middle_press) {
        // Constant: this.ev_middle_press = ev_middle_press;
    }

    public Object getEv_middle_release() {
        return new Object(); //  ev_middle_release;
    }

    public void setEv_middle_release(Object ev_middle_release) {
        // Constant: this.ev_middle_release = ev_middle_release;
    }

    public Object getEv_mouse() {
        return new Object(); //  ev_mouse;
    }

    public void setEv_mouse(Object ev_mouse) {
        // Constant: this.ev_mouse = ev_mouse;
    }

    public Object getEv_mouse_enter() {
        return new Object(); //  ev_mouse_enter;
    }

    public void setEv_mouse_enter(Object ev_mouse_enter) {
        // Constant: this.ev_mouse_enter = ev_mouse_enter;
    }

    public Object getEv_mouse_leave() {
        return new Object(); //  ev_mouse_leave;
    }

    public void setEv_mouse_leave(Object ev_mouse_leave) {
        // Constant: this.ev_mouse_leave = ev_mouse_leave;
    }

    public Object getEv_mouse_wheel_down() {
        return new Object(); //  ev_mouse_wheel_down;
    }

    public void setEv_mouse_wheel_down(Object ev_mouse_wheel_down) {
        // Constant: this.ev_mouse_wheel_down = ev_mouse_wheel_down;
    }

    public Object getEv_mouse_wheel_up() {
        return new Object(); //  ev_mouse_wheel_up;
    }

    public void setEv_mouse_wheel_up(Object ev_mouse_wheel_up) {
        // Constant: this.ev_mouse_wheel_up = ev_mouse_wheel_up;
    }

    public Object getEv_no_button() {
        return new Object(); //  ev_no_button;
    }

    public void setEv_no_button(Object ev_no_button) {
        // Constant: this.ev_no_button = ev_no_button;
    }

    public Object getEv_no_more_health() {
        return new Object(); //  ev_no_more_health;
    }

    public void setEv_no_more_health(Object ev_no_more_health) {
        // Constant: this.ev_no_more_health = ev_no_more_health;
    }

    public Object getEv_no_more_lives() {
        return new Object(); //  ev_no_more_lives;
    }

    public void setEv_no_more_lives(Object ev_no_more_lives) {
        // Constant: this.ev_no_more_lives = ev_no_more_lives;
    }

    public Object getEv_other() {
        return new Object(); //  ev_other;
    }

    public void setEv_other(Object ev_other) {
        // Constant: this.ev_other = ev_other;
    }

    public Object getEv_outside() {
        return new Object(); //  ev_outside;
    }

    public void setEv_outside(Object ev_outside) {
        // Constant: this.ev_outside = ev_outside;
    }

    public Object getEv_right_button() {
        return new Object(); //  ev_right_button;
    }

    public void setEv_right_button(Object ev_right_button) {
        // Constant: this.ev_right_button = ev_right_button;
    }

    public Object getEv_right_press() {
        return new Object(); //  ev_right_press;
    }

    public void setEv_right_press(Object ev_right_press) {
        // Constant: this.ev_right_press = ev_right_press;
    }

    public Object getEv_right_release() {
        return new Object(); //  ev_right_release;
    }

    public void setEv_right_release(Object ev_right_release) {
        // Constant: this.ev_right_release = ev_right_release;
    }

    public Object getEv_room_end() {
        return new Object(); //  ev_room_end;
    }

    public void setEv_room_end(Object ev_room_end) {
        // Constant: this.ev_room_end = ev_room_end;
    }

    public Object getEv_room_start() {
        return new Object(); //  ev_room_start;
    }

    public void setEv_room_start(Object ev_room_start) {
        // Constant: this.ev_room_start = ev_room_start;
    }

    public Object getEv_step() {
        return new Object(); //  ev_step;
    }

    public void setEv_step(Object ev_step) {
        // Constant: this.ev_step = ev_step;
    }

    public Object getEv_step_begin() {
        return new Object(); //  ev_step_begin;
    }

    public void setEv_step_begin(Object ev_step_begin) {
        // Constant: this.ev_step_begin = ev_step_begin;
    }

    public Object getEv_step_end() {
        return new Object(); //  ev_step_end;
    }

    public void setEv_step_end(Object ev_step_end) {
        // Constant: this.ev_step_end = ev_step_end;
    }

    public Object getEv_step_normal() {
        return new Object(); //  ev_step_normal;
    }

    public void setEv_step_normal(Object ev_step_normal) {
        // Constant: this.ev_step_normal = ev_step_normal;
    }

    public Object getEv_user0() {
        return new Object(); //  ev_user0;
    }

    public void setEv_user0(Object ev_user0) {
        // Constant: this.ev_user0 = ev_user0;
    }

    public Object getEv_user1() {
        return new Object(); //  ev_user1;
    }

    public void setEv_user1(Object ev_user1) {
        // Constant: this.ev_user1 = ev_user1;
    }

    public Object getEv_user10() {
        return new Object(); //  ev_user10;
    }

    public void setEv_user10(Object ev_user10) {
        // Constant: this.ev_user10 = ev_user10;
    }

    public Object getEv_user11() {
        return new Object(); //  ev_user11;
    }

    public void setEv_user11(Object ev_user11) {
        // Constant: this.ev_user11 = ev_user11;
    }

    public Object getEv_user12() {
        return new Object(); //  ev_user12;
    }

    public void setEv_user12(Object ev_user12) {
        // Constant: this.ev_user12 = ev_user12;
    }

    public Object getEv_user13() {
        return new Object(); //  ev_user13;
    }

    public void setEv_user13(Object ev_user13) {
        // Constant: this.ev_user13 = ev_user13;
    }

    public Object getEv_user14() {
        return new Object(); //  ev_user14;
    }

    public void setEv_user14(Object ev_user14) {
        // Constant: this.ev_user14 = ev_user14;
    }

    public Object getEv_user15() {
        return new Object(); //  ev_user15;
    }

    public void setEv_user15(Object ev_user15) {
        // Constant: this.ev_user15 = ev_user15;
    }

    public Object getEv_user2() {
        return new Object(); //  ev_user2;
    }

    public void setEv_user2(Object ev_user2) {
        // Constant: this.ev_user2 = ev_user2;
    }

    public Object getEv_user3() {
        return new Object(); //  ev_user3;
    }

    public void setEv_user3(Object ev_user3) {
        // Constant: this.ev_user3 = ev_user3;
    }

    public Object getEv_user4() {
        return new Object(); //  ev_user4;
    }

    public void setEv_user4(Object ev_user4) {
        // Constant: this.ev_user4 = ev_user4;
    }

    public Object getEv_user5() {
        return new Object(); //  ev_user5;
    }

    public void setEv_user5(Object ev_user5) {
        // Constant: this.ev_user5 = ev_user5;
    }

    public Object getEv_user6() {
        return new Object(); //  ev_user6;
    }

    public void setEv_user6(Object ev_user6) {
        // Constant: this.ev_user6 = ev_user6;
    }

    public Object getEv_user7() {
        return new Object(); //  ev_user7;
    }

    public void setEv_user7(Object ev_user7) {
        // Constant: this.ev_user7 = ev_user7;
    }

    public Object getEv_user8() {
        return new Object(); //  ev_user8;
    }

    public void setEv_user8(Object ev_user8) {
        // Constant: this.ev_user8 = ev_user8;
    }

    public Object getEv_user9() {
        return new Object(); //  ev_user9;
    }

    public void setEv_user9(Object ev_user9) {
        // Constant: this.ev_user9 = ev_user9;
    }

    public Object getFa_archive() {
        return new Object(); //  fa_archive;
    }

    public void setFa_archive(Object fa_archive) {
        // Constant: this.fa_archive = fa_archive;
    }

    public Object getFa_bottom() {
        return new Object(); //  fa_bottom;
    }

    public void setFa_bottom(Object fa_bottom) {
        // Constant: this.fa_bottom = fa_bottom;
    }

    public Object getFa_center() {
        return new Object(); //  fa_center;
    }

    public void setFa_center(Object fa_center) {
        // Constant: this.fa_center = fa_center;
    }

    public Object getFa_directory() {
        return new Object(); //  fa_directory;
    }

    public void setFa_directory(Object fa_directory) {
        // Constant: this.fa_directory = fa_directory;
    }

    public Object getFa_hidden() {
        return new Object(); //  fa_hidden;
    }

    public void setFa_hidden(Object fa_hidden) {
        // Constant: this.fa_hidden = fa_hidden;
    }

    public Object getFa_left() {
        return new Object(); //  fa_left;
    }

    public void setFa_left(Object fa_left) {
        // Constant: this.fa_left = fa_left;
    }

    public Object getFa_middle() {
        return new Object(); //  fa_middle;
    }

    public void setFa_middle(Object fa_middle) {
        // Constant: this.fa_middle = fa_middle;
    }

    public Object getFa_readonly() {
        return new Object(); //  fa_readonly;
    }

    public void setFa_readonly(Object fa_readonly) {
        // Constant: this.fa_readonly = fa_readonly;
    }

    public Object getFa_right() {
        return new Object(); //  fa_right;
    }

    public void setFa_right(Object fa_right) {
        // Constant: this.fa_right = fa_right;
    }

    public Object getFa_sysfile() {
        return new Object(); //  fa_sysfile;
    }

    public void setFa_sysfile(Object fa_sysfile) {
        // Constant: this.fa_sysfile = fa_sysfile;
    }

    public Object getFa_top() {
        return new Object(); //  fa_top;
    }

    public void setFa_top(Object fa_top) {
        // Constant: this.fa_top = fa_top;
    }

    public Object getFa_volumeid() {
        return new Object(); //  fa_volumeid;
    }

    public void setFa_volumeid(Object fa_volumeid) {
        // Constant: this.fa_volumeid = fa_volumeid;
    }

    public Object getGlobal() {
        return new Object(); //  global;
    }

    public void setGlobal(Object global) {
        // Constant: this.global = global;
    }

    public Object getLocal() {
        return new Object(); //  local;
    }

    public void setLocal(Object local) {
        // Constant: this.local = local;
    }

    public Object getMb_any() {
        return new Object(); //  mb_any;
    }

    public void setMb_any(Object mb_any) {
        // Constant: this.mb_any = mb_any;
    }

    public Object getMb_left() {
        return new Object(); //  mb_left;
    }

    public void setMb_left(Object mb_left) {
        // Constant: this.mb_left = mb_left;
    }

    public Object getMb_middle() {
        return new Object(); //  mb_middle;
    }

    public void setMb_middle(Object mb_middle) {
        // Constant: this.mb_middle = mb_middle;
    }

    public Object getMb_none() {
        return new Object(); //  mb_none;
    }

    public void setMb_none(Object mb_none) {
        // Constant: this.mb_none = mb_none;
    }

    public Object getMb_right() {
        return new Object(); //  mb_right;
    }

    public void setMb_right(Object mb_right) {
        // Constant: this.mb_right = mb_right;
    }

    public Object getPi() {
        return new Object(); //  pi;
    }

    public void setPi(Object pi) {
        // Constant: this.pi = pi;
    }

    public Object getPr_linelist() {
        return new Object(); //  pr_linelist;
    }

    public void setPr_linelist(Object pr_linelist) {
        // Constant: this.pr_linelist = pr_linelist;
    }

    public Object getPr_linestrip() {
        return new Object(); //  pr_linestrip;
    }

    public void setPr_linestrip(Object pr_linestrip) {
        // Constant: this.pr_linestrip = pr_linestrip;
    }

    public Object getPr_pointlist() {
        return new Object(); //  pr_pointlist;
    }

    public void setPr_pointlist(Object pr_pointlist) {
        // Constant: this.pr_pointlist = pr_pointlist;
    }

    public Object getPr_trianglefan() {
        return new Object(); //  pr_trianglefan;
    }

    public void setPr_trianglefan(Object pr_trianglefan) {
        // Constant: this.pr_trianglefan = pr_trianglefan;
    }

    public Object getPr_trianglelist() {
        return new Object(); //  pr_trianglelist;
    }

    public void setPr_trianglelist(Object pr_trianglelist) {
        // Constant: this.pr_trianglelist = pr_trianglelist;
    }

    public Object getPr_trianglestrip() {
        return new Object(); //  pr_trianglestrip;
    }

    public void setPr_trianglestrip(Object pr_trianglestrip) {
        // Constant: this.pr_trianglestrip = pr_trianglestrip;
    }

    public Object getPs_change_all() {
        return new Object(); //  ps_change_all;
    }

    public void setPs_change_all(Object ps_change_all) {
        // Constant: this.ps_change_all = ps_change_all;
    }

    public Object getPs_change_motion() {
        return new Object(); //  ps_change_motion;
    }

    public void setPs_change_motion(Object ps_change_motion) {
        // Constant: this.ps_change_motion = ps_change_motion;
    }

    public Object getPs_change_shape() {
        return new Object(); //  ps_change_shape;
    }

    public void setPs_change_shape(Object ps_change_shape) {
        // Constant: this.ps_change_shape = ps_change_shape;
    }

    public Object getPs_deflect_horizontal() {
        return new Object(); //  ps_deflect_horizontal;
    }

    public void setPs_deflect_horizontal(Object ps_deflect_horizontal) {
        // Constant: this.ps_deflect_horizontal = ps_deflect_horizontal;
    }

    public Object getPs_deflect_vertical() {
        return new Object(); //  ps_deflect_vertical;
    }

    public void setPs_deflect_vertical(Object ps_deflect_vertical) {
        // Constant: this.ps_deflect_vertical = ps_deflect_vertical;
    }

    public Object getPs_distr_gaussian() {
        return new Object(); //  ps_distr_gaussian;
    }

    public void setPs_distr_gaussian(Object ps_distr_gaussian) {
        // Constant: this.ps_distr_gaussian = ps_distr_gaussian;
    }

    public Object getPs_distr_invgaussian() {
        return new Object(); //  ps_distr_invgaussian;
    }

    public void setPs_distr_invgaussian(Object ps_distr_invgaussian) {
        // Constant: this.ps_distr_invgaussian = ps_distr_invgaussian;
    }

    public Object getPs_distr_linear() {
        return new Object(); //  ps_distr_linear;
    }

    public void setPs_distr_linear(Object ps_distr_linear) {
        // Constant: this.ps_distr_linear = ps_distr_linear;
    }

    public Object getPs_force_constant() {
        return new Object(); //  ps_force_constant;
    }

    public void setPs_force_constant(Object ps_force_constant) {
        // Constant: this.ps_force_constant = ps_force_constant;
    }

    public Object getPs_force_linear() {
        return new Object(); //  ps_force_linear;
    }

    public void setPs_force_linear(Object ps_force_linear) {
        // Constant: this.ps_force_linear = ps_force_linear;
    }

    public Object getPs_force_quadratic() {
        return new Object(); //  ps_force_quadratic;
    }

    public void setPs_force_quadratic(Object ps_force_quadratic) {
        // Constant: this.ps_force_quadratic = ps_force_quadratic;
    }

    public Object getPs_shape_diamond() {
        return new Object(); //  ps_shape_diamond;
    }

    public void setPs_shape_diamond(Object ps_shape_diamond) {
        // Constant: this.ps_shape_diamond = ps_shape_diamond;
    }

    public Object getPs_shape_ellipse() {
        return new Object(); //  ps_shape_ellipse;
    }

    public void setPs_shape_ellipse(Object ps_shape_ellipse) {
        // Constant: this.ps_shape_ellipse = ps_shape_ellipse;
    }

    public Object getPs_shape_line() {
        return new Object(); //  ps_shape_line;
    }

    public void setPs_shape_line(Object ps_shape_line) {
        // Constant: this.ps_shape_line = ps_shape_line;
    }

    public Object getPs_shape_rectangle() {
        return new Object(); //  ps_shape_rectangle;
    }

    public void setPs_shape_rectangle(Object ps_shape_rectangle) {
        // Constant: this.ps_shape_rectangle = ps_shape_rectangle;
    }

    public Object getPt_shape_circle() {
        return new Object(); //  pt_shape_circle;
    }

    public void setPt_shape_circle(Object pt_shape_circle) {
        // Constant: this.pt_shape_circle = pt_shape_circle;
    }

    public Object getPt_shape_cloud() {
        return new Object(); //  pt_shape_cloud;
    }

    public void setPt_shape_cloud(Object pt_shape_cloud) {
        // Constant: this.pt_shape_cloud = pt_shape_cloud;
    }

    public Object getPt_shape_disk() {
        return new Object(); //  pt_shape_disk;
    }

    public void setPt_shape_disk(Object pt_shape_disk) {
        // Constant: this.pt_shape_disk = pt_shape_disk;
    }

    public Object getPt_shape_explosion() {
        return new Object(); //  pt_shape_explosion;
    }

    public void setPt_shape_explosion(Object pt_shape_explosion) {
        // Constant: this.pt_shape_explosion = pt_shape_explosion;
    }

    public Object getPt_shape_flare() {
        return new Object(); //  pt_shape_flare;
    }

    public void setPt_shape_flare(Object pt_shape_flare) {
        // Constant: this.pt_shape_flare = pt_shape_flare;
    }

    public Object getPt_shape_line() {
        return new Object(); //  pt_shape_line;
    }

    public void setPt_shape_line(Object pt_shape_line) {
        // Constant: this.pt_shape_line = pt_shape_line;
    }

    public Object getPt_shape_pixel() {
        return new Object(); //  pt_shape_pixel;
    }

    public void setPt_shape_pixel(Object pt_shape_pixel) {
        // Constant: this.pt_shape_pixel = pt_shape_pixel;
    }

    public Object getPt_shape_ring() {
        return new Object(); //  pt_shape_ring;
    }

    public void setPt_shape_ring(Object pt_shape_ring) {
        // Constant: this.pt_shape_ring = pt_shape_ring;
    }

    public Object getPt_shape_smoke() {
        return new Object(); //  pt_shape_smoke;
    }

    public void setPt_shape_smoke(Object pt_shape_smoke) {
        // Constant: this.pt_shape_smoke = pt_shape_smoke;
    }

    public Object getPt_shape_snow() {
        return new Object(); //  pt_shape_snow;
    }

    public void setPt_shape_snow(Object pt_shape_snow) {
        // Constant: this.pt_shape_snow = pt_shape_snow;
    }

    public Object getPt_shape_spark() {
        return new Object(); //  pt_shape_spark;
    }

    public void setPt_shape_spark(Object pt_shape_spark) {
        // Constant: this.pt_shape_spark = pt_shape_spark;
    }

    public Object getPt_shape_sphere() {
        return new Object(); //  pt_shape_sphere;
    }

    public void setPt_shape_sphere(Object pt_shape_sphere) {
        // Constant: this.pt_shape_sphere = pt_shape_sphere;
    }

    public Object getPt_shape_square() {
        return new Object(); //  pt_shape_square;
    }

    public void setPt_shape_square(Object pt_shape_square) {
        // Constant: this.pt_shape_square = pt_shape_square;
    }

    public Object getPt_shape_star() {
        return new Object(); //  pt_shape_star;
    }

    public void setPt_shape_star(Object pt_shape_star) {
        // Constant: this.pt_shape_star = pt_shape_star;
    }

    public Object getSe_chorus() {
        return new Object(); //  se_chorus;
    }

    public void setSe_chorus(Object se_chorus) {
        // Constant: this.se_chorus = se_chorus;
    }

    public Object getSe_compressor() {
        return new Object(); //  se_compressor;
    }

    public void setSe_compressor(Object se_compressor) {
        // Constant: this.se_compressor = se_compressor;
    }

    public Object getSe_echo() {
        return new Object(); //  se_echo;
    }

    public void setSe_echo(Object se_echo) {
        // Constant: this.se_echo = se_echo;
    }

    public Object getSe_equalizer() {
        return new Object(); //  se_equalizer;
    }

    public void setSe_equalizer(Object se_equalizer) {
        // Constant: this.se_equalizer = se_equalizer;
    }

    public Object getSe_flanger() {
        return new Object(); //  se_flanger;
    }

    public void setSe_flanger(Object se_flanger) {
        // Constant: this.se_flanger = se_flanger;
    }

    public Object getSe_gargle() {
        return new Object(); //  se_gargle;
    }

    public void setSe_gargle(Object se_gargle) {
        // Constant: this.se_gargle = se_gargle;
    }

    public Object getSe_none() {
        return new Object(); //  se_none;
    }

    public void setSe_none(Object se_none) {
        // Constant: this.se_none = se_none;
    }

    public Object getSe_reverb() {
        return new Object(); //  se_reverb;
    }

    public void setSe_reverb(Object se_reverb) {
        // Constant: this.se_reverb = se_reverb;
    }

    public Object getSelf() {
        return new Object(); //  self;
    }

    public void setSelf(Object self) {
        
    }

    public Object getTy_real() {
        return new Object(); //  ty_real;
    }

    public void setTy_real(Object ty_real) {
        // Constant: this.ty_real = ty_real;
    }

    public Object getTy_string() {
        return new Object(); //  ty_string;
    }

    public void setTy_string(Object ty_string) {
        // Constant: this.ty_string = ty_string;
    }

    public Object getVk_add() {
        return 107d;//  vk_add;
    }

    public void setVk_add(Object vk_add) {
        // Constant: this.vk_add = vk_add;
    }

    public Object getVk_alt() {
        return 18d;
    }

    public void setVk_alt(Object vk_alt) {
        // Constant: this.vk_alt = vk_alt;
    }

    public Object getVk_anykey() {
        return 1d;
    }

    public void setVk_anykey(Object vk_anykey) {
        // Constant: this.vk_anykey = vk_anykey;
    }

    public Object getVk_backspace() {
        return 8d;
    }

    public void setVk_backspace(Object vk_backspace) {
        // Constant: this.vk_backspace = vk_backspace;
    }

    public Object getVk_control() {
        return 17d;
    }

    public void setVk_control(Object vk_control) {
        // Constant: this.vk_control = vk_control;
    }

    public Object getVk_decimal() {
        return 110d; //  vk_decimal;
    }

    public void setVk_decimal(Object vk_decimal) {
        // Constant: this.vk_decimal = vk_decimal;
    }

    public Object getVk_delete() {
        return 46d;
    }

    public void setVk_delete(Object vk_delete) {
        // Constant: this.vk_delete = vk_delete;
    }

    public Object getVk_divide() {
        return 111d; //  vk_divide;
    }

    public void setVk_divide(Object vk_divide) {
        // Constant: this.vk_divide = vk_divide;
    }

    public Object getVk_down() {
        return 40d;
    }

    public void setVk_down(Object vk_down) {
        // Constant: this.vk_down = vk_down;
    }

    public Object getVk_end() {
        return 35d;
    }

    public void setVk_end(Object vk_end) {
        // Constant: this.vk_end = vk_end;
    }

    public Object getVk_enter() {
        return 13d;
    }

    public void setVk_enter(Object vk_enter) {
        // Constant: this.vk_enter = vk_enter;
    }

    public Object getVk_escape() {
        return 27d;
    }

    public void setVk_escape(Object vk_escape) {
        // Constant: this.vk_escape = vk_escape;
    }

    public Object getVk_f1() {
        return 112d; //  vk_f1;
    }

    public void setVk_f1(Object vk_f1) {
        // Constant: this.vk_f1 = vk_f1;
    }

    public Object getVk_f10() {
        return 121d; //  vk_f10;
    }

    public void setVk_f10(Object vk_f10) {
        // Constant: this.vk_f10 = vk_f10;
    }

    public Object getVk_f11() {
        return 122d; //  vk_f11;
    }

    public void setVk_f11(Object vk_f11) {
        // Constant: this.vk_f11 = vk_f11;
    }

    public Object getVk_f12() {
        return 113d; //  vk_f12;
    }

    public void setVk_f12(Object vk_f12) {
        // Constant: this.vk_f12 = vk_f12;
    }

    public Object getVk_f2() {
        return 113d; //  vk_f2;
    }

    public void setVk_f2(Object vk_f2) {
        // Constant: this.vk_f2 = vk_f2;
    }

    public Object getVk_f3() {
        return 114d; //  vk_f3;
    }

    public void setVk_f3(Object vk_f3) {
        // Constant: this.vk_f3 = vk_f3;
    }

    public Object getVk_f4() {
        return 115d; //  vk_f4;
    }

    public void setVk_f4(Object vk_f4) {
        // Constant: this.vk_f4 = vk_f4;
    }

    public Object getVk_f5() {
       return 116d; //  vk_f5;
    }

    public void setVk_f5(Object vk_f5) {
        // Constant: this.vk_f5 = vk_f5;
    }

    public Object getVk_f6() {
        return 117d; //  vk_f6;
    }

    public void setVk_f6(Object vk_f6) {
        // Constant: this.vk_f6 = vk_f6;
    }

    public Object getVk_f7() {
        return 118d; //  vk_f7;
    }

    public void setVk_f7(Object vk_f7) {
        // Constant: this.vk_f7 = vk_f7;
    }

    public Object getVk_f8() {
        return 119d; //  vk_f8;
    }

    public void setVk_f8(Object vk_f8) {
        // Constant: this.vk_f8 = vk_f8;
    }

    public Object getVk_f9() {
        return 120d; //  vk_f9;
    }

    public void setVk_f9(Object vk_f9) {
        // Constant: this.vk_f9 = vk_f9;
    }

    public Object getVk_home() {
        return 36d;
    }

    public void setVk_home(Object vk_home) {
        // Constant: this.vk_home = vk_home;
    }

    public Object getVk_insert() {
        return 45d;
    }

    public void setVk_insert(Object vk_insert) {
        // Constant: this.vk_insert = vk_insert;
    }

    public Object getVk_lalt() {
        return 164d; //  vk_lalt;
    }

    public void setVk_lalt(Object vk_lalt) {
        // Constant: this.vk_lalt = vk_lalt;
    }

    public Object getVk_lcontrol() {
        return 162d; //  vk_lcontrol;
    }

    public void setVk_lcontrol(Object vk_lcontrol) {
        // Constant: this.vk_lcontrol = vk_lcontrol;
    }

    public Object getVk_left() {
        return 37d;
    }

    public void setVk_left(Object vk_left) {
        // Constant: this.vk_left = vk_left;
    }

    public Object getVk_lshift() {
        return 160d; //  vk_lshift;
    }

    public void setVk_lshift(Object vk_lshift) {
        // Constant: this.vk_lshift = vk_lshift;
    }

    public Object getVk_multiply() {
        return 106d; //  vk_multiply;
    }

    public void setVk_multiply(Object vk_multiply) {
        // Constant: this.vk_multiply = vk_multiply;
    }

    public Object getVk_nokey() {
        return 0d; //  vk_nokey;
    }

    public void setVk_nokey(Object vk_nokey) {
        //constant
    }

    public Object getVk_numpad0() {
        return 96d; //  vk_numpad0;
    }

    public void setVk_numpad0(Object vk_numpad0) {
        // Constant: // Constant: this.vk_numpad0 = vk_numpad0;
    }

    public Object getVk_numpad1() {
        return 97d; //  vk_numpad1;
    }

    public void setVk_numpad1(Object vk_numpad1) {
        // Constant: this.vk_numpad1 = vk_numpad1;
    }

    public Object getVk_numpad2() {
        return 98d; //  vk_numpad2;
    }

    public void setVk_numpad2(Object vk_numpad2) {
        // Constant: this.vk_numpad2 = vk_numpad2;
    }

    public Object getVk_numpad3() {
        return 99d; //  vk_numpad3;
    }

    public void setVk_numpad3(Object vk_numpad3) {
        // Constant: this.vk_numpad3 = vk_numpad3;
    }

    public Object getVk_numpad4() {
        return 100d; //  vk_numpad4;
    }

    public void setVk_numpad4(Object vk_numpad4) {
        // Constant: this.vk_numpad4 = vk_numpad4;
    }

    public Object getVk_numpad5() {
        return 101d; //  vk_numpad5;
    }

    public void setVk_numpad5(Object vk_numpad5) {
        // Constant: this.vk_numpad5 = vk_numpad5;
    }

    public Object getVk_numpad6() {
        return 102d; //  vk_numpad6;
    }

    public void setVk_numpad6(Object vk_numpad6) {
        // Constant: this.vk_numpad6 = vk_numpad6;
    }

    public Object getVk_numpad7() {
        return 103d; //  vk_numpad7;
    }

    public void setVk_numpad7(Object vk_numpad7) {
        // Constant: this.vk_numpad7 = vk_numpad7;
    }

    public Object getVk_numpad8() {
        return 104d; //  vk_numpad8;
    }

    public void setVk_numpad8(Object vk_numpad8) {
        // Constant: this.vk_numpad8 = vk_numpad8;
    }

    public Object getVk_numpad9() {
        return 105d; //  vk_numpad9;
    }

    public void setVk_numpad9(Object vk_numpad9) {
        // Constant: this.vk_numpad9 = vk_numpad9;
    }

    public Object getVk_pagedown() {
        return 34d; //  vk_pagedown;
    }

    public void setVk_pagedown(Object vk_pagedown) {
        // Constant: this.vk_pagedown = vk_pagedown;
    }

    public Object getVk_pageup() {
        return 33d; //  vk_pageup;
    }

    public void setVk_pageup(Object vk_pageup) {
        // Constant: this.vk_pageup = vk_pageup;
    }

    public Object getVk_pause() {
        return 19d; //  vk_pause;
    }

    public void setVk_pause(Object vk_pause) {
        // Constant: this.vk_pause = vk_pause;
    }

    public Object getVk_printscreen() {
        return 44d; //  vk_printscreen;
    }

    public void setVk_printscreen(Object vk_printscreen) {
        // Constant: this.vk_printscreen = vk_printscreen;
    }

    public Object getVk_ralt() {
        return 165d; //  vk_ralt;
    }

    public void setVk_ralt(Object vk_ralt) {
        // Constant: this.vk_ralt = vk_ralt;
    }

    public Object getVk_rcontrol() {
        return 163d; //  vk_rcontrol;
    }

    public void setVk_rcontrol(Object vk_rcontrol) {
        // Constant: this.vk_rcontrol = vk_rcontrol;
    }

    public Object getVk_return() {
        return new Object(); //  vk_return new Object(); // ;
    }

    public void setVk_return (Object vk_return ) {
        // Constant: this.vk_return new Object(); //  = vk_return new Object(); // ;
    }

    public Object getVk_right() {
        return 39d;
    }

    public void setVk_right(Object vk_right) {
        // Constant: this.vk_right = vk_right;
    }

    public Object getVk_rshift() {
        return 161d; //  vk_rshift;
    }

    public void setVk_rshift(Object vk_rshift) {
        // Constant: this.vk_rshift = vk_rshift;
    }

    public Object getVk_shift() {
        return 16d;
    }

    public void setVk_shift(Object vk_shift) {
        // Constant: this.vk_shift = vk_shift;
    }

    public Object getVk_space() {
       return 32d;
    }

    public void setVk_space(Object vk_space) {
        // Constant: this.vk_space = vk_space;
    }

    public Object getVk_subtract() {
        return 109d; //  vk_subtract;
    }

    public void setVk_subtract(Object vk_subtract) {
        // Constant: this.vk_subtract = vk_subtract;
    }

    public Object getVk_tab() {
        return 9d;
    }

    public void setVk_tab(Object vk_tab) {
        // Constant: this.vk_tab = vk_tab;
    }

    public Object getVk_up() {
        return 38d;
    }

    public void setVk_up(Object vk_up) {
        // Constant: this.vk_up = vk_up;
    }
    
}
