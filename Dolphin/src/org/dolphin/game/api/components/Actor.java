package org.dolphin.game.api.components;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.*;

import org.dolphin.game.Game;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.types.String;
import org.dolphin.game.api.types.Double;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.Variable;
import org.dolphin.game.api.types.Boolean;
import org.dolphin.game.api.Variables;
import org.dolphin.game.api.Math;


/**
 * The Actor object
 * @author G-Java development team
 * @version 1.0
 */
public class Actor extends Tile {

   public Hashtable variables = new Hashtable();
    public Sprite sprite;

    public org.dolphin.game.api.types.Variable  depth,  direction,  friction,  gravity,  gravity_direction,  image_alpha,  image_angle,  image_blend,  image_single,  mask_index,  object_index,  path_endaction,  path_index,  path_orientation,  path_position,  path_positionprevious,  path_scale,  path_speed,  persistent,   timeline_index,  timeline_position,  timeline_speed;
    public int[] alarm = new int[11];
   public double xprevious,  xstart,  yprevious,  ystart;
	public double hspeed;
	public double vspeed;
	protected double speed;
    public boolean mouseover = false,active=true,solid=true;
    protected int posinvector = -1;
    //public double id=1;
    public java.lang.String name;
    public int sprite_index=0,image_xscale=1,image_yscale=1;
    public double sprite_speed=0;

    final Integer _0 = new Integer(0);
    
    public Actor() {
        
    }
    
    /*
     * Create a new actor using primitives
     */
    public Actor(double x,double y,double instance_id){
    	xstart=x;
    	ystart=y;
    	this.instance_id=instance_id;
        System.out.println("set id");
    	this.x=x;
    	this.y=y;
    	self=this;
    }

    /**
     * Create a new Actor using variable objects
     */
    public Actor(Variable X, Variable Y, Variable instance_id) {
        this.xstart = ((Variable) X).getFloat();
        this.ystart = Y.getFloat();
        this.id = instance_id.getDouble();
        this.x = X.getFloat();
        this.y = Y.getFloat();
        //posinvector=pos;
        self = this;
    }

    static Variable DSolid,DVisible,DSprite,DDepth,Dpersistent;
    /**
     * Creates a new actor using variables
     */
    public Actor(Variable Object_name, Sprite spr, Variable Solid, Variable Visible, Variable Depth, Variable Persistent) {
        solid = Solid.getBoolean();
        visible = Visible.getBoolean();
        depth = Depth;
        persistent = Persistent;
        sprite = spr;
        self=this;
        name=Object_name.toString();
        Create();
    }

    /*Creates a new actor using primitives*/
    public Actor(java.lang.String Object_name, Sprite spr, boolean Solid,
            boolean Visible, double Depth, boolean Persistent) {
        solid = Solid;
        visible = Visible;
        depth = new Integer((int) Depth);
        persistent = new Boolean(Persistent);
        sprite = spr;
        //self = this;
        name=Object_name;
        Create();
    }

   /* public Actor(java.lang.String Object_name, Sprite spr, boolean Solid,
            boolean Visible, double Depth, boolean Persistent, int actorindex) {
        this(new String(Object_name), spr, new Boolean(Solid),
                new Boolean(Visible), new Double(Depth), new Boolean(Persistent));
        System.out.println("constructor3");
    }*/

