
package org.dolphin.game.api;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.dolphin.game.Game;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Sprite;
import org.dolphin.game.api.resources.Display;
import org.dolphin.game.api.types.BinaryFile;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.Cursor;
import org.dolphin.game.api.types.Double;
import org.dolphin.game.api.types.File;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.Map;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Surface;
import org.dolphin.game.api.types.Variable;
import org.dolphin.game.api.types.Boolean;
import org.dolphin.game.api.types.Stack;
import org.dolphin.game.api.types.Queue;
import org.dolphin.game.api.types.List;
import org.dolphin.game.api.types.PriorityQueue;
import org.dolphin.game.api.Date;

import sun.applet.Main;

import com.golden.gamedev.engine.graphics.WindowedMode;
import com.golden.gamedev.util.ImageUtil;

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
    
public static Variable is_real(Variable val)
{
    if (val instanceof String)
        return new Boolean(false);
    else
        return new Boolean(true);
}
public static Variable is_string(Variable val)
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
public static Variable random(Variable x)
{
return new Double(Math.random(x.getDouble()));
}
public static Variable choose(Variable... x)
{
    int ran = (int)Math.random(x.length);
    int i=0;
    for (Variable n : x) {
              if (i == ran)
                  return n;
              i++;
          }
return new Variable();
}
public static Variable abs(Variable x)
{
return new Double(Math.abs(x.getDouble()));
}
public static Variable round(Variable x)
{
return new Double(Math.round(x.getDouble()));
}
public static Variable floor(Variable x)
{
return new Double(Math.floor(x.getDouble()));
}

public static Variable ceil(Variable x)
{
return new Double(Math.ceil(x.getDouble()));
}

public static Variable sign(Variable x)
{
return new Double(Math.sign(x.getDouble()));
}

public static Variable frac(Variable x)
{
return new Double(Math.frac(x.getDouble()));
}

public static Variable sqrt(Variable x)
{
return new Double(Math.sqrt(x.getDouble()));
}

public static Variable sqr(Variable x)
{
return new Double(Math.sqr(x.getDouble()));
}

public static Variable exp(Variable x)
{
return new Double(Math.exp(x.getDouble()));
}

public static Variable ln(Variable x)
{
return new Double(Math.ln(x.getDouble()));
}

public static Variable log2(Variable x)
{
return new Double(Math.log2(x.getDouble()));
}

public static Variable log10(Variable x)
{
return new Double(Math.log10(x.getDouble()));
}

public static Variable sin(Variable x)
{
return new Double(Math.sin(x.getDouble()));
}

public static Variable cos(Variable x)
{
return new Double(Math.cos(x.getDouble()));
}

public static Variable tan(Variable x)
{
return new Double(Math.tan(x.getDouble()));
}

public static Variable arcsin(Variable x)
{
return new Double(Math.arcsin(x.getDouble()));
}

public static Variable arccos(Variable x)
{
return new Double(Math.arccos(x.getDouble()));
}

public static Variable arctan(Variable x)
{
return new Double(Math.arctan(x.getDouble()));
}

public static Variable arctan2(Variable y, Variable x)
{
return new Double(Math.arctan2(y.getDouble(),x.getDouble()));
}

public static Variable degtorad(Variable x)
{
return new Double(Math.degtorad(x.getDouble()));
}

public static Variable radtodeg(Variable x)
{
return new Double(Math.radtodeg(x.getDouble()));
}

public static Variable power(Variable x, Variable n)
{
return new Double(Math.power(x.getDouble(),n.getDouble()));
}

public static Variable logn(Variable n, Variable x)
{
return new Double(Math.power(n.getDouble(),x.getDouble()));
}

public static Variable min(Variable... x)
{
    try{
    double min=x[0].getDouble();
    for (Variable n : x) {
              if (n.getDouble() <min)
                  min=n.getDouble();
              min();
          }
return new Double(min);
}catch(Exception e){
    return new Integer(-1);}
}

public static Variable max(Variable... x)
{
    try{
double max=x[0].getDouble();
    for (Variable n : x) {
              if (n.getDouble() >max)
                  max=n.getDouble();
          }
return new Double(max);
    }catch(Exception e){
    return new Integer(-1);}
}

public static Variable mean(Variable... x)
{
     if (x.length == 0)
                return new Double(0);
            double total = 0;
            for (Variable n:x)
                total += n.getDouble();
            return new Double(total / x.length);
}

public static Variable median(Variable... x)
{
    if (x.length == 0)
                return new Double(0);
            if (x.length % 2 == 1)
                return x[x.length / 2];
            return mean(x[x.length / 2], x[(x.length / 2) - 1]);
}

public static Variable point_distance(Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Double(Math.pointDistance(x1.getDouble(),y1.getDouble(),x2.getDouble(),y2.getDouble()));
}

public static Variable point_direction(Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Double(Math.pointDirection(x1.getDouble(),y1.getDouble(),x2.getDouble(),y2.getDouble()));
}

public static Variable lengthdir_x(Variable len, Variable dir)
{
return new Double(Math.lengthDirX(len.getDouble(),dir.getDouble()));
}

public static Variable lengthdir_y(Variable len, Variable dir)
{
return new Double(Math.lengthDirY(len.getDouble(),dir.getDouble()));
}

public static Variable cbrt(Variable x) {
return new Double(Math.cbrt(x.getDouble()));
}

public static Variable sinh(Variable x) {
return new Double(Math.sinh(x.getDouble()));
}

public static Variable cosh(Variable x) {
return new Double(Math.cosh(x.getDouble()));
}

public static Variable tanh(Variable x) {
return new Double(Math.tanh(x.getDouble()));
}

public static Variable expm1(Variable x) {
return new Double(Math.expm1(x.getDouble()));
}

/*
 * 
 * String functions
 * 
 */
public static Variable real(Variable str)
{
return new Double(str.getDouble());
}

public static Variable string(Variable val)
{
return val.getString();
}

public static Variable tostring(Variable val)
{
return val.getString();
}

public static Variable string_format(Variable val, Variable total, Variable dec)
{
return new String(String.stringFormat(val.getDouble(), total.getDouble(), dec.getDouble()));
}

public static Variable chr(Variable val)
{
return new String(String.chr(val.getDouble()));
}

public static Variable ord(Variable character)
{
return new Double(String.ord(character+""));
}

public static Variable string_length(Variable str)
{
return new Double(String.length(str+""));
}

public static Variable string_pos(Variable substr, Variable str)
{
return new Double(String.pos(substr+"",str+""));
}

public static Variable string_copy(Variable str, Variable index, Variable count)
{
return new String(String.substring(str+"",index.getDouble(),count.getDouble()));
}

public static Variable string_char_at(Variable str, Variable index)
{
return new String(String.charAt(str+"", index.getDouble()));
}

public static Variable string_delete(Variable str, Variable index, Variable count)
{
return new String(String.delete(str+"", index.getDouble(), count.getDouble()));
}

public static Variable string_insert(Variable substr, Variable str, Variable index)
{
return new String(String.insert(substr+"", str+"", index.getDouble()));
}

public static Variable string_lower(Variable str)
{
return new String(String.lower(""+str));
}

public static Variable string_upper(Variable str)
{
return new String(String.upper(""+str));
}

public static Variable string_repeat(Variable str, Variable count)
{
return new String(String.repeat(str+"", count.getDouble()));
}

public static Variable string_letters(Variable str)
{
return new String(String.letters(str+""));
}

public static Variable string_digits(Variable str)
{
return new String(String.digits(str+""));
}

public static Variable string_lettersdigits(Variable str)
{
return new String(String.lettersDigits(str+""));
}

public static Variable string_replace(Variable str, Variable substr, Variable newstr)
{
return new String(String.replace(str+"", substr+"", newstr+""));
}

public static Variable string_replace_all(Variable str, Variable substr, Variable newstr)
{
return new String(String.replaceAll(str+"", substr+"", newstr+""));
}

public static Variable string_count(Variable substr, Variable str)
{
return new Double(String.count(substr+"", str+""));
}

public static Variable clipboard_has_text()
{
return new Boolean(Clipboard.hasText());
}

public static Variable clipboard_set_text(Variable str)
{
    Clipboard.setText(str.getString());
return new Variable();
}

public static Variable clipboard_get_text()
{
return Clipboard.getText();
}


/*
 * 
 * Date functions
 * 
 */ 
public static Variable date_current_datetime()
{
return new Double(Date.currentDatetime());
}

public static Variable date_current_date()
{
    
return round(new Double(Date.currentDate()));
}

public static Variable date_current_time()
{
return new Variable();
}

public static Variable date_create_datetime(Variable year, Variable month, Variable day, Variable hour, Variable minute, Variable second)
{
return new Variable();
}

public static Variable date_create_date(Variable year, Variable month, Variable day)
{
return new Variable();
}

public static Variable date_create_time(Variable hour, Variable minute, Variable second)
{
return new Variable();
}

public static Variable date_valid_datetime(Variable year, Variable month, Variable day, Variable hour, Variable minute, Variable second)
{
return new Variable();
}

public static Variable date_valid_date(Variable year, Variable month, Variable day)
{
return new Variable();
}

public static Variable date_valid_time(Variable hour, Variable minute, Variable second)
{
return new Variable();
}

