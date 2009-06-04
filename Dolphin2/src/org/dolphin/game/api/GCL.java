
package org.dolphin.game.api;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;

import org.dolphin.game.Game;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.components.Path;
import org.dolphin.game.api.components.Sprite;
import org.dolphin.game.api.resources.Display;
import org.dolphin.game.api.types.BinaryFile;
import org.dolphin.game.api.types.Color;
import org.dolphin.game.api.types.Cursor;

import org.dolphin.game.api.types.File;
import org.dolphin.game.api.types.GMResource;
import org.dolphin.game.api.types.Global;
import org.dolphin.game.api.types.List;
import org.dolphin.game.api.types.Map;
import org.dolphin.game.api.types.PriorityQueue;
import org.dolphin.game.api.types.Queue;
import org.dolphin.game.api.types.Stack;
import org.dolphin.game.api.types.Variable;

import org.dolphin.game.api.types.Surface;


import com.golden.gamedev.engine.graphics.WindowedMode;
import com.golden.gamedev.util.ImageUtil;

/**
 * This class is valid GCL, don't use java code here
 * This class will be converted to other languages via gcl
 * @author TGMG
 */
public class GCL extends Variables {
  
 /*
  * Notes:
  *  If an argument is a boolean value, use Variable.toboolean(value) to make sure its not a double
  * 
  * 
  * 
  */   
    
    /*
     * 
     Math functions
     * 
     */ 
    
public static Object is_real(Object val)
{
    if (val instanceof String)
        return 0d;
    else
        return true;
}
public static Object is_string(Object val)
{
if (val instanceof String)
        return true;
    else
        return 0d;
}

public static Object random(Object x)
{
return (Math.random(((Double)x)));
}

public static Object randomize(Object... x)
{
return 0d;
}
public static Object choose(Object... x)
{
    int ran = (int)Math.random(x.length);
    int i=0;
    for (Object n : x) {
              if (i == ran)
                  return n;
              i++;
          }
return 0d;
}
public static Object abs(Object x)
{
return (Math.abs(((Double)x)));
}
public static Object round(Object x)
{
return (Math.round(((Double)x)));
}
public static Object floor(Object x)
{
return (Math.floor(((Double)x)));
}

public static Object ceil(Object x)
{
return (Math.ceil(((Double)x)));
}

public static Object sign(Object x)
{
return (Math.sign(((Double)x)));
}

public static Object frac(Object x)
{
return (Math.frac(((Double)x)));
}

public static Object sqrt(Object x)
{
return (Math.sqrt(((Double)x)));
}

public static Object sqr(Object x)
{
return (Math.sqr(((Double)x)));
}

public static Object exp(Object x)
{
return (Math.exp(((Double)x)));
}

public static Object ln(Object x)
{
return (Math.ln(((Double)x)));
}

public static Object log2(Object x)
{
return (Math.log2(((Double)x)));
}

public static Object log10(Object x)
{
return (Math.log10(((Double)x)));
}

public static Object sin(Object x)
{
return (Math.sin(((Double)x)));
}

public static Object cos(Object x)
{
return (Math.cos(((Double)x)));
}

public static Object tan(Object x)
{
return (Math.tan(((Double)x)));
}

public static Object arcsin(Object x)
{
return (Math.arcsin(((Double)x)));
}

public static Object arccos(Object x)
{
return (Math.arccos(((Double)x)));
}

public static Object arctan(Object x)
{
return (Math.arctan(((Double)x)));
}

public static Object arctan2(Object y, Object x)
{
return (Math.arctan2(((Double)y),((Double)x)));
}

public static Object degtorad(Object x)
{
return (Math.degtorad(((Double)x)));
}

public static Object radtodeg(Object x)
{
return (Math.radtodeg(((Double)x)));
}

public static Object power(Object x, Object n)
{
return (Math.power(((Double)x),((Double)n)));
}

public static Object logn(Object n, Object x)
{
return (Math.power(((Double)n),((Double)x)));
}

public static Object min(Object... x)
{
    try{
    double min=(Double)x[0];
    for (Object n : x) {
              if (((Double)n) <min)
                  min=((Double)n);
              min();
          }
return (min);
}catch(Exception e){
    return (-1);}
}

public static Object max(Object... x)
{
    try{
double max=((Double)x[0]);
    for (Object n : x) {
              if (((Double)n) >max)
                  max=((Double)n);
          }
return (max);
    }catch(Exception e){
    return (-1);}
}

public static Object mean(Object... x)
{
     if (x.length == 0)
                return (0);
            double total = 0;
            for (Object n:x)
                total += ((Double)n);
            return (total / x.length);
}

public static Object median(Object... x)
{
    if (x.length == 0)
                return (0);
            if (x.length % 2 == 1)
                return x[x.length / 2];
            return mean(x[x.length / 2], x[(x.length / 2) - 1]);
}

public static Object point_distance(Object x1, Object y1, Object x2, Object y2)
{
return (Math.pointDistance(((Double)x1),((Double)y1),((Double)x2),((Double)y2)));
}

public static Object point_direction(Object x1, Object y1, Object x2, Object y2)
{
return (Math.pointDirection(((Double)x1),((Double)y1),((Double)x2),((Double)y2)));
}

public static Object lengthdir_x(Object len, Object dir)
{
return (Math.lengthDirX(((Double)len),((Double)dir)));
}

public static Object lengthdir_y(Object len, Object dir)
{
return (Math.lengthDirY(((Double)len),((Double)dir)));
}

public static Object cbrt(Object x) {
return (Math.cbrt(((Double)x)));
}

public static Object sinh(Object x) {
return (Math.sinh(((Double)x)));
}

public static Object cosh(Object x) {
return (Math.cosh(((Double)x)));
}

public static Object tanh(Object x) {
return (Math.tanh(((Double)x)));
}

public static Object expm1(Object x) {
return (Math.expm1(((Double)x)));
}

/*
 * 
 * String functions
 * 
 */
public static Object real(Object str)
{
return (((Double)str));
}

public static Object string(Object val)
{
return val.toString();
}

public static Object tostring(Object val)
{
return val.toString();
}

public static Object string_format(Object val, Object total, Object dec)
{
return (String_Functions.stringFormat(((Double)val), ((Double)total), ((Double)dec)));
}

public static Object chr(Object val)
{
return (String_Functions.chr(((Double)val)));
}

public static Object ord(Object character)
{
return (String_Functions.ord(character+""));
}

public static Object string_length(Object str)
{
return (String_Functions.length(str+""));
}

public static Object string_pos(Object substr, Object str)
{
return (String_Functions.pos(substr+"",str+""));
}

public static Object string_copy(Object str, Object index, Object count)
{
return (String_Functions.substring(str+"",((Double)index),((Double)count)));
}

public static Object string_char_at(Object str, Object index)
{
return (String_Functions.charAt(str+"", ((Double)index)));
}

public static Object string_delete(Object str, Object index, Object count)
{
return (String_Functions.delete(str+"", ((Double)index), ((Double)count)));
}

public static Object string_insert(Object substr, Object str, Object index)
{
return (String_Functions.insert(substr+"", str+"", ((Double)index)));
}

public static Object string_lower(Object str)
{
return (String_Functions.lower(""+str));
}

public static Object string_upper(Object str)
{
return (String_Functions.upper(""+str));
}

public static Object string_repeat(Object str, Object count)
{
return (String_Functions.repeat(str+"", ((Double)count)));
}

public static Object string_letters(Object str)
{
return (String_Functions.letters(str+""));
}

public static Object string_digits(Object str)
{
return (String_Functions.digits(str+""));
}

public static Object string_lettersdigits(Object str)
{
return (String_Functions.lettersDigits(str+""));
}

public static Object string_replace(Object str, Object substr, Object newstr)
{
return (String_Functions.replace(str+"", substr+"", newstr+""));
}

public static Object string_replace_all(Object str, Object substr, Object newstr)
{
return (String_Functions.replaceAll(str+"", substr+"", newstr+""));
}

public static Object string_count(Object substr, Object str)
{
return (String_Functions.count(substr+"", str+""));
}

public static Object clipboard_has_text()
{
return new Boolean(Clipboard.hasText());
}

public static Object clipboard_set_text(Object str)
{
    Clipboard.setText(str.toString());
return 0d;
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
return (Date.currentDatetime());
}

public static Object date_current_date()
{
    
return round((Date.currentDate()));
}

public static Object date_current_time()
{
	return round((Date.currentTime()));	
}

public static Object date_create_datetime(Object year, Object month, Object day, Object hour, Object minute, Object second)
{
return	Date.createDatetime((Double)year, (Double)month, (Double)day, (Double)hour, (Double)minute, (Double)second);
}

public static Object date_create_date(Object year, Object month, Object day)
{
	return	Date.createDate((Double)year, (Double)month, (Double)day);

}

public static Object date_create_time(Object hour, Object minute, Object second)
{
	return	Date.createTime((Double)hour, (Double)minute, (Double)second);

}

public static Object date_valid_datetime(Object year, Object month, Object day, Object hour, Object minute, Object second)
{
return	Date.validDateTime((Double)year, (Double)month, (Double)day, (Double)hour, (Double)minute, (Double)second);
}

public static Object date_valid_date(Object year, Object month, Object day)
{
	return	Date.validDate((Double)year, (Double)month, (Double)day);
}

public static Object date_valid_time(Object hour, Object minute, Object second)
{
	return	Date.validTime((Double)hour, (Double)minute, (Double)second);
}

public static Object date_inc_year(Object date, Object amount)
{
return	Date.incYear((Double)date, (Double)amount);
}

public static Object date_inc_month(Object date, Object amount)
{
	return	Date.incMonth((Double)date, (Double)amount);
}

public static Object date_inc_week(Object date, Object amount)
{
	return	Date.incWeek((Double)date, (Double)amount);
}

public static Object date_inc_day(Object date, Object amount)
{
	return	Date.incDay((Double)date, (Double)amount);
}

public static Object date_inc_hour(Object date, Object amount)
{
	return	Date.incHour((Double)date, (Double)amount);
}

public static Object date_inc_minute(Object date, Object amount)
{
	return	Date.incMinute((Double)date, (Double)amount);
}

public static Object date_inc_second(Object date, Object amount)
{
	return	Date.incSecond((Double)date, (Double)amount);
}

public static Object date_get_year(Object date)
{
return (Date.getYear(((Double)date)));
}

public static Object date_get_month(Object date)
{
	return (Date.getMonth(((Double)date)));
}

public static Object date_get_week(Object date)
{
	return (Date.getWeek(((Double)date)));
}

public static Object date_get_day(Object date)
{
	return (Date.getDay(((Double)date)));
}

public static Object date_get_hour(Object date)
{
	return (Date.getHour(((Double)date)));
}

public static Object date_get_minute(Object date)
{
	return (Date.getMinute(((Double)date)));
}

public static Object date_get_second(Object date)
{
	return (Date.getSecond(((Double)date)));
}

public static Object date_get_weekday(Object date)
{
	return (Date.getWeekday(((Double)date)));
}

public static Object date_get_day_of_year(Object date)
{
	return (Date.getDayOfYear(((Double)date)));
}

public static Object date_get_hour_of_year(Object date)
{
	return (Date.getHourOfYear(((Double)date)));
}

public static Object date_get_minute_of_year(Object date)
{
	return (Date.getMinuteOfYear(((Double)date)));
}

public static Object date_get_second_of_year(Object date)
{
	return (Date.getSecondOfYear(((Double)date)));
}

public static Object date_year_span(Object date1, Object date2)
{
	return (Date.yearSpan((Double)date1,(Double)date2));
}

public static Object date_month_span(Object date1, Object date2)
{
	return (Date.monthSpan((Double)date1,(Double)date2));
}

public static Object date_week_span(Object date1, Object date2)
{
	return (Date.weekSpan((Double)date1,(Double)date2));
}

public static Object date_day_span(Object date1, Object date2)
{
	return (Date.daySpan((Double)date1,(Double)date2));
}

public static Object date_hour_span(Object date1, Object date2)
{
	return (Date.hourSpan((Double)date1,(Double)date2));
}

public static Object date_minute_span(Object date1, Object date2)
{
	return (Date.minuteSpan((Double)date1,(Double)date2));
}

public static Object date_second_span(Object date1, Object date2)
{
	return (Date.secondSpan((Double)date1,(Double)date2));
}

public static Object date_compare_datetime(Object date1, Object date2)
{
	return Date.compareDateTime((Double)date1, (Double)date2);
}

public static Object date_compare_date(Object date1, Object date2)
{
	return (Date.compareDate((Double)date1,(Double)date2));
}

public static Object date_compare_time(Object date1, Object date2)
{
	return (Date.compareTime((Double)date1,(Double)date2));
}

public static Object date_date_of(Object date)
{
	return (Date.dateOf((Double)date));
}

public static Object date_time_of(Object date)
{
	return Date.timeOf((Double)date);
}

public static Object date_datetime_string(Object date)
{
	return Date.datetimetoString((Double)date);
}

public static Object date_date_string(Object date)
{
	return Date.string((Double)date);
}

public static Object date_time_string(Object date)
{
	return Date.timeString((Double)date);
}

public static Object date_days_in_month(Object date)
{
	return Date.daysInMonth((Double)date);
}

public static Object date_days_in_year(Object date)
{
	return Date.daysInYear((Double)date);
}

public static Object date_leap_year(Object date)
{
	return Date.leapYear((Double)date);
}

public static Object date_is_today(Object date)
{
	return Date.isToday((Double)date);
}

/*
 * 
 * Moving around Functions
 * 
 */

public /*static*/ Object motion_set(Object dir, Object speed)
{
    self.setDirection(dir);
    self.setSpeed(speed);
return 0d;
}

public /*static*/ Object motion_add(Object dir, Object speed)
{
   // self.hspeed += -(((Double)speed));
   // self.vspeed += ((Double)speed) * Math.sin(((Double)dir) * (Math.PI/180));
    //self.speed += ((Double)speed);
    self.setDirection((((Double)self.getDirection()) + ((Double)dir)));
    self.setSpeed(Variable.add(speed,self.getSpeed()));
return 0d;
}

public /*static*/ Object place_free(Object x, Object y)
{
     for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
           if (Game.currentRoom.instances.elementAt(i) !=null){
               Actor a = (Game.currentRoom.instances.elementAt(i));
               if (Variable.toBoolean(a.getSolid())) {
                   
                    if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {
                        //if not instance id
                        if (a.instance_id == self.instance_id) {
                           // System.out.println("collided with self");
                        } else {
                            
                            return 0d;
                        }
                    }
                }
           }
        }
return true;
}

public /*static*/ Object place_empty(Object x, Object y)
{
   for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
           if (Game.currentRoom.instances.elementAt(i) !=null){
               Actor a = (Game.currentRoom.instances.elementAt(i));
               {
                   
                    if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {
                        //if not instance id
                        if (a.instance_id == self.instance_id) {
                            //System.out.println("collided with self");
                        } else {
                            //place is not free
                            return 0d;
                        }
                    }
                }
           }
        }
return true;
}

