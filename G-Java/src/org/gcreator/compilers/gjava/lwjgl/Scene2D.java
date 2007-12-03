/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.lwjgl;


import java.awt.Frame;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.CanvasGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.GradientTest;

/**
 *
 * @author TGMG
 */
public class Scene2D extends BasicGame {

        //<editor-fold defaultstate="collapsed" desc="Variables">
 
    /** The container for the test */
	private GameContainer container;
    
    Frame Frame;
   
    /**
     * All the instances in this room as a {@link Vector} object
     */
    public Vector instances = new Vector();
    
    /**
     * All the instances and tiles in this room as a {@link Vector} object sorted by depth
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
    public long speed = 60;
       
    
    /**
     * The height of the scene
     */
    public int height;
    
    /**
     * The width of the scene
     */
    public int width;
    
       
       
    /**
     * The background color for this room
     */
    public Color backcolor = Color.black;
    
    // end of declaring variables
    //</editor-fold>
    
    public Scene2D(){
    super("");
    }
    
    /**
     * Creates a new RoomPanel object
     * @param R Jframe to add to
     * @param roomname The name of the room
     * @param Caption The caption of the room
     * @param fps The speed of room
     * @param RoomW The room width
     * @param RoomH The room height
     * @param backcolor The room backgound color
     */
    public Scene2D(Frame R, String Caption, long fps,int RoomW,int RoomH,Color backcolor) {
        //this.name = roomname;
        super(Caption);
        Basicgame.Current = this;
        this.speed = fps;
        this.Frame = R;
        this.height = RoomH;
        this.width = RoomW;
//        this.Width = RoomW + 7;
//        this.Height = RoomH + 25;
        this.backcolor = backcolor;
        this.Caption = Caption;
        
        R.setSize(width, height);
           
        
        
        // room creation code
        Creation_code();
        
           
        if (!Basicgame.Runningas.equals("Applet")) {
            // room caption
            Frame.setTitle(Caption);
            
        }
    }
    
    /**
     * This will sort the depth vector by depth
     * TODO move this method to another class (No need to be in more than one scene2D)
     */
    public void SortDepth() {
        depth.addAll(instances);
        java.util.Collections.sort(depth,Collections.reverseOrder());
        depth.trimToSize();
    }
    
    public void disposeScene()
    {}

   /**
     * Override with creation code
     */
    public void Creation_code(){
    //System.out.println("creation code");
    }
    
    public CanvasGameContainer getCanvas()
    {
        try {
            return new CanvasGameContainer(this);
        } catch (LWJGLException ex) {
            System.out.println("exception with getCanvas"+ex);
            return null;
        }
    }

    
    /**
     * Create all the actors, backgrounds tiles etc
     */
    private void setupScene() {
        System.out.println("setup null scene");
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        this.container = container;
        System.out.println("init");
    }

    @Override
    public void update(GameContainer arg0, int arg1) throws SlickException {
        System.out.println("update");
    }

    public void render(GameContainer arg0, Graphics g) throws SlickException {
        g.setColor( backcolor );
        g.fillRect( 0, 0, width, height );
         System.out.println("render");
    }
   
    
}
