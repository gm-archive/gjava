package org.dolphin;

import com.sun.tools.javac.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The GJavaCompiler used to compile g-java projects.
 * @author TGMG
 */
public class DolphinCompiler extends JFrame implements Runnable, ActionListener {

    private static final long serialVersionUID = 1L;
    public static JTextArea textbox;
    public static JButton runapp;
    public static JButton runapplet;

    DolphinCompiler() {
        super("Dolphin compiler");
        Box box1 = Box.createVerticalBox();
        JLabel t;
        t = new JLabel(
                "<html>Welcome to the Dolphin compiler! This will compile your game. Do not close the window unless it takes over an hour!");
        t.setPreferredSize(new Dimension(380, 48));
        box1.add(t);
        textbox = new JTextArea("Please wait while G-java compiles your game into a jar file...");
        textbox.setLineWrap(true);
        textbox.setForeground(Color.red);
        textbox.setCaretPosition(textbox.getDocument().getLength());
        JScrollPane scroll = new JScrollPane(textbox);
        scroll.setBorder(BorderFactory.createBevelBorder(1));
        box1.add(scroll);
        add(box1);
        runapp = makeButton("Test Run (applet)", "Test the game as applet", "testapplet");
        runapplet = makeButton("Test Run (application)", "Test the game as application", "testapp");
        JButton bob = makeButton("Open Containing folder.", "Open the folder containing your game.", "open");
        JPanel p = new JPanel();
        p.add(runapp);
        p.add(runapplet);
        p.add(bob);
        p.setPreferredSize(new Dimension(380, 80));
        this.add(p, BorderLayout.SOUTH);

        runapp.setEnabled(false);
        runapplet.setEnabled(false);

        setSize(390, 380);
        setLocationRelativeTo(null);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setIconImage(new ImageIcon(getClass().getResource("DolphinWriter.png")).getImage());
        setVisible(true);

        Thread th = new Thread(this);
        // start this thread
        th.start();

    }

    public JButton makeButton(String text, String tip, String command) {
        JButton b = new JButton(text);
        b.setToolTipText(tip);
        b.addActionListener(this);
        b.setActionCommand(command);
        return b;
    }