public static Variable date_inc_year(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_month(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_week(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_day(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_hour(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_minute(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_inc_second(Variable date, Variable amount)
{
return new Variable();
}

public static Variable date_get_year(Variable date)
{
return new Double(Date.getYear(date.getDouble()));
}

public static Variable date_get_month(Variable date)
{
return new Variable();
}

public static Variable date_get_week(Variable date)
{
return new Variable();
}

public static Variable date_get_day(Variable date)
{
return new Variable();
}

public static Variable date_get_hour(Variable date)
{
return new Variable();
}

public static Variable date_get_minute(Variable date)
{
return new Variable();
}

public static Variable date_get_second(Variable date)
{
return new Variable();
}

public static Variable date_get_weekday(Variable date)
{
return new Variable();
}

public static Variable date_get_day_of_year(Variable date)
{
return new Variable();
}

public static Variable date_get_hour_of_year(Variable date)
{
return new Variable();
}

public static Variable date_get_minute_of_year(Variable date)
{
return new Variable();
}

public static Variable date_get_second_of_year(Variable date)
{
return new Variable();
}

public static Variable date_year_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_month_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_week_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_day_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_hour_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_minute_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_second_span(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_compare_datetime(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_compare_date(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_compare_time(Variable date1, Variable date2)
{
return new Variable();
}

public static Variable date_date_of(Variable date)
{
return new Variable();
}

public static Variable date_time_of(Variable date)
{
return new Variable();
}

public static Variable date_datetime_string(Variable date)
{
return new Variable();
}

public static Variable date_date_string(Variable date)
{
return new Variable();
}

public static Variable date_time_string(Variable date)
{
return new Variable();
}

public static Variable date_days_in_month(Variable date)
{
return new Variable();
}

public static Variable date_days_in_year(Variable date)
{
return new Variable();
}

public static Variable date_leap_year(Variable date)
{
return new Variable();
}

public static Variable date_is_today(Variable date)
{
return new Variable();
}

/*
 * 
 * Moving around Functions
 * 
 */

public static Variable motion_set(Variable dir, Variable speed)
{
    self.setDirection(dir);
    self.setSpeed(speed);
return new Variable();
}

public static Variable motion_add(Variable dir, Variable speed)
{
   // self.hspeed += -(speed.getDouble());
   // self.vspeed += speed.getDouble() * Math.sin(dir.getDouble() * (Math.PI/180));
    //self.speed += speed.getDouble();
    self.setDirection(new Double(self.getDirection().getDouble() + dir.getDouble()));
    self.setSpeed(speed.add(self.getSpeed()));
return new Variable();
}

public static Variable place_free(Variable x, Variable y)
{
     for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
           if (Game.currentRoom.instances.elementAt(i) !=null){
               Actor a = ((Actor)Game.currentRoom.instances.elementAt(i));
               if (a.getSolid().getBoolean()) {
                    if (new Rectangle((int) self.x, (int) self.y, self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {
                        //if not instance id
                        if (a.getId().getDouble() == self.getId().getDouble()) {
                            System.out.println("a.id:" + a.getId().getDouble() + " s.id" + self.getId().getDouble());
                        } else {
                            System.out.println("x" + self.x + "y" + self.y + "width:" + self.sprite.sprite_width);
                            System.out.println("" + a.getBounds().toString());
                            return new Boolean(false);
                        }
                    }
                }
           }
        }
return new Boolean(true);
}

public static Variable place_empty(Variable x, Variable y)
{
     for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
           if (Game.currentRoom.instances.elementAt(i) !=null){
               Actor a = ((Actor)Game.currentRoom.instances.elementAt(i));
                if (new Rectangle((int) self.x, (int) self.y, self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {
                    //if not instance id
                    if (a.getId().getDouble() == self.getId().getDouble()) {
                        System.out.println("a.id:" + a.getId().getDouble() + " s.id" + self.getId().getDouble());
                    } else {
                        System.out.println("x" + self.x + "y" + self.y + "width:" + self.sprite.sprite_width);
                        System.out.println("" + a.getBounds().toString());
                        return new Boolean(false);
                    }
                }
           }
        }
return new Boolean(true);
}

public static Variable place_meeting(Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable place_snapped(Variable hsnap, Variable vsnap)
{
    if ((self.x % hsnap.getDouble() ==0) && (self.y % vsnap.getDouble()==0) )
        return new Boolean(true);

return new Variable();
}

public static Variable move_random(Variable hsnap, Variable vsnap)
{
    self.x=round(random(getRoom_width()).div(hsnap)).mult(hsnap).getDouble();
    self.y=round(random(getRoom_height()).div(vsnap)).mult(vsnap).getDouble();
return new Variable();
}

/*
 * 
 * @author hanson
 */
public static Variable move_snap(Variable hsnap, Variable vsnap)
{
    self.x = round(new Double(self.x/hsnap.getDouble())).getDouble()  * hsnap.getDouble();
self.y = round(new Double(self.y/vsnap.getDouble())).getDouble() * vsnap.getDouble();		
return new Variable();
}

public static Variable move_towards_point(Variable xto, Variable yto, Variable sp)
{
   double dist=sqrt(new Double((xto.getDouble()-self.x)*(xto.getDouble()-self.x)+(yto.getDouble()-self.y)*(yto.getDouble()-self.y))).getDouble();
   self.hspeed=((xto.getDouble()-self.x)/dist)*sp.getDouble();
   self.vspeed=((yto.getDouble()-self.y)/dist)*sp.getDouble();
return new Variable();
}

public static Variable move_contact_solid(Variable dir, Variable maxdist)
{
return new Variable();
}

public static Variable move_contact_all(Variable dir, Variable maxdist)
{
return new Variable();
}

public static Variable move_outside_solid(Variable dir, Variable maxdist)
{
return new Variable();
}

public static Variable move_outside_all(Variable dir, Variable maxdist)
{
return new Variable();
}

public static Variable move_bounce_solid(Variable advanced)
{
return new Variable();
}

public static Variable move_bounce_all(Variable advanced)
{
return new Variable();
}

public static Variable move_wrap(Variable hor, Variable vert, Variable margin)
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
return new Variable();
}

public static Variable distance_to_point(Variable x, Variable y)
{
    double xd = x.getDouble()-self.x;
    double yd = y.getDouble()-self.y;
    return sqrt(new Double((xd)*(xd)+(yd)*(yd)));
}

public static Variable distance_to_Variable(Variable obj)
{
   // Game.currentRoom.instances
    /*double smalldist =-1 ;//= (Actor) Game.currentRoom.instances.elementAt(0);
       for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        Actor Variable = (Actor) Game.currentRoom.instances.elementAt(i);
        if (Variable.equals(obj.getClass())) {
        double dist = (sqrt(new Double((Variable.x-self.x)*(Variable.x-self.x)+(Variable.y-self.y)*(Variable.y-self.y)))).getDouble();
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

public static Variable position_empty(Variable x, Variable y)
{
return new Variable();
}

public static Variable position_meeting(Variable x, Variable y, Variable obj)
{
return new Variable();
}

/*
 * 
 * Paths functions
 * 
 */
public static Variable path_start(Variable path, Variable speed, Variable endaction, Variable absolute)
{
return new Variable();
}

public static Variable path_end()
{
return new Variable();
}

/*
 * 
 * Motion planning functions
 * 
 */

public static Variable mp_linear_step(Variable x, Variable y, Variable speed, Variable checkall)
{
return new Variable();
}

public static Variable mp_potential_step(Variable x, Variable y, Variable speed, Variable checkall)
{
return new Variable();
}

public static Variable mp_linear_step_Variable(Variable x, Variable y, Variable speed, Variable obj)
{
return new Variable();
}

public static Variable mp_potential_step_Variable(Variable x, Variable y, Variable speed, Variable obj)
{
return new Variable();
}

public static Variable mp_potential_settings(Variable maxrot, Variable rotstep, Variable ahead, Variable onspot)
{
return new Variable();
}

public static Variable mp_linear_path(Variable path, Variable xg, Variable yg, Variable stepsize, Variable checkall)
{
return new Variable();
}

public static Variable mp_potential_path(Variable path, Variable xg, Variable yg, Variable stepsize, Variable factor, Variable checkall)
{
return new Variable();
}

public static Variable mp_linear_path_Variable(Variable path, Variable xg, Variable yg, Variable stepsize, Variable obj)
{
return new Variable();
}

public static Variable mp_potential_path_Variable(Variable path, Variable xg, Variable yg, Variable stepsize, Variable factor, Variable obj)
{
return new Variable();
}

public static Variable mp_grid_create(Variable left, Variable top, Variable hcells, Variable vcells, Variable cellwidth, Variable cellheight)
{
return new Variable();
}

public static Variable mp_grid_destroy(Variable id)
{
return new Variable();
}

public static Variable mp_grid_clear_all(Variable id)
{
return new Variable();
}

public static Variable mp_grid_clear_cell(Variable id, Variable h, Variable v)
{
return new Variable();
}

public static Variable mp_grid_clear_rectangle(Variable id, Variable left, Variable top, Variable right, Variable bottom)
{
return new Variable();
}

public static Variable mp_grid_add_cell(Variable id, Variable h, Variable v)
{
return new Variable();
}

public static Variable mp_grid_add_rectangle(Variable id, Variable left, Variable top, Variable right, Variable bottom)
{
return new Variable();
}

public static Variable mp_grid_add_instances(Variable id, Variable obj, Variable prec)
{
return new Variable();
}

public static Variable mp_grid_path(Variable id, Variable path, Variable xstart, Variable ystart, Variable xgoal, Variable ygoal, Variable allowdiag)
{
return new Variable();
}

public static Variable mp_grid_draw(Variable id)
{
return new Variable();
}

/*
 * 
 * Collision checking
 * 
 */
public static Variable collision_point(Variable x, Variable y, Variable obj, Variable prec, Variable notme)
{
return new Variable();
}

public static Variable collision_rectangle(Variable x1, Variable y1, Variable x2, Variable y2, Variable obj, Variable prec, Variable notme)
{
return new Variable();
}

public static Variable collision_circle(Variable x1, Variable y1, Variable radius, Variable obj, Variable prec, Variable notme)
{
return new Variable();
}

public static Variable collision_ellipse(Variable x1, Variable y1, Variable x2, Variable y2, Variable obj, Variable prec, Variable notme)
{
return new Variable();
}

public static Variable collision_line(Variable x1, Variable y1, Variable x2, Variable y2, Variable obj, Variable prec, Variable notme)
{
return new Variable();
}

/*
 * 
 * Instances
 * 
 */

public static Variable instance_find(Variable obj, Variable n)
{
return new Variable();
}

public static Variable instance_exists(Variable obj)
{
return new Variable();
}

public static Variable instance_number(Variable obj)
{
return new Variable();
}

public static Variable instance_position(Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable instance_nearest(Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable instance_furthest(Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable instance_place(Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable instance_create(Variable x, Variable y, Variable obj)
{
        try {
            Class ins = Class.forName("org.gcreator.compilers.gjava."+obj.toString());
            Game.maxInstanceId++;
            Actor o = (Actor) ins.getDeclaredConstructor(Variable.class,Variable.class,Variable.class).newInstance(x,y,new Double(Game.maxInstanceId));
            
            Game.currentRoom.instances.add(o);
            Game.allinstances.put(Game.maxInstanceId, o);
        } catch (Exception ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }

return new Double(Game.maxInstanceId);
}

public Variable instance_copy(Variable performevent)
{
    Game.maxInstanceId++;
        try {
            
            Actor o = (Actor) this.clone();
            Game.currentRoom.instances.add(o);
            //Game.allinstances.put(Game.maxInstanceId, o);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Double(Game.maxInstanceId);
}

public static Variable instance_change(Variable obj, Variable performevents)
{
    System.out.println("instance change");
    
return new Variable();
}

public static Variable instance_destroy()
{
return new Variable();
}

public static Variable position_destroy(Variable x, Variable y)
{
return new Variable();
}

public static Variable position_change(Variable x, Variable y, Variable obj, Variable performevents)
{
return new Variable();
}

/*
 * 
 * Deactivating instances
 * 
 */
public static Variable instance_deactivate_all(Variable notme)
{
    //Game.currentRoom.instances
     for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        Actor act = (Actor)Game.currentRoom.instances.elementAt(i);
        act.active=false;
    }
     if (notme.getBoolean())
       self.active=true;
return new Variable();
}

public static Variable instance_deactivate_Variable(Variable obj)
{
return new Variable();
}

public static Variable instance_deactivate_region(Variable left, Variable top, Variable width, Variable height, Variable inside, Variable notme)
{
return new Variable();
}

public static Variable instance_activate_all()
{
return new Variable();
}

public static Variable instance_activate_Variable(Variable obj)
{
return new Variable();
}

public static Variable instance_activate_region(Variable left, Variable top, Variable width, Variable height, Variable inside)
{
return new Variable();
}

/*
 * 
 * Timing
 * 
 */
public static Variable sleep(Variable millisec)
{
        try {
            Thread.sleep((int) millisec.getDouble());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Variable();
}

/*
 * 
 * Rooms
 * 
 */
public static Variable room_goto(Variable numb)
{
return new Variable();
}

public static Variable room_goto_previous()
{
return new Variable();
}

public static Variable room_goto_next()
{
return new Variable();
}

public static Variable room_previous(Variable numb)
{
return new Variable();
}

public static Variable room_next(Variable numb)
{
return new Variable();
}

public static Variable room_restart()
{
return new Variable();
}

public static Variable game_end()
{
    System.exit(0);
return new Variable();
}

public static Variable game_restart()
{
return new Variable();
}

public static Variable game_load(Variable filename)
{
return new Variable();
}

public static Variable game_save(Variable filename)
{
return new Variable();
}

/*
 * 
 * Event
 * 
 */
public static Variable event_perform(Variable type, Variable numb)
{
return new Variable();
}

public static Variable event_user(Variable numb)
{
return new Variable();
}

public static Variable event_perform_Variable(Variable obj, Variable type, Variable numb)
{
return new Variable();
}

public static Variable event_inherited()
{
return new Variable();
}

/*
 * 
 * Miscellaneous 
 * 
 */
public static Variable show_debug_message(Variable str)
{
    //Game.debug.println(str);
	System.out.println(str);
    return new Variable();
}

public static Variable variable_global_exists(Variable name)
{
return new Variable();
}

public static Variable variable_global_get(Variable name)
{
return new Variable();
}

public static Variable variable_global_array_get(Variable name, Variable ind)
{
return new Variable();
}

public static Variable variable_global_array2_get(Variable name, Variable ind1, Variable ind2)
{
return new Variable();
}

public static Variable variable_global_set(Variable name, Variable value)
{
return new Variable();
}

public static Variable variable_global_array_set(Variable name, Variable ind, Variable value)
{
return new Variable();
}

public static Variable variable_global_array2_set(Variable name, Variable ind1, Variable ind2, Variable value)
{
return new Variable();
}

public static Variable variable_local_exists(Variable name)
{
return new Variable();
}

public static Variable variable_local_get(Variable name)
{
return new Variable();
}

public static Variable variable_local_array_get(Variable name, Variable ind)
{
return new Variable();
}

public static Variable variable_local_array2_get(Variable name, Variable ind1, Variable ind2)
{
return new Variable();
}

public static Variable variable_local_set(Variable name, Variable value)
{
return new Variable();
}

public static Variable variable_local_array_set(Variable name, Variable ind, Variable value)
{
return new Variable();
}

public static Variable variable_local_array2_set(Variable name, Variable ind1, Variable ind2, Variable value)
{
return new Variable();
}

public static Variable set_program_priority(Variable priority)
{
return new Variable();
}

/*
 * 
 * Keyboard
 * 
 */
public static Variable keyboard_set_map(Variable key1, Variable key2)
{
   /* keymaps currently don't work
	if (Game.keymap == null)
        Game.keymap = new Hashtable();
    Game.keymap.put(key1.getInt(), key2.getInt());*/
return new Variable();
}

public static Variable keyboard_get_map(Variable key)
{
return new Variable();
}

public static Variable keyboard_unset_map()
{
return new Variable();
}

public static Variable keyboard_check(Variable key)
{
return new Boolean( Game.game.getGame().bsInput.isKeyDown(key.getInt()));
}

public static Variable keyboard_check_pressed(Variable key)
{
   return new Boolean( Game.game.getGame().bsInput.isKeyPressed(key.getInt()));
//return new Variable();
}

public static Variable keyboard_check_released(Variable key)
{
    return new Boolean( Game.game.getGame().bsInput.isKeyReleased(key.getInt()));
//return new Variable();
}

public static Variable keyboard_check_direct(Variable key)
{
return keyboard_check(key);
}

public static Variable keyboard_get_numlock()
{
return new Variable();
}

public static Variable keyboard_set_numlock(Variable on)
{
return new Variable();
}

public static Variable keyboard_key_press(Variable key)
{
return new Variable();
}

public static Variable keyboard_key_release(Variable key)
{
return new Variable();
}

public static Variable keyboard_clear(Variable key)
{
return new Variable();
}

public static Variable io_clear()
{
return new Variable();
}

public static Variable io_handle()
{
return new Variable();
}

public static Variable keyboard_wait()
{
return new Variable();
}

/*
 * 
 * The mouse
 * 
 */
public static Variable mouse_check_button(Variable button)
{
return new Variable();
}

public static Variable mouse_check_button_pressed(Variable button)
{
return new Variable();
}

public static Variable mouse_check_button_released(Variable button)
{
return new Variable();
}

public static Variable mouse_clear(Variable button)
{
return new Variable();
}

public static Variable mouse_wait()
{
return new Variable();
}

/*
 * 
 * Joystick
 * 
 */
public static Variable joystick_exists(Variable id)
{
return new Variable();
}

public static Variable joystick_direction(Variable id)
{
return new Variable();
}

public static Variable joystick_name(Variable id)
{
return new Variable();
}

public static Variable joystick_axes(Variable id)
{
return new Variable();
}

public static Variable joystick_buttons(Variable id)
{
return new Variable();
}

public static Variable joystick_has_pov(Variable id)
{
return new Variable();
}

public static Variable joystick_check_button(Variable id, Variable button)
{
return new Variable();
}

public static Variable joystick_xpos(Variable id)
{
return new Variable();
}

public static Variable joystick_ypos(Variable id)
{
return new Variable();
}

public static Variable joystick_zpos(Variable id)
{
return new Variable();
}

public static Variable joystick_rpos(Variable id)
{
return new Variable();
}

public static Variable joystick_upos(Variable id)
{
return new Variable();
}

public static Variable joystick_vpos(Variable id)
{
return new Variable();
}

public static Variable joystick_pov(Variable id)
{
return new Variable();
}

/*
 * 
 * Drawing Sprites and images
 * 
 */

public static Variable draw_sprite(Variable sprite, Variable subimg, Variable x, Variable y)
{
    
    Game.currentRoom.g2d.drawImage(((Sprite)sprite).imshow((int)subimg.getDouble()), null, (int)x.getDouble(), (int)y.getDouble());
return new Variable();
}

public static Variable draw_sprite_ext(Variable sprite, Variable subimg, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_sprite_stretched(Variable sprite, Variable subimg, Variable x, Variable y, Variable w, Variable h)
{
    Game.currentRoom.g2d.drawImage(ImageUtil.resize(((Sprite)sprite).imshow((int)subimg.getDouble()),(int)w.getDouble(),(int)y.getDouble()), null, (int)x.getDouble(), (int)y.getDouble());
return new Variable();
}

public static Variable draw_sprite_stretched_ext(Variable sprite, Variable subimg, Variable x, Variable y, Variable w, Variable h, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_sprite_tiled(Variable sprite, Variable subimg, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_sprite_tiled_ext(Variable sprite, Variable subimg, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_sprite_part(Variable sprite, Variable subimg, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_sprite_part_ext(Variable sprite, Variable subimg, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_sprite_general(Variable sprite, Variable subimg, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
return new Variable();
}

public static Variable draw_background(Variable back, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_background_ext(Variable back, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_background_stretched(Variable back, Variable x, Variable y, Variable w, Variable h)
{
return new Variable();
}

public static Variable draw_background_stretched_ext(Variable back, Variable x, Variable y, Variable w, Variable h, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_background_tiled(Variable back, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_background_tiled_ext(Variable back, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_background_part(Variable back, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_background_part_ext(Variable back, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_background_general(Variable back, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
return new Variable();
}

/*
 * 
 * Drawing shapes
 * 
 */
public static Variable draw_clear(Variable col)
{
    Game.currentRoom.g2d.setColor( ((Color)col).c );
        Game.currentRoom.g2d.fillRect( 0, 0, Game.currentRoom.width, Game.currentRoom.height );
return new Variable();
}

public static Variable draw_clear_alpha(Variable col, Variable alpha)
{
return new Variable();
}

public static Variable draw_point(Variable x, Variable y)
{
    Game.currentRoom.g2d.fillRect((int)x.getDouble(), (int)y.getDouble(), 1, 1);
return new Variable();
}

public static Variable draw_line(Variable x1, Variable y1, Variable x2, Variable y2)
{
    Game.currentRoom.g2d.drawLine(x1.getInt(), (int)y1.getDouble(), (int)x2.getDouble(), (int)y2.getDouble());
return new Variable();
}

public static Variable draw_rectangle(Variable x1, Variable y1, Variable x2, Variable y2, Variable outline)
{
   // System.out.println(""+x1.getDouble());
    if (x1.getDouble() > x2.getDouble()) {
    temp = x1;
    x1 = x2;
    x2=temp;
    }
    if (y1.getDouble() > y2.getDouble()) {
    temp = y1;
    y1 = y2;
    y2=temp;
    }
    if (outline.getBoolean())
    Game.currentRoom.g2d.drawRect((int)x1.getDouble(), (int)y1.getDouble(), (int)(x2.getDouble()-x1.getDouble()), (int)(y2.getDouble()-y1.getDouble()));
    else
        Game.currentRoom.g2d.fillRect((int)x1.getDouble(), (int)y1.getDouble(), (int)(x2.getDouble()-x1.getDouble()), (int)(y2.getDouble()-y1.getDouble()));
    
    return new Variable();
}
static Variable temp= new Variable();
public static Variable draw_roundrect(Variable x1, Variable y1, Variable x2, Variable y2, Variable outline)
{
     if (x1.getDouble() > x2.getDouble()) {
    temp = x1;
    x1 = x2;
    x2=temp;
    }
    if (y1.getDouble() > y2.getDouble()) {
    temp = y1;
    y1 = y2;
    y2=temp;
    }
    if (outline.getBoolean())
    Game.currentRoom.g2d.drawRoundRect((int)x1.getDouble(), (int)y1.getDouble(), (int)(x2.getDouble()-x1.getDouble()), (int)(y2.getDouble()-y1.getDouble()),10,10);
    else
        Game.currentRoom.g2d.fillRoundRect((int)x1.getDouble(), (int)y1.getDouble(), (int)(x2.getDouble()-x1.getDouble()), (int)(y2.getDouble()-y1.getDouble()),10,10);
    
return new Variable();
}

public static Variable draw_triangle(Variable x1, Variable y1, Variable x2, Variable y2, Variable x3, Variable y3, Variable outline)
{
   // int[] xpoints = {(int)x1.getDouble(),(int)x2.getDouble(),(int)x3.getDouble()};
   // Game.currentRoom.g2d.drawPolygon(xPoints, yPoints, nPoints);
return new Variable();
}

public static Variable draw_circle(Variable x, Variable y, Variable r, Variable outline)
{
    //Game.currentRoom.g2d.drawArc(x, y, width, height, startAngle, arcAngle);
return new Variable();
}

public static Variable draw_ellipse(Variable x1, Variable y1, Variable x2, Variable y2, Variable outline)
{
    //Draw.ellipse(x1.getDouble(), y1.getDouble(), x2.getDouble(), y2.getDouble(), outline.getBoolean());
return new Variable();
}

public static Variable draw_arrow(Variable x1, Variable y1, Variable x2, Variable y2, Variable size)
{
return new Variable();
}

public static Variable draw_button(Variable x1, Variable y1, Variable x2, Variable y2, Variable up)
{
return new Variable();
}

public static Variable draw_path(Variable path, Variable x, Variable y, Variable absolute)
{
return new Variable();
}

public static Variable draw_healthbar(Variable x1, Variable y1, Variable x2, Variable y2, Variable amount, Variable backcol, Variable mincol, Variable maxcol, Variable direction, Variable showback, Variable showborder)
{
return new Variable();
}

public static Variable draw_getpixel(Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_set_color(Variable col)
{
   Game.currentRoom.g2d.setColor(((Color)col).c); 
return new Variable();
}

public static Variable draw_set_alpha(Variable alpha)
{
return new Variable();
}

public static Variable draw_get_color()
{
  return  new Color(Game.currentRoom.g2d.getColor()); 
}

public static Variable draw_get_alpha()
{
return new Variable();
}

public static Variable make_color_rgb(Variable red, Variable green, Variable blue)
{
return new Color((int)red.getDouble(),(int)green.getDouble(),(int)blue.getDouble());
}

public static Variable make_color_hsv(Variable hue, Variable s, Variable value)
{
    return new Color(java.awt.Color.getHSBColor((int)hue.getDouble(), (int)s.getDouble(), (int)value.getDouble()));
}

public static Variable color_get_red(Variable col)
{
return new Integer(((Color)col).c.getRed());
}

public static Variable color_get_green(Variable col)
{
return new Integer(((Color)col).c.getGreen());
}

public static Variable color_get_blue(Variable col)
{
return new Integer(((Color)col).c.getBlue());
}

public static Variable color_get_hue(Variable col)
{
return new Variable();
}

public static Variable color_get_saturation(Variable col)
{
return new Variable();
}

public static Variable color_get_value(Variable col)
{
return new Variable();
}

public static Variable merge_color(Variable col1, Variable col2, Variable amount)
{
return new Variable();
}

public static Variable screen_save(Variable fname)
{
return new Variable();
}

public static Variable screen_save_part(Variable fname, Variable x, Variable y, Variable w, Variable h)
{
return new Variable();
}


/*
 * 
 * Fonts and text
 * 
 */
public static Variable draw_set_font(Variable font)
{
return new Variable();
}

public static Variable draw_set_halign(Variable halign)
{
return new Variable();
}

public static Variable draw_set_valign(Variable valign)
{
return new Variable();
}

public static Variable draw_text(Variable x, Variable y, Variable string)
{
    Game.currentRoom.g2d.drawString(""+string, x.getInt(), y.getInt());
return new Variable();
}

public static Variable draw_text_ext(Variable x, Variable y, Variable string, Variable sep, Variable w)
{
    draw_text(x,y,string);
return new Variable();
}


public static Variable string_width(Variable string)
{
    if (Game.currentRoom.g2d !=null)
    return new Integer( Game.currentRoom.g2d.getFontMetrics().stringWidth(""+string));
return new Variable();
}

public static Variable string_height(Variable string)
{
    if (Game.currentRoom.g2d !=null)
    return new Integer( Game.currentRoom.g2d.getFontMetrics().getHeight());
return new Variable();
}

public static Variable string_width_ext(Variable string, Variable sep, Variable w)
{
return string_width(string);
}

public static Variable string_height_ext(Variable string, Variable sep, Variable w)
{
return string_height(string);
}

public static Variable draw_text_rotated(Variable x, Variable y, Variable string, Variable angle)
{
AffineTransform at = AffineTransform.getRotateInstance ( java.lang.Math.toRadians ( angle.getInt() ) );
    Font f =  Game.currentRoom.g2d.getFont();
    Game.currentRoom.g2d.setFont ( Game.currentRoom.g2d.getFont().deriveFont ( at ) );
    Game.currentRoom.g2d.drawString(""+string, x.getInt(), y.getInt());
Game.currentRoom.g2d.setFont(f);
return new Variable();
}

public static Variable draw_text_transformed(Variable x, Variable y, Variable string, Variable xscale, Variable yscale, Variable angle)
{
AffineTransform at = AffineTransform.getRotateInstance ( java.lang.Math.toRadians ( angle.getInt() ) );
    Font f =  Game.currentRoom.g2d.getFont();
    Game.currentRoom.g2d.setFont ( Game.currentRoom.g2d.getFont().deriveFont ( at ) );
    Game.currentRoom.g2d.drawString(""+string, x.getInt(), y.getInt());
Game.currentRoom.g2d.setFont(f);
return new Variable();
}

public static Variable draw_text_ext_transformed(Variable x, Variable y, Variable string, Variable sep, Variable w, Variable xscale, Variable yscale, Variable angle)
{
    draw_text_transformed(x, y, string, xscale, yscale, angle);
return new Variable();
}

public static Variable draw_text_color(Variable x, Variable y, Variable string, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
    draw_text(x, y, string);
return new Variable();
}

public static Variable draw_text_ext_color(Variable x, Variable y, Variable string, Variable sep, Variable w, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
    draw_text(x, y, string);
return new Variable();
}

public static Variable draw_text_transformed_color(Variable x, Variable y, Variable string, Variable xscale, Variable yscale, Variable angle, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
    draw_text(x, y, string);
return new Variable();
}

public static Variable draw_text_ext_transformed_color(Variable x, Variable y, Variable string, Variable sep, Variable w, Variable xscale, Variable yscale, Variable angle, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
    draw_text(x, y, string);
return new Variable();
}

/*
 * 
 * Advanced drawing functions
 * 
 */
public static Variable draw_point_color(Variable x, Variable y, Variable col1)
{
return new Variable();
}

public static Variable draw_line_color(Variable x1, Variable y1, Variable x2, Variable y2, Variable col1, Variable col2)
{
return new Variable();
}

public static Variable draw_rectangle_color(Variable x1, Variable y1, Variable x2, Variable y2, Variable col1, Variable col2, Variable col3, Variable col4, Variable outline)
{
return new Variable();
}

public static Variable draw_roundrect_color(Variable x1, Variable y1, Variable x2, Variable y2, Variable col1, Variable col2, Variable outline)
{
return new Variable();
}

public static Variable draw_triangle_color(Variable x1, Variable y1, Variable x2, Variable y2, Variable x3, Variable y3, Variable col1, Variable col2, Variable col3, Variable outline)
{
return new Variable();
}

public static Variable draw_circle_color(Variable x, Variable y, Variable r, Variable col1, Variable col2, Variable outline)
{
return new Variable();
}

public static Variable draw_ellipse_color(Variable x1, Variable y1, Variable x2, Variable y2, Variable col1, Variable col2, Variable outline)
{
return new Variable();
}

public static Variable draw_primitive_begin(Variable kind)
{
return new Variable();
}

public static Variable draw_vertex(Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_vertex_color(Variable x, Variable y, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable draw_primitive_end()
{
return new Variable();
}

public static Variable sprite_get_texture(Variable spr, Variable subimg)
{
return new Variable();
}

public static Variable background_get_texture(Variable back)
{
return new Variable();
}

public static Variable texture_preload(Variable texid)
{
return new Variable();
}

public static Variable texture_set_priority(Variable texid, Variable prio)
{
return new Variable();
}

public static Variable texture_get_width(Variable texid)
{
return new Variable();
}

public static Variable texture_get_height(Variable texid)
{
return new Variable();
}

public static Variable draw_primitive_begin_texture(Variable kind, Variable texid)
{
return new Variable();
}

public static Variable draw_vertex_texture(Variable x, Variable y, Variable xtex, Variable ytex)
{
return new Variable();
}

public static Variable draw_vertex_texture_color(Variable x, Variable y, Variable xtex, Variable ytex, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable texture_set_interpolation(Variable linear)
{
return new Variable();
}

public static Variable texture_set_blending(Variable blend)
{
return new Variable();
}

public static Variable texture_set_repeat(Variable repeat)
{
return new Variable();
}

public static Variable draw_set_blend_mode(Variable mode)
{
return new Variable();
}

public static Variable draw_set_blend_mode_ext(Variable src, Variable dest)
{
return new Variable();
}

/*
 * 
 * Drawing Surfaces
 * 
 */
public static Variable surface_create(Variable w, Variable h)
{
return new Surface(w.getInt(),h.getInt());
}

public static Variable surface_free(Variable id)
{
    //not needed
return new Variable();
}

public static Variable surface_exists(Variable id)
{
    //not needed
return new Variable();
}

public static Variable surface_get_width(Variable id)
{
return new Integer(((Surface)id).width);
}

public static Variable surface_get_height(Variable id)
{
return new Integer(((Surface)id).height);
}

public static Variable surface_get_texture(Variable id)
{
    //not needed
return new Variable();
}

public static Variable surface_set_target(Variable id)
{
    Game.graphics = Game.currentRoom.g2d;
    Game.currentRoom.g2d = ((Surface)id).b.createGraphics();
    
return new Variable();
}

public static Variable surface_reset_target()
{
    Game.graphics =null;
    System.out.println("surface");
return new Variable();
}

public static Variable draw_surface(Variable id, Variable x, Variable y)
{
    Game.currentRoom.g2d.drawImage(((Surface)id).b, null, x.getInt(), y.getInt());
    
return new Variable();
}

public static Variable draw_surface_stretched(Variable id, Variable x, Variable y, Variable w, Variable h)
{
return new Variable();
}

public static Variable draw_surface_tiled(Variable id, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_surface_part(Variable id, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y)
{
return new Variable();
}

public static Variable draw_surface_ext(Variable id, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_surface_stretched_ext(Variable id, Variable x, Variable y, Variable w, Variable h, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_surface_tiled_ext(Variable id, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_surface_part_ext(Variable id, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable color, Variable alpha)
{
return new Variable();
}

public static Variable draw_surface_general(Variable id, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable xscale, Variable yscale, Variable rot, Variable c1, Variable c2, Variable c3, Variable c4, Variable alpha)
{
return new Variable();
}

public static Variable surface_getpixel(Variable id, Variable x, Variable y)
{
    new Color(new java.awt.Color(((Surface) id).b.getRGB(x.getInt(), y.getInt())));
return new Variable();
}

public static Variable surface_save(Variable id, Variable fname)
{
        try {

            ImageIO.write(((Surface) id).b, "png", new java.io.File("" + fname+".png"));
            return new Variable();
        } catch (IOException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Variable();
}

public static Variable surface_save_part(Variable id, Variable fname, Variable x, Variable y, Variable w, Variable h)
{
 try {

            ImageIO.write(((Surface) id).b.getSubimage(x.getInt(), y.getInt(), w.getInt(), h.getInt()), "png", new java.io.File("" + fname+".png"));
            return new Variable();
        } catch (IOException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Variable();
}

public static Variable surface_copy(Variable destination, Variable x, Variable y, Variable source)
{
return new Variable();
}

public static Variable surface_copy_part(Variable destination, Variable x, Variable y, Variable source, Variable xs, Variable ys, Variable ws, Variable hs)
{
return new Variable();
}

/*
 * 
 * Tiles
 * 
 */
public static Variable tile_add(Variable background, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable depth)
{
return new Variable();
}

public static Variable tile_delete(Variable id)
{
return new Variable();
}

public static Variable tile_exists(Variable id)
{
return new Variable();
}

public static Variable tile_get_x(Variable id)
{
return new Variable();
}

public static Variable tile_get_y(Variable id)
{
return new Variable();
}

public static Variable tile_get_left(Variable id)
{
return new Variable();
}

public static Variable tile_get_top(Variable id)
{
return new Variable();
}

public static Variable tile_get_width(Variable id)
{
return new Variable();
}

public static Variable tile_get_height(Variable id)
{
return new Variable();
}

public static Variable tile_get_depth(Variable id)
{
return new Variable();
}

public static Variable tile_get_visible(Variable id)
{
return new Variable();
}

public static Variable tile_get_xscale(Variable id)
{
return new Variable();
}

public static Variable tile_get_yscale(Variable id)
{
return new Variable();
}

public static Variable tile_get_background(Variable id)
{
return new Variable();
}

public static Variable tile_get_blend(Variable id)
{
return new Variable();
}

public static Variable tile_get_alpha(Variable id)
{
return new Variable();
}

public static Variable tile_set_position(Variable id, Variable x, Variable y)
{
return new Variable();
}

public static Variable tile_set_region(Variable id, Variable left, Variable right, Variable width, Variable height)
{
return new Variable();
}

public static Variable tile_set_background(Variable id, Variable background)
{
return new Variable();
}

public static Variable tile_set_visible(Variable id, Variable visible)
{
return new Variable();
}

public static Variable tile_set_depth(Variable id, Variable depth)
{
return new Variable();
}

public static Variable tile_set_scale(Variable id, Variable xscale, Variable yscale)
{
return new Variable();
}

public static Variable tile_set_blend(Variable id, Variable color)
{
return new Variable();
}

public static Variable tile_set_alpha(Variable id, Variable alpha)
{
return new Variable();
}

public static Variable tile_layer_hide(Variable depth)
{
return new Variable();
}

public static Variable tile_layer_show(Variable depth)
{
return new Variable();
}

public static Variable tile_layer_delete(Variable depth)
{
return new Variable();
}

public static Variable tile_layer_shift(Variable depth, Variable x, Variable y)
{
return new Variable();
}

public static Variable tile_layer_find(Variable depth, Variable x, Variable y)
{
return new Variable();
}

public static Variable tile_layer_delete_at(Variable depth, Variable x, Variable y)
{
return new Variable();
}

public static Variable tile_layer_depth(Variable depth, Variable newdepth)
{
return new Variable();
}

/*
 * 
 * The display
 * 
 */
public static Variable display_get_width()
{
return new Double(Display.getWidth());
}

public static Variable display_get_height()
{
return new Double(Display.getHeight());
}

public static Variable display_get_colordepth()
{
return new Double(Display.getColordepth());
}

public static Variable display_get_frequency()
{
return new Double(Display.getFrequency());
}

public static Variable display_set_size(Variable w, Variable h)
{
return new Boolean(Display.setSize((int)w.getDouble(),(int) h.getDouble()));
}

public static Variable display_set_colordepth(Variable coldepth)
{
return new Variable();
}

public static Variable display_set_frequency(Variable frequency)
{
return new Variable();
}

public static Variable display_set_all(Variable w, Variable h, Variable frequency, Variable coldepth)
{
return new Variable();
}

public static Variable display_test_all(Variable w, Variable h, Variable frequency, Variable coldepth)
{
return new Variable();
}

public static Variable display_reset()
{
return new Variable();
}

public static Variable display_mouse_get_x()
{
return new Variable();
}

public static Variable display_mouse_get_y()
{
return new Variable();
}

public static Variable display_mouse_set(Variable x, Variable y)
{
return new Variable();
}

/*
 * 
 * The window
 * 
 */
public static Variable window_set_visible(Variable visible)
{
    if (Game.game.getGame().bsGraphics instanceof WindowedMode)
        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible(visible.getBoolean());
    
return new Variable();
}

public static Variable window_get_visible()
{
    if (Game.game.getGame().bsGraphics instanceof WindowedMode)
        return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isVisible());
return new Variable();
}

public static Variable window_set_fullscreen(Variable full)
{
    Game.fullscreen = full.getBoolean();
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] devices = env.getScreenDevices();
    GraphicsDevice device = devices[0];
    if (full.getBoolean()) {
		// Full-screen mode
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().dispose();
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setUndecorated(true);
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setResizable(false);
			device.setFullScreenWindow(((WindowedMode)Game.game.getGame().bsGraphics).getFrame()); // comment this line if you want only undecorated frame
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible(true);
		} else {
		// Windowed mode
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().dispose();
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setUndecorated(false);
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setResizable(true);
			device.setFullScreenWindow(null); // comment this line if you want only undecorated frame
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible(true);
		}
return new Variable();
}

public static Variable window_get_fullscreen()
{
return new Boolean(Game.fullscreen);
}

public static Variable window_set_showborder(Variable show)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().dispose();
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setUndecorated(show.getBoolean()? false:true);
                        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible(true);
return new Variable();
}

public static Variable window_get_showborder()
{
    
return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isUndecorated() ? false:true );
}

public static Variable window_set_showicons(Variable show)
{
    //((JFrame)((WindowedMode)Game.game.getGame().bsGraphics).getFrame()).getc.setWindowDecorationStyle(JRootPane.NONE);
            return new Variable();
}

public static Variable window_get_showicons()
{
return new Variable();
}

public static Variable window_set_stayontop(Variable stay)
{
return new Variable();
}

public static Variable window_get_stayontop()
{
return new Variable();
}

public static Variable window_set_sizeable(Variable sizeable)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setResizable(sizeable.getBoolean());
return new Variable();
}

public static Variable window_get_sizeable()
{
return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isResizable());
}

public static Variable window_set_caption(Variable caption)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setTitle(""+caption);
return new Variable();
}

public static Variable window_get_caption()
{
return new String(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getTitle());
}

public static Variable window_set_cursor(Variable curs)
{
    if(curs instanceof Cursor)
        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setCursor(((Cursor)curs).c);
return new Variable();
}

public static Variable window_get_cursor()
{
return new Cursor(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getCursor());
}

public static Variable window_set_color(Variable color)
{
  ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setBackground(((Color)color).c);
return new Variable();
}

public static Variable window_get_color()
{
return new Color(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getBackground());
}

public static Variable window_set_region_scale(Variable scale, Variable adaptwindow)
{
return new Variable();
}

public static Variable window_get_region_scale()
{
return new Variable();
}

public static Variable window_set_position(Variable x, Variable y)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation(x.getInt(), y.getInt());
return new Variable();
}

public static Variable window_set_size(Variable w, Variable h)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(w.getInt(), h.getInt());
return new Variable();
}

public static Variable window_set_rectangle(Variable x, Variable y, Variable w, Variable h)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(w.getInt(), h.getInt());
((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation(x.getInt(), y.getInt());
return new Variable();
}

public static Variable window_center()
{
    Dimension dim = ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getToolkit().getScreenSize();
  Rectangle abounds = ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getBounds();
  ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation((dim.width - abounds.width) / 2,
      (dim.height - abounds.height) / 2);
return new Variable();
}

public static Variable window_default()
{
    //sets to room hight/width
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(Game.currentRoom.width, Game.currentRoom.height);
    window_center();
return new Variable();
}

public static Variable window_get_x()
{
return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getX());
}

public static Variable window_get_y()
{
return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getY());
}

public static Variable window_get_width()
{
return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getWidth());
}

public static Variable window_get_height()
{
return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getHeight());
}

public static Variable window_mouse_get_x()
{
    try{
    return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getMousePosition().getX());

    }catch(Exception e){}
    return new Integer(0);
}

public static Variable window_mouse_get_y()
{
 try{
    return new Double(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getMousePosition().getY());

    }catch(Exception e){}
    return new Integer(0);
}

public static Variable window_mouse_set(Variable x, Variable y)
{
    try {
        java.awt.Robot r = new java.awt.Robot();
        r.mouseMove(x.getInt(), y.getInt());
    } catch (AWTException aWTException) {
    }
return new Variable();
}

/*
 * 
 * Views
 * 
 */
public static Variable window_set_region_size(Variable w, Variable h, Variable adaptwindow)
{
return new Variable();
}

public static Variable window_get_region_width()
{
return new Variable();
}

public static Variable window_get_region_height()
{
return new Variable();
}

public static Variable window_view_mouse_get_x(Variable id)
{
return new Variable();
}

public static Variable window_view_mouse_get_y(Variable id)
{
return new Variable();
}

public static Variable window_view_mouse_set(Variable id, Variable x, Variable y)
{
return new Variable();
}

public static Variable window_views_mouse_get_x()
{
return new Variable();
}

public static Variable window_views_mouse_get_y()
{
return new Variable();
}

public static Variable window_views_mouse_set(Variable x, Variable y)
{
return new Variable();
}

/*
 * 
 * Repainting the screen
 * 
 */
public static Variable screen_redraw()
{
        Game.currentRoom.render(Game.game.getGame().bsGraphics.getBackBuffer());
        Game.game.getGame().bsGraphics.flip();
       // Game.game.getGame().bsGraphics.getBackBuffer()
    
return new Variable();
}

public static Variable screen_refresh()
{
return new Variable();
}

public static Variable screen_wait_vsync()
{
return new Variable();
}

public static Variable set_automatic_draw(Variable value)
{
    Game.auto_redraw = value.getBoolean();
return new Variable();
}

public static Variable set_synchronization(Variable value)
{
return new Variable();
}

/*
 *  
 * Basic sound functions
 * 
 */
public static Variable sound_play(Variable index)
{
return new Variable();
}

public static Variable sound_loop(Variable index)
{
return new Variable();
}

public static Variable sound_stop(Variable index)
{
return new Variable();
}

public static Variable sound_stop_all()
{
return new Variable();
}

public static Variable sound_isplaying(Variable index)
{
return new Variable();
}

public static Variable sound_volume(Variable index, Variable value)
{
return new Variable();
}

public static Variable sound_global_volume(Variable value)
{
return new Variable();
}

public static Variable sound_fade(Variable index, Variable value, Variable time)
{
return new Variable();
}

public static Variable sound_pan(Variable index, Variable value)
{
return new Variable();
}

public static Variable sound_background_tempo(Variable factor)
{
return new Variable();
}

public static Variable sound_set_search_directory(Variable dir)
{
return new Variable();
}

/*
 * 
 * Sound effects
 * 
 */
public static Variable sound_effect_set(Variable snd, Variable effect)
{
return new Variable();
}

public static Variable sound_effect_chorus(Variable snd, Variable wetdry, Variable depth, Variable feedback, Variable frequency, Variable wave, Variable delay, Variable phase)
{
return new Variable();
}

public static Variable sound_effect_echo(Variable snd, Variable wetdry, Variable feedback, Variable leftdelay, Variable rightdelay, Variable pandelay)
{
return new Variable();
}

public static Variable sound_effect_flanger(Variable snd, Variable wetdry, Variable depth, Variable feedback, Variable frequency, Variable wave, Variable delay, Variable phase)
{
return new Variable();
}

public static Variable sound_effect_gargle(Variable snd, Variable rate, Variable wave)
{
return new Variable();
}

public static Variable sound_effect_reverb(Variable snd, Variable gain, Variable mix, Variable time, Variable ratio)
{
return new Variable();
}

public static Variable sound_effect_compressor(Variable snd, Variable gain, Variable attack, Variable release, Variable threshold, Variable ratio, Variable delay)
{
return new Variable();
}

public static Variable sound_effect_equalizer(Variable snd, Variable center, Variable bandwidth, Variable gain)
{
return new Variable();
}

/*
 * 
 * 3D sound
 * 
 */
public static Variable sound_3d_set_sound_position(Variable snd, Variable x, Variable y, Variable z)
{
return new Variable();
}

public static Variable sound_3d_set_sound_velocity(Variable snd, Variable x, Variable y, Variable z)
{
return new Variable();
}

public static Variable sound_3d_set_sound_distance(Variable snd, Variable mindist, Variable maxdist)
{
return new Variable();
}

public static Variable sound_3d_set_sound_cone(Variable snd, Variable x, Variable y, Variable z, Variable anglein, Variable angleout, Variable voloutside)
{
return new Variable();
}

/*
 * 
 * CD music
 * 
 */
public static Variable cd_init()
{
return new Variable();
}

public static Variable cd_present()
{
return new Variable();
}

public static Variable cd_number()
{
return new Variable();
}

public static Variable cd_playing()
{
return new Variable();
}

public static Variable cd_paused()
{
return new Variable();
}

public static Variable cd_track()
{
return new Variable();
}

public static Variable cd_length()
{
return new Variable();
}

public static Variable cd_track_length(Variable n)
{
return new Variable();
}

public static Variable cd_position()
{
return new Variable();
}

public static Variable cd_track_position()
{
return new Variable();
}

public static Variable cd_play(Variable first, Variable last)
{
return new Variable();
}

public static Variable cd_stop()
{
return new Variable();
}

public static Variable cd_pause()
{
return new Variable();
}

public static Variable cd_resume()
{
return new Variable();
}

public static Variable cd_set_position(Variable pos)
{
return new Variable();
}

public static Variable cd_set_track_position(Variable pos)
{
return new Variable();
}

public static Variable cd_open_door()
{
return new Variable();
}

public static Variable cd_close_door()
{
return new Variable();
}

public static Variable MCI_command(Variable str)
{
return new Variable();
}

/*
 * 
 * Splash screens
 * 
 */
public static Variable show_image(Variable fname, Variable full, Variable delay)
{
return new Variable();
}

public static Variable show_video(Variable fname, Variable full, Variable loop)
{
return new Variable();
}

public static Variable show_text(Variable fname, Variable full, Variable backcol, Variable delay)
{
return new Variable();
}

public static Variable show_info()
{
return new Variable();
}

public static Variable load_info(Variable fname)
{
return new Variable();
}

/*
 * 
 * Pop-up messages and questions
 * 
 */
public static Variable show_message(Variable str)
{
    JOptionPane.showMessageDialog(null, str.toString());
return new Variable();
}

public static Variable show_message_ext(Variable str, Variable but1, Variable but2, Variable but3)
{
return new Variable();
}

public static Variable show_question(Variable str)
{
return new Variable();
}

public static Variable get_integer(Variable str, Variable def)
{
return new Variable();
}

public static Variable get_string(Variable str, Variable def)
{
return new Variable();
}

public static Variable message_background(Variable back)
{
return new Variable();
}

public static Variable message_button(Variable sprite)
{
return new Variable();
}

public static Variable message_alpha(Variable alpha)
{
return new Variable();
}

public static Variable message_text_font(Variable name, Variable size, Variable color, Variable style)
{
return new Variable();
}

public static Variable message_button_font(Variable name, Variable size, Variable color, Variable style)
{
return new Variable();
}

public static Variable message_input_font(Variable name, Variable size, Variable color, Variable style)
{
return new Variable();
}

public static Variable message_mouse_color(Variable col)
{
return new Variable();
}

public static Variable message_input_color(Variable col)
{
return new Variable();
}

public static Variable message_position(Variable x, Variable y)
{
return new Variable();
}

public static Variable message_size(Variable w, Variable h)
{
return new Variable();
}

public static Variable message_caption(Variable show, Variable str)
{
return new Variable();
}

public static Variable show_menu(Variable str, Variable def)
{
return new Variable();
}

public static Variable show_menu_pos(Variable x, Variable y, Variable str, Variable def)
{
return new Variable();
}

public static Variable get_color(Variable defcol)
{
return new Variable();
}

public static Variable get_open_filename(Variable filter, Variable fname)
{
return new Variable();
}

public static Variable get_save_filename(Variable filter, Variable fname)
{
return new Variable();
}

public static Variable get_directory(Variable dname)
{
return new Variable();
}

public static Variable get_directory_alt(Variable capt, Variable root)
{
return new Variable();
}

public static Variable show_error(Variable str, Variable abort)
{
    JOptionPane.showMessageDialog(null, str.toString(),"Error!",JOptionPane.ERROR_MESSAGE );
    if (abort.getBoolean())
        System.exit(1);
    
    return new Variable();
}

/*
 * 
 * Highscore list
 * 
 */
public static Variable highscore_show_ext(Variable numb, Variable back, Variable border, Variable col1, Variable col2, Variable name, Variable size)
{
return new Variable();
}

public static Variable highscore_show(Variable numb)
{
return new Variable();
}

public static Variable highscore_set_background(Variable back)
{
return new Variable();
}

public static Variable highscore_set_border(Variable show)
{
return new Variable();
}

public static Variable highscore_set_font(Variable name, Variable size, Variable style)
{
return new Variable();
}

public static Variable highscore_set_strings(Variable caption, Variable nobody, Variable escape)
{
return new Variable();
}

public static Variable highscore_set_colors(Variable back, Variable newc, Variable other)
{
return new Variable();
}

public static Variable highscore_clear()
{
return new Variable();
}

public static Variable highscore_add(Variable str, Variable numb)
{
return new Variable();
}

public static Variable highscore_add_current()
{
return new Variable();
}

public static Variable highscore_value(Variable place)
{
return new Variable();
}

public static Variable highscore_name(Variable place)
{
return new Variable();
}

public static Variable draw_highscore(Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Variable();
}

/*
 * 
 * Sprites
 * 
 */
public static Variable sprite_exists(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_name(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_number(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_width(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_height(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_transparent(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_smooth(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_preload(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_xoffset(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_yoffset(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_bbox_mode(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_bbox_left(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_bbox_right(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_bbox_top(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_bbox_bottom(Variable ind)
{
return new Variable();
}

public static Variable sprite_get_precise(Variable ind)
{
return new Variable();
}

/*
 * 
 * Sounds
 * 
 */
public static Variable sound_exists(Variable ind)
{
return new Variable();
}

public static Variable sound_get_name(Variable ind)
{
return new Variable();
}

public static Variable sound_get_kind(Variable ind)
{
return new Variable();
}

public static Variable sound_get_preload(Variable ind)
{
return new Variable();
}

public static Variable sound_discard(Variable ind)
{
return new Variable();
}

public static Variable sound_restore(Variable ind)
{
return new Variable();
}

/*
 * 
 * Backgrounds
 * 
 */
public static Variable background_exists(Variable ind)
{
return new Variable();
}

public static Variable background_get_name(Variable ind)
{
return new Variable();
}

public static Variable background_get_width(Variable ind)
{
return new Variable();
}

public static Variable background_get_height(Variable ind)
{
return new Variable();
}

public static Variable background_get_transparent(Variable ind)
{
return new Variable();
}

public static Variable background_get_smooth(Variable ind)
{
return new Variable();
}

public static Variable background_get_preload(Variable ind)
{
return new Variable();
}

/*
 * 
 * Fonts
 * 
 */
public static Variable font_exists(Variable ind)
{
return new Variable();
}

public static Variable font_get_name(Variable ind)
{
return new Variable();
}

public static Variable font_get_fontname(Variable ind)
{
return new Variable();
}

public static Variable font_get_bold(Variable ind)
{
return new Variable();
}

public static Variable font_get_italic(Variable ind)
{
return new Variable();
}

public static Variable font_get_first(Variable ind)
{
return new Variable();
}

public static Variable font_get_last(Variable ind)
{
return new Variable();
}

/*
 * 
 * Paths
 * 
 */
public static Variable path_exists(Variable ind)
{
return new Variable();
}

public static Variable path_get_name(Variable ind)
{
return new Variable();
}

public static Variable path_get_length(Variable ind)
{
return new Variable();
}

public static Variable path_get_kind(Variable ind)
{
return new Variable();
}

public static Variable path_get_closed(Variable ind)
{
return new Variable();
}

public static Variable path_get_precision(Variable ind)
{
return new Variable();
}

public static Variable path_get_number(Variable ind)
{
return new Variable();
}

public static Variable path_get_point_x(Variable ind, Variable n)
{
return new Variable();
}

public static Variable path_get_point_y(Variable ind, Variable n)
{
return new Variable();
}

public static Variable path_get_point_speed(Variable ind, Variable n)
{
return new Variable();
}

public static Variable path_get_x(Variable ind, Variable pos)
{
return new Variable();
}

public static Variable path_get_y(Variable ind, Variable pos)
{
return new Variable();
}

public static Variable path_get_speed(Variable ind, Variable pos)
{
return new Variable();
}


/*
 * 
 * Scripts
 * 
 */
public static Variable script_exists(Variable ind)
{
return new Variable();
}

public static Variable script_get_name(Variable ind)
{
return new Variable();
}

public static Variable script_get_text(Variable ind)
{
return new Variable();
}

/*
 * 
 * Time lines
 * 
 */
public static Variable timeline_exists(Variable ind)
{
return new Variable();
}

public static Variable timeline_get_name(Variable ind)
{
return new Variable();
}

/*
 * 
 * Variables
 * 
 */
public static Variable actor_exists(Variable ind)
{
return new Variable();
}

public static Variable actor_get_name(Variable ind)
{
return ind;
}

public static Variable Variable_get_sprite(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_solid(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_visible(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_depth(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_persistent(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_mask(Variable ind)
{
return new Variable();
}

public static Variable Variable_get_parent(Variable ind)
{
return new Variable();
}

public static Variable Variable_is_ancestor(Variable ind1, Variable ind2)
{
return new Variable();
}

/*
 * 
 * Rooms
 * 
 */

public static Variable room_exists(Variable ind)
{
return new Variable();
}

public static Variable room_get_name(Variable ind)
{
return new Variable();
}

/*
 * 
 * Changing Sprites
 * 
 */
public static Variable sprite_set_offset(Variable ind, Variable xoff, Variable yoff)
{
return new Variable();
}

public static Variable sprite_set_bbox_mode(Variable ind, Variable mode)
{
return new Variable();
}

public static Variable sprite_set_bbox(Variable ind, Variable left, Variable top, Variable right, Variable bottom)
{
return new Variable();
}

public static Variable sprite_set_precise(Variable ind, Variable mode)
{
return new Variable();
}

public static Variable sprite_duplicate(Variable ind)
{
return new Variable();
}

public static Variable sprite_assign(Variable ind, Variable source)
{
return new Variable();
}

public static Variable sprite_merge(Variable ind1, Variable ind2)
{
return new Variable();
}

public static Variable sprite_add(Variable fname, Variable imgnumb, Variable precise, Variable transparent, Variable smooth, Variable preload, Variable xorig, Variable yorig)
{
return new Variable();
}

public static Variable sprite_replace(Variable ind, Variable fname, Variable imgnumb, Variable precise, Variable transparent, Variable smooth, Variable preload, Variable xorig, Variable yorig)
{
return new Variable();
}

public static Variable sprite_create_from_screen(Variable x, Variable y, Variable w, Variable h, Variable precise, Variable transparent, Variable smooth, Variable preload, Variable xorig, Variable yorig)
{
return new Variable();
}

public static Variable sprite_add_from_screen(Variable ind, Variable x, Variable y, Variable w, Variable h)
{
return new Variable();
}

public static Variable sprite_create_from_surface(Variable id, Variable x, Variable y, Variable w, Variable h, Variable precise, Variable transparent, Variable smooth, Variable preload, Variable xorig, Variable yorig)
{
return new Variable();
}

public static Variable sprite_add_from_surface(Variable ind, Variable id, Variable x, Variable y, Variable w, Variable h)
{
return new Variable();
}

public static Variable sprite_delete(Variable ind)
{
return new Variable();
}

public static Variable sprite_set_alpha_from_sprite(Variable ind, Variable spr)
{
return new Variable();
}

/*
 * 
 * Changing Sounds
 * 
 */
public static Variable sound_add(Variable fname, Variable kind, Variable preload)
{
return new Variable();
}

public static Variable sound_replace(Variable ind, Variable fname, Variable kind, Variable preload)
{
return new Variable();
}

public static Variable sound_delete(Variable ind)
{
return new Variable();
}

/*
 * 
 * Changing Backgrounds
 * 
 */
public static Variable background_duplicate(Variable ind)
{
return new Variable();
}

public static Variable background_assign(Variable ind, Variable source)
{
return new Variable();
}

public static Variable background_add(Variable fname, Variable transparent, Variable smooth, Variable preload)
{
return new Variable();
}

public static Variable background_replace(Variable ind, Variable fname, Variable transparent, Variable smooth, Variable preload)
{
return new Variable();
}

public static Variable background_create_color(Variable w, Variable h, Variable col, Variable preload)
{
return new Variable();
}

public static Variable background_create_gradient(Variable w, Variable h, Variable col1, Variable col2, Variable kind, Variable preload)
{
return new Variable();
}

public static Variable background_create_from_screen(Variable x, Variable y, Variable w, Variable h, Variable transparent, Variable smooth, Variable preload)
{
return new Variable();
}

public static Variable background_create_from_surface(Variable id, Variable x, Variable y, Variable w, Variable h, Variable transparent, Variable smooth, Variable preload)
{
return new Variable();
}

public static Variable background_delete(Variable ind)
{
return new Variable();
}

public static Variable background_set_alpha_from_background(Variable ind, Variable back)
{
return new Variable();
}

/*
 * 
 * Changing Fonts
 * 
 */
public static Variable font_add(Variable name, Variable size, Variable bold, Variable italic, Variable first, Variable last)
{
return new Variable();
}

public static Variable font_add_sprite(Variable spr, Variable first, Variable prop, Variable sep)
{
return new Variable();
}

public static Variable font_replace(Variable ind, Variable name, Variable size, Variable bold, Variable italic, Variable first, Variable last)
{
return new Variable();
}

public static Variable font_replace_sprite(Variable ind, Variable spr, Variable first, Variable prop, Variable sep)
{
return new Variable();
}

public static Variable font_delete(Variable ind)
{
return new Variable();
}

/*
 * 
 * Changing Paths
 * 
 */
public static Variable path_set_kind(Variable ind, Variable kind)
{
return new Variable();
}

public static Variable path_set_closed(Variable ind, Variable closed)
{
return new Variable();
}

public static Variable path_set_precision(Variable ind, Variable prec)
{
return new Variable();
}

public static Variable path_add()
{
return new Variable();
}

public static Variable path_assign(Variable ind, Variable path)
{
return new Variable();
}

public static Variable path_duplicate(Variable ind)
{
return new Variable();
}

public static Variable path_append(Variable ind, Variable path)
{
return new Variable();
}

public static Variable path_delete(Variable ind)
{
return new Variable();
}

public static Variable path_add_point(Variable ind, Variable x, Variable y, Variable speed)
{
return new Variable();
}

public static Variable path_insert_point(Variable ind, Variable n, Variable x, Variable y, Variable speed)
{
return new Variable();
}

public static Variable path_change_point(Variable ind, Variable n, Variable x, Variable y, Variable speed)
{
return new Variable();
}

public static Variable path_delete_point(Variable ind, Variable n)
{
return new Variable();
}

public static Variable path_clear_points(Variable ind)
{
return new Variable();
}

public static Variable path_reverse(Variable ind)
{
return new Variable();
}

public static Variable path_mirror(Variable ind)
{
return new Variable();
}

public static Variable path_flip(Variable ind)
{
return new Variable();
}

public static Variable path_rotate(Variable ind, Variable angle)
{
return new Variable();
}

public static Variable path_scale(Variable ind, Variable xscale, Variable yscale)
{
return new Variable();
}

public static Variable path_shift(Variable ind, Variable xshift, Variable yshift)
{
return new Variable();
}

/*
 * 
 * Changing Scripts
 * 
 */

public static Variable execute_string(Variable str)
{
return new Variable();
}

public static Variable execute_file(Variable fname)
{
return new Variable();
}

public static Variable script_execute(Variable ind, Variable arg0, Variable arg1)
{
return new Variable();
}

/*
 * 
 * Changing Time lines
 * 
 */

public static Variable timeline_add()
{
return new Variable();
}

public static Variable timeline_delete(Variable ind)
{
return new Variable();
}

public static Variable timeline_moment_clear(Variable ind, Variable step)
{
return new Variable();
}

public static Variable timeline_moment_add(Variable ind, Variable step, Variable codestr)
{
return new Variable();
}

/*
 * 
 * Changing Variables
 * 
 */
public static Variable Variable_set_sprite(Variable ind, Variable spr)
{
return new Variable();
}

public static Variable Variable_set_solid(Variable ind, Variable solid)
{
return new Variable();
}

public static Variable Variable_set_visible(Variable ind, Variable vis)
{
return new Variable();
}

public static Variable Variable_set_depth(Variable ind, Variable depth)
{
return new Variable();
}

public static Variable Variable_set_persistent(Variable ind, Variable pers)
{
return new Variable();
}

public static Variable Variable_set_mask(Variable ind, Variable spr)
{
return new Variable();
}

public static Variable Variable_set_parent(Variable ind, Variable obj)
{
return new Variable();
}

public static Variable Variable_add()
{
return new Variable();
}

public static Variable Variable_delete(Variable ind)
{
return new Variable();
}

public static Variable Variable_event_clear(Variable ind, Variable evtype, Variable evnumb)
{
return new Variable();
}

public static Variable Variable_event_add(Variable ind, Variable evtype, Variable evnumb, Variable codestr)
{
return new Variable();
}

/*
 * 
 * Changing rooms
 * 
 */
public static Variable room_set_width(Variable ind, Variable w)
{
return new Variable();
}

public static Variable room_set_height(Variable ind, Variable h)
{
return new Variable();
}

public static Variable room_set_caption(Variable ind, Variable str)
{
return new Variable();
}

public static Variable room_set_persistent(Variable ind, Variable pers)
{
return new Variable();
}

public static Variable room_set_code(Variable ind, Variable codestr)
{
return new Variable();
}

public static Variable room_set_background_color(Variable ind, Variable col, Variable show)
{
return new Variable();
}

public static Variable room_set_background(Variable ind, Variable bind, Variable vis, Variable fore, Variable back, Variable x, Variable y, Variable htiled, Variable vtiled, Variable hspeed, Variable vspeed, Variable alpha)
{
return new Variable();
}

public static Variable room_set_view(Variable ind, Variable vind, Variable vis, Variable xview, Variable yview, Variable wview, Variable hview, Variable xport, Variable yport, Variable wport, Variable hport, Variable hborder, Variable vborder, Variable hspeed, Variable vspeed, Variable obj)
{
return new Variable();
}

public static Variable room_set_view_enabled(Variable ind, Variable val)
{
return new Variable();
}

public static Variable room_add()
{
return new Variable();
}

public static Variable room_duplicate(Variable ind)
{
return new Variable();
}

public static Variable room_assign(Variable ind, Variable source)
{
return new Variable();
}

public static Variable room_instance_add(Variable ind, Variable x, Variable y, Variable obj)
{
return new Variable();
}

public static Variable room_instance_clear(Variable ind)
{
return new Variable();
}

public static Variable room_tile_add(Variable ind, Variable back, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable depth)
{
return new Variable();
}

public static Variable room_tile_add_ext(Variable ind, Variable back, Variable left, Variable top, Variable width, Variable height, Variable x, Variable y, Variable depth, Variable xscale, Variable yscale, Variable alpha)
{
return new Variable();
}

public static Variable room_tile_clear(Variable ind)
{
return new Variable();
}

/*
 * 
 * Files
 * 
 */
public static Variable file_text_open_read(Variable fname)
{
File f = new File();
    f.open(fname.getString(), 1);
    return f;
}

public static Variable file_text_open_write(Variable fname)
{
    File f = new File();
    f.open(fname.getString(), 0);
    return f;
}

public static Variable file_text_open_append(Variable fname)
{
File f = new File();
    f.openAppend(fname.getString());
    return f;
}

public static Variable file_text_close(Variable file)
{
    if (file instanceof File)
    {
        ((File)file).close();
    }
return new Variable();
}

public static Variable file_text_write_string(Variable file, Variable str)
{
    if (file instanceof File)
    {
        ((File)file).writeString(str.getString());
    }
return new Variable();
}

public static Variable file_text_write_real(Variable file, Variable val)
{
    if (file instanceof File)
    {
        ((File)file).writeDouble(val.getDouble());
    }
return new Variable();
}

public static Variable file_text_writeln(Variable file)
{
    if (file instanceof File)
    {
        ((File)file).newLine();
    }
return new Variable();
}

public static Variable file_text_read_string(Variable file)
{
    String str = new String("");
    if (file instanceof File)
    {
      str =  ((File)file).readString();
    }
return str;
}

public static Variable file_text_read_real(Variable file)
{
    //String str = new String("");
    try{
    if (file instanceof File)
    {
     return new Double( java.lang.Double.parseDouble(""+((File)file).readString()));
    }
    }catch(Exception e){}
return new Variable();
}

public static Variable file_text_readln(Variable file)
{
    if (file instanceof File)
    {
      ((File)file).readln();
    }
return new Variable();
}

public static Variable file_text_eof(Variable file)
{
    if (file instanceof File)
    {
     return new Boolean( ((File)file).endOfFile());
    }
return new Variable();
}

public static Variable file_exists(Variable fname)
{
return new Boolean(File.exists(fname.getString()));
}

public static Variable file_delete(Variable fname)
{
    File.delete(fname.toString());
return new Variable();
}

public static Variable file_rename(Variable oldname, Variable newname)
{
    File.rename(oldname.toString(), newname.toString());
return new Variable();
}

public static Variable file_copy(Variable fname, Variable newname)
{
    File.copy(fname.toString(), newname.toString());
return new Variable();
}

public static Variable directory_exists(Variable dname)
{
return new Boolean(File.exists(dname.getString()));
}

public static Variable directory_create(Variable dname)
{
    (new java.io.File(dname.toString())).mkdirs();
return new Variable();
}

public static Variable file_find_first(Variable mask, Variable attr)
{
return new Variable();
}

public static Variable file_find_next()
{
return new Variable();
}

public static Variable file_find_close()
{
return new Variable();
}

public static Variable file_attributes(Variable fname, Variable attr)
{
return new Variable();
}

public static Variable filename_path(Variable fname)
{
return new String(""+fname.toString().substring(0, fname.toString().lastIndexOf(java.io.File.separator)+1));
}

public static Variable filename_name(Variable fname)
{
return new String(""+fname.toString().substring(fname.toString().lastIndexOf(java.io.File.separator)+1,fname.toString().length()));
}

public static Variable filename_dir(Variable fname)
{
return new String(""+fname.toString().substring(0, fname.toString().lastIndexOf(java.io.File.separator)));
}

public static Variable filename_drive(Variable fname)
{
return new String(""+fname.toString().substring(0, fname.toString().indexOf(java.io.File.separator)));
}

public static Variable filename_ext(Variable fname)
{
return new String(""+fname.toString().substring(fname.toString().length()-4,fname.toString().length()));

}

public static Variable filename_change_ext(Variable fname, Variable newext)
{
return new String(""+fname.toString().substring(0, fname.toString().length()-4)+newext.toString());
}

public static Variable file_bin_open(Variable fname, Variable mode)
{
    BinaryFile bf = new BinaryFile();
    bf.open(""+fname);
return bf;
}

public static Variable file_bin_rewrite(Variable file)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).rewrite();
    }
return new Variable();
}

public static Variable file_bin_close(Variable file)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).close();
    }
return new Variable();
}

public static Variable file_bin_position(Variable file)
{
    if (file instanceof BinaryFile)
    {
    return new Double(((BinaryFile)file).getPosition());
    }
return new Variable();
}

public static Variable file_bin_size(Variable file)
{
    if (file instanceof BinaryFile)
    {
    return new Double(((BinaryFile)file).getSize());
    }
return new Variable();
}

public static Variable file_bin_seek(Variable file, Variable pos)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).seek(pos.getInt());
    }
return new Variable();
}

public static Variable file_bin_write_byte(Variable file, Variable BYTE)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).writeByte((byte)BYTE.getInt());
    }
return new Variable();
}

public static Variable file_bin_read_byte(Variable file)
{
    if (file instanceof BinaryFile)
    {
    return new Integer(((BinaryFile)file).readByte());
    }
return new Variable();
}

public static Variable parameter_count()
{
return new Integer(Game.parameter_count);
}

public static Variable parameter_string(Variable n)
{
    try{
return new String(Game.parameters[n.getInt()]);
    }catch(Exception e){
   return new Variable();
    }
}

public static Variable environment_get_variable(Variable name)
{
return new String(System.getenv(""+name));
}

/*
 * 
 * Registry
 * 
 */
public static Variable registry_write_string(Variable name, Variable str)
{
return new Variable();
}

public static Variable registry_write_real(Variable name, Variable value)
{
return new Variable();
}

public static Variable registry_read_string(Variable name)
{
return new Variable();
}

public static Variable registry_read_real(Variable name)
{
return new Variable();
}

public static Variable registry_exists(Variable name)
{
return new Variable();
}

public static Variable registry_write_string_ext(Variable key, Variable name, Variable str)
{
return new Variable();
}

public static Variable registry_write_real_ext(Variable key, Variable name, Variable value)
{
return new Variable();
}

public static Variable registry_read_string_ext(Variable key, Variable name)
{
return new Variable();
}

public static Variable registry_read_real_ext(Variable key, Variable name)
{
return new Variable();
}

public static Variable registry_exists_ext(Variable key, Variable name)
{
return new Variable();
}

public static Variable registry_set_root(Variable root)
{
return new Variable();
}

/*
 * 
 * Ini files
 * 
 */
public static Variable ini_open(Variable fname)
{
return new Variable();
}

public static Variable ini_close()
{
return new Variable();
}

public static Variable ini_read_string(Variable section, Variable key, Variable DEFAULT)
{
return new Variable();
}

public static Variable ini_read_real(Variable section, Variable key, Variable DEFAULT)
{
return new Variable();
}

public static Variable ini_write_string(Variable section, Variable key, Variable str)
{
return new Variable();
}

public static Variable ini_write_real(Variable section, Variable key, Variable value)
{
return new Variable();
}

public static Variable ini_key_exists(Variable section, Variable key)
{
return new Variable();
}

public static Variable ini_section_exists(Variable section)
{
return new Variable();
}

public static Variable ini_key_delete(Variable section, Variable key)
{
return new Variable();
}

public static Variable ini_section_delete(Variable section)
{
return new Variable();
}

/*
 * 
 * Executing programs
 * 
 */
public static Variable execute_program(Variable prog, Variable arg, Variable wait)
{
	try {
        java.lang.Process proc = java.lang.Runtime.getRuntime().exec(""+prog +" "+ arg);
        
        if (wait.getBoolean()) {
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException raised: " + e.getMessage());
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        System.err.println("Execute program exception!");
    }
    return new Variable();
}

public static Variable execute_shell(Variable prog, Variable arg)
{
	execute_program(new String("bash -i " + prog), arg, new Boolean(false));
return new Variable();
}

/*
 * Data Structures
 */
public static Variable ds_set_precision(Variable prec)
{
return new Variable();
}

/*
 * 
 * Stacks
 * 
 */
public static Variable ds_stack_create()
{
return new Stack();
}

public static Variable ds_stack_destroy(Variable id)
{
    if (id instanceof Stack)
    {
      ((Stack)id).destroy();
    }
return new Variable();
}

public static Variable ds_stack_clear(Variable id)
{
    if (id instanceof Stack)
    {
      ((Stack)id).clear();
    }
return new Variable();
}

public static Variable ds_stack_size(Variable id)
{
     if (id instanceof Stack)
    {
     return new Integer(((Stack)id).size());
    }
return new Variable();
}

public static Variable ds_stack_empty(Variable id)
{
    if (id instanceof Stack)
    {
     return new Boolean(((Stack)id).empty());
    }
return new Variable();
}

public static Variable ds_stack_push(Variable id, Variable value)
{
    if (id instanceof Stack)
    {
     ((Stack)id).push(value);
    }
return new Variable();
}

public static Variable ds_stack_pop(Variable id)
{
    if (id instanceof Stack)
    {
     return ((Stack)id).pop();
    }
return new Variable();
}

public static Variable ds_stack_top(Variable id)
{
     if (id instanceof Stack)
    {
     return ((Stack)id).top();
    }
return new Variable();
}

/*
 * 
 * Queues
 * 
 */
public static Variable ds_queue_create()
{
    
return new Queue();
}

public static Variable ds_queue_destroy(Variable id)
{
     if (id instanceof Queue)
    {
     ((Queue)id).destroy();
    }
return new Variable();
}

public static Variable ds_queue_clear(Variable id)
{
    if (id instanceof Queue)
    {
     ((Queue)id).clear();
    }
return new Variable();
}

public static Variable ds_queue_size(Variable id)
{
    if (id instanceof Queue)
    {
    return new Integer(((Queue)id).size());
    }
return new Variable();
}

public static Variable ds_queue_empty(Variable id)
{
    if (id instanceof Queue)
    {
    return new Boolean(((Queue)id).empty());
    }
return new Variable();
}

public static Variable ds_queue_enqueue(Variable id, Variable value)
{
    if (id instanceof Queue)
    {
    ((Queue)id).enqueue(value);
    }
return new Variable();
}

public static Variable ds_queue_dequeue(Variable id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).dequeue();
    }
return new Variable();
}

public static Variable ds_queue_head(Variable id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).head();
    }
return new Variable();
}

public static Variable ds_queue_tail(Variable id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).tail();
    }
return new Variable();
}

/*
 * 
 * Lists
 * 
 */
public static Variable ds_list_create()
{
return new List();
}

public static Variable ds_list_destroy(Variable id)
{
    if (id instanceof List)
    {
     ((List)id).destroy();
    }
return new Variable();
}

public static Variable ds_list_clear(Variable id)
{
    if (id instanceof List)
    {
     ((List)id).clear();
    }
return new Variable();
}

public static Variable ds_list_size(Variable id)
{
     if (id instanceof List)
    {
    return new Integer(((List)id).size());
    }
return new Variable();
}

public static Variable ds_list_empty(Variable id)
{
    if (id instanceof List)
    {
    return new Boolean(((List)id).empty());
    }
return new Variable();
}

public static Variable ds_list_add(Variable id, Variable value)
{
    if (id instanceof List)
    {
    ((List)id).addel(value);
    }
return new Variable();
}

public static Variable ds_list_insert(Variable id, Variable pos, Variable value)
{
    if (id instanceof List)
    {
    ((List)id).insert(pos,value);
    }
return new Variable();
}

public static Variable ds_list_replace(Variable id, Variable pos, Variable value)
{
    if (id instanceof List)
    {
    ((List)id).replace(pos,value);
    }
return new Variable();
}

public static Variable ds_list_delete(Variable id, Variable pos)
{
    if (id instanceof List)
    {
    ((List)id).delete(pos);
    }
return new Variable();
}

public static Variable ds_list_find_index(Variable id, Variable value)
{
return new Variable();
}

public static Variable ds_list_find_value(Variable id, Variable pos)
{
    if (id instanceof List)
    {
    return ((List)id).find_value(pos);
    }
return new Variable();
}

public static Variable ds_list_sort(Variable id, Variable ascending)
{
return new Variable();
}

/*
 * 
 * Maps
 * 
 */
public static Variable ds_map_create()
{
return new Map();
}

public static Variable ds_map_destroy(Variable id)
{
     if (id instanceof Map)
    {
     ((Map)id).destroy();
    }
return new Variable();
}

public static Variable ds_map_clear(Variable id)
{
    if (id instanceof Map)
    {
     ((Map)id).clear();
    }
return new Variable();
}

public static Variable ds_map_size(Variable id)
{
    if (id instanceof Map)
    {
    return new Integer(((Map)id).size());
    }
return new Variable();
}

public static Variable ds_map_empty(Variable id)
{
    if (id instanceof Map)
    {
    return new Boolean(((Map)id).empty());
    }
return new Variable();
}

public static Variable ds_map_add(Variable id, Variable key, Variable value)
{
    if (id instanceof Map)
    {
    ((Map)id).add(key,value);
    }
return new Variable();
}

public static Variable ds_map_replace(Variable id, Variable key, Variable value)
{
    if (id instanceof Map)
    {
    ((Map)id).add(key,value);
    }
return new Variable();
}

public static Variable ds_map_delete(Variable id, Variable key)
{
    if (id instanceof Map)
    {
    ((Map)id).delete(key);
    }
return new Variable();
}

public static Variable ds_map_exists(Variable id, Variable key)
{
    if (id instanceof Map)
    {
    return new Boolean(((Map)id).exists(key));
    }
return new Variable();
}

public static Variable ds_map_find_value(Variable id, Variable key)
{
    if (id instanceof Map)
    {
    return (((Map)id).find(key));
    }
return new Variable();
}

public static Variable ds_map_find_previous(Variable id, Variable key)
{
    if (id instanceof Map)
        return ((Map)id).findPrevious(key);
    return new Variable();
}

public static Variable ds_map_find_next(Variable id, Variable key)
{
    if (id instanceof Map)
        return ((Map)id).findNext(key);
    return new Variable();
}

public static Variable ds_map_find_first(Variable id)
{
    if (id instanceof Map)
        return ((Map)id).findFirst();
    return new Variable();
}

public static Variable ds_map_find_last(Variable id)
{
    if (id instanceof Map)
        return ((Map)id).findLast();
    return new Variable();
}

/*
 * 
 * Priority queues
 * 
 */
public static Variable ds_priority_create()
{
    return new PriorityQueue();
}

public static Variable ds_priority_destroy(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).destroy();
    }
    return new Variable();
}

public static Variable ds_priority_clear(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).clear();
    }
    return new Variable();
}

public static Variable ds_priority_size(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return new Integer(((PriorityQueue)id).size());
    }
    return new Variable();
}

public static Variable ds_priority_empty(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return new Boolean(((PriorityQueue)id).isEmpty());
    }
    return new Variable();
}

public static Variable ds_priority_add(Variable id, Variable value, Variable priority)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).add(value, priority);
    }
    return new Variable();
}

public static Variable ds_priority_change_priority(Variable id, Variable value, Variable priority)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).changePriority(value, priority);
    }
    return new Variable();
}

public static Variable ds_priority_find_priority(Variable id, Variable value)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findPriority(value);
    }
    return new Variable();
}

public static Variable ds_priority_delete_value(Variable id, Variable value)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).deleteValue(value);
    }
    return new Variable();
}

public static Variable ds_priority_delete_min(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).deleteMin();
    }
    return new Variable();
}

public static Variable ds_priority_find_min(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findMin();
    }
    return new Variable();
}

public static Variable ds_priority_delete_max(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).deleteMax();
    }
    return new Variable();
}

public static Variable ds_priority_find_max(Variable id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findMax();
    }
    return new Variable();
}

/*
 * 
 * Grids
 * 
 */
public static Variable ds_grid_create(Variable w, Variable h)
{
return new Variable();
}

public static Variable ds_grid_destroy(Variable id)
{
return new Variable();
}

public static Variable ds_grid_resize(Variable id, Variable w, Variable h)
{
return new Variable();
}

public static Variable ds_grid_width(Variable id)
{
return new Variable();
}

public static Variable ds_grid_height(Variable id)
{
return new Variable();
}

public static Variable ds_grid_clear(Variable id, Variable val)
{
return new Variable();
}

public static Variable ds_grid_set(Variable id, Variable x, Variable y, Variable val)
{
return new Variable();
}

public static Variable ds_grid_add(Variable id, Variable x, Variable y, Variable val)
{
return new Variable();
}

public static Variable ds_grid_multiply(Variable id, Variable x, Variable y, Variable val)
{
return new Variable();
}

public static Variable ds_grid_set_region(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_add_region(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_multiply_region(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_set_disk(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

public static Variable ds_grid_add_disk(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

public static Variable ds_grid_multiply_disk(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

public static Variable ds_grid_get(Variable id, Variable x, Variable y)
{
return new Variable();
}

public static Variable ds_grid_get_sum(Variable id, Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Variable();
}

public static Variable ds_grid_get_max(Variable id, Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Variable();
}

public static Variable ds_grid_get_min(Variable id, Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Variable();
}

public static Variable ds_grid_get_mean(Variable id, Variable x1, Variable y1, Variable x2, Variable y2)
{
return new Variable();
}

public static Variable ds_grid_get_disk_sum(Variable id, Variable xm, Variable ym, Variable r)
{
return new Variable();
}

public static Variable ds_grid_get_disk_min(Variable id, Variable xm, Variable ym, Variable r)
{
return new Variable();
}

public static Variable ds_grid_get_disk_max(Variable id, Variable xm, Variable ym, Variable r)
{
return new Variable();
}

public static Variable ds_grid_get_disk_mean(Variable id, Variable xm, Variable ym, Variable r)
{
return new Variable();
}

public static Variable ds_grid_value_exists(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_value_x(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_value_y(Variable id, Variable x1, Variable y1, Variable x2, Variable y2, Variable val)
{
return new Variable();
}

public static Variable ds_grid_value_disk_exists(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

public static Variable ds_grid_value_disk_x(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

public static Variable ds_grid_value_disk_y(Variable id, Variable xm, Variable ym, Variable r, Variable val)
{
return new Variable();
}

/*
 * 
 * Simple Effects
 * 
 */
public static Variable effect_create_below(Variable kind, Variable x, Variable y, Variable size, Variable color)
{
return new Variable();
}

public static Variable effect_create_above(Variable kind, Variable x, Variable y, Variable size, Variable color)
{
return new Variable();
}

public static Variable effect_clear()
{
return new Variable();
}

/*
 * 
 * Particle types
 * 
 */
public static Variable part_type_create()
{
return new Variable();
}

public static Variable part_type_destroy(Variable ind)
{
return new Variable();
}

public static Variable part_type_exists(Variable ind)
{
return new Variable();
}

public static Variable part_type_clear(Variable ind)
{
return new Variable();
}

public static Variable part_type_shape(Variable ind, Variable shape)
{
return new Variable();
}

public static Variable part_type_sprite(Variable ind, Variable sprite, Variable animat, Variable stretch, Variable random)
{
return new Variable();
}

public static Variable part_type_size(Variable ind, Variable size_min, Variable size_max, Variable size_incr, Variable size_wiggle)
{
return new Variable();
}

public static Variable part_type_scale(Variable ind, Variable xscale, Variable yscale)
{
return new Variable();
}

public static Variable part_type_orientation(Variable ind, Variable ang_min, Variable ang_max, Variable ang_incr, Variable ang_wiggle, Variable ang_relative)
{
return new Variable();
}

public static Variable part_type_life(Variable ind, Variable life_min, Variable life_max)
{
return new Variable();
}

public static Variable part_type_step(Variable ind, Variable step_number, Variable step_type)
{
return new Variable();
}

public static Variable part_type_death(Variable ind, Variable death_number, Variable death_type)
{
return new Variable();
}

public static Variable part_type_speed(Variable ind, Variable speed_min, Variable speed_max, Variable speed_incr, Variable speed_wiggle)
{
return new Variable();
}

public static Variable part_type_direction(Variable ind, Variable dir_min, Variable dir_max, Variable dir_incr, Variable dir_wiggle)
{
return new Variable();
}

public static Variable part_type_gravity(Variable ind, Variable grav_amount, Variable grav_dir)
{
return new Variable();
}

public static Variable part_type_color1(Variable ind, Variable color1)
{
return new Variable();
}

public static Variable part_type_color2(Variable ind, Variable color1, Variable color2)
{
return new Variable();
}

public static Variable part_type_color3(Variable ind, Variable color1, Variable color2, Variable color3)
{
return new Variable();
}

public static Variable part_type_color_mix(Variable ind, Variable color1, Variable color2)
{
return new Variable();
}

public static Variable part_type_color_rgb(Variable ind, Variable rmin, Variable rmax, Variable gmin, Variable gmax, Variable bmin, Variable bmax)
{
return new Variable();
}

public static Variable part_type_color_hsv(Variable ind, Variable hmin, Variable hmax, Variable smin, Variable smax, Variable vmin, Variable vmax)
{
return new Variable();
}

public static Variable part_type_alpha1(Variable ind, Variable alpha1)
{
return new Variable();
}

public static Variable part_type_alpha2(Variable ind, Variable alpha1, Variable alpha2)
{
return new Variable();
}

public static Variable part_type_alpha3(Variable ind, Variable alpha1, Variable alpha2, Variable alpha3)
{
return new Variable();
}

public static Variable part_type_blend(Variable ind, Variable additive)
{
return new Variable();
}

/*
 * 
 * Particle systems
 * 
 */

public static Variable part_system_create()
{
return new Variable();
}

public static Variable part_system_destroy(Variable ind)
{
return new Variable();
}

public static Variable part_system_exists(Variable ind)
{
return new Variable();
}

public static Variable part_system_clear(Variable ind)
{
return new Variable();
}

public static Variable part_system_draw_order(Variable ind, Variable oldtonew)
{
return new Variable();
}

public static Variable part_system_depth(Variable ind, Variable depth)
{
return new Variable();
}

public static Variable part_system_position(Variable ind, Variable x, Variable y)
{
return new Variable();
}

public static Variable part_system_automatic_update(Variable ind, Variable automatic)
{
return new Variable();
}

public static Variable part_system_automatic_draw(Variable ind, Variable draw)
{
return new Variable();
}

public static Variable part_system_update(Variable ind)
{
return new Variable();
}

public static Variable part_system_drawit(Variable ind)
{
return new Variable();
}

public static Variable part_particles_create(Variable ind, Variable x, Variable y, Variable parttype, Variable number)
{
return new Variable();
}

public static Variable part_particles_create_color(Variable ind, Variable x, Variable y, Variable parttype, Variable color, Variable number)
{
return new Variable();
}

public static Variable part_particles_clear(Variable ind)
{
return new Variable();
}

public static Variable part_particles_count(Variable ind)
{
return new Variable();
}



/*
 * 
 * Emitters
 * 
 */
public static Variable part_emitter_create(Variable ps)
{
return new Variable();
}

public static Variable part_emitter_destroy(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_emitter_destroy_all(Variable ps)
{
return new Variable();
}

public static Variable part_emitter_exists(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_emitter_clear(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_emitter_region(Variable ps, Variable ind, Variable xmin, Variable xmax, Variable ymin, Variable ymax, Variable shape, Variable distribution)
{
return new Variable();
}

public static Variable part_emitter_burst(Variable ps, Variable ind, Variable parttype, Variable number)
{
return new Variable();
}

public static Variable part_emitter_stream(Variable ps, Variable ind, Variable parttype, Variable number)
{
return new Variable();
}

/*
 * 
 * Attractors
 * 
 */
public static Variable part_attractor_create(Variable ps)
{
return new Variable();
}

public static Variable part_attractor_destroy(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_attractor_destroy_all(Variable ps)
{
return new Variable();
}

public static Variable part_attractor_exists(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_attractor_clear(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_attractor_position(Variable ps, Variable ind, Variable x, Variable y)
{
return new Variable();
}

public static Variable part_attractor_force(Variable ps, Variable ind, Variable force, Variable dist, Variable kind, Variable additive)
{
return new Variable();
}

/*
 * 
 * Destroyers
 * 
 */
public static Variable part_destroyer_create(Variable ps)
{
return new Variable();
}

public static Variable part_destroyer_destroy(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_destroyer_destroy_all(Variable ps)
{
return new Variable();
}

public static Variable part_destroyer_exists(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_destroyer_clear(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_destroyer_region(Variable ps, Variable ind, Variable xmin, Variable xmax, Variable ymin, Variable ymax, Variable shape)
{
return new Variable();
}

/*
 * 
 * Deflectors
 * 
 */
public static Variable part_deflector_create(Variable ps)
{
return new Variable();
}

public static Variable part_deflector_destroy(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_deflector_destroy_all(Variable ps)
{
return new Variable();
}

public static Variable part_deflector_exists(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_deflector_clear(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_deflector_region(Variable ps, Variable ind, Variable xmin, Variable xmax, Variable ymin, Variable ymax)
{
return new Variable();
}

public static Variable part_deflector_kind(Variable ps, Variable ind, Variable kind)
{
return new Variable();
}

public static Variable part_deflector_friction(Variable ps, Variable ind, Variable amount)
{
return new Variable();
}

/*
 * 
 * Changers
 * 
 */
public static Variable part_changer_create(Variable ps)
{
return new Variable();
}

public static Variable part_changer_destroy(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_changer_destroy_all(Variable ps)
{
return new Variable();
}

public static Variable part_changer_exists(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_changer_clear(Variable ps, Variable ind)
{
return new Variable();
}

public static Variable part_changer_region(Variable ps, Variable ind, Variable xmin, Variable xmax, Variable ymin, Variable ymax, Variable shape)
{
return new Variable();
}

public static Variable part_changer_kind(Variable ps, Variable ind, Variable kind)
{
return new Variable();
}

public static Variable part_changer_types(Variable ps, Variable ind, Variable parttype1, Variable parttype2)
{
return new Variable();
}

/*
 * 
 * Setting up a connection
 * 
 */
public static Variable mplay_init_ipx()
{
return new Variable();
}

public static Variable mplay_init_tcpip(Variable addrstring)
{
return new Variable();
}

public static Variable mplay_init_modem(Variable initstr, Variable phonenr)
{
return new Variable();
}

public static Variable mplay_init_serial(Variable portno, Variable baudrate, Variable stopbits, Variable parity, Variable flow)
{
return new Variable();
}

public static Variable mplay_connect_status()
{
return new Variable();
}

public static Variable mplay_end()
{
return new Variable();
}

public static Variable mplay_ipaddress()
{
    try{
        java.net.InetAddress i = java.net.InetAddress.getLocalHost();
        
   return new String(i.getHostAddress()); // IP address only
        } catch(Exception e){
        System.out.println(""+e.getMessage());}
return new Variable();
}

/*
 * 
 * Creating and joining sessions
 * 
 */
public static Variable mplay_session_mode(Variable move)
{
return new Variable();
}

public static Variable mplay_session_create(Variable sesname, Variable playnumb, Variable playername)
{
return new Variable();
}

public static Variable mplay_session_find()
{
return new Variable();
}

public static Variable mplay_session_name(Variable numb)
{
return new Variable();
}

public static Variable mplay_session_join(Variable numb, Variable playername)
{
return new Variable();
}

public static Variable mplay_session_status()
{
return new Variable();
}

public static Variable mplay_session_end()
{
return new Variable();
}

/*
 * 
 * Players
 * 
 */
public static Variable mplay_player_find()
{
return new Variable();
}

public static Variable mplay_player_name(Variable numb)
{
return new Variable();
}

public static Variable mplay_player_id(Variable numb)
{
return new Variable();
}

/*
 * 
 * Shared data
 * 
 */
public static Variable mplay_data_write(Variable ind, Variable value)
{
return new Variable();
}

public static Variable mplay_data_read(Variable ind)
{
return new Variable();
}

public static Variable mplay_data_mode(Variable guaranteed)
{
return new Variable();
}

/*
 * 
 * Messages
 * 
 */
public static Variable mplay_message_send(Variable player, Variable id, Variable val)
{
return new Variable();
}

public static Variable mplay_message_send_guaranteed(Variable player, Variable id, Variable val)
{
return new Variable();
}

public static Variable mplay_message_receive(Variable player)
{
return new Variable();
}

public static Variable mplay_message_id()
{
return new Variable();
}

public static Variable mplay_message_value()
{
return new Variable();
}

public static Variable mplay_message_player()
{
return new Variable();
}

public static Variable mplay_message_name()
{
return new Variable();
}

public static Variable mplay_message_count(Variable player)
{
return new Variable();
}

public static Variable mplay_message_clear(Variable player)
{
return new Variable();
}

/*
 * 
 * Using DLL's
 * 
 */
public static Variable external_call(Variable id, Variable arg1, Variable arg2)
{
return new Variable();
}

public static Variable external_define(Variable dll, Variable name, Variable calltype, Variable restype, Variable argnumb, Variable arg1type, Variable arg2type)
{
return new Variable();
}

public static Variable external_free(Variable dllname)
{
return new Variable();
}

public static Variable window_handle()
{
return new Variable();
}

/*
 * 
 * Going to 3D mode
 * 
 */
public static Variable d3d_start()
{
return new Variable();
}

public static Variable d3d_end()
{
return new Variable();
}

public static Variable d3d_set_hidden(Variable enable)
{
return new Variable();
}

public static Variable d3d_set_perspective(Variable enable)
{
return new Variable();
}

public static Variable d3d_set_depth(Variable depth)
{
return new Variable();
}

public static Variable d3d_primitive_begin(Variable kind)
{
return new Variable();
}

public static Variable d3d_vertex(Variable x, Variable y, Variable z)
{
return new Variable();
}

public static Variable d3d_vertex_color(Variable x, Variable y, Variable z, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_primitive_end()
{
return new Variable();
}

public static Variable d3d_primitive_begin_texture(Variable kind, Variable texid)
{
return new Variable();
}

public static Variable d3d_vertex_texture(Variable x, Variable y, Variable z, Variable xtex, Variable ytex)
{
return new Variable();
}

public static Variable d3d_vertex_texture_color(Variable x, Variable y, Variable z, Variable xtex, Variable ytex, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_draw_block(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}

public static Variable d3d_draw_cylinder(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat, Variable closed, Variable steps)
{
return new Variable();
}

public static Variable d3d_draw_cone(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat, Variable closed, Variable steps)
{
return new Variable();
}

public static Variable d3d_draw_ellipsoid(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat, Variable steps)
{
return new Variable();
}

public static Variable d3d_draw_wall(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}

public static Variable d3d_draw_floor(Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable texid, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}

public static Variable d3d_set_projection(Variable xfrom, Variable yfrom, Variable zfrom, Variable xto, Variable yto, Variable zto, Variable xup, Variable yup, Variable zup)
{
return new Variable();
}

public static Variable d3d_set_projection_ext(Variable xfrom, Variable yfrom, Variable zfrom, Variable xto, Variable yto, Variable zto, Variable xup, Variable yup, Variable zup, Variable angle, Variable aspect, Variable znear, Variable zfar)
{
return new Variable();
}

public static Variable d3d_set_projection_ortho(Variable x, Variable y, Variable w, Variable h, Variable angle)
{
return new Variable();
}

public static Variable d3d_set_projection_perspective(Variable x, Variable y, Variable w, Variable h, Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_set_identity()
{
return new Variable();
}

public static Variable d3d_transform_set_translation(Variable xt, Variable yt, Variable zt)
{
return new Variable();
}

public static Variable d3d_transform_set_scaling(Variable xs, Variable ys, Variable zs)
{
return new Variable();
}

public static Variable d3d_transform_set_rotation_x(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_set_rotation_y(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_set_rotation_z(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_set_rotation_axis(Variable xa, Variable ya, Variable za, Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_add_translation(Variable xt, Variable yt, Variable zt)
{
return new Variable();
}

public static Variable d3d_transform_add_scaling(Variable xs, Variable ys, Variable zs)
{
return new Variable();
}

public static Variable d3d_transform_add_rotation_x(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_add_rotation_y(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_add_rotation_z(Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_add_rotation_axis(Variable xa, Variable ya, Variable za, Variable angle)
{
return new Variable();
}

public static Variable d3d_transform_stack_clear()
{
return new Variable();
}

public static Variable d3d_transform_stack_empty()
{
return new Variable();
}

public static Variable d3d_transform_stack_push()
{
return new Variable();
}

public static Variable d3d_transform_stack_pop()
{
return new Variable();
}

public static Variable d3d_transform_stack_top()
{
return new Variable();
}

public static Variable d3d_transform_stack_discard()
{
return new Variable();
}

public static Variable d3d_set_fog(Variable enable, Variable color, Variable start, Variable end)
{
return new Variable();
}

public static Variable d3d_set_lighting(Variable enable)
{
return new Variable();
}

public static Variable d3d_set_shading(Variable smooth)
{
return new Variable();
}

public static Variable d3d_set_culling(Variable cull)
{
return new Variable();
}

public static Variable d3d_light_define_direction(Variable ind, Variable dx, Variable dy, Variable dz, Variable col)
{
return new Variable();
}

public static Variable d3d_light_define_point(Variable ind, Variable x, Variable y, Variable z, Variable range, Variable col)
{
return new Variable();
}

public static Variable d3d_light_enable(Variable ind, Variable enable)
{
return new Variable();
}

public static Variable d3d_vertex_normal(Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz)
{
return new Variable();
}

public static Variable d3d_vertex_normal_color(Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_vertex_normal_texture(Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable xtex, Variable ytex)
{
return new Variable();
}

public static Variable d3d_vertex_normal_texture_color(Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable xtex, Variable ytex, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_model_create()
{
return new Variable();
}

public static Variable d3d_model_destroy(Variable ind)
{
return new Variable();
}

public static Variable d3d_model_clear(Variable ind)
{
return new Variable();
}

public static Variable d3d_model_save(Variable ind, Variable fname)
{
return new Variable();
}

public static Variable d3d_model_load(Variable ind, Variable fname)
{
return new Variable();
}

public static Variable d3d_model_draw(Variable ind, Variable x, Variable y, Variable z, Variable texid)
{
return new Variable();
}

public static Variable d3d_model_primitive_begin(Variable ind, Variable kind)
{
return new Variable();
}

public static Variable d3d_model_vertex(Variable ind, Variable x, Variable y, Variable z)
{
return new Variable();
}

public static Variable d3d_model_vertex_color(Variable ind, Variable x, Variable y, Variable z, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_model_vertex_texture(Variable ind, Variable x, Variable y, Variable z, Variable xtex, Variable ytex)
{
return new Variable();
}

public static Variable d3d_model_vertex_texture_color(Variable ind, Variable x, Variable y, Variable z, Variable xtex, Variable ytex, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_model_vertex_normal(Variable ind, Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz)
{
return new Variable();
}

public static Variable d3d_model_vertex_normal_color(Variable ind, Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_model_vertex_normal_texture(Variable ind, Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable xtex, Variable ytex)
{
return new Variable();
}

public static Variable d3d_model_vertex_normal_texture_color(Variable ind, Variable x, Variable y, Variable z, Variable nx, Variable ny, Variable nz, Variable xtex, Variable ytex, Variable col, Variable alpha)
{
return new Variable();
}

public static Variable d3d_model_primitive_end(Variable ind)
{
return new Variable();
}

public static Variable d3d_model_block(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}

public static Variable d3d_model_cylinder(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat, Variable closed, Variable steps)
{
    
return new Variable();
}

public static Variable d3d_model_cone(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat, Variable closed, Variable steps)
{
return new Variable();
}

public static Variable d3d_model_ellipsoid(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat, Variable steps)
{
return new Variable();
}

public static Variable d3d_model_wall(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}

public static Variable d3d_model_floor(Variable ind, Variable x1, Variable y1, Variable z1, Variable x2, Variable y2, Variable z2, Variable hrepeat, Variable vrepeat)
{
return new Variable();
}




}
