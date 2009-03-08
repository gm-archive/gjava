
package org.dolphin.game.api;

import java.util.LinkedList;

import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.Cursor;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.Variable;

/**
 *
 * @author TGMG
 */
public class Constants extends Variable {
protected Actor self;
public static Actor noone=new Actor(),other=noone,all=new Actor();
public LinkedList<Actor> selfs = new LinkedList();

    public Variable getBm_add() {
        return new Variable(); //  new Variable(); //  bm_add;
    }

    public void setBm_add(Variable bm_add) {
       // Constants.bm_add = bm_add;
    }

    public Variable getBm_dest_alpha() {
        return new Variable(); //  new Variable(); //  bm_dest_alpha;
    }

    public void setBm_dest_alpha(Variable bm_dest_alpha) {
        // Constant: this.bm_dest_alpha = bm_dest_alpha;
    }

    public Variable getBm_dest_color() {
        return new Variable(); //  new Variable(); //  bm_dest_color;
    }

    public void setBm_dest_color(Variable bm_dest_color) {
        // Constant: this.bm_dest_color = bm_dest_color;
    }

    public Variable getBm_inv_dest_alpha() {
        return new Variable(); //  new Variable(); //  bm_inv_dest_alpha;
    }

    public void setBm_inv_dest_alpha(Variable bm_inv_dest_alpha) {
        // Constant: this.bm_inv_dest_alpha = bm_inv_dest_alpha;
    }

    public Variable getBm_inv_dest_color() {
        return new Variable(); //  new Variable(); //  bm_inv_dest_color;
    }

    public void setBm_inv_dest_color(Variable bm_inv_dest_color) {
        // Constant: this.bm_inv_dest_color = bm_inv_dest_color;
    }

    public Variable getBm_inv_src_alpha() {
        return new Variable(); //  new Variable(); //  bm_inv_src_alpha;
    }

    public void setBm_inv_src_alpha(Variable bm_inv_src_alpha) {
        // Constant: this.bm_inv_src_alpha = bm_inv_src_alpha;
    }

    public Variable getBm_inv_src_color() {
        return new Variable(); //  new Variable(); //  bm_inv_src_color;
    }

    public void setBm_inv_src_color(Variable bm_inv_src_color) {
        // Constant: this.bm_inv_src_color = bm_inv_src_color;
    }

    public Variable getBm_max() {
        return new Variable(); //  new Variable(); //  bm_max;
    }

    public void setBm_max(Variable bm_max) {
        // Constant: this.bm_max = bm_max;
    }

    public Variable getBm_normal() {
        return new Variable(); //  new Variable(); //  bm_normal;
    }

    public void setBm_normal(Variable bm_normal) {
        // Constant: this.bm_normal = bm_normal;
    }

    public Variable getBm_one() {
        return new Variable(); //  bm_one;
    }

    public void setBm_one(Variable bm_one) {
        // Constant: this.bm_one = bm_one;
    }

    public Variable getBm_src_alpha() {
        return new Variable(); //  bm_src_alpha;
    }

    public void setBm_src_alpha(Variable bm_src_alpha) {
        // Constant: this.bm_src_alpha = bm_src_alpha;
    }

    public Variable getBm_src_alpha_sat() {
        return new Variable(); //  bm_src_alpha_sat;
    }

    public void setBm_src_alpha_sat(Variable bm_src_alpha_sat) {
        // Constant: this.bm_src_alpha_sat = bm_src_alpha_sat;
    }

    public Variable getBm_src_color() {
        return new Variable(); //  bm_src_color;
    }

    public void setBm_src_color(Variable bm_src_color) {
        // Constant: this.bm_src_color = bm_src_color;
    }

    public Variable getBm_subtract() {
        return new Variable(); //  bm_subtract;
    }

    public void setBm_subtract(Variable bm_subtract) {
        // Constant: this.bm_subtract = bm_subtract;
    }

    public Variable getBm_zero() {
        return new Variable(); //  bm_zero;
    }

    public void setBm_zero(Variable bm_zero) {
        // Constant: this.bm_zero = bm_zero;
    }
Color c_aqua = new Color(new java.awt.Color(0,255,255));
    public Variable getC_aqua() {
        return c_aqua; //  c_aqua;
    }

    public void setC_aqua(Variable c_aqua) {
        // Constant: this.c_aqua = c_aqua;
    }

    public Variable getC_black() {
        return  new Color(java.awt.Color.black); //  c_black;
    }

    public void setC_black(Variable c_black) {
        // Constant: this.c_black = c_black;
    }

    public Variable getC_blue() {
        return  new Color(java.awt.Color.blue); //  c_blue;
    }

    public void setC_blue(Variable c_blue) {
        // Constant: this.c_blue = c_blue;
    }

    public Variable getC_dkgray() {
        return  new Color(java.awt.Color.DARK_GRAY); //  c_dkgray;
    }

    public void setC_dkgray(Variable c_dkgray) {
        // Constant: this.c_dkgray = c_dkgray;
    }

    public Variable getC_fuchsia() {
        return new Color(new java.awt.Color(255,0,255)); //  c_fuchsia;
    }

    public void setC_fuchsia(Variable c_fuchsia) {
        // Constant: this.c_fuchsia = c_fuchsia;
    }

    public Variable getC_gray() {
        return  new Color(java.awt.Color.GRAY); //  c_gray;
    }

    public void setC_gray(Variable c_gray) {
        // Constant: this.c_gray = c_gray;
    }
Color c_green = new Color(java.awt.Color.GREEN);
    public Variable getC_green() {
        return  c_green; //  c_green;
    }

    public void setC_green(Variable c_green) {
        // Constant: this.c_green = c_green;
    }

    public Variable getC_lime() {
        return  new Color(new java.awt.Color(0,255,0)); //  c_lime;
    }

    public void setC_lime(Variable c_lime) {
        // Constant: this.c_lime = c_lime;
    }

    public Variable getC_ltgray() {
        return  new Color(java.awt.Color.LIGHT_GRAY); //  c_ltgray;
    }

    public void setC_ltgray(Variable c_ltgray) {
        // Constant: this.c_ltgray = c_ltgray;
    }

    public Variable getC_maroon() {
        return  new Color(new java.awt.Color(128,0,0)); //  c_maroon;
    }

    public void setC_maroon(Variable c_maroon) {
        // Constant: this.c_maroon = c_maroon;
    }

    public Variable getC_navy() {
        return  new Color(new java.awt.Color(0,0,128)); //  c_navy;
    }

    public void setC_navy(Variable c_navy) {
        // Constant: this.c_navy = c_navy;
    }

    public Variable getC_olive() {
        return  new Color(new java.awt.Color(128,128,0)); //  c_olive;
    }

    public void setC_olive(Variable c_olive) {
        // Constant: this.c_olive = c_olive;
    }

    public Variable getC_orange() {
        return  new Color(java.awt.Color.orange); //  c_orange;
    }

    public void setC_orange(Variable c_orange) {
        // Constant: this.c_orange = c_orange;
    }

    public Variable getC_purple() {
        return  new Color(new java.awt.Color(128,0,128)); //  c_purple;
    }

    public void setC_purple(Variable c_purple) {
        // Constant: this.c_purple = c_purple;
    }

    public Variable getC_red() {
        return  new Color(java.awt.Color.red); //  c_red;
    }

    public void setC_red(Variable c_red) {
        // Constant: this.c_red = c_red;
    }

    public Variable getC_silver() {
        return  new Color(new java.awt.Color(192,192,192)); //  c_silver;
    }

    public void setC_silver(Variable c_silver) {
        // Constant: this.c_silver = c_silver;
    }

    public Variable getC_teal() {
        return  new Color(new java.awt.Color(0,128,128)); //  c_teal;
    }

