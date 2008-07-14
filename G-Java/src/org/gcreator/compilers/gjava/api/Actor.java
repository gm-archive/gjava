package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.api.components.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.util.*;
import org.gcreator.compilers.gjava.Game;

/**
 * The Actor object
 * @author G-Java development team
 * @version 1.0
 */
public class Actor extends tile {

    Hashtable variables = new Hashtable(); 
    
    protected Sprite sprite;
//local variables
    protected org.gcreator.compilers.gjava.api.Object alarm,  depth,  direction,  friction,  gravity,  gravity_direction,  id,  image_alpha,  image_angle,  image_blend,  image_single, mask_index,  object_index,  path_endaction,  path_index,  path_orientation,  path_position,  path_positionprevious,  path_scale,  path_speed,  persistent,  solid,  timeline_index,  timeline_position,  timeline_speed;
    //protected double x,  y, -- We already have this in the super classes.
    protected double xprevious,  xstart,  yprevious,  ystart,  hspeed,  vspeed,  speed;
    public boolean visible=true,mouseover=false;
    protected int posinvector=-1;
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
        //posinvector=pos;
        self = this;
    }

    /**
     * Creates a new actor, don't call this, call other constructor
     */
    public Actor(Object Object_name, Sprite spr, Object Solid, Object Visible, Object Depth, Object Persistent) {
        solid = Solid;
        visible = Visible.getBoolean();
        depth = Depth;
        persistent = Persistent;
        sprite = spr;
    Create();
    }
    
    public Actor(java.lang.String Object_name, Sprite spr, boolean Solid,
            boolean Visible, double Depth, boolean Persistent) {
        solid = new Boolean(Solid);
        visible = Visible;
        depth = new Integer((int)Depth);
        persistent = new Boolean(Persistent);
        sprite = spr;
        self = this;
        Create();
    }
    
    public Actor(java.lang.String Object_name, Sprite spr, boolean Solid,
            boolean Visible, double Depth, boolean Persistent, int actorindex) {
        this(new String(Object_name), spr, new Boolean(Solid),
                new Boolean(Visible), new Double(Depth), new Boolean(Persistent));
    }

    /**
     * Override with actor create event
     */
    public void Create() {
        //return null;
    }

    /**
     * Override with actor create event
     */
    public void Destroy() {
        //return null;
    }

    /**
     * Override with actor Begin Step event
     */
    public void BeginStep() throws DestroyException {
    }

    /**
     * Override with Alarm event code
     */
    public void Alarm() {
    }

    /**
     * Override with actor Step event
     */
    public void Step() throws DestroyException {
    }

    /**
     * Override with actor End Step event
     */
    public void EndStep() throws DestroyException {
    }

    /**
     * Override with actor Key Pressed event
     * @param keycode 
     */
    public void KeyPressed(int keycode) throws DestroyException {

    }

    /**
     * Override with actor Key Released event
     * @param keycode 
     */
    public void KeyReleased(int keycode) throws DestroyException {

    }

    /**
     * Override with actor Keyboard event
     */
    public void Keyboard() {
    }

    /**
     * Override with actor mouse event
     */
    public void Mouse() {
    }

    public void mouse_Pressed(int keycode, int xx, int yy) {

    }

    /**
     * Override with actor Collision event
     */
    public void checkCollision() {

    }
    
    /**
     * This is used for collision detection
     * @return
     */
           
    public Rectangle getBounds(){
        if (sprite!=null)
        return new Rectangle((int)(sprite.BBRight+x-sprite.sprite_xoffset),(int)(sprite.BBTop+y-sprite.sprite_yoffset),(int)(sprite.BBLeft+x-sprite.sprite_xoffset),(int)(sprite.BBBottom+y-sprite.sprite_yoffset));
        else
            return new Rectangle(0,0,0,0);
    }

    public void callEvents() {
        try{
        BeginStep();
        Step();
        Move();
        EndStep();
        }catch(DestroyException d){
        //it has been destroyed
        }
        //System.out.println("move");
//        setImage_xscale(getImage_xscale().add(new Double(0.1)));
//setImage_yscale(getImage_yscale().add(new Double(0.1)));
    }

    /**
     * This will Move the object, should be called every step
     */
    public void Move() {
        //use gravity
        hspeed += Math.sin(getGravity_direction().getInt()) * getGravity().getDouble();
        vspeed -= Math.cos(getGravity_direction().getInt()) * getGravity().getDouble();
        
        //use friction
        
        if (getSpeed().getDouble() > getFriction().getDouble() && getSpeed().getDouble() >0){
        setSpeed(getSpeed().sub(getFriction()));
        }
        else if (getSpeed().getDouble() < getFriction().getDouble() && getSpeed().getDouble() <0) { 
            setSpeed(getSpeed().add(getFriction()));
        }
        else {
            setSpeed(new Integer(0));
        }
        xprevious = x;
        yprevious = y;
        x = x + hspeed;
        y = y + vspeed;
        
    }

    /**
     * Override with the Draw event of the actor but don't call this method!
     * @param g 
     */
    public void Draw_event(Graphics2D g) {
        if(sprite!=null)
        {
            g.drawImage(sprite.imshow(), null, (int)x-sprite.sprite_xoffset, (int)y-sprite.sprite_yoffset);
            
        }
        else
        {
            //System.out.println("sprite is null");
            
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Getters">  
    public Object getAlarm() {
        if (alarm == null) {
            alarm = new Integer(0);
        }
        return alarm;
    }

    public Object getBbox_bottom() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBBottom);
    }

    public Object getBbox_left() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBLeft);
    }

    public Object getBbox_right() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBRight);
    }

    public Object getBbox_top() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBTop);
    }

    public Object getDepth() {
        if (depth == null) {
            depth = new Integer(0);
        }
        return depth;
    }

    
    Double directionr = new Double(0);
    public Object getDirection() {
        double dd = Math.radtodeg(Math.arctan2(-vspeed, hspeed));
        if (dd < 0)
            dd+=360;
        directionr.setValue(dd);
        return directionr;
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
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.image_angle);
    }

    public Object getImage_blend() {
        if (image_blend == null) {
            image_blend = new Integer(0);
        }
        return image_blend;
    }

    public Object getImage_index() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.index);
    }

    public Object getImage_number() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.subimages);
    }

    public Object getImage_single() {
        if (image_single == null) {
            image_single = new Integer(0);
        }
        return image_single;
    }

    public Object getImage_speed() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.image_speed);
    }

    public Object getImage_xscale() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.image_xscale);
    }

    public Object getImage_yscale() {
         if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.image_yscale);
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

    public static Double returndouble= new Double(0);
    public Object getSpeed() {
        returndouble.setValue( Math.sqrt((hspeed*hspeed) + (vspeed*vspeed)));
     return returndouble;
    //return sqrt(new Double(hspeed*hspeed + vspeed*vspeed));
    }

    public Object getSprite_height() {
        if (sprite == null) {
            return new Integer(-1);
        }
        return new Integer(sprite.sprite_height);
    }

    public Object getSprite_index() {
        if (sprite == null) {
            return new Integer(0);
        }
        return sprite;
    }

    public Object getSprite_width() {
        if (sprite == null) {
            return new Integer(-1);
        }
        return new Integer(sprite.sprite_width);
    }

    public Object getSprite_xoffset() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.sprite_xoffset);
    }

    public Object getSprite_yoffset() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.sprite_yoffset);
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
        
        return new Boolean(visible);
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
        if (sprite == null) {
            return;
        }
        sprite.BBBottom = (int) bbox_bottom.getDouble();
    }

    public void setBbox_left(Object bbox_left) {
        if (sprite == null) {
            return;
        }
        sprite.BBLeft = (int) bbox_left.getDouble();
    }

    public void setBbox_right(Object bbox_right) {
        if (sprite == null) {
            return;
        }
        sprite.BBRight = (int) bbox_right.getDouble();
    }

    public void setBbox_top(Object bbox_top) {
        if (sprite == null) {
            return;
        }
        sprite.BBTop = (int) bbox_top.getDouble();
    }

    public void setDepth(Object depth) {
        this.depth = depth;
        Game.Current.SortDepth();
    }

    public void setDirection(Object direction) {
        double sp = getSpeed().getDouble();
        System.out.println("speed:"+sp);
        if (sp==0) sp=1;
        hspeed = sp * cos(degtorad(direction)).getDouble();
        vspeed = -sp * sin(degtorad(direction)).getDouble();
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
        if (sprite !=null)
        sprite.angle((int)image_angle.getDouble());
    }

    public void setImage_blend(Object image_blend) {
        this.image_blend = image_blend;
    }

    public void setImage_index(Object image_index) {
        if (sprite !=null)
        sprite.index = (int)image_index.getDouble();
    }

    public void setImage_number(Object image_number) {
        //constant
    }

    public void setImage_single(Object image_single) {
        this.image_single = image_single;
    }

    public void setImage_speed(Object image_speed) {
        sprite.image_speed = image_speed.getDouble();
    }

    public void setImage_xscale(Object image_xscale) {
        sprite.xscale(image_xscale.getDouble());
    }

    public void setImage_yscale(Object image_yscale) {
        sprite.yscale(image_yscale.getDouble());
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
    
        hspeed = speed.getDouble() * Math.cos(Math.degtorad(getDirection().getDouble()));
        vspeed = -speed.getDouble() * Math.sin(Math.degtorad(getDirection().getDouble()));
        }

    public void setSprite_height(Object sprite_height) {
        //constant
    }

    public void setSprite_index(Object sprite_index) {
        if (sprite_index != null)
        if (sprite_index instanceof Sprite)
            sprite = (Sprite)sprite_index;
    }

    public void setSprite_width(Object sprite_width) {
        //constant
    }

    public void setSprite_xoffset(Object sprite_xoffset) {
        sprite.sprite_xoffset = (int)sprite_xoffset.getDouble();
    }

    public void setSprite_yoffset(Object sprite_yoffset) {
        sprite.sprite_yoffset = (int)sprite_yoffset.getDouble();
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
        this.visible = visible.getBoolean();
    }

    public void setVspeed(Object vspeed) {
        this.vspeed = vspeed.getDouble();
    }

    public void setX(Object x) {
        this.x = x.getDouble();
    }
    
    public void setX(double x){
        setX(new Double(x));
    }

    public void setXprevious(Object xprevious) {
        this.xprevious = xprevious.getDouble();
    }

    public void setXstart(Object xstart) {
        this.xstart = xstart.getDouble();
    }

    public void setYprevious(Object yprevious) {
        this.yprevious = yprevious.getDouble();
    }

    public void setMask_index(Object mask_index) {
        this.mask_index = mask_index;
    }

    public void setY(Object y) {
        this.y = y.getDouble();
    }
    
    public void setY(double y){
        setY(new Double(y));
    }

    public void setYstart(Object ystart) {
        this.ystart = ystart.getFloat();
    }
    // </editor-fold>   