public Object place_meeting(Object x, Object y, Object obj)
{
    java.lang.String name="";
    if (obj instanceof GMResource){
    name=((GMResource)obj).theclass.getName();
    for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        if (Game.currentRoom.instances.elementAt(i) !=null){
            Actor a = (Game.currentRoom.instances.elementAt(i));
            if (a.getClass().getName().equals(name)) {
                 if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {

                     if (a.instance_id == self.instance_id) {
                        // collided with self
                     } else {
                         return true;
                     }
                 }
             }
        }
     }
    } else if (obj.equals(all)){
    	for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
            if (Game.currentRoom.instances.elementAt(i) !=null){
                Actor a = (Game.currentRoom.instances.elementAt(i));
                {
                     if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {

                         if (a.instance_id == self.instance_id) {
                            // collided with self
                         } else {
                             return true;
                         }
                     }
                 }
            }
         }
    }
 else if (obj.equals(other)){
	 for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
	        if (Game.currentRoom.instances.elementAt(i) !=null){
	            Actor a = (Game.currentRoom.instances.elementAt(i));
	            if (a.equals(other)) {
	                 if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {

	                     if (a.instance_id == self.instance_id) {
	                        // collided with self
	                     } else {
	                         return true;
	                     }
	                 }
	             }
	        }
	     }
}
    else{
    	//instanceid
    	 for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
    	        if (Game.currentRoom.instances.elementAt(i) !=null){
    	            Actor a = (Game.currentRoom.instances.elementAt(i));
    	             {
    	                 if (new Rectangle(((Double)x).intValue(), ((Double)y).intValue(), self.sprite.sprite_width, self.sprite.sprite_height).intersects(a.getBounds())) {

    	                     if (a.instance_id == (Double)obj) {
    	                      
    	                         return true;
    	                     }
    	                 }
    	             }
    	        }
    	     }
    }
    
return 0d;
}

public /*static*/ Object place_snapped(Object hsnap, Object vsnap)
{
    if ((self.x % ((Double)hsnap) ==0) && (self.y % ((Double)vsnap)==0) )
        return true;

return 0d;
}

public /*static*/ Object move_random(Object hsnap, Object vsnap)
{
    if (Variable.toBoolean(hsnap.equals((0))))
        self.x=((Double)round((Double)random((Double)getRoom_width()))).floatValue();
    else
    self.x=(Double)Variable.mult(round(Variable.div(random(getRoom_width()),hsnap)),hsnap);
    if (Variable.toBoolean(vsnap.equals((0))))
        self.y=(Double)round(random((Double)getRoom_height()));
    else
    self.y=(Double)Variable.mult(round(Variable.div(random(getRoom_height()),vsnap)),vsnap);
return 0d;
}

/*
 * 
 * @author hanson
 */
public /*static*/ Object move_snap(Object hsnap, Object vsnap)
{
    self.x = (Double)round((self.x/((Double)hsnap)))  * ((Double)hsnap);
self.y = (Double) round((self.y/((Double)vsnap))) * ((Double)vsnap);		
return 0d;
}

/*
 * TODO: Fix this function
 */
public /*static*/ Object move_towards_point(Object xto, Object yto, Object sp)
{
   double dist=(Double)sqrt(((((Double)xto)-self.x)*(((Double)xto)-self.x)+(((Double)yto)-self.y)*(((Double)yto)-self.y)));
   self.hspeed=((((Double)xto)-self.x)/dist)*((Double)sp);
   self.vspeed=((((Double)yto)-self.y)/dist)*((Double)sp);
return 0d;
}

public Object move_contact_solid(Object dir, Object maxdist)
{
	int distance=0;
	while (Variable.toBoolean(place_free(self.getX(),self.getY())) ){
		self.x +=  Math.cos(Math.degtorad((Double)dir));
        self.y += -(Math.sin(Math.degtorad((Double)dir)));	
        if ((distance >= (Double)maxdist))
        	break;
	distance++;	
	}
	return 0d;
}

public  Object move_contact_all(Object dir, Object maxdist)
{
	int distance=0;
	while (Variable.toBoolean(place_empty(self.getX(),self.getY())) ){
		self.x +=  Math.cos(Math.degtorad((Double)dir));
        self.y += -(Math.sin(Math.degtorad((Double)dir)));	
        if ((distance >= (Double)maxdist))
        	break;
	distance++;	
	}
	return 0d;
}

public Object move_outside_solid(Object dir, Object maxdist)
{
	int distance=0;
	while (!Variable.toBoolean(place_free(self.getX(),self.getY())) ){
		self.x +=  Math.cos(Math.degtorad((Double)dir));
        self.y += -(Math.sin(Math.degtorad((Double)dir)));	
        if ((distance >= (Double)maxdist))
        	break;
	distance++;	
	}
	return 0d;
}

public Object move_outside_all(Object dir, Object maxdist)
{
	int distance=0;
	while (!Variable.toBoolean(place_empty(self.getX(),self.getY())) ){
		self.x +=  Math.cos(Math.degtorad((Double)dir));
        self.y += -(Math.sin(Math.degtorad((Double)dir)));	
        if ((distance >= (Double)maxdist))
        	break;
	distance++;	
	}
	return 0d;
}

public  Object move_bounce_solid(Object advanced)
{
return 0d;
}

public Object move_bounce_all(Object advanced)
{
return 0d;
}

public /*static*/ Object move_wrap(Object hor, Object vert, Object margin)
{
    if((Variable.toBoolean(hor))==true){
      if((self.x<-((Double)margin)) || (self.x>((Double)getRoom_width()+((Double)margin)))){
         self.x=(Double)getRoom_width()-self.x;
      }
   }
   if((Variable.toBoolean(vert))==true){
      if((self.y<-((Double)margin))||(self.y>((Double)getRoom_height()+((Double)margin)))){
         self.y=(Double)getRoom_height()-self.y;
      }
   }
return 0d;
}

public /*static*/ Object distance_to_point(Object x, Object y)
{
    double xd = ((Double)x)-self.x;
    double yd = ((Double)y)-self.y;
    return sqrt(((xd)*(xd)+(yd)*(yd)));
}

public /*static*/ Object distance_to_object(Object obj)
{
	double shortestdist=1000000,tempdist=0;
	java.lang.String name="";
    if (obj instanceof GMResource){
    name=((GMResource)obj).theclass.getName();
    for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        if (Game.currentRoom.instances.elementAt(i) !=null){
            Actor a = (Game.currentRoom.instances.elementAt(i));
            if (a.getClass().getName().equals(name)) {
            	if (a.instance_id == self.instance_id) {
                    //collided with self
                } else {
            	tempdist=(Double)distance_to_point(a.x,a.y);
            	if (tempdist < shortestdist)
            		shortestdist = tempdist;
                }
             }
        }
     }
    } else if (obj.equals(other)){
        
        for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
            if (Game.currentRoom.instances.elementAt(i) !=null){
                Actor a = (Game.currentRoom.instances.elementAt(i));
                if (a.equals(other)) {
                	tempdist=(Double)distance_to_point(a.x,a.y);
                	if (tempdist < shortestdist)
                		shortestdist = tempdist;
                 }
            }
         }
        }
else if (obj instanceof Double){
        
        for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
            if (Game.currentRoom.instances.elementAt(i) !=null){
                Actor a = (Game.currentRoom.instances.elementAt(i));
                if (a.instance_id==((Double)obj)) {
                	tempdist=(Double)distance_to_point(a.x,a.y);
                	if (tempdist < shortestdist)
                		shortestdist = tempdist;
                 }
            }
         }
        }
else if (obj.equals(all)){
        
        for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
            if (Game.currentRoom.instances.elementAt(i) !=null){
                Actor a = (Game.currentRoom.instances.elementAt(i));
                 
                if (a.instance_id == self.instance_id) {
                    //collided with self
                } else {
                	tempdist=(Double)distance_to_point(a.x,a.y);
                	if (tempdist < shortestdist)
                		shortestdist = tempdist;
                 }
            }
         }
        }
    return shortestdist;
       }
     
/*return (smalldist);
}*/

public static Object position_empty(Object x, Object y)
{
	   for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
	           if (Game.currentRoom.instances.elementAt(i) !=null){
	               Actor a = (Game.currentRoom.instances.elementAt(i));
	               {
	                   
	            	   if (a.getBounds().contains(((Double)x).intValue(), ((Double)y).intValue())) {
	                        //if not instance id
	                        return 0d;
	                    }
	                }
	           }
	        }
	return true;
	}

public static Object position_meeting(Object x, Object y, Object obj)

{
    java.lang.String name="";
    if (obj instanceof GMResource){
    name=((GMResource)obj).theclass.getName();
    for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        if (Game.currentRoom.instances.elementAt(i) !=null){
            Actor a = (Game.currentRoom.instances.elementAt(i));
            if (a.getClass().getName().equals(name)) {
            	if (a.getBounds().contains(((Double)x).intValue(), ((Double)y).intValue())) {
                         return true;
                     
                 }
             }
        }
     }
    } else if (obj.equals(all)){
    	for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
            if (Game.currentRoom.instances.elementAt(i) !=null){
                Actor a = (Game.currentRoom.instances.elementAt(i));
                {
                	if (a.getBounds().contains(((Double)x).intValue(), ((Double)y).intValue())) {

                        return true;
                     }
                 }
            }
         }
    }
 else if (obj.equals(other)){
	 for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
	        if (Game.currentRoom.instances.elementAt(i) !=null){
	            Actor a = (Game.currentRoom.instances.elementAt(i));
	            if (a.equals(other)) {
	            	if (a.getBounds().contains(((Double)x).intValue(), ((Double)y).intValue())) {

	                    return true;
	                 }
	             }
	        }
	     }
}
    else{
    	//instanceid
    	 for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
    	        if (Game.currentRoom.instances.elementAt(i) !=null){
    	            Actor a = (Game.currentRoom.instances.elementAt(i));
    	             {
    	                 if (a.getBounds().contains(((Double)x).intValue(), ((Double)y).intValue())) {

    	                     if (a.instance_id == (Double)obj) {
    	                      
    	                         return true;
    	                     }
    	                 }
    	             }
    	        }
    	     }
    }
    
return 0d;
}


/*
 * 
 * Paths functions
 * 
 */
public Object path_start(Object path, Object speed, Object endaction, Object absolute)
{
	self.setPath_index(path);
	self.pathcurrentpoint=0;
	self.setPath_speed(speed);
	self.setPath_endaction(endaction);
	if (!Variable.toBoolean(absolute)){
		//relative
	self.pathxoffset = (int)((self.x)-(((Path)self.getPath_index()).getPointX(0)));
	self.pathyoffset = (int)((self.y)-(((Path)self.getPath_index()).getPointY(0)));
	}
	else {
		//absolute
		self.x = ((Path)self.getPath_index()).getPointX(0);
		self.y = ((Path)self.getPath_index()).getPointY(0);
	}
	self.pathstartX=(int)self.x;
	self.pathstartY=(int)self.y;
return 0d;
}

public Object path_end()
{
	self.setPath_index(Game.DOLPHIN_nullpath);
return 0d;
}

/*
 * 
 * Motion planning functions
 * 
 */

public static Object mp_linear_step(Object x, Object y, Object speed, Object checkall)
{
return 0d;
}

public static Object mp_potential_step(Object x, Object y, Object speed, Object checkall)
{
return 0d;
}

public static Object mp_linear_step_Object(Object x, Object y, Object speed, Object obj)
{
return 0d;
}

public static Object mp_potential_step_Object(Object x, Object y, Object speed, Object obj)
{
return 0d;
}

public static Object mp_potential_settings(Object maxrot, Object rotstep, Object ahead, Object onspot)
{
return 0d;
}

public static Object mp_linear_path(Object path, Object xg, Object yg, Object stepsize, Object checkall)
{
return 0d;
}

public static Object mp_potential_path(Object path, Object xg, Object yg, Object stepsize, Object factor, Object checkall)
{
return 0d;
}

public static Object mp_linear_path_Object(Object path, Object xg, Object yg, Object stepsize, Object obj)
{
return 0d;
}

public static Object mp_potential_path_Object(Object path, Object xg, Object yg, Object stepsize, Object factor, Object obj)
{
return 0d;
}

public static Object mp_grid_create(Object left, Object top, Object hcells, Object vcells, Object cellwidth, Object cellheight)
{
return 0d;
}

public static Object mp_grid_destroy(Object id)
{
return 0d;
}

public static Object mp_grid_clear_all(Object id)
{
return 0d;
}

public static Object mp_grid_clear_cell(Object id, Object h, Object v)
{
return 0d;
}

public static Object mp_grid_clear_rectangle(Object id, Object left, Object top, Object right, Object bottom)
{
return 0d;
}

public static Object mp_grid_add_cell(Object id, Object h, Object v)
{
return 0d;
}

public static Object mp_grid_add_rectangle(Object id, Object left, Object top, Object right, Object bottom)
{
return 0d;
}

public static Object mp_grid_add_instances(Object id, Object obj, Object prec)
{
return 0d;
}

public static Object mp_grid_path(Object id, Object path, Object xstart, Object ystart, Object xgoal, Object ygoal, Object allowdiag)
{
return 0d;
}

public static Object mp_grid_draw(Object id)
{
return 0d;
}

/*
 * 
 * Collision checking
 * 
 */
public static Object collision_point(Object x, Object y, Object obj, Object prec, Object notme)
{
return 0d;
}

public static Object collision_rectangle(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return 0d;
}

public static Object collision_circle(Object x1, Object y1, Object radius, Object obj, Object prec, Object notme)
{
return 0d;
}

public static Object collision_ellipse(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return 0d;
}

public static Object collision_line(Object x1, Object y1, Object x2, Object y2, Object obj, Object prec, Object notme)
{
return 0d;
}

/*
 * 
 * Instances
 * 
 */

public static Object instance_find(Object obj, Object n)
{
return 0d;
}

public static Object instance_exists(Object obj)
{
return 0d;
}

public static Object instance_number(Object obj)
{
return 0d;
}

public static Object instance_position(Object x, Object y, Object obj)
{
return 0d;
}

public static Object instance_nearest(Object x, Object y, Object obj)
{
return 0d;
}

public static Object instance_furthest(Object x, Object y, Object obj)
{
return 0d;
}

public static Object instance_place(Object x, Object y, Object obj)
{
return 0d;
}

public static Object instance_create(Object x, Object y, Object obj)
{
        try {
            Class ins = ((GMResource)obj).theclass;
            Game.maxInstanceId++;
            Actor o = (Actor) ins.getDeclaredConstructor(double.class,double.class,double.class).newInstance((Double)x,(Double)y,(Game.maxInstanceId));
            
            Game.currentRoom.instances.add(o);
            
        } catch (Exception ex) {
            //Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        	ex.printStackTrace();
        }

return (Game.maxInstanceId);
}

