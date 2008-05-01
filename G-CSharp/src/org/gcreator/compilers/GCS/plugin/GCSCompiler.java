package org.gcreator.compilers.GCS.plugin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.gcreator.core.gcreator;
import org.gcreator.plugins.PluginHelper;

public class GCSCompiler extends JFrame implements Runnable,ActionListener
	{

	private static final long serialVersionUID = 1L;

	public static JTextArea textbox;
	
	public static JButton runapp;
	
	public static JButton runapplet;

	GCSCompiler()
		{
		super("G-C# compiler");
		getContentPane().setLayout(new FlowLayout());
		JLabel t;
		t = new JLabel(
				"<html>Welcome to the G-C# compiler! This will compile your game. Do not close the window unless it takes over an hour!");
		t.setPreferredSize(new Dimension(380,48));
		getContentPane().add(t);
		textbox = new JTextArea("Please wait while G-C# compiles your game");
		textbox.setLineWrap(true);
		textbox.setForeground(Color.red);
		textbox.setCaretPosition(textbox.getDocument().getLength());
		JScrollPane scroll = new JScrollPane(textbox,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBorder(BorderFactory.createBevelBorder(1));
		scroll.setPreferredSize(new Dimension(380,210));
		getContentPane().add(scroll);

		runapp = makeButton("Test Run (application)","Test the game as application","testapp");
		makeButton("Open Containing folder.","Open the folder containing your game.","open");
		
		runapp.setEnabled(false);
		
		setSize(390,360);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setIconImage(new ImageIcon(getClass().getResource("GJava.png")).getImage());
		setVisible(true);

		Thread th = new Thread(this);
		// start this thread
		th.start();

		}

	public JButton makeButton(String text,String tip,String command)
		{
		JButton b = new JButton(text);
		b.setToolTipText(tip);
		b.addActionListener(this);
		b.setActionCommand(command);
		return (JButton) getContentPane().add(b);
		}

        public int compile(String res)
        {
            File x = new File(".gcs");
            String g = "";
            try
        {
            FileReader r = new FileReader(x);
            r.read();
            int b;
            while((b = r.read())!=-1)
                g += (char) b;
        }
        catch(Exception e){}
            String command = "gmcs.bat";
            command += " -r:System.Drawing";
            command += " -r:System.Windows.Forms";
            command += " -r:SdlDotNet.dll";
            command += " -r:Tao.Sdl.dll";
            command += " -r:libGCS.dll";
            command += " -target:winexe";
            command += " -out:Game.exe";
            Enumeration<String> e = GCSharp.files.elements();
            while(e.hasMoreElements())
                command += " \"" + /*GCSharp.FileFolder +*/ e.nextElement() + "\"";
            PluginHelper.println(command);
            try{
                Process p = Runtime.getRuntime().exec(command, new String[]{}, new File(GCSharp.FileFolder));
                InputStream stderr = p.getErrorStream();
                InputStreamReader isr = new InputStreamReader(stderr);
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                while ( (line = br.readLine()) != null)
                    textbox.setText(textbox.getText()+line+"\n");
                int exitVal = p.waitFor();
            }
            catch(Exception ex){
                textbox.setText(textbox.getText()+ex.toString()+"\n");
            }
            textbox.setText(textbox.getText()+"Finished compiling\n");
            return 0;
        }
        
	public void run()
		{

		if (1 == 4)// (System.getProperty("os.name").indexOf("Windows") == 0)
			{
			/*FileWriter CompileFW = null;

			try
				{
				CompileFW = new FileWriter(GJava.FileFolder + "compile.bat");

				String folder = "" + GJava.class.getProtectionDomain().getCodeSource().getLocation().getPath();

				folder = folder.replaceAll("GJava.jar","");
				folder = folder.replaceAll("file://","");
				folder = folder.substring(1);
				folder = folder.replace("/","\\");

				folder = folder.replaceAll("%20"," ") + GJava.FileFolder;

				BufferedWriter Compile = new BufferedWriter(CompileFW);
				GJava.print(Compile,"");
				GJava.print(Compile,"@echo off");
				GJava.print(Compile,"echo This will compile all the java files ...");
				GJava
						.print(
								Compile,
								"echo Please do not close this window until this has been completed! it may take a while (up to an hour for a very big game)");
				GJava
						.print(Compile,
								"echo Please make sure you have downloaded and installed the java sdk from http://javac.g-java.com");
				/*GJava.print(Compile,"SET PATH=%PATH%;\""
						+ GJava.TFJc.getText().replace("/","\\").replace("javac.exe","") + "\";");*/
				/*GJava.print(Compile,"set CLASSPATH=.");
				GJava.print(Compile,"cd \"" + GJava.FileFolder);
				GJava.print(Compile,"javac gjava/runner/basicgame.java 2> \"basicgame.log\"");
				GJava.print(Compile,"javac gjava/runner/GameSettings.java 2> \"Gamesettings.log\"");
				GJava.print(Compile,"javac gjava/runner/Global.java 2> \"global.log\"");
				GJava.print(Compile,"javac " + GJava.projectname + ".java ");// 2> \"" + GJava.FileFolder +
				// "\\filename.log\"");
				GJava.print(Compile,"jar cfm " + GJava.projectname + ".jar manifest.txt *.class gjava");
				GJava.print(Compile,"echo ------------------------------------------------");
				GJava
						.print(
								Compile,
								"echo Finished compiling! Now move on to the next step where the g-java compiler will notify you of any errors, and allow you to run your converted program!");
				// GJava.print(Compile,"pause");
				Compile.close();

				Process p = Runtime.getRuntime().exec("\"" + GJava.FileFolder + "\\compile.bat\"");
				BufferedReader b = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				String line = null;
				textbox.setText(textbox.getText()
						+ "\nPlease wait compling... (could take a while so give it time)\n");
				while ((line = b.readLine()) != null)
					{
					textbox.setText(textbox.getText() + "\n" + line);
					}
				textbox.setText(textbox.getText() + "\nFinished compiling, hope their was no errors.");
				}
			catch (Exception e)
				{
				}
			*/}
		else
			{
			try
				{
				
//				String[] args = new String[] {
//						"-classpath",
//						GJava.FileFolder+File.separator,
//						GJava.FileFolder  + File.separator +  "Global.java"	
//						 };
				File file = new File("gcscompile.log");
				PrintStream printStream = new PrintStream(file);
				System.setErr(printStream);
//				int status = javac.compile(args);
								
				String res = GCSharp.FileFolder;
				int status2 = compile(res);
				
					
//				args = new String[] {
//						"-classpath",
//						GJava.FileFolder+File.separator,
//						GJava.FileFolder + "gjava" + File.separator + "runner" + File.separator
//						+ "basicgame.java"
//				};
				
//				int status3 = javac.compile(args);
//				
//				args = new String[] {
//						GJava.FileFolder + GJava.projectname + ".java"
//				};
//				
//				int status4 = javac.compile(args);
				
				// create a jar

				FileInputStream fstream = new FileInputStream(file);

				// Convert our input stream to a
				// DataInputStream
				BufferedReader in = new BufferedReader(new InputStreamReader(fstream));

				// Continue to read lines while
				// there are still some left to read
				String thisline;
				while ((thisline = in.readLine()) != null)
					{
					if (thisline.contains("Note:") != true)
					textbox.setText(textbox.getText() + "\n" + thisline);
					}

				if (status2 == 0)// && status3 == 0 && status4 == 0)
					{
					runapp.setEnabled(true);
					runapplet.setEnabled(true);
					textbox
					
							.setText(textbox.getText()
									+ "\n\n"
									+ "Finished compiling with no errors! Now press one of the test buttons below, to test your new C# game.");
					} else
					textbox
							.setText(textbox.getText()
									+ "\n\n"
									+ "Finished compiling with errors! Please contact a member to the G-C# development team. http://www.g-java.com/forums/");

				in.close();

				}
			catch (Exception e)
				{
				}
			}
		}

        public String[] environmentVars(){
            Map variables = System.getenv();
            Set variableNames = variables.keySet();
            Iterator nameIterator = variableNames.iterator();

            String[] v = new String[variableNames.size()];
            for (int index = 0; index < variableNames.size(); index++)
            {
                String name = (String) nameIterator.next();
                String value = (String) variables.get(name);
                v[index] = name + "=" + value;
            }
            return v;
        }
        
	public void actionPerformed(ActionEvent e)
		{
		String c = e.getActionCommand();
		if (c.equals("testapp"))
			{
			Process p;
			try
				{
				p = Runtime.getRuntime().exec(
						"mono Game.exe", environmentVars(), new File(GCSharp.FileFolder));
p.waitFor();
				BufferedReader b = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				String line = null;
				textbox.setText(textbox.getText() + "\nFinished testing...\n Errors will appear below:");
				while ((line = b.readLine()) != null)
					{
					textbox.setText(textbox.getText() + "\n" + line);
					System.out.println(textbox.getText() + "\n" + line); // Very uesful for testing
					}
				}
			catch (Exception ee)
				{
				}
			}

		if (c.equals("open"))
			{
			File gm = new File(GCSharp.FileFolder);
			
			try
				{
				GCSharp.openbrowser(gm.getCanonicalPath());
				}
			catch (IOException e1)
				{
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
			}

		}
	}
