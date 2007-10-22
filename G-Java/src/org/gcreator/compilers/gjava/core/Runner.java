package org.gcreator.compilers.gjava.core;

import org.gcreator.compilers.gjava.core.*;
import java.awt.*;
import javax.swing.
// the main runner class file
*;

// the main runner class file
/**
 * Runner Object
 * @author G-Java development team
 * @version 1.0
 */
public class Runner extends Panel
	{

	// boolean loading;

	/**
	 * Create a new Runner object
	 */
	public Runner()
		{
		
		}

//	public void loadgame()
//		{
//		
//		}

	private static DisplayMode[] PreferredModes = new DisplayMode[] { new DisplayMode(800,600,32,0),
			new DisplayMode(800,600,16,0),new DisplayMode(800,600,8,0) };

	// ////////////////////////////////////////////////
	// This method finds the best matching full screen mode from the array above that is
	// supported on this system.
	// ///////////////////////////////////////////////////

	public DisplayMode bestmode(GraphicsDevice gd)
		{
		// Get the list of supported modes on this system

		DisplayMode[] modes = gd.getDisplayModes();

		// For every mode we'd prefer to use...

		for (int j = 0; j < PreferredModes.length; j++)
			{
			// ...we check it against each mode the system supports...

			for (int i = 0; i < modes.length; i++)
				{
				// ...and if we find a matching entry we return it.

				if (modes[i].getWidth() == PreferredModes[j].getWidth()
						&& modes[i].getHeight() == PreferredModes[j].getHeight()
						&& modes[i].getBitDepth() == PreferredModes[j].getBitDepth()) return PreferredModes[j];
				}
			}

		// ...we couldn't find a matching mode, return null.

		return null;
		}

	public void hidecursor(JFrame Room)
		{
		if (basicgame.Runningas != "EApplet")
			{
			// FIX later! TODO
			// Image cursorImage = new ImageIcon(getClass().getResource("blank.png")).getImage();
			// Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point( 0, 0), ""
			// );
			// Room.setCursor( blankCursor );
			}
		}

	public void showcursor()
		{
		setCursor(null);
		}

	}

class StartPanel extends JPanel
	{
	// public static sprite[] sprite = new sprite[9];
	//public static Frame loadingframe;

	//public static JFrame room;// = new Room(332,92,true, Color.black);

	//public JFrame f;

	//Image img;

	boolean loading = false, loading_image = false;

	public Image Filled, loadingImage, Nonfilled, GIcon;

	// Image GIcon; //= new ImageIcon("game.png").getImage();

	StartPanel(Frame loadingframe,boolean loading_image)
		{
loading = false;
		play_game();
		//this.loadingframe = loadingframe;
		//this.loading_image = loading_image;

		// set the game icon
		/*if (GameSettings.injar == false)
			{
			GIcon = new ImageIcon("icon.png").getImage();
			}
		else
			{
			GIcon = new ImageIcon(getClass().getResource("loading.png")).getImage();
			}*/

		// room.setIconImage(GIcon);
		// Filled = new ImageIcon("Filled.png").getImage();
		//loadingImage = new ImageIcon(getClass().getResource("loading.png")).getImage();
		// Nonfilled = new ImageIcon("Nonfilled.png").getImage();
		//loading = true;

		}

	// StartPanel(Frame loadingframe, boolean loading_image, URL u) {
	// this.loadingframe = loadingframe;
	// this.loading_image = loading_image;

	// GIcon = new ImageIcon(new URL(u, "icon.png")).getImage();
	// GIcon = new ImageIcon(getClass().getResource("icon.png")).getImage();
	// GIcon = new ImageIcon(getClass().getResource("icon.png") ).getImage();

	// this.room.setIconImage(GIcon);
	// loadingImage = new ImageIcon(getClass().getResource("loading.png")).getImage();

	// Nonfilled = new ImageIcon(getClass().getResource("Nonfilled.png")).getImage();

	// try {

	// Filled = new ImageIcon(new URL(u, "Filled.png")).getImage();
	// } catch (MalformedURLException ex) {}
	// loading = true;
	// }

	public void paint(Graphics g)
		{
                loading = false;
		play_game();
		// if the game is loading
		if (loading)
			{

			if (loading_image == true)
				{
				// the loading part of the game
				// g.drawString("it is supposed to be working",(size().width-w)/2,130);

				g.drawImage(loadingImage,0,0,null);

				/*
				 * g.drawImage(Nonfilled,20,62,null); g.drawImage(Nonfilled,52,62,null);
				 * g.drawImage(Nonfilled,84,62,null); g.drawImage(Nonfilled,116,62,null);
				 * g.drawImage(Nonfilled,148,62,null); g.drawImage(Nonfilled,180,62,null);
				 * g.drawImage(Nonfilled,212,62,null); g.drawImage(Nonfilled,244,62,null);
				 * g.drawImage(Nonfilled,276,62,null); g.drawImage(Filled,0,0,null);
				 */
				// now draw the staus bar
				// load the sprites
				//basicgame.load_Sprites();
				//basicgame.load_Sounds();

				// load all backgrounds here
				//basicgame.load_Backgrounds();
				//basicgame.load_Paths();
				//basicgame.load_Fonts();
				//basicgame.load_Timelines();
				play_game();
				}
			else
				{

				// display the normal loading image
				g.drawImage(loadingImage,0,0,null);
				g.drawImage(Nonfilled,20,62,null);
				g.drawImage(Nonfilled,52,62,null);
				g.drawImage(Nonfilled,84,62,null);
				g.drawImage(Nonfilled,116,62,null);
				g.drawImage(Nonfilled,148,62,null);
				g.drawImage(Nonfilled,180,62,null);
				g.drawImage(Nonfilled,212,62,null);
				g.drawImage(Nonfilled,244,62,null);
				g.drawImage(Nonfilled,276,62,null);

				// load the sprites
				//basicgame.load_Sprites();

				// g.drawImage(basicgame.pics,275,50, null);
				g.drawImage(Filled,20,62,null);
				//basicgame.load_Sounds();

				// load all sounds here
				g.drawImage(Filled,52,62,null);

				// load all backgrounds here
				//basicgame.load_Backgrounds();
				g.drawImage(Filled,84,62,null);
				
				//load paths
				//basicgame.load_Paths();

				// load all Fonts here
				//basicgame.load_Fonts();
				g.drawImage(Filled,116,62,null);
				
				//load timelines
				//basicgame.load_Timelines();
				
				// load all Objects here
				// basicgame.load_Objects();
				g.drawImage(Filled,116,62,null);

				// hide the loading screen
				// loadingframe.hide();
				// loadingframe.dispose();
				loading = false;
				play_game();

				}
			}
		// return;
		}

	void play_game()
		{
//System.out.println("Play game");
		//JFrame room = new Room(332,92,true,Color.black);
		// f.addMouseListener(new room0(f));
		// Room.center(this.room);
		// f.show(true);
		// removeAll();
		// this.Room.setTitle("Game Name");
		// paint(getGraphics());

		// f.setSize(512+f.insets().left+f.insets().right,
		// 482+f.insets().top+f.insets().bottom);
		//room.remove(this);
		//
		// room.getContentPane().add("Center",new load_Rooms(0));
		// z.init();
		new load_Rooms(0);

		// f.validate();

		}

	}