    /**
     * Override with actor create event
     */
    public void Create() {
        
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

    
    public void Alarm() {
        for (int i = 0; i < alarm.length; i++) {
            int variable = alarm[i];
            if (alarm[i]>0){
            alarm[i]--;
            if (alarm[i]==0){
            performAlarm(i);
            }
            } else {
            //alarm not active
            }
        }
    }

    /**
     * Override with Alarm event code
     */
    public void performAlarm(int alarmid){}

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

    public void Collision(java.lang.String name)
    {

    }

    /**
     * check collision and call the collision event
     */
    public void checkCollision() {
       // double start = System.currentTimeMillis();
        Rectangle thisbounds = getBounds();
        
        for (int i = 0; i < Game.currentRoom.instances.size(); i++)
        {
        Actor G_Java_a = ((Actor)Game.currentRoom.instances.elementAt(i));
        if (G_Java_a == this) return;
        if (G_Java_a.getBounds().intersects(thisbounds)){
            if (G_Java_a.getSolid().getBoolean()){x=xprevious;y=yprevious;}
                //System.out.println("Collided");
            Collision(G_Java_a.name);
        }
        }
        //double end = System.currentTimeMillis();
        //System.out.println("Time taken:"+(end-start));
    }

    /**
     * This is used for collision detection
     * @return
     */
    public Rectangle getBounds() {
        if (sprite != null) {
            if (image_xscale!=1 || image_yscale!=1)
            return new Rectangle((int) ((sprite.BBLeft*image_xscale) + x - sprite.sprite_xoffset), (int) ((sprite.BBTop*image_yscale) + y - sprite.sprite_yoffset),+((sprite.BBRight*image_xscale) - sprite.BBLeft*image_xscale), +((sprite.BBBottom*image_yscale) - (sprite.BBTop*image_yscale)));
            else
             return new Rectangle((int) ((sprite.BBLeft) + x - sprite.sprite_xoffset), (int) ((sprite.BBTop) + y - sprite.sprite_yoffset),+((sprite.BBRight) - sprite.BBLeft), +((sprite.BBBottom) - (sprite.BBTop)));

        } else {
            return new Rectangle(0, 0, 0, 0);
        }
    }

    public void callEvents() {
        try {
            BeginStep();
            Step();
            Alarm();
            Keyboard();
            checkCollision();
            Move();
            EndStep();
        } catch (DestroyException d) {
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
        xprevious = x;
        yprevious = y;

        //use gravity
        if(getGravity().getDouble() !=0){
        int gd = getGravity_direction().getInt();
        gd %= 360;
        if (gd != 90 && gd != 270) {
            hspeed += Math.cos((getGravity_direction().getDouble() / 180) * Math.PI) * getGravity().getDouble();
        }
        if (gd != 0 && gd != 180) {
            vspeed -= Math.sin((getGravity_direction().getDouble() / 180) * Math.PI) * getGravity().getDouble();
        }
        }
        //use friction

        if (getFriction().getDouble() != 0) {
            if (getSpeed().getDouble() > getFriction().getDouble() && getSpeed().getDouble() > 0) {
                setSpeed(getSpeed().sub(getFriction()));
            } else if (getSpeed().getDouble() < getFriction().getDouble() && getSpeed().getDouble() < 0) {
                setSpeed(getSpeed().add(getFriction()));
            } else {
                setSpeed(new Integer(0));
            }
        }
        
        x = x + hspeed;
        y = y + vspeed;
       
    }


    

    /**
     * Override with the Draw event of the actor but don't call this method!
     * @param g 
     */
    @Override
    public void Draw_event(Graphics g) {
        
        if (sprite != null) {
            sprite_index += sprite_speed;

        while (sprite_index >= sprite.subimages) sprite_index -= sprite.subimages;
            g.drawImage(sprite.imshow(sprite_index), (int) x - sprite.sprite_xoffset, (int) y - sprite.sprite_yoffset,sprite.sprite_width*image_xscale,sprite.sprite_height*image_yscale,null);

        } else {
            //System.out.println("sprite is null");
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Getters">  
    
    public Variable getBbox_bottom() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBBottom);
    }

    public Variable getBbox_left() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBLeft);
    }