public void setVariable(String name, Object value)
    {
        try {
            java.lang.String nm= ""+name;
            Method m = Variables.class.getDeclaredMethod("set"+name.charAt(nm, 0).toUpperCase()+nm.substring(1) + "", new Class[]{Object.class});
            try {
                
                    m.invoke(Variables.class.newInstance(), value);
               
                System.out.println("method invoked!");
            } catch (Exception ex) {
                System.out.println("no method"+ex);
            variables.put(name.toString(), value);
            } 
        } catch (NoSuchMethodException ex) {
            System.out.println("no method"+ex);
            variables.put(name.toString(), value);
        } catch (SecurityException ex) {
            System.out.println("security:"+ex);
            variables.put(name.toString(), value);
        }
        
        
    }
    
    /*
     * This function is required, it sets the value of variable with string name.
     */
    public void setVariable(java.lang.String name, Object value)
    {
        variables.put(name, value);
    }
    
    public Object getVariable(String name)
    {
        try {
            java.lang.String nm= ""+name;
            Method m = Variables.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
            try {                
                  return  (Object) m.invoke(Variables.class.newInstance(), null);
               
               // System.out.println("method invoked!");
            } catch (Exception ex) {
                System.out.println("no method"+ex);
            variables.get(name.toString());
            } 
        } catch (NoSuchMethodException ex) {
            System.out.println("no method"+ex);
            variables.get(name.toString());
        } catch (SecurityException ex) {
            System.out.println("security:"+ex);
            variables.get(name.toString());
        }
        
        Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
    
    /*
     * Gets the value of the variable with string name.
     * 
     */
     public Object getVariable(java.lang.String name)
    {
         Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
}
