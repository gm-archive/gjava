/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import com.golden.gamedev.util.ImageUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.gcreator.compilers.gjava.Game;
import org.gcreator.compilers.gjava.api.components.Sprite;

/**
 * This class is valid GCL, don't use java code here
 * This class will be converted to other languages via gcl
 * @author TGMG
 */
public class GCL extends Variables {
  
    
    
    /*
     * 
     Math functions
     * 
     */ 
    
public static Object is_real(Object val)
{
    if (val instanceof String)
        return new Boolean(false);
    else
        return new Boolean(true);
}
public static Object is_string(Object val)
{
if (val instanceof String)
        return new Boolean(true);
    else
        return new Boolean(false);
}
/**
 * 
 * @param x
 * @since 1.0
 * @return
 */
public static Object random(Object x)
{
return new Double(Math.random(x.getDouble()));
}
public static Object choose(Object x1, Object x2, Object x3)
{
return new Object();
}
public static Object abs(Object x)
{
return new Double(Math.abs(x.getDouble()));
}
public static Object round(Object x)
{
return new Double(Math.round(x.getDouble()));
}
public static Object floor(Object x)
{
return new Double(Math.floor(x.getDouble()));
}

public static Object ceil(Object x)
{
return new Double(Math.ceil(x.getDouble()));
}

public static Object sign(Object x)
{
return new Double(Math.sign(x.getDouble()));
}

public static Object frac(Object x)
{
return new Double(Math.frac(x.getDouble()));
}

public static Object sqrt(Object x)
{
return new Double(Math.sqrt(x.getDouble()));
}

public static Object sqr(Object x)
{
return new Double(Math.sqr(x.getDouble()));
}

public static Object exp(Object x)
{
return new Double(Math.exp(x.getDouble()));
}

public static Object ln(Object x)
{
return new Double(Math.ln(x.getDouble()));
}

public static Object log2(Object x)
{
return new Double(Math.log2(x.getDouble()));
}

public static Object log10(Object x)
{
return new Double(Math.log10(x.getDouble()));
}

public static Object sin(Object x)
{
return new Double(Math.sin(x.getDouble()));
}

public static Object cos(Object x)
{
return new Double(Math.cos(x.getDouble()));
}

public static Object tan(Object x)
{
return new Double(Math.tan(x.getDouble()));
}

public static Object arcsin(Object x)
{
return new Double(Math.arcsin(x.getDouble()));
}

public static Object arccos(Object x)
{
return new Double(Math.arccos(x.getDouble()));
}

public static Object arctan(Object x)
{
return new Double(Math.arctan(x.getDouble()));
}

public static Object arctan2(Object y, Object x)
{
return new Double(Math.arctan2(y.getDouble(),x.getDouble()));
}

public static Object degtorad(Object x)
{
return new Double(Math.degtorad(x.getDouble()));
}

public static Object radtodeg(Object x)
{
return new Double(Math.radtodeg(x.getDouble()));
}

public static Object power(Object x, Object n)
{
return new Double(Math.power(x.getDouble(),n.getDouble()));
}

public static Object logn(Object n, Object x)
{
return new Double(Math.power(n.getDouble(),x.getDouble()));
}

public static Object min(Object x[])
{
return new Object();
}

public static Object max(Object x[])
{
return new Object();
}

public static Object mean(Object x[])
{
return new Object();
}

public static Object median(Object x[])
{
return new Object();
}

public static Object point_distance(Object x1, Object y1, Object x2, Object y2)
{
return new Double(Math.pointDistance(x1.getDouble(),y1.getDouble(),x2.getDouble(),y2.getDouble()));
}

public static Object point_direction(Object x1, Object y1, Object x2, Object y2)
{
return new Double(Math.pointDirection(x1.getDouble(),y1.getDouble(),x2.getDouble(),y2.getDouble()));
}

public static Object lengthdir_x(Object len, Object dir)
{
return new Double(Math.lengthDirX(len.getDouble(),dir.getDouble()));
}

public static Object lengthdir_y(Object len, Object dir)
{
return new Double(Math.lengthDirY(len.getDouble(),dir.getDouble()));
}




/**
 * 
 * String functions
 * 
 */
public static Object real(Object str)
{
return new Double(str.getDouble());
}

public static Object string(Object val)
{
return val.getString();
}

public static Object string_format(Object val, Object total, Object dec)
{
return new String(String.stringFormat(val.getDouble(), total.getDouble(), dec.getDouble()));
}

public static Object chr(Object val)
{
return new String(String.chr(val.getDouble()));
}

public static Object ord(Object character)
{
return new Double(String.ord(character+""));
}

public static Object string_length(Object str)
{
return new Double(String.length(str+""));
}

public static Object string_pos(Object substr, Object str)
{
return new Double(String.pos(substr+"",str+""));
}

public static Object string_copy(Object str, Object index, Object count)
{
return new String(String.substring(str+"",index.getDouble(),count.getDouble()));
}

public static Object string_char_at(Object str, Object index)
{
return new String(String.charAt(str+"", index.getDouble()));
}

public static Object string_delete(Object str, Object index, Object count)
{
return new String(String.delete(str+"", index.getDouble(), count.getDouble()));
}

public static Object string_insert(Object substr, Object str, Object index)
{
return new String(String.insert(substr+"", str+"", index.getDouble()));
}

public static Object string_lower(Object str)
{
return new String(String.lower(""+str));
}

public static Object string_upper(Object str)
{
return new String(String.upper(""+str));
}

public static Object string_repeat(Object str, Object count)
{
return new String(String.repeat(str+"", count.getDouble()));
}

public static Object string_letters(Object str)
{
return new String(String.letters(str+""));
}

public static Object string_digits(Object str)
{
return new String(String.digits(str+""));
}

public static Object string_lettersdigits(Object str)
{
return new String(String.lettersDigits(str+""));
}

public static Object string_replace(Object str, Object substr, Object newstr)
{
return new String(String.replace(str+"", substr+"", newstr+""));
}

public static Object string_replace_all(Object str, Object substr, Object newstr)
{
return new String(String.replaceAll(str+"", substr+"", newstr+""));
}

public static Object string_count(Object substr, Object str)
{
return new Double(String.count(substr+"", str+""));
}

public static Object clipboard_has_text()
{
return new Boolean(Clipboard.hasText());
}

public static Object clipboard_set_text(Object str)
{
    Clipboard.setText(str.getString());
return new Object();
}

public static Object clipboard_get_text()
{
return Clipboard.getText();
}


/*
 * 
 * Date functions
 * 
 */ 
public static Object date_current_datetime()
{
return new Double(Date.currentDatetime());
}

public static Object date_current_date()
{
    
return round(new Double(Date.currentDate()));
}

public static Object date_current_time()
{
return new Object();
}

public static Object date_create_datetime(Object year, Object month, Object day, Object hour, Object minute, Object second)
{
return new Object();
}

public static Object date_create_date(Object year, Object month, Object day)
{
return new Object();
}

public static Object date_create_time(Object hour, Object minute, Object second)
{
return new Object();
}

public static Object date_valid_datetime(Object year, Object month, Object day, Object hour, Object minute, Object second)
{
return new Object();
}

public static Object date_valid_date(Object year, Object month, Object day)
{
return new Object();
}

public static Object date_valid_time(Object hour, Object minute, Object second)
{
return new Object();
}

public static Object date_inc_year(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_month(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_week(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_day(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_hour(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_minute(Object date, Object amount)
{
return new Object();
}

public static Object date_inc_second(Object date, Object amount)
{
return new Object();
}

public static Object date_get_year(Object date)
{
return new Double(Date.getYear(date.getDouble()));
}

public static Object date_get_month(Object date)
{
return new Object();
}

public static Object date_get_week(Object date)
{
return new Object();
}

public static Object date_get_day(Object date)
{
return new Object();
}

public static Object date_get_hour(Object date)
{
return new Object();
}

public static Object date_get_minute(Object date)
{
return new Object();
}

public static Object date_get_second(Object date)
{
return new Object();
}

public static Object date_get_weekday(Object date)
{
return new Object();
}

public static Object date_get_day_of_year(Object date)
{
return new Object();
}

public static Object date_get_hour_of_year(Object date)
{
return new Object();
}

public static Object date_get_minute_of_year(Object date)
{
return new Object();
}

public static Object date_get_second_of_year(Object date)
{
return new Object();
}

public static Object date_year_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_month_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_week_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_day_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_hour_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_minute_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_second_span(Object date1, Object date2)
{
return new Object();
}

public static Object date_compare_datetime(Object date1, Object date2)
{
return new Object();
}

public static Object date_compare_date(Object date1, Object date2)
{
return new Object();
}

public static Object date_compare_time(Object date1, Object date2)
{
return new Object();
}

public static Object date_date_of(Object date)
{
return new Object();
}

public static Object date_time_of(Object date)
{
return new Object();
}

public static Object date_datetime_string(Object date)
{
return new Object();
}

public static Object date_date_string(Object date)
{
return new Object();
}

public static Object date_time_string(Object date)
{
return new Object();
}

public static Object date_days_in_month(Object date)
{
return new Object();
}

public static Object date_days_in_year(Object date)
{
return new Object();
}

public static Object date_leap_year(Object date)
{
return new Object();
}

public static Object date_is_today(Object date)
{
return new Object();
}

/*
 * 
 * Moving around Functions
 * 
 */

public static Object motion_set(Object dir, Object speed)
{
    self.setDirection(dir);
    self.setSpeed(speed);
return new Object();
}

public static Object motion_add(Object dir, Object speed)
{
    self.hspeed += -(speed.getDouble());
    self.vspeed += speed.getDouble() * Math.sin(dir.getDouble() * (Math.PI/180));
    self.speed += speed.getDouble();
    self.direction = new Double(self.direction.getDouble() + dir.getDouble());
return new Object();
}

public static Object place_free(Object x, Object y)
{
return new Object();
}

public static Object place_empty(Object x, Object y)
{
return new Object();
}

public static Object place_meeting(Object x, Object y, Object obj)
{
return new Object();
}

public static Object place_snapped(Object hsnap, Object vsnap)
{
    if ((self.x % hsnap.getDouble() ==0) && (self.y % vsnap.getDouble()==0) )
        return new Boolean(true);

return new Object();
}

public static Object move_random(Object hsnap, Object vsnap)
{
    self.x=round(random(getRoom_width()).div(hsnap)).mult(hsnap).getDouble();
    self.y=round(random(getRoom_height()).div(vsnap)).mult(vsnap).getDouble();
return new Object();
}

/*
 * 
 * @author hanson
 */
public static Object move_snap(Object hsnap, Object vsnap)
{
    self.x = round(new Double(self.x/hsnap.getDouble())).getDouble()  * hsnap.getDouble();
self.y = round(new Double(self.y/vsnap.getDouble())).getDouble() * vsnap.getDouble();		
return new Object();
}

public static Object move_towards_point(Object xto, Object yto, Object sp)
{
   double dist=sqrt(new Double((xto.getDouble()-self.x)*(xto.getDouble()-self.x)+(yto.getDouble()-self.y)*(yto.getDouble()-self.y))).getDouble();
   self.hspeed=((xto.getDouble()-self.x)/dist)*sp.getDouble();
   self.vspeed=((yto.getDouble()-self.y)/dist)*sp.getDouble();
return new Object();
}

public static Object move_contact_solid(Object dir, Object maxdist)
{
return new Object();
}

public static Object move_contact_all(Object dir, Object maxdist)
{
return new Object();
}

public static Object move_outside_solid(Object dir, Object maxdist)
{
return new Object();
}

public static Object move_outside_all(Object dir, Object maxdist)
{
return new Object();
}

public static Object move_bounce_solid(Object advanced)
{
return new Object();
}

public static Object move_bounce_all(Object advanced)
{
return new Object();
}

public static Object move_wrap(Object hor, Object vert, Object margin)
{
    if(hor.getBoolean()==true){
      if((self.x<-margin.getDouble()) || (self.x>getRoom_width().getDouble()+margin.getDouble())){
         self.x=getRoom_width().getDouble()-self.x;
      }
   }
   if(vert.getBoolean()==true){
      if((self.y<-margin.getDouble())||(self.y>getRoom_height().getDouble()+margin.getDouble())){
         self.y=getRoom_height().getDouble()-self.y;
      }
   }
return new Object();
}

public static Object distance_to_point(Object x, Object y)
{
    double xd = x.getDouble()-self.x;
    double yd = y.getDouble()-self.y;
    return sqrt(new Double((xd)*(xd)+(yd)*(yd)));
}

public static Object distance_to_object(Object obj)
{
   // Game.Current.instances
    /*double smalldist =-1 ;//= (Actor) Game.Current.instances.elementAt(0);
       for (int i = 0; i < Game.Current.instances.size(); i++) {
        Actor object = (Actor) Game.Current.instances.elementAt(i);
        if (object.equals(obj.getClass())) {
        double dist = (sqrt(new Double((object.x-self.x)*(object.x-self.x)+(object.y-self.y)*(object.y-self.y)))).getDouble();
    if (i==0) 
        smalldist = dist;
    else if (dist < smalldist)
        smalldist = dist;
       }*/
    return distance_to_point(
            ((Actor) obj).getX(),
            ((Actor) obj).getY());
       }
     
/*return new Double(smalldist);
}*/

public static Object position_empty(Object x, Object y)
{
return new Object();
}

public static Object position_meeting(Object x, Object y, Object obj)
{
return new Object();
}

/*
 * 
 * Paths functions
 * 
 */
public static Object path_start(Object path, Object speed, Object endaction, Object absolute)
{
return new Object();
}

public static Object path_end()
{
return new Object();
}

/*
 * 
 * Motion planning functions
 * 
 */

public static Object mp_linear_step(Object x, Object y, Object speed, Object checkall)
{
return new Object();
}

public static Object mp_potential_step(Object x, Object y, Object speed, Object checkall)
{
return new Object();
}

public static Object mp_linear_step_object(Object x, Object y, Object speed, Object obj)
{
return new Object();
}

public static Object mp_potential_step_object(Object x, Object y, Object speed, Object obj)
{
return new Object();
}

public static Object mp_potential_settings(Object maxrot, Object rotstep, Object ahead, Object onspot)
{
return new Object();
}

public static Object mp_linear_path(Object path, Object xg, Object yg, Object stepsize, Object checkall)
{
return new Object();
}

public static Object mp_potential_path(Object path, Object xg, Object yg, Object stepsize, Object factor, Object checkall)
{
return new Object();
}

public static Object mp_linear_path_object(Object path, Object xg, Object yg, Object stepsize, Object obj)
{
return new Object();
}

public static Object mp_potential_path_object(Object path, Object xg, Object yg, Object stepsize, Object factor, Object obj)
{
return new Object();
}

public static Object mp_grid_create(Object left, Object top, Object hcells, Object vcells, Object cellwidth, Object cellheight)
{
return new Object();
}

public static Object mp_grid_destroy(Object id)
{
return new Object();
}

public static Object mp_grid_clear_all(Object id)
{
return new Object();
}

public static Object mp_grid_clear_cell(Object id, Object h, Object v)
{
return new Object();
}

public static Object mp_grid_clear_rectangle(Object id, Object left, Object top, Object right, Object bottom)
{
return new Object();
}

public static Object mp_grid_add_cell(Object id, Object h, Object v)
{
return new Object();
}

public static Object mp_grid_add_rectangle(Object id, Object left, Object top, Object right, Object bottom)
{
return new Object();
}

public static Object mp_grid_add_instances(Object id, Object obj, Object prec)
{
return new Object();
}

public static Object mp_grid_path(Object id, Object path, Object xstart, Object ystart, Object xgoal, Object ygoal, Object allowdiag)
{
return new Object();
}

public static Object mp_grid_draw(Object id)
{
return new Object();
}

/*
 * 
 * Collision checking
 * 
 */
public static Object collision_point(Object x, Object y, Object obj, Object prec, Object notme)
{
return new Object();
}

public static Object collision_rectangle(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return new Object();
}

public static Object collision_circle(Object x1, Object y1, Object radius, Object obj, Object prec, Object notme)
{
return new Object();
}

public static Object collision_ellipse(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return new Object();
}

public static Object collision_line(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return new Object();
}

/*
 * 
 * Instances
 * 
 */

public static Object instance_find(Object obj, Object n)
{
return new Object();
}

public static Object instance_exists(Object obj)
{
return new Object();
}

public static Object instance_number(Object obj)
{
return new Object();
}

public static Object instance_position(Object x, Object y, Object obj)
{
return new Object();
}

public static Object instance_nearest(Object x, Object y, Object obj)
{
return new Object();
}

public static Object instance_furthest(Object x, Object y, Object obj)
{
return new Object();
}

public static Object instance_place(Object x, Object y, Object obj)
{
return new Object();
}

public static Object instance_create(Object x, Object y, Object obj)
{
return new Object();
}

public static Object instance_copy(Object performevent)
{
return new Object();
}

public static Object instance_change(Object obj, Object performevents)
{
return new Object();
}

public static Object instance_destroy()
{
return new Object();
}

public static Object position_destroy(Object x, Object y)
{
return new Object();
}

public static Object position_change(Object x, Object y, Object obj, Object performevents)
{
return new Object();
}

/*
 * 
 * Deactivating instances
 * 
 */
public static Object instance_deactivate_all(Object notme)
{
return new Object();
}

public static Object instance_deactivate_object(Object obj)
{
return new Object();
}

public static Object instance_deactivate_region(Object left, Object top, Object width, Object height, Object inside, Object notme)
{
return new Object();
}

public static Object instance_activate_all()
{
return new Object();
}

public static Object instance_activate_object(Object obj)
{
return new Object();
}

public static Object instance_activate_region(Object left, Object top, Object width, Object height, Object inside)
{
return new Object();
}

/*
 * 
 * Timing
 * 
 */
public static Object sleep(Object millisec)
{
        try {
            Thread.sleep((int) millisec.getDouble());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object();
}

/*
 * 
 * Rooms
 * 
 */
public static Object room_goto(Object numb)
{
return new Object();
}

public static Object room_goto_previous()
{
return new Object();
}

public static Object room_goto_next()
{
return new Object();
}

public static Object room_previous(Object numb)
{
return new Object();
}

public static Object room_next(Object numb)
{
return new Object();
}

public static Object room_restart()
{
return new Object();
}

public static Object game_end()
{
return new Object();
}

public static Object game_restart()
{
return new Object();
}

public static Object game_load(Object filename)
{
return new Object();
}

public static Object game_save(Object filename)
{
return new Object();
}

/*
 * 
 * Event
 * 
 */
public static Object event_perform(Object type, Object numb)
{
return new Object();
}

public static Object event_user(Object numb)
{
return new Object();
}

public static Object event_perform_object(Object obj, Object type, Object numb)
{
return new Object();
}

public static Object event_inherited()
{
return new Object();
}

/*
 * 
 * Miscellaneous 
 * 
 */
public static Object show_debug_message(Object str)
{
return new Object();
}

public static Object variable_global_exists(Object name)
{
return new Object();
}

public static Object variable_global_get(Object name)
{
return new Object();
}

public static Object variable_global_array_get(Object name, Object ind)
{
return new Object();
}

public static Object variable_global_array2_get(Object name, Object ind1, Object ind2)
{
return new Object();
}

public static Object variable_global_set(Object name, Object value)
{
return new Object();
}

public static Object variable_global_array_set(Object name, Object ind, Object value)
{
return new Object();
}

public static Object variable_global_array2_set(Object name, Object ind1, Object ind2, Object value)
{
return new Object();
}

public static Object variable_local_exists(Object name)
{
return new Object();
}

public static Object variable_local_get(Object name)
{
return new Object();
}

public static Object variable_local_array_get(Object name, Object ind)
{
return new Object();
}

public static Object variable_local_array2_get(Object name, Object ind1, Object ind2)
{
return new Object();
}

public static Object variable_local_set(Object name, Object value)
{
return new Object();
}

public static Object variable_local_array_set(Object name, Object ind, Object value)
{
return new Object();
}

public static Object variable_local_array2_set(Object name, Object ind1, Object ind2, Object value)
{
return new Object();
}

public static Object set_program_priority(Object priority)
{
return new Object();
}

/*
 * 
 * Keyboard
 * 
 */
public static Object keyboard_set_map(Object key1, Object key2)
{
return new Object();
}

public static Object keyboard_get_map(Object key)
{
return new Object();
}

public static Object keyboard_unset_map()
{
return new Object();
}

public static Object keyboard_check(Object key)
{
return new Object();
}

public static Object keyboard_check_pressed(Object key)
{
return new Object();
}

public static Object keyboard_check_released(Object key)
{
return new Object();
}

public static Object keyboard_check_direct(Object key)
{
return new Object();
}

public static Object keyboard_get_numlock()
{
return new Object();
}

public static Object keyboard_set_numlock(Object on)
{
return new Object();
}

public static Object keyboard_key_press(Object key)
{
return new Object();
}

public static Object keyboard_key_release(Object key)
{
return new Object();
}

public static Object keyboard_clear(Object key)
{
return new Object();
}

public static Object io_clear()
{
return new Object();
}

public static Object io_handle()
{
return new Object();
}

public static Object keyboard_wait()
{
return new Object();
}

/*
 * 
 * The mouse
 * 
 */
public static Object mouse_check_button(Object button)
{
return new Object();
}

public static Object mouse_check_button_pressed(Object button)
{
return new Object();
}

public static Object mouse_check_button_released(Object button)
{
return new Object();
}

public static Object mouse_clear(Object button)
{
return new Object();
}

public static Object mouse_wait()
{
return new Object();
}

/*
 * 
 * Joystick
 * 
 */
public static Object joystick_exists(Object id)
{
return new Object();
}

public static Object joystick_direction(Object id)
{
return new Object();
}

public static Object joystick_name(Object id)
{
return new Object();
}

public static Object joystick_axes(Object id)
{
return new Object();
}

public static Object joystick_buttons(Object id)
{
return new Object();
}

public static Object joystick_has_pov(Object id)
{
return new Object();
}

public static Object joystick_check_button(Object id, Object button)
{
return new Object();
}

public static Object joystick_xpos(Object id)
{
return new Object();
}

public static Object joystick_ypos(Object id)
{
return new Object();
}

public static Object joystick_zpos(Object id)
{
return new Object();
}

public static Object joystick_rpos(Object id)
{
return new Object();
}

public static Object joystick_upos(Object id)
{
return new Object();
}

public static Object joystick_vpos(Object id)
{
return new Object();
}

public static Object joystick_pov(Object id)
{
return new Object();
}

/*
 * 
 * Drawing Sprites and images
 * 
 */

public static Object draw_sprite(Object sprite, Object subimg, Object x, Object y)
{
    
    Game.Current.g2d.drawImage(((Sprite)sprite).imshow((int)subimg.getDouble()), null, (int)x.getDouble(), (int)y.getDouble());
return new Object();
}

public static Object draw_sprite_ext(Object sprite, Object subimg, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return new Object();
}

public static Object draw_sprite_stretched(Object sprite, Object subimg, Object x, Object y, Object w, Object h)
{
    Game.Current.g2d.drawImage(ImageUtil.resize(((Sprite)sprite).imshow((int)subimg.getDouble()),(int)w.getDouble(),(int)y.getDouble()), null, (int)x.getDouble(), (int)y.getDouble());
//((Sprite)sprite).imshow((int)subimg.getDouble()).
return new Object();
}

public static Object draw_sprite_stretched_ext(Object sprite, Object subimg, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return new Object();
}

public static Object draw_sprite_tiled(Object sprite, Object subimg, Object x, Object y)
{
return new Object();
}

public static Object draw_sprite_tiled_ext(Object sprite, Object subimg, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_sprite_part(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y)
{
return new Object();
}

public static Object draw_sprite_part_ext(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_sprite_general(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

public static Object draw_background(Object back, Object x, Object y)
{
return new Object();
}

public static Object draw_background_ext(Object back, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return new Object();
}

public static Object draw_background_stretched(Object back, Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object draw_background_stretched_ext(Object back, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return new Object();
}

public static Object draw_background_tiled(Object back, Object x, Object y)
{
return new Object();
}

public static Object draw_background_tiled_ext(Object back, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_background_part(Object back, Object left, Object top, Object width, Object height, Object x, Object y)
{
return new Object();
}

public static Object draw_background_part_ext(Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_background_general(Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

/*
 * 
 * Drawing shapes
 * 
 */
public static Object draw_clear(Object col)
{
    Game.Current.g2d.setColor( ((Color)col).c );
        Game.Current.g2d.fillRect( 0, 0, Game.Current.width, Game.Current.height );
return new Object();
}

public static Object draw_clear_alpha(Object col, Object alpha)
{
return new Object();
}

public static Object draw_point(Object x, Object y)
{
return new Object();
}

public static Object draw_line(Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

public static Object draw_rectangle(Object x1, Object y1, Object x2, Object y2, Object outline)
{
return new Object();
}

public static Object draw_roundrect(Object x1, Object y1, Object x2, Object y2, Object outline)
{
return new Object();
}

public static Object draw_triangle(Object x1, Object y1, Object x2, Object y2, Object x3, Object y3, Object outline)
{
return new Object();
}

public static Object draw_circle(Object x, Object y, Object r, Object outline)
{
return new Object();
}

public static Object draw_ellipse(Object x1, Object y1, Object x2, Object y2, Object outline)
{
    Draw.ellipse(x1.getDouble(), y1.getDouble(), x2.getDouble(), y2.getDouble(), outline.getBoolean());
return new Object();
}

public static Object draw_arrow(Object x1, Object y1, Object x2, Object y2, Object size)
{
return new Object();
}

public static Object draw_button(Object x1, Object y1, Object x2, Object y2, Object up)
{
return new Object();
}

public static Object draw_path(Object path, Object x, Object y, Object absolute)
{
return new Object();
}

public static Object draw_healthbar(Object x1, Object y1, Object x2, Object y2, Object amount, Object backcol, Object mincol, Object maxcol, Object direction, Object showback, Object showborder)
{
return new Object();
}

public static Object draw_getpixel(Object x, Object y)
{
return new Object();
}

public static Object draw_set_color(Object col)
{
return new Object();
}

public static Object draw_set_alpha(Object alpha)
{
return new Object();
}

public static Object draw_get_color()
{
return new Object();
}

public static Object draw_get_alpha()
{
return new Object();
}

public static Object make_color_rgb(Object red, Object green, Object blue)
{
return new Object();
}

public static Object make_color_hsv(Object hue, Object saturation, Object value)
{
return new Object();
}

public static Object color_get_red(Object col)
{
return new Object();
}

public static Object color_get_green(Object col)
{
return new Object();
}

public static Object color_get_blue(Object col)
{
return new Object();
}

public static Object color_get_hue(Object col)
{
return new Object();
}

public static Object color_get_saturation(Object col)
{
return new Object();
}

public static Object color_get_value(Object col)
{
return new Object();
}

public static Object merge_color(Object col1, Object col2, Object amount)
{
return new Object();
}

public static Object screen_save(Object fname)
{
return new Object();
}

public static Object screen_save_part(Object fname, Object x, Object y, Object w, Object h)
{
return new Object();
}


/*
 * 
 * Fonts and text
 * 
 */
public static Object draw_set_font(Object font)
{
return new Object();
}

public static Object draw_set_halign(Object halign)
{
return new Object();
}

public static Object draw_set_valign(Object valign)
{
return new Object();
}

public static Object draw_text(Object x, Object y, Object string)
{
return new Object();
}

public static Object draw_text_ext(Object x, Object y, Object string, Object sep, Object w)
{
return new Object();
}

public static Object string_width(Object string)
{
return new Object();
}

public static Object string_height(Object string)
{
return new Object();
}

public static Object string_width_ext(Object string, Object sep, Object w)
{
return new Object();
}

public static Object string_height_ext(Object string, Object sep, Object w)
{
return new Object();
}

public static Object draw_text_transformed(Object x, Object y, Object string, Object xscale, Object yscale, Object angle)
{
return new Object();
}

public static Object draw_text_ext_transformed(Object x, Object y, Object string, Object sep, Object w, Object xscale, Object yscale, Object angle)
{
return new Object();
}

public static Object draw_text_color(Object x, Object y, Object string, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

public static Object draw_text_ext_color(Object x, Object y, Object string, Object sep, Object w, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

public static Object draw_text_transformed_color(Object x, Object y, Object string, Object xscale, Object yscale, Object angle, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

public static Object draw_text_ext_transformed_color(Object x, Object y, Object string, Object sep, Object w, Object xscale, Object yscale, Object angle, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

/*
 * 
 * Advanced drawing functions
 * 
 */
public static Object draw_point_color(Object x, Object y, Object col1)
{
return new Object();
}

public static Object draw_line_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2)
{
return new Object();
}

public static Object draw_rectangle_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object col3, Object col4, Object outline)
{
return new Object();
}

public static Object draw_roundrect_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object outline)
{
return new Object();
}

public static Object draw_triangle_color(Object x1, Object y1, Object x2, Object y2, Object x3, Object y3, Object col1, Object col2, Object col3, Object outline)
{
return new Object();
}

public static Object draw_circle_color(Object x, Object y, Object r, Object col1, Object col2, Object outline)
{
return new Object();
}

public static Object draw_ellipse_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object outline)
{
return new Object();
}

public static Object draw_primitive_begin(Object kind)
{
return new Object();
}

public static Object draw_vertex(Object x, Object y)
{
return new Object();
}

public static Object draw_vertex_color(Object x, Object y, Object col, Object alpha)
{
return new Object();
}

public static Object draw_primitive_end()
{
return new Object();
}

public static Object sprite_get_texture(Object spr, Object subimg)
{
return new Object();
}

public static Object background_get_texture(Object back)
{
return new Object();
}

public static Object texture_preload(Object texid)
{
return new Object();
}

public static Object texture_set_priority(Object texid, Object prio)
{
return new Object();
}

public static Object texture_get_width(Object texid)
{
return new Object();
}

public static Object texture_get_height(Object texid)
{
return new Object();
}

public static Object draw_primitive_begin_texture(Object kind, Object texid)
{
return new Object();
}

public static Object draw_vertex_texture(Object x, Object y, Object xtex, Object ytex)
{
return new Object();
}

public static Object draw_vertex_texture_color(Object x, Object y, Object xtex, Object ytex, Object col, Object alpha)
{
return new Object();
}

public static Object texture_set_interpolation(Object linear)
{
return new Object();
}

public static Object texture_set_blending(Object blend)
{
return new Object();
}

public static Object texture_set_repeat(Object repeat)
{
return new Object();
}

public static Object draw_set_blend_mode(Object mode)
{
return new Object();
}

public static Object draw_set_blend_mode_ext(Object src, Object dest)
{
return new Object();
}

/*
 * 
 * Drawing Surfaces
 * 
 */
public static Object surface_create(Object w, Object h)
{
return new Object();
}

public static Object surface_free(Object id)
{
return new Object();
}

public static Object surface_exists(Object id)
{
return new Object();
}

public static Object surface_get_width(Object id)
{
return new Object();
}

public static Object surface_get_height(Object id)
{
return new Object();
}

public static Object surface_get_texture(Object id)
{
return new Object();
}

public static Object surface_set_target(Object id)
{
return new Object();
}

public static Object surface_reset_target()
{
return new Object();
}

public static Object draw_surface(Object id, Object x, Object y)
{
return new Object();
}

public static Object draw_surface_stretched(Object id, Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object draw_surface_tiled(Object id, Object x, Object y)
{
return new Object();
}

public static Object draw_surface_part(Object id, Object left, Object top, Object width, Object height, Object x, Object y)
{
return new Object();
}

public static Object draw_surface_ext(Object id, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return new Object();
}

public static Object draw_surface_stretched_ext(Object id, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return new Object();
}

public static Object draw_surface_tiled_ext(Object id, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_surface_part_ext(Object id, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return new Object();
}

public static Object draw_surface_general(Object id, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return new Object();
}

public static Object surface_getpixel(Object id, Object x, Object y)
{
return new Object();
}

public static Object surface_save(Object id, Object fname)
{
return new Object();
}

public static Object surface_save_part(Object id, Object fname, Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object surface_copy(Object destination, Object x, Object y, Object source)
{
return new Object();
}

public static Object surface_copy_part(Object destination, Object x, Object y, Object source, Object xs, Object ys, Object ws, Object hs)
{
return new Object();
}

/*
 * 
 * Tiles
 * 
 */
public static Object tile_add(Object background, Object left, Object top, Object width, Object height, Object x, Object y, Object depth)
{
return new Object();
}

public static Object tile_delete(Object id)
{
return new Object();
}

public static Object tile_exists(Object id)
{
return new Object();
}

public static Object tile_get_x(Object id)
{
return new Object();
}

public static Object tile_get_y(Object id)
{
return new Object();
}

public static Object tile_get_left(Object id)
{
return new Object();
}

public static Object tile_get_top(Object id)
{
return new Object();
}

public static Object tile_get_width(Object id)
{
return new Object();
}

public static Object tile_get_height(Object id)
{
return new Object();
}

public static Object tile_get_depth(Object id)
{
return new Object();
}

public static Object tile_get_visible(Object id)
{
return new Object();
}

public static Object tile_get_xscale(Object id)
{
return new Object();
}

public static Object tile_get_yscale(Object id)
{
return new Object();
}

public static Object tile_get_background(Object id)
{
return new Object();
}

public static Object tile_get_blend(Object id)
{
return new Object();
}

public static Object tile_get_alpha(Object id)
{
return new Object();
}

public static Object tile_set_position(Object id, Object x, Object y)
{
return new Object();
}

public static Object tile_set_region(Object id, Object left, Object right, Object width, Object height)
{
return new Object();
}

public static Object tile_set_background(Object id, Object background)
{
return new Object();
}

public static Object tile_set_visible(Object id, Object visible)
{
return new Object();
}

public static Object tile_set_depth(Object id, Object depth)
{
return new Object();
}

public static Object tile_set_scale(Object id, Object xscale, Object yscale)
{
return new Object();
}

public static Object tile_set_blend(Object id, Object color)
{
return new Object();
}

public static Object tile_set_alpha(Object id, Object alpha)
{
return new Object();
}

public static Object tile_layer_hide(Object depth)
{
return new Object();
}

public static Object tile_layer_show(Object depth)
{
return new Object();
}

public static Object tile_layer_delete(Object depth)
{
return new Object();
}

public static Object tile_layer_shift(Object depth, Object x, Object y)
{
return new Object();
}

public static Object tile_layer_find(Object depth, Object x, Object y)
{
return new Object();
}

public static Object tile_layer_delete_at(Object depth, Object x, Object y)
{
return new Object();
}

public static Object tile_layer_depth(Object depth, Object newdepth)
{
return new Object();
}

/*
 * 
 * The display
 * 
 */
public static Object display_get_width()
{
return new Double(Display.getWidth());
}

public static Object display_get_height()
{
return new Double(Display.getHeight());
}

public static Object display_get_colordepth()
{
return new Double(Display.getColordepth());
}

public static Object display_get_frequency()
{
return new Double(Display.getFrequency());
}

public static Object display_set_size(Object w, Object h)
{
return new Boolean(Display.setSize((int)w.getDouble(),(int) h.getDouble()));
}

public static Object display_set_colordepth(Object coldepth)
{
return new Object();
}

public static Object display_set_frequency(Object frequency)
{
return new Object();
}

public static Object display_set_all(Object w, Object h, Object frequency, Object coldepth)
{
return new Object();
}

public static Object display_test_all(Object w, Object h, Object frequency, Object coldepth)
{
return new Object();
}

public static Object display_reset()
{
return new Object();
}

public static Object display_mouse_get_x()
{
return new Object();
}

public static Object display_mouse_get_y()
{
return new Object();
}

public static Object display_mouse_set(Object x, Object y)
{
return new Object();
}

/*
 * 
 * The window
 * 
 */
public static Object window_set_visible(Object visible)
{
return new Object();
}

public static Object window_get_visible()
{
return new Object();
}

public static Object window_set_fullscreen(Object full)
{
return new Object();
}

public static Object window_get_fullscreen()
{
return new Object();
}

public static Object window_set_showborder(Object show)
{
return new Object();
}

public static Object window_get_showborder()
{
return new Object();
}

public static Object window_set_showicons(Object show)
{
return new Object();
}

public static Object window_get_showicons()
{
return new Object();
}

public static Object window_set_stayontop(Object stay)
{
return new Object();
}

public static Object window_get_stayontop()
{
return new Object();
}

public static Object window_set_sizeable(Object sizeable)
{
return new Object();
}

public static Object window_get_sizeable()
{
return new Object();
}

public static Object window_set_caption(Object caption)
{
return new Object();
}

public static Object window_get_caption()
{
return new Object();
}

public static Object window_set_cursor(Object curs)
{
return new Object();
}

public static Object window_get_cursor()
{
return new Object();
}

public static Object window_set_color(Object color)
{
return new Object();
}

public static Object window_get_color()
{
return new Object();
}

public static Object window_set_region_scale(Object scale, Object adaptwindow)
{
return new Object();
}

public static Object window_get_region_scale()
{
return new Object();
}

public static Object window_set_position(Object x, Object y)
{
return new Object();
}

public static Object window_set_size(Object w, Object h)
{
return new Object();
}

public static Object window_set_rectangle(Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object window_center()
{
return new Object();
}

public static Object window_default()
{
return new Object();
}

public static Object window_get_x()
{
return new Object();
}

public static Object window_get_y()
{
return new Object();
}

public static Object window_get_width()
{
return new Object();
}

public static Object window_get_height()
{
return new Object();
}

public static Object window_mouse_get_x()
{
return new Object();
}

public static Object window_mouse_get_y()
{
return new Object();
}

public static Object window_mouse_set(Object x, Object y)
{
return new Object();
}

/*
 * 
 * Views
 * 
 */
public static Object window_set_region_size(Object w, Object h, Object adaptwindow)
{
return new Object();
}

public static Object window_get_region_width()
{
return new Object();
}

public static Object window_get_region_height()
{
return new Object();
}

public static Object window_view_mouse_get_x(Object id)
{
return new Object();
}

public static Object window_view_mouse_get_y(Object id)
{
return new Object();
}

public static Object window_view_mouse_set(Object id, Object x, Object y)
{
return new Object();
}

public static Object window_views_mouse_get_x()
{
return new Object();
}

public static Object window_views_mouse_get_y()
{
return new Object();
}

public static Object window_views_mouse_set(Object x, Object y)
{
return new Object();
}

/*
 * 
 * Repainting the screen
 * 
 */
public static Object screen_redraw()
{
return new Object();
}

public static Object screen_refresh()
{
return new Object();
}

public static Object screen_wait_vsync()
{
return new Object();
}

public static Object set_automatic_draw(Object value)
{
return new Object();
}

public static Object set_synchronization(Object value)
{
return new Object();
}

/*
 *  
 * Basic sound functions
 * 
 */
public static Object sound_play(Object index)
{
return new Object();
}

public static Object sound_loop(Object index)
{
return new Object();
}

public static Object sound_stop(Object index)
{
return new Object();
}

public static Object sound_stop_all()
{
return new Object();
}

public static Object sound_isplaying(Object index)
{
return new Object();
}

public static Object sound_volume(Object index, Object value)
{
return new Object();
}

public static Object sound_global_volume(Object value)
{
return new Object();
}

public static Object sound_fade(Object index, Object value, Object time)
{
return new Object();
}

public static Object sound_pan(Object index, Object value)
{
return new Object();
}

public static Object sound_background_tempo(Object factor)
{
return new Object();
}

public static Object sound_set_search_directory(Object dir)
{
return new Object();
}

/*
 * 
 * Sound effects
 * 
 */
public static Object sound_effect_set(Object snd, Object effect)
{
return new Object();
}

public static Object sound_effect_chorus(Object snd, Object wetdry, Object depth, Object feedback, Object frequency, Object wave, Object delay, Object phase)
{
return new Object();
}

public static Object sound_effect_echo(Object snd, Object wetdry, Object feedback, Object leftdelay, Object rightdelay, Object pandelay)
{
return new Object();
}

public static Object sound_effect_flanger(Object snd, Object wetdry, Object depth, Object feedback, Object frequency, Object wave, Object delay, Object phase)
{
return new Object();
}

public static Object sound_effect_gargle(Object snd, Object rate, Object wave)
{
return new Object();
}

public static Object sound_effect_reverb(Object snd, Object gain, Object mix, Object time, Object ratio)
{
return new Object();
}

public static Object sound_effect_compressor(Object snd, Object gain, Object attack, Object release, Object threshold, Object ratio, Object delay)
{
return new Object();
}

public static Object sound_effect_equalizer(Object snd, Object center, Object bandwidth, Object gain)
{
return new Object();
}

/*
 * 
 * 3D sound
 * 
 */
public static Object sound_3d_set_sound_position(Object snd, Object x, Object y, Object z)
{
return new Object();
}

public static Object sound_3d_set_sound_velocity(Object snd, Object x, Object y, Object z)
{
return new Object();
}

public static Object sound_3d_set_sound_distance(Object snd, Object mindist, Object maxdist)
{
return new Object();
}

public static Object sound_3d_set_sound_cone(Object snd, Object x, Object y, Object z, Object anglein, Object angleout, Object voloutside)
{
return new Object();
}

/*
 * 
 * CD music
 * 
 */
public static Object cd_init()
{
return new Object();
}

public static Object cd_present()
{
return new Object();
}

public static Object cd_number()
{
return new Object();
}

public static Object cd_playing()
{
return new Object();
}

public static Object cd_paused()
{
return new Object();
}

public static Object cd_track()
{
return new Object();
}

public static Object cd_length()
{
return new Object();
}

public static Object cd_track_length(Object n)
{
return new Object();
}

public static Object cd_position()
{
return new Object();
}

public static Object cd_track_position()
{
return new Object();
}

public static Object cd_play(Object first, Object last)
{
return new Object();
}

public static Object cd_stop()
{
return new Object();
}

public static Object cd_pause()
{
return new Object();
}

public static Object cd_resume()
{
return new Object();
}

public static Object cd_set_position(Object pos)
{
return new Object();
}

public static Object cd_set_track_position(Object pos)
{
return new Object();
}

public static Object cd_open_door()
{
return new Object();
}

public static Object cd_close_door()
{
return new Object();
}

public static Object MCI_command(Object str)
{
return new Object();
}

/*
 * 
 * Splash screens
 * 
 */
public static Object show_image(Object fname, Object full, Object delay)
{
return new Object();
}

public static Object show_video(Object fname, Object full, Object loop)
{
return new Object();
}

public static Object show_text(Object fname, Object full, Object backcol, Object delay)
{
return new Object();
}

public static Object show_info()
{
return new Object();
}

public static Object load_info(Object fname)
{
return new Object();
}

/*
 * 
 * Pop-up messages and questions
 * 
 */
public static Object show_message(Object str)
{
    JOptionPane.showMessageDialog(org.gcreator.compilers.gjava.Game.canvas, str.toString());
return new Object();
}

public static Object show_message_ext(Object str, Object but1, Object but2, Object but3)
{
return new Object();
}

public static Object show_question(Object str)
{
return new Object();
}

public static Object get_integer(Object str, Object def)
{
return new Object();
}

public static Object get_string(Object str, Object def)
{
return new Object();
}

public static Object message_background(Object back)
{
return new Object();
}

public static Object message_button(Object sprite)
{
return new Object();
}

public static Object message_alpha(Object alpha)
{
return new Object();
}

public static Object message_text_font(Object name, Object size, Object color, Object style)
{
return new Object();
}

public static Object message_button_font(Object name, Object size, Object color, Object style)
{
return new Object();
}

public static Object message_input_font(Object name, Object size, Object color, Object style)
{
return new Object();
}

public static Object message_mouse_color(Object col)
{
return new Object();
}

public static Object message_input_color(Object col)
{
return new Object();
}

public static Object message_position(Object x, Object y)
{
return new Object();
}

public static Object message_size(Object w, Object h)
{
return new Object();
}

public static Object message_caption(Object show, Object str)
{
return new Object();
}

public static Object show_menu(Object str, Object def)
{
return new Object();
}

public static Object show_menu_pos(Object x, Object y, Object str, Object def)
{
return new Object();
}

public static Object get_color(Object defcol)
{
return new Object();
}

public static Object get_open_filename(Object filter, Object fname)
{
return new Object();
}

public static Object get_save_filename(Object filter, Object fname)
{
return new Object();
}

public static Object get_directory(Object dname)
{
return new Object();
}

public static Object get_directory_alt(Object capt, Object root)
{
return new Object();
}

public static Object show_error(Object str, Object abort)
{
return new Object();
}

/*
 * 
 * Highscore list
 * 
 */
public static Object highscore_show_ext(Object numb, Object back, Object border, Object col1, Object col2, Object name, Object size)
{
return new Object();
}

public static Object highscore_show(Object numb)
{
return new Object();
}

public static Object highscore_set_background(Object back)
{
return new Object();
}

public static Object highscore_set_border(Object show)
{
return new Object();
}

public static Object highscore_set_font(Object name, Object size, Object style)
{
return new Object();
}

public static Object highscore_set_strings(Object caption, Object nobody, Object escape)
{
return new Object();
}

public static Object highscore_set_colors(Object back, Object newc, Object other)
{
return new Object();
}

public static Object highscore_clear()
{
return new Object();
}

public static Object highscore_add(Object str, Object numb)
{
return new Object();
}

public static Object highscore_add_current()
{
return new Object();
}

public static Object highscore_value(Object place)
{
return new Object();
}

public static Object highscore_name(Object place)
{
return new Object();
}

public static Object draw_highscore(Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

/*
 * 
 * Sprites
 * 
 */
public static Object sprite_exists(Object ind)
{
return new Object();
}

public static Object sprite_get_name(Object ind)
{
return new Object();
}

public static Object sprite_get_number(Object ind)
{
return new Object();
}

public static Object sprite_get_width(Object ind)
{
return new Object();
}

public static Object sprite_get_height(Object ind)
{
return new Object();
}

public static Object sprite_get_transparent(Object ind)
{
return new Object();
}

public static Object sprite_get_smooth(Object ind)
{
return new Object();
}

public static Object sprite_get_preload(Object ind)
{
return new Object();
}

public static Object sprite_get_xoffset(Object ind)
{
return new Object();
}

public static Object sprite_get_yoffset(Object ind)
{
return new Object();
}

public static Object sprite_get_bbox_mode(Object ind)
{
return new Object();
}

public static Object sprite_get_bbox_left(Object ind)
{
return new Object();
}

public static Object sprite_get_bbox_right(Object ind)
{
return new Object();
}

public static Object sprite_get_bbox_top(Object ind)
{
return new Object();
}

public static Object sprite_get_bbox_bottom(Object ind)
{
return new Object();
}

public static Object sprite_get_precise(Object ind)
{
return new Object();
}

/*
 * 
 * Sounds
 * 
 */
public static Object sound_exists(Object ind)
{
return new Object();
}

public static Object sound_get_name(Object ind)
{
return new Object();
}

public static Object sound_get_kind(Object ind)
{
return new Object();
}

public static Object sound_get_preload(Object ind)
{
return new Object();
}

public static Object sound_discard(Object ind)
{
return new Object();
}

public static Object sound_restore(Object ind)
{
return new Object();
}

/*
 * 
 * Backgrounds
 * 
 */
public static Object background_exists(Object ind)
{
return new Object();
}

public static Object background_get_name(Object ind)
{
return new Object();
}

public static Object background_get_width(Object ind)
{
return new Object();
}

public static Object background_get_height(Object ind)
{
return new Object();
}

public static Object background_get_transparent(Object ind)
{
return new Object();
}

public static Object background_get_smooth(Object ind)
{
return new Object();
}

public static Object background_get_preload(Object ind)
{
return new Object();
}

/*
 * 
 * Fonts
 * 
 */
public static Object font_exists(Object ind)
{
return new Object();
}

public static Object font_get_name(Object ind)
{
return new Object();
}

public static Object font_get_fontname(Object ind)
{
return new Object();
}

public static Object font_get_bold(Object ind)
{
return new Object();
}

public static Object font_get_italic(Object ind)
{
return new Object();
}

public static Object font_get_first(Object ind)
{
return new Object();
}

public static Object font_get_last(Object ind)
{
return new Object();
}

/*
 * 
 * Paths
 * 
 */
public static Object path_exists(Object ind)
{
return new Object();
}

public static Object path_get_name(Object ind)
{
return new Object();
}

public static Object path_get_length(Object ind)
{
return new Object();
}

public static Object path_get_kind(Object ind)
{
return new Object();
}

public static Object path_get_closed(Object ind)
{
return new Object();
}

public static Object path_get_precision(Object ind)
{
return new Object();
}

public static Object path_get_number(Object ind)
{
return new Object();
}

public static Object path_get_point_x(Object ind, Object n)
{
return new Object();
}

public static Object path_get_point_y(Object ind, Object n)
{
return new Object();
}

public static Object path_get_point_speed(Object ind, Object n)
{
return new Object();
}

public static Object path_get_x(Object ind, Object pos)
{
return new Object();
}

public static Object path_get_y(Object ind, Object pos)
{
return new Object();
}

public static Object path_get_speed(Object ind, Object pos)
{
return new Object();
}


/*
 * 
 * Scripts
 * 
 */
public static Object script_exists(Object ind)
{
return new Object();
}

public static Object script_get_name(Object ind)
{
return new Object();
}

public static Object script_get_text(Object ind)
{
return new Object();
}

/*
 * 
 * Time lines
 * 
 */
public static Object timeline_exists(Object ind)
{
return new Object();
}

public static Object timeline_get_name(Object ind)
{
return new Object();
}

/*
 * 
 * Objects
 * 
 */
public static Object object_exists(Object ind)
{
return new Object();
}

public static Object object_get_name(Object ind)
{
return new Object();
}

public static Object object_get_sprite(Object ind)
{
return new Object();
}

public static Object object_get_solid(Object ind)
{
return new Object();
}

public static Object object_get_visible(Object ind)
{
return new Object();
}

public static Object object_get_depth(Object ind)
{
return new Object();
}

public static Object object_get_persistent(Object ind)
{
return new Object();
}

public static Object object_get_mask(Object ind)
{
return new Object();
}

public static Object object_get_parent(Object ind)
{
return new Object();
}

public static Object object_is_ancestor(Object ind1, Object ind2)
{
return new Object();
}

/*
 * 
 * Rooms
 * 
 */

public static Object room_exists(Object ind)
{
return new Object();
}

public static Object room_get_name(Object ind)
{
return new Object();
}

/*
 * 
 * Changing Sprites
 * 
 */
public static Object sprite_set_offset(Object ind, Object xoff, Object yoff)
{
return new Object();
}

public static Object sprite_set_bbox_mode(Object ind, Object mode)
{
return new Object();
}

public static Object sprite_set_bbox(Object ind, Object left, Object top, Object right, Object bottom)
{
return new Object();
}

public static Object sprite_set_precise(Object ind, Object mode)
{
return new Object();
}

public static Object sprite_duplicate(Object ind)
{
return new Object();
}

public static Object sprite_assign(Object ind, Object source)
{
return new Object();
}

public static Object sprite_merge(Object ind1, Object ind2)
{
return new Object();
}

public static Object sprite_add(Object fname, Object imgnumb, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return new Object();
}

public static Object sprite_replace(Object ind, Object fname, Object imgnumb, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return new Object();
}

public static Object sprite_create_from_screen(Object x, Object y, Object w, Object h, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return new Object();
}

public static Object sprite_add_from_screen(Object ind, Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object sprite_create_from_surface(Object id, Object x, Object y, Object w, Object h, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return new Object();
}

public static Object sprite_add_from_surface(Object ind, Object id, Object x, Object y, Object w, Object h)
{
return new Object();
}

public static Object sprite_delete(Object ind)
{
return new Object();
}

public static Object sprite_set_alpha_from_sprite(Object ind, Object spr)
{
return new Object();
}

/*
 * 
 * Changing Sounds
 * 
 */
public static Object sound_add(Object fname, Object kind, Object preload)
{
return new Object();
}

public static Object sound_replace(Object ind, Object fname, Object kind, Object preload)
{
return new Object();
}

public static Object sound_delete(Object ind)
{
return new Object();
}

/*
 * 
 * Changing Backgrounds
 * 
 */
public static Object background_duplicate(Object ind)
{
return new Object();
}

public static Object background_assign(Object ind, Object source)
{
return new Object();
}

public static Object background_add(Object fname, Object transparent, Object smooth, Object preload)
{
return new Object();
}

public static Object background_replace(Object ind, Object fname, Object transparent, Object smooth, Object preload)
{
return new Object();
}

public static Object background_create_color(Object w, Object h, Object col, Object preload)
{
return new Object();
}

public static Object background_create_gradient(Object w, Object h, Object col1, Object col2, Object kind, Object preload)
{
return new Object();
}

public static Object background_create_from_screen(Object x, Object y, Object w, Object h, Object transparent, Object smooth, Object preload)
{
return new Object();
}

public static Object background_create_from_surface(Object id, Object x, Object y, Object w, Object h, Object transparent, Object smooth, Object preload)
{
return new Object();
}

public static Object background_delete(Object ind)
{
return new Object();
}

public static Object background_set_alpha_from_background(Object ind, Object back)
{
return new Object();
}

/*
 * 
 * Changing Fonts
 * 
 */
public static Object font_add(Object name, Object size, Object bold, Object italic, Object first, Object last)
{
return new Object();
}

public static Object font_add_sprite(Object spr, Object first, Object prop, Object sep)
{
return new Object();
}

public static Object font_replace(Object ind, Object name, Object size, Object bold, Object italic, Object first, Object last)
{
return new Object();
}

public static Object font_replace_sprite(Object ind, Object spr, Object first, Object prop, Object sep)
{
return new Object();
}

public static Object font_delete(Object ind)
{
return new Object();
}

/*
 * 
 * Changing Paths
 * 
 */
public static Object path_set_kind(Object ind, Object kind)
{
return new Object();
}

public static Object path_set_closed(Object ind, Object closed)
{
return new Object();
}

public static Object path_set_precision(Object ind, Object prec)
{
return new Object();
}

public static Object path_add()
{
return new Object();
}

public static Object path_assign(Object ind, Object path)
{
return new Object();
}

public static Object path_duplicate(Object ind)
{
return new Object();
}

public static Object path_append(Object ind, Object path)
{
return new Object();
}

public static Object path_delete(Object ind)
{
return new Object();
}

public static Object path_add_point(Object ind, Object x, Object y, Object speed)
{
return new Object();
}

public static Object path_insert_point(Object ind, Object n, Object x, Object y, Object speed)
{
return new Object();
}

public static Object path_change_point(Object ind, Object n, Object x, Object y, Object speed)
{
return new Object();
}

public static Object path_delete_point(Object ind, Object n)
{
return new Object();
}

public static Object path_clear_points(Object ind)
{
return new Object();
}

public static Object path_reverse(Object ind)
{
return new Object();
}

public static Object path_mirror(Object ind)
{
return new Object();
}

public static Object path_flip(Object ind)
{
return new Object();
}

public static Object path_rotate(Object ind, Object angle)
{
return new Object();
}

public static Object path_scale(Object ind, Object xscale, Object yscale)
{
return new Object();
}

public static Object path_shift(Object ind, Object xshift, Object yshift)
{
return new Object();
}

/*
 * 
 * Changing Scripts
 * 
 */

public static Object execute_string(Object str)
{
return new Object();
}

public static Object execute_file(Object fname)
{
return new Object();
}

public static Object script_execute(Object ind, Object arg0, Object arg1)
{
return new Object();
}

/*
 * 
 * Changing Time lines
 * 
 */

public static Object timeline_add()
{
return new Object();
}

public static Object timeline_delete(Object ind)
{
return new Object();
}

public static Object timeline_moment_clear(Object ind, Object step)
{
return new Object();
}

public static Object timeline_moment_add(Object ind, Object step, Object codestr)
{
return new Object();
}

/*
 * 
 * Changing Objects
 * 
 */
public static Object object_set_sprite(Object ind, Object spr)
{
return new Object();
}

public static Object object_set_solid(Object ind, Object solid)
{
return new Object();
}

public static Object object_set_visible(Object ind, Object vis)
{
return new Object();
}

public static Object object_set_depth(Object ind, Object depth)
{
return new Object();
}

public static Object object_set_persistent(Object ind, Object pers)
{
return new Object();
}

public static Object object_set_mask(Object ind, Object spr)
{
return new Object();
}

public static Object object_set_parent(Object ind, Object obj)
{
return new Object();
}

public static Object object_add()
{
return new Object();
}

public static Object object_delete(Object ind)
{
return new Object();
}

public static Object object_event_clear(Object ind, Object evtype, Object evnumb)
{
return new Object();
}

public static Object object_event_add(Object ind, Object evtype, Object evnumb, Object codestr)
{
return new Object();
}

/*
 * 
 * Changing rooms
 * 
 */
public static Object room_set_width(Object ind, Object w)
{
return new Object();
}

public static Object room_set_height(Object ind, Object h)
{
return new Object();
}

public static Object room_set_caption(Object ind, Object str)
{
return new Object();
}

public static Object room_set_persistent(Object ind, Object pers)
{
return new Object();
}

public static Object room_set_code(Object ind, Object codestr)
{
return new Object();
}

public static Object room_set_background_color(Object ind, Object col, Object show)
{
return new Object();
}

public static Object room_set_background(Object ind, Object bind, Object vis, Object fore, Object back, Object x, Object y, Object htiled, Object vtiled, Object hspeed, Object vspeed, Object alpha)
{
return new Object();
}

public static Object room_set_view(Object ind, Object vind, Object vis, Object xview, Object yview, Object wview, Object hview, Object xport, Object yport, Object wport, Object hport, Object hborder, Object vborder, Object hspeed, Object vspeed, Object obj)
{
return new Object();
}

public static Object room_set_view_enabled(Object ind, Object val)
{
return new Object();
}

public static Object room_add()
{
return new Object();
}

public static Object room_duplicate(Object ind)
{
return new Object();
}

public static Object room_assign(Object ind, Object source)
{
return new Object();
}

public static Object room_instance_add(Object ind, Object x, Object y, Object obj)
{
return new Object();
}

public static Object room_instance_clear(Object ind)
{
return new Object();
}

public static Object room_tile_add(Object ind, Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object depth)
{
return new Object();
}

public static Object room_tile_add_ext(Object ind, Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object depth, Object xscale, Object yscale, Object alpha)
{
return new Object();
}

public static Object room_tile_clear(Object ind)
{
return new Object();
}

/*
 * 
 * Files
 * 
 */
public static Object file_text_open_read(Object fname)
{
File f = new File();
    f.open(fname.getString(), 1);
    return f;
}

public static Object file_text_open_write(Object fname)
{
    File f = new File();
    f.open(fname.getString(), 0);
    return f;
}

public static Object file_text_open_append(Object fname)
{
File f = new File();
    f.openAppend(fname.getString());
    return f;
}

public static Object file_text_close(Object file)
{
    if (file instanceof File)
    {
        ((File)file).close();
    }
return new Object();
}

public static Object file_text_write_string(Object file, Object str)
{
    if (file instanceof File)
    {
        ((File)file).writeString(str.getString());
    }
return new Object();
}

public static Object file_text_write_real(Object file, Object val)
{
    if (file instanceof File)
    {
        ((File)file).writeDouble(val.getDouble());
    }
return new Object();
}

public static Object file_text_writeln(Object file)
{
    if (file instanceof File)
    {
        ((File)file).newLine();
    }
return new Object();
}

public static Object file_text_read_string(Object file)
{
    String str = new String("");
    if (file instanceof File)
    {
      str =  ((File)file).readString();
    }
return str;
}

public static Object file_text_read_real(Object file)
{
return new Object();
}

public static Object file_text_readln(Object file)
{
return new Object();
}

public static Object file_text_eof(Object file)
{
return new Object();
}

public static Object file_exists(Object fname)
{
return new Object();
}

public static Object file_delete(Object fname)
{
return new Object();
}

public static Object file_rename(Object oldname, Object newname)
{
return new Object();
}

public static Object file_copy(Object fname, Object newname)
{
return new Object();
}

public static Object directory_exists(Object dname)
{
return new Object();
}

public static Object directory_create(Object dname)
{
return new Object();
}

public static Object file_find_first(Object mask, Object attr)
{
return new Object();
}

public static Object file_find_next()
{
return new Object();
}

public static Object file_find_close()
{
return new Object();
}

public static Object file_attributes(Object fname, Object attr)
{
return new Object();
}

public static Object filename_name(Object fname)
{
return new Object();
}

public static Object filename_path(Object fname)
{
return new Object();
}

public static Object filename_dir(Object fname)
{
return new Object();
}

public static Object filename_drive(Object fname)
{
return new Object();
}

public static Object filename_ext(Object fname)
{
return new Object();
}

public static Object filename_change_ext(Object fname, Object newext)
{
return new Object();
}

public static Object file_bin_open(Object fname, Object mode)
{
return new Object();
}

public static Object file_bin_rewrite(Object file)
{
return new Object();
}

public static Object file_bin_close(Object file)
{
return new Object();
}

public static Object file_bin_position(Object file)
{
return new Object();
}

public static Object file_bin_size(Object file)
{
return new Object();
}

public static Object file_bin_seek(Object file, Object pos)
{
return new Object();
}

public static Object file_bin_write_byte(Object file, Object BYTE)
{
return new Object();
}

public static Object file_bin_read_byte(Object file)
{
return new Object();
}

public static Object parameter_count()
{
return new Object();
}

public static Object parameter_string(Object n)
{
return new Object();
}

public static Object environment_get_variable(Object name)
{
return new Object();
}

/*
 * 
 * Registry
 * 
 */
public static Object registry_write_string(Object name, Object str)
{
return new Object();
}

public static Object registry_write_real(Object name, Object value)
{
return new Object();
}

public static Object registry_read_string(Object name)
{
return new Object();
}

public static Object registry_read_real(Object name)
{
return new Object();
}

public static Object registry_exists(Object name)
{
return new Object();
}

public static Object registry_write_string_ext(Object key, Object name, Object str)
{
return new Object();
}

public static Object registry_write_real_ext(Object key, Object name, Object value)
{
return new Object();
}

public static Object registry_read_string_ext(Object key, Object name)
{
return new Object();
}

public static Object registry_read_real_ext(Object key, Object name)
{
return new Object();
}

public static Object registry_exists_ext(Object key, Object name)
{
return new Object();
}

public static Object registry_set_root(Object root)
{
return new Object();
}

/*
 * 
 * Ini files
 * 
 */
public static Object ini_open(Object fname)
{
return new Object();
}

public static Object ini_close()
{
return new Object();
}

public static Object ini_read_string(Object section, Object key, Object DEFAULT)
{
return new Object();
}

public static Object ini_read_real(Object section, Object key, Object DEFAULT)
{
return new Object();
}

public static Object ini_write_string(Object section, Object key, Object str)
{
return new Object();
}

public static Object ini_write_real(Object section, Object key, Object value)
{
return new Object();
}

public static Object ini_key_exists(Object section, Object key)
{
return new Object();
}

public static Object ini_section_exists(Object section)
{
return new Object();
}

public static Object ini_key_delete(Object section, Object key)
{
return new Object();
}

public static Object ini_section_delete(Object section)
{
return new Object();
}

/*
 * 
 * Executing programs
 * 
 */
public static Object execute_program(Object prog, Object arg, Object wait)
{
    Main.execute_program(""+prog.getString(), ""+arg.getString(), wait.getBoolean());
return new Object();
}

public static Object execute_shell(Object prog, Object arg)
{
    Main.execute_shell(""+prog, ""+arg);
return new Object();
}

/*
 * Data Structures
 */
public static Object ds_set_precision(Object prec)
{
return new Object();
}

/*
 * 
 * Stacks
 * 
 */
public static Object ds_stack_create()
{
return new Stack();
}

public static Object ds_stack_destroy(Object id)
{
    if (id instanceof Stack)
    {
      ((Stack)id).destroy();
    }
return new Object();
}

public static Object ds_stack_clear(Object id)
{
    if (id instanceof Stack)
    {
      ((Stack)id).clear();
    }
return new Object();
}

public static Object ds_stack_size(Object id)
{
     if (id instanceof Stack)
    {
     return new Integer(((Stack)id).size());
    }
return new Object();
}

public static Object ds_stack_empty(Object id)
{
    if (id instanceof Stack)
    {
     return new Boolean(((Stack)id).empty());
    }
return new Object();
}

public static Object ds_stack_push(Object id, Object value)
{
    if (id instanceof Stack)
    {
     ((Stack)id).push(value);
    }
return new Object();
}

public static Object ds_stack_pop(Object id)
{
    if (id instanceof Stack)
    {
     return ((Stack)id).pop();
    }
return new Object();
}

public static Object ds_stack_top(Object id)
{
     if (id instanceof Stack)
    {
     return ((Stack)id).top();
    }
return new Object();
}

/*
 * 
 * Queues
 * 
 */
public static Object ds_queue_create()
{
    
return new Queue();
}

public static Object ds_queue_destroy(Object id)
{
     if (id instanceof Queue)
    {
     ((Queue)id).destroy();
    }
return new Object();
}

public static Object ds_queue_clear(Object id)
{
    if (id instanceof Queue)
    {
     ((Queue)id).clear();
    }
return new Object();
}

public static Object ds_queue_size(Object id)
{
    if (id instanceof Queue)
    {
    return new Integer(((Queue)id).size());
    }
return new Object();
}

public static Object ds_queue_empty(Object id)
{
    if (id instanceof Queue)
    {
    return new Boolean(((Queue)id).empty());
    }
return new Object();
}

public static Object ds_queue_enqueue(Object id, Object value)
{
    if (id instanceof Queue)
    {
    ((Queue)id).enqueue(value);
    }
return new Object();
}

public static Object ds_queue_dequeue(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).dequeue();
    }
return new Object();
}

public static Object ds_queue_head(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).head();
    }
return new Object();
}

public static Object ds_queue_tail(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).tail();
    }
return new Object();
}

/*
 * 
 * Lists
 * 
 */
public static Object ds_list_create()
{
return new Object();
}

public static Object ds_list_destroy(Object id)
{
return new Object();
}

public static Object ds_list_clear(Object id)
{
return new Object();
}

public static Object ds_list_size(Object id)
{
return new Object();
}

public static Object ds_list_empty(Object id)
{
return new Object();
}

public static Object ds_list_add(Object id, Object value)
{
return new Object();
}

public static Object ds_list_insert(Object id, Object pos, Object value)
{
return new Object();
}

public static Object ds_list_replace(Object id, Object pos, Object value)
{
return new Object();
}

public static Object ds_list_delete(Object id, Object pos)
{
return new Object();
}

public static Object ds_list_find_index(Object id, Object value)
{
return new Object();
}

public static Object ds_list_find_value(Object id, Object pos)
{
return new Object();
}

public static Object ds_list_sort(Object id, Object ascending)
{
return new Object();
}

/*
 * 
 * Maps
 * 
 */
public static Object ds_map_create()
{
return new Object();
}

public static Object ds_map_destroy(Object id)
{
return new Object();
}

public static Object ds_map_clear(Object id)
{
return new Object();
}

public static Object ds_map_size(Object id)
{
return new Object();
}

public static Object ds_map_empty(Object id)
{
return new Object();
}

public static Object ds_map_add(Object id, Object key, Object value)
{
return new Object();
}

public static Object ds_map_replace(Object id, Object key, Object value)
{
return new Object();
}

public static Object ds_map_delete(Object id, Object key)
{
return new Object();
}

public static Object ds_map_exists(Object id, Object key)
{
return new Object();
}

public static Object ds_map_find_value(Object id, Object key)
{
return new Object();
}

public static Object ds_map_find_previous(Object id, Object key)
{
return new Object();
}

public static Object ds_map_find_next(Object id, Object key)
{
return new Object();
}

public static Object ds_map_find_first(Object id)
{
return new Object();
}

public static Object ds_map_find_last(Object id)
{
return new Object();
}

/*
 * 
 * Priority queues
 * 
 */
public static Object ds_priority_create()
{
return new Object();
}

public static Object ds_priority_destroy(Object id)
{
return new Object();
}

public static Object ds_priority_clear(Object id)
{
return new Object();
}

public static Object ds_priority_size(Object id)
{
return new Object();
}

public static Object ds_priority_empty(Object id)
{
return new Object();
}

public static Object ds_priority_add(Object id, Object value, Object priority)
{
return new Object();
}

public static Object ds_priority_change_priority(Object id, Object value, Object priority)
{
return new Object();
}

public static Object ds_priority_find_priority(Object id, Object value)
{
return new Object();
}

public static Object ds_priority_delete_value(Object id, Object value)
{
return new Object();
}

public static Object ds_priority_delete_min(Object id)
{
return new Object();
}

public static Object ds_priority_find_min(Object id)
{
return new Object();
}

public static Object ds_priority_delete_max(Object id)
{
return new Object();
}

public static Object ds_priority_find_max(Object id)
{
return new Object();
}

/*
 * 
 * Grids
 * 
 */
public static Object ds_grid_create(Object w, Object h)
{
return new Object();
}

public static Object ds_grid_destroy(Object id)
{
return new Object();
}

public static Object ds_grid_resize(Object id, Object w, Object h)
{
return new Object();
}

public static Object ds_grid_width(Object id)
{
return new Object();
}

public static Object ds_grid_height(Object id)
{
return new Object();
}

public static Object ds_grid_clear(Object id, Object val)
{
return new Object();
}

public static Object ds_grid_set(Object id, Object x, Object y, Object val)
{
return new Object();
}

public static Object ds_grid_add(Object id, Object x, Object y, Object val)
{
return new Object();
}

public static Object ds_grid_multiply(Object id, Object x, Object y, Object val)
{
return new Object();
}

public static Object ds_grid_set_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_add_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_multiply_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_set_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

public static Object ds_grid_add_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

public static Object ds_grid_multiply_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

public static Object ds_grid_get(Object id, Object x, Object y)
{
return new Object();
}

public static Object ds_grid_get_sum(Object id, Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

public static Object ds_grid_get_max(Object id, Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

public static Object ds_grid_get_min(Object id, Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

public static Object ds_grid_get_mean(Object id, Object x1, Object y1, Object x2, Object y2)
{
return new Object();
}

public static Object ds_grid_get_disk_sum(Object id, Object xm, Object ym, Object r)
{
return new Object();
}

public static Object ds_grid_get_disk_min(Object id, Object xm, Object ym, Object r)
{
return new Object();
}

public static Object ds_grid_get_disk_max(Object id, Object xm, Object ym, Object r)
{
return new Object();
}

public static Object ds_grid_get_disk_mean(Object id, Object xm, Object ym, Object r)
{
return new Object();
}

public static Object ds_grid_value_exists(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_value_x(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_value_y(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return new Object();
}

public static Object ds_grid_value_disk_exists(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

public static Object ds_grid_value_disk_x(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

public static Object ds_grid_value_disk_y(Object id, Object xm, Object ym, Object r, Object val)
{
return new Object();
}

/*
 * 
 * Simple Effects
 * 
 */
public static Object effect_create_below(Object kind, Object x, Object y, Object size, Object color)
{
return new Object();
}

public static Object effect_create_above(Object kind, Object x, Object y, Object size, Object color)
{
return new Object();
}

public static Object effect_clear()
{
return new Object();
}

/*
 * 
 * Particle types
 * 
 */
public static Object part_type_create()
{
return new Object();
}

public static Object part_type_destroy(Object ind)
{
return new Object();
}

public static Object part_type_exists(Object ind)
{
return new Object();
}

public static Object part_type_clear(Object ind)
{
return new Object();
}

public static Object part_type_shape(Object ind, Object shape)
{
return new Object();
}

public static Object part_type_sprite(Object ind, Object sprite, Object animat, Object stretch, Object random)
{
return new Object();
}

public static Object part_type_size(Object ind, Object size_min, Object size_max, Object size_incr, Object size_wiggle)
{
return new Object();
}

public static Object part_type_scale(Object ind, Object xscale, Object yscale)
{
return new Object();
}

public static Object part_type_orientation(Object ind, Object ang_min, Object ang_max, Object ang_incr, Object ang_wiggle, Object ang_relative)
{
return new Object();
}

public static Object part_type_life(Object ind, Object life_min, Object life_max)
{
return new Object();
}

public static Object part_type_step(Object ind, Object step_number, Object step_type)
{
return new Object();
}

public static Object part_type_death(Object ind, Object death_number, Object death_type)
{
return new Object();
}

public static Object part_type_speed(Object ind, Object speed_min, Object speed_max, Object speed_incr, Object speed_wiggle)
{
return new Object();
}

public static Object part_type_direction(Object ind, Object dir_min, Object dir_max, Object dir_incr, Object dir_wiggle)
{
return new Object();
}

public static Object part_type_gravity(Object ind, Object grav_amount, Object grav_dir)
{
return new Object();
}

public static Object part_type_color1(Object ind, Object color1)
{
return new Object();
}

public static Object part_type_color2(Object ind, Object color1, Object color2)
{
return new Object();
}

public static Object part_type_color3(Object ind, Object color1, Object color2, Object color3)
{
return new Object();
}

public static Object part_type_color_mix(Object ind, Object color1, Object color2)
{
return new Object();
}

public static Object part_type_color_rgb(Object ind, Object rmin, Object rmax, Object gmin, Object gmax, Object bmin, Object bmax)
{
return new Object();
}

public static Object part_type_color_hsv(Object ind, Object hmin, Object hmax, Object smin, Object smax, Object vmin, Object vmax)
{
return new Object();
}

public static Object part_type_alpha1(Object ind, Object alpha1)
{
return new Object();
}

public static Object part_type_alpha2(Object ind, Object alpha1, Object alpha2)
{
return new Object();
}

public static Object part_type_alpha3(Object ind, Object alpha1, Object alpha2, Object alpha3)
{
return new Object();
}

public static Object part_type_blend(Object ind, Object additive)
{
return new Object();
}

/*
 * 
 * Particle systems
 * 
 */

public static Object part_system_create()
{
return new Object();
}

public static Object part_system_destroy(Object ind)
{
return new Object();
}

public static Object part_system_exists(Object ind)
{
return new Object();
}

public static Object part_system_clear(Object ind)
{
return new Object();
}

public static Object part_system_draw_order(Object ind, Object oldtonew)
{
return new Object();
}

public static Object part_system_depth(Object ind, Object depth)
{
return new Object();
}

public static Object part_system_position(Object ind, Object x, Object y)
{
return new Object();
}

public static Object part_system_automatic_update(Object ind, Object automatic)
{
return new Object();
}

public static Object part_system_automatic_draw(Object ind, Object draw)
{
return new Object();
}

public static Object part_system_update(Object ind)
{
return new Object();
}

public static Object part_system_drawit(Object ind)
{
return new Object();
}

public static Object part_particles_create(Object ind, Object x, Object y, Object parttype, Object number)
{
return new Object();
}

public static Object part_particles_create_color(Object ind, Object x, Object y, Object parttype, Object color, Object number)
{
return new Object();
}

public static Object part_particles_clear(Object ind)
{
return new Object();
}

public static Object part_particles_count(Object ind)
{
return new Object();
}



/*
 * 
 * Emitters
 * 
 */
public static Object part_emitter_create(Object ps)
{
return new Object();
}

public static Object part_emitter_destroy(Object ps, Object ind)
{
return new Object();
}

public static Object part_emitter_destroy_all(Object ps)
{
return new Object();
}

public static Object part_emitter_exists(Object ps, Object ind)
{
return new Object();
}

public static Object part_emitter_clear(Object ps, Object ind)
{
return new Object();
}

public static Object part_emitter_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape, Object distribution)
{
return new Object();
}

public static Object part_emitter_burst(Object ps, Object ind, Object parttype, Object number)
{
return new Object();
}

public static Object part_emitter_stream(Object ps, Object ind, Object parttype, Object number)
{
return new Object();
}

/*
 * 
 * Attractors
 * 
 */
public static Object part_attractor_create(Object ps)
{
return new Object();
}

public static Object part_attractor_destroy(Object ps, Object ind)
{
return new Object();
}

public static Object part_attractor_destroy_all(Object ps)
{
return new Object();
}

public static Object part_attractor_exists(Object ps, Object ind)
{
return new Object();
}

public static Object part_attractor_clear(Object ps, Object ind)
{
return new Object();
}

public static Object part_attractor_position(Object ps, Object ind, Object x, Object y)
{
return new Object();
}

public static Object part_attractor_force(Object ps, Object ind, Object force, Object dist, Object kind, Object additive)
{
return new Object();
}

/*
 * 
 * Destroyers
 * 
 */
public static Object part_destroyer_create(Object ps)
{
return new Object();
}

public static Object part_destroyer_destroy(Object ps, Object ind)
{
return new Object();
}

public static Object part_destroyer_destroy_all(Object ps)
{
return new Object();
}

public static Object part_destroyer_exists(Object ps, Object ind)
{
return new Object();
}

public static Object part_destroyer_clear(Object ps, Object ind)
{
return new Object();
}

public static Object part_destroyer_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape)
{
return new Object();
}

/*
 * 
 * Deflectors
 * 
 */
public static Object part_deflector_create(Object ps)
{
return new Object();
}

public static Object part_deflector_destroy(Object ps, Object ind)
{
return new Object();
}

public static Object part_deflector_destroy_all(Object ps)
{
return new Object();
}

public static Object part_deflector_exists(Object ps, Object ind)
{
return new Object();
}

public static Object part_deflector_clear(Object ps, Object ind)
{
return new Object();
}

public static Object part_deflector_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax)
{
return new Object();
}

public static Object part_deflector_kind(Object ps, Object ind, Object kind)
{
return new Object();
}

public static Object part_deflector_friction(Object ps, Object ind, Object amount)
{
return new Object();
}

/*
 * 
 * Changers
 * 
 */
public static Object part_changer_create(Object ps)
{
return new Object();
}

public static Object part_changer_destroy(Object ps, Object ind)
{
return new Object();
}

public static Object part_changer_destroy_all(Object ps)
{
return new Object();
}

public static Object part_changer_exists(Object ps, Object ind)
{
return new Object();
}

public static Object part_changer_clear(Object ps, Object ind)
{
return new Object();
}

public static Object part_changer_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape)
{
return new Object();
}

public static Object part_changer_kind(Object ps, Object ind, Object kind)
{
return new Object();
}

public static Object part_changer_types(Object ps, Object ind, Object parttype1, Object parttype2)
{
return new Object();
}

/*
 * 
 * Setting up a connection
 * 
 */
public static Object mplay_init_ipx()
{
return new Object();
}

public static Object mplay_init_tcpip(Object addrstring)
{
return new Object();
}

public static Object mplay_init_modem(Object initstr, Object phonenr)
{
return new Object();
}

public static Object mplay_init_serial(Object portno, Object baudrate, Object stopbits, Object parity, Object flow)
{
return new Object();
}

public static Object mplay_connect_status()
{
return new Object();
}

public static Object mplay_end()
{
return new Object();
}

public static Object mplay_ipaddress()
{
    try{
        java.net.InetAddress i = java.net.InetAddress.getLocalHost();
        
   return new String(i.getHostAddress()); // IP address only
        } catch(Exception e){
        System.out.println(""+e.getMessage());}
return new Object();
}

/*
 * 
 * Creating and joining sessions
 * 
 */
public static Object mplay_session_mode(Object move)
{
return new Object();
}

public static Object mplay_session_create(Object sesname, Object playnumb, Object playername)
{
return new Object();
}

public static Object mplay_session_find()
{
return new Object();
}

public static Object mplay_session_name(Object numb)
{
return new Object();
}

public static Object mplay_session_join(Object numb, Object playername)
{
return new Object();
}

public static Object mplay_session_status()
{
return new Object();
}

public static Object mplay_session_end()
{
return new Object();
}

/*
 * 
 * Players
 * 
 */
public static Object mplay_player_find()
{
return new Object();
}

public static Object mplay_player_name(Object numb)
{
return new Object();
}

public static Object mplay_player_id(Object numb)
{
return new Object();
}

/*
 * 
 * Shared data
 * 
 */
public static Object mplay_data_write(Object ind, Object value)
{
return new Object();
}

public static Object mplay_data_read(Object ind)
{
return new Object();
}

public static Object mplay_data_mode(Object guaranteed)
{
return new Object();
}

/*
 * 
 * Messages
 * 
 */
public static Object mplay_message_send(Object player, Object id, Object val)
{
return new Object();
}

public static Object mplay_message_send_guaranteed(Object player, Object id, Object val)
{
return new Object();
}

public static Object mplay_message_receive(Object player)
{
return new Object();
}

public static Object mplay_message_id()
{
return new Object();
}

public static Object mplay_message_value()
{
return new Object();
}

public static Object mplay_message_player()
{
return new Object();
}

public static Object mplay_message_name()
{
return new Object();
}

public static Object mplay_message_count(Object player)
{
return new Object();
}

public static Object mplay_message_clear(Object player)
{
return new Object();
}

/*
 * 
 * Using DLL's
 * 
 */
public static Object external_call(Object id, Object arg1, Object arg2)
{
return new Object();
}

public static Object external_define(Object dll, Object name, Object calltype, Object restype, Object argnumb, Object arg1type, Object arg2type)
{
return new Object();
}

public static Object external_free(Object dllname)
{
return new Object();
}

public static Object window_handle()
{
return new Object();
}

/*
 * 
 * Going to 3D mode
 * 
 */
public static Object d3d_start()
{
return new Object();
}

public static Object d3d_end()
{
return new Object();
}

public static Object d3d_set_hidden(Object enable)
{
return new Object();
}

public static Object d3d_set_perspective(Object enable)
{
return new Object();
}

public static Object d3d_set_depth(Object depth)
{
return new Object();
}

public static Object d3d_primitive_begin(Object kind)
{
return new Object();
}

public static Object d3d_vertex(Object x, Object y, Object z)
{
return new Object();
}

public static Object d3d_vertex_color(Object x, Object y, Object z, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_primitive_end()
{
return new Object();
}

public static Object d3d_primitive_begin_texture(Object kind, Object texid)
{
return new Object();
}

public static Object d3d_vertex_texture(Object x, Object y, Object z, Object xtex, Object ytex)
{
return new Object();
}

public static Object d3d_vertex_texture_color(Object x, Object y, Object z, Object xtex, Object ytex, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_draw_block(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return new Object();
}

public static Object d3d_draw_cylinder(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return new Object();
}

public static Object d3d_draw_cone(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return new Object();
}

public static Object d3d_draw_ellipsoid(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object steps)
{
return new Object();
}

public static Object d3d_draw_wall(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return new Object();
}

public static Object d3d_draw_floor(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return new Object();
}

public static Object d3d_set_projection(Object xfrom, Object yfrom, Object zfrom, Object xto, Object yto, Object zto, Object xup, Object yup, Object zup)
{
return new Object();
}

public static Object d3d_set_projection_ext(Object xfrom, Object yfrom, Object zfrom, Object xto, Object yto, Object zto, Object xup, Object yup, Object zup, Object angle, Object aspect, Object znear, Object zfar)
{
return new Object();
}

public static Object d3d_set_projection_ortho(Object x, Object y, Object w, Object h, Object angle)
{
return new Object();
}

public static Object d3d_set_projection_perspective(Object x, Object y, Object w, Object h, Object angle)
{
return new Object();
}

public static Object d3d_transform_set_identity()
{
return new Object();
}

public static Object d3d_transform_set_translation(Object xt, Object yt, Object zt)
{
return new Object();
}

public static Object d3d_transform_set_scaling(Object xs, Object ys, Object zs)
{
return new Object();
}

public static Object d3d_transform_set_rotation_x(Object angle)
{
return new Object();
}

public static Object d3d_transform_set_rotation_y(Object angle)
{
return new Object();
}

public static Object d3d_transform_set_rotation_z(Object angle)
{
return new Object();
}

public static Object d3d_transform_set_rotation_axis(Object xa, Object ya, Object za, Object angle)
{
return new Object();
}

public static Object d3d_transform_add_translation(Object xt, Object yt, Object zt)
{
return new Object();
}

public static Object d3d_transform_add_scaling(Object xs, Object ys, Object zs)
{
return new Object();
}

public static Object d3d_transform_add_rotation_x(Object angle)
{
return new Object();
}

public static Object d3d_transform_add_rotation_y(Object angle)
{
return new Object();
}

public static Object d3d_transform_add_rotation_z(Object angle)
{
return new Object();
}

public static Object d3d_transform_add_rotation_axis(Object xa, Object ya, Object za, Object angle)
{
return new Object();
}

public static Object d3d_transform_stack_clear()
{
return new Object();
}

public static Object d3d_transform_stack_empty()
{
return new Object();
}

public static Object d3d_transform_stack_push()
{
return new Object();
}

public static Object d3d_transform_stack_pop()
{
return new Object();
}

public static Object d3d_transform_stack_top()
{
return new Object();
}

public static Object d3d_transform_stack_discard()
{
return new Object();
}

public static Object d3d_set_fog(Object enable, Object color, Object start, Object end)
{
return new Object();
}

public static Object d3d_set_lighting(Object enable)
{
return new Object();
}

public static Object d3d_set_shading(Object smooth)
{
return new Object();
}

public static Object d3d_set_culling(Object cull)
{
return new Object();
}

public static Object d3d_light_define_direction(Object ind, Object dx, Object dy, Object dz, Object col)
{
return new Object();
}

public static Object d3d_light_define_point(Object ind, Object x, Object y, Object z, Object range, Object col)
{
return new Object();
}

public static Object d3d_light_enable(Object ind, Object enable)
{
return new Object();
}

public static Object d3d_vertex_normal(Object x, Object y, Object z, Object nx, Object ny, Object nz)
{
return new Object();
}

public static Object d3d_vertex_normal_color(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_vertex_normal_texture(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex)
{
return new Object();
}

public static Object d3d_vertex_normal_texture_color(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_model_create()
{
return new Object();
}

public static Object d3d_model_destroy(Object ind)
{
return new Object();
}

public static Object d3d_model_clear(Object ind)
{
return new Object();
}

public static Object d3d_model_save(Object ind, Object fname)
{
return new Object();
}

public static Object d3d_model_load(Object ind, Object fname)
{
return new Object();
}

public static Object d3d_model_draw(Object ind, Object x, Object y, Object z, Object texid)
{
return new Object();
}

public static Object d3d_model_primitive_begin(Object ind, Object kind)
{
return new Object();
}

public static Object d3d_model_vertex(Object ind, Object x, Object y, Object z)
{
return new Object();
}

public static Object d3d_model_vertex_color(Object ind, Object x, Object y, Object z, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_model_vertex_texture(Object ind, Object x, Object y, Object z, Object xtex, Object ytex)
{
return new Object();
}

public static Object d3d_model_vertex_texture_color(Object ind, Object x, Object y, Object z, Object xtex, Object ytex, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_model_vertex_normal(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz)
{
return new Object();
}

public static Object d3d_model_vertex_normal_color(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_model_vertex_normal_texture(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex)
{
return new Object();
}

public static Object d3d_model_vertex_normal_texture_color(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex, Object col, Object alpha)
{
return new Object();
}

public static Object d3d_model_primitive_end(Object ind)
{
return new Object();
}

public static Object d3d_model_block(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return new Object();
}

public static Object d3d_model_cylinder(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return new Object();
}

public static Object d3d_model_cone(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return new Object();
}

public static Object d3d_model_ellipsoid(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object steps)
{
return new Object();
}

public static Object d3d_model_wall(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return new Object();
}

public static Object d3d_model_floor(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return new Object();
}



}
