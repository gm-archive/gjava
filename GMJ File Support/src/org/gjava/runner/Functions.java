//Functions.java by gm_guru www.g-java.uni.cc
package org.gjava.runner;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import javax.swing.*;

import java.util.*;

//import java.util.Calendar.*;

//import java.util.Calendar.*;

//import java.util.Calendar.*;

//import java.util.Calendar.*;

public class Functions
	{

	private Clipboard systemClipboard;

	public static Vector variable_n = new Vector();

	public static Vector variable_v = new Vector();

	public static int jii;

	public static String score = "0";

	public static int lives = 5;

	public static int health = 100;

	public static Objects dt;

	public static JFrame messagebox = new Room(320,140,false,Color.black);

	public static JLabel text;

	public static Image backImage;

	public static double PI = 3.14159265516355584;

	private static Calendar then;

	private static final int dateConvert = 86400000;

	Functions()
		{
		Setup_Functions();
		load_image();
		}

	public static int random(int number)
		{
		// the random function
		Random rnd = new Random();
		number = (rnd.nextInt(number));
		return number;
		}

	public static void game_save(String savFilename)
		{

		// File savefile = (File)getClass().getResourceAsStream(savFilename);
		// File savefile = new File((String)(getClass().getResource(savFilename)));
		// OutputStream os = new OutputStream();
		// RandomAccessFile((File)savefile,)
		}

	public static void game_load(String savFilename)
		{

		}

	public static int action_get_number(int action_object)
		{
		// get the number of instances as a value
		int no_of_instances = 0;
		jii = 0;
		while (jii < basicgame.Current_room.instances.size())
			{
			dt = (Objects) basicgame.Current_room.instances.get(jii);
			if (dt.id == action_object)
				{
				// add onto the number of instances
				no_of_instances = no_of_instances + 1;

				}
			jii++;
			}
		return no_of_instances;
		}

	/*
	 * public static int min(int... args) { int mini = 0; mini = args[0]; for (int i = 0; i < args.length; i++) {
	 * mini = Math.min(mini,args[i]); } return mini; }
	 */// Can't be used below 1.5 :(
	/*
	 * public static int max(int... args) { int maxi = 0; maxi = args[0]; for (int i = 0; i < args.length; i++) {
	 * maxi = Math.max(maxi,args[i]); } return maxi; }
	 */

	public static void end_game()
		{
		// end the game
		if (basicgame.Runningas == "Application")
			{
			// close the application
			System.exit(0);
			}
		else
			{
			// close the applet
			if (basicgame.Runningas == "EApplet")
				{
				basicgame.Eapplet.stop();
				}
			else
				{
				load_Rooms.remove_room(basicgame.Current_room.id);
				}
			}

		}

	public void load_image()
		{
		backImage = new ImageIcon(getClass().getResource("dialog.png")).getImage();

		}

	public void set_native()
		{
		try
			{
			// Tell the UIManager to use the platform look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
		catch (Exception e)
			{
			// Do nothing
			}
		}

	public static boolean action_if_question(String message)
		{
		// return true if the answer is yes
		MessageBox box = new MessageBox();
		/* boolean iii = */box.action_if_question(message);
		return true;

		}

	public static void show_message(String str)
		{
		// show a message

		// pause the room
		basicgame.Current_room.Paused = true;

		// show the message box
		// Room.center(messagebox);
		// JPanel messagepanel = new messagepanel(str);
		// JButton Ok = new JButton("OK");
		// messagebox.add(new Button("OK"), new Rectangle(0,4,1,1));
		// messagepanel.add_OK();
		// Ok.setLocation(150,90);
		// messagebox = load_Rooms.Room;
		// messagebox.getContentPane().add(BorderLayout.CENTER, messagepanel);
		// messagebox.show();

		MessageBox.show_message(str);
		basicgame.Current_room.Paused = false;
		}

	public static double round(double value,int decimalPlace)
		{
		double power_of_ten = 1;
		while (decimalPlace-- > 0)
			power_of_ten *= 10.0;
		return Math.round(value * power_of_ten) / power_of_ten;
		}

	public static boolean place_empty(double x,double y)
		{
		jii = 0;
		while (jii < basicgame.Current_room.instances.size())
			{
			dt = (Objects) basicgame.Current_room.instances.get(jii);
			Rectangle thisBounds = dt.getBounds((int) dt.X,(int) dt.Y);

			if (thisBounds.contains(x,y))
				{
				return false;
				}
			else
				{
				jii++;
				}
			}
		return true;
		}

	public static boolean place_free(double x,double y)
		{
		jii = 0;
		while (jii < basicgame.Current_room.instances.size())
			{
			dt = (Objects) basicgame.Current_room.instances.get(jii);
			Rectangle thisBounds = dt.getBounds((int) dt.x,(int) dt.y);

			if ((thisBounds.contains(x,y)) && (dt.solid == 1))
				{
				return false;
				}
			else
				{
				jii++;
				}
			}
		return true;
		}

	public static void set_global_variable(String variablename,String value)
		{
		// global variables for the game
		variable_n.add(0,variablename);
		variable_v.add(0,value);
		}

	public static String get_global_variable(String variablename)
		{
		String value = "0";
		int ii = 0;
		while (ii <= (variable_n.size()))
			{
			String o = (String) variable_n.get(ii);
			if (o == variablename)
				{
				value = (String) variable_v.get(ii);
				}
			}

		return value;
		}

	public static void openURL(String url)
		{
		String osName = System.getProperty("os.name");
		try
			{
			if (osName.startsWith("Mac OS"))
				{
				Class fileMgr = Class.forName("com.apple.eio.FileManager");
				Method openURL = fileMgr.getDeclaredMethod("openURL",new Class[] { String.class });
				openURL.invoke(null,new Object[] { url });
				}
			else if (osName.startsWith("Windows"))
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			else
				{ // assume Unix or Linux
				String[] browsers = { "firefox","opera","konqueror","epiphany","mozilla","netscape" };
				String browser = null;
				for (int count = 0; count < browsers.length && browser == null; count++)
					if (Runtime.getRuntime().exec(new String[] { "which",browsers[count] }).waitFor() == 0)
						browser = browsers[count];
				if (browser == null)
					throw new Exception("Could not find web browser");
				else
					Runtime.getRuntime().exec(new String[] { browser,url });
				}
			}
		catch (Exception e)
			{
			JOptionPane.showMessageDialog(null,"Error attempting to launch web browser:\n"
					+ e.getLocalizedMessage());
			}
		}

	// global java variables

	private void Setup_Functions()
		{
		// in some initializing method or constructor
		then = Calendar.getInstance();
		// Time used by GM to base the datetime off of
		then.set(1899,11,29,22,59,34);

		// setup clipboard
		if (basicgame.Runningas != "EApplet") systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		}

	// the date functions/methods
	public static double date_current_datetime()
		{
		Calendar now = Calendar.getInstance();
		long milis = now.getTime().getTime() - then.getTime().getTime();
		// convert milis to days
		return milis / (double) dateConvert;
		}

	public static double date_current_date()
		{
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY,0);
		now.set(Calendar.MINUTE,0);
		now.set(Calendar.SECOND,0);
		long milis = now.getTime().getTime() - then.getTime().getTime();
		// convert milis to days
		return milis / (double) dateConvert;
		}

	public static double date_current_time()
		{
		Calendar now = Calendar.getInstance();
		now.set(Calendar.YEAR,then.get(Calendar.YEAR));
		now.set(Calendar.MONTH,then.get(Calendar.MONTH));
		now.set(Calendar.DATE,then.get(Calendar.DATE));
		long milis = now.getTime().getTime() - then.getTime().getTime();
		// convert milis to days
		return milis / (double) dateConvert;
		}

	public static double date_create_datetime(double y,double m,double d,double h,double min,double s)
		{
		Calendar nDate = Calendar.getInstance();
		nDate.set((int) y,(int) m - 1,(int) d,(int) h,(int) min,(int) s);
		long milis = nDate.getTime().getTime() - then.getTime().getTime();
		return milis / (double) dateConvert;
		}

	public static double date_create_date(double y,double m,double d)
		{
		Calendar nDate = Calendar.getInstance();
		nDate.set((int) y,(int) m,(int) d,0,0,0);
		long milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_create_time(double h,double m,double s)
		{
		Calendar nDate = Calendar.getInstance();
		nDate.set(then.get(Calendar.YEAR),then.get(Calendar.MONTH),then.get(Calendar.DATE),(int) h,(int) m,
				(int) s);
		long milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_valid_datetime(double y,double m,double d,double h,double min,double s)
		{
		if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
		if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
		if (d - Math.floor(d) != 0) return 0;
		if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
			return 0;
		else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
			return 0;
		else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
		if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
		if (min < 0 || min >= 60 || min - Math.floor(min) != 0) return 0;
		if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
		return 1;
		}

	public static double date_valid_date(double y,double m,double d)
		{
		if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
		if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
		if (d - Math.floor(d) != 0) return 0;
		if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
			return 0;
		else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
			return 0;
		else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
		return 1;
		}

	public static double date_valid_time(double h,double m,double s)
		{
		if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
		if (m < 0 || m >= 60 || m - Math.floor(m) != 0) return 0;
		if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
		return 1;
		}

	public static double date_inc_year(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.YEAR,nDate.get(Calendar.YEAR) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_month(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.MONTH,nDate.get(Calendar.MONTH) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_week(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + 7 * (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_day(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_hour(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.HOUR_OF_DAY,nDate.get(Calendar.HOUR_OF_DAY) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_minute(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.MINUTE,nDate.get(Calendar.MINUTE) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_inc_second(double d,double a)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		nDate.set(Calendar.SECOND,nDate.get(Calendar.SECOND) + (int) a);
		milis = nDate.getTime().getTime() - then.getTime().getTime();
		;
		return milis / (double) dateConvert;
		}

	public static double date_get_year(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.YEAR);
		}

	public static double date_get_month(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.MONTH);
		}

	public static double date_get_week(double d) // Figure out week
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.DATE);
		}

	public static double date_get_day(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.DATE);
		}

	public static double date_get_hour(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.HOUR_OF_DAY);
		}

	public static double date_get_minute(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.MINUTE);
		}

	public static double date_get_second(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.SECOND);
		}

	public static double date_get_weekday(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.DAY_OF_WEEK);
		}

	public static double date_get_day_of_year(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		int fin = 0;
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.get(Calendar.DAY_OF_YEAR);
		}

	public static double date_get_hour_of_year(double d)
		{
		int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		int fin = 0;
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
		for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
			fin += days[i];
		int date = nDate.get(Calendar.DATE) + fin - 1;
		return nDate.get(Calendar.HOUR_OF_DAY) + date * 24;
		}

	public static double date_get_minute_of_year(double d)
		{
		int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		int fin = 0;
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
		for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
			fin += days[i];
		int date = nDate.get(Calendar.DATE) + fin - 1;
		int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
		return nDate.get(Calendar.MINUTE) + hour * 60;
		}

	public static double date_get_second_of_year(double d)
		{
		int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		int fin = 0;
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
		for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
			fin += days[i];
		int date = nDate.get(Calendar.DATE) + fin - 1;
		int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
		int min = nDate.get(Calendar.MINUTE) - 1 + hour * 60;
		return nDate.get(Calendar.SECOND) + min * 60;
		}

	public static double date_year_span(double d1,double d2)
		{
		return d1 * 365.25 - d2 * 365.25;
		}

	public static double date_month_span(double d1,double d2)
		{
		return date_get_month(d1) - date_get_month(d2);
		}

	public static double date_week_span(double d1,double d2)
		{
		return date_get_week(d1) - date_get_week(d2);
		}

	public static double date_day_span(double d1,double d2)
		{
		return date_get_day(d1) - date_get_day(d2);
		}

	public static double date_hour_span(double d1,double d2)
		{
		return date_get_hour(d1) - date_get_hour(d2);
		}

	public static double date_minute_span(double d1,double d2)
		{
		return date_get_minute(d1) - date_get_minute(d2);
		}

	public static double date_second_span(double d1,double d2)
		{
		return date_get_second(d1) - date_get_second(d2);
		}

	public static double date_compare_datetime(double d1,double d2)
		{
		return (d1 > d2 ? 1 : (d1 < d2 ? -1 : 0));
		}

	public static double date_compare_date(double d1,double d2)
		{
		return (Math.floor(d1) > Math.floor(d2) ? 1 : (Math.floor(d1) < Math.floor(d2) ? -1 : 0));
		}

	public static double date_compare_time(double d1,double d2)
		{
		return (frac(d1) > frac(d2) ? 1 : (frac(d1) < frac(d2) ? -1 : 0));
		}

	public static double date_date_of(double d)
		{
		return Math.floor(d);
		}

	public static double date_time_of(double d)
		{
		return frac(d);
		}

	public static String date_datetime_string(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.toString();
		}

	public static String date_date_string(double d)
		{
		long milis = (int) (Math.floor(d) * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return nDate.toString();
		}

	public static String date_time_string(double d)
		{
		long milis = (int) (frac(d) * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(milis);
		return nDate.toString();
		}

	public static double date_days_in_month(double d)
		{
		int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
		return days[nDate.get(Calendar.MONTH) - 1];
		}

	public static double date_days_in_year(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		if (nDate.get(Calendar.YEAR) % 4 == 0)
			return 366;
		else
			return 365;
		}

	public static double date_leap_year(double d)
		{
		long milis = (int) (d * dateConvert);
		long time = then.getTime().getTime();
		Calendar nDate = Calendar.getInstance();
		nDate.setTimeInMillis(time + milis);
		return (nDate.get(Calendar.YEAR) % 4 == 0 ? 1 : 0);
		}

	public static double date_is_today(double d)
		{
		return (date_current_date() == date_date_of(d) ? 1 : 0);
		}

	public static double frac(double fracno)
		{
		Double d = new Double(fracno);
		fracno = Double.parseDouble(d.toString().substring(d.toString().indexOf('.'),d.toString().length()));
		return fracno;
		}

	public double clipboard_has_text()
		{
		Transferable clipboardContents = systemClipboard.getContents(null);
		return (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor) ? 1 : 0);
		}

	public String clipboard_get_text()
		{
		Transferable clipboardContents = systemClipboard.getContents(null);
		if (clipboardContents == null)
			{
			return "";
			}
		else
			try
				{
				if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor))
					{
					String returnText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
					return returnText;
					}
				}
			catch (UnsupportedFlavorException ufe)
				{
				}
			catch (IOException ioe)
				{
				}
		return "";
		}

	public double clipboard_set_text(String s)
		{
		Transferable transferableText = new StringSelection(s);
		systemClipboard.setContents(transferableText,null);
		return 0;
		}

	public double random(double x)
		{
		return Math.random() * x;
		}

	public double sign(double x)
		{
		return (x < 0 ? -1 : (x > 0 ? 1 : 0));
		}

	public double sqr(double x)
		{
		return x * x;
		}

	public double log2(double x)
		{
		return Math.log(x) / Math.log(2);
		}

	public double log10(double x)
		{
		return Math.log(x);
		}

	public double logn(double n,double x)
		{
		return Math.log(x) / Math.log(n);
		}

	public double min(double v1,double v2)
		{
		return Math.min(v1,v2);
		}

	public double min(double v1,double v2,double v3)
		{
		return min(v3,min(v1,v2));
		}

	public double min(double v1,double v2,double v3,double v4)
		{
		return min(v4,min(v3,min(v1,v2)));
		}

	public double min(double v1,double v2,double v3,double v4,double v5)
		{
		return min(v5,min(v4,min(v3,min(v1,v2))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6)
		{
		return min(v6,min(v5,min(v4,min(v3,min(v1,v2)))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
		{
		return min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
		{
		return min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
		{
		return min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va)
		{
		return min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb)
		{
		return min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc)
		{
		return min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd)
		{
		return min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve)
		{
		return min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,
				min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf)
		{
		return min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,
				v2))))))))))))));
		}

	public double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
		{
		return min(vg,min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,
				min(v1,v2)))))))))))))));
		}

	public double max(double v1,double v2)
		{
		return Math.max(v1,v2);
		}

	public double max(double v1,double v2,double v3)
		{
		return max(v3,max(v1,v2));
		}

	public double max(double v1,double v2,double v3,double v4)
		{
		return max(v4,max(v3,max(v1,v2)));
		}

	public double max(double v1,double v2,double v3,double v4,double v5)
		{
		return max(v5,max(v4,max(v3,max(v1,v2))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6)
		{
		return max(v6,max(v5,max(v4,max(v3,max(v1,v2)))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
		{
		return max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
		{
		return max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
		{
		return max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va)
		{
		return max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb)
		{
		return max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc)
		{
		return max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd)
		{
		return max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve)
		{
		return max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,
				max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf)
		{
		return max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,
				v2))))))))))))));
		}

	public double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
		{
		return max(vg,max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,
				max(v1,v2)))))))))))))));
		}

	public double mean(double v1,double v2)
		{
		return (v1 + v2) / 2;
		}

	public double mean(double v1,double v2,double v3)
		{
		return (v1 + v2 + v3) / 3;
		}

	public double mean(double v1,double v2,double v3,double v4)
		{
		return (v1 + v2 + v3 + v4) / 4;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5)
		{
		return (v1 + v2 + v3 + v4 + v5) / 5;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6) / 6;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7) / 7;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8) / 8;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9) / 9;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va) / 10;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb) / 11;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc) / 12;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd) / 13;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve) / 14;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve + vf) / 15;
		}

	public double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,
			double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
		{
		return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve + vf + vg) / 16;
		}

	public double point_distance(double x1,double y1,double x2,double y2)
		{
		return Math.sqrt(sqr(x2 - x1) + sqr(y2 - y1));
		}

	public double point_direction(double x1,double y1,double x2,double y2)
		{
		if (y1 < y2 && x1 == x2)
			return 90;
		else if (y1 > y2 && x1 == x2) return 270;
		double basic = Math.atan((y1 - y2) / (x1 - x2));
		if (x1 < x2 && y1 > y2)
			return basic;
		else if (x1 > x2 && y1 > y2)
			return 90 + basic;
		else if (x1 > x2 && y1 < y2)
			return basic - 180;
		else
			return 360 + basic;
		}

	// String functions
	public String chr(double v)
		{
		return "" + (char) (int) v;
		}

	public double ord(String s)
		{
		return (int) s.charAt(0);
		}

	public double real(String s)
		{
		return Double.parseDouble(s);
		}

	public String string(double v)
		{
		return "" + v;
		}

	public String string_format(double v,double t,double d)
		{
		String form = "";
		for (int i = 0; i < (int) t; i++)
			form += "0";
		if (d > 0)
			{
			form += ".";
			for (int i = 0; i < (int) d; i++)
				form += "0";
			}
		DecimalFormat df = new DecimalFormat(form);
		return df.format(v,new StringBuffer(),null).toString();
		}

	public double string_length(String s)
		{
		return s.length();
		}

	public double string_pos(String sub,String s)
		{
		return (s.indexOf(sub) != -1 ? s.indexOf(sub) : 0);
		}

	public String string_copy(String s,double i,double c)
		{
		return s.substring((int) i,(int) (i + c));
		}

	public String string_char_at(String s,double i)
		{
		return "" + s.charAt((int) i);
		}

	public String string_delete(String s,double i,double c)
		{
		return s.substring(0,(int) i) + s.substring((int) (i + c));
		}

	public String string_insert(String sub,String s,double i)
		{
		return s.substring(0,(int) i) + sub + s.substring((int) i + 1);
		}

	public String string_replace(String s,String sub,String n)
		{
		return s.replaceFirst(sub,n);
		}

	public String string_replace_all(String s,String sub,String n)
		{
		return s.replaceAll(sub,n);
		}

	public double string_count(String sub,String s)
		{
		int c = 0;
		for (c = 0; s.indexOf(sub) != -1; c++)
			s.replaceFirst(sub,"");
		return c;
		}

	public String string_lower(String s)
		{
		return s.toLowerCase();
		}

	public String string_upper(String s)
		{
		return s.toUpperCase();
		}

	public String string_repeat(String s,double c)
		{
		for (int i = 0; i < c - 1; i++)
			s += s;
		return s;
		}

	public String string_letters(String s)
		{
		for (int i = 0; i < s.length(); i++)
			if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
					|| ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122))
				{
				}
			else
				{
				s.replaceFirst(s.charAt(i) + "","");
				i--;
				}
		return s;
		}

	public String string_digits(String s)
		{
		for (int i = 0; i < s.length(); i++)
			if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)
				{
				}
			else
				{
				s.replaceFirst(s.charAt(i) + "","");
				i--;
				}
		return s;
		}

	public String string_lettersdigits(String s)
		{
		for (int i = 0; i < s.length(); i++)
			if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
					|| ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)
					|| ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57))
				{
				}
			else
				{
				s.replaceFirst(s.charAt(i) + "","");
				i--;
				}
		return s;
		}

	}