    public void setC_teal(Variable c_teal) {
        // Constant: this.c_teal = c_teal;
    }

    public Variable getC_white() {
        return  new Color(java.awt.Color.WHITE); //  c_white;
    }

    public void setC_white(Variable c_white) {
        // Constant: this.c_white = c_white;
    }

    public Variable getC_yellow() {
        return  new Color(java.awt.Color.yellow); //  c_yellow;
    }

    public void setC_yellow(Variable c_yellow) {
        // Constant: this.c_yellow = c_yellow;
    }

    public Variable getCr_appstart() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_appstart;
    }

    public void setCr_appstart(Variable cr_appstart) {
        // Constant: this.cr_appstart = cr_appstart;
    }

    public Variable getCr_arrow() {
            return new Cursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); //  cr_arrow;
   }

    public void setCr_arrow(Variable cr_arrow) {
        // Constant: this.cr_arrow = cr_arrow;
    }

    public Variable getCr_arrrow() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_arrrow;
    }

    public void setCr_arrrow(Variable cr_arrrow) {
        // Constant: this.cr_arrrow = cr_arrrow;
    }

    public Variable getCr_beam() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_beam;
    }

    public void setCr_beam(Variable cr_beam) {
        // Constant: this.cr_beam = cr_beam;
    }

    public Variable getCr_cross() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    }

    public void setCr_cross(Variable cr_cross) {
        // Constant: this.cr_cross = cr_cross;
    }

    public Variable getCr_default() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_default;
    }

    public void setCr_default(Variable cr_default) {
        // Constant: this.cr_default = cr_default;
    }

    public Variable getCr_drag() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_drag;
    }

    public void setCr_drag(Variable cr_drag) {
        // Constant: this.cr_drag = cr_drag;
    }

    public Variable getCr_handpoint() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); //  cr_handpoint;
    }

    public void setCr_handpoint(Variable cr_handpoint) {
        // Constant: this.cr_handpoint = cr_handpoint;
    }

    public Variable getCr_help() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_help;
    }

    public void setCr_help(Variable cr_help) {
        // Constant: this.cr_help = cr_help;
    }

    public Variable getCr_hourglass() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR)); //  cr_hourglass;
    }

    public void setCr_hourglass(Variable cr_hourglass) {
        // Constant: this.cr_hourglass = cr_hourglass;
    }

    public Variable getCr_hsplit() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_hsplit;
    }

    public void setCr_hsplit(Variable cr_hsplit) {
        // Constant: this.cr_hsplit = cr_hsplit;
    }

    public Variable getCr_multidrag() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_multidrag;
    }

    public void setCr_multidrag(Variable cr_multidrag) {
        // Constant: this.cr_multidrag = cr_multidrag;
    }

    public Variable getCr_no() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_no;
    }

    public void setCr_no(Variable cr_no) {
        // Constant: this.cr_no = cr_no;
    }

    public Variable getCr_nodrop() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_nodrop;
    }

    public void setCr_nodrop(Variable cr_nodrop) {
        // Constant: this.cr_nodrop = cr_nodrop;
    }

    public Variable getCr_none() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_none;
    }

    public void setCr_none(Variable cr_none) {
        // Constant: this.cr_none = cr_none;
    }

    public Variable getCr_size_all() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_all;
    }

    public void setCr_size_all(Variable cr_size_all) {
        // Constant: this.cr_size_all = cr_size_all;
    }

    public Variable getCr_size_nesw() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR)); //  cr_size_nesw;
    }

    public void setCr_size_nesw(Variable cr_size_nesw) {
        // Constant: this.cr_size_nesw = cr_size_nesw;
    }

    public Variable getCr_size_ns() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_ns;
    }

    public void setCr_size_ns(Variable cr_size_ns) {
        // Constant: this.cr_size_ns = cr_size_ns;
    }

    public Variable getCr_size_nwse() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR)); //  cr_size_nwse;
    }

    public void setCr_size_nwse(Variable cr_size_nwse) {
        // Constant: this.cr_size_nwse = cr_size_nwse;
    }

    public Variable getCr_size_we() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_size_we;
    }

    public void setCr_size_we(Variable cr_size_we) {
        // Constant: this.cr_size_we = cr_size_we;
    }

    public Variable getCr_sqlwait() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_sqlwait;
    }

    public void setCr_sqlwait(Variable cr_sqlwait) {
        // Constant: this.cr_sqlwait = cr_sqlwait;
    }

    public Variable getCr_uparrow() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_uparrow;
    }

    public void setCr_uparrow(Variable cr_uparrow) {
        // Constant: this.cr_uparrow = cr_uparrow;
    }

    public Variable getCr_vsplit() {
        return new Cursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //  cr_vsplit;
    }

    public void setCr_vsplit(Variable cr_vsplit) {
        // Constant: this.cr_vsplit = cr_vsplit;
    }

    public Variable getDll_cdecl() {
        return new Variable(); //  dll_cdecl;
    }

    public void setDll_cdecl(Variable dll_cdecl) {
        // Constant: this.dll_cdecl = dll_cdecl;
    }

    public Variable getDll_stdcall() {
        return new Variable(); //  dll_stdcall;
    }

    public void setDll_stdcall(Variable dll_stdcall) {
        // Constant: this.dll_stdcall = dll_stdcall;
    }

    public Variable getEf_cloud() {
        return new Variable(); //  ef_cloud;
    }

    public void setEf_cloud(Variable ef_cloud) {
        // Constant: this.ef_cloud = ef_cloud;
    }

    public Variable getEf_ellipse() {
        return new Variable(); //  ef_ellipse;
    }

    public void setEf_ellipse(Variable ef_ellipse) {
        // Constant: this.ef_ellipse = ef_ellipse;
    }

    public Variable getEf_explosion() {
        return new Variable(); //  ef_explosion;
    }

    public void setEf_explosion(Variable ef_explosion) {
        // Constant: this.ef_explosion = ef_explosion;
    }

    public Variable getEf_firework() {
        return new Variable(); //  ef_firework;
    }

    public void setEf_firework(Variable ef_firework) {
        // Constant: this.ef_firework = ef_firework;
    }

    public Variable getEf_flare() {
        return new Variable(); //  ef_flare;
    }

    public void setEf_flare(Variable ef_flare) {
        // Constant: this.ef_flare = ef_flare;
    }

    public Variable getEf_rain() {
        return new Variable(); //  ef_rain;
    }

    public void setEf_rain(Variable ef_rain) {
        // Constant: this.ef_rain = ef_rain;
    }

    public Variable getEf_ring() {
        return new Variable(); //  ef_ring;
    }

    public void setEf_ring(Variable ef_ring) {
        // Constant: this.ef_ring = ef_ring;
    }

    public Variable getEf_smoke() {
        return new Variable(); //  ef_smoke;
    }

    public void setEf_smoke(Variable ef_smoke) {
        // Constant: this.ef_smoke = ef_smoke;
    }

    public Variable getEf_smokeup() {
        return new Variable(); //  ef_smokeup;
    }

    public void setEf_smokeup(Variable ef_smokeup) {
        // Constant: this.ef_smokeup = ef_smokeup;
    }

    public Variable getEf_snow() {
        return new Variable(); //  ef_snow;
    }

    public void setEf_snow(Variable ef_snow) {
        // Constant: this.ef_snow = ef_snow;
    }

    public Variable getEf_spark() {
        return new Variable(); //  ef_spark;
    }

    public void setEf_spark(Variable ef_spark) {
        // Constant: this.ef_spark = ef_spark;
    }

    public Variable getEf_star() {
        return new Variable(); //  ef_star;
    }

    public void setEf_star(Variable ef_star) {
        // Constant: this.ef_star = ef_star;
    }

    public Variable getEv_alarm() {
        return new Variable(); //  ev_alarm;
    }

    public void setEv_alarm(Variable ev_alarm) {
        // Constant: this.ev_alarm = ev_alarm;
    }

    public Variable getEv_animation_end() {
        return new Variable(); //  ev_animation_end;
    }

    public void setEv_animation_end(Variable ev_animation_end) {
        // Constant: this.ev_animation_end = ev_animation_end;
    }

    public Variable getEv_boundary() {
        return new Variable(); //  ev_boundary;
    }

    public void setEv_boundary(Variable ev_boundary) {
        // Constant: this.ev_boundary = ev_boundary;
    }

    public Variable getEv_close_button() {
        return new Variable(); //  ev_close_button;
    }

    public void setEv_close_button(Variable ev_close_button) {
        // Constant: this.ev_close_button = ev_close_button;
    }

    public Variable getEv_collision() {
        return new Variable(); //  ev_collision;
    }

    public void setEv_collision(Variable ev_collision) {
        // Constant: this.ev_collision = ev_collision;
    }

    public Variable getEv_create() {
        return new Variable(); //  ev_create;
    }

    public void setEv_create(Variable ev_create) {
        // Constant: this.ev_create = ev_create;
    }

    public Variable getEv_destroy() {
        return new Variable(); //  ev_destroy;
    }

    public void setEv_destroy(Variable ev_destroy) {
        // Constant: this.ev_destroy = ev_destroy;
    }

    public Variable getEv_draw() {
        return new Variable(); //  ev_draw;
    }

    public void setEv_draw(Variable ev_draw) {
        // Constant: this.ev_draw = ev_draw;
    }

    public Variable getEv_end_of_path() {
        return new Variable(); //  ev_end_of_path;
    }

    public void setEv_end_of_path(Variable ev_end_of_path) {
        // Constant: this.ev_end_of_path = ev_end_of_path;
    }

    public Variable getEv_game_end() {
        return new Variable(); //  ev_game_end;
    }

    public void setEv_game_end(Variable ev_game_end) {
        // Constant: this.ev_game_end = ev_game_end;
    }

    public Variable getEv_game_start() {
        return new Variable(); //  ev_game_start;
    }

    public void setEv_game_start(Variable ev_game_start) {
        // Constant: this.ev_game_start = ev_game_start;
    }

    public Variable getEv_global_left_button() {
        return new Variable(); //  ev_global_left_button;
    }

    public void setEv_global_left_button(Variable ev_global_left_button) {
        // Constant: this.ev_global_left_button = ev_global_left_button;
    }

    public Variable getEv_global_left_press() {
        return new Variable(); //  ev_global_left_press;
    }

    public void setEv_global_left_press(Variable ev_global_left_press) {
        // Constant: this.ev_global_left_press = ev_global_left_press;
    }

    public Variable getEv_global_left_release() {
        return new Variable(); //  ev_global_left_release;
    }

    public void setEv_global_left_release(Variable ev_global_left_release) {
        // Constant: this.ev_global_left_release = ev_global_left_release;
    }

    public Variable getEv_global_middle_button() {
        return new Variable(); //  ev_global_middle_button;
    }

    public void setEv_global_middle_button(Variable ev_global_middle_button) {
        // Constant: this.ev_global_middle_button = ev_global_middle_button;
    }

    public Variable getEv_global_middle_press() {
        return new Variable(); //  ev_global_middle_press;
    }

    public void setEv_global_middle_press(Variable ev_global_middle_press) {
        // Constant: this.ev_global_middle_press = ev_global_middle_press;
    }

    public Variable getEv_global_middle_release() {
        return new Variable(); //  ev_global_middle_release;
    }

    public void setEv_global_middle_release(Variable ev_global_middle_release) {
        // Constant: this.ev_global_middle_release = ev_global_middle_release;
    }

    public Variable getEv_global_press() {
        return new Variable(); //  ev_global_press;
    }

    public void setEv_global_press(Variable ev_global_press) {
        // Constant: this.ev_global_press = ev_global_press;
    }

    public Variable getEv_global_release() {
        return new Variable(); //  ev_global_release;
    }

    public void setEv_global_release(Variable ev_global_release) {
        // Constant: this.ev_global_release = ev_global_release;
    }

    public Variable getEv_global_right_button() {
        return new Variable(); //  ev_global_right_button;
    }

    public void setEv_global_right_button(Variable ev_global_right_button) {
        // Constant: this.ev_global_right_button = ev_global_right_button;
    }

    public Variable getEv_global_right_press() {
        return new Variable(); //  ev_global_right_press;
    }

    public void setEv_global_right_press(Variable ev_global_right_press) {
        // Constant: this.ev_global_right_press = ev_global_right_press;
    }

    public Variable getEv_global_right_release() {
        return new Variable(); //  ev_global_right_release;
    }

    public void setEv_global_right_release(Variable ev_global_right_release) {
        // Constant: this.ev_global_right_release = ev_global_right_release;
    }

    public Variable getEv_joystick1_button1() {
        return new Variable(); //  ev_joystick1_button1;
    }

    public void setEv_joystick1_button1(Variable ev_joystick1_button1) {
        // Constant: this.ev_joystick1_button1 = ev_joystick1_button1;
    }

    public Variable getEv_joystick1_button2() {
        return new Variable(); //  ev_joystick1_button2;
    }

    public void setEv_joystick1_button2(Variable ev_joystick1_button2) {
        // Constant: this.ev_joystick1_button2 = ev_joystick1_button2;
    }

    public Variable getEv_joystick1_button3() {
        return new Variable(); //  ev_joystick1_button3;
    }

    public void setEv_joystick1_button3(Variable ev_joystick1_button3) {
        // Constant: this.ev_joystick1_button3 = ev_joystick1_button3;
    }

    public Variable getEv_joystick1_button4() {
        return new Variable(); //  ev_joystick1_button4;
    }

    public void setEv_joystick1_button4(Variable ev_joystick1_button4) {
        // Constant: this.ev_joystick1_button4 = ev_joystick1_button4;
    }

    public Variable getEv_joystick1_button5() {
        return new Variable(); //  ev_joystick1_button5;
    }

    public void setEv_joystick1_button5(Variable ev_joystick1_button5) {
        // Constant: this.ev_joystick1_button5 = ev_joystick1_button5;
    }

    public Variable getEv_joystick1_button6() {
        return new Variable(); //  ev_joystick1_button6;
    }

    public void setEv_joystick1_button6(Variable ev_joystick1_button6) {
        // Constant: this.ev_joystick1_button6 = ev_joystick1_button6;
    }

    public Variable getEv_joystick1_button7() {
        return new Variable(); //  ev_joystick1_button7;
    }

    public void setEv_joystick1_button7(Variable ev_joystick1_button7) {
        // Constant: this.ev_joystick1_button7 = ev_joystick1_button7;
    }

    public Variable getEv_joystick1_button8() {
        return new Variable(); //  ev_joystick1_button8;
    }

    public void setEv_joystick1_button8(Variable ev_joystick1_button8) {
        // Constant: this.ev_joystick1_button8 = ev_joystick1_button8;
    }

    public Variable getEv_joystick1_down() {
        return new Variable(); //  ev_joystick1_down;
    }

    public void setEv_joystick1_down(Variable ev_joystick1_down) {
        // Constant: this.ev_joystick1_down = ev_joystick1_down;
    }

    public Variable getEv_joystick1_left() {
        return new Variable(); //  ev_joystick1_left;
    }

    public void setEv_joystick1_left(Variable ev_joystick1_left) {
        // Constant: this.ev_joystick1_left = ev_joystick1_left;
    }

    public Variable getEv_joystick1_right() {
        return new Variable(); //  ev_joystick1_right;
    }

    public void setEv_joystick1_right(Variable ev_joystick1_right) {
        // Constant: this.ev_joystick1_right = ev_joystick1_right;
    }

    public Variable getEv_joystick1_up() {
        return new Variable(); //  ev_joystick1_up;
    }

    public void setEv_joystick1_up(Variable ev_joystick1_up) {
        // Constant: this.ev_joystick1_up = ev_joystick1_up;
    }

    public Variable getEv_joystick2_button1() {
        return new Variable(); //  ev_joystick2_button1;
    }

    public void setEv_joystick2_button1(Variable ev_joystick2_button1) {
        // Constant: this.ev_joystick2_button1 = ev_joystick2_button1;
    }

    public Variable getEv_joystick2_button2() {
        return new Variable(); //  ev_joystick2_button2;
    }

    public void setEv_joystick2_button2(Variable ev_joystick2_button2) {
        // Constant: this.ev_joystick2_button2 = ev_joystick2_button2;
    }

    public Variable getEv_joystick2_button3() {
        return new Variable(); //  ev_joystick2_button3;
    }

    public void setEv_joystick2_button3(Variable ev_joystick2_button3) {
        // Constant: this.ev_joystick2_button3 = ev_joystick2_button3;
    }

    public Variable getEv_joystick2_button4() {
        return new Variable(); //  ev_joystick2_button4;
    }

    public void setEv_joystick2_button4(Variable ev_joystick2_button4) {
        // Constant: this.ev_joystick2_button4 = ev_joystick2_button4;
    }

    public Variable getEv_joystick2_button5() {
        return new Variable(); //  ev_joystick2_button5;
    }

    public void setEv_joystick2_button5(Variable ev_joystick2_button5) {
        // Constant: this.ev_joystick2_button5 = ev_joystick2_button5;
    }

    public Variable getEv_joystick2_button6() {
        return new Variable(); //  ev_joystick2_button6;
    }

    public void setEv_joystick2_button6(Variable ev_joystick2_button6) {
        // Constant: this.ev_joystick2_button6 = ev_joystick2_button6;
    }

    public Variable getEv_joystick2_button7() {
        return new Variable(); //  ev_joystick2_button7;
    }

    public void setEv_joystick2_button7(Variable ev_joystick2_button7) {
        // Constant: this.ev_joystick2_button7 = ev_joystick2_button7;
    }

    public Variable getEv_joystick2_button8() {
        return new Variable(); //  ev_joystick2_button8;
    }

    public void setEv_joystick2_button8(Variable ev_joystick2_button8) {
        // Constant: this.ev_joystick2_button8 = ev_joystick2_button8;
    }

    public Variable getEv_joystick2_down() {
        return new Variable(); //  ev_joystick2_down;
    }

    public void setEv_joystick2_down(Variable ev_joystick2_down) {
        // Constant: this.ev_joystick2_down = ev_joystick2_down;
    }

    public Variable getEv_joystick2_left() {
        return new Variable(); //  ev_joystick2_left;
    }

    public void setEv_joystick2_left(Variable ev_joystick2_left) {
        // Constant: this.ev_joystick2_left = ev_joystick2_left;
    }

    public Variable getEv_joystick2_right() {
        return new Variable(); //  ev_joystick2_right;
    }

    public void setEv_joystick2_right(Variable ev_joystick2_right) {
        // Constant: this.ev_joystick2_right = ev_joystick2_right;
    }

    public Variable getEv_joystick2_up() {
        return new Variable(); //  ev_joystick2_up;
    }

    public void setEv_joystick2_up(Variable ev_joystick2_up) {
        // Constant: this.ev_joystick2_up = ev_joystick2_up;
    }

    public Variable getEv_keyboard() {
        return new Variable(); //  ev_keyboard;
    }

    public void setEv_keyboard(Variable ev_keyboard) {
        // Constant: this.ev_keyboard = ev_keyboard;
    }

    public Variable getEv_keypress() {
        return new Variable(); //  ev_keypress;
    }

    public void setEv_keypress(Variable ev_keypress) {
        // Constant: this.ev_keypress = ev_keypress;
    }

    public Variable getEv_keyrelease() {
        return new Variable(); //  ev_keyrelease;
    }

    public void setEv_keyrelease(Variable ev_keyrelease) {
        // Constant: this.ev_keyrelease = ev_keyrelease;
    }

    public Variable getEv_left_button() {
        return new Variable(); //  ev_left_button;
    }

    public void setEv_left_button(Variable ev_left_button) {
        // Constant: this.ev_left_button = ev_left_button;
    }

    public Variable getEv_left_press() {
        return new Variable(); //  ev_left_press;
    }

    public void setEv_left_press(Variable ev_left_press) {
        // Constant: this.ev_left_press = ev_left_press;
    }

    public Variable getEv_left_release() {
        return new Variable(); //  ev_left_release;
    }

    public void setEv_left_release(Variable ev_left_release) {
        // Constant: this.ev_left_release = ev_left_release;
    }

    public Variable getEv_middle_button() {
        return new Variable(); //  ev_middle_button;
    }

    public void setEv_middle_button(Variable ev_middle_button) {
        // Constant: this.ev_middle_button = ev_middle_button;
    }

    public Variable getEv_middle_press() {
        return new Variable(); //  ev_middle_press;
    }

    public void setEv_middle_press(Variable ev_middle_press) {
        // Constant: this.ev_middle_press = ev_middle_press;
    }

    public Variable getEv_middle_release() {
        return new Variable(); //  ev_middle_release;
    }

    public void setEv_middle_release(Variable ev_middle_release) {
        // Constant: this.ev_middle_release = ev_middle_release;
    }

    public Variable getEv_mouse() {
        return new Variable(); //  ev_mouse;
    }

    public void setEv_mouse(Variable ev_mouse) {
        // Constant: this.ev_mouse = ev_mouse;
    }

    public Variable getEv_mouse_enter() {
        return new Variable(); //  ev_mouse_enter;
    }

    public void setEv_mouse_enter(Variable ev_mouse_enter) {
        // Constant: this.ev_mouse_enter = ev_mouse_enter;
    }

    public Variable getEv_mouse_leave() {
        return new Variable(); //  ev_mouse_leave;
    }

    public void setEv_mouse_leave(Variable ev_mouse_leave) {
        // Constant: this.ev_mouse_leave = ev_mouse_leave;
    }

    public Variable getEv_mouse_wheel_down() {
        return new Variable(); //  ev_mouse_wheel_down;
    }

    public void setEv_mouse_wheel_down(Variable ev_mouse_wheel_down) {
        // Constant: this.ev_mouse_wheel_down = ev_mouse_wheel_down;
    }

    public Variable getEv_mouse_wheel_up() {
        return new Variable(); //  ev_mouse_wheel_up;
    }

    public void setEv_mouse_wheel_up(Variable ev_mouse_wheel_up) {
        // Constant: this.ev_mouse_wheel_up = ev_mouse_wheel_up;
    }

    public Variable getEv_no_button() {
        return new Variable(); //  ev_no_button;
    }

    public void setEv_no_button(Variable ev_no_button) {
        // Constant: this.ev_no_button = ev_no_button;
    }

    public Variable getEv_no_more_health() {
        return new Variable(); //  ev_no_more_health;
    }

    public void setEv_no_more_health(Variable ev_no_more_health) {
        // Constant: this.ev_no_more_health = ev_no_more_health;
    }

    public Variable getEv_no_more_lives() {
        return new Variable(); //  ev_no_more_lives;
    }

    public void setEv_no_more_lives(Variable ev_no_more_lives) {
        // Constant: this.ev_no_more_lives = ev_no_more_lives;
    }

    public Variable getEv_other() {
        return new Variable(); //  ev_other;
    }

    public void setEv_other(Variable ev_other) {
        // Constant: this.ev_other = ev_other;
    }

    public Variable getEv_outside() {
        return new Variable(); //  ev_outside;
    }

    public void setEv_outside(Variable ev_outside) {
        // Constant: this.ev_outside = ev_outside;
    }

    public Variable getEv_right_button() {
        return new Variable(); //  ev_right_button;
    }

    public void setEv_right_button(Variable ev_right_button) {
        // Constant: this.ev_right_button = ev_right_button;
    }

    public Variable getEv_right_press() {
        return new Variable(); //  ev_right_press;
    }

    public void setEv_right_press(Variable ev_right_press) {
        // Constant: this.ev_right_press = ev_right_press;
    }

    public Variable getEv_right_release() {
        return new Variable(); //  ev_right_release;
    }

    public void setEv_right_release(Variable ev_right_release) {
        // Constant: this.ev_right_release = ev_right_release;
    }

    public Variable getEv_room_end() {
        return new Variable(); //  ev_room_end;
    }

    public void setEv_room_end(Variable ev_room_end) {
        // Constant: this.ev_room_end = ev_room_end;
    }

    public Variable getEv_room_start() {
        return new Variable(); //  ev_room_start;
    }

    public void setEv_room_start(Variable ev_room_start) {
        // Constant: this.ev_room_start = ev_room_start;
    }

    public Variable getEv_step() {
        return new Variable(); //  ev_step;
    }

    public void setEv_step(Variable ev_step) {
        // Constant: this.ev_step = ev_step;
    }

    public Variable getEv_step_begin() {
        return new Variable(); //  ev_step_begin;
    }

    public void setEv_step_begin(Variable ev_step_begin) {
        // Constant: this.ev_step_begin = ev_step_begin;
    }

    public Variable getEv_step_end() {
        return new Variable(); //  ev_step_end;
    }

    public void setEv_step_end(Variable ev_step_end) {
        // Constant: this.ev_step_end = ev_step_end;
    }

    public Variable getEv_step_normal() {
        return new Variable(); //  ev_step_normal;
    }

    public void setEv_step_normal(Variable ev_step_normal) {
        // Constant: this.ev_step_normal = ev_step_normal;
    }

    public Variable getEv_user0() {
        return new Variable(); //  ev_user0;
    }

    public void setEv_user0(Variable ev_user0) {
        // Constant: this.ev_user0 = ev_user0;
    }

    public Variable getEv_user1() {
        return new Variable(); //  ev_user1;
    }

    public void setEv_user1(Variable ev_user1) {
        // Constant: this.ev_user1 = ev_user1;
    }

    public Variable getEv_user10() {
        return new Variable(); //  ev_user10;
    }

    public void setEv_user10(Variable ev_user10) {
        // Constant: this.ev_user10 = ev_user10;
    }

    public Variable getEv_user11() {
        return new Variable(); //  ev_user11;
    }

    public void setEv_user11(Variable ev_user11) {
        // Constant: this.ev_user11 = ev_user11;
    }

    public Variable getEv_user12() {
        return new Variable(); //  ev_user12;
    }

    public void setEv_user12(Variable ev_user12) {
        // Constant: this.ev_user12 = ev_user12;
    }

    public Variable getEv_user13() {
        return new Variable(); //  ev_user13;
    }

    public void setEv_user13(Variable ev_user13) {
        // Constant: this.ev_user13 = ev_user13;
    }

    public Variable getEv_user14() {
        return new Variable(); //  ev_user14;
    }

    public void setEv_user14(Variable ev_user14) {
        // Constant: this.ev_user14 = ev_user14;
    }

    public Variable getEv_user15() {
        return new Variable(); //  ev_user15;
    }

    public void setEv_user15(Variable ev_user15) {
        // Constant: this.ev_user15 = ev_user15;
    }

    public Variable getEv_user2() {
        return new Variable(); //  ev_user2;
    }

    public void setEv_user2(Variable ev_user2) {
        // Constant: this.ev_user2 = ev_user2;
    }

    public Variable getEv_user3() {
        return new Variable(); //  ev_user3;
    }

    public void setEv_user3(Variable ev_user3) {
        // Constant: this.ev_user3 = ev_user3;
    }

    public Variable getEv_user4() {
        return new Variable(); //  ev_user4;
    }

    public void setEv_user4(Variable ev_user4) {
        // Constant: this.ev_user4 = ev_user4;
    }

    public Variable getEv_user5() {
        return new Variable(); //  ev_user5;
    }

    public void setEv_user5(Variable ev_user5) {
        // Constant: this.ev_user5 = ev_user5;
    }

    public Variable getEv_user6() {
        return new Variable(); //  ev_user6;
    }

    public void setEv_user6(Variable ev_user6) {
        // Constant: this.ev_user6 = ev_user6;
    }

    public Variable getEv_user7() {
        return new Variable(); //  ev_user7;
    }

    public void setEv_user7(Variable ev_user7) {
        // Constant: this.ev_user7 = ev_user7;
    }

    public Variable getEv_user8() {
        return new Variable(); //  ev_user8;
    }

    public void setEv_user8(Variable ev_user8) {
        // Constant: this.ev_user8 = ev_user8;
    }

    public Variable getEv_user9() {
        return new Variable(); //  ev_user9;
    }

    public void setEv_user9(Variable ev_user9) {
        // Constant: this.ev_user9 = ev_user9;
    }

    public Variable getFa_archive() {
        return new Variable(); //  fa_archive;
    }

    public void setFa_archive(Variable fa_archive) {
        // Constant: this.fa_archive = fa_archive;
    }

    public Variable getFa_bottom() {
        return new Variable(); //  fa_bottom;
    }

    public void setFa_bottom(Variable fa_bottom) {
        // Constant: this.fa_bottom = fa_bottom;
    }

    public Variable getFa_center() {
        return new Variable(); //  fa_center;
    }

    public void setFa_center(Variable fa_center) {
        // Constant: this.fa_center = fa_center;
    }

    public Variable getFa_directory() {
        return new Variable(); //  fa_directory;
    }

    public void setFa_directory(Variable fa_directory) {
        // Constant: this.fa_directory = fa_directory;
    }

    public Variable getFa_hidden() {
        return new Variable(); //  fa_hidden;
    }

    public void setFa_hidden(Variable fa_hidden) {
        // Constant: this.fa_hidden = fa_hidden;
    }

    public Variable getFa_left() {
        return new Variable(); //  fa_left;
    }

    public void setFa_left(Variable fa_left) {
        // Constant: this.fa_left = fa_left;
    }

    public Variable getFa_middle() {
        return new Variable(); //  fa_middle;
    }

    public void setFa_middle(Variable fa_middle) {
        // Constant: this.fa_middle = fa_middle;
    }

    public Variable getFa_readonly() {
        return new Variable(); //  fa_readonly;
    }

    public void setFa_readonly(Variable fa_readonly) {
        // Constant: this.fa_readonly = fa_readonly;
    }

    public Variable getFa_right() {
        return new Variable(); //  fa_right;
    }

    public void setFa_right(Variable fa_right) {
        // Constant: this.fa_right = fa_right;
    }

    public Variable getFa_sysfile() {
        return new Variable(); //  fa_sysfile;
    }

    public void setFa_sysfile(Variable fa_sysfile) {
        // Constant: this.fa_sysfile = fa_sysfile;
    }

    public Variable getFa_top() {
        return new Variable(); //  fa_top;
    }

    public void setFa_top(Variable fa_top) {
        // Constant: this.fa_top = fa_top;
    }

    public Variable getFa_volumeid() {
        return new Variable(); //  fa_volumeid;
    }

    public void setFa_volumeid(Variable fa_volumeid) {
        // Constant: this.fa_volumeid = fa_volumeid;
    }

    public Variable getGlobal() {
        return new Variable(); //  global;
    }

    public void setGlobal(Variable global) {
        // Constant: this.global = global;
    }

    public Variable getLocal() {
        return new Variable(); //  local;
    }

    public void setLocal(Variable local) {
        // Constant: this.local = local;
    }

    public Variable getMb_any() {
        return new Variable(); //  mb_any;
    }

    public void setMb_any(Variable mb_any) {
        // Constant: this.mb_any = mb_any;
    }

    public Variable getMb_left() {
        return new Variable(); //  mb_left;
    }

    public void setMb_left(Variable mb_left) {
        // Constant: this.mb_left = mb_left;
    }

    public Variable getMb_middle() {
        return new Variable(); //  mb_middle;
    }

    public void setMb_middle(Variable mb_middle) {
        // Constant: this.mb_middle = mb_middle;
    }

    public Variable getMb_none() {
        return new Variable(); //  mb_none;
    }

    public void setMb_none(Variable mb_none) {
        // Constant: this.mb_none = mb_none;
    }

    public Variable getMb_right() {
        return new Variable(); //  mb_right;
    }

    public void setMb_right(Variable mb_right) {
        // Constant: this.mb_right = mb_right;
    }

    public Variable getPi() {
        return new Variable(); //  pi;
    }

    public void setPi(Variable pi) {
        // Constant: this.pi = pi;
    }

    public Variable getPr_linelist() {
        return new Variable(); //  pr_linelist;
    }

    public void setPr_linelist(Variable pr_linelist) {
        // Constant: this.pr_linelist = pr_linelist;
    }

    public Variable getPr_linestrip() {
        return new Variable(); //  pr_linestrip;
    }

    public void setPr_linestrip(Variable pr_linestrip) {
        // Constant: this.pr_linestrip = pr_linestrip;
    }

    public Variable getPr_pointlist() {
        return new Variable(); //  pr_pointlist;
    }

    public void setPr_pointlist(Variable pr_pointlist) {
        // Constant: this.pr_pointlist = pr_pointlist;
    }

    public Variable getPr_trianglefan() {
        return new Variable(); //  pr_trianglefan;
    }

    public void setPr_trianglefan(Variable pr_trianglefan) {
        // Constant: this.pr_trianglefan = pr_trianglefan;
    }

    public Variable getPr_trianglelist() {
        return new Variable(); //  pr_trianglelist;
    }

    public void setPr_trianglelist(Variable pr_trianglelist) {
        // Constant: this.pr_trianglelist = pr_trianglelist;
    }

    public Variable getPr_trianglestrip() {
        return new Variable(); //  pr_trianglestrip;
    }

    public void setPr_trianglestrip(Variable pr_trianglestrip) {
        // Constant: this.pr_trianglestrip = pr_trianglestrip;
    }

    public Variable getPs_change_all() {
        return new Variable(); //  ps_change_all;
    }

    public void setPs_change_all(Variable ps_change_all) {
        // Constant: this.ps_change_all = ps_change_all;
    }

    public Variable getPs_change_motion() {
        return new Variable(); //  ps_change_motion;
    }

    public void setPs_change_motion(Variable ps_change_motion) {
        // Constant: this.ps_change_motion = ps_change_motion;
    }

    public Variable getPs_change_shape() {
        return new Variable(); //  ps_change_shape;
    }

    public void setPs_change_shape(Variable ps_change_shape) {
        // Constant: this.ps_change_shape = ps_change_shape;
    }

    public Variable getPs_deflect_horizontal() {
        return new Variable(); //  ps_deflect_horizontal;
    }

    public void setPs_deflect_horizontal(Variable ps_deflect_horizontal) {
        // Constant: this.ps_deflect_horizontal = ps_deflect_horizontal;
    }

    public Variable getPs_deflect_vertical() {
        return new Variable(); //  ps_deflect_vertical;
    }

    public void setPs_deflect_vertical(Variable ps_deflect_vertical) {
        // Constant: this.ps_deflect_vertical = ps_deflect_vertical;
    }

    public Variable getPs_distr_gaussian() {
        return new Variable(); //  ps_distr_gaussian;
    }

    public void setPs_distr_gaussian(Variable ps_distr_gaussian) {
        // Constant: this.ps_distr_gaussian = ps_distr_gaussian;
    }

    public Variable getPs_distr_invgaussian() {
        return new Variable(); //  ps_distr_invgaussian;
    }

    public void setPs_distr_invgaussian(Variable ps_distr_invgaussian) {
        // Constant: this.ps_distr_invgaussian = ps_distr_invgaussian;
    }

    public Variable getPs_distr_linear() {
        return new Variable(); //  ps_distr_linear;
    }

    public void setPs_distr_linear(Variable ps_distr_linear) {
        // Constant: this.ps_distr_linear = ps_distr_linear;
    }

    public Variable getPs_force_constant() {
        return new Variable(); //  ps_force_constant;
    }

    public void setPs_force_constant(Variable ps_force_constant) {
        // Constant: this.ps_force_constant = ps_force_constant;
    }

    public Variable getPs_force_linear() {
        return new Variable(); //  ps_force_linear;
    }

    public void setPs_force_linear(Variable ps_force_linear) {
        // Constant: this.ps_force_linear = ps_force_linear;
    }

    public Variable getPs_force_quadratic() {
        return new Variable(); //  ps_force_quadratic;
    }

    public void setPs_force_quadratic(Variable ps_force_quadratic) {
        // Constant: this.ps_force_quadratic = ps_force_quadratic;
    }

    public Variable getPs_shape_diamond() {
        return new Variable(); //  ps_shape_diamond;
    }

    public void setPs_shape_diamond(Variable ps_shape_diamond) {
        // Constant: this.ps_shape_diamond = ps_shape_diamond;
    }

    public Variable getPs_shape_ellipse() {
        return new Variable(); //  ps_shape_ellipse;
    }

    public void setPs_shape_ellipse(Variable ps_shape_ellipse) {
        // Constant: this.ps_shape_ellipse = ps_shape_ellipse;
    }

    public Variable getPs_shape_line() {
        return new Variable(); //  ps_shape_line;
    }

    public void setPs_shape_line(Variable ps_shape_line) {
        // Constant: this.ps_shape_line = ps_shape_line;
    }

    public Variable getPs_shape_rectangle() {
        return new Variable(); //  ps_shape_rectangle;
    }

    public void setPs_shape_rectangle(Variable ps_shape_rectangle) {
        // Constant: this.ps_shape_rectangle = ps_shape_rectangle;
    }

    public Variable getPt_shape_circle() {
        return new Variable(); //  pt_shape_circle;
    }

    public void setPt_shape_circle(Variable pt_shape_circle) {
        // Constant: this.pt_shape_circle = pt_shape_circle;
    }

    public Variable getPt_shape_cloud() {
        return new Variable(); //  pt_shape_cloud;
    }

    public void setPt_shape_cloud(Variable pt_shape_cloud) {
        // Constant: this.pt_shape_cloud = pt_shape_cloud;
    }

    public Variable getPt_shape_disk() {
        return new Variable(); //  pt_shape_disk;
    }

    public void setPt_shape_disk(Variable pt_shape_disk) {
        // Constant: this.pt_shape_disk = pt_shape_disk;
    }

    public Variable getPt_shape_explosion() {
        return new Variable(); //  pt_shape_explosion;
    }

    public void setPt_shape_explosion(Variable pt_shape_explosion) {
        // Constant: this.pt_shape_explosion = pt_shape_explosion;
    }

    public Variable getPt_shape_flare() {
        return new Variable(); //  pt_shape_flare;
    }

    public void setPt_shape_flare(Variable pt_shape_flare) {
        // Constant: this.pt_shape_flare = pt_shape_flare;
    }

    public Variable getPt_shape_line() {
        return new Variable(); //  pt_shape_line;
    }

    public void setPt_shape_line(Variable pt_shape_line) {
        // Constant: this.pt_shape_line = pt_shape_line;
    }

    public Variable getPt_shape_pixel() {
        return new Variable(); //  pt_shape_pixel;
    }

    public void setPt_shape_pixel(Variable pt_shape_pixel) {
        // Constant: this.pt_shape_pixel = pt_shape_pixel;
    }

    public Variable getPt_shape_ring() {
        return new Variable(); //  pt_shape_ring;
    }

    public void setPt_shape_ring(Variable pt_shape_ring) {
        // Constant: this.pt_shape_ring = pt_shape_ring;
    }

    public Variable getPt_shape_smoke() {
        return new Variable(); //  pt_shape_smoke;
    }

    public void setPt_shape_smoke(Variable pt_shape_smoke) {
        // Constant: this.pt_shape_smoke = pt_shape_smoke;
    }

    public Variable getPt_shape_snow() {
        return new Variable(); //  pt_shape_snow;
    }

    public void setPt_shape_snow(Variable pt_shape_snow) {
        // Constant: this.pt_shape_snow = pt_shape_snow;
    }

    public Variable getPt_shape_spark() {
        return new Variable(); //  pt_shape_spark;
    }

    public void setPt_shape_spark(Variable pt_shape_spark) {
        // Constant: this.pt_shape_spark = pt_shape_spark;
    }

    public Variable getPt_shape_sphere() {
        return new Variable(); //  pt_shape_sphere;
    }

    public void setPt_shape_sphere(Variable pt_shape_sphere) {
        // Constant: this.pt_shape_sphere = pt_shape_sphere;
    }

    public Variable getPt_shape_square() {
        return new Variable(); //  pt_shape_square;
    }

    public void setPt_shape_square(Variable pt_shape_square) {
        // Constant: this.pt_shape_square = pt_shape_square;
    }

    public Variable getPt_shape_star() {
        return new Variable(); //  pt_shape_star;
    }

    public void setPt_shape_star(Variable pt_shape_star) {
        // Constant: this.pt_shape_star = pt_shape_star;
    }

    public Variable getSe_chorus() {
        return new Variable(); //  se_chorus;
    }

    public void setSe_chorus(Variable se_chorus) {
        // Constant: this.se_chorus = se_chorus;
    }

    public Variable getSe_compressor() {
        return new Variable(); //  se_compressor;
    }

    public void setSe_compressor(Variable se_compressor) {
        // Constant: this.se_compressor = se_compressor;
    }

    public Variable getSe_echo() {
        return new Variable(); //  se_echo;
    }

    public void setSe_echo(Variable se_echo) {
        // Constant: this.se_echo = se_echo;
    }

    public Variable getSe_equalizer() {
        return new Variable(); //  se_equalizer;
    }

    public void setSe_equalizer(Variable se_equalizer) {
        // Constant: this.se_equalizer = se_equalizer;
    }

    public Variable getSe_flanger() {
        return new Variable(); //  se_flanger;
    }

    public void setSe_flanger(Variable se_flanger) {
        // Constant: this.se_flanger = se_flanger;
    }

    public Variable getSe_gargle() {
        return new Variable(); //  se_gargle;
    }

    public void setSe_gargle(Variable se_gargle) {
        // Constant: this.se_gargle = se_gargle;
    }

    public Variable getSe_none() {
        return new Variable(); //  se_none;
    }

    public void setSe_none(Variable se_none) {
        // Constant: this.se_none = se_none;
    }

    public Variable getSe_reverb() {
        return new Variable(); //  se_reverb;
    }

    public void setSe_reverb(Variable se_reverb) {
        // Constant: this.se_reverb = se_reverb;
    }

    public Variable getSelf() {
        return new Variable(); //  self;
    }

    public void setSelf(Variable self) {
        
    }

    public Variable getTy_real() {
        return new Variable(); //  ty_real;
    }

    public void setTy_real(Variable ty_real) {
        // Constant: this.ty_real = ty_real;
    }

    public Variable getTy_string() {
        return new Variable(); //  ty_string;
    }

    public void setTy_string(Variable ty_string) {
        // Constant: this.ty_string = ty_string;
    }

    public Variable getVk_add() {
        return new Integer(107);//  vk_add;
    }

    public void setVk_add(Variable vk_add) {
        // Constant: this.vk_add = vk_add;
    }

    public Variable getVk_alt() {
        return new Integer(18);
    }

    public void setVk_alt(Variable vk_alt) {
        // Constant: this.vk_alt = vk_alt;
    }

    public Variable getVk_anykey() {
        return new Integer(1);
    }

    public void setVk_anykey(Variable vk_anykey) {
        // Constant: this.vk_anykey = vk_anykey;
    }

    public Variable getVk_backspace() {
        return new Integer(8);
    }

    public void setVk_backspace(Variable vk_backspace) {
        // Constant: this.vk_backspace = vk_backspace;
    }

    public Variable getVk_control() {
        return new Integer(17);
    }

    public void setVk_control(Variable vk_control) {
        // Constant: this.vk_control = vk_control;
    }

    public Variable getVk_decimal() {
        return new Integer(110); //  vk_decimal;
    }

    public void setVk_decimal(Variable vk_decimal) {
        // Constant: this.vk_decimal = vk_decimal;
    }

    public Variable getVk_delete() {
        return new Integer(46);
    }

    public void setVk_delete(Variable vk_delete) {
        // Constant: this.vk_delete = vk_delete;
    }

    public Variable getVk_divide() {
        return new Integer(111); //  vk_divide;
    }

    public void setVk_divide(Variable vk_divide) {
        // Constant: this.vk_divide = vk_divide;
    }

    public Variable getVk_down() {
        return new Integer(40);
    }

    public void setVk_down(Variable vk_down) {
        // Constant: this.vk_down = vk_down;
    }

    public Variable getVk_end() {
        return new Integer(35);
    }

    public void setVk_end(Variable vk_end) {
        // Constant: this.vk_end = vk_end;
    }

    public Variable getVk_enter() {
        return new Integer(13);
    }

    public void setVk_enter(Variable vk_enter) {
        // Constant: this.vk_enter = vk_enter;
    }

    public Variable getVk_escape() {
        return new Integer(27);
    }

    public void setVk_escape(Variable vk_escape) {
        // Constant: this.vk_escape = vk_escape;
    }

    public Variable getVk_f1() {
        return new Integer(112); //  vk_f1;
    }

    public void setVk_f1(Variable vk_f1) {
        // Constant: this.vk_f1 = vk_f1;
    }

    public Variable getVk_f10() {
        return new Integer(121); //  vk_f10;
    }

    public void setVk_f10(Variable vk_f10) {
        // Constant: this.vk_f10 = vk_f10;
    }

    public Variable getVk_f11() {
        return new Integer(122); //  vk_f11;
    }

    public void setVk_f11(Variable vk_f11) {
        // Constant: this.vk_f11 = vk_f11;
    }

    public Variable getVk_f12() {
        return new Integer(113); //  vk_f12;
    }

    public void setVk_f12(Variable vk_f12) {
        // Constant: this.vk_f12 = vk_f12;
    }

    public Variable getVk_f2() {
        return new Integer(113); //  vk_f2;
    }

    public void setVk_f2(Variable vk_f2) {
        // Constant: this.vk_f2 = vk_f2;
    }

    public Variable getVk_f3() {
        return new Integer(114); //  vk_f3;
    }

    public void setVk_f3(Variable vk_f3) {
        // Constant: this.vk_f3 = vk_f3;
    }

    public Variable getVk_f4() {
        return new Integer(115); //  vk_f4;
    }

    public void setVk_f4(Variable vk_f4) {
        // Constant: this.vk_f4 = vk_f4;
    }

    public Variable getVk_f5() {
       return new Integer(116); //  vk_f5;
    }

    public void setVk_f5(Variable vk_f5) {
        // Constant: this.vk_f5 = vk_f5;
    }

    public Variable getVk_f6() {
        return new Integer(117); //  vk_f6;
    }

    public void setVk_f6(Variable vk_f6) {
        // Constant: this.vk_f6 = vk_f6;
    }

    public Variable getVk_f7() {
        return new Integer(118); //  vk_f7;
    }

    public void setVk_f7(Variable vk_f7) {
        // Constant: this.vk_f7 = vk_f7;
    }

    public Variable getVk_f8() {
        return new Integer(119); //  vk_f8;
    }

    public void setVk_f8(Variable vk_f8) {
        // Constant: this.vk_f8 = vk_f8;
    }

    public Variable getVk_f9() {
        return new Integer(120); //  vk_f9;
    }

    public void setVk_f9(Variable vk_f9) {
        // Constant: this.vk_f9 = vk_f9;
    }

    public Variable getVk_home() {
        return new Integer(36);
    }

    public void setVk_home(Variable vk_home) {
        // Constant: this.vk_home = vk_home;
    }

    public Variable getVk_insert() {
        return new Integer(45);
    }

    public void setVk_insert(Variable vk_insert) {
        // Constant: this.vk_insert = vk_insert;
    }

    public Variable getVk_lalt() {
        return new Integer(164); //  vk_lalt;
    }

    public void setVk_lalt(Variable vk_lalt) {
        // Constant: this.vk_lalt = vk_lalt;
    }

    public Variable getVk_lcontrol() {
        return new Integer(162); //  vk_lcontrol;
    }

    public void setVk_lcontrol(Variable vk_lcontrol) {
        // Constant: this.vk_lcontrol = vk_lcontrol;
    }

    public Variable getVk_left() {
        return new Integer(37);
    }

    public void setVk_left(Variable vk_left) {
        // Constant: this.vk_left = vk_left;
    }

    public Variable getVk_lshift() {
        return new Integer(160); //  vk_lshift;
    }

    public void setVk_lshift(Variable vk_lshift) {
        // Constant: this.vk_lshift = vk_lshift;
    }

    public Variable getVk_multiply() {
        return new Integer(106); //  vk_multiply;
    }

    public void setVk_multiply(Variable vk_multiply) {
        // Constant: this.vk_multiply = vk_multiply;
    }

    public Variable getVk_nokey() {
        return new Integer(0); //  vk_nokey;
    }

    public void setVk_nokey(Variable vk_nokey) {
        //constant
    }

    public Variable getVk_numpad0() {
        return new Integer(96); //  vk_numpad0;
    }

    public void setVk_numpad0(Variable vk_numpad0) {
        // Constant: // Constant: this.vk_numpad0 = vk_numpad0;
    }

    public Variable getVk_numpad1() {
        return new Integer(97); //  vk_numpad1;
    }

    public void setVk_numpad1(Variable vk_numpad1) {
        // Constant: this.vk_numpad1 = vk_numpad1;
    }

    public Variable getVk_numpad2() {
        return new Integer(98); //  vk_numpad2;
    }

    public void setVk_numpad2(Variable vk_numpad2) {
        // Constant: this.vk_numpad2 = vk_numpad2;
    }

    public Variable getVk_numpad3() {
        return new Integer(99); //  vk_numpad3;
    }

    public void setVk_numpad3(Variable vk_numpad3) {
        // Constant: this.vk_numpad3 = vk_numpad3;
    }

    public Variable getVk_numpad4() {
        return new Integer(100); //  vk_numpad4;
    }

    public void setVk_numpad4(Variable vk_numpad4) {
        // Constant: this.vk_numpad4 = vk_numpad4;
    }

    public Variable getVk_numpad5() {
        return new Integer(101); //  vk_numpad5;
    }

    public void setVk_numpad5(Variable vk_numpad5) {
        // Constant: this.vk_numpad5 = vk_numpad5;
    }

    public Variable getVk_numpad6() {
        return new Integer(102); //  vk_numpad6;
    }

    public void setVk_numpad6(Variable vk_numpad6) {
        // Constant: this.vk_numpad6 = vk_numpad6;
    }

    public Variable getVk_numpad7() {
        return new Integer(103); //  vk_numpad7;
    }

    public void setVk_numpad7(Variable vk_numpad7) {
        // Constant: this.vk_numpad7 = vk_numpad7;
    }

    public Variable getVk_numpad8() {
        return new Integer(104); //  vk_numpad8;
    }

    public void setVk_numpad8(Variable vk_numpad8) {
        // Constant: this.vk_numpad8 = vk_numpad8;
    }

    public Variable getVk_numpad9() {
        return new Integer(105); //  vk_numpad9;
    }

    public void setVk_numpad9(Variable vk_numpad9) {
        // Constant: this.vk_numpad9 = vk_numpad9;
    }

    public Variable getVk_pagedown() {
        return new Integer(34); //  vk_pagedown;
    }

    public void setVk_pagedown(Variable vk_pagedown) {
        // Constant: this.vk_pagedown = vk_pagedown;
    }

    public Variable getVk_pageup() {
        return new Integer(33); //  vk_pageup;
    }

    public void setVk_pageup(Variable vk_pageup) {
        // Constant: this.vk_pageup = vk_pageup;
    }

    public Variable getVk_pause() {
        return new Integer(19); //  vk_pause;
    }

    public void setVk_pause(Variable vk_pause) {
        // Constant: this.vk_pause = vk_pause;
    }

    public Variable getVk_printscreen() {
        return new Integer(44); //  vk_printscreen;
    }

    public void setVk_printscreen(Variable vk_printscreen) {
        // Constant: this.vk_printscreen = vk_printscreen;
    }

    public Variable getVk_ralt() {
        return new Integer(165); //  vk_ralt;
    }

    public void setVk_ralt(Variable vk_ralt) {
        // Constant: this.vk_ralt = vk_ralt;
    }

    public Variable getVk_rcontrol() {
        return new Integer(163); //  vk_rcontrol;
    }

    public void setVk_rcontrol(Variable vk_rcontrol) {
        // Constant: this.vk_rcontrol = vk_rcontrol;
    }

    public Variable getVk_return() {
        return new Variable(); //  vk_return new Variable(); // ;
    }

    public void setVk_return (Variable vk_return ) {
        // Constant: this.vk_return new Variable(); //  = vk_return new Variable(); // ;
    }

    public Variable getVk_right() {
        return new Integer(39);
    }

    public void setVk_right(Variable vk_right) {
        // Constant: this.vk_right = vk_right;
    }

    public Variable getVk_rshift() {
        return new Integer(161); //  vk_rshift;
    }

    public void setVk_rshift(Variable vk_rshift) {
        // Constant: this.vk_rshift = vk_rshift;
    }

    public Variable getVk_shift() {
        return new Integer(16);
    }

    public void setVk_shift(Variable vk_shift) {
        // Constant: this.vk_shift = vk_shift;
    }

    public Variable getVk_space() {
       return new Integer(32);
    }

    public void setVk_space(Variable vk_space) {
        // Constant: this.vk_space = vk_space;
    }

    public Variable getVk_subtract() {
        return new Integer(109); //  vk_subtract;
    }

    public void setVk_subtract(Variable vk_subtract) {
        // Constant: this.vk_subtract = vk_subtract;
    }

    public Variable getVk_tab() {
        return new Integer(9);
    }

    public void setVk_tab(Variable vk_tab) {
        // Constant: this.vk_tab = vk_tab;
    }

    public Variable getVk_up() {
        return new Integer(38);
    }

    public void setVk_up(Variable vk_up) {
        // Constant: this.vk_up = vk_up;
    }
    
}