public Object instance_copy(Object performevent)
{
    Game.maxInstanceId++;
        try {
            
            Actor o = (Actor) this.clone();
            Game.currentRoom.instances.add(o);
            //Game.allinstances.put(Game.maxInstanceId, o);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Game.maxInstanceId);
}

public static Object instance_change(Object obj, Object performevents)
{
    System.out.println("instance change");
    
return 0d;
}

public static Object instance_destroy()
{
return 0d;
}

public static Object position_destroy(Object x, Object y)
{
return 0d;
}

public static Object position_change(Object x, Object y, Object obj, Object performevents)
{
return 0d;
}

/*
 * 
 * Deactivating instances
 * 
 */
public /*static*/ Object instance_deactivate_all(Object notme)
{
    //Game.currentRoom.instances
     for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
        Actor act = (Actor)Game.currentRoom.instances.elementAt(i);
        act.active=false;
    }
     if (Variable.toBoolean(notme))
       self.active=true;
return 0d;
}

public static Object instance_deactivate_Object(Object obj)
{
return 0d;
}

public static Object instance_deactivate_region(Object left, Object top, Object width, Object height, Object inside, Object notme)
{
return 0d;
}

public static Object instance_activate_all()
{
return 0d;
}

public static Object instance_activate_Object(Object obj)
{
return 0d;
}

public static Object instance_activate_region(Object left, Object top, Object width, Object height, Object inside)
{
return 0d;
}

/*
 * 
 * Timing
 * 
 */
