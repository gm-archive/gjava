package org.dolphin.game.api.gtge;

import static org.dolphin.game.api.gtge.BasicGame.rooms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.dolphin.game.api.Clipboard;
import org.dolphin.game.api.components.Room2D;

import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;

/*
 * The Basicgame class is used in every game as the main class that is run. 
 * This is always extended with a Game Object.
 * 
 */
import java.awt.Frame;
import org.dolphin.game.api.components.Sprite;
import org.dolphin.game.api.exceptions.RoomChangedException;
public class BasicGame extends Game {
    /*The main game Frame*/
    public static Frame frame;

    /*Hashtables used to store used resources*/
    public Hashtable backgrounds = new Hashtable(),sprites = new Hashtable(),sounds= new Hashtable();

	/*
	 * Can't remember what this is for
	 * TODO: remember what this is for
	 */
	public static Graphics2D graphics=null;
	
	/*
	 * Can't remember what this is for
	 * TODO: remember what this is for
	 */
	public static Container canvas;
	
	/* All the instances used throuhout the whole game*/
	public static Hashtable allinstances;
	
	/* The current maximum instance id */
	public static int maxInstanceId; 
	
	/* The current room being used */
	public static Room2D currentRoom;
	/*
	 * auto_redraw is whether the room are drawn (to set use
	 * set_automatic_draw(boolean))
	 */
	public static boolean auto_redraw=true;
	
	/*The rooms*/
	public static Vector<Room2D> rooms;
	
	public static boolean fullscreen=false;
	
	/*
	 * parameter_count is a variable that can be called in gml to get the number
	 * of parameters
	 */
	public static int parameter_count = 0;

	/*
	 * The list of parameters passed to the program
	 */
	public static String[] parameters;

	/*
	 * The type of game, normally Application but can be Applet and possibly
	 * mobile
	 */
	public static String gameType = "Application";

	/*
	 * The GameLoader which creates the main game for GTGE
	 */
	public static GameLoader game;

	/*
	 * 
	 * 
	 * 
	 * Start of Methods
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 * Overrides method from GTGE to initialise the resources
	 * 
	 * @see com.golden.gamedev.Game#initResources()
	 */
	@Override
	public void initResources() {
		// TODO Auto-generated method stub

	}


	/*
	 * Overrides method from GTGE to draw the game
	 * 
	 * @see com.golden.gamedev.Game#render(java.awt.Graphics2D)
	 */
	@Override
	public void render(Graphics2D g) {
		// draw the current room
		if (auto_redraw)
			currentRoom.render(g);
		
	}

	/*
	 * Overrides method from GTGE to update the game
	 * 
	 * @see com.golden.gamedev.Game#update(long)
	 */
	@Override
	public void update(long elapsedTime) {
		// update the current room
		currentRoom.update();
		
	}

	/*
	 * Every game should override this method
	 */
	public static void setupGame() {
		//game = new GameLoader();
		//game.setup(new BasicGame(), new Dimension(640, 480), false);
	}
	
	/*
	 * Go to the next room
	 */
	public static void nextRoom() throws RoomChangedException{
            
		if (currentRoom.vectorid <rooms.size()-1){
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).vectorid==(currentRoom.vectorid+1)){
                            org.dolphin.game.Game.thegame.bsInput.refresh();
                            currentRoom.setinvisible();
				currentRoom=rooms.get(i);
                                currentRoom.setvisible();
                                throw new RoomChangedException();
                        }}
        } else {
        JOptionPane.showMessageDialog(frame,"Error reached the last room can't go any further! Check first!");
        }
	}
	
	/*
	 * Go to the previous room
	 */
	public static void previousRoom() throws RoomChangedException{
            
		if (currentRoom.vectorid !=0){
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).vectorid==(currentRoom.vectorid-1)){
                            org.dolphin.game.Game.thegame.bsInput.refresh();
                                currentRoom.setinvisible();
				currentRoom=rooms.get(i);
                                currentRoom.setvisible();
		throw new RoomChangedException();
                        }}
                }else {
                JOptionPane.showMessageDialog(frame,"Error reached the first room can't go any further! Check first!");
                }
	}

        /*
         * Restart the current room
         */
        public static void currentRoom() throws RoomChangedException{
            org.dolphin.game.Game.thegame.bsInput.refresh();
                                currentRoom.setinvisible();
				currentRoom=rooms.get(currentRoom.vectorid);
                                currentRoom.setvisible();
		throw new RoomChangedException();
        }

	/*
	 * The main method used for calling the game
	 */
	public static void main(java.lang.String[] args) {
		parameter_count = args.length;
		parameters = args;
		gameType = "Application";

		try {
			setupGame();
			game.start();
		} catch (Exception e) {

			/*
			 * Display any Exceptions that occur during the game
			 */
			final Writer result = new StringWriter();
			final PrintWriter printWriter = new PrintWriter(result);
			e.printStackTrace(printWriter);
			Clipboard.setText(new org.dolphin.game.api.types.String(("" + result.toString() + Clipboard.getText())));
			JOptionPane
					.showMessageDialog(null,"Error: "
									+ e
									+ ", "
									+ e.getMessage()
									+ ". \n Stack trace:"
									+ result.toString()
									+ "\n \n The Error has been added to clipboard, just before the previous contents of the clipboard. \n Please contact the G-Java development team for help. http://forums.g-java.com");
			System.out.println("Exception:"+result.toString());
			System.exit(1); // Exit the game
		}

	}

         }
    
