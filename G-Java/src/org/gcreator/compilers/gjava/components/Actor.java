package org.gcreator.compilers.gjava.components;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * The Actor object
 * @author G-Java development team
 * @version 1.0
 */
public class Actor extends tile {
    /**
     * The Actor name
     */
    public String name;
    
    /**
     * Persistant actor?
     */
    public boolean persistent;
    
    /**
     * The {@link Timeline} of the actor
     */
    public Timeline timeline;
    
    //public Path path;
    
    
    //public double path_position;
    
        
    //Graphics g used to stop drawing in non draw event errors
    private Graphics g;
    
    
    /**
     * The alarms of the actor, max 20
     */
    public int[] alarms;
    
    
    /**
     * The sprite for this actor
     */
    public sprite sprite;
    //public sprite G_JAVA_Object_mask;
    
    /**
     * The start x coordinate of the actor
     */
    public double xstart=0;
    /**
     * The start y coordinate of the actor
     */
    public double ystart=0;
    /**
     * The actor depth, default 0
     */
    public double depth = 0;
    /**
     * The actor direction, default 0
     */
    private double direction = 0;
     /**
     * Get the actor direction
     * @return 
     */
    public double get_direction(){return direction;}
    /**
     * Set the actor direction
     * @param direction 
     */
    public void set_direction(double direction){this.direction = direction;}
    
    
    
    /**
     * The actor horizontal speed
     */
    public double hspeed = 0;
    
    /**
     * Get the actor hspeed
     * @return 
     */
    public double get_hspeed(){return hspeed;}
    /**
     * Set the actor hspeed
     * @param hspeed 
     */
    public void set_hspeed(double hspeed){this.hspeed = hspeed;}
    
    
    /**
     * The actor vertical speed
     */
    public double vspeed = 0;
     /**
     * Get the actor vspeed
     * @return 
     */
    public double get_vspeed(){return vspeed;}
    /**
     * Set the actor vspeed
     * @param vspeed 
     */
    public void set_vspeed(double vspeed){this.vspeed = vspeed;}
    
    
    /**
     * The actor friction
     */
    private double friction = 0;
    /**
     * Get the actor friction
     * @return 
     */
    public double get_friction(){return friction;}
    /**
     * Set the actor friction
     * @param friction 
     */
    public void set_friction(double friction){this.friction = friction;}
    
    
    /**
     * The actor x coordinate
     */
    public double x=0;
    /**
     * The actor y coordinate
     */
    public double y=0;
    /**
     * The actor previous x coordinate
     */
    public double xprevious=0;
    /**
     * The actor previous y coordinate
     */
    public double yprevious=0;
    
    private double gravity_direction=0;
    /**
     * Get the actor gravity_direction
     * @return 
     */
    public double get_gravity_direction(){return gravity_direction;}
    /**
     * Set the actor gravity_direction
     * @param gravity_direction 
     */
    public void set_gravity_direction(double gravity_direction){this.gravity_direction = gravity_direction;}
    
    private double gravity=0;
    /**
     * Get the actor gravity
     * @return 
     */
    public double get_gravity(){return gravity;}
    /**
     * Set the actor gravity
     * @param gravity 
     */
    public void set_gravity(double gravity){this.gravity = gravity;}
    
    /**
     * The id of the object
     */
    public int id;
    
    /**
     * If the actor is solid or not
     */
    public boolean solid;
    /**
     * If the actor is visible or not
     */
    public boolean visible;
    
    private static Vector G_JAVA_keyboard = new Vector();
    
    //public static Random G_JAVA_random = new Random(149L);
    
    private int G_JAVA_locali,dir = 0, subimage = 0, csubimage = 0, G_JAVA_i = 0, bbwidth = 10, bbheight = 10;
    
    private Rectangle bounds;
    
    /**
     * The image of the actor
     */
    public static ImageIcon image;
    
    
    //public boolean G_JAVA_move_towards_point = false;
    //public boolean G_JAVA_folow_path = false;
    
    /**
     * Create a new Actor
     */
    Actor(int X,int Y,int objid,double instance_id) {
        xstart = X;
        ystart = Y;
        id = objid;
        this.instance_id = instance_id;
    }
    