public static Object sleep(Object millisec)
{
        try {
            Thread.sleep(((Double)millisec).intValue());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0d;
}

/*
 * 
 * Rooms
 * 
 */
public static Object room_goto(Object numb)
{
return 0d;
}

public static Object room_goto_previous()
{
return 0d;
}

public static Object room_goto_next()
{
return 0d;
}

public static Object room_previous(Object numb)
{
return 0d;
}

public static Object room_next(Object numb)
{
return 0d;
}

public static Object room_restart()
{
return 0d;
}

public static Object game_end()
{
    System.exit(0);
return 0d;
}

public static Object game_restart()
{
return 0d;
}

public static Object game_load(Object filename)
{
return 0d;
}

public static Object game_save(Object filename)
{
return 0d;
}

/*
 * 
 * Event
 * 
 */
public static Object event_perform(Object type, Object numb)
{
return 0d;
}

public static Object event_user(Object numb)
{
return 0d;
}

public static Object event_perform_Object(Object obj, Object type, Object numb)
{
return 0d;
}

public static Object event_inherited()
{
return 0d;
}

/*
 * 
 * Miscellaneous 
 * 
 */
public static Object show_debug_message(Object str)
{
    //Game.debug.println(str);
	System.out.println(str);
    return 0d;
}

public static Object variable_global_exists(Object name)
{
	return new Boolean(Global.variables.contains(name.toString()));
}

public static Object variable_global_get(Object name)
{
	return Global.variables.get(name.toString());
}

public static Object variable_global_array_get(Object name, Object ind)
{
	return Global.variables.get(name + "[" + ind + "]");
}

public static Object variable_global_array2_get(Object name, Object ind1, Object ind2)
{
	return Global.variables.get(name + "[" + ind1 + "]" + "[" + ind2 + "]");
}

public static Object variable_global_set(Object name, Object value)
{
	Global.variables.put(name.toString(), value);
return 0d;
}

public static Object variable_global_array_set(Object name, Object ind, Object value)
{
	Global.variables.put(name + "[" + ind + "]", value);	
return 0d;
}

public static Object variable_global_array2_set(Object name, Object ind1, Object ind2, Object value)
{
	Global.variables.put(name + "[" + ind1 + "]" + "[" + ind2 + "]", value);
return 0d;
}

public Object variable_local_exists(Object name)
{
	return new Boolean(self.variables.contains(name.toString()));
}

public Object variable_local_get(Object name)
{
	return self.variables.get(name.toString());
}

public Object variable_local_array_get(Object name, Object ind)
{
	return self.variables.get(name + "[" + ind + "]");
}

public Object variable_local_array2_get(Object name, Object ind1, Object ind2)
{
	return self.variables.get(name + "[" + ind1 + "]" + "[" + ind2 + "]");
}

public Object variable_local_set(Object name, Object value)
{
	self.variables.put(name.toString(), value);
	return 0d;
}

public Object variable_local_array_set(Object name, Object ind, Object value)
{
	self.variables.put(name + "[" + ind + "]", value);
return 0d;
}

public Object variable_local_array2_set(Object name, Object ind1, Object ind2, Object value)
{
	self.variables.put(name + "[" + ind1 + "]" + "[" + ind2 + "]", value);
return 0d;
}

public static Object set_program_priority(Object priority)
{
return 0d;
}

/*
 * 
 * Keyboard
 * 
 */
public static Object keyboard_set_map(Object key1, Object key2)
{
   /* keymaps currently don't work
	if (Game.keymap == null)
        Game.keymap = new Hashtable();
    Game.keymap.put(((Double)key1), ((Double)key2));*/
return 0d;
}

public static Object keyboard_get_map(Object key)
{
return 0d;
}

public static Object keyboard_unset_map()
{
return 0d;
}

public static Object keyboard_check(Object key)
{
return new Boolean( Game.game.getGame().bsInput.isKeyDown(((Double)key).intValue()));
}

public static Object keyboard_check_pressed(Object key)
{
   return new Boolean( Game.game.getGame().bsInput.isKeyPressed(((Double)key).intValue()));
//return 0d;
}

public static Object keyboard_check_released(Object key)
{
    return new Boolean( Game.game.getGame().bsInput.isKeyReleased(((Double)key).intValue()));
//return 0d;
}

public static Object keyboard_check_direct(Object key)
{
return keyboard_check(key);
}

public static Object keyboard_get_numlock()
{
return 0d;
}

public static Object keyboard_set_numlock(Object on)
{
return 0d;
}

public static Object keyboard_key_press(Object key)
{
return 0d;
}

public static Object keyboard_key_release(Object key)
{
return 0d;
}

public static Object keyboard_clear(Object key)
{
return 0d;
}

public static Object io_clear()
{
return 0d;
}

public static Object io_handle()
{
return 0d;
}

public static Object keyboard_wait()
{
return 0d;
}

/*
 * 
 * The mouse
 * 
 */
public static Object mouse_check_button(Object button)
{
return 0d;
}

public static Object mouse_check_button_pressed(Object button)
{
return 0d;
}

public static Object mouse_check_button_released(Object button)
{
return 0d;
}

public static Object mouse_clear(Object button)
{
return 0d;
}

public static Object mouse_wait()
{
return 0d;
}

/*
 * 
 * Joystick
 * 
 */
public static Object joystick_exists(Object id)
{
return 0d;
}

public static Object joystick_direction(Object id)
{
return 0d;
}

public static Object joystick_name(Object id)
{
return 0d;
}

public static Object joystick_axes(Object id)
{
return 0d;
}

public static Object joystick_buttons(Object id)
{
return 0d;
}

public static Object joystick_has_pov(Object id)
{
return 0d;
}

public static Object joystick_check_button(Object id, Object button)
{
return 0d;
}

public static Object joystick_xpos(Object id)
{
return 0d;
}

public static Object joystick_ypos(Object id)
{
return 0d;
}

public static Object joystick_zpos(Object id)
{
return 0d;
}

public static Object joystick_rpos(Object id)
{
return 0d;
}

public static Object joystick_upos(Object id)
{
return 0d;
}

public static Object joystick_vpos(Object id)
{
return 0d;
}

public static Object joystick_pov(Object id)
{
return 0d;
}

/*
 * 
 * Drawing Sprites and images
 * 
 */

public static Object draw_sprite(Object sprite, Object subimg, Object x, Object y)
{
    
    Game.currentRoom.g2d.drawImage(((Sprite)sprite).imshow(((Double)subimg).intValue()), null, ((Double)x).intValue(), ((Double)y).intValue());
return 0d;
}

public static Object draw_sprite_ext(Object sprite, Object subimg, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return 0d;
}

public static Object draw_sprite_stretched(Object sprite, Object subimg, Object x, Object y, Object w, Object h)
{
    Game.currentRoom.g2d.drawImage(ImageUtil.resize(((Sprite)sprite).imshow(((Double)subimg).intValue()),((Double)w).intValue(),((Double)y).intValue()), null, ((Double)x).intValue(), ((Double)y).intValue());
return 0d;
}

public static Object draw_sprite_stretched_ext(Object sprite, Object subimg, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return 0d;
}

public static Object draw_sprite_tiled(Object sprite, Object subimg, Object x, Object y)
{
return 0d;
}

public static Object draw_sprite_tiled_ext(Object sprite, Object subimg, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_sprite_part(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y)
{
return 0d;
}

public static Object draw_sprite_part_ext(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_sprite_general(Object sprite, Object subimg, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return 0d;
}

public static Object draw_background(Object back, Object x, Object y)
{
return 0d;
}

public static Object draw_background_ext(Object back, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return 0d;
}

public static Object draw_background_stretched(Object back, Object x, Object y, Object w, Object h)
{
return 0d;
}

public static Object draw_background_stretched_ext(Object back, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return 0d;
}

public static Object draw_background_tiled(Object back, Object x, Object y)
{
return 0d;
}

public static Object draw_background_tiled_ext(Object back, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_background_part(Object back, Object left, Object top, Object width, Object height, Object x, Object y)
{
return 0d;
}

public static Object draw_background_part_ext(Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_background_general(Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return 0d;
}

/*
 * 
 * Drawing shapes
 * 
 */
public static Object draw_clear(Object col)
{
    Game.currentRoom.g2d.setColor( ((Color)col).c );
        Game.currentRoom.g2d.fillRect( 0, 0, Game.currentRoom.width, Game.currentRoom.height );
return 0d;
}

public static Object draw_clear_alpha(Object col, Object alpha)
{
return 0d;
}

public static Object draw_point(Object x, Object y)
{
    Game.currentRoom.g2d.fillRect(((Double)x).intValue(), ((Double)y).intValue(), 1, 1);
return 0d;
}

public static Object draw_line(Object x1, Object y1, Object x2, Object y2)
{
    Game.currentRoom.g2d.drawLine(((Double)x1).intValue(), ((Double)y1).intValue(), ((Double)x2).intValue(), ((Double)y2).intValue());
return 0d;
}

public static Object draw_rectangle(Object x1, Object y1, Object x2, Object y2, Object outline)
{
   // System.out.println(""+((Double)x1));
    if (((Double)x1) > ((Double)x2)) {
    temp = x1;
    x1 = x2;
    x2=temp;
    }
    if (((Double)y1) > ((Double)y2)) {
    temp = y1;
    y1 = y2;
    y2=temp;
    }
    if ((Variable.toBoolean(outline)))
    Game.currentRoom.g2d.drawRect(((Double)x1).intValue(), ((Double)y1).intValue(), (int)(((Double)x2)-((Double)x1)), (int)(((Double)y2)-((Double)y1)));
    else
        Game.currentRoom.g2d.fillRect(((Double)x1).intValue(), ((Double)y1).intValue(), (int)(((Double)x2)-((Double)x1)), (int)(((Double)y2)-((Double)y1)));
    
    return 0d;
}
static Object temp= new Object();
public static Object draw_roundrect(Object x1, Object y1, Object x2, Object y2, Object outline)
{
     if (((Double)x1) > ((Double)x2)) {
    temp = x1;
    x1 = x2;
    x2=temp;
    }
    if (((Double)y1) > ((Double)y2)) {
    temp = y1;
    y1 = y2;
    y2=temp;
    }
    if ((Variable.toBoolean(outline)))
    Game.currentRoom.g2d.drawRoundRect(((Double)x1).intValue(), ((Double)y1).intValue(), (int)(((Double)x2)-((Double)x1)), (int)(((Double)y2)-((Double)y1)),10,10);
    else
        Game.currentRoom.g2d.fillRoundRect(((Double)x1).intValue(), ((Double)y1).intValue(), (int) (((Double)x2)-((Double)x1)), (int)(((Double)y2)-((Double)y1)),10,10);
    
return 0d;
}

public static Object draw_triangle(Object x1, Object y1, Object x2, Object y2, Object x3, Object y3, Object outline)
{
   int[] xPoints = {((Double)x1).intValue(),((Double)x2).intValue(),((Double)x3).intValue()};
   int[] yPoints = {((Double)y1).intValue(),((Double)y2).intValue(),((Double)y3).intValue()};
   Shape s = new Polygon(xPoints, yPoints, 3);
   if ((Variable.toBoolean(outline))) {
	   Game.currentRoom.g2d.draw(s);
   } else {
	   Game.currentRoom.g2d.fill(s);
   }
return 0d;
}

public static Object draw_circle(Object x, Object y, Object rr, Object outline)
{
	double r = ((Double)rr);
	Shape s = new Ellipse2D.Double(((Double)x)-r, ((Double)y)-r, r*2, r*2);
	if ((Variable.toBoolean(outline))) {
		Game.currentRoom.g2d.draw(s);
	} else {
		Game.currentRoom.g2d.fill(s);
	}
return 0d;
}

public static Object draw_ellipse(Object x1, Object y1, Object x2, Object y2, Object outline)
{
	Shape s = new Ellipse2D.Double(((Double)x1), ((Double)y1), ((Double)x2), ((Double)y2));
	if ((Variable.toBoolean(outline))) {
		Game.currentRoom.g2d.draw(s);
	} else {
		Game.currentRoom.g2d.fill(s);
	}
return 0d;
}

public static Object draw_set_antialiasing(Object enable)
{
	Game.currentRoom.g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
			(Variable.toBoolean(enable))
			  ? RenderingHints.VALUE_ANTIALIAS_ON
			  : RenderingHints.VALUE_ANTIALIAS_OFF);
	return 0d;
}

public static Object draw_arrow(Object x1, Object y1, Object x2, Object y2, Object size)
{
	
return 0d;
}

public static Object draw_button(Object x1, Object y1, Object x2, Object y2, Object up)
{
	int 
	x = ((Double)x1).intValue(), 
	y = ((Double)y1).intValue(),
	w = (int)(((Double)x2)-((Double)x1)),
	h = (int)(((Double)y2)-((Double)y1));

	Game.currentRoom.g2d.fillRect(x, y, w, h);
	BevelBorder b = new BevelBorder((Variable.toBoolean(up)) ? BevelBorder.RAISED : BevelBorder.LOWERED);
	b.paintBorder(new Component() {
		private static final long serialVersionUID = 1L;
		public java.awt.Color getBackground() {
			return Game.currentRoom.g2d.getColor();}}, Game.currentRoom.g2d, x, y, w, h);
    
return 0d;
}

public static Object draw_path(Object path, Object x, Object y, Object absolute)
{
return 0d;
}

public static Object draw_healthbar(Object x1, Object y1, Object x2, Object y2, Object amount, Object backcol, Object mincol, Object maxcol, Object direction, Object showback, Object showborder)
{
return 0d;
}

public static Object draw_getpixel(Object x, Object y)
{
	//return new Color();
return 0d;
}

public static Object draw_set_color(Object col)
{
   Game.currentRoom.g2d.setColor(((Color)col).c); 
return 0d;
}

public static Object draw_set_alpha(Object alpha)
{
return 0d;
}

public static Object draw_get_color()
{
  return  new Color(Game.currentRoom.g2d.getColor()); 
}

public static Object draw_get_alpha()
{
return 0d;
}

public static Object make_color_rgb(Object red, Object green, Object blue)
{
return new Color(((Double)red).intValue(),((Double)green).intValue(),((Double)blue).intValue());
}

public static Object make_color_hsv(Object hue, Object s, Object value)
{
    return new Color(java.awt.Color.getHSBColor((float)(((Double)hue)/255), (float)(((Double)s)/255), ((Double)value).floatValue()/255));
}

public static Object color_get_red(Object col)
{
return (((Color)col).c.getRed());
}

public static Object color_get_green(Object col)
{
return (((Color)col).c.getGreen());
}

public static Object color_get_blue(Object col)
{
return (((Color)col).c.getBlue());
}

private static int[] rgb2hsv(int r, int g, int b) {
	
	int min;    //Min. value of RGB
	int max;    //Max. value of RGB
	int delMax; //Delta RGB value
	
	if (r > g) { min = g; max = r; }
	else { min = r; max = g; }
	if (b > max) max = b;
	if (b < min) min = b;
							
	delMax = max - min;
 
	float H = 0, S;
	float V = max;
	   
	if ( delMax == 0 ) { H = 0; S = 0; }
	else {                                   
		S = delMax/255f;
		if ( r == max ) 
			H = (      (g - b)/(float)delMax)*60;
		else if ( g == max ) 
			H = ( 2 +  (b - r)/(float)delMax)*60;
		else if ( b == max ) 
			H = ( 4 +  (r - g)/(float)delMax)*60;   
	}
	
	return new int[] {						 
	 (int)(H),
	 (int)(S*100),
	 (int)(V*100),
	};
}
public static Object color_get_hue(Object col)
{
	java.awt.Color c = ((Color)col).c;
	return (rgb2hsv(c.getRed(), c.getGreen(), c.getBlue())[0]);
}

public static Object color_get_saturation(Object col)
{
	java.awt.Color c = ((Color)col).c;
	return (rgb2hsv(c.getRed(), c.getGreen(), c.getBlue())[1]);
}

public static Object color_get_value(Object col)
{
	java.awt.Color c = ((Color)col).c;
	return (rgb2hsv(c.getRed(), c.getGreen(), c.getBlue())[2]);
}

public static Object merge_color(Object col1, Object col2, Object amnt)
{
	double amount = ((Double)amnt);
	java.awt.Color c1 = ((Color)col1).c, c2 = ((Color)col2).c;
	int r1,g1,b1,a1;
	r1 = c1.getRed();
	g1 = c1.getGreen();
	b1 = c1.getBlue();
	a1 = c1.getAlpha();
	int r2,g2,b2,a2;
	r2 = c2.getRed();
	g2 = c2.getGreen();
	b2 = c2.getBlue();
	a2 = c2.getAlpha();
	int rf, gf, bf, af;
	rf = (int)(r1+((r2-r1)*amount));
	gf = (int)(g1+((g2-g1)*amount));
	bf = (int)(b1+((b2-b1)*amount));
	af = (int)(a1+((a2-a1)*amount));
	Color merge = new Color(new java.awt.Color(rf, gf, bf, af));
	return merge;
}

public static Object screen_save(Object fname)
{
return 0d;
}

public static Object screen_save_part(Object fname, Object x, Object y, Object w, Object h)
{
return 0d;
}


/*
 * 
 * Fonts and text
 * 
 */
public static Object draw_set_font(Object font)
{
return 0d;
}

public static Object draw_set_halign(Object halign)
{
return 0d;
}

public static Object draw_set_valign(Object valign)
{
return 0d;
}

public static Object draw_text(Object x, Object y, Object string)
{
    Game.currentRoom.g2d.drawString(""+string, ((Double)x).intValue(), ((Double)y).intValue());
return 0d;
}

public static Object draw_text_ext(Object x, Object y, Object string, Object sep, Object w)
{
    draw_text(x,y,string);
return 0d;
}


public static Object string_width(Object string)
{
    if (Game.currentRoom.g2d !=null)
    return ( Game.currentRoom.g2d.getFontMetrics().stringWidth(""+string));
return 0d;
}

public static Object string_height(Object string)
{
    if (Game.currentRoom.g2d !=null)
    return ( Game.currentRoom.g2d.getFontMetrics().getHeight());
return 0d;
}

public static Object string_width_ext(Object string, Object sep, Object w)
{
return string_width(string);
}

public static Object string_height_ext(Object string, Object sep, Object w)
{
return string_height(string);
}

public static Object draw_text_rotated(Object x, Object y, Object string, Object angle)
{
AffineTransform at = AffineTransform.getRotateInstance ( java.lang.Math.toRadians ( ((Double)angle) ) );
    Font f =  Game.currentRoom.g2d.getFont();
    Game.currentRoom.g2d.setFont ( Game.currentRoom.g2d.getFont().deriveFont ( at ) );
    Game.currentRoom.g2d.drawString(""+string, ((Double)x).intValue(), ((Double)y).intValue());
Game.currentRoom.g2d.setFont(f);
return 0d;
}

public static Object draw_text_transformed(Object x, Object y, Object string, Object xscale, Object yscale, Object angle)
{
AffineTransform at = AffineTransform.getRotateInstance ( java.lang.Math.toRadians ( ((Double)angle) ) );
    Font f =  Game.currentRoom.g2d.getFont();
    Game.currentRoom.g2d.setFont ( Game.currentRoom.g2d.getFont().deriveFont ( at ) );
    Game.currentRoom.g2d.drawString(""+string, ((Double)x).intValue(), ((Double)y).intValue());
Game.currentRoom.g2d.setFont(f);
return 0d;
}

public static Object draw_text_ext_transformed(Object x, Object y, Object string, Object sep, Object w, Object xscale, Object yscale, Object angle)
{
    draw_text_transformed(x, y, string, xscale, yscale, angle);
return 0d;
}

public static Object draw_text_color(Object x, Object y, Object string, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
    draw_text(x, y, string);
return 0d;
}

public static Object draw_text_ext_color(Object x, Object y, Object string, Object sep, Object w, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
    draw_text(x, y, string);
return 0d;
}

public static Object draw_text_transformed_color(Object x, Object y, Object string, Object xscale, Object yscale, Object angle, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
    draw_text(x, y, string);
return 0d;
}

public static Object draw_text_ext_transformed_color(Object x, Object y, Object string, Object sep, Object w, Object xscale, Object yscale, Object angle, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
    draw_text(x, y, string);
return 0d;
}

/*
 * 
 * Advanced drawing functions
 * 
 */
public static Object draw_point_color(Object x, Object y, Object col1)
{
return 0d;
}

public static Object draw_line_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2)
{
return 0d;
}

public static Object draw_line_width_color(Object... obj){
	return 0d;	
}

public static Object draw_rectangle_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object col3, Object col4, Object outline)
{
return 0d;
}

public static Object draw_roundrect_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object outline)
{
return 0d;
}

public static Object draw_triangle_color(Object x1, Object y1, Object x2, Object y2, Object x3, Object y3, Object col1, Object col2, Object col3, Object outline)
{
return 0d;
}

public static Object draw_circle_color(Object x, Object y, Object r, Object col1, Object col2, Object outline)
{
return 0d;
}

public static Object draw_ellipse_color(Object x1, Object y1, Object x2, Object y2, Object col1, Object col2, Object outline)
{
return 0d;
}

public static Object draw_primitive_begin(Object kind)
{
return 0d;
}

public static Object draw_vertex(Object x, Object y)
{
return 0d;
}

public static Object draw_vertex_color(Object x, Object y, Object col, Object alpha)
{
return 0d;
}

public static Object draw_primitive_end()
{
return 0d;
}

public static Object sprite_get_texture(Object spr, Object subimg)
{
return 0d;
}

public static Object background_get_texture(Object back)
{
return 0d;
}

public static Object texture_preload(Object texid)
{
return 0d;
}

public static Object texture_set_priority(Object texid, Object prio)
{
return 0d;
}

public static Object texture_get_width(Object texid)
{
return 0d;
}

public static Object texture_get_height(Object texid)
{
return 0d;
}

public static Object draw_primitive_begin_texture(Object kind, Object texid)
{
return 0d;
}

public static Object draw_vertex_texture(Object x, Object y, Object xtex, Object ytex)
{
return 0d;
}

public static Object draw_vertex_texture_color(Object x, Object y, Object xtex, Object ytex, Object col, Object alpha)
{
return 0d;
}

public static Object texture_set_interpolation(Object linear)
{
return 0d;
}

public static Object texture_set_blending(Object blend)
{
return 0d;
}

public static Object texture_set_repeat(Object repeat)
{
return 0d;
}

public static Object draw_set_blend_mode(Object mode)
{
return 0d;
}

public static Object draw_set_blend_mode_ext(Object src, Object dest)
{
return 0d;
}

/*
 * 
 * Drawing Surfaces
 * 
 */
public static Object surface_create(Object w, Object h)
{
return new Surface(((Double)w).intValue(),((Double)h).intValue());
}

public static Object surface_free(Object id)
{
    //not needed
return 0d;
}

public static Object surface_exists(Object id)
{
    //not needed
return 0d;
}

public static Object surface_get_width(Object id)
{
return (((Surface)id).width);
}

public static Object surface_get_height(Object id)
{
return (((Surface)id).height);
}

public static Object surface_get_texture(Object id)
{
    //not needed
return 0d;
}

public static Object surface_set_target(Object id)
{
    Game.graphics = Game.currentRoom.g2d;
    Game.currentRoom.g2d = ((Surface)id).b.createGraphics();
    
return 0d;
}

public static Object surface_reset_target()
{
    Game.graphics =null;
    System.out.println("surface");
return 0d;
}

public static Object draw_surface(Object id, Object x, Object y)
{
    Game.currentRoom.g2d.drawImage(((Surface)id).b, null, ((Double)x).intValue(), ((Double)y).intValue());
    
return 0d;
}

public static Object draw_surface_stretched(Object id, Object x, Object y, Object w, Object h)
{
return 0d;
}

public static Object draw_surface_tiled(Object id, Object x, Object y)
{
return 0d;
}

public static Object draw_surface_part(Object id, Object left, Object top, Object width, Object height, Object x, Object y)
{
return 0d;
}

public static Object draw_surface_ext(Object id, Object x, Object y, Object xscale, Object yscale, Object rot, Object color, Object alpha)
{
return 0d;
}

public static Object draw_surface_stretched_ext(Object id, Object x, Object y, Object w, Object h, Object color, Object alpha)
{
return 0d;
}

public static Object draw_surface_tiled_ext(Object id, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_surface_part_ext(Object id, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object color, Object alpha)
{
return 0d;
}

public static Object draw_surface_general(Object id, Object left, Object top, Object width, Object height, Object x, Object y, Object xscale, Object yscale, Object rot, Object c1, Object c2, Object c3, Object c4, Object alpha)
{
return 0d;
}

public static Object surface_getpixel(Object id, Object x, Object y)
{
    new Color(new java.awt.Color(((Surface) id).b.getRGB(((Double)x).intValue(), ((Double)y).intValue())));
return 0d;
}

public static Object surface_save(Object id, Object fname)
{
        try {

            ImageIO.write(((Surface) id).b, "png", new java.io.File("" + fname+".png"));
            return 0d;
        } catch (IOException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0d;
}

public static Object surface_save_part(Object id, Object fname, Object x, Object y, Object w, Object h)
{
 try {

            ImageIO.write(((Surface) id).b.getSubimage(((Double)x).intValue(), ((Double)y).intValue(), ((Double)w).intValue(), ((Double)h).intValue()), "png", new java.io.File("" + fname+".png"));
            return 0d;
        } catch (IOException ex) {
            Logger.getLogger(GCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0d;
}

public static Object surface_copy(Object destination, Object x, Object y, Object source)
{
return 0d;
}

public static Object surface_copy_part(Object destination, Object x, Object y, Object source, Object xs, Object ys, Object ws, Object hs)
{
return 0d;
}

/*
 * 
 * Tiles
 * 
 */
public static Object tile_add(Object background, Object left, Object top, Object width, Object height, Object x, Object y, Object depth)
{
return 0d;
}

public static Object tile_delete(Object id)
{
return 0d;
}

public static Object tile_exists(Object id)
{
return 0d;
}

public static Object tile_get_x(Object id)
{
return 0d;
}

public static Object tile_get_y(Object id)
{
return 0d;
}

public static Object tile_get_left(Object id)
{
return 0d;
}

public static Object tile_get_top(Object id)
{
return 0d;
}

public static Object tile_get_width(Object id)
{
return 0d;
}

public static Object tile_get_height(Object id)
{
return 0d;
}

public static Object tile_get_depth(Object id)
{
return 0d;
}

public static Object tile_get_visible(Object id)
{
return 0d;
}

public static Object tile_get_xscale(Object id)
{
return 0d;
}

public static Object tile_get_yscale(Object id)
{
return 0d;
}

public static Object tile_get_background(Object id)
{
return 0d;
}

public static Object tile_get_blend(Object id)
{
return 0d;
}

public static Object tile_get_alpha(Object id)
{
return 0d;
}

public static Object tile_set_position(Object id, Object x, Object y)
{
return 0d;
}

public static Object tile_set_region(Object id, Object left, Object right, Object width, Object height)
{
return 0d;
}

public static Object tile_set_background(Object id, Object background)
{
return 0d;
}

public static Object tile_set_visible(Object id, Object visible)
{
return 0d;
}

public static Object tile_set_depth(Object id, Object depth)
{
return 0d;
}

public static Object tile_set_scale(Object id, Object xscale, Object yscale)
{
return 0d;
}

public static Object tile_set_blend(Object id, Object color)
{
return 0d;
}

public static Object tile_set_alpha(Object id, Object alpha)
{
return 0d;
}

public static Object tile_layer_hide(Object depth)
{
return 0d;
}

public static Object tile_layer_show(Object depth)
{
return 0d;
}

public static Object tile_layer_delete(Object depth)
{
return 0d;
}

public static Object tile_layer_shift(Object depth, Object x, Object y)
{
return 0d;
}

public static Object tile_layer_find(Object depth, Object x, Object y)
{
return 0d;
}

public static Object tile_layer_delete_at(Object depth, Object x, Object y)
{
return 0d;
}

public static Object tile_layer_depth(Object depth, Object newdepth)
{
return 0d;
}

/*
 * 
 * The display
 * 
 */
public static Object display_get_width()
{
return (Display.getWidth());
}

public static Object display_get_height()
{
return (Display.getHeight());
}

public static Object display_get_colordepth()
{
return (Display.getColordepth());
}

public static Object display_get_frequency()
{
return (Display.getFrequency());
}

public static Object display_set_size(Object w, Object h)
{
return new Boolean(Display.setSize(((Double)w).intValue(),((Double)h).intValue()));
}

public static Object display_set_colordepth(Object coldepth)
{
return 0d;
}

public static Object display_set_frequency(Object frequency)
{
return 0d;
}

public static Object display_set_all(Object w, Object h, Object frequency, Object coldepth)
{
return 0d;
}

public static Object display_test_all(Object w, Object h, Object frequency, Object coldepth)
{
return 0d;
}

public static Object display_reset()
{
return 0d;
}

public static Object display_mouse_get_x()
{
return 0d;
}

public static Object display_mouse_get_y()
{
return 0d;
}

public static Object display_mouse_set(Object x, Object y)
{
return 0d;
}

/*
 * 
 * The window
 * 
 */
public static Object window_set_visible(Object visible)
{
    if (Game.game.getGame().bsGraphics instanceof WindowedMode)
        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible((Variable.toBoolean(visible)));
    
return 0d;
}

public static Object window_get_visible()
{
    if (Game.game.getGame().bsGraphics instanceof WindowedMode)
        return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isVisible());
return 0d;
}

public static Object window_set_fullscreen(Object full)
{
    Game.fullscreen = Variable.toBoolean(full);
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] devices = env.getScreenDevices();
    GraphicsDevice device = devices[0];
    if (Variable.toBoolean(full)) {
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
return 0d;
}

public static Object window_get_fullscreen()
{
return new Boolean(Game.fullscreen);
}

public static Object window_set_showborder(Object show)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().dispose();
			((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setUndecorated((Variable.toBoolean(show))? false:true);
                        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setVisible(true);
return 0d;
}

public static Object window_get_showborder()
{
    
return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isUndecorated() ? false:true );
}

public static Object window_set_showicons(Object show)
{
    //((JFrame)((WindowedMode)Game.game.getGame().bsGraphics).getFrame()).getc.setWindowDecorationStyle(JRootPane.NONE);
            return 0d;
}

public static Object window_get_showicons()
{
return 0d;
}

public static Object window_set_stayontop(Object stay)
{
return 0d;
}

public static Object window_get_stayontop()
{
return 0d;
}

public static Object window_set_sizeable(Object sizeable)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setResizable((Variable.toBoolean(sizeable)));
return 0d;
}

public static Object window_get_sizeable()
{
return new Boolean(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().isResizable());
}

public static Object window_set_caption(Object caption)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setTitle(""+caption);
return 0d;
}

public static Object window_get_caption()
{
return new String(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getTitle());
}

public static Object window_set_cursor(Object curs)
{
    if(curs instanceof Cursor)
        ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setCursor(((Cursor)curs).c);
return 0d;
}

public static Object window_get_cursor()
{
return new Cursor(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getCursor());
}

public static Object window_set_color(Object color)
{
  ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setBackground(((Color)color).c);
return 0d;
}

public static Object window_get_color()
{
return new Color(((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getBackground());
}

public static Object window_set_region_scale(Object scale, Object adaptwindow)
{
return 0d;
}

public static Object window_get_region_scale()
{
return 0d;
}

public static Object window_set_position(Object x, Object y)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation(((Double)x).intValue(), ((Double)y).intValue());
return 0d;
}

public static Object window_set_size(Object w, Object h)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(((Double)w).intValue(), ((Double)h).intValue());
return 0d;
}

public static Object window_set_rectangle(Object x, Object y, Object w, Object h)
{
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(((Double)w).intValue(), ((Double)h).intValue());
((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation(((Double)x).intValue(), ((Double)y).intValue());
return 0d;
}

public static Object window_center()
{
    Dimension dim = ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getToolkit().getScreenSize();
  Rectangle abounds = ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getBounds();
  ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setLocation((dim.width - abounds.width) / 2,
      (dim.height - abounds.height) / 2);
return 0d;
}

public static Object window_default()
{
    //sets to room hight/width
    ((WindowedMode)Game.game.getGame().bsGraphics).getFrame().setSize(Game.currentRoom.width, Game.currentRoom.height);
    window_center();
return 0d;
}

public static Object window_get_x()
{
return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getX());
}

public static Object window_get_y()
{
return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getY());
}

public static Object window_get_width()
{
return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getWidth());
}

public static Object window_get_height()
{
return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getHeight());
}