    public Variable getBbox_right() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBRight);
    }

    public Variable getBbox_top() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.BBTop);
    }

    public Variable getDepth() {
        if (depth == null) {
            depth = _0;
        }
        return depth;
    }
    Double directionr = new Double(0);

    public Variable getDirection() {
        double dd = Math.radtodeg(Math.arctan2(-vspeed, hspeed));
        if (dd < 0) {
            dd += 360;
        }
        directionr.setValue(dd);
        return directionr;
    }

    public Variable getFriction() {
        if (friction == null) {
            friction = _0;
        }
        return friction;
    }

    public Variable getGravity() {
        if (gravity == null) {
            gravity = _0;
        }
        return gravity;
    }
    
    public Variable getGravity_direction() {
        if (gravity_direction == null) {
            gravity_direction = _0;
        }
        return gravity_direction;
    }

    public Variable getHspeed() {

        return new Double(hspeed);
    }

    public Variable getId() {
//        if (id == null) {
//            id = _0;
//        }
        return new Double(id);
    }

    public Variable getImage_alpha() {
        if (image_alpha == null) {
            image_alpha = _0;
        }
        return image_alpha;
    }

    public Variable getImage_angle() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite.image_angle);
    }

    public Variable getImage_blend() {
        if (image_blend == null) {
            image_blend = _0;
        }
        return image_blend;
    }

    public Variable getImage_index() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite_index);
    }

    public Variable getImage_number() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.subimages);
    }

    public Variable getImage_single() {
        if (image_single == null) {
            image_single = _0;
        }
        return image_single;
    }

    public Variable getImage_speed() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Double(sprite_speed);
    }

    public Variable getImage_xscale() {
        if (sprite == null) {
            return new Integer(1);
        }
        return new Double(image_xscale);
    }

    public Variable getImage_yscale() {
        if (sprite == null) {
            return new Integer(1);
        }
        return new Double(image_yscale);
    }

    public Variable getMask_index() {
        if (mask_index == null) {
            mask_index = _0;
        }
        return mask_index;
    }

    public Variable getObject_index() {
        if (object_index == null) {
            object_index = _0;
        }
        return object_index;
    }

    public Variable getPath_endaction() {
        if (path_endaction == null) {
            path_endaction = _0;
        }
        return path_endaction;
    }

    public Variable getPath_index() {
        if (path_index == null) {
            path_index = _0;
        }
        return path_index;
    }

    public Variable getPath_orientation() {
        if (path_orientation == null) {
            path_orientation = _0;
        }
        return path_orientation;
    }

    public Variable getPath_position() {
        if (path_position == null) {
            path_position = _0;
        }
        return path_position;
    }

    public Variable getPath_positionprevious() {
        if (path_positionprevious == null) {
            path_positionprevious = _0;
        }
        return path_positionprevious;
    }

    public Variable getPath_scale() {
        if (path_scale == null) {
            path_scale = _0;
        }
        return path_scale;
    }

    public Variable getPath_speed() {
        if (path_speed == null) {
            path_speed = _0;
        }
        return path_speed;
    }

    public Variable getPersistent() {
        if (persistent == null) {
            persistent = _0;
        }
        return persistent;
    }

    public Variable getSolid() {
        if (solid)
        return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
    public static Double returndouble = new Double(0);

    public Variable getSpeed() {
        returndouble.setValue(Math.sqrt((hspeed * hspeed) + (vspeed * vspeed)));
        return returndouble;
    //return sqrt(new Double(hspeed*hspeed + vspeed*vspeed));
    }

    public Variable getSprite_height() {
        if (sprite == null) {
            return new Integer(-1);
        }
        return new Integer(sprite.sprite_height*image_yscale);
    }

    public Variable getSprite_index() {
        if (sprite == null) {
            return new Integer(0);
        }
        return sprite;
    }

    public Variable getSprite_width() {
        if (sprite == null) {
            return new Integer(-1);
        }
        return new Integer(sprite.sprite_width*image_xscale);
    }

    public Variable getSprite_xoffset() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.sprite_xoffset);
    }

    public Variable getSprite_yoffset() {
        if (sprite == null) {
            return new Integer(0);
        }
        return new Integer(sprite.sprite_yoffset);
    }

    public Variable getTimeline_index() {
        if (timeline_index == null) {
            timeline_index = _0;
        }
        return timeline_index;
    }

    public Variable getTimeline_position() {
        if (timeline_position == null) {
            timeline_position = _0;
        }
        return timeline_position;
    }

    public Variable getTimeline_speed() {
        if (timeline_speed == null) {
            timeline_speed = _0;
        }
        return timeline_speed;
    }

    public Variable getVisible() {

        return new Boolean(visible);
    }

    public Variable getVspeed() {

        return new Double(vspeed);
    }

    public Variable getX() {

        return new Double(x);
    }

    public Variable getXprevious() {
        return new Double(xprevious);
    }

    public Variable getXstart() {
        return new Double(xstart);
    }

    public Variable getY() {
        return new Double(y);
    }

    public Variable getYprevious() {
        return new Double(yprevious);
    }

    public Variable getYstart() {
        return new Double(ystart);
    }
    // </editor-fold>   
