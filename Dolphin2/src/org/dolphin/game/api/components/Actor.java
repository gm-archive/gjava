package org.dolphin.game.api.components;

import java.awt.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.*;

import org.dolphin.game.Game;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.GCL;
import org.dolphin.game.api.Math;
import org.dolphin.game.api.Variables;
import org.dolphin.game.api.exceptions.RoomChangedException;
import org.dolphin.game.api.types.Variable;


/**
 * The Actor object
 * @author G-Java development team
 * @version 1.0
 */
public class Actor extends Tile implements Serializable {
private static final long serialVersionUID = 1L;

   public Hashtable<java.lang.String, Object> variables = new Hashtable<java.lang.String, Object>();
    public Sprite sprite,mask_index;

    public Object  depth,  direction,  friction,  gravity,  gravity_direction,  image_alpha,  image_angle,  image_blend,  image_single,  object_index,  path_endaction,  path_index,  path_orientation,  path_position,  path_positionprevious,  path_scale,  path_speed,  persistent, timeline_index;
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
    public double sprite_speed=1,timeline_speed=1,timeline_position=0;
    


    
    
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
     * Create a new Actor using Object variables
     */
    public Actor(Object X, Object Y, Object instance_id) {
        this.xstart = ((Double)X).floatValue();
        this.ystart = ((Double)Y).floatValue();
        this.id = ((Double)instance_id);
        this.x = ((Double)X).floatValue();
        this.y = ((Double)Y).floatValue();
        //posinvector=pos;
        self = this;
        
    }

    static Object DSolid,DVisible,DSprite,DDepth,Dpersistent;
    /**
     * Creates a new actor using variables
     */
    public Actor(Object Object_name, Sprite spr, Object Solid, Object Visible, Object Depth, Object Persistent) {
        solid = ((Boolean)Solid);
        visible = ((Boolean)Visible);
        depth = Depth;
        persistent = Persistent;
        sprite = spr;
        self=this;
        name=Object_name.toString();
        try{
        Create();
        } catch(RoomChangedException e){
        }
    }

    /*Creates a new actor using primitives*/
    public Actor(java.lang.String Object_name, Sprite spr, boolean Solid,
            boolean Visible, double Depth, boolean Persistent) {
        solid = Solid;
        visible = Visible;
        depth = new Double((int) Depth);
        persistent = new Boolean(Persistent);
        sprite = spr;
        self = this;
        name=Object_name;
         
    }
    