public static Object window_mouse_get_x()
{
    try{
    return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getMousePosition().getX());

    }catch(Exception e){}
    return (0);
}

public static Object window_mouse_get_y()
{
 try{
    return (((WindowedMode)Game.game.getGame().bsGraphics).getFrame().getMousePosition().getY());

    }catch(Exception e){}
    return (0);
}

public static Object window_mouse_set(Object x, Object y)
{
    try {
        java.awt.Robot r = new java.awt.Robot();
        r.mouseMove(((Double)x).intValue(), ((Double)y).intValue());
    } catch (AWTException aWTException) {
    }
return 0d;
}

/*
 * 
 * Views
 * 
 */
public static Object window_set_region_size(Object w, Object h, Object adaptwindow)
{
return 0d;
}

public static Object window_get_region_width()
{
return 0d;
}

public static Object window_get_region_height()
{
return 0d;
}

public static Object window_view_mouse_get_x(Object id)
{
return 0d;
}

public static Object window_view_mouse_get_y(Object id)
{
return 0d;
}

public static Object window_view_mouse_set(Object id, Object x, Object y)
{
return 0d;
}

public static Object window_views_mouse_get_x()
{
return 0d;
}

public static Object window_views_mouse_get_y()
{
return 0d;
}

public static Object window_views_mouse_set(Object x, Object y)
{
return 0d;
}

/*
 * 
 * Repainting the screen
 * 
 */
public static Object screen_redraw()
{
        Game.currentRoom.render(Game.game.getGame().bsGraphics.getBackBuffer());
        Game.game.getGame().bsGraphics.flip();
       // Game.game.getGame().bsGraphics.getBackBuffer()
    
return 0d;
}

public static Object screen_refresh()
{
return 0d;
}

public static Object screen_wait_vsync()
{
return 0d;
}

public static Object set_automatic_draw(Object value)
{
    Game.auto_redraw = Variable.toBoolean(value);
return 0d;
}

public static Object set_synchronization(Object value)
{
return 0d;
}

/*
 *  
 * Basic sound functions
 * 
 */
public static Object sound_play(Object index)
{
return 0d;
}

public static Object sound_loop(Object index)
{
return 0d;
}

public static Object sound_stop(Object index)
{
return 0d;
}

public static Object sound_stop_all()
{
return 0d;
}

public static Object sound_isplaying(Object index)
{
return 0d;
}

public static Object sound_volume(Object index, Object value)
{
return 0d;
}

public static Object sound_global_volume(Object value)
{
return 0d;
}

public static Object sound_fade(Object index, Object value, Object time)
{
return 0d;
}

public static Object sound_pan(Object index, Object value)
{
return 0d;
}

public static Object sound_background_tempo(Object factor)
{
return 0d;
}

public static Object sound_set_search_directory(Object dir)
{
return 0d;
}

/*
 * 
 * Sound effects
 * 
 */
public static Object sound_effect_set(Object snd, Object effect)
{
return 0d;
}

public static Object sound_effect_chorus(Object snd, Object wetdry, Object depth, Object feedback, Object frequency, Object wave, Object delay, Object phase)
{
return 0d;
}

public static Object sound_effect_echo(Object snd, Object wetdry, Object feedback, Object leftdelay, Object rightdelay, Object pandelay)
{
return 0d;
}

public static Object sound_effect_flanger(Object snd, Object wetdry, Object depth, Object feedback, Object frequency, Object wave, Object delay, Object phase)
{
return 0d;
}

public static Object sound_effect_gargle(Object snd, Object rate, Object wave)
{
return 0d;
}

public static Object sound_effect_reverb(Object snd, Object gain, Object mix, Object time, Object ratio)
{
return 0d;
}

public static Object sound_effect_compressor(Object snd, Object gain, Object attack, Object release, Object threshold, Object ratio, Object delay)
{
return 0d;
}

public static Object sound_effect_equalizer(Object snd, Object center, Object bandwidth, Object gain)
{
return 0d;
}

/*
 * 
 * 3D sound
 * 
 */
public static Object sound_3d_set_sound_position(Object snd, Object x, Object y, Object z)
{
return 0d;
}

public static Object sound_3d_set_sound_velocity(Object snd, Object x, Object y, Object z)
{
return 0d;
}

public static Object sound_3d_set_sound_distance(Object snd, Object mindist, Object maxdist)
{
return 0d;
}

public static Object sound_3d_set_sound_cone(Object snd, Object x, Object y, Object z, Object anglein, Object angleout, Object voloutside)
{
return 0d;
}

/*
 * 
 * CD music
 * 
 */
public static Object cd_init()
{
return 0d;
}

public static Object cd_present()
{
return 0d;
}

public static Object cd_number()
{
return 0d;
}

public static Object cd_playing()
{
return 0d;
}

public static Object cd_paused()
{
return 0d;
}

public static Object cd_track()
{
return 0d;
}

public static Object cd_length()
{
return 0d;
}

public static Object cd_track_length(Object n)
{
return 0d;
}

public static Object cd_position()
{
return 0d;
}

public static Object cd_track_position()
{
return 0d;
}

public static Object cd_play(Object first, Object last)
{
return 0d;
}

public static Object cd_stop()
{
return 0d;
}

public static Object cd_pause()
{
return 0d;
}

public static Object cd_resume()
{
return 0d;
}

public static Object cd_set_position(Object pos)
{
return 0d;
}

public static Object cd_set_track_position(Object pos)
{
return 0d;
}

public static Object cd_open_door()
{
return 0d;
}

public static Object cd_close_door()
{
return 0d;
}

public static Object MCI_command(Object str)
{
return 0d;
}

/*
 * 
 * Splash screens
 * 
 */
public static Object show_image(Object fname, Object full, Object delay)
{
return 0d;
}

public static Object show_video(Object fname, Object full, Object loop)
{
return 0d;
}

public static Object show_text(Object fname, Object full, Object backcol, Object delay)
{
return 0d;
}

public static Object show_info()
{
return 0d;
}

public static Object load_info(Object fname)
{
return 0d;
}

/*
 * 
 * Pop-up messages and questions
 * 
 */
public static Object show_message(Object str)
{
    JOptionPane.showMessageDialog(Game.frame, str.toString());
    Game.thegame.bsInput.refresh();
return 0d;
}

public static Object show_message_ext(Object str, Object but1, Object but2, Object but3)
{
return 0d;
}

public static Object show_question(Object str)
{
return 0d;
}

public static Object get_integer(Object str, Object def)
{
return 0d;
}

public static Object get_string(Object str, Object def)
{
return 0d;
}

public static Object message_background(Object back)
{
return 0d;
}

public static Object message_button(Object sprite)
{
return 0d;
}

public static Object message_alpha(Object alpha)
{
return 0d;
}

public static Object message_text_font(Object name, Object size, Object color, Object style)
{
return 0d;
}

public static Object message_button_font(Object name, Object size, Object color, Object style)
{
return 0d;
}

public static Object message_input_font(Object name, Object size, Object color, Object style)
{
return 0d;
}

public static Object message_mouse_color(Object col)
{
return 0d;
}

public static Object message_input_color(Object col)
{
return 0d;
}

public static Object message_position(Object x, Object y)
{
return 0d;
}

public static Object message_size(Object w, Object h)
{
return 0d;
}

public static Object message_caption(Object show, Object str)
{
return 0d;
}

public static Object show_menu(Object str, Object def)
{
return 0d;
}

public static Object show_menu_pos(Object x, Object y, Object str, Object def)
{
return 0d;
}

public static Object get_color(Object defcol)
{
return 0d;
}

public static Object get_open_filename(Object filter, Object fname)
{
return 0d;
}

public static Object get_save_filename(Object filter, Object fname)
{
return 0d;
}

public static Object get_directory(Object dname)
{
return 0d;
}

public static Object get_directory_alt(Object capt, Object root)
{
return 0d;
}

public static Object show_error(Object str, Object abort)
{
    JOptionPane.showMessageDialog(null, str.toString(),"Error!",JOptionPane.ERROR_MESSAGE );
    if (Variable.toBoolean(abort))
        System.exit(1);
    
    return 0d;
}

/*
 * 
 * Highscore list
 * 
 */
public static Object highscore_show_ext(Object numb, Object back, Object border, Object col1, Object col2, Object name, Object size)
{
return 0d;
}

public static Object highscore_show(Object numb)
{
return 0d;
}

public static Object highscore_set_background(Object back)
{
return 0d;
}

public static Object highscore_set_border(Object show)
{
return 0d;
}

public static Object highscore_set_font(Object name, Object size, Object style)
{
return 0d;
}

public static Object highscore_set_strings(Object caption, Object nobody, Object escape)
{
return 0d;
}

public static Object highscore_set_colors(Object back, Object newc, Object other)
{
return 0d;
}

public static Object highscore_clear()
{
return 0d;
}

public static Object highscore_add(Object str, Object numb)
{
return 0d;
}

public static Object highscore_add_current()
{
return 0d;
}

public static Object highscore_value(Object place)
{
return 0d;
}

public static Object highscore_name(Object place)
{
return 0d;
}

public static Object draw_highscore(Object x1, Object y1, Object x2, Object y2)
{
return 0d;
}

/*
 * 
 * Sprites
 * 
 */
public static Object sprite_exists(Object ind)
{
return 0d;
}

public static Object sprite_get_name(Object ind)
{
return 0d;
}

public static Object sprite_get_number(Object ind)
{
return 0d;
}

public static Object sprite_get_width(Object ind)
{
return 0d;
}

public static Object sprite_get_height(Object ind)
{
return 0d;
}

public static Object sprite_get_transparent(Object ind)
{
return 0d;
}

public static Object sprite_get_smooth(Object ind)
{
return 0d;
}

public static Object sprite_get_preload(Object ind)
{
return 0d;
}

public static Object sprite_get_xoffset(Object ind)
{
return 0d;
}

public static Object sprite_get_yoffset(Object ind)
{
return 0d;
}

public static Object sprite_get_bbox_mode(Object ind)
{
return 0d;
}

public static Object sprite_get_bbox_left(Object ind)
{
return 0d;
}

public static Object sprite_get_bbox_right(Object ind)
{
return 0d;
}

public static Object sprite_get_bbox_top(Object ind)
{
return 0d;
}

public static Object sprite_get_bbox_bottom(Object ind)
{
return 0d;
}

public static Object sprite_get_precise(Object ind)
{
return 0d;
}

/*
 * 
 * Sounds
 * 
 */
public static Object sound_exists(Object ind)
{
return 0d;
}

public static Object sound_get_name(Object ind)
{
return 0d;
}

public static Object sound_get_kind(Object ind)
{
return 0d;
}

public static Object sound_get_preload(Object ind)
{
return 0d;
}

public static Object sound_discard(Object ind)
{
return 0d;
}

public static Object sound_restore(Object ind)
{
return 0d;
}

/*
 * 
 * Backgrounds
 * 
 */
public static Object background_exists(Object ind)
{
return 0d;
}

public static Object background_get_name(Object ind)
{
return 0d;
}

public static Object background_get_width(Object ind)
{
return 0d;
}

