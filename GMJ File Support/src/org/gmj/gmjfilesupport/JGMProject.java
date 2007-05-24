/*
 * GMJProject.java
 *
 * Created on 22 February 2007, 19:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gmj.gmjfilesupport;


import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
import org.openide.ErrorManager;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.nodes.Index;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author ali1
 */
public final class JGMProject implements Project  {
    public static final String ROOMS_DIR = "rooms";
    public static final String IMAGES_DIR = "images";
    public static final String ACTORS_DIR = "actors";
    public static String gametype = "Embed";
    public static String initres;
    
    private final FileObject projectDir;
    LogicalViewProvider logicalView = new JGMLogicalView(this);
    private final ProjectState state;
    
    public JGMProject(FileObject projectDir, ProjectState state) {
        this.projectDir = projectDir;
        this.state = state;
        
    }
    
    public FileObject getProjectDirectory() {
        return projectDir;
    }
    
    FileObject getRoomsFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(ROOMS_DIR);
        
        if (result == null && create) {
            try {
                result = projectDir.createFolder(ROOMS_DIR);
            } catch (IOException ioe) {
                ErrorManager.getDefault().notify(ioe);
            }
        }
        return result;
    }
    
    FileObject getImagesFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(IMAGES_DIR);
        if (result == null && create) {
            try {
                result = projectDir.createFolder(IMAGES_DIR);
            } catch (IOException ioe) {
                ErrorManager.getDefault().notify(ioe);
            }
        }
        return result;
    }
    
    private Lookup lkp;
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[] {
                
                
                
                
                
                
                
                this,  //project spec requires a project be in its own lookup
                state, //allow outside code to mark the project as needing saving
                new ActionProviderImpl(), //Provides standard actions like Build and Clean
                loadProperties(), //The project properties
                new Info(), //Project information implementation
                logicalView,new ProjectOpenedHook(){
                    
                    protected void projectOpened() {
                        ClassPath[] cp = new ClassPath[]{ClassPathSupport.createClassPath(new FileObject[]{projectDir})};
                        //GlobalPathRegistry.getDefault().register(ClassPath.SOURCE,cp);
                        GlobalPathRegistry.getDefault().register(ClassPath.COMPILE,cp);
                        //GlobalPathRegistry.getDefault().register(ClassPath.BOOT,cp);
                        
                    }
                    
                    protected void projectClosed() {
                        try {
                            org.netbeans.api.project.ProjectManager.getDefault().saveAllProjects();
                        } catch (IOException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                },
            });
            
        } else {
            ErrorManager.getDefault().log("Error: Didn't load Lookup!");
        }
        return lkp;
    }
    
    private Properties loadProperties() {
        FileObject fob = projectDir.getFileObject(JGMProjectFactory.PROJECT_DIR +
                "/" + JGMProjectFactory.PROJECT_PROPFILE);
        Properties properties = new NotifyProperties(state);
        if (fob != null) {
            try {
                properties.load(fob.getInputStream());
            } catch (Exception e) {
                ErrorManager.getDefault().notify(e);
            }
        }
        return properties;
    }
    
    private static class NotifyProperties extends Properties {
        private final ProjectState state;
        NotifyProperties(ProjectState state) {
            this.state = state;
        }
        
        public Object put(Object key, Object val) {
            Object result = super.put(key, val);
            if (((result == null) != (val == null)) || (result != null &&
                    val != null && !val.equals(result))) {
                state.markModified();
            }
            return result;
        }
    }
    
    private final class ActionProviderImpl implements ActionProvider {
        
        
        
        
        public  BufferedWriter Gamesettings;
        
        
        
        public  BufferedWriter Basicgame;
        
        
        
        public  BufferedWriter Global_java;
        
        
        
        public  BufferedWriter Filename_java;
        
        
        public String[] getSupportedActions() {
            return new String[] { ActionProvider.COMMAND_BUILD,
            ActionProvider.COMMAND_CLEAN, ActionProvider.COMMAND_RUN_SINGLE,ActionProvider.COMMAND_RUN };
        }
        
        
        
        public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
            final org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
            int idx = Arrays.asList(getSupportedActions()).indexOf(string);
            
            switch (idx) {
            case 0 : //build
                // final RendererService ren = (RendererService) getLookup().lookup(RendererService.class);
                RequestProcessor.getDefault().post(new Runnable() {
                    public void run() {
                        //FileObject image = ren.render();
                        
                        //If we succeeded, try to open the image
                        
                    }
                });
                break;
            case 1 : //clean
                
                break;
            case 2 : //compile-single
                final DataObject ob = (DataObject) lookup.lookup(DataObject.class);
                if (ob != null) {
                    // final RendererService ren1 = (RendererService) getLookup().lookup(RendererService.class);
                    RequestProcessor.getDefault().post(new Runnable() {
                        public void run() {
                            if (ob.isValid()) { //Could theoretically change before we run
                                // ren1.render(ob.getPrimaryFile());
                            }
                        }
                    });
                }
                break;
            case 3:{
                final ProgressHandle handle = ProgressHandleFactory.createHandle("Compiling...");
                handle.start();
                
                final org.openide.windows.InputOutput io = org.openide.windows.IOProvider.getDefault().getIO("Run",true);
                
                Runnable runner = new Runnable() {
                    public void run() {
                        io.getOut().println("Building and runnning project...");
                        io.getOut().println("Generating java files...");
                        io.select();
                        io.getOut().close();
                        try {
                            io.getOut().println("Copying java runners...");
                            copyFiles();
                            io.getOut().println("Copying images folder...");
                            copyFolder(new File(pro.getProjectDirectory().getPath()+"/images"),new File(pro.getProjectDirectory().getPath()+"/org/gjava/runner/images"));
                            io.getOut().println("Opening java files...");
                            openfiles();
                            closeJava();
                            io.getOut().println("Compiling java files...");
                            java.io.PrintStream printStream = new java.io.PrintStream(new java.io.File(pro.getProjectDirectory().getPath() +"gjavalog"));
                            java.lang.System.setErr(printStream);
                            com.sun.tools.javac.Javac j = new com.sun.tools.javac.Javac();
                            
                            //j.javac(new java.lang.String[]{"-classpath",pro.getProjectDirectory().getPath(),pro.getProjectDirectory().getPath() + "/org/gjava/runner/*.java"
                            //        });
                            File ff2 = new File(pro.getProjectDirectory().getName() +
                                    ".class");
                            ff2.delete();
                            j.javac(new java.lang.String[]{"-classpath",pro.getProjectDirectory().getPath(),pro.getProjectDirectory().getPath() + "/" +
                                    pro.getProjectDirectory().getName() +
                                    ".java"});
                            Enumeration enum2 = pro.getProjectDirectory().getFileObject("org").getFileObject("gjava").getFileObject("runner").getData(true);
                            while (enum2.hasMoreElements()) {
                                Object object = enum2.nextElement();
                                if ( ((FileObject)object).getPath().contains(".java")) {
                                    j.javac(new java.lang.String[]{"-classpath",pro.getProjectDirectory().getPath(),
                                    ((FileObject)object).getPath()});
                                    io.getOut().println(((FileObject)object).getName()+" compiling...");
                                }
                                
                                
                            }
                            
                            
                            FileInputStream fstream = new FileInputStream(new java.io.File(pro.getProjectDirectory().getPath() +"gjavalog"));
                            
                            
                            // Convert our input stream to a
                            // DataInputStream
                            BufferedReader in = new BufferedReader(new InputStreamReader(fstream));
                            
                            // Continue to read lines while
                            // there are still some left to read
                            String thisline;
                            while ((thisline = in.readLine()) != null) {
                                io.getErr().println(thisline);
                            }
                            io.getOut().println("Finished compiling");
                            
                            FileWriter      manifestFW = new FileWriter(pro.getProjectDirectory().getPath() + "/manifest.txt");
                            BufferedWriter manifest = new BufferedWriter(manifestFW);
                            print(manifest,"Manifest-Version: 1.0");
                            print(manifest,"Main-Class: " + pro.getProjectDirectory().getName());
                            print(manifest,"Created-By: 1.2 (Sun Microsystems Inc.)");
                            manifest.close();
                            FileWriter htmlFW = new FileWriter(pro.getProjectDirectory().getPath() + File.separator + pro.getProjectDirectory().getName() + ".html");
                            BufferedWriter html = new BufferedWriter(htmlFW);
                            
                            print(html,"<html>");
                            print(html,"<body>");
                            print(html,"Please wait while the game loads below...");
                            print(html,"<applet code=" + pro.getProjectDirectory().getName() + ".class ");
                            print(html,"  Archive = \"" + pro.getProjectDirectory().getName() + ".jar\"");
                            print(html,"        width=640 height=640>");
                            print(html,"</applet>");
                            print(html,"<br>Made with <b>G-java (www.g-java.com)</b>");
                            print(html,"</body>");
                            print(html,"</html>");
                            html.close();
                            // create a jar
                            File ff = new File(pro.getProjectDirectory().getPath()  + pro.getProjectDirectory().getName() + ".jar");
                            if (ff.exists())
                                System.out.println("exists");
                            if(ff.delete())
                                System.out.println("deleted");
                            
                            String[] args = new String[] { "cfm",pro.getProjectDirectory().getPath()  + File.separator + pro.getProjectDirectory().getName() + ".jar",
                            pro.getProjectDirectory().getPath() + File.separator +"manifest.txt","-C",pro.getProjectDirectory().getPath(),
                            pro.getProjectDirectory().getName() + ".class","-C",pro.getProjectDirectory().getPath(),"org" };
                            
                            sun.tools.jar.Main jar = new sun.tools.jar.Main(printStream,printStream,"cfm " + pro.getProjectDirectory().getName()
                                    + ".jar manifest.txt *.class org");
                            jar.run(args);
                            printStream.close();
                            io.getOut().close();
                            
                            io.getErr().close();
                            
                            
                            
                            handle.setDisplayName("Running jar as application...");
                            io.getOut().println("Running jar as application...");
                            //io.getErr().
                            try {
                                Process  p = Runtime.getRuntime().exec(
                                        "Java -jar " + "\"" + pro.getProjectDirectory().getPath()  + File.separator + pro.getProjectDirectory().getName() + ".jar\"");
                                java.lang.System.setOut(new PrintStream(p.getOutputStream()));
                                
                                //p.wait();
                                
                                
                                
                                
                            } catch (IOException ex) {
                                Exceptions.printStackTrace(ex);
                            }
                            handle.finish();
                        }catch(Throwable e){
                            System.out.println(e.getMessage());
                        }
                    }};
                    new Thread(runner).start();
                    
/*RequestProcessor.getDefault().post(new Runnable() {
                        public void run() {
        }});*/
                    
                    
            }
            default :
                //throw new IllegalArgumentException(string);
            }
            
        }
        
        // Print a line to the bufferedwriter
        public void print(BufferedWriter file,String printString) throws IOException {
            // printString.replaceAll("\n",""+(char)10);
            file.write(printString);
            file.newLine();
        }
        
        
        // FileWriter GamesettingsFW = null;
        
        FileWriter BasicgameFW = null;
        
        FileWriter Global_javaFW = null;
        
        FileWriter Filename_javaFW;
        
        public void openfiles(){
            
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            try {
                BasicgameFW = new java.io.FileWriter(pro.getProjectDirectory().getPath() + "/org/gjava/runner/basicgame.java");
                Global_javaFW = new java.io.FileWriter(pro.getProjectDirectory().getPath() + "/org/gjava/runner/Global.java");
                Filename_javaFW = new java.io.FileWriter(pro.getProjectDirectory().getPath() + "/" + pro.getProjectDirectory().getName() + ".java");
            } catch (java.lang.Exception e) {
                msgbox("Error opening FileWriter output file. " + e.getStackTrace(), 0);
                e.printStackTrace();
            }
            Basicgame = new java.io.BufferedWriter(BasicgameFW);
            Global_java = new java.io.BufferedWriter(Global_javaFW);
            Filename_java = new java.io.BufferedWriter(Filename_javaFW);
            try {
                print(Basicgame, "");
                print(Basicgame, "// basicgame.java");
                print(Basicgame, "// by TGMG");
                print(Basicgame, "");
                print(Basicgame, "// import the required classes");
                print(Basicgame, "package org.gjava.runner;");
                print(Basicgame, "import java.awt.*;");
                print(Basicgame, "import java.awt.event.*;");
                print(Basicgame, "import javax.swing.*;");
                print(Basicgame, "import java.io.*;");
                print(Basicgame, "import java.util.*;");
                print(Basicgame, "import java.net.*;");
                print(Basicgame, "import java.applet.*;");
                print(Basicgame, "import java.lang.reflect.InvocationTargetException;");
                print(Basicgame, "");
                print(Basicgame, "");
                print(Basicgame, "");
                print(Basicgame, "// the main class");
                print(Basicgame, "public class basicgame {");
                print(Basicgame, "");
                print(Basicgame, "//The Game Settings");
                print(Basicgame, "GameSettings gs = new GameSettings();");
                print(Basicgame, "");
                print(Basicgame, "public static JFrame f;");
                print(Basicgame, "public static URL u;");
                print(Basicgame, "public static String Runningas;");
                print(Basicgame, "public static RoomPanel Current_room;");
                print(Basicgame, "public static JApplet Eapplet;");
                print(Basicgame, "public static int mouse;");
                print(Basicgame, "");
                print(Basicgame, "// Declare the reasources");
                print(Basicgame, "//  G-java replace with res **101**");
                writeBasicgame();
                print(Global_java, "/////////////////////////////////");
                print(Global_java, "// Global.java by Gm_guru");
                print(Global_java, "// written for g-java 1.08+");
                print(Global_java, "/////////////////////////////////");
                print(Global_java, "package org.gjava.runner;");
                print(Global_java, "public class Global {");
                print(Global_java, "    // all global variables here");
                createFilenameJava();
            } catch (java.lang.Exception e) {
                msgbox("Error writing to output files. " + e.getStackTrace(), 0);
                java.lang.System.out.println("" + e.getStackTrace());
                closeJava();
            }
            try {
                writeloadrooms();
            } catch (IOException ex) {
                msgbox("Error writing to load rooms. " , 0);
                Exceptions.printStackTrace(ex);
            }
        }
        
        private void writeBasicgame() {
            try {
                print(Basicgame,"public basicgame(URL u) {");
                print(Basicgame,"    // if it is an applet");
                print(Basicgame,"    this.Runningas = \"Applet\";");
                print(Basicgame," this.mouse = 30;");
                print(Basicgame,"");
                print(Basicgame,"    this.u = u;");
                print(Basicgame,"     // load Functions");
                print(Basicgame,"     Functions func = new Functions();");
                print(Basicgame,"     // create a new frame that will be the game window");
                print(Basicgame,"new load_Rooms(0);");
                print(Basicgame," }");
                
                print(Basicgame,"");
                print(Basicgame,"public basicgame(URL u, JApplet embed) {");
                print(Basicgame,"    // if it is an embedded applet");
                print(Basicgame,"    this.Runningas = \"EApplet\"; ");
                print(Basicgame," this.mouse = 0;");
                print(Basicgame,"    Eapplet = embed;");
                print(Basicgame,"    this.u = u;");
                print(Basicgame,"     // load Functions");
                print(Basicgame,"     Functions func = new Functions();");
                print(Basicgame,"");
                print(Basicgame,"new load_Rooms(0,embed);");
                print(Basicgame,"   ");
                print(Basicgame," }");
                
                print(Basicgame,"");
                print(Basicgame,"public basicgame() {");
                print(Basicgame,"");
                print(Basicgame,"    // if it is an application");
                print(Basicgame,"    this.Runningas = \"Application\";");
                print(Basicgame," this.mouse = 30;");
                print(Basicgame,"     // load Functions");
                print(Basicgame,"     Functions func = new Functions();");
                print(Basicgame,"   // create a new frame that will be the game window");
                print(Basicgame,"   //JFrame f = new Room(332,92, false, gs.Outsidecolor);");
                print(Basicgame,"");
                print(Basicgame,"   // center the room onscreen");
                print(Basicgame,"   //Room.center(f);");
                print(Basicgame,"");
                print(Basicgame,"   //f.getContentPane().add(\"Center\",new StartPanel(f, gs.loading_image));");
                print(Basicgame,"   new load_Rooms(0);");
                print(Basicgame,"}");
                print(Basicgame,"");
                print(Basicgame,"// Replace with ResourceCreate");
                // print(Basicgame,"}");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
        public void msgbox(String message,int icon) {
            JOptionPane.showMessageDialog(null,message,"G-java",icon);
        }
        
        private void copyjava(String from,String to) throws Exception {
            from = this.getClass().getResource("JGMProject.class").getPath().replaceAll("/org/gmj/gmjfilesupport/JGMProject.class", from).replaceAll("%20", " ");
            InputStream in;
            in = new FileInputStream(new File(from));
            OutputStream out = new FileOutputStream(new File(to));
            
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) > 0) {
                out.write(b,0,len);
            }
            in.close();
            out.close();
        }
        
        public void copyFolder(File fin, File fout) throws Exception {
            fout.mkdir();
            String[] children = fin.list();
            if (children == null) {
                // Either dir does not exist or is not a directory
            } else {
                for(int p=0;p<children.length;p++){
                    File f = new File(fin+"/"+children[p]);
                    File f1 = new File(fout+"/"+children[p]);
                    if(f.isDirectory())
                        copyFolder(f,f1);
                    else
                        copy(f.getPath(),f1.getPath(),false);
                }
            }
        }
        
        private void copy(String from,String to,boolean relativepath) throws Exception {
            //System.out.println(this.getClass().getResource("JGMProject.class").getPath().replaceAll("/org/gmj/gmjfilesupport/JGMProject.class", from));
            //from = this.getClass().getResource("JGMProject.class").getPath().replaceAll("/org/gmj/gmjfilesupport/JGMProject.class", from).replaceAll("%20", "");
            
            InputStream in;
            if (relativepath == true) {
                org.gjava.runner.GameSettings gs = new org.gjava.runner.GameSettings();
                in = gs.getClass().getResourceAsStream(from);
                
            } else
                in = new FileInputStream(new File(from));
            File f = new File(to);
            if(new File(from).isDirectory()) {
                f.mkdirs();
            }
            
            if (!f.exists())
                f.createNewFile();
            OutputStream out = new FileOutputStream(f);
            
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) > 0) {
                out.write(b,0,len);
            }
            in.close();
            out.close();
            
        }
        
        private void copyFiles() {
            
            // move the files one by one
            try {
                org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
                
                String path = pro.getProjectDirectory().getPath()+"/org/gjava/runner/";
                copy("dialog.png",path + "dialog.png",true);
                copy("sprite.class",path + "sprite.class",true);
                copy("Path.class",path + "Path.class",true);
                copy("loading.png",path + "loading.png",true);
                copy("StartPanel.class",path + "StartPanel.class",true);
                copy("font.class",path + "font.class",true);
                copy("Background.class",path + "Background.class",true);
                copy("Functions.class",path + "Functions.class",true);
                copy("Functions.java2",path + "Functions.java",true);
                copy("Actor.class",path + "Actor.class",true);
                copy("Runner.class",path + "Runner.class",true);
                copy("sound.class",path + "sound.class",true);
                copy("Room.class",path + "Room.class",true);
                copy("MessageBox.class",path + "MessageBox.class",true);
                copy("RoomPanel.class",path + "RoomPanel.class",true);
                copy("tile.class",path + "tile.class",true);
                copy("ImageCanvas.class",path + "ImageCanvas.class",true);
                copy("basicgame.class",path + "basicgame.class",true);
                copy("Game_Information.class",path + "Game_Information.class",true);
                copy("TimedAudioClip.class",path + "TimedAudioClip.class",true);
                copy("Timeline.class",path + "Timeline.class",true);
                copy("GameSettings.class",path + "GameSettings.class",true);
                copy("Global.class",path + "Global.class",true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        
        public void writeloadrooms()
                throws IOException {
            String roomstr = "";
            String eroomstr = "";
            String firstroom = "";
            String lastroom = "";
            String currentroom;
            String roomarray = "public static int getroom[]= {";
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            print(Basicgame,"}");
            Basicgame.close();
            BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/load_Rooms.java");
            Basicgame = new BufferedWriter(BasicgameFW);
            //get list of rooms
            int subi=0;
            
            FileObject dir = pro.getProjectDirectory().getFileObject("rooms");
            
            //Get the DataObject that represents it
            DataFolder theDataObject =
                    DataFolder.findFolder(dir);
            //Index i = (Index)theDataObject.getNodeDelegate().getLookup().lookup(Index.class);
            Node[] n = theDataObject.getNodeDelegate().getChildren().getNodes(true);
           int ii = 0;
           System.out.println(""+n.length);
            while (ii < n.length) {
                System.out.println(""+ii);
                //for (Enumeration e = dir.getData(false); e.hasMoreElements() ;) {
                //FileObject f = (FileObject)e.nextElement();
                Node f = n[ii];
                subi =  ii;//i.indexOf(f);
                roomstr = roomstr + "    if (roomid ==  " + subi + ") {\n\n";
                eroomstr = eroomstr + "    if (roomid ==  " + subi + ") {\n\n";
                
                currentroom = "" + subi;
                
                roomstr = roomstr + "rooms[" + currentroom + "] = new " + f.getName() + "(Room,"
                        + currentroom + ",roomid);\n basicgame.Current_room = rooms[" + currentroom
                        + "];\n Room.setSize(rooms[" + currentroom + "].Width,rooms[" + currentroom
                        + "].Height);\n Room.getContentPane().add( rooms[" + currentroom + "]);\n Room.validate();\n }";
                eroomstr = eroomstr + "rooms[" + currentroom + "] = new " + f.getName() + "(Room,"
                        + currentroom + ",roomid);\n basicgame.Current_room = rooms[" + currentroom
                        + "];\n maingamep.getContentPane().add( rooms[" + currentroom + "]);\n }";
                
                if (subi == 0) {
                    lastroom = "" + 0;
                    
                    roomarray = roomarray + lastroom;
                }
                
                else {
                    roomarray = roomarray + "," + subi;
                }
                //subi++;
                ii++;
            }
            firstroom = ""+subi;
            
            // write load_rooms
            print(Basicgame,"package org.gjava.runner;");
            print(Basicgame,"import java.awt.*;");
            print(Basicgame,"import java.awt.event.*;");
            print(Basicgame,"import javax.swing.*;");
            print(Basicgame,"import java.io.*;");
            print(Basicgame,"import java.util.*;");
            print(Basicgame,"import java.net.*;");
            print(Basicgame,"import java.applet.*;");
            print(Basicgame,"public class load_Rooms {");
            print(Basicgame,"public static JFrame Room;");
            print(Basicgame,"public static int firstroom = 0; ");
            print(Basicgame,"public static int lastroom = " + lastroom + "; ");
            print(Basicgame,"public static JApplet maingamep;");
            print(Basicgame,"public static RoomPanel[] rooms = new RoomPanel[" + subi+1 + "];");
            print(Basicgame,"public static int roomid;");
            print(Basicgame,"public static Image GIcon;");
            print(Basicgame,roomarray+ "};");
            print(Basicgame,"");
            print(Basicgame,"load_Rooms(int roomid) {");
            print(Basicgame,"    JFrame room = new Room(332,92,true, Color.black);");
            
            print(Basicgame,"room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
            //            print(Basicgame,"if (basicgame.Runningas == \"Application\") {");
            //
            //            print(Basicgame,"    StartPanel.loadingframe.dispose();");
            //            print(Basicgame,"}");
            //            print(Basicgame,"//GIcon = new ImageIcon(getClass().getResource(\"icon.png\") ).getImage();");
            //            print(Basicgame,"//room.setIconImage(GIcon);");
            print(Basicgame,"");
            print(Basicgame,"    room.setVisible(true);");
            print(Basicgame,"    this.Room = room;");
            print(Basicgame,"    this.roomid = roomid;");
            print(Basicgame,"    change_room(roomid);");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"load_Rooms(int roomid,JApplet maingamep) {");
            print(Basicgame,"//it is embedded");
            print(Basicgame,"this.maingamep = maingamep;");
            print(Basicgame,"change_room(roomid,maingamep);");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static boolean if_prev_room(int roomid) {");
            print(Basicgame,"if (roomid == firstroom) { return false; } else { return true; }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static boolean if_next_room(int roomid) {");
            print(Basicgame,"if (roomid == lastroom) { return false; } else { return true; }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void next_room(int roomid,JApplet maingamep) {");
            print(Basicgame,"        int gjavai = 0;");
            print(Basicgame,"        while (gjavai < getroom.length) {");
            print(Basicgame,
                    "        if (getroom[gjavai] == roomid) { change_room(getroom[gjavai-1],maingamep); } gjavai++;");
            print(Basicgame,"    }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void next_room(int roomid) {");
            print(Basicgame,"        int gjavai = 0;");
            print(Basicgame,"        while (gjavai < getroom.length) {");
            print(Basicgame,"        if (getroom[gjavai] == roomid) { change_room(getroom[gjavai-1]); } gjavai++;");
            print(Basicgame,"    }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void restart_room(int roomid,JApplet maingamep) {");
            print(Basicgame,"int locali = basicgame.Current_room.roomid;");
            print(Basicgame,"        remove_room(basicgame.Current_room.id);");
            print(Basicgame,"        change_room(locali,maingamep);");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void restart_room(int roomid) {");
            print(Basicgame,"int locali = basicgame.Current_room.roomid;");
            print(Basicgame,"        remove_room(basicgame.Current_room.id);");
            print(Basicgame,"        change_room(locali);");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void prev_room(int roomid,JApplet maingamep) {");
            print(Basicgame,"        int gjavai = 0;");
            print(Basicgame,"        while (gjavai < getroom.length) {");
            print(Basicgame,
                    "        if (getroom[gjavai] == roomid) { change_room(getroom[gjavai+1],maingamep); } gjavai++;");
            print(Basicgame,"    }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void prev_room(int roomid) {");
            print(Basicgame,"        int gjavai = 0;");
            print(Basicgame,"        while (gjavai < getroom.length) {");
            print(Basicgame,"        if (getroom[gjavai] == roomid) { change_room(getroom[gjavai+1]); } gjavai++;");
            print(Basicgame,"    }");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void change_room(int roomid,JApplet maingamep) {");
            print(Basicgame,eroomstr);
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"");
            print(Basicgame,"");
            print(Basicgame,"public static void remove_room(int roomid) {");
            print(Basicgame,"//basicgame.close_sounds();");
            print(Basicgame,"if (basicgame.Runningas != \"EApplet\") {");
            print(Basicgame,"Room.removeKeyListener((KeyListener)rooms[roomid]);");
            print(Basicgame,"Room.removeMouseListener((MouseListener)rooms[roomid]);");
            print(Basicgame,"Room.remove(rooms[roomid]);");
            print(Basicgame,"} else {");
            print(Basicgame,"  // remove from embeded applet");
            print(Basicgame,"maingamep.removeKeyListener((KeyListener)rooms[roomid]);");
            print(Basicgame,"maingamep.removeMouseListener((MouseListener)rooms[roomid]);");
            print(Basicgame,"maingamep.remove(rooms[roomid]);");
            print(Basicgame,"}");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"public static void change_room(int roomid) {");
            print(Basicgame,roomstr);
            print(Basicgame,"");
            print(Basicgame,"");
            print(Basicgame,"}");
            print(Basicgame,"");
            print(Basicgame,"");
            print(Basicgame,"}");
            
        }
        
        private boolean closeJava() {
            try {
                // Close Game Settings
               /* print(Gamesettings,"}");
                Gamesettings.close();*/
                
                // close filename
                Filename_java.close();
                
                //print(Basicgame,"}");
                // Close Basicgame
                Basicgame.close();
                // Now replace stuff
                
                // Close Global_java
                print(Global_java,"}");
                Global_java.close();
            } catch (Exception e) {
                return false;
            }
            return true;
        }
        
        
        private void createFilenameJava() throws IOException {
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
            print(Filename_java,"// " + pro.getProjectDirectory().getName() +  ".java");
            print(Filename_java,"// by G-java");
            print(Filename_java,"");
            print(Filename_java,"/*");
            print(Filename_java,"/ Made in G-Java 2.0 www.g-java.com");
            print(Filename_java,"/ This program can be run as an applet or an application!");
            print(Filename_java,"*/");
            print(Filename_java,"");
            print(Filename_java,"import org.gjava.runner.basicgame;");
            print(Filename_java,"import java.awt.*;");
            print(Filename_java,"import javax.swing.*;");
            print(Filename_java,"import java.net.*;");
            print(Filename_java,"");
            print(Filename_java,"public class "  + pro.getProjectDirectory().getName() +  " extends JApplet  {");
            print(Filename_java,"");
            print(Filename_java,"boolean loading = true;");
            print(Filename_java,"public Image loadingImage;");
            print(Filename_java,"");
            
            if (gametype == "Popup") {
                print(Filename_java,"    public void stop() {");
                print(Filename_java,"     // basicgame.close_sounds();");
                print(Filename_java,"    }");
                print(Filename_java,"    public void init() {");
                print(Filename_java,"    showStatus( \"Made in G-java - www.g-java.com\");");
                print(Filename_java,"        if(!isGreaterThanJDK14())");
                print(Filename_java,"        {");
                print(Filename_java,"            URL upgradeTarget;");
                print(Filename_java,"            try{");
                print(Filename_java,
                        "                String targetURL = \"http://www.netsoc.tcd.ie/~duncan/dev/java/upgrade.html\";");
                print(
                        Filename_java,
                        "                 System.out.println(\"Sorry you need java version 1.4+ to run this program. Redirecting to \"+targetURL+\" for a later version of java\");");
                print(Filename_java,"                 getAppletContext().showDocument(new URL(targetURL));");
                print(Filename_java,"");
                print(Filename_java,"             }catch(MalformedURLException mfe)");
                print(Filename_java,"             {");
                print(Filename_java,"                 System.err.println(\"Malformed URL exception caught:\"+mfe);");
                print(Filename_java,"             }");
                print(Filename_java,"");
                print(Filename_java,"         }");
                print(Filename_java,"         ");
                print(Filename_java,"         URL u = getDocumentBase();");
                print(Filename_java,"                ");
                print(Filename_java,"         new basicgame(u);");
                print(Filename_java,"         ");
                print(Filename_java,"     }");
                print(Filename_java,"");
                print(Filename_java,"    public static void main(String args[]) {");
                print(Filename_java,"       Functions.parameters = args; Functions.parameter_count = args.length;");
                print(Filename_java,"        // check if the user is using 1.4 or higher");
                print(Filename_java,"        if(!isGreaterThanJDK14())");
                print(Filename_java,"        {");
                print(Filename_java,
                        "        JOptionPane.showMessageDialog(null,\"Please download the latest version of java.\",1);");
                print(Filename_java,"");
                print(Filename_java,"        }");
                print(Filename_java,"        ");
                print(Filename_java,"        new basicgame();");
                print(Filename_java,"        ");
                print(Filename_java,"    }");
                print(Filename_java," public void paint( Graphics g ) {");
                print(Filename_java,
                        "  loadingImage  = new ImageIcon(getClass().getResource(\"org/gjava/runner/loading.png\")).getImage();");
                print(Filename_java,"  //if the game is loading");
                print(Filename_java,"       g.drawImage(loadingImage,0,0, null);");
                print(Filename_java,"     if (loading) {");
                print(Filename_java,"     }");
                print(Filename_java,"  }");
            }
            
            if (gametype == "Embed") {
                print(Filename_java,"    public void init() {");
                print(Filename_java,"showStatus( \"Made in G-java - www.g-java.com\");");
                print(Filename_java,"        if(!isGreaterThanJDK14())");
                print(Filename_java,"        {");
                print(Filename_java,"            URL upgradeTarget;");
                print(Filename_java,"            try{");
                print(Filename_java,
                        "                String targetURL = \"http://www.netsoc.tcd.ie/~duncan/dev/java/upgrade.html\";");
                print(
                        Filename_java,
                        "                 System.out.println(\"Sorry you need java version 1.4+ to run this program. Redirecting to \"+targetURL+\" for a later version of java\");");
                print(Filename_java,"                 getAppletContext().showDocument(new URL(targetURL));");
                print(Filename_java,"");
                print(Filename_java,"             }catch(MalformedURLException mfe)");
                print(Filename_java,"             {");
                print(Filename_java,"                 System.err.println(\"Malformed URL exception caught:\"+mfe);");
                print(Filename_java,"             }");
                print(Filename_java,"");
                print(Filename_java,"         }");
                print(Filename_java,"         ");
                print(Filename_java,"     }");
                print(Filename_java,"");
                print(Filename_java,"    public static void main(String args[]) {");
                print(Filename_java,"    ");
                print(Filename_java,"        // check if the user is using 1.4 or higher");
                print(Filename_java,"        if(!isGreaterThanJDK14())");
                print(Filename_java,"        {");
                print(Filename_java,
                        "        JOptionPane.showMessageDialog(null,\"Please download the latest version of java.\");");
                print(Filename_java,"");
                print(Filename_java,"        }");
                print(Filename_java,"        ");
                print(Filename_java,"        basicgame gme = new basicgame();");
                print(Filename_java,"        ");
                print(Filename_java,"    }");
                print(Filename_java,"public void paint( Graphics g ) {");
                print(Filename_java,
                        "         loadingImage  = new ImageIcon(getClass().getResource(\"gjava/runner/loading.png\")).getImage();");
                print(Filename_java,"      g.drawImage(loadingImage,0,0, null);");
                print(Filename_java," //if the game is loading");
                print(Filename_java,"    if (loading) {");
                print(Filename_java,"         //load the sprites");
                print(Filename_java,"        // basicgame.load_Sprites();");
                print(Filename_java,"         //load the sounds");
                print(Filename_java,"        // basicgame.load_Sounds();");
                print(Filename_java,"         // load all backgrounds here");
                print(Filename_java,"        // basicgame.load_Backgrounds();");
                print(Filename_java,"         // load all paths here");
                print(Filename_java,"        // basicgame.load_Paths();");
                print(Filename_java,"         // load all fonts here");
                print(Filename_java,"        // basicgame.load_Fonts();");
                print(Filename_java,"         // load all timelines here");
                print(Filename_java,"        // basicgame.load_Timelines();");
                print(Filename_java,"         loading = false;");
                print(Filename_java,"         URL u = getDocumentBase();");
                print(Filename_java,"                ");
                print(Filename_java,"         basicgame gme = new basicgame(u,this);");
                print(Filename_java,"    }");
                print(Filename_java," }");
            }
            print(Filename_java,"    private static boolean isGreaterThanJDK14()");
            print(Filename_java,"    {");
            print(Filename_java,"        /*");
            print(
                    Filename_java,
                    "            (taken from http://h21007.www2.hp.com/dspp/tech/tech_TechDocumentDetailPage_IDX/1,1701,2156,00.html):");
            print(Filename_java,"");
            print(Filename_java,"            java.class.version property values:");
            print(Filename_java,"        ");
            print(Filename_java,"            JDK 1.1 45.3");
            print(Filename_java,"            JDK 1.2 46.0");
            print(Filename_java,"            JDK 1.3 47.0");
            print(Filename_java,"            JDK 1.4 48.0");
            print(Filename_java,"");
            print(Filename_java,"        */");
            print(Filename_java,"        String v = System.getProperty(\"java.class.version\");");
            print(Filename_java,"        String v2 = System.getProperty(\"java.version\");");
            print(Filename_java,"        System.out.println(\"java.class.version:\"+v);");
            print(Filename_java,"        System.out.println(\"java.version:\"+v2);");
            print(Filename_java,"        System.out.println(\"Made in G-java : WwW.G-jAvA.CoM\");");
            print(Filename_java,"        try{");
            print(Filename_java,"            return (Double.valueOf(v).doubleValue() >= 47.0);");
            print(Filename_java,"        }catch(NumberFormatException nfe)");
            print(Filename_java,"        {");
            print(Filename_java,"        }");
            print(Filename_java,"        return false;");
            print(Filename_java,"");
            print(Filename_java,"    }");
            print(Filename_java,"}");
        }
        
        
        public boolean isActionEnabled(String string, Lookup lookup) throws IllegalArgumentException {
            int idx = Arrays.asList(getSupportedActions()).indexOf(string);
            boolean result;
            switch (idx) {
            case 0 : //build
                if (org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject()==null) {
                    result = false;
                } else {result = false;}
                break;
            case 1 : //clean
                result = false;
                break;
            case 2 : //compile-single
                DataObject ob = (DataObject) lookup.lookup(DataObject.class);
                if (ob != null) {
                    FileObject file = ob.getPrimaryFile();
                    result = "text/x-povray".equals(file.getMIMEType());
                } else {
                    result = false;
                }
                break;
            case 3: result = true;
            break;
            default :
                result = false;
            }
            return result;
        }
    }
    
    /** Implementation of project system's ProjectInformation class */
    private final class Info implements ProjectInformation {
        public Icon getIcon() {
            return new ImageIcon(Utilities.loadImage(
                    "org/gmj/gmjfilesupport/room.png"));
        }
        
        public String getName() {
            return getProjectDirectory().getName();
        }
        
        public String getDisplayName() {
            return getName();
        }
        
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        public Project getProject() {
            return JGMProject.this;
        }
    }
    
    
}



