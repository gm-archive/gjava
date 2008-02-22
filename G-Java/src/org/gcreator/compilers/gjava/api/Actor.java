package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.api.components.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * The Actor object
 * @author G-Java development team
 * @version 1.0
 */
public class Actor extends tile {

    protected Sprite sprite;
//local variables
    protected org.gcreator.compilers.gjava.api.Object alarm,  bbox_bottom,  bbox_left,  bbox_right,  bbox_top,  depth,  direction,  friction,  gravity,  gravity_direction,  id,  image_alpha,  image_angle,  image_blend,  image_index,  image_number,  image_single,  image_speed,  image_xscale,  image_yscale,  mask_index,  object_index,  path_endaction,  path_index,  path_orientation,  path_position,  path_positionprevious,  path_scale,  path_speed,  persistent,  solid,  sprite_height,  sprite_index,  sprite_width,  sprite_xoffset,  sprite_yoffset,  timeline_index,  timeline_position,  timeline_speed,  visible;
    protected double x,  y,  xprevious,  xstart,  yprevious,  ystart,  hspeed,  vspeed,  speed;

    public Actor() {
    }

    /**
     * Create a new Actor
     */
    public Actor(Object X, Object Y, Object instance_id) {
        this.xstart = X.getFloat();
        this.ystart = Y.getFloat();
        this.id = instance_id;
        this.x = X.getFloat();
        this.y = Y.getFloat();
        self = this;
    }

    /**
     * Creates a new actor, don't call this, call other constructor
     */
    public Actor(Object Object_name, Sprite spr, Object Solid, Object Visible, Object Depth, Object Persistent) {
        solid = Solid;
        visible = Visible;
        depth = Depth;
        persistent = Persistent;
        sprite = spr;
    //Create_event();
    }

    /**
     * Override with actor create event
     */
    public Object Create_event() {
        return null;
    }

    /**
     * Override with actor create event
     */
    public Object Destroy_event() {
        return null;
    }

    /**
     * Override with actor Begin Step event
     */
    public void Begin_Step_event() {
    }

    /**
     * Override with Alarm event code
     */
    public void Alarm() {
    }

    /**
     * Override with actor Step event
     */
    public void Step() {
    }

    /**
     * Override with actor End Step event
     */
    public void End_Step_event() {
    }

    /**
     * Override with actor Key Pressed event
     * @param keycode 
     */
    public void Key_Pressed(int keycode) {

    }

    /**
     * Override with actor Key Released event
     * @param keycode 
     */
    public void Key_Released(int keycode) {

    }

    /**
     * Override with actor Keyboard event
     */
    public void Keyboard_event() {
    }

    /**
     * Override with actor mouse event
     */
    public void Mouse_event() {
    }

    public void mouse_Pressed(int keycode, int xx, int yy) {

    }

    /**
     * Override with actor Collision event
     */
    public void Collision_event() {

    }

    public void callEvents() {
        Move();

    }

    /**
     * This will Move the object, should be called every step
     */
    public void Move() {
        xprevious = x;
        yprevious = y;
        x = x + hspeed;
        y = y + vspeed;
        
    }

    /**
     * Override with the Draw event of the actor but don't call this method!
     * @param g 
     */
    public void Draw_event() {
        sprite.a.draw((float) x, (float) y);
    }
    // <editor-fold defaultstate="collapsed" desc="Getters">  
    public Object getAlarm() {
        if (alarm == null) {
            alarm = new Integer(0);
        }
        return alarm;
    }

    public Object getBbox_bottom() {
        if (bbox_bottom == null) {
            bbox_bottom = new Integer(0);
        }
        return bbox_bottom;
    }

    public Object getBbox_left() {
        if (bbox_bottom == null) {
            bbox_bottom = new Integer(0);
        }
        return bbox_left;
    }

    public Object getBbox_right() {
        if (bbox_bottom == null) {
            bbox_bottom = new Integer(0);
        }
        return bbox_right;
    }

    public Object getBbox_top() {
        if (bbox_top == null) {
            bbox_top = new Integer(0);
        }
        return bbox_top;
    }

    public Object getDepth() {
        if (depth == null) {
            depth = new Integer(0);
        }
        return depth;
    }

    public Object getDirection() {
        Object d = radtodeg(arctan2(new Double(-vspeed), new Double(hspeed)));
        if (d.getDouble() < 0)
            d= new Double(360+d.getDouble());
        return d;
    }

    public Object getFriction() {
        if (friction == null) {
            friction = new Integer(0);
        }
        return friction;
    }

    public Object getGravity() {
        if (gravity == null) {
            gravity = new Integer(0);
        }
        return gravity;
    }

    public Object getGravity_direction() {
        if (gravity_direction == null) {
            gravity_direction = new Integer(0);
        }
        return gravity_direction;
    }

