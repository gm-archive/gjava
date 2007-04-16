package org.gjava.runner;

import java.awt.*;

import javax.swing.*;
import java.util.*;

public class RoomPanel extends JPanel implements Runnable
	{
	// the start time
	long starttime = System.currentTimeMillis(), usedTime;

	// number of instances and tiles for depth
	int createno = 1; // the number of created tiles and objects

	// room variables
	public static int Width, Height, backvspeed, backhspeed;

	int i = 1, NumberX, NumberY;

	static int ii = 0;

	// the jframe
	JFrame Room;

	// booleans
	public boolean Paused = false, show_score = true, show_lives = false, show_health = false;

	// room captions
	public static String score_caption = "score:", lives_caption = "lives:", health_caption = "health:";

	// the current vector id
	public int instance_id;

	/*
	 * Background variables
	 */
	public int hspeed[] = new int[8];

	public int vspeed[] = new int[8];

	public int Rbackgrounds[] = new int[8];

	public int visible[] = new int[8];

	public int Xpos[] = new int[8];

	public int Ypos[] = new int[8];

	public int TileH[] = new int[8];

	public int TileV[] = new int[8];

	public int Xc[] = new int[8];// 0 = 0, Xc1 = 0, Xc2 = 0, Xc3 = 0, Xc4 = 0, Xc5 = 0, Xc6 = 0, Xc7 = 0;

	public int Yc[] = new int[8];// 0 = 0, Yc1 = 0, Yc2 = 0, Yc3 = 0, Yc4 = 0, Yc5 = 0, Yc6 = 0, Yc7 = 0;

	// the instances vector
	public Vector instances = new Vector();

	public Vector depth = new Vector();

	// Vector of tiles;
	public static Vector tiles = new Vector();

	int j = 0;

	public Objects object;

	// public ListIterator iter;
	public String Caption;

	public int id = 0, roomid = 0;

	// the fps
	public static long past_time, next_second, room_speed = 1;

	// used for double buffering
	private Image dbImage;

	private Graphics dbg;

	int k = 1;

	int ScreenWidth;

	int ScreenHeight;

	// if the game is running
	public static boolean Running = true;

	// //////////////////////////////////////////////////////////////////////
	// Frames per second code:
	// /////////////////////////////////////////////////////////////////////
	private int period; // period between drawing in _ms_

	private static final int NO_DELAYS_PER_YIELD = 16;

	private static long MAX_STATS_INTERVAL = 1000L;

	// ^^record stats every 1 second (roughly)
	private static int MAX_FRAME_SKIPS = 5; // was 2;

	// ^^no. of frames that can be skipped in any one animation loop
	// i.e the games state is updated but not rendered
	private long framesSkipped = 0L;

	private long totalFramesSkipped = 0L;

	private long frameCount = 0;

	private static int NUM_FPS = 10;

	// ^^number of FPS values stored to get an average

	// the fps/ups variables
	public double averageUPS = 0.0;

	public double averageFPS = 0.0;

	// used for gathering statistics
	private long statsInterval = 0L; // in ms

	private long prevStatsTime;

	private long totalElapsedTime = 0L;

	private long gameStartTime;

	private int timeSpentInGame = 0; // in seconds

	private long statsCount = 0;

	// /////////////////////////////////////////////////////////////////////
	// end of FPS code
	// /////////////////////////////////////////////////////////////////////

	// room variables
	public int room_height;

	public int room_width;

	// use runner class
	Runner runr = new Runner();

	// game settings
	GameSettings gs = new GameSettings();

	// all the stuff
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

	GraphicsDevice gd = ge.getDefaultScreenDevice();

	GraphicsConfiguration gc = gd.getDefaultConfiguration();

	DisplayMode dm = runr.bestmode(gd);

	public Color backcolor = Color.green;

	// end of declaring variables

	public RoomPanel()
		{

		}

	public RoomPanel(JFrame R,String Caption,long fps,int RoomW,int RoomH,Color backcolor)
		{
		// basicgame.Current_room = this;
		// the constructor method
		// setBounds(R.x/2,R.y/2);
		basicgame.Current_room = this;
		this.room_speed = fps;
		this.Room = R;
		this.ScreenWidth = RoomW;
		this.ScreenHeight = RoomH;
		this.room_height = RoomH;
		this.room_width = RoomW;
		this.Width = RoomW + 7;
		this.Height = RoomH + 25;
		this.backcolor = backcolor;
		this.Caption = Caption;
		this.period = (int) (1000.0 / room_speed);
		if (basicgame.Runningas != "EApplet")
			{
			totalElapsedTime = System.currentTimeMillis();
			R.setSize(640,620);
			}
		this.setSize(RoomW,RoomH);
		// Room.setSize(ScreenWidth,ScreenHeight);
		// this.setX(0);
		// room creation code
		Creation_code();

		if (gs.DisplayCursor == 0)
			{

			// hide the cursor
			runr.hidecursor(Room);
			}

		if (basicgame.Runningas != "EApplet")
			{
			// room caption
			Room.setTitle(Caption);

			}

		if (dm == null || gd.isFullScreenSupported() == false)
			{
			gs.FullScreenMode = 0;
			}

		if ((gs.FullScreenMode == 1) && (basicgame.Runningas != "EApplet"))
			{
			// Room.setUndecorated( true ); // No window decorations
			gd.setFullScreenWindow(Room); // Create a full screen window
			gd.setDisplayMode(dm); // Change to our preferred mode

			}
		setup_Room();
		// define a new thread
		Thread th = new Thread(this);
		// start this thread
		th.start();

		}

	public void Draw(Graphics g)
		{
		}

	public void SortDepth()
		{
		depth.addAll(instances);
		java.util.Collections.sort(depth,Collections.reverseOrder());
		depth.trimToSize();
		}

	public Objects get_instance(int ii)
		{
		Objects t = (Objects) instances.get(ii);
		return t;
		}

	public void Update_caption()
		{
		// update the jframe caption
		String local_caption = Caption;
		if (GameSettings.show_score)
			local_caption = local_caption + " " + GameSettings.score_caption + Functions.score;

		if (GameSettings.show_lives)
			local_caption = local_caption + " " + GameSettings.lives_caption + Functions.lives;

		if (GameSettings.show_health)
			local_caption = local_caption + " " + GameSettings.health_caption + Functions.health;

		if (basicgame.Runningas == "EApplet")
			{
			// use the statusbar as caption
			basicgame.Eapplet.showStatus("" + local_caption);
			}
		else
			{

			Room.setTitle("" + local_caption);
			}
		}

	public int collsion_at_position(int x,int y,boolean solid)
		{
		// this returns 1 if there is a collsion at a position
		ii = 0;
		while (ii < instances.size())
			{
			Objects o = (Objects) instances.get(ii);
			if (o.solid == 1)
				{

				}
			}
		return 0;
		}

	/** Update - Method, implements double buffering */
	public void paint(Graphics g)
		{
		// this.setBounds(Room.getWidth()/2- this.getWidth()/2,Room.getHeight()/2-this.getHeight()/2, 700, 600);

		// setPreferredSize (ScreenWidth,ScreenHeight);
		// initialize buffer
		if (dbImage == null)
			{

			dbImage = createImage(ScreenWidth,ScreenHeight);
			dbg = dbImage.getGraphics();
			// dbg = bufferStrategy.getDrawGraphics();
			}

		// clear screen in background
		// dbg.setColor (getBackground ());
		// dbg.setColor (Color.red);
		// dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);
		// dbg.fillRect (0, 0, ScreenWidth, ScreenHeight);

		// draw elements in background
		// dbg.setColor (getForeground());
		Draw(dbg);

		// draw image on the screen
		g.drawImage(dbImage,0,0,this);

		// Room.setSize(10, ScreenHeight);

		}

	public void Creation_code()
		{
		// JOptionPane.showMessageDialog(null,"creation code");

		}

	public void Setup_Backgrounds()
		{
		// setup the backgrounds here

		for (int subi = 0; subi < 8; subi++)
			{

			do
				{
				Xpos[subi] -= basicgame.background[Rbackgrounds[subi]].back_width;
				}
			while (Xpos[subi] > 0);
			do
				{
				Ypos[subi] -= basicgame.background[Rbackgrounds[subi]].back_height;
				}
			while (Ypos[subi] > 0);
			}
		}

	public void update_room()
		{
		// this will be called if it is skipping a frame
		int dd = 0;
		while (dd < instances.size())
			{
			this.instance_id = dd;
			Objects o = (Objects) instances.get(dd);
			o.Begin_Step_event();
			if ((o.X <= -1) || (o.X >= basicgame.Current_room.Width + 1) || (o.Y <= -1)
					|| (o.Y >= basicgame.Current_room.Height + 1))
				{
				o.Outside();
				}
			o.Keyboard_event();
			o.Move();
			o.Collision_event();
			// o.Draw_event(g);
			o.End_Step_event();
			dd++;
			}
		dd = 0;
		}

	public void setup_Room()
		{
		// create all the objects backgrounds tiles etc
		// Vector v = new Vector(30);

		}

	private void storeStats()
	/*
	 * The statistics: - the summed periods for all the iterations in this interval (period is the amount of
	 * time a single frame iteration should take), the actual elapsed time in this interval, the error between
	 * these two numbers; - the total frame count, which is the total number of calls to run(); - the frames
	 * skipped in this interval, the total number of frames skipped. A frame skip is a game update without a
	 * corresponding render; - the FPS (frames/sec) and UPS (updates/sec) for this interval, the average FPS &
	 * UPS over the last NUM_FPSs intervals. The data is collected every MAX_STATS_INTERVAL (1 sec).
	 */
		{
		frameCount++;
		statsInterval += period;

		if (statsInterval >= MAX_STATS_INTERVAL)
			{ // record stats every MAX_STATS_INTERVAL
			long timeNow = System.currentTimeMillis();
			timeSpentInGame = (int) ((timeNow - gameStartTime) / 1000L); // ms --> secs
			// wcTop.setTimeSpent( timeSpentInGame );

			long realElapsedTime = timeNow - prevStatsTime; // time since last stats collection
			totalElapsedTime += realElapsedTime;

			// double timingError =
			// ((double)(realElapsedTime - statsInterval) / statsInterval) * 100.0;

			totalFramesSkipped += framesSkipped;

			double actualFPS = 0; // calculate the latest FPS and UPS
			double actualUPS = 0;
			if (totalElapsedTime > 0)
				{
				actualFPS = (((double) frameCount / totalElapsedTime) * 1000L);
				actualUPS = (((double) (frameCount + totalFramesSkipped) / totalElapsedTime) * 1000L);
				}

			// store the latest FPS and UPS
			// fpsStore[ (int)statsCount%NUM_FPS ] = actualFPS;
			// upsStore[ (int)statsCount%NUM_FPS ] = actualUPS;
			statsCount = statsCount + 1;

			double totalFPS = 0.0; // total the stored FPSs and UPSs
			double totalUPS = 0.0;
			// for (int i=0; i < NUM_FPS; i++) {
			// totalFPS += fpsStore[i];
			// totalUPS += upsStore[i];
			// }

			if (statsCount < NUM_FPS)
				{ // obtain the average FPS and UPS
				averageFPS = totalFPS / statsCount;
				averageUPS = totalUPS / statsCount;
				}
			else
				{
				averageFPS = totalFPS / NUM_FPS;
				averageUPS = totalUPS / NUM_FPS;
				}

			framesSkipped = 0;
			prevStatsTime = timeNow;
			statsInterval = 0L; // reset
			}
		} // end of storeStats()

	public void run()
		{

		long beforeTime, afterTime, timeDiff, sleepTime;
		int overSleepTime = 0;
		int noDelays = 0;
		int excess = 0;

		// set the beforetime
		beforeTime = System.currentTimeMillis();
		// set the period of time
		// period = (int) (1000.0/room_speed);

		// main loop
		while (Running)
			{
			if (Paused == false)
				{

				// do a step
				repaint();

				// fps limiting code
				afterTime = System.currentTimeMillis();
				timeDiff = afterTime - beforeTime;
				sleepTime = (period - timeDiff) - overSleepTime;

				if (sleepTime > 0)
					{ // some time left in this cycle
					try
						{
						Thread.sleep(sleepTime); // already in ms
						}
					catch (InterruptedException ex)
						{
						}
					overSleepTime = (int) ((System.currentTimeMillis() - afterTime) - sleepTime);
					}
				else
					{ // sleepTime <= 0; the frame took longer than the period
					excess -= sleepTime; // store excess time value
					overSleepTime = 0;

					if (++noDelays >= NO_DELAYS_PER_YIELD)
						{
						Thread.yield(); // give another thread a chance to run
						noDelays = 0;
						}
					}
				beforeTime = System.currentTimeMillis();

				/*
				 * If frame animation is taking too long, update the game state without rendering it, to get the
				 * updates/sec nearer to the required FPS.
				 */
				int skips = 0;
				while ((excess > period) && (skips < MAX_FRAME_SKIPS))
					{
					excess -= period;
					// update_room(); // update state but don't draw
					skips++;
					}
				framesSkipped += skips;
				// store the fps and ups
				storeStats();

				// end of running loop
				}
			// end of if paused
			}
		}

	}