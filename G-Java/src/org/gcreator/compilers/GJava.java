
package org.gcreator.compilers;

import org.antlr.runtime.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import org.gcreator.components.ExtendedFrame;
import org.gcreator.components.TabPanel;
import org.gcreator.components.impl.ToolbarButton;
import org.gcreator.core.Aurwindow;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.events.CreateEvent;
import org.gcreator.events.Event;
import org.gcreator.events.MouseEvent;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.*;
import org.gcreator.units.ActorInScene;
import sun.awt.image.ToolkitImage;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore {

    public static String projectname,  FileFolder;
    public static int sprites = 0,  actors = 0,  scenes = 0,  fonts = 0;
    String loadscene = "", loadSprites = "public static Sprite ", createSprites = "public void loadSprites() { ";
    double actorindex=0;
    public GJava() {

    }

    public void parseImage(ImageIcon i, org.gcreator.fileclass.GFile f) {
        
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BufferedImage ii;
            if ((i.getImage()) instanceof ToolkitImage) {System.out.println("Toolkit");
            ii = ((ToolkitImage)(i.getImage())).getBufferedImage();
            }
            else
            ii = (BufferedImage) i.getImage();
            ImageIO.write(ii, f.type, baos);

//            File ff = new File(FileFolder + File.separator + "images");
//
//            ff.mkdirs();
            File ff = new File(FileFolder + "components"+ File.separator + f.name + "." + f.type);
            FileOutputStream fos = new FileOutputStream(ff);

            fos.write(baos.toByteArray());
            fos.close();
        } catch (Exception e) {
            System.out.println("Exception parsing image"+e.getMessage());
        }
    }

    public void parseSprite(Sprite s) {
        super.parseSprite(s);
        loadSprites += s.name + ",";
        createSprites += s.name + " = new Sprite(\"" + s.name + "\"," + s.height + ", " + s.width + ", " + s.BBleft + ", " + s.BBRight + ", " + s.BBBottom + ", " + s.BBTop + ", " + s.originX + ", " + s.originY + ", new java.lang.String[] {";
        for (Enumeration e = s.Simages.elements(); e.hasMoreElements();) {
            try {
            org.gcreator.fileclass.GFile a = (org.gcreator.fileclass.GFile) e.nextElement();
            createSprites += "\"" + a.name + ".png" + "\",";
        //if(a!=null)
            } catch(Exception ee){System.out.println("exception"+ee.getLocalizedMessage());}
        }

        createSprites += "\"\"});";
    }

    public void parseActor(Actor a) {
        try {
            FileWriter actorFW = new FileWriter(FileFolder + File.separator + a.name + ".java");
            BufferedWriter actor = new BufferedWriter(actorFW);
            print(actor, "package org.gcreator.compilers.gjava;");
            print(actor, "import org.gcreator.compilers.gjava.api.components.*;");
            print(actor, "import org.gcreator.compilers.gjava.api.*;");
            print(actor, "");

            print(actor, "public class " + a.name + " extends Actor {");
            print(actor, "");
            print(actor, "    " + a.name + "(int X,int Y,double instance_id) {");
            if (a.sprite == null) {
                print(actor, "        super(\"" + a.name + "\", null, "+a.solid +", "+a.visible+", "+a.depth+", "+a.persistant+", "+actorindex+");");
            } else {
                print(actor, "        super(\"" + a.name + "\", Game." + a.sprite + ","+a.solid +", "+a.visible+", "+a.depth+", "+a.persistant+", "+actorindex+");");
            }
            print(actor, "        xstart = X;");
            print(actor, "        ystart = Y;");
            print(actor, "        x = X;");
            print(actor, "        y = Y;");
            print(actor, "        this.instance_id = instance_id;");
            print(actor, "    }");
            //events
            for (Enumeration e = a.events.elements(); e.hasMoreElements();)
            {
            Event ev = (Event)e.nextElement();
            if (ev instanceof CreateEvent) {
            print(actor, "  public void Create_event()  {");
            for (Enumeration ee = ev.actions.elements(); ee.hasMoreElements();)
            {
              org.gcreator.actions.Action G_Java_aa =  (org.gcreator.actions.Action)ee.nextElement();
              
              print(actor,parseGCL(G_Java_aa.getEGML(),this));
              System.out.println("action parse!");
              //parseGCL(";;; {}",this);
            }
            print(actor, "    }");
            }
            else if (ev instanceof MouseEvent) {
            System.out.println("Mouse!");
            
            }
            }
            print(actor, "");
            print(actor, "}");
            actor.close();
        } catch (Exception e) {
        }
actorindex++;
    }
    
    

    public void parseClass(String s,String name) throws IOException {
       System.out.println("parse class");        
    FileWriter classFW = new FileWriter(FileFolder + File.separator + name + ".java");
        BufferedWriter classs = new BufferedWriter(classFW);
        print(classs, "package org.gcreator.compilers.gjava;");
        print(classs, "public class "+name+" {");
        this.parseGCLClass(s, this);
        print(classs,this.returncode);
        print(classs, "}");
        classs.close();
    }

    public void parseScene(Scene s) throws IOException {
        loadscene += "    scenes[" + scenes + "] = new " + s.name + "();";
        scenes++;
        FileWriter sceneFW = new FileWriter(FileFolder + File.separator + s.name + ".java");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "package org.gcreator.compilers.gjava;");
        print(scene, "");
        //print(scene, "import org.gcreator.compilers.gjava.components.Scene;");
        print(scene, "import org.gcreator.compilers.gjava.core.*;");
        print(scene, "import org.gcreator.compilers.gjava.api.*;");
        //print(scene, "import java.awt.Color;");
        print(scene, "import org.newdawn.slick.Color;");
        print(scene, "");
        // can do a opengl scene for now, in future pure java2d will be added here
        print(scene, "public class " + s.name + " extends org.gcreator.compilers.gjava.lwjgl.Scene2D {");
        print(scene, "");
        print(scene, "    " + s.name + "() {");
        if (s.drawbackcolor) {
            print(scene, "        super(Game.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", new Color(" + s.background.getRed() + "," + s.background.getGreen() + "," + s.background.getBlue() + "));");
        } else {
            print(scene, "        super(Game.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", Color.BLACK);");
        }
        print(scene, "    setupScene();");
        print(scene, "    SortDepth();");
        print(scene, "    }");
        print(scene, "    private void setupScene() {");
        
        for(int i=0; i<s.actors.size(); i++)
        print(scene, "instances.add(new " + ((ActorInScene) s.actors.get(i)).Sactor.name + "(" + ((ActorInScene) s.actors.get(i)).x + "," + ((ActorInScene) s.actors.get(i)).y + ","+((ActorInScene) s.actors.get(i)).id +"));");

        print(scene, "    }");
        print(scene, "");
        print(scene, "}");
        
        scene.close();
    }

    public void createFolders() {
        try {
            FileFolder = "Projects" + File.separator + projectname + File.separator + "Java" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava" + File.separator;
            File f1 = new File(FileFolder);
            if(f1.exists())
                recursivelyDeleteDirectory(new File("Projects" + File.separator + projectname+ File.separator)); 
                //new File("Projects" + File.separator + projectname+ File.separator).delete();
            f1.mkdirs();
            File f2 = new File("plugins" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava");
            copyDirectory(f2, f1);
            f1=new File("Projects" + File.separator + projectname + File.separator + "Java" + File.separator+"lib"+ File.separator);
            f1.mkdirs();
            f2=new File("lib"+ File.separator);
            copyDirectory(f2, f1);
            
        } catch (IOException ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    public void onSplashDispose() {
        init();
    }

    public void onLoad(){
        ToolbarButton btn = new ToolbarButton("Run program", "Run", new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")));
        btn.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                run(Aurwindow.getMainProject());
            }
        });
        ToolbarManager.toolbuttons.add(btn);
    }
    
    public void init() {
        utilities.addStringMessage("Installed G-Java!");
        // add toolbar button
//        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);
//
//        run.addActionListener(new ActionListener() {
//
//                    public void actionPerformed(ActionEvent evt) {
//                        run(Aurwindow.getMainProject());
//                    }
//                });
//                
        JMenuItem i = new JMenuItem("Compile with G-Java");
        i.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                run(Aurwindow.getMainProject());
            }
        });
        
        PluginHelper.addMenuItem(3, i);
        //Aurwindow.tool.add(run);
    }

    public void createJavaFiles() throws IOException {
        FileWriter gameFW = new FileWriter(FileFolder + File.separator + "Game.java");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "package org.gcreator.compilers.gjava;");
        print(game, "import org.gcreator.compilers.gjava.api.components.*;");
        print(game, "import org.gcreator.compilers.gjava.lwjgl.*;");
        //import org.gcreator.compilers.gjava.components.Sprite;
        print(game, "//import org.gcreator.compilers.gjava.core.basicgame;");
        print(game, "public class Game extends org.gcreator.compilers.gjava.lwjgl.Basicgame {");
        print(game, loadSprites + "G_Creator_NULL_SPRITE;");
        print(game, "    Game(){");
        print(game, "//loading image code will go here");
        print(game, "loadSprites();");
        print(game, "        loadScenes();");
        print(game, "        nextScene();");
        print(game, "    }");
        print(game, "   public void loadScenes(){");
        print(game, "  scenes = new Scene2D[" + scenes + "]; ");
        print(game, "" + loadscene);
        print(game, "    }");
        //Load sprites method
        print(game, createSprites + "}");
        print(game, "   public static void main(String[] args){");
        print(game, "       Runningas = \"Application\";");
        print(game, "       canvas=frame;");
        
        print(game, "       new Game();");
        print(game, "       frame.setVisible(true);");
        print(game, "   }");
        print(game, "}");
        game.close();
    }

    public void run(Project project) {
        System.out.println("Saving...");
        if (gcreator.window.istabs) {
            for (int ii = 0; ii < gcreator.window.tabs.getTabCount(); ii++) {
                if (((TabPanel) gcreator.window.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) gcreator.window.tabs.getComponentAt(ii)).project.equals(Aurwindow.getMainProject()) && ((TabPanel) gcreator.window.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) gcreator.window.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < gcreator.window.mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project.equals(Aurwindow.getMainProject()) && ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        if (project == (null))
            JOptionPane.showMessageDialog(null, "You have to select a main project first!");
        projectname = project.name;
        loadscene = "";
        loadSprites = "public static Sprite ";
        scenes = 0;
        if (project == null) {
            return;
        }
        utilities.addStringMessage("Building/running using G-Java");
        utilities.addStringMessage("Creating java files...");
        createFolders();
        super.run(project);
        try {
            createJavaFiles();
        } catch (Exception e) {
        }

        GJavaCompiler compiler = new GJavaCompiler();
    }

    @Override
    public void parseSettings(String string, String name) {
        System.out.println("got here!");
    }
    
     
    public Object onSignalReceived(PluginCore caller, Object signal){
        if(signal instanceof Object[]){
            Object[] args = (Object[]) signal;
            if(args[0] instanceof String&&((String) args[0]).equals("compile")){
                for(int i = 1; i < args.length; i++){
                    if(args[i]!=null&&args[i] instanceof Project){
                        run((Project) args[i]);
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public String getID(){
        return "G-Java";
    }

//    public String varstatement(String type, String vars) {
//        System.out.println("G-java var");
//        return type+ " "+vars+";";
//    }
    
    
}