    public Object getHspeed() {

        return new Double(hspeed);
    }

    public Object getId() {
        if (id == null) {
            id = new Integer(0);
        }
        return id;
    }

    public Object getImage_alpha() {
        if (image_alpha == null) {
            image_alpha = new Integer(0);
        }
        return image_alpha;
    }

    public Object getImage_angle() {
        if (image_angle == null) {
            image_angle = new Integer(0);
        }
        return image_angle;
    }

    public Object getImage_blend() {
        if (image_blend == null) {
            image_blend = new Integer(0);
        }
        return image_blend;
    }

    public Object getImage_index() {
        if (image_index == null) {
            image_index = new Integer(0);
        }
        return image_index;
    }

    public Object getImage_number() {
        if (image_number == null) {
            image_number = new Integer(0);
        }
        return image_number;
    }

    public Object getImage_single() {
        if (image_single == null) {
            image_single = new Integer(0);
        }
        return image_single;
    }

    public Object getImage_speed() {
        if (image_speed == null) {
            image_speed = new Integer(0);
        }
        return image_speed;
    }

    public Object getImage_xscale() {
        if (image_xscale == null) {
            image_xscale = new Integer(0);
        }
        return image_xscale;
    }

    public Object getImage_yscale() {
        if (image_yscale == null) {
            image_yscale = new Integer(0);
        }
        return image_yscale;
    }

    public Object getMask_index() {
        if (mask_index == null) {
            mask_index = new Integer(0);
        }
        return mask_index;
    }

    public Object getObject_index() {
        if (object_index == null) {
            object_index = new Integer(0);
        }
        return object_index;
    }

    public Object getPath_endaction() {
        if (path_endaction == null) {
            path_endaction = new Integer(0);
        }
        return path_endaction;
    }

    public Object getPath_index() {
        if (path_index == null) {
            path_index = new Integer(0);
        }
        return path_index;
    }

    public Object getPath_orientation() {
        if (path_orientation == null) {
            path_orientation = new Integer(0);
        }
        return path_orientation;
    }

    public Object getPath_position() {
        if (path_position == null) {
            path_position = new Integer(0);
        }
        return path_position;
    }

    public Object getPath_positionprevious() {
        if (path_positionprevious == null) {
            path_positionprevious = new Integer(0);
        }
        return path_positionprevious;
    }

    public Object getPath_scale() {
        if (path_scale == null) {
            path_scale = new Integer(0);
        }
        return path_scale;
    }

    public Object getPath_speed() {
        if (path_speed == null) {
            path_speed = new Integer(0);
        }
        return path_speed;
    }

    public Object getPersistent() {
        if (persistent == null) {
            persistent = new Integer(0);
        }
        return persistent;
    }

    public Object getSolid() {
        if (solid == null) {
            solid = new Integer(0);
        }
        return solid;
    }

    public Object getSpeed() {
    return sqrt(new Double(hspeed*hspeed + vspeed*vspeed));
    }

    public Object getSprite_height() {
        if (sprite_height == null) {
            sprite_height = new Integer(0);
        }
        return sprite_height;
    }

    public Object getSprite_index() {
        if (sprite_index == null) {
            sprite_index = new Integer(0);
        }
        return sprite_index;
    }

    public Object getSprite_width() {
        if (sprite_width == null) {
            sprite_width = new Integer(0);
        }
        return sprite_width;
    }

    public Object getSprite_xoffset() {
        if (sprite_xoffset == null) {
            sprite_xoffset = new Integer(0);
        }
        return sprite_xoffset;
    }

    public Object getSprite_yoffset() {
        if (sprite_yoffset == null) {
            sprite_yoffset = new Integer(0);
        }
        return sprite_yoffset;
    }

    public Object getTimeline_index() {
        if (timeline_index == null) {
            timeline_index = new Integer(0);
        }
        return timeline_index;
    }

    public Object getTimeline_position() {
        if (timeline_position == null) {
            timeline_position = new Integer(0);
        }
        return timeline_position;
    }

    public Object getTimeline_speed() {
        if (timeline_speed == null) {
            timeline_speed = new Integer(0);
        }
        return timeline_speed;
    }

    public Object getVisible() {
        if (visible == null) {
            visible = new Integer(0);
        }
        return visible;
    }

    public Object getVspeed() {

        return new Double(vspeed);
    }

    public Object getX() {

        return new Double(x);
    }

    public Object getXprevious() {
        return new Double(xprevious);
    }

    public Object getXstart() {
        return new Double(xstart);
    }

    public Object getY() {
        return new Double(y);
    }

    public Object getYprevious() {
        return new Double(yprevious);
    }