public static Object background_get_height(Object ind)
{
return 0d;
}

public static Object background_get_transparent(Object ind)
{
return 0d;
}

public static Object background_get_smooth(Object ind)
{
return 0d;
}

public static Object background_get_preload(Object ind)
{
return 0d;
}

/*
 * 
 * Fonts
 * 
 */
public static Object font_exists(Object ind)
{
return 0d;
}

public static Object font_get_name(Object ind)
{
return 0d;
}

public static Object font_get_fontname(Object ind)
{
return 0d;
}

public static Object font_get_bold(Object ind)
{
return 0d;
}

public static Object font_get_italic(Object ind)
{
return 0d;
}

public static Object font_get_first(Object ind)
{
return 0d;
}

public static Object font_get_last(Object ind)
{
return 0d;
}

/*
 * 
 * Paths
 * 
 */
public static Object path_exists(Object ind)
{
return 0d;
}

public static Object path_get_name(Object ind)
{
return 0d;
}

public static Object path_get_length(Object ind)
{
return 0d;
}

public static Object path_get_kind(Object ind)
{
return 0d;
}

public static Object path_get_closed(Object ind)
{
return 0d;
}

public static Object path_get_precision(Object ind)
{
return 0d;
}

public static Object path_get_number(Object ind)
{
return 0d;
}

public static Object path_get_point_x(Object ind, Object n)
{
return 0d;
}

public static Object path_get_point_y(Object ind, Object n)
{
return 0d;
}

public static Object path_get_point_speed(Object ind, Object n)
{
return 0d;
}

public static Object path_get_x(Object ind, Object pos)
{
return 0d;
}

public static Object path_get_y(Object ind, Object pos)
{
return 0d;
}

public static Object path_get_speed(Object ind, Object pos)
{
return 0d;
}


/*
 * 
 * Scripts
 * 
 */
public static Object script_exists(Object ind)
{
return 0d;
}

public static Object script_get_name(Object ind)
{
return 0d;
}

public static Object script_get_text(Object ind)
{
return 0d;
}

/*
 * 
 * Time lines
 * 
 */
public static Object timeline_exists(Object ind)
{
return 0d;
}

public static Object timeline_get_name(Object ind)
{
return 0d;
}

/*
 * 
 * Objects
 * 
 */
public static Object actor_exists(Object ind)
{
return 0d;
}

public static Object actor_get_name(Object ind)
{
return ind;
}

public static Object object_get_sprite(Object ind)
{
return 0d;
}

public static Object object_get_solid(Object ind)
{
return 0d;
}

public static Object object_get_visible(Object ind)
{
return 0d;
}

public static Object object_get_depth(Object ind)
{
return 0d;
}

public static Object object_get_persistent(Object ind)
{
return 0d;
}

public static Object object_get_mask(Object ind)
{
return 0d;
}

public static Object object_get_parent(Object ind)
{
return 0d;
}

public static Object object_is_ancestor(Object ind1, Object ind2)
{
return 0d;
}

/*
 * 
 * Rooms
 * 
 */

public static Object room_exists(Object ind)
{
return 0d;
}

public static Object room_get_name(Object ind)
{
return 0d;
}

/*
 * 
 * Changing Sprites
 * 
 */
public static Object sprite_set_offset(Object ind, Object xoff, Object yoff)
{
return 0d;
}

public static Object sprite_set_bbox_mode(Object ind, Object mode)
{
return 0d;
}

public static Object sprite_set_bbox(Object ind, Object left, Object top, Object right, Object bottom)
{
return 0d;
}

public static Object sprite_set_precise(Object ind, Object mode)
{
return 0d;
}

public static Object sprite_duplicate(Object ind)
{
return 0d;
}

public static Object sprite_assign(Object ind, Object source)
{
return 0d;
}

public static Object sprite_merge(Object ind1, Object ind2)
{
return 0d;
}

public static Object sprite_add(Object fname, Object imgnumb, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return 0d;
}

public static Object sprite_replace(Object ind, Object fname, Object imgnumb, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return 0d;
}

public static Object sprite_create_from_screen(Object x, Object y, Object w, Object h, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return 0d;
}

public static Object sprite_add_from_screen(Object ind, Object x, Object y, Object w, Object h)
{
return 0d;
}

public static Object sprite_create_from_surface(Object id, Object x, Object y, Object w, Object h, Object precise, Object transparent, Object smooth, Object preload, Object xorig, Object yorig)
{
return 0d;
}

public static Object sprite_add_from_surface(Object ind, Object id, Object x, Object y, Object w, Object h)
{
return 0d;
}

public static Object sprite_delete(Object ind)
{
return 0d;
}

public static Object sprite_set_alpha_from_sprite(Object ind, Object spr)
{
return 0d;
}

/*
 * 
 * Changing Sounds
 * 
 */
public static Object sound_add(Object fname, Object kind, Object preload)
{
return 0d;
}

public static Object sound_replace(Object ind, Object fname, Object kind, Object preload)
{
return 0d;
}

public static Object sound_delete(Object ind)
{
return 0d;
}

/*
 * 
 * Changing Backgrounds
 * 
 */
public static Object background_duplicate(Object ind)
{
return 0d;
}

public static Object background_assign(Object ind, Object source)
{
return 0d;
}

public static Object background_add(Object fname, Object transparent, Object smooth, Object preload)
{
return 0d;
}

public static Object background_replace(Object ind, Object fname, Object transparent, Object smooth, Object preload)
{
return 0d;
}

public static Object background_create_color(Object w, Object h, Object col, Object preload)
{
return 0d;
}

public static Object background_create_gradient(Object w, Object h, Object col1, Object col2, Object kind, Object preload)
{
return 0d;
}

public static Object background_create_from_screen(Object x, Object y, Object w, Object h, Object transparent, Object smooth, Object preload)
{
return 0d;
}

public static Object background_create_from_surface(Object id, Object x, Object y, Object w, Object h, Object transparent, Object smooth, Object preload)
{
return 0d;
}

public static Object background_delete(Object ind)
{
return 0d;
}

public static Object background_set_alpha_from_background(Object ind, Object back)
{
return 0d;
}

/*
 * 
 * Changing Fonts
 * 
 */
public static Object font_add(Object name, Object size, Object bold, Object italic, Object first, Object last)
{
return 0d;
}

public static Object font_add_sprite(Object spr, Object first, Object prop, Object sep)
{
return 0d;
}

public static Object font_replace(Object ind, Object name, Object size, Object bold, Object italic, Object first, Object last)
{
return 0d;
}

public static Object font_replace_sprite(Object ind, Object spr, Object first, Object prop, Object sep)
{
return 0d;
}

public static Object font_delete(Object ind)
{
return 0d;
}

/*
 * 
 * Changing Paths
 * 
 */
public static Object path_set_kind(Object ind, Object kind)
{
return 0d;
}

public static Object path_set_closed(Object ind, Object closed)
{
return 0d;
}

public static Object path_set_precision(Object ind, Object prec)
{
return 0d;
}

public static Object path_add()
{
return 0d;
}

public static Object path_assign(Object ind, Object path)
{
return 0d;
}

public static Object path_duplicate(Object ind)
{
return 0d;
}

public static Object path_append(Object ind, Object path)
{
return 0d;
}

public static Object path_delete(Object ind)
{
return 0d;
}

public static Object path_add_point(Object ind, Object x, Object y, Object speed)
{
return 0d;
}

public static Object path_insert_point(Object ind, Object n, Object x, Object y, Object speed)
{
return 0d;
}

public static Object path_change_point(Object ind, Object n, Object x, Object y, Object speed)
{
return 0d;
}

public static Object path_delete_point(Object ind, Object n)
{
return 0d;
}

public static Object path_clear_points(Object ind)
{
return 0d;
}

public static Object path_reverse(Object ind)
{
return 0d;
}

public static Object path_mirror(Object ind)
{
return 0d;
}

public static Object path_flip(Object ind)
{
return 0d;
}

public static Object path_rotate(Object ind, Object angle)
{
return 0d;
}

public static Object path_scale(Object ind, Object xscale, Object yscale)
{
return 0d;
}

public static Object path_shift(Object ind, Object xshift, Object yshift)
{
return 0d;
}

/*
 * 
 * Changing Scripts
 * 
 */

public static Object execute_string(Object str)
{
return 0d;
}

public static Object execute_file(Object fname)
{
return 0d;
}

public static Object script_execute(Object... arg1)
{
return 0d;
}

/*
 * 
 * Changing Time lines
 * 
 */

public static Object timeline_add()
{
return 0d;
}

public static Object timeline_delete(Object ind)
{
return 0d;
}

public static Object timeline_moment_clear(Object ind, Object step)
{
return 0d;
}

public static Object timeline_moment_add(Object ind, Object step, Object codestr)
{
return 0d;
}

/*
 * 
 * Changing Objects
 * 
 */
public static Object Object_set_sprite(Object ind, Object spr)
{
return 0d;
}

public static Object Object_set_solid(Object ind, Object solid)
{
return 0d;
}

public static Object Object_set_visible(Object ind, Object vis)
{
return 0d;
}

public static Object Object_set_depth(Object ind, Object depth)
{
return 0d;
}

public static Object Object_set_persistent(Object ind, Object pers)
{
return 0d;
}

public static Object Object_set_mask(Object ind, Object spr)
{
return 0d;
}

public static Object Object_set_parent(Object ind, Object obj)
{
return 0d;
}

public static Object object_add()
{
return 0d;
}

public static Object object_delete(Object ind)
{
return 0d;
}

public static Object object_event_clear(Object ind, Object evtype, Object evnumb)
{
return 0d;
}

public static Object object_event_add(Object ind, Object evtype, Object evnumb, Object codestr)
{
return 0d;
}

/*
 * 
 * Changing rooms
 * 
 */
public static Object room_set_width(Object ind, Object w)
{
return 0d;
}

public static Object room_set_height(Object ind, Object h)
{
return 0d;
}

public static Object room_set_caption(Object ind, Object str)
{
return 0d;
}

public static Object room_set_persistent(Object ind, Object pers)
{
return 0d;
}

public static Object room_set_code(Object ind, Object codestr)
{
return 0d;
}

public static Object room_set_background_color(Object ind, Object col, Object show)
{
return 0d;
}

public static Object room_set_background(Object ind, Object bind, Object vis, Object fore, Object back, Object x, Object y, Object htiled, Object vtiled, Object hspeed, Object vspeed, Object alpha)
{
return 0d;
}

public static Object room_set_view(Object ind, Object vind, Object vis, Object xview, Object yview, Object wview, Object hview, Object xport, Object yport, Object wport, Object hport, Object hborder, Object vborder, Object hspeed, Object vspeed, Object obj)
{
return 0d;
}

public static Object room_set_view_enabled(Object ind, Object val)
{
return 0d;
}

public static Object room_add()
{
return 0d;
}

public static Object room_duplicate(Object ind)
{
return 0d;
}

public static Object room_assign(Object ind, Object source)
{
return 0d;
}

public static Object room_instance_add(Object ind, Object x, Object y, Object obj)
{
return 0d;
}

public static Object room_instance_clear(Object ind)
{
return 0d;
}

public static Object room_tile_add(Object ind, Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object depth)
{
return 0d;
}

public static Object room_tile_add_ext(Object ind, Object back, Object left, Object top, Object width, Object height, Object x, Object y, Object depth, Object xscale, Object yscale, Object alpha)
{
return 0d;
}

public static Object room_tile_clear(Object ind)
{
return 0d;
}

/*
 * 
 * Files
 * 
 */
public static Object file_text_open_read(Object fname)
{
File f = new File();
    f.open(fname.toString(), 1);
    return f;
}

public static Object file_text_open_write(Object fname)
{
    File f = new File();
    f.open(fname.toString(), 0);
    return f;
}

public static Object file_text_open_append(Object fname)
{
File f = new File();
    f.openAppend(fname.toString());
    return f;
}

public static Object file_text_close(Object file)
{
    if (file instanceof File)
    {
        ((File)file).close();
    }
return 0d;
}

public static Object file_text_write_string(Object file, Object str)
{
    if (file instanceof File)
    {
        ((File)file).writeString(str.toString());
    }
return 0d;
}

public static Object file_text_write_real(Object file, Object val)
{
    if (file instanceof File)
    {
        ((File)file).writeDouble(((Double)val));
    }
return 0d;
}

public static Object file_text_writeln(Object file)
{
    if (file instanceof File)
    {
        ((File)file).newLine();
    }
return 0d;
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
    //String str = new String("");
    try{
    if (file instanceof File)
    {
     return ( java.lang.Double.parseDouble(""+((File)file).readString()));
    }
    }catch(Exception e){}
return 0d;
}

public static Object file_text_readln(Object file)
{
    if (file instanceof File)
    {
      ((File)file).readln();
    }
return 0d;
}

public static Object file_text_eof(Object file)
{
    if (file instanceof File)
    {
     return new Boolean( ((File)file).endOfFile());
    }
return 0d;
}

public static Object file_exists(Object fname)
{
return new Boolean(File.exists(fname.toString()));
}

public static Object file_delete(Object fname)
{
    File.delete(fname.toString());
return 0d;
}

public static Object file_rename(Object oldname, Object newname)
{
    File.rename(oldname.toString(), newname.toString());
return 0d;
}

public static Object file_copy(Object fname, Object newname)
{
    File.copy(fname.toString(), newname.toString());
return 0d;
}

public static Object directory_exists(Object dname)
{
return new Boolean(File.exists(dname.toString()));
}

public static Object directory_create(Object dname)
{
    (new java.io.File(dname.toString())).mkdirs();
return 0d;
}

public static Object file_find_first(Object mask, Object attr)
{
return 0d;
}

public static Object file_find_next()
{
return 0d;
}

public static Object file_find_close()
{
return 0d;
}

public static Object file_attributes(Object fname, Object attr)
{
return 0d;
}

public static Object filename_path(Object fname)
{
return new String(""+fname.toString().substring(0, fname.toString().lastIndexOf(java.io.File.separator)+1));
}

public static Object filename_name(Object fname)
{
return new String(""+fname.toString().substring(fname.toString().lastIndexOf(java.io.File.separator)+1,fname.toString().length()));
}

public static Object filename_dir(Object fname)
{
return new String(""+fname.toString().substring(0, fname.toString().lastIndexOf(java.io.File.separator)));
}

public static Object filename_drive(Object fname)
{
return new String(""+fname.toString().substring(0, fname.toString().indexOf(java.io.File.separator)));
}

public static Object filename_ext(Object fname)
{
return new String(""+fname.toString().substring(fname.toString().length()-4,fname.toString().length()));

}

public static Object filename_change_ext(Object fname, Object newext)
{
return new String(""+fname.toString().substring(0, fname.toString().length()-4)+newext.toString());
}

public static Object file_bin_open(Object fname, Object mode)
{
    BinaryFile bf = new BinaryFile();
    bf.open(""+fname);
return bf;
}

public static Object file_bin_rewrite(Object file)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).rewrite();
    }
return 0d;
}

public static Object file_bin_close(Object file)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).close();
    }