    /**
     * Creates a new actor, don't call this, call other constructor
     */
    Actor(String Object_name,String img,boolean Solid,boolean Visible,int Depth,int Persistent) {
                /*
                 * Objects(int id,String Object_name,sprite Object_sprite,sprite Object_mask,double Object_depth, int
                 * Object_solid,int Object_visible,int parent,boolean Object_persistent)
                 */
        this.persistent = (Persistent == 1);
        this.alarms = new int[20];
        this.name = Object_name;
        //if (Object_sprite != -1) this.G_JAVA_Object_sprite = basicgame.sprite[Object_sprite];
        if (!img.equals("null"))
        this.image = new ImageIcon(this.getClass().getResource(img.replaceAll("/images", "images")));
        
        
            this.visible = Visible;
        this.depth = Depth;
        
        this.solid = Solid;
        //this.G_JAVA_move_towards_point = false;
        //this.G_JAVA_folow_path = false;
        //this.parent = Parent;
        Create_event();
    }
    
    
    
    /**
     * Override with actor create event
     */
    public void Create_event(){}
    
    /**
     * Override with actor create event
     */
    public void Destroy_event(){}
    
    /**
     * Override with actor Begin Step event
     */
    public void Begin_Step_event(){}
    
    /**
     * Override with Alarm event code
     */
    public void Alarm(){}
    
    /**
     * Override with actor Step event
     */
    public void Step(){}
    
   public void decrease_alarms() {
        int dd = 0;
        while (dd < 12) {
            if (alarms[dd] > 0) {
                alarms[dd]--;
            }
            dd++;
        }
    }
    
    /**
     * Override with actor End Step event
     */
    public void End_Step_event(){}
    
    /**
     * Override with actor Key Pressed event
     * @param keycode 
     */
    public void Key_Pressed(int keycode) {
        if (!G_JAVA_keyboard.contains(new Integer(keycode))) {
            
            G_JAVA_keyboard.add(0,new Integer(keycode));
        }
        // any key
        if (!G_JAVA_keyboard.contains(new Integer(1))) {
            
            G_JAVA_keyboard.add(0,new Integer(1));
        }
        // evt.consume();
    }
    
    /**
     * Override with actor Key Released event
     * @param keycode 
     */
    public void Key_Released(int keycode) {
        // remove keyboard
        int G_JAVA_ii = G_JAVA_keyboard.size() - 1;
        while (G_JAVA_ii > -1) {
            Integer o = (Integer) G_JAVA_keyboard.get(G_JAVA_ii);
            if (o.intValue() == keycode) {
                G_JAVA_keyboard.remove(G_JAVA_ii);
            }
            G_JAVA_ii--;
        }
        // evt.consume();
        if (G_JAVA_keyboard.size() == 1) {
            G_JAVA_keyboard.remove(0);
        }
    }
    
    /**
     * Override with actor Keyboard event
     */
    public void Keyboard_event(){}
    
    /**
     * Override with actor mouse event
     */
    public void Mouse_event(){}
    
    public void mouse_Pressed(int keycode,int xx,int yy) {
        
    }
    
    private synchronized void Key_Typed(KeyEvent evt) {
        // evt.consume();
    }
    
    /**
     * Override with actor Collision event
     */
    public void Collision_event() {
       /* Rectangle thisBounds = getBounds((int)X,(int)Y);
        int G_JAVA_ii = 0;
        while (G_JAVA_ii < basicgame.Current_room.instances.size()) {
            Actor o = (Actor) basicgame.Current_room.instances.get(G_JAVA_ii);
            bounds = o.getBounds((int)(o.x),(int)(o.y));
            if (bounds.intersects(thisBounds)) {
                if (this.solid) {
                    X = xprevious;
                    Y = yprevious;
                    // o.X = o.xprevious;
                    // o.Y = o.yprevious;
                }
            }
            G_JAVA_ii++;
        }*/
    }
    
   // public abstract void Outside();
    
    //public abstract void End_animation();
    
   // public abstract void No_lives();
    
    //public abstract void No_health();
    