    public Object getYstart() {
        return new Double(ystart);
    }
    // </editor-fold>   
// <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setAlarm(Object alarm) {
        this.alarm = alarm;
    }

    public void setBbox_bottom(Object bbox_bottom) {
        this.bbox_bottom = bbox_bottom;
    }

    public void setBbox_left(Object bbox_left) {
        this.bbox_left = bbox_left;
    }

    public void setBbox_right(Object bbox_right) {
        this.bbox_right = bbox_right;
    }

    public void setBbox_top(Object bbox_top) {
        this.bbox_top = bbox_top;
    }

    public void setDepth(Object depth) {
        this.depth = depth;
    }

    public void setDirection(Object direction) {
        System.out.println("speed:"+getSpeed().getDouble());
        hspeed = getSpeed().getDouble() * cos(degtorad(direction)).getDouble();
        vspeed = -getSpeed().getDouble() * sin(degtorad(direction)).getDouble();
    }

    public void setFriction(Object friction) {
        this.friction = friction;
    }

    public void setGravity(Object gravity) {
        this.gravity = gravity;
    }

    public void setGravity_direction(Object gravity_direction) {
        this.gravity_direction = gravity_direction;
    }

    public void setHspeed(Object hspeed) {
        this.hspeed = hspeed.getDouble();
    }

    public void setId(Object id) {
        this.id = id;
    }

    public void setImage_alpha(Object image_alpha) {
        this.image_alpha = image_alpha;
    }

    public void setImage_angle(Object image_angle) {
        this.image_angle = image_angle;
    }

    public void setImage_blend(Object image_blend) {
        this.image_blend = image_blend;
    }

    public void setImage_index(Object image_index) {
        this.image_index = image_index;
    }

    public void setImage_number(Object image_number) {
        this.image_number = image_number;
    }

    public void setImage_single(Object image_single) {
        this.image_single = image_single;
    }

    public void setImage_speed(Object image_speed) {
        this.image_speed = image_speed;
    }

    public void setImage_xscale(Object image_xscale) {
        this.image_xscale = image_xscale;
    }

    public void setImage_yscale(Object image_yscale) {
        this.image_yscale = image_yscale;
    }

    public void setObject_index(Object object_index) {
        this.object_index = object_index;
    }

    public void setPath_endaction(Object path_endaction) {
        this.path_endaction = path_endaction;
    }

    public void setPath_index(Object path_index) {
        this.path_index = path_index;
    }

    public void setPath_orientation(Object path_orientation) {
        this.path_orientation = path_orientation;
    }

    public void setPath_position(Object path_position) {
        this.path_position = path_position;
    }

    public void setPath_positionprevious(Object path_positionprevious) {
        this.path_positionprevious = path_positionprevious;
    }

    public void setPath_scale(Object path_scale) {
        this.path_scale = path_scale;
    }

    public void setPath_speed(Object path_speed) {
        this.path_speed = path_speed;
    }

    public void setPersistent(Object persistent) {
        this.persistent = persistent;
    }

    public void setSolid(Object solid) {
        this.solid = solid;
    }

    public void setSpeed(Object speed) {
        hspeed = speed.getDouble() * cos(degtorad(getDirection())).getDouble();
        vspeed = -speed.getDouble() * sin(degtorad(getDirection())).getDouble();
        //this.speed = speed.getDouble();
    }

    public void setSprite_height(Object sprite_height) {
        this.sprite_height = sprite_height;
    }

    public void setSprite_index(Object sprite_index) {
        this.sprite_index = sprite_index;
    }

    public void setSprite_width(Object sprite_width) {
        this.sprite_width = sprite_width;
    }

    public void setSprite_xoffset(Object sprite_xoffset) {
        this.sprite_xoffset = sprite_xoffset;
    }

    public void setSprite_yoffset(Object sprite_yoffset) {
        this.sprite_yoffset = sprite_yoffset;
    }

    public void setTimeline_index(Object timeline_index) {
        this.timeline_index = timeline_index;
    }

    public void setTimeline_position(Object timeline_position) {
        this.timeline_position = timeline_position;
    }

    public void setTimeline_speed(Object timeline_speed) {
        this.timeline_speed = timeline_speed;
    }

    public void setVisible(Object visible) {
        this.visible = visible;
    }

    public void setVspeed(Object vspeed) {
        this.vspeed = vspeed.getDouble();
    }

    public void setX(Object x) {
        this.x = x.getFloat();
    }

    public void setXprevious(Object xprevious) {
        this.xprevious = xprevious.getFloat();
    }

    public void setXstart(Object xstart) {
        this.xstart = xstart.getFloat();
    }

    public void setYprevious(Object yprevious) {
        this.yprevious = yprevious.getFloat();
    }

    public void setMask_index(Object mask_index) {
        this.mask_index = mask_index;
    }

    public void setY(Object y) {
        this.y = y.getFloat();
    }

    public void setYstart(Object ystart) {
        this.ystart = ystart.getFloat();
    }
    // </editor-fold>   
}