    /*
     * isSameAs is used to check if one Actor is the same as another, very useful for all,allofobject
     * For All it will always be true
     * For an instance it will only be true if they are the same instance
     * For AllOfObject it will only be true if the instance is part of that object
     */
    public boolean isSameAs(Object object){
    	return equals(Variable.getActor(object));
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
    public void Create() throws RoomChangedException {
        
    }

    /**
     * Override with actor create event
     */
    public void Destroy() throws RoomChangedException {
        //return null;
    }

    /**
     * Override with actor Begin Step event
     */
    public void BeginStep() throws DestroyException,RoomChangedException {
    	
    }


    public void checkTimeline(){
        
    if (timeline_index !=null){
        System.out.println("check timeline not null");
        ((Timeline)timeline_index).checksteps(timeline_position);
        if (timeline_speed>1){
            for(int i=0;i<timeline_speed;i++){
            ((Timeline)timeline_index).checksteps(timeline_position);
            }
        }
        this.timeline_position+=timeline_speed;
    }
    }
    
    public void EndOfAnimation() throws DestroyException,RoomChangedException {
    
    }
    
    public void Alarm() throws RoomChangedException {
        for (int i = 0; i < alarm.length; i++) {
            //int Object = alarm[i];
            if (alarm[i]>0){
            alarm[i]--;
            //now check alarm if it is equal to 0
            if (alarm[i]==0){
                performAlarm(i);
                }
            } 
            	
            	else {
            //alarm not active
            }
        }
    }

    /**
     * Override with Alarm event code
     */
    public void performAlarm(int alarmid) throws RoomChangedException{
    	
    }

    /**
     * Override with actor Step event
     */
    public void Step() throws DestroyException,RoomChangedException {
    	
    }

    /**
     * Override with actor End Step event
     */
    public void EndStep() throws DestroyException,RoomChangedException {
    	
    }

    /**
     * Override with actor Key Pressed event
     * @param keycode 
     */
    public void KeyPressed(int keycode) throws DestroyException,RoomChangedException {
    }

    /**
     * Override with actor Key Released event
     * @param keycode 
     */
    public void KeyReleased(int keycode) throws DestroyException,RoomChangedException {
    }

    /**
     * Override with actor Keyboard event
     */
    public void Keyboard() throws RoomChangedException {
    	
    }

    /**
     * Override with actor mouse event
     */
    public void Mouse() throws RoomChangedException {
    }

    public void mouse_Pressed(int keycode, int xx, int yy) throws RoomChangedException {
    }

    public void Collision(java.lang.String name) throws RoomChangedException
    {
    	
    }

    public void callCollision(){
    //don't call checkcollision by default
    }

    /**
     * check collision and call the collision event
     */
    public void checkCollision()throws DestroyException,RoomChangedException {
       // double start = System.currentTimeMillis();
        Rectangle thisbounds = getBounds();
        
        for (int i = 0; i < Game.currentRoom.instances.size(); i++)
        {
        Actor G_Java_a = ((Actor)Game.currentRoom.instances.elementAt(i));
        if (G_Java_a == this) continue;
        if (G_Java_a.getBounds().intersects(thisbounds)){
            if ((Boolean)G_Java_a.getSolid()){x=xprevious;y=yprevious;}
                //System.out.println("Collided");
            other=G_Java_a;
            Collision(G_Java_a.name);

        }
        }
        other=noone;
        //double end = System.currentTimeMillis();
        //System.out.println("Time taken:"+(end-start));
    }

    /**
     * This is used for collision detection
     * @return
     */
    public Rectangle getBounds() {
    	if (mask_index !=null){
    		
    		if (image_xscale!=1 || image_yscale!=1) //masks are also effected by image scales
                return new Rectangle((int) ((mask_index.BBLeft*image_xscale) + x - mask_index.sprite_xoffset), (int) ((mask_index.BBTop*image_yscale) + y - mask_index.sprite_yoffset),+((mask_index.BBRight*image_xscale) - mask_index.BBLeft*image_xscale), +((mask_index.BBBottom*image_yscale) - (mask_index.BBTop*image_yscale)));
                else
                 return new Rectangle((int) ((mask_index.BBLeft) + x - mask_index.sprite_xoffset), (int) ((mask_index.BBTop) + y - mask_index.sprite_yoffset),+((mask_index.BBRight) - mask_index.BBLeft), +((mask_index.BBBottom) - (mask_index.BBTop)));

    	}
    	
        if (sprite != null) {
            if (image_xscale!=1 || image_yscale!=1)
            return new Rectangle((int) ((sprite.BBLeft*image_xscale) + x - sprite.sprite_xoffset), (int) ((sprite.BBTop*image_yscale) + y - sprite.sprite_yoffset),+((sprite.BBRight*image_xscale) - sprite.BBLeft*image_xscale), +((sprite.BBBottom*image_yscale) - (sprite.BBTop*image_yscale)));
            else
             return new Rectangle((int) ((sprite.BBLeft) + x - sprite.sprite_xoffset), (int) ((sprite.BBTop) + y - sprite.sprite_yoffset),+((sprite.BBRight) - sprite.BBLeft), +((sprite.BBBottom) - (sprite.BBTop)));

        } else {
            return new Rectangle(0, 0, 0, 0);
        }
    }

    public void callEvents() throws RoomChangedException {
        try {
            BeginStep();
            Step();
            Alarm();
            Keyboard();
            checkTimeline();
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

    public int pathxoffset=0,pathyoffset=0,pathstartX=100,pathstartY=100,pathcurrentpoint=0;//used for when path is relative to current position
    public double pathcurrentdistance=0;
    /**
     * This will Move the object, should be called every step
     */
    public void Move() {
    	
    	//check for path
    	if (!(getPath_index()==null)){
    		
    		int position = pathcurrentpoint;
    		int scale = ((Double)getPath_scale()).intValue();
    		double xto = (((Path)getPath_index()).getPointX(position)+pathxoffset)*scale;
    		double yto = (((Path)getPath_index()).getPointY(position)+pathyoffset)*scale;
    		double sp = (((Path)getPath_index()).getPointSpeed(position)/100)*((Double)getPath_speed());

    		//following a path
    		double dist=(Double)sqrt(((((Double)xto)-self.x)*(((Double)xto)-self.x)+(((Double)yto)-self.y)*(((Double)yto)-self.y)));
    		   x+=((((Double)xto)-self.x)/dist)*Math.abs((Double)sp);
    		   y+=((((Double)yto)-self.y)/dist)*Math.abs((Double)sp);
    		   path_positionprevious = getPath_position();
    		   pathcurrentdistance=pathcurrentdistance+sp;
    		   
    		   if(Math.abs(x-xto)<Math.abs(sp) && Math.abs(y-yto)<Math.abs(sp)){
    			   boolean endofpath=false;
    			  if (position < ((Path)getPath_index()).al.size()-1 ){
    				  if (sp<0){
    					  if (position >0){
    						  pathcurrentpoint--;
    					  
    					  }
    					  else {
    						  endofpath=true;
    					  }
    				  } else {
    					  pathcurrentpoint++;
    			   
    			  }
    			  }
    			  else {endofpath=true;}
    				  if (endofpath) {
    					  pathcurrentdistance=0d;
    					  path_positionprevious=0d;
    				  int action = ((Double)getPath_endaction()).intValue();
    				  
    				  if (action==0){
    					  //end the path
    					  setPath_index(Game.DOLPHIN_nullpath);
    					  pathcurrentpoint=0;
    					  
    				  }
    				  else if (action==1){
    					  //continue from start position
    					  
    					  x = pathstartX-1;
    			    		y = pathstartY-1;
    			    		
    			    		pathcurrentpoint=0;
    				  }
    				  else if (action==2){
    					  //continue from current position
    					  self.pathxoffset = (int)((self.x)-(((Path)self.getPath_index()).getPointX(0)));
    						self.pathyoffset = (int)((self.y)-(((Path)self.getPath_index()).getPointY(0)));
    						pathcurrentpoint=0;
    				  }
    				  else if (action==3){
    					  //reverse the path
    					  setPath_speed(-((Double)getPath_speed()));
    				  }
    				  endofpath=false;
    			  }
    		   }
    		   
    		return;
    	}
    	
        xprevious = x;
        yprevious = y;

        //use gravity
        if(((Double)getGravity()) !=0){
        int gd = ((Double)getGravity_direction()).intValue();
        gd %= 360;
        if (gd != 90 && gd != 270) {
            hspeed += Math.cos((((Double)getGravity_direction()) / 180) * Math.PI) * ((Double)getGravity());
        }
        if (gd != 0 && gd != 180) {
            vspeed -= Math.sin((((Double)getGravity_direction()) / 180) * Math.PI) * ((Double)getGravity());
        }
        }
        //use friction

        if (((Double)getFriction()) != 0) {
            if (((Double)getSpeed()) > ((Double)getFriction()) && ((Double)getSpeed()) > 0) {
                setSpeed(Variable.sub(getSpeed(),getFriction()));
            } else if (((Double)getSpeed()) < ((Double)getFriction()) && ((Double)getSpeed()) < 0) {
                setSpeed(Variable.add(getSpeed(),getFriction()));
            } else {
                setSpeed(0d);
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
    public void Draw_event(Graphics g) throws RoomChangedException {
        if (x>-10 && y>-10 && x<Game.thegame.currentRoom.width && y<Game.thegame.currentRoom.width){ //check if it is in the game area
        if (sprite != null) {
            sprite_index += sprite_speed;
        if (sprite_index >= sprite.subimages){ //gone through animation
        while (sprite_index >= sprite.subimages) sprite_index -= sprite.subimages;
        try {EndOfAnimation();}catch(Exception e){}
        }
        
            g.drawImage(sprite.imshow(sprite_index), (int) x - sprite.sprite_xoffset, (int) y - sprite.sprite_yoffset,sprite.sprite_width*image_xscale,sprite.sprite_height*image_yscale,null);

        } else {
            //System.out.println("sprite is null");
        }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Getters">  
    
    public Object getBbox_bottom() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.BBBottom);
    }

    public Object getBbox_left() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.BBLeft);
    }

    public Object getBbox_right() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.BBRight);
    }

    public Object getBbox_top() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.BBTop);
    }