// <editor-fold defaultstate="collapsed" desc="Setters"> 
   
    public void setBbox_bottom(Variable bbox_bottom) {
        if (sprite == null) {
            return;
        }
        sprite.BBBottom = (int) bbox_bottom.getDouble();
    }

    public void setBbox_left(Variable bbox_left) {
        if (sprite == null) {
            return;
        }
        sprite.BBLeft = (int) bbox_left.getDouble();
    }

    public void setBbox_right(Variable bbox_right) {
        if (sprite == null) {
            return;
        }
        sprite.BBRight = (int) bbox_right.getDouble();
    }

    public void setBbox_top(Variable bbox_top) {
        if (sprite == null) {
            return;
        }
        sprite.BBTop = (int) bbox_top.getDouble();
    }

    public void setDepth(Variable depth) {
        this.depth = depth;
        Game.currentRoom.SortDepth();
    }

    public void setDirection(Variable direction) {
        double sp = getSpeed().getDouble();
        System.out.println("speed:" + sp);
        if (sp == 0) {
            sp = 1;
        }
        hspeed = sp * cos(degtorad(direction)).getDouble();
        vspeed = -sp * sin(degtorad(direction)).getDouble();
    }

    public void setFriction(Variable friction) {
        this.friction = friction;
    }

    public void setGravity(Variable gravity) {
        this.gravity = gravity;
    }

    public void setGravity_direction(Variable gravity_direction) {
        this.gravity_direction = gravity_direction;
    }

    public void setHspeed(Variable hspeed) {
        this.hspeed = hspeed.getDouble();
    }

    public void setId(Variable id) {
       // id is contstant
    }

    public void setImage_alpha(Variable image_alpha) {
        this.image_alpha = image_alpha;
    }

    public void setImage_angle(Variable image_angle) {
        if (sprite != null) {
            sprite.angle((int) image_angle.getDouble());
        }
    }

    public void setImage_blend(Variable image_blend) {
        this.image_blend = image_blend;
    }

    public void setImage_index(Variable image_index) {
        if (sprite != null) {
            sprite_index = (int) image_index.getDouble();
        }
    }

    public void setImage_number(Variable image_number) {
        //constant
    }

    public void setImage_single(Variable image_single) {
        this.image_single = image_single;
    }

    public void setImage_speed(Variable image_speed) {
        sprite_speed = image_speed.getDouble();
    }

    public void setImage_xscale(Variable image_xscale) {
        this.image_xscale= image_xscale.getInt();
        
    }

    public void setImage_yscale(Variable image_yscale) {
        this.image_yscale= image_yscale.getInt();
        
    }

    public void setObject_index(Variable object_index) {
        this.object_index = object_index;
    }

    public void setPath_endaction(Variable path_endaction) {
        this.path_endaction = path_endaction;
    }

    public void setPath_index(Variable path_index) {
        this.path_index = path_index;
    }

    public void setPath_orientation(Variable path_orientation) {
        this.path_orientation = path_orientation;
    }

    public void setPath_position(Variable path_position) {
        this.path_position = path_position;
    }

    public void setPath_positionprevious(Variable path_positionprevious) {
        this.path_positionprevious = path_positionprevious;
    }

    public void setPath_scale(Variable path_scale) {
        this.path_scale = path_scale;
    }

    public void setPath_speed(Variable path_speed) {
        this.path_speed = path_speed;
    }

    public void setPersistent(Variable persistent) {
        this.persistent = persistent;
    }

    public void setSolid(Variable solid) {
        this.solid = solid.getBoolean();
    }

    public void setSpeed(Variable speed) {

        hspeed = speed.getDouble() * Math.cos(Math.degtorad(getDirection().getDouble()));
        vspeed = -speed.getDouble() * Math.sin(Math.degtorad(getDirection().getDouble()));
    }

    public void setSprite_height(Variable sprite_height) {
        //constant
    }

    public void setSprite_index(Variable sprite_index) {
        if (sprite_index != null) {
            if (sprite_index instanceof Sprite) {
                sprite = (Sprite) sprite_index;
            }
        }
    }

    public void setSprite_width(Variable sprite_width) {
        //constant
    }

    public void setSprite_xoffset(Variable sprite_xoffset) {
        sprite.sprite_xoffset = (int) sprite_xoffset.getDouble();
    }

    public void setSprite_yoffset(Variable sprite_yoffset) {
        sprite.sprite_yoffset = (int) sprite_yoffset.getDouble();
    }

    public void setTimeline_index(Variable timeline_index) {
        this.timeline_index = timeline_index;
    }

    public void setTimeline_position(Variable timeline_position) {
        this.timeline_position = timeline_position;
    }

    public void setTimeline_speed(Variable timeline_speed) {
        this.timeline_speed = timeline_speed;
    }

    public void setVisible(Variable visible) {
        this.visible = visible.getBoolean();
    }

    public void setVspeed(Variable vspeed) {
        this.vspeed = vspeed.getDouble();
    }

    public void setX(Variable x) {
        this.x = x.getDouble();
    }

    public void setX(double x) {
        setX(new Double(x));
    }

    public void setXprevious(Variable xprevious) {
        this.xprevious = xprevious.getDouble();
    }

    public void setXstart(Variable xstart) {
        this.xstart = xstart.getDouble();
    }

    public void setYprevious(Variable yprevious) {
        this.yprevious = yprevious.getDouble();
    }

    public void setMask_index(Variable mask_index) {
        this.mask_index = mask_index;
    }

    public void setY(Variable y) {
        this.y = y.getDouble();
    }

    public void setY(double y) {
        setY(new Double(y));
    }

    public void setYstart(Variable ystart) {
        this.ystart = ystart.getFloat();
    }
    // </editor-fold>   
    public void setVariable(String name, Variable value) {
        try {
            java.lang.String nm = "" + name;
            Method m = Variables.class.getDeclaredMethod("set" + name.charAt(nm, 0).toUpperCase() + nm.substring(1) + "", new Class[]{Object.class});
            try {

                m.invoke(Variables.class.newInstance(), value);

                System.out.println("method invoked!");
            } catch (Exception ex) {
                System.out.println("no method" + ex);
                variables.put(name.toString(), value);
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("no method" + ex);
            variables.put(name.toString(), value);
        } catch (SecurityException ex) {
            System.out.println("security:" + ex);
            variables.put(name.toString(), value);
        }


    }

    /*
     * This function is required, it sets the value of variable with string name.
     */
    public void setVariable(java.lang.String name, Variable value) {
        variables.put(name, value);
    }

    public Variable getVariable(String name) {
        try {
            java.lang.String nm = "" + name;
            Method m = Variables.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{});
            try {
                return (Variable) m.invoke(Variables.class.newInstance(), null);

            } catch (Exception ex) {
                System.out.println("no method" + ex);
                variables.get(name.toString());
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("no method" + ex);
            variables.get(name.toString());
        } catch (SecurityException ex) {
            System.out.println("security:" + ex);
            variables.get(name.toString());
        }

        Variable o = (Variable) variables.get(name.toString());
        if (o == null) {
            return new Integer(0);
        }
        return o;
    }

    /*
     * Gets the value of the variable with string name.
     * 
     */
    public Variable getVariable(java.lang.String name) {
        Variable o = (Variable) variables.get(name.toString());
        if (o == null) {
            return new Integer(0);
        }
        return o;
    }
}
