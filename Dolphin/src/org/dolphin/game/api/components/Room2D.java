package org.dolphin.game.api.components;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Vector;

import org.dolphin.game.Game;
import org.dolphin.game.Scripts;
import org.dolphin.game.api.GCL;
import org.dolphin.game.api.Variables;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.exceptions.RoomChangedException;
import org.dolphin.game.api.types.Variable;
public class Room2D extends Scripts implements Serializable {
private static final long serialVersionUID = 1L;


/** The container for the test */

//static Frame Frame;

/**
 * All the instances in this room as a {@link Vector} object
 */
public Vector<Actor> instances = new Vector<Actor>();

public Vector<View> views = new Vector<View>();

/**
 * All the instances and tiles in this room as a {@link Vector} object sorted by
 * depth
 */
public Vector depth = new Vector();

/*The id in the vector*/
public int vectorid=0;

/*Vector of deactivated instances*/
public Vector deactivated = new Vector();


/**
 * All the tiles in this room as a {@link Vector} object
 */
protected static Vector<Tile> tiles = new Vector<Tile>();

/**
 * The caption of this room
 */
public String Caption="Dolphin Game";

/**
 * The speed of the scene
 */
public double speed = 60;

public double id=0;

/**
 * The height of the scene
 */
public int height;

/**
 * The width of the scene
 */
public int width;

/*Whether to show the background color*/
public boolean showcolor=true;

/*whether to use views*/
public boolean showviews=false;

/*If room is persistent or not*/
public boolean persistent=false;
 
/*The vector of background to draw in this room*/
public Vector<Background> backgrounds = new Vector();
 
transient public Graphics2D g2d=null,bg2d=null;
 
/**
 * The background color for this room, using java color object
 */
public Color backcolor = Color.black;


public Room2D(){
}

   
/**
 * Creates a new RoomPanel object
 * 
 * @param R
 *            JFrame to add to
 * @param roomname
 *            The name of the room
 * @param Caption
 *            The caption of the room
 * @param fps
 *            The speed of room
 * @param RoomW
 *            The room width
 * @param RoomH
 *            The room height
 * @param backcolor
 *            The room backgound color
 */
public Room2D(Frame R, String caption, long fps,int RoomW,int RoomH,Color backcolor,boolean drawbackground,boolean persistent,double id) {
   //this.Frame=R;
    this.speed = fps;
    
    this.height = RoomH;
    this.width = RoomW;
    this.showcolor=drawbackground;
    this.backcolor = backcolor;
    this.Caption = caption;
    
    this.persistent = persistent;
    this.id= id;

}

public void setvisible(){
    Game.game.getGame().setFPS((int)speed);
    Game.frame.setTitle(Caption); // set room caption
    Game.frame.setSize(width+5, height+25);

    if(instances.size()>0){
    //persisten and going back to this room
    } else{
        //first create all objects and their create events
    setupScene();
    depth.addAll(instances);
    depth.addAll(tiles);
    SortDepth();
    // now execute room creation code
    Creation_code();
    }
    
}

public void setinvisible(){
    if(!persistent){
instances = new Vector<Actor>();
depth=new Vector<Tile>();
    }
}


/**
 * This will update the caption for the room to show score etc
 */
public void updateCaption()
{
    String cap = "";
    if (Variables.show_score.getBoolean() && Variables.score.getDouble()!=0)
        cap += Variables.caption_score.getString().add (Variables.score.getString());
    if (Variables.show_lives.getBoolean())
        cap += Variables.caption_lives.getString().add (Variables.lives.getString());
    if (Variables.show_health.getBoolean())
        cap += Variables.caption_health.getString().add (Variables.health.getString());
    Game.frame.setTitle(Caption+" "+ cap);
}

/*public int getFPS()
{
   return Game.game.getGame().getCurrentFPS();
}   */

/**
 * This will sort the depth vector by depth TODO move this method to another
 * class (No need to be in more than one scene2D)
 */
@SuppressWarnings("unchecked")
public void SortDepth() {
    
    java.util.Collections.sort(depth,java.util.Collections.reverseOrder());
    //depth.trimToSize();
    
}

public void disposeScene()
{}

/**
 * Override with creation code
 */
public void Creation_code(){
}




/**
 * Create all the actors, backgrounds tiles etc. Override this!
 */
protected void setupScene() {
    System.out.println("Warning: Nothing in setup scene!");
}


public void init() {
    SortDepth();
}


/*
 * Update method. Called every step should not be overridden
 */
public void update()  {
   // int thesize = instances.size();
    try{
   for (int i = 0; i < instances.size(); i++) {
       if (instances.elementAt(i) !=null)
        ((Actor)instances.elementAt(i)).callEvents();
    }
    }catch(RoomChangedException rce){}
   //updateCaption();
}

private void drawBackgrounds(Graphics2D g,boolean foreground){
// Draw background
    for (int i = 0; i < backgrounds.size(); i++) {
        Background object = backgrounds.elementAt(i);
        if (object.background_visible && object.background_foreground == foreground)
        {

        int w = object.background_scale ? this.width : object.background_width;
		int h = object.background_scale ? this.height : object.background_height;
        if (object.background_htiled || object.background_vtiled)
			{
			int x = object.background_x;
			int y = object.background_y;
			int ncol = 1;
			int nrow = 1;
			if (object.background_htiled)
				{
				x = 1 + ((x + w - 1) % w) - w;
				ncol = 1 + (width - x - 1) / w;
				}
			if (object.background_vtiled)
				{
				y = 1 + ((y + h - 1) % h) - h;
				nrow = 1 + (height - y - 1) / h;
				}
			for (int row = 0; row < nrow; row++)
				for (int col = 0; col < ncol; col++)
					g.drawImage(object.background_image,(x + w * col),(y + h * row),w,h,null);
			}
		//g.drawImage(bi,bd.x,bd.y,w,h,this);
                object.background_x+=object.background_hspeed;
                object.background_y+=object.background_vspeed;
                g.drawImage(object.background_image, object.background_x, object.background_y,w,h,null);
        }
        object.update();
    }
}

BufferedImage bi; //the buffered image to use for views

public void render(Graphics2D g2d2)  {
    Graphics2D g;
    
    if (showviews){
    bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    g = bi.createGraphics();
    } else{
    g=g2d2;
    }
    /*code used for drawing using gm functions*/
    if (Game.graphics == null)
        g2d = g;
    else
        bg2d=g;
    
    if (showcolor) {
    g.setColor( backcolor );
    g.fillRect( 0, 0, width, height );
    
    }
    
    drawBackgrounds(g,false);

    
    // Draw instances and tiles
    try{
    for (int i = 0; i < depth.size(); i++) {
        
        if (((Tile)depth.elementAt(i)).visible){
            if (depth.elementAt(i) !=null)
        ((Tile)depth.elementAt(i)).Draw_event(g);
        }
        
    }
    }catch(RoomChangedException rce){}
    

    //draw foregrounds
    drawBackgrounds(g,true);
    g.dispose();
    //view code goes here

   if (showviews){
    for (int i = 0; i < views.size(); i++) {
    View v = views.get(i);
    if (v.visible)
    g2d2.drawImage(bi.getSubimage(v.x, v.y, v.width, v.height),v.portx,v.porty,v.portwidth,v.portheight,null);
    }
    }else{}
   
}

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(views);
        out.writeObject(this.backgrounds);
        out.writeObject(this.tiles);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //none
    }

    
}