    public void run() {

        FileWriter manifestFW, htmlFW;
        try {
            manifestFW = new FileWriter(DolphinWriter.projectfolder + File.separator + "manifest.txt");
            BufferedWriter manifest = new BufferedWriter(manifestFW);
            DolphinWriter.print(manifest, "Manifest-Version: 1.0");
            DolphinWriter.print(manifest, "Main-Class: org.dolphin.game.Game");
            DolphinWriter.print(manifest, "Created-By: 1.2 (Sun Microsystems Inc.)");
            //DolphinWriter.print(manifest,"Class-Path: org");
            manifest.close();
            htmlFW = new FileWriter(DolphinWriter.projectfolder + File.separator + DolphinWriter.filename + "_applet.html");
            BufferedWriter html = new BufferedWriter(htmlFW);

            DolphinWriter.print(html, "<html>");
            DolphinWriter.print(html, "<body>");
            DolphinWriter.print(html, "Please wait while the game loads below...");
            int width = 640, height = 480;
            DolphinWriter.print(html, "<object classid=\"clsid:CAFEEFAC-0016-0000-0000-ABCDEFFEDCBA\"id=\"game\" width=\"" + width + "\" height=\"" + height +
                    "\"><param name=\"code\" value=\"Game.class\" /> <param name=\"archive\" value=\"" + DolphinWriter.filename +
                    ".jar\" /> <embed pluginspage=\"http://java.sun.com/javase/downloads\" code=\"Game.class\" width=\"" + width +
                    "\" height=\"" + height + "\" type=\"application/x-java-applet\" pluginspage=\"" + DolphinWriter.filename + ".jar\" /></embed></object>");
            DolphinWriter.print(html, "<br>Made with <b>Dolphin (www.g-creator.org)</b>");
            DolphinWriter.print(html, "</body>");
            DolphinWriter.print(html, "</html>");
            html.close();


            FileWriter batFW = new FileWriter(DolphinWriter.projectfolder + File.separator + "run_windows.bat");
            BufferedWriter bat = new BufferedWriter(batFW);
            DolphinWriter.print(bat, "java -jar \""+/*DolphinWriter.projectfolder + File.separator +*/ DolphinWriter.filename+ ".jar\"");
            DolphinWriter.print(bat, "pause");
            bat.close();

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

{
            try {
//                com.sun.tools.javac.Main javac = new com.sun.tools.javac.Main();

//				String[] args = new String[] {
//						"-classpath",
//						DolphinWriter.FileFolder+File.separator,
//						DolphinWriter.FileFolder  + File.separator +  "Global.java"
//						 };
                File file = new File("dolphin_compile.log");
                PrintStream printStream = new PrintStream(file);
                System.setErr(printStream);
//		int status = javac.compile(args);
                String[] args = new String[]{
                    "-classpath",
                    DolphinWriter.projectfolder + File.separator + ";"/*+"Projects" + File.separator + DolphinWriter.projectname + File.separator + "Java"+ File.separator+"lib"+ File.separator+"GTGE.jar"*/,
                    DolphinWriter.FileFolder + "Game.java"
                };

                FileWriter batFW = new FileWriter(DolphinWriter.FileFolder+File.separator + "compile_windows.bat");
                BufferedWriter bat = new BufferedWriter(batFW);
                DolphinWriter.print(bat, "del *.class");
                DolphinWriter.print(bat, "javac -classpath \"" +
                        new File(DolphinWriter.projectfolder+ File.separator).getAbsolutePath() + "\" Game.java");
                DolphinWriter.print(bat, "pause");
                bat.close();
                System.out.println("just before compile");
                int status2 = Main.compile(args);
//				args = new String[] {
//						"-classpath",
//						DolphinWriter.FileFolder+File.separator,
//						DolphinWriter.FileFolder + "gjava" + File.separator + "runner" + File.separator
//						+ "basicgame.java"
//				};

//				int status3 = javac.compile(args);
//				
//				args = new String[] {
//						DolphinWriter.FileFolder + DolphinWriter.projectname + ".java"
//				};
//				
//				int status4 = javac.compile(args);

                /*
                 *
                 * Create the Jar file
                 *
                 */
                new File(DolphinWriter.projectfolder + File.separator + DolphinWriter.filename+ ".jar").delete();
                args = new String[]{"cfm", DolphinWriter.projectfolder + File.separator + DolphinWriter.filename+ ".jar",
                    DolphinWriter.projectfolder + File.separator + "manifest.txt", "-C",
                    DolphinWriter.projectfolder,
                    "com", DolphinWriter.projectfolder + File.separator+ "org"
                };//,"-C","Projects" + File.separator + DolphinWriter.projectname + File.separator + "Java" + File.separator ,"org" };

                sun.tools.jar.Main jar = new sun.tools.jar.Main(printStream, printStream, "cfm " + DolphinWriter.filename + ".jar manifest.txt *.class org com");
                jar.run(args);

                FileInputStream fstream = new FileInputStream(file);

                // Convert our input stream to a
                // DataInputStream
                BufferedReader in = new BufferedReader(new InputStreamReader(fstream));

                // Continue to read lines while
                // there are still some left to read
                String thisline;
                while ((thisline = in.readLine()) != null) {
                    if (thisline.contains("Note:") != true) {
                        textbox.setText(textbox.getText() + "\n" + thisline);
                    }
                }

                if (status2 == 0)// && status3 == 0 && status4 == 0)
                {
                    runapp.setEnabled(true);
                    runapplet.setEnabled(true);
                    textbox.setText(textbox.getText() + "\n\n" + "Finished compiling with no errors! Now press one of the test buttons below, to test your new java game.");
                } else {
                    textbox.setText(textbox.getText() + "\n\n" + "Finished compiling with errors! Please contact a member to the g-java development team. http://www.g-java.com/forums/");
                }

                in.close();

            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        String c = e.getActionCommand();
        if (c.equals("testapplet")) {

            if (System.getProperty("os.name").indexOf("Windows") == 0) {
                openbrowser("Projects" + File.separator + DolphinWriter.filename + File.separator + "Java" + File.separator + DolphinWriter.filename + "_applet.html");
            }

        }

        if (c.equals("testapp")) {
            Process p;
            try {
                p = Runtime.getRuntime().exec(
                        "Java -jar " + "\"" + DolphinWriter.projectfolder + File.separator + DolphinWriter.filename+ ".jar\"");
                p.waitFor();
                BufferedReader b = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                String line = null;
                textbox.setText(textbox.getText() + "\nFinished testing...\n Errors will appear below:");
                while ((line = b.readLine()) != null) {
                    textbox.setText(textbox.getText() + "\n" + line);
                    System.out.println(textbox.getText() + "\n" + line); // Very uesful for testing
                }
            } catch (Exception ee) {
            }
        }

        if (c.equals("open")) {
            File gm = new File(DolphinWriter.FileFolder);

            try {
                openbrowser(gm.getCanonicalPath());
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

    }

    public static void openbrowser(String location) {
        if (System.getProperty("os.name").indexOf("Windows") == 0) {
            try {
                Runtime.getRuntime().exec("explorer.exe \"" + location + "\"");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try{
                System.out.println("nautilus"  + location);
                Runtime.getRuntime().exec("nautilus " + location, environmentVars(), null); //GNOME
            }
            catch(Exception e){
            }
            // Unsupported OS for opening the browser
        }
    }

     public static String[] environmentVars() {
        Map variables = System.getenv();
        Set variableNames = variables.keySet();
        Iterator nameIterator = variableNames.iterator();

        String[] v = new String[variableNames.size()];
        for (int index = 0; index < variableNames.size(); index++) {
            String name = (String) nameIterator.next();
            String value = (String) variables.get(name);
            v[index] = name + "=" + value;
        }
        return v;
    }
}