    public Object getDepth() {
        if (depth == null) {
            depth = 0d;
        }
        return depth;
    }
   

    public Object getDirection() {
        double dd = Math.radtodeg(Math.arctan2(-vspeed, hspeed));
        if (dd < 0) {
            dd += 360;
        }
        return Game.getValueOf(dd);
       
    }

    public Object getFriction() {
        if (friction == null) {
            friction = 0d;
        }
        return friction;
    }

    public Object getGravity() {
        if (gravity == null) {
            gravity = 0d;
        }
        return gravity;
    }
    
    public Object getGravity_direction() {
        if (gravity_direction == null) {
            gravity_direction = 0d;
        }
        return gravity_direction;
    }

    public Object getHspeed() {

        return hspeed;
    }

    public Object getId() {
//        if (id == null) {
//            id = 0d;
//        }
        return self.instance_id;
    }

    public Object getImage_alpha() {
        if (image_alpha == null) {
            image_alpha = 0d;
        }
        return image_alpha;
    }

    public Object getImage_angle() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.image_angle);
    }

    public Object getImage_blend() {
        if (image_blend == null) {
            image_blend = 0d;
        }
        return image_blend;
    }

    public Object getImage_index() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite_index);
    }

    public Object getImage_number() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.subimages);
    }

    public Object getImage_single() {
        if (image_single == null) {
            image_single = 0d;
        }
        return image_single;
    }

    public Object getImage_speed() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite_speed);
    }

    public Object getImage_xscale() {
        if (sprite == null) {
            return 1d;
        }
        return new Double(image_xscale);
    }

    public Object getImage_yscale() {
        if (sprite == null) {
            return 1d;
        }
        return new Double(image_yscale);
    }

    public Object getMask_index() {
        if (mask_index == null) {
            return -1d;
        }
        return mask_index;
    }

    public Object getObject_index() {
        if (object_index == null) {
            object_index = 0d;
        }
        return object_index;
    }

    public Object getPath_endaction() {
        if (path_endaction == null) {
            path_endaction = 0d;
        }
        return path_endaction;
    }

    public Object getPath_index() {
        if (path_index == null) {
            path_index = Game.DOLPHIN_nullpath;
        }
        return path_index;
    }

    public Object getPath_orientation() {
        if (path_orientation == null) {
            path_orientation = 0d;
        }
        return path_orientation;
    }

    public Object getPath_position() {
        if (path_index == null) {
            return 0d;
        }
        
        return (pathcurrentdistance/(double)((Path)path_index).distance);
    }

    public Object getPath_positionprevious() {
        if (path_positionprevious == null) {
            path_positionprevious = 0d;
        }
        return path_positionprevious;
    }

    public Object getPath_scale() {
        if (path_scale == null) {
            path_scale = 1d;
        }
        return path_scale;
    }

    public Object getPath_speed() {
        if (path_speed == null) {
            path_speed = 0d;
        }
        return path_speed;
    }

    public Object getPersistent() {
        if (persistent == null) {
            persistent = 0d;
        }
        return persistent;
    }

    public Object getSolid() {
        if (solid)
        return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
    

    public Object getSpeed() {
       return Game.getValueOf(Math.sqrt((hspeed * hspeed) + (vspeed * vspeed)));
        
    //return sqrt(new Double(hspeed*hspeed + vspeed*vspeed));
    }

    public Object getSprite_height() {
        if (sprite == null) {
            return new Double(-1);
        }
        return new Double(sprite.sprite_height*image_yscale);
    }

    public Object getSprite_index() {
        if (sprite == null) {
            return 0d;
        }
        return sprite;
    }

    public Object getSprite_width() {
        if (sprite == null) {
            return new Double(-1);
        }
        return new Double(sprite.sprite_width*image_xscale);
    }

    public Object getSprite_xoffset() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.sprite_xoffset);
    }

    public Object getSprite_yoffset() {
        if (sprite == null) {
            return 0d;
        }
        return new Double(sprite.sprite_yoffset);
    }

    public Object getTimeline_index() {
        if (timeline_index == null) {
            timeline_index = 0d;
        }
        return timeline_index;
    }

    public Object getTimeline_position() {
        
        return new Double(timeline_position);
    }

    public Object getTimeline_speed() {
        
        return new Double(timeline_speed);
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
   
    public void setBbox_bottom(Object bbox_bottom) {
        if (sprite == null) {
            return;
        }
        sprite.BBBottom = ((Double)bbox_bottom).intValue();
    }

    public void setBbox_left(Object bbox_left) {
        if (sprite == null) {
            return;
        }
        sprite.BBLeft = ((Double)bbox_left).intValue();
    }

    public void setBbox_right(Object bbox_right) {
        if (sprite == null) {
            return;
        }
        sprite.BBRight = ((Double)bbox_right).intValue();
    }

    public void setBbox_top(Object bbox_top) {
        if (sprite == null) {
            return;
        }
        sprite.BBTop = ((Double)bbox_top).intValue();
    }

    public void setDepth(Object depth) {
        this.depth = depth;
        Game.currentRoom.SortDepth();
    }

    public void setDirection(Object direction) {
        double sp = ((Double)getSpeed());
        System.out.println("speed:" + sp);
        if (sp == 0) {
            sp = 1;
        }
        hspeed = sp * (Double)cos(degtorad(direction));
        vspeed = -sp * (Double)sin(degtorad(direction));
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
        this.hspeed = ((Double)hspeed);
    }

    public void setId(Object id) {
       // id is contstant
    }

    public void setImage_alpha(Object image_alpha) {
        this.image_alpha = image_alpha;
    }

    public void setImage_angle(Object image_angle) {
        if (sprite != null) {
            sprite.angle(((Double)image_angle).intValue());
        }
    }

    public void setImage_blend(Object image_blend) {
        this.image_blend = image_blend;
    }

    public void setImage_index(Object image_index) {
        if (sprite != null) {
            sprite_index = ((Double)image_index).intValue();
        }
    }

    public void setImage_number(Object image_number) {
        //constant
    }

    public void setImage_single(Object image_single) {
        this.image_single = image_single;
    }

    public void setImage_speed(Object image_speed) {
        sprite_speed = ((Double)image_speed);
    }

    public void setImage_xscale(Object image_xscale) {
        this.image_xscale= ((Double)image_xscale).intValue();
        
    }

    public void setImage_yscale(Object image_yscale) {
        this.image_yscale= ((Double)image_yscale).intValue();
        
    }

    public void setObject_index(Object object_index) {
        this.object_index = object_index;
    }

    public void setPath_endaction(Object path_endaction) {
        this.path_endaction = path_endaction;
    }

    public void setPath_index(Object path_index) {
    	if (path_index instanceof Path)
        this.path_index = path_index;
    	else
    		this.path_index = Game.DOLPHIN_nullpath;
    }

    public void setPath_orientation(Object path_orientation) {
        this.path_orientation = path_orientation;
    }

    public void setPath_position(Object path_position) {
    	
    	if (path_position instanceof Double)
        this.path_position = path_position;
    	else
    		this.path_position = ((Integer)path_position).doubleValue();
    }

    public void setPath_positionprevious(Object path_positionprevious) {
        this.path_positionprevious = path_positionprevious;
    }

    public void setPath_scale(Object path_scale) {
        this.path_scale = path_scale;
    }

    public void setPath_speed(Object path_speed) {
    	if (path_index!=null)
    	if (Math.sign((Double)getPath_speed()) != Math.sign((Double)path_speed))
    	{
    		int max = ((Path)path_index).al.size();
    		//change in direction
    		
    		if ((Double)path_speed >0){
    			if (pathcurrentpoint+1 < max-1)
    				pathcurrentpoint++;
    		}else{
    			System.out.println("change direction, speed is now negative pos:"+pathcurrentpoint);
    			if (pathcurrentpoint-1 >-1){
    				pathcurrentpoint--;
    			System.out.println("set path position to:"+(pathcurrentpoint-1));
    			}
    		}
    	}
        this.path_speed = path_speed;
    }

    public void setPersistent(Object persistent) {
        this.persistent = persistent;
    }

    public void setSolid(Object solid) {
        this.solid = ((Boolean)solid);
    }

    public void setSpeed(Object speed) {

        hspeed = ((Double)speed) * Math.cos(Math.degtorad((Double)getDirection()));
        vspeed = -((Double)speed) * Math.sin(Math.degtorad(((Double)getDirection())));
    }

    public void setSprite_height(Object sprite_height) {
        //constant
    }

    public void setSprite_index(Object sprite_index) {
        if (sprite_index != null) {
            if (sprite_index instanceof Sprite) {
                sprite = (Sprite) sprite_index;
            }
        }
    }

    public void setSprite_width(Object sprite_width) {
        //constant
    }

    public void setSprite_xoffset(Object sprite_xoffset) {
        sprite.sprite_xoffset = ((Double)sprite_xoffset).intValue();
    }

    public void setSprite_yoffset(Object sprite_yoffset) {
        sprite.sprite_yoffset = ((Double)sprite_yoffset).intValue();
    }

    public void setTimeline_index(Object timeline_index) {
        this.timeline_index = timeline_index;
    }

    public void setTimeline_position(Object timeline_position) {
        this.timeline_position = ((Double)timeline_position);
    }

    public void setTimeline_speed(Object timeline_speed) {
        this.timeline_speed = ((Double)timeline_speed);
    }

    public void setVisible(Object visible) {
        this.visible = ((Boolean)visible);
    }

    public void setVspeed(Object vspeed) {
        this.vspeed = ((Double)vspeed);
    }

    public void setX(Object x) {
        this.x = ((Double)x);
    }

    public void setX(double x) {
        setX(new Double(x));
    }

    public void setXprevious(Object xprevious) {
        this.xprevious = ((Double)xprevious);
    }

    public void setXstart(Object xstart) {
        this.xstart = ((Double)xstart);
    }

    public void setYprevious(Object yprevious) {
        this.yprevious = ((Double)yprevious);
    }

    public void setMask_index(Object mask_index) {
    	if (mask_index instanceof Sprite)
        this.mask_index = (Sprite)mask_index;
    	else
    		this.mask_index = null;
    }

    public void setY(Object y) {
        this.y = ((Double)y);
    }

    public void setY(double y) {
        setY(new Double(y));
    }

    public void setYstart(Object ystart) {
        this.ystart = ((Double)ystart).floatValue();
    }
    // </editor-fold>   
    /*public void setObject(String name, Object value) {
        try {
            java.lang.String nm = "" + name;
            Method m = variables.class.getDeclaredMethod("set" + name.charAt(nm, 0).toUpperCase() + nm.substring(1) + "", new Class[]{Object.class});
            try {

                m.invoke(variables.class.newInstance(), value);

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


    }*/

    /*
     * This function is required, it sets the value of Object with string name.
     */
    public void setVariable(java.lang.String name, Object value) {
        variables.put(name, value);
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public void multVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.mult(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using += with custom variables
     */
    public void addVariable(java.lang.String name, Object multValue) {
        variables.put(name,Variable.add( getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using -= with custom variables
     */
    public void subVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.sub(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using /= with custom variables
     */
    public void divVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.div(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using &= with custom variables
     */
    public void bandVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.band(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public void borVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.bor(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public void bxorVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.bxor(getVariable(name),multValue));
    }
    
    /*
     * Test function for ints
     * 
     */
    public void setVariable(java.lang.String name, int value) {
        variables.put(name, new Double(value));
    }

    public Object getVariableOLD(String name) {
        try {
            java.lang.String nm = "" + name;
            Method m = Variables.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{});
            try {
                return (Object) m.invoke(Variables.class.newInstance(), null);

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

        Object o = (Object) variables.get(name.toString());
        if (o == null) {
            return 0d;
        }
        return o;
    }

    /*
     * Gets the value of the Object with string name.
     * 
     */
    public Object getVariable(java.lang.String name) {
        Object o = (Object) variables.get(name.toString());
        if (o == null) {
            o=0d;
            variables.put(name.toString(),o );
            return o;
        }
        return o;
    }

    public Object getAlarm(int id) {
    return new Double(alarm[id]);
    }

    public void setAlarm(int id,Object v){
    alarm[id]=((Double)v).intValue();
    }
    
    public Actor getActor(){
		return self;
	}

}