return 0d;
}

public static Object file_bin_position(Object file)
{
    if (file instanceof BinaryFile)
    {
    return (((BinaryFile)file).getPosition());
    }
return 0d;
}

public static Object file_bin_size(Object file)
{
    if (file instanceof BinaryFile)
    {
    return (((BinaryFile)file).getSize());
    }
return 0d;
}

public static Object file_bin_seek(Object file, Object pos)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).seek(((Double)pos).intValue());
    }
return 0d;
}

public static Object file_bin_write_byte(Object file, Object BYTE)
{
    if (file instanceof BinaryFile)
    {
    ((BinaryFile)file).writeByte(((Double)BYTE).byteValue());
    }
return 0d;
}

public static Object file_bin_read_byte(Object file)
{
    if (file instanceof BinaryFile)
    {
    return (((BinaryFile)file).readByte());
    }
return 0d;
}

public static Object parameter_count()
{
return (Game.parameter_count);
}

public static Object parameter_string(Object n)
{
    try{
return new String(Game.parameters[((Double)n).intValue()]);
    }catch(Exception e){
    	e.printStackTrace();
   return 0d;
    }
}

public static Object environment_get_Object(Object name)
{
return new String(System.getenv(""+name));
}

/*
 * 
 * Registry
 * 
 */
public static Object registry_write_string(Object name, Object str)
{
return 0d;
}

public static Object registry_write_real(Object name, Object value)
{
return 0d;
}

public static Object registry_read_string(Object name)
{
return 0d;
}

public static Object registry_read_real(Object name)
{
return 0d;
}

public static Object registry_exists(Object name)
{
return 0d;
}

public static Object registry_write_string_ext(Object key, Object name, Object str)
{
return 0d;
}

public static Object registry_write_real_ext(Object key, Object name, Object value)
{
return 0d;
}

public static Object registry_read_string_ext(Object key, Object name)
{
return 0d;
}

public static Object registry_read_real_ext(Object key, Object name)
{
return 0d;
}

public static Object registry_exists_ext(Object key, Object name)
{
return 0d;
}

public static Object registry_set_root(Object root)
{
return 0d;
}

/*
 * 
 * Ini files
 * 
 */
public static Object ini_open(Object fname)
{
return 0d;
}

public static Object ini_close()
{
return 0d;
}

public static Object ini_read_string(Object section, Object key, Object DEFAULT)
{
return 0d;
}

public static Object ini_read_real(Object section, Object key, Object DEFAULT)
{
return 0d;
}

public static Object ini_write_string(Object section, Object key, Object str)
{
return 0d;
}

public static Object ini_write_real(Object section, Object key, Object value)
{
return 0d;
}

public static Object ini_key_exists(Object section, Object key)
{
return 0d;
}

public static Object ini_section_exists(Object section)
{
return 0d;
}

public static Object ini_key_delete(Object section, Object key)
{
return 0d;
}

public static Object ini_section_delete(Object section)
{
return 0d;
}

/*
 * 
 * Executing programs
 * 
 */
public static Object execute_program(Object prog, Object arg, Object wait)
{
	try {
        java.lang.Process proc = java.lang.Runtime.getRuntime().exec(""+prog +" "+ arg);
        
        if (Variable.toBoolean(wait)) {
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
    return 0d;
}

public static Object execute_shell(Object prog, Object arg)
{
	execute_program(new String("bash -i " + prog), arg, false);
return 0d;
}

/*
 * Data Structures
 */
public static Object ds_set_precision(Object prec)
{
return 0d;
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
return 0d;
}

public static Object ds_stack_clear(Object id)
{
    if (id instanceof Stack)
    {
      ((Stack)id).clear();
    }
return 0d;
}

public static Object ds_stack_size(Object id)
{
     if (id instanceof Stack)
    {
     return (((Stack)id).size());
    }
return 0d;
}

public static Object ds_stack_empty(Object id)
{
    if (id instanceof Stack)
    {
     return new Boolean(((Stack)id).empty());
    }
return 0d;
}

public static Object ds_stack_push(Object id, Object value)
{
    if (id instanceof Stack)
    {
     ((Stack)id).push(value);
    }
return 0d;
}

public static Object ds_stack_pop(Object id)
{
    if (id instanceof Stack)
    {
     return ((Stack)id).pop();
    }
return 0d;
}

public static Object ds_stack_top(Object id)
{
     if (id instanceof Stack)
    {
     return ((Stack)id).top();
    }
return 0d;
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
return 0d;
}

public static Object ds_queue_clear(Object id)
{
    if (id instanceof Queue)
    {
     ((Queue)id).clear();
    }
return 0d;
}

public static Object ds_queue_size(Object id)
{
    if (id instanceof Queue)
    {
    return (((Queue)id).size());
    }
return 0d;
}

public static Object ds_queue_empty(Object id)
{
    if (id instanceof Queue)
    {
    return new Boolean(((Queue)id).empty());
    }
return 0d;
}

public static Object ds_queue_enqueue(Object id, Object value)
{
    if (id instanceof Queue)
    {
    ((Queue)id).enqueue(value);
    }
return 0d;
}

public static Object ds_queue_dequeue(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).dequeue();
    }
return 0d;
}

public static Object ds_queue_head(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).head();
    }
return 0d;
}

public static Object ds_queue_tail(Object id)
{
    if (id instanceof Queue)
    {
    return ((Queue)id).tail();
    }
return 0d;
}

/*
 * 
 * Lists
 * 
 */
public static Object ds_list_create()
{
return new List();
}

public static Object ds_list_destroy(Object id)
{
    if (id instanceof List)
    {
     ((List)id).destroy();
    }
return 0d;
}

public static Object ds_list_clear(Object id)
{
    if (id instanceof List)
    {
     ((List)id).clear();
    }
return 0d;
}

public static Object ds_list_size(Object id)
{
     if (id instanceof List)
    {
    return (((List)id).size());
    }
return 0d;
}

public static Object ds_list_empty(Object id)
{
    if (id instanceof List)
    {
    return new Boolean(((List)id).empty());
    }
return 0d;
}

public static Object ds_list_add(Object id, Object value)
{
    if (id instanceof List)
    {
    ((List)id).addel(value);
    }
return 0d;
}

public static Object ds_list_insert(Object id, Object pos, Object value)
{
    if (id instanceof List)
    {
    ((List)id).insert(pos,value);
    }
return 0d;
}

public static Object ds_list_replace(Object id, Object pos, Object value)
{
    if (id instanceof List)
    {
    ((List)id).replace(pos,value);
    }
return 0d;
}

public static Object ds_list_delete(Object id, Object pos)
{
    if (id instanceof List)
    {
    ((List)id).delete(pos);
    }
return 0d;
}

public static Object ds_list_find_index(Object id, Object value)
{
return 0d;
}

public static Object ds_list_find_value(Object id, Object pos)
{
    if (id instanceof List)
    {
    return ((List)id).find_value(pos);
    }
return 0d;
}

public static Object ds_list_sort(Object id, Object ascending)
{
return 0d;
}

public static Object ds_list_shuffle(Object id){
	return 0d;
}

/*
 * 
 * Maps
 * 
 */
public static Object ds_map_create()
{
return new Map();
}

public static Object ds_map_destroy(Object id)
{
     if (id instanceof Map)
    {
     ((Map)id).destroy();
    }
return 0d;
}

public static Object ds_map_clear(Object id)
{
    if (id instanceof Map)
    {
     ((Map)id).clear();
    }
return 0d;
}

public static Object ds_map_size(Object id)
{
    if (id instanceof Map)
    {
    return (((Map)id).size());
    }
return 0d;
}

public static Object ds_map_empty(Object id)
{
    if (id instanceof Map)
    {
    return new Boolean(((Map)id).empty());
    }
return 0d;
}

public static Object ds_map_add(Object id, Object key, Object value)
{
    if (id instanceof Map)
    {
    ((Map)id).add(key,value);
    }
return 0d;
}

public static Object ds_map_replace(Object id, Object key, Object value)
{
    if (id instanceof Map)
    {
    ((Map)id).add(key,value);
    }
return 0d;
}

public static Object ds_map_delete(Object id, Object key)
{
    if (id instanceof Map)
    {
    ((Map)id).delete(key);
    }
return 0d;
}

public static Object ds_map_exists(Object id, Object key)
{
    if (id instanceof Map)
    {
    return new Boolean(((Map)id).exists(key));
    }
return 0d;
}

public static Object ds_map_find_value(Object id, Object key)
{
    if (id instanceof Map)
    {
    return (((Map)id).find(key));
    }
return 0d;
}

public static Object ds_map_find_previous(Object id, Object key)
{
    if (id instanceof Map)
        return ((Map)id).findPrevious(key);
    return 0d;
}

public static Object ds_map_find_next(Object id, Object key)
{
    if (id instanceof Map)
        return ((Map)id).findNext(key);
    return 0d;
}

public static Object ds_map_find_first(Object id)
{
    if (id instanceof Map)
        return ((Map)id).findFirst();
    return 0d;
}

public static Object ds_map_find_last(Object id)
{
    if (id instanceof Map)
        return ((Map)id).findLast();
    return 0d;
}

/*
 * 
 * Priority queues
 * 
 */
public static Object ds_priority_create()
{
    return new PriorityQueue();
}

public static Object ds_priority_destroy(Object id)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).destroy();
    }
    return 0d;
}

public static Object ds_priority_clear(Object id)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).clear();
    }
    return 0d;
}

public static Object ds_priority_size(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return (((PriorityQueue)id).size());
    }
    return 0d;
}

public static Object ds_priority_empty(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return new Boolean(((PriorityQueue)id).isEmpty());
    }
    return 0d;
}

public static Object ds_priority_add(Object id, Object value, Object priority)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).add(value, priority);
    }
    return 0d;
}

public static Object ds_priority_change_priority(Object id, Object value, Object priority)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).changePriority(value, priority);
    }
    return 0d;
}

public static Object ds_priority_find_priority(Object id, Object value)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findPriority(value);
    }
    return 0d;
}

public static Object ds_priority_delete_value(Object id, Object value)
{
    if (id instanceof PriorityQueue)
    {
        ((PriorityQueue)id).deleteValue(value);
    }
    return 0d;
}

public static Object ds_priority_delete_min(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).deleteMin();
    }
    return 0d;
}

public static Object ds_priority_find_min(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findMin();
    }
    return 0d;
}

public static Object ds_priority_delete_max(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).deleteMax();
    }
    return 0d;
}

public static Object ds_priority_find_max(Object id)
{
    if (id instanceof PriorityQueue)
    {
        return ((PriorityQueue)id).findMax();
    }
    return 0d;
}

/*
 * 
 * Grids
 * 
 */
public static Object ds_grid_create(Object w, Object h)
{
return 0d;
}

public static Object ds_grid_destroy(Object id)
{
return 0d;
}

public static Object ds_grid_resize(Object id, Object w, Object h)
{
return 0d;
}

public static Object ds_grid_width(Object id)
{
return 0d;
}

public static Object ds_grid_height(Object id)
{
return 0d;
}

public static Object ds_grid_clear(Object id, Object val)
{
return 0d;
}

public static Object ds_grid_set(Object id, Object x, Object y, Object val)
{
return 0d;
}

public static Object ds_grid_add(Object id, Object x, Object y, Object val)
{
return 0d;
}

public static Object ds_grid_multiply(Object id, Object x, Object y, Object val)
{
return 0d;
}

