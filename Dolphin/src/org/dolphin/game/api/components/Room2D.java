package org.dolphin.game.api.components;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.util.Collections;
import java.util.Vector;

import org.dolphin.game.Game;
import org.dolphin.game.api.Variables;
import org.dolphin.game.api.types.Variable;

/*
 * The 2D room component, all rooms should use this class as a parent.
 */
public class Room2D {


/** The container for the test */

Frame Frame;

/**
 * All the instances in this room as a {@link Vector} object
 */
public Vector<Variable> instances = new Vector<Variable>();

/**
 * All the instances and tiles in this room as a {@link Vector} object sorted by
 * depth
 */
private Vector depth = new Vector();

public Vector deactivated = new Vector();


/**
 * All the tiles in this room as a {@link Vector} object
 */
private static Vector tiles = new Vector();

/**
 * The caption of this room
 */
public String Caption;

/**
 * The speed of the scene
 */
public double speed = 60;
   

/**
 * The height of the scene
 */
public int height;

/**
 * The width of the scene
 */
public int width;

 public boolean showcolor=true;  
   
 public Vector<Background> backgrounds = new Vector();
 
 public Graphics2D g2d=null,bg2d=null;
 
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
public Room2D(Frame R, String Caption, long fps,int RoomW,int RoomH,Color backcolor) {
   
    this.speed = fps;
    Game.game.getGame().setFPS((int)fps-1);
    this.height = RoomH;
    this.width = RoomW;
// this.Width = RoomW + 7;
// this.Height = RoomH + 25;
    this.backcolor = backcolor;
    this.Caption = Caption;
    
    Frame.setSize(width+5, height+25);
       
    
    
    // room creation code
    Creation_code();
    
    Frame.setTitle(Caption); // set room caption
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
    Frame.setTitle(Caption+" "+ cap);
}

public int getFPS()
{
   return Game.game.getGame().getCurrentFPS();// container.getFPS();
}   

/**
 * This will sort the depth vector by depth TODO move this method to another
 * class (No need to be in more than one scene2D)
 */
@SuppressWarnings("unchecked")
public void SortDepth() {
    depth.addAll(instances);
    java.util.Collections.sort(depth,java.util.Collections.reverseOrder());
    depth.trimToSize();
}

public void disposeScene()
{}

/**
 * Override with creation code
 */
public void Creation_code(){
}




/**
 * Create all the actors, backgrounds tiles etc
 */
private void setupScene() {
    System.out.println("Warning: Nothing in setup scene!");
}


public void init() {
    SortDepth();
}


public void update()  {
   for (int i = 0; i < instances.size(); i++) {
       if (instances.elementAt(i) !=null)
        ((Actor)instances.elementAt(i)).callEvents();
    }
   updateCaption();
}

public void render(Graphics2D g)  {
    if (Game.graphics == null)
        g2d = g;
    else
        bg2d=g;
    
    if (showcolor) {
    g.setColor( backcolor );
    g.fillRect( 0, 0, width, height );
    }
    
    // Draw background
    for (int i = 0; i < backgrounds.size(); i++) {
        
        Background object = backgrounds.elementAt(i);
        if (object.background_visible)
        g.drawImage(object.background_image, null, object.background_x, object.background_y);
        object.update();
    }

    
    // Draw instances
    for (int i = 0; i < instances.size(); i++) {
        if (((Actor)instances.elementAt(i)).visible)
            if (instances.elementAt(i) !=null)
        ((Actor)instances.elementAt(i)).Draw_event(g);
    }
   
}
}