    /**
     * This will Move the object, should be called every step
     */
    public void Move() {
        // this method will move the object
        xprevious = x;
        yprevious = y;
        // if ((move_towards_point==true)) {
        // hspeed2 = point_speed * Math.cos((Math.atan2(Y - point_y, point_x-X)*180/Math.PI) * (Math.PI/180));
        // vspeed2 = point_speed * Math.sin((Math.atan2(Y - point_y, point_x-X)*180/Math.PI) * (Math.PI/180));
        // if ((this.X == point_x)&&(this.Y == point_y)) {
        // move_towards_point = false;
        // }
        
        //		if (G_JAVA_path !=null)
        //			{
        //			if (G_JAVA_path.relative == 0)
        //				{
        //				Double vectorx = (Double)(G_JAVA_path.x.get((int)(G_JAVA_path_position)));
        //				Double vectory = (Double)(G_JAVA_path.y.get((int)(G_JAVA_path_position)));
        //				double distance = Math.sqrt (((vectorx.doubleValue()-X)*(vectorx.doubleValue()-X)) + ((vectory.doubleValue()-Y)*(vectory.doubleValue()-Y)));
        //				X = X + G_JAVA_path.rel_speed * Math.cos((Math.atan2(vectory.doubleValue(), vectorx.doubleValue())*180/Math.PI) * (Math.PI/180));
        //				Y = Y + G_JAVA_path.rel_speed * Math.sin((Math.atan2(vectory.doubleValue(), vectorx.doubleValue())*180/Math.PI) * (Math.PI/180));
        //
        //				if (distance-Math.sqrt((X*X)+(Y*Y)) >0)
        //					{
        //					}
        //				else {
        //				//X = xprevious;
        //				//Y = yprevious;
        //				if (G_JAVA_path_position+1 >= G_JAVA_path.points)
        //					G_JAVA_path_position = 0;
        //					else
        //						G_JAVA_path_position++;
        //				}
        //				//if ((((Double)(path.x.get(path_position))).equals(new Double(X))) && (((Double)(path.y.get(path_position))).equals(new Double(Y))))
        //					{
        //
        //					}
        //				} else {
        //
        //				}
        //			} else {
        
        x = x + hspeed;// +(int)gravityh;
        y = y + vspeed;// +(int)gravityv;
        //}
    }
    
        /*public void set_variable(String variablename,String value)
                {
                // this methods sets local variables for this object
                variable_n.add(0,variablename);
                variable_v.add(0,value);
                }*/
    
    /**
     * Get the bounding box for thisd actor
     * @param X 
     * @param Y 
     * @return 
     */
    public Rectangle getBounds(double X,double Y) {
        // this.X = X;
        // this.Y = Y;
        if (sprite == null) {
            return new Rectangle(0,0,0,0);
            
        } else {
            
            // bbheight = Object_sprite.sprite_height; //- Object_sprite.BBTop - Object_sprite.BBBottom;
            // bbwidth = Object_sprite.sprite_width; //- Object_sprite.BBLeft - Object_sprite.BBRight;
            bbheight = sprite.BBBottom - sprite.BBTop + 1;
            bbwidth = sprite.BBRight - sprite.BBLeft + 1;
            
            Rectangle rect = new Rectangle((int)(X) + sprite.BBLeft - sprite.sprite_xoffset,(int)(Y)
                    + sprite.BBTop - sprite.sprite_yoffset,bbwidth,bbheight);
            
            return rect;
        }
        
    }
    
//    public static boolean get_parent(int id) {
//        // check if the id is one of this objects parents
//        return false;
//    }
    
    /**
     * Get the image of this actor
     * @return Image object for the image of this actor
     */
    public Image get_image() {
        return image.getImage();
    }
    
    /**
     * Override with the Draw event of the actor but don't call this method!
     * @param g 
     */
    public void Draw_event(Graphics g) {
        
        if (visible) {
            
            if (image == null) {
                // don't draw sprite
                
            } else {
                // System.out.println("Draw Sprite"+image.getImage().getHeight(null));
                                /*if (subimage == 0)
                                        {
                                 
                                        if (csubimage > G_JAVA_Object_sprite.subimages - 1)
                                                {
                                                csubimage = 0;
                                 
                                                }
                                        // draw sprite
                                        g.drawImage(G_JAVA_Object_sprite.imshow(csubimage),(int) X - G_JAVA_Object_sprite.sprite_xoffset,(int) Y
                                                        - G_JAVA_Object_sprite.sprite_yoffset,null);
                                        csubimage++;
                                        }
                                else
                                        {
                                        // draw the still sprite
                                        g.drawImage(G_JAVA_Object_sprite.imshow(subimage),(int) X - G_JAVA_Object_sprite.sprite_xoffset,(int) Y
                                                        - G_JAVA_Object_sprite.sprite_yoffset,null);
                                 
                                        }*/
                g.drawImage(image.getImage(), (int)x,(int)y, null);
                
            }
            // draw bb
            // g.drawRect(getBounds(X,Y).x,getBounds(X,Y).y,getBounds(X,Y).width,getBounds(X,Y).height);
            // }
            
        }
        // bbheight = Object_sprite.sprite_height; //- Object_sprite.BBTop - Object_sprite.BBBottom;
        // bbwidth = Object_sprite.sprite_width; //- Object_sprite.BBLeft - Object_sprite.BBRight;
        
        // g.drawRect(X+Object_sprite.BBLeft-Object_sprite.sprite_xoffset ,Y +
        // Object_sprite.BBTop-Object_sprite.sprite_yoffset, bbwidth ,bbheight);
    }
    
}