public static Object ds_grid_set_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_add_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_multiply_region(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_set_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

public static Object ds_grid_add_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

public static Object ds_grid_multiply_disk(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

public static Object ds_grid_get(Object id, Object x, Object y)
{
return 0d;
}

public static Object ds_grid_get_sum(Object id, Object x1, Object y1, Object x2, Object y2)
{
return 0d;
}

public static Object ds_grid_get_max(Object id, Object x1, Object y1, Object x2, Object y2)
{
return 0d;
}

public static Object ds_grid_get_min(Object id, Object x1, Object y1, Object x2, Object y2)
{
return 0d;
}

public static Object ds_grid_get_mean(Object id, Object x1, Object y1, Object x2, Object y2)
{
return 0d;
}

public static Object ds_grid_get_disk_sum(Object id, Object xm, Object ym, Object r)
{
return 0d;
}

public static Object ds_grid_get_disk_min(Object id, Object xm, Object ym, Object r)
{
return 0d;
}

public static Object ds_grid_get_disk_max(Object id, Object xm, Object ym, Object r)
{
return 0d;
}

public static Object ds_grid_get_disk_mean(Object id, Object xm, Object ym, Object r)
{
return 0d;
}

public static Object ds_grid_value_exists(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_value_x(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_value_y(Object id, Object x1, Object y1, Object x2, Object y2, Object val)
{
return 0d;
}

public static Object ds_grid_value_disk_exists(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

public static Object ds_grid_value_disk_x(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

public static Object ds_grid_value_disk_y(Object id, Object xm, Object ym, Object r, Object val)
{
return 0d;
}

/*
 * 
 * Simple Effects
 * 
 */
public static Object effect_create_below(Object kind, Object x, Object y, Object size, Object color)
{
return 0d;
}

public static Object effect_create_above(Object kind, Object x, Object y, Object size, Object color)
{
return 0d;
}

public static Object effect_clear()
{
return 0d;
}

/*
 * 
 * Particle types
 * 
 */
public static Object part_type_create()
{
return 0d;
}

public static Object part_type_destroy(Object ind)
{
return 0d;
}

public static Object part_type_exists(Object ind)
{
return 0d;
}

public static Object part_type_clear(Object ind)
{
return 0d;
}

public static Object part_type_shape(Object ind, Object shape)
{
return 0d;
}

public static Object part_type_sprite(Object ind, Object sprite, Object animat, Object stretch, Object random)
{
return 0d;
}

public static Object part_type_size(Object ind, Object size_min, Object size_max, Object size_incr, Object size_wiggle)
{
return 0d;
}

public static Object part_type_scale(Object ind, Object xscale, Object yscale)
{
return 0d;
}

public static Object part_type_orientation(Object ind, Object ang_min, Object ang_max, Object ang_incr, Object ang_wiggle, Object ang_relative)
{
return 0d;
}

public static Object part_type_life(Object ind, Object life_min, Object life_max)
{
return 0d;
}

public static Object part_type_step(Object ind, Object step_number, Object step_type)
{
return 0d;
}

public static Object part_type_death(Object ind, Object death_number, Object death_type)
{
return 0d;
}

public static Object part_type_speed(Object ind, Object speed_min, Object speed_max, Object speed_incr, Object speed_wiggle)
{
return 0d;
}

public static Object part_type_direction(Object ind, Object dir_min, Object dir_max, Object dir_incr, Object dir_wiggle)
{
return 0d;
}

public static Object part_type_gravity(Object ind, Object grav_amount, Object grav_dir)
{
return 0d;
}

public static Object part_type_color1(Object ind, Object color1)
{
return 0d;
}

public static Object part_type_color2(Object ind, Object color1, Object color2)
{
return 0d;
}

public static Object part_type_color3(Object ind, Object color1, Object color2, Object color3)
{
return 0d;
}

public static Object part_type_color_mix(Object ind, Object color1, Object color2)
{
return 0d;
}

public static Object part_type_color_rgb(Object ind, Object rmin, Object rmax, Object gmin, Object gmax, Object bmin, Object bmax)
{
return 0d;
}

public static Object part_type_color_hsv(Object ind, Object hmin, Object hmax, Object smin, Object smax, Object vmin, Object vmax)
{
return 0d;
}

public static Object part_type_alpha1(Object ind, Object alpha1)
{
return 0d;
}

public static Object part_type_alpha2(Object ind, Object alpha1, Object alpha2)
{
return 0d;
}

public static Object part_type_alpha3(Object ind, Object alpha1, Object alpha2, Object alpha3)
{
return 0d;
}

public static Object part_type_blend(Object ind, Object additive)
{
return 0d;
}

/*
 * 
 * Particle systems
 * 
 */

public static Object part_system_create()
{
return 0d;
}

public static Object part_system_destroy(Object ind)
{
return 0d;
}

public static Object part_system_exists(Object ind)
{
return 0d;
}

public static Object part_system_clear(Object ind)
{
return 0d;
}

public static Object part_system_draw_order(Object ind, Object oldtonew)
{
return 0d;
}

public static Object part_system_depth(Object ind, Object depth)
{
return 0d;
}

public static Object part_system_position(Object ind, Object x, Object y)
{
return 0d;
}

public static Object part_system_automatic_update(Object ind, Object automatic)
{
return 0d;
}

public static Object part_system_automatic_draw(Object ind, Object draw)
{
return 0d;
}

public static Object part_system_update(Object ind)
{
return 0d;
}

public static Object part_system_drawit(Object ind)
{
return 0d;
}

public static Object part_particles_create(Object ind, Object x, Object y, Object parttype, Object number)
{
return 0d;
}

public static Object part_particles_create_color(Object ind, Object x, Object y, Object parttype, Object color, Object number)
{
return 0d;
}

public static Object part_particles_clear(Object ind)
{
return 0d;
}

public static Object part_particles_count(Object ind)
{
return 0d;
}



/*
 * 
 * Emitters
 * 
 */
public static Object part_emitter_create(Object ps)
{
return 0d;
}

public static Object part_emitter_destroy(Object ps, Object ind)
{
return 0d;
}

public static Object part_emitter_destroy_all(Object ps)
{
return 0d;
}

public static Object part_emitter_exists(Object ps, Object ind)
{
return 0d;
}

public static Object part_emitter_clear(Object ps, Object ind)
{
return 0d;
}

public static Object part_emitter_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape, Object distribution)
{
return 0d;
}

public static Object part_emitter_burst(Object ps, Object ind, Object parttype, Object number)
{
return 0d;
}

public static Object part_emitter_stream(Object ps, Object ind, Object parttype, Object number)
{
return 0d;
}

/*
 * 
 * Attractors
 * 
 */
public static Object part_attractor_create(Object ps)
{
return 0d;
}

public static Object part_attractor_destroy(Object ps, Object ind)
{
return 0d;
}

public static Object part_attractor_destroy_all(Object ps)
{
return 0d;
}

public static Object part_attractor_exists(Object ps, Object ind)
{
return 0d;
}

public static Object part_attractor_clear(Object ps, Object ind)
{
return 0d;
}

public static Object part_attractor_position(Object ps, Object ind, Object x, Object y)
{
return 0d;
}

public static Object part_attractor_force(Object ps, Object ind, Object force, Object dist, Object kind, Object additive)
{
return 0d;
}

/*
 * 
 * Destroyers
 * 
 */
public static Object part_destroyer_create(Object ps)
{
return 0d;
}

public static Object part_destroyer_destroy(Object ps, Object ind)
{
return 0d;
}

public static Object part_destroyer_destroy_all(Object ps)
{
return 0d;
}

public static Object part_destroyer_exists(Object ps, Object ind)
{
return 0d;
}

public static Object part_destroyer_clear(Object ps, Object ind)
{
return 0d;
}

public static Object part_destroyer_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape)
{
return 0d;
}

/*
 * 
 * Deflectors
 * 
 */
public static Object part_deflector_create(Object ps)
{
return 0d;
}

public static Object part_deflector_destroy(Object ps, Object ind)
{
return 0d;
}

public static Object part_deflector_destroy_all(Object ps)
{
return 0d;
}

public static Object part_deflector_exists(Object ps, Object ind)
{
return 0d;
}

public static Object part_deflector_clear(Object ps, Object ind)
{
return 0d;
}

public static Object part_deflector_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax)
{
return 0d;
}

public static Object part_deflector_kind(Object ps, Object ind, Object kind)
{
return 0d;
}

public static Object part_deflector_friction(Object ps, Object ind, Object amount)
{
return 0d;
}

/*
 * 
 * Changers
 * 
 */
public static Object part_changer_create(Object ps)
{
return 0d;
}

public static Object part_changer_destroy(Object ps, Object ind)
{
return 0d;
}

public static Object part_changer_destroy_all(Object ps)
{
return 0d;
}

public static Object part_changer_exists(Object ps, Object ind)
{
return 0d;
}

public static Object part_changer_clear(Object ps, Object ind)
{
return 0d;
}

public static Object part_changer_region(Object ps, Object ind, Object xmin, Object xmax, Object ymin, Object ymax, Object shape)
{
return 0d;
}

public static Object part_changer_kind(Object ps, Object ind, Object kind)
{
return 0d;
}

public static Object part_changer_types(Object ps, Object ind, Object parttype1, Object parttype2)
{
return 0d;
}

/*
 * 
 * Setting up a connection
 * 
 */
public static Object mplay_init_ipx()
{
return 0d;
}

public static Object mplay_init_tcpip(Object addrstring)
{
return 0d;
}

public static Object mplay_init_modem(Object initstr, Object phonenr)
{
return 0d;
}

public static Object mplay_init_serial(Object portno, Object baudrate, Object stopbits, Object parity, Object flow)
{
return 0d;
}

public static Object mplay_connect_status()
{
return 0d;
}

public static Object mplay_end()
{
return 0d;
}

public static Object mplay_ipaddress()
{
    try{
        java.net.InetAddress i = java.net.InetAddress.getLocalHost();
        
   return new String(i.getHostAddress()); // IP address only
        } catch(Exception e){
        System.out.println(""+e.getMessage());}
return 0d;
}

/*
 * 
 * Creating and joining sessions
 * 
 */
public static Object mplay_session_mode(Object move)
{
return 0d;
}

public static Object mplay_session_create(Object sesname, Object playnumb, Object playername)
{
return 0d;
}

public static Object mplay_session_find()
{
return 0d;
}

public static Object mplay_session_name(Object numb)
{
return 0d;
}

public static Object mplay_session_join(Object numb, Object playername)
{
return 0d;
}

public static Object mplay_session_status()
{
return 0d;
}

public static Object mplay_session_end()
{
return 0d;
}

/*
 * 
 * Players
 * 
 */
public static Object mplay_player_find()
{
return 0d;
}

public static Object mplay_player_name(Object numb)
{
return 0d;
}

public static Object mplay_player_id(Object numb)
{
return 0d;
}

/*
 * 
 * Shared data
 * 
 */
public static Object mplay_data_write(Object ind, Object value)
{
return 0d;
}

public static Object mplay_data_read(Object ind)
{
return 0d;
}

public static Object mplay_data_mode(Object guaranteed)
{
return 0d;
}

/*
 * 
 * Messages
 * 
 */
public static Object mplay_message_send(Object player, Object id, Object val)
{
return 0d;
}

public static Object mplay_message_send_guaranteed(Object player, Object id, Object val)
{
return 0d;
}

public static Object mplay_message_receive(Object player)
{
return 0d;
}

public static Object mplay_message_id()
{
return 0d;
}

public static Object mplay_message_value()
{
return 0d;
}

public static Object mplay_message_player()
{
return 0d;
}

public static Object mplay_message_name()
{
return 0d;
}

public static Object mplay_message_count(Object player)
{
return 0d;
}

public static Object mplay_message_clear(Object player)
{
return 0d;
}

/*
 * 
 * Using DLL's
 * 
 */
public static Object external_call(Object... obj)
{
return 0d;
}

public static Object external_define(Object... obj)
{
return 0d;
}

public static Object external_free(Object dllname)
{
return 0d;
}

public static Object window_handle()
{
return 0d;
}

/*
 * 
 * Going to 3D mode
 * 
 */
public static Object d3d_start()
{
return 0d;
}

public static Object d3d_end()
{
return 0d;
}

public static Object d3d_set_hidden(Object enable)
{
return 0d;
}

public static Object d3d_set_perspective(Object enable)
{
return 0d;
}

public static Object d3d_set_depth(Object depth)
{
return 0d;
}

public static Object d3d_primitive_begin(Object kind)
{
return 0d;
}

public static Object d3d_vertex(Object x, Object y, Object z)
{
return 0d;
}

public static Object d3d_vertex_color(Object x, Object y, Object z, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_primitive_end()
{
return 0d;
}

public static Object d3d_primitive_begin_texture(Object kind, Object texid)
{
return 0d;
}

public static Object d3d_vertex_texture(Object x, Object y, Object z, Object xtex, Object ytex)
{
return 0d;
}

public static Object d3d_vertex_texture_color(Object x, Object y, Object z, Object xtex, Object ytex, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_draw_block(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return 0d;
}

public static Object d3d_draw_cylinder(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return 0d;
}

public static Object d3d_draw_cone(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return 0d;
}

public static Object d3d_draw_ellipsoid(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat, Object steps)
{
return 0d;
}

public static Object d3d_draw_wall(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return 0d;
}

public static Object d3d_draw_floor(Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object texid, Object hrepeat, Object vrepeat)
{
return 0d;
}

public static Object d3d_set_projection(Object xfrom, Object yfrom, Object zfrom, Object xto, Object yto, Object zto, Object xup, Object yup, Object zup)
{
return 0d;
}

public static Object d3d_set_projection_ext(Object xfrom, Object yfrom, Object zfrom, Object xto, Object yto, Object zto, Object xup, Object yup, Object zup, Object angle, Object aspect, Object znear, Object zfar)
{
return 0d;
}

public static Object d3d_set_projection_ortho(Object x, Object y, Object w, Object h, Object angle)
{
return 0d;
}

public static Object d3d_set_projection_perspective(Object x, Object y, Object w, Object h, Object angle)
{
return 0d;
}

public static Object d3d_transform_set_identity()
{
return 0d;
}

public static Object d3d_transform_set_translation(Object xt, Object yt, Object zt)
{
return 0d;
}

public static Object d3d_transform_set_scaling(Object xs, Object ys, Object zs)
{
return 0d;
}

public static Object d3d_transform_set_rotation_x(Object angle)
{
return 0d;
}

public static Object d3d_transform_set_rotation_y(Object angle)
{
return 0d;
}

public static Object d3d_transform_set_rotation_z(Object angle)
{
return 0d;
}

public static Object d3d_transform_set_rotation_axis(Object xa, Object ya, Object za, Object angle)
{
return 0d;
}

public static Object d3d_transform_add_translation(Object xt, Object yt, Object zt)
{
return 0d;
}

public static Object d3d_transform_add_scaling(Object xs, Object ys, Object zs)
{
return 0d;
}

public static Object d3d_transform_add_rotation_x(Object angle)
{
return 0d;
}

public static Object d3d_transform_add_rotation_y(Object angle)
{
return 0d;
}

public static Object d3d_transform_add_rotation_z(Object angle)
{
return 0d;
}

public static Object d3d_transform_add_rotation_axis(Object xa, Object ya, Object za, Object angle)
{
return 0d;
}

public static Object d3d_transform_stack_clear()
{
return 0d;
}

public static Object d3d_transform_stack_empty()
{
return 0d;
}

public static Object d3d_transform_stack_push()
{
return 0d;
}

public static Object d3d_transform_stack_pop()
{
return 0d;
}

public static Object d3d_transform_stack_top()
{
return 0d;
}

public static Object d3d_transform_stack_discard()
{
return 0d;
}

public static Object d3d_set_fog(Object enable, Object color, Object start, Object end)
{
return 0d;
}

public static Object d3d_set_lighting(Object enable)
{
return 0d;
}

public static Object d3d_set_shading(Object smooth)
{
return 0d;
}

public static Object d3d_set_culling(Object cull)
{
return 0d;
}

public static Object d3d_light_define_direction(Object ind, Object dx, Object dy, Object dz, Object col)
{
return 0d;
}

public static Object d3d_light_define_point(Object ind, Object x, Object y, Object z, Object range, Object col)
{
return 0d;
}

public static Object d3d_light_enable(Object ind, Object enable)
{
return 0d;
}

public static Object d3d_vertex_normal(Object x, Object y, Object z, Object nx, Object ny, Object nz)
{
return 0d;
}

public static Object d3d_vertex_normal_color(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_vertex_normal_texture(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex)
{
return 0d;
}

public static Object d3d_vertex_normal_texture_color(Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_model_create()
{
return 0d;
}

public static Object d3d_model_destroy(Object ind)
{
return 0d;
}

public static Object d3d_model_clear(Object ind)
{
return 0d;
}

public static Object d3d_model_save(Object ind, Object fname)
{
return 0d;
}

public static Object d3d_model_load(Object ind, Object fname)
{
return 0d;
}

public static Object d3d_model_draw(Object ind, Object x, Object y, Object z, Object texid)
{
return 0d;
}

public static Object d3d_model_primitive_begin(Object ind, Object kind)
{
return 0d;
}

public static Object d3d_model_vertex(Object ind, Object x, Object y, Object z)
{
return 0d;
}

public static Object d3d_model_vertex_color(Object ind, Object x, Object y, Object z, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_model_vertex_texture(Object ind, Object x, Object y, Object z, Object xtex, Object ytex)
{
return 0d;
}

public static Object d3d_model_vertex_texture_color(Object ind, Object x, Object y, Object z, Object xtex, Object ytex, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_model_vertex_normal(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz)
{
return 0d;
}

public static Object d3d_model_vertex_normal_color(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_model_vertex_normal_texture(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex)
{
return 0d;
}

public static Object d3d_model_vertex_normal_texture_color(Object ind, Object x, Object y, Object z, Object nx, Object ny, Object nz, Object xtex, Object ytex, Object col, Object alpha)
{
return 0d;
}

public static Object d3d_model_primitive_end(Object ind)
{
return 0d;
}

public static Object d3d_model_block(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return 0d;
}

public static Object d3d_model_cylinder(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
    
return 0d;
}

public static Object d3d_model_cone(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object closed, Object steps)
{
return 0d;
}

public static Object d3d_model_ellipsoid(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat, Object steps)
{
return 0d;
}

public static Object d3d_model_wall(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return 0d;
}

public static Object d3d_model_floor(Object ind, Object x1, Object y1, Object z1, Object x2, Object y2, Object z2, Object hrepeat, Object vrepeat)
{
return 0d;
}




}
