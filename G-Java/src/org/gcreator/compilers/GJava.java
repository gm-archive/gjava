/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.JButton;
import org.gcreator.components.ExtendedFrame;
import org.gcreator.components.TabPanel;
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
import org.gcreator.plugins.platform.gscriptLexer;
import org.gcreator.plugins.platform.gscriptParser;
import org.gcreator.units.ActorInScene;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore {

    public static String projectname,  FileFolder;
    public static int sprites = 0,  actors = 0,  scenes = 0,  fonts = 0;
    String loadscene = "", loadSprites = "public static Sprite ", createSprites = "public void loadSprites() { ";

    public GJava() {

    }

    public void parseImage(ImageIcon i, org.gcreator.fileclass.File f) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BufferedImage ii = (BufferedImage) i.getImage();
            ImageIO.write(ii, f.type, baos);

            File ff = new File(FileFolder + File.separator + "images");

            ff.mkdirs();
            ff = new File(FileFolder + File.separator + "images" + File.separator + f.name + "." + f.type);
            FileOutputStream fos = new FileOutputStream(ff);

            fos.write(baos.toByteArray());
            fos.close();
        } catch (Exception e) {
        }
    }

    public void parseSprite(Sprite s) {
        super.parseSprite(s);
        loadSprites += s.name + ",";
        createSprites += s.name + " = new Sprite(\"" + s.name + "\"," + s.height + ", " + s.width + ", " + s.BBleft + ", " + s.BBRight + ", " + s.BBBottom + ", " + s.BBTop + ", " + s.originX + ", " + s.originY + ", new String[] {";
        for (Enumeration e = s.images.elements(); e.hasMoreElements();) {
            org.gcreator.fileclass.File f = (org.gcreator.fileclass.File) e.nextElement();
            createSprites += "\"" + f.name + "." + f.type + "\",";
        }

        createSprites += "\"\"});";
    }

    public void parseActor(Actor a) {
        try {
            FileWriter actorFW = new FileWriter(FileFolder + File.separator + a.name + ".java");
            BufferedWriter actor = new BufferedWriter(actorFW);
            print(actor, "package org.gcreator.compilers.gjava;");
            print(actor, "");

            print(actor, "public class " + a.name + " extends Actor {");
            print(actor, "");
            print(actor, "    " + a.name + "(int X,int Y,double instance_id) {");
            if (a.sprite == null) {
                print(actor, "        super(\"" + a.name + "\", null, "+a.solid +", "+a.visible+", "+a.depth+", "+a.persistant+");");
            } else {
                print(actor, "        super(\"" + a.name + "\", Game." + a.sprite.name + ","+a.solid +", "+a.visible+", "+a.depth+", "+a.persistant+");");
            }
            print(actor, "        xstart = X;");
            print(actor, "        ystart = Y;");
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
              //G_Java_aa.getEGML()
              //parseGCL(G_Java_aa.getEGML(),this);
              System.out.println("action parse!");
              parseGCL(";;; {}",this);
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
        print(scene, "import org.gcreator.compilers.gjava.components.Scene;");
        print(scene, "import org.gcreator.compilers.gjava.core.*;");
        print(scene, "import java.awt.Color;");
        print(scene, "");
        print(scene, "public class " + s.name + " extends Scene {");
        print(scene, "");
        print(scene, "    " + s.name + "() {");
        if (s.drawbackcolor) {
            print(scene, "        super(basicgame.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", new Color(" + s.background.getRed() + "," + s.background.getGreen() + "," + s.background.getBlue() + "));");
        } else {
            print(scene, "        super(basicgame.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", Color.BLACK);");
        }
        print(scene, "    }");
        print(scene, "    private void setupScene() {");
        for (Enumeration e = s.actors.elements(); e.hasMoreElements();) {
            print(scene, "instances.add(new " + ((ActorInScene) e.nextElement()).actor.name + "(" + ((ActorInScene) e.nextElement()).x + "," + ((ActorInScene) e.nextElement()).y + "));");
        }
        print(scene, "    }");
        print(scene, "");
        print(scene, "}");
        scene.close();
    }

    public void createFolders() {
        try {
            FileFolder = "Projects" + File.separator + projectname + File.separator + "Java" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava" + File.separator;
            File f1 = new File(FileFolder);
            f1.mkdirs();
            File f2 = new File("plugins" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava");
            copyDirectory(f2, f1);
        } catch (IOException ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    public void onSplashDispose() {
        init();
    }

    public void init() {
        utilities.addStringMessage("Installed G-Java!");
        // add toolbar button
        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);

        run.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        run(gcreator.window.getMainProject());
                    }
                });
        Aurwindow.tool.add(run);
    }

    public void createJavaFiles() throws IOException {
        FileWriter gameFW = new FileWriter(FileFolder + File.separator + "Game.java");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "package org.gcreator.compilers.gjava;");
        print(game, "import org.gcreator.compilers.gjava.components.*;");
        //import org.gcreator.compilers.gjava.components.Sprite;
        print(game, "import org.gcreator.compilers.gjava.core.basicgame;");
        print(game, "public class Game extends basicgame {");
        print(game, loadSprites + "G_Creator_NULL_SPRITE;");
        print(game, "    Game(){");
        print(game, "        loadScenes();");
        print(game, "        nextScene();");
        print(game, "    }");
        print(game, "   public void loadScenes(){");
        print(game, "  scenes = new Scene[" + scenes + "]; ");
        print(game, "" + loadscene);
        print(game, "    }");
        //Load sprites method
        print(game, createSprites + "}");
        print(game, "   public static void main(String[] args){");
        print(game, "       Runningas = \"Application\";");
        print(game, "       canvas=frame;");
        print(game, "       frame.setVisible(true);");
        print(game, "       new Game();");
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

//    public String varstatement(String type, String vars) {
//        System.out.println("G-java var");
//        return type+ " "+vars+";";
//    }
    
    
}
