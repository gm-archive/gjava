
package org.gcreator.compilers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import org.gcreator.compilers.gjava.api.Constants;
import org.gcreator.compilers.gjava.api.Variables;
import org.gcreator.components.ExtendedFrame;
import org.gcreator.components.TabPanel;
import org.gcreator.components.impl.ToolbarButton;
import org.gcreator.core.GPanel;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.events.CreateEvent;
import org.gcreator.events.Event;
import org.gcreator.events.KeyboardEvent;
import org.gcreator.events.MouseEvent;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.GObject;
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

    private JMenuItem menuItem;
    public static String projectname,  FileFolder;
    public static int sprites = 0,  actors = 0,  scenes = 0,  fonts = 0;
    String loadscene = "", loadSprites = "public static Sprite ", createSprites = "public void loadSprites() { ",script="";
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
            System.out.println("Parse Image:"+f.name+f.type);
            File ff = new File(FileFolder + f.name + "." + f.type);
            if(!ff.exists())
                ff.createNewFile();
            FileOutputStream fos = new FileOutputStream(ff);

            fos.write(baos.toByteArray());
            fos.close();
        } catch (Exception e) {
            System.out.println("Exception parsing image"+e.getMessage());
        }
    }

    public void parseSprite(Sprite s, GFile f) {
        //super.parseSprite(s);
        
        loadSprites += f.name + ",";
        createSprites += f.name + " = new Sprite(\"" + f.name + "\"," + s.height + ", " + s.width + ", " + s.BBLeft + ", " + s.BBRight + ", " + s.BBBottom + ", " + s.BBTop + ", " + s.originX + ", " + s.originY + ", new BufferedImage[]{";
        for (Enumeration e = s.Simages.elements(); e.hasMoreElements();) {
            try {
            org.gcreator.fileclass.GFile a = (org.gcreator.fileclass.GFile) e.nextElement();
            createSprites += "getImage(\"" + a.name + "."+ a.type + "\"),";
                System.out.println("Write sprite:"+a.name+a.type);
        //if(a!=null)
            } catch(Exception ee){System.out.println("exception"+ee.getLocalizedMessage());}
        }

        createSprites = createSprites.substring(0, createSprites.length()-1)+"});";
    }

    public void parseActor(Actor a, GFile f) {
        try {
            String keypress="public void KeyPressed(int keycode) {",keyrelease="public void KeyReleased(int keycode) {";
            String callevents="public void callEvents() { ", endcall=" checkCollision(); Move(); }";
            String collision = "public void checkCollision() { for (int i = 0; i < Game.Current.instances.size(); i++){Actor G_Java_a = ((Actor)Game.Current.instances.elementAt(i)); if (G_Java_a == this) return;";
            FileWriter actorFW = new FileWriter(FileFolder + File.separator + f.name + ".java");
            BufferedWriter actor = new BufferedWriter(actorFW);
            print(actor, "package org.gcreator.compilers.gjava;");
            print(actor, "import org.gcreator.compilers.gjava.api.components.*;");
            print(actor, "import org.gcreator.compilers.gjava.api.*; import java.awt.Graphics2D; import org.gcreator.compilers.gjava.api.Actor;import org.gcreator.compilers.gjava.api.Object;import org.gcreator.compilers.gjava.api.String;import org.gcreator.compilers.gjava.api.Integer;import org.gcreator.compilers.gjava.api.Double;import org.gcreator.compilers.gjava.api.Boolean;");
            print(actor, "");

            print(actor, "public class " + f.name + " extends Actor {");
            print(actor, "");
            print(actor, "    " + f.name + "(int X,int Y,double instance_id) {");
            if (a.sprite == null) {
                print(actor, "        super(\"" + f.name + "\", null, "+a.solid +", "+a.visible+", "+a.depth+", "+a.persistant+");");
            } else {
                print(actor, "        super(\"" + f.name + "\", Game." + a.sprite.name + ","+a.solid +", "+a.visible+", "+a.depth+".0 , "+a.persistant+");");
            }
            print(actor, "        xstart = X;xprevious=X;yprevious=Y;");
            print(actor, "        ystart = Y;");
            print(actor, "        x = X;");
            print(actor, "        y = Y;");
            print(actor, "        this.instance_id = instance_id;");
            print(actor, "    }");
            
            
            
            //events
            for (Enumeration e = a.events.elements(); e.hasMoreElements();)
            {
            Event ev = (Event)e.nextElement();
            event = ev+"";
            if (ev instanceof CreateEvent) {
            print(actor, "  public void Create()");
            //event="Create";
            }
            else if (ev instanceof org.gcreator.events.DestroyEvent) {
            print(actor, "  public void Destroy()");
            //event="Destroy";
            }
            else if (ev instanceof org.gcreator.events.BeginStepEvent) {
            print(actor, "  public void BeginStep()");
            event="Begin Step";
                //System.out.println("callevents:"+callevents);
                try{
            callevents= callevents.replaceAll("\\{", "\\{ BeginStep();");
                }catch(Exception ex){
                //System.out.println("Begin step exception:"+ex);
                }
            //System.out.println("callevents:"+callevents);
            }
            else if (ev instanceof org.gcreator.events.StepEvent) {
            print(actor, "  public void Step()");
            event="Step";
            callevents+="Step();";
            }
            else if (ev instanceof org.gcreator.events.EndStepEvent) {
                System.out.println("endstep");
            print(actor, "  public void EndStep()");
            event="End Step";
               // System.out.println("endcall:"+endcall);
            endcall= "EndStep();" + endcall;
            //System.out.println("endcall:"+endcall);
            }
            else if (ev instanceof org.gcreator.events.DrawEvent) {
            print(actor, "  public void Draw_event(Graphics2D g)");
            event="Draw";
            }
            else if (ev instanceof org.gcreator.events.CollisionEvent) {
            print(actor, "  public void CollisionWith"+((org.gcreator.events.CollisionEvent)ev).other.name+"(Actor other){ if (other.getBounds().intersects(getBounds()) && other instanceof "+((org.gcreator.events.CollisionEvent)ev).other.name+"){  if (other.getSolid().getBoolean()){x=xprevious;y=yprevious;}");
            event="Collision With"+((org.gcreator.events.CollisionEvent)ev).other.name;
            collision+="CollisionWith"+((org.gcreator.events.CollisionEvent)ev).other.name+"(G_Java_a); ";
            //callevents+="checkCollision();";
            }
            else if (ev instanceof org.gcreator.events.MouseEvent) {
                callevents+="Mouse"+((MouseEvent)ev).type+"(); ";
            print(actor, "  public void Mouse"+((org.gcreator.events.MouseEvent)ev).type+"() {");
            event="Mouse";
            int type=((MouseEvent)ev).type;
            
//            print(actor, "System.out.println(\"x1:\"+(int)(sprite.BBRight+x-sprite.sprite_xoffset)); ");
//        print(actor, "System.out.println(\"x2:\"+(int)(sprite.BBTop+y-sprite.sprite_yoffset)); ");
//        print(actor, "System.out.println(\"right:\"+(int)(x-sprite.sprite_xoffset+sprite.BBLeft));"); 
//        print(actor, "System.out.println(\"bottom:\"+(int)(y-sprite.sprite_yoffset+sprite.BBBottom)); ");
            
            if (type == 5006) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON1))");//return "Left Button Clicked";
            if (type == 5007) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON1))");//return "Left Button Pressed";
            if (type == 5008) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMouseReleased(java.awt.event.MouseEvent.BUTTON1))");//return "Left Button Released";
            if (type == 5009) print(actor, "if (Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON1))");//return "Global Left Button Clicked";
            if (type == 5010) print(actor, "if (Game.game.getGame().bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON1))");//return "Global Left Button Pressed";
            if (type == 5011) print(actor, "if (Game.game.getGame().bsInput.isMouseReleased(java.awt.event.MouseEvent.BUTTON1))");//return "Global Left Button Released";
            if (type == 5012) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON3))");//return "Right Button Clicked";
            if (type == 5013) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON3))");//return "Right Button Pressed";
            if (type == 5014) print(actor, "if (Game.game.getGame().checkPosMouse((int)(sprite.BBRight+x-sprite.sprite_xoffset), (int)(sprite.BBTop+y-sprite.sprite_yoffset), (int)(x-sprite.sprite_xoffset+sprite.BBLeft), (int)(y-sprite.sprite_yoffset+sprite.BBBottom)) && Game.game.getGame().bsInput.isMouseReleased(java.awt.event.MouseEvent.BUTTON3))");//return "Right Button Released";
            if (type == 5015) print(actor, "if (Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON3))");//return "Global Right Button Clicked";
            if (type == 5016) print(actor, "if (Game.game.getGame().bsInput.isMousePressed(java.awt.event.MouseEvent.BUTTON3))");//return "Global Right Button Pressed";
            if (type == 5017) print(actor, "if (Game.game.getGame().bsInput.isMouseReleased(java.awt.event.MouseEvent.BUTTON3))");//return "Global Right Button Released";
            if (type == 5018) ;//return "Mouse Entered (Over)";
            if (type == 5019) ;//return "Mouse Exited (Out)";
            //default: ;//return "Invalid Mouse Event";
        
            }
            else if (ev instanceof org.gcreator.events.KeyPress) 
            {
                keypress+="Keypress"+((org.gcreator.events.KeyPress)ev).type+"(keycode); ";
                print(actor, "  public void Keypress"+((org.gcreator.events.KeyPress)ev).type+"(int keycode){");
                print(actor, "if (keycode == ("+((org.gcreator.events.KeyPress)ev).type+"))");
            event="Keypress "+((org.gcreator.events.KeyPress)ev).name;
            }
            else if (ev instanceof org.gcreator.events.KeyReleased) 
            {
                keyrelease+="Keyrelease"+((org.gcreator.events.KeyReleased)ev).type+"(keycode); ";
                print(actor, "  public void Keyrelease"+((org.gcreator.events.KeyReleased)ev).type+"(int keycode){");
                print(actor, "if (keycode == ("+((org.gcreator.events.KeyReleased)ev).type+"))");
            event="Keyrelease "+((org.gcreator.events.KeyReleased)ev).name;
            }
            else if (ev instanceof org.gcreator.events.KeyboardEvent) {
                callevents+="Keyboard"+((KeyboardEvent)ev).type+"(); ";
                print(actor, "  public void Keyboard"+((KeyboardEvent)ev).type+"() {");
                print(actor, "if (Game.game.getGame().keyDown("+((KeyboardEvent)ev).type+"))");
            event="Keyrelease "+((org.gcreator.events.KeyboardEvent)ev).name;
            }
            
            //Parse actions
            print(actor, "    {");
            for (Enumeration ee = ev.actions.elements(); ee.hasMoreElements();)
            {
              org.gcreator.actions.Action G_Java_aa =  (org.gcreator.actions.Action)ee.nextElement();
                System.out.println("about to parse actions");
              print(actor,parseGCL(G_Java_aa.getGCL(),this));
              System.out.println("action parsed:"+G_Java_aa.getGCL());
              //parseGCL(";;; {}",this);
            }
             print(actor, "    }");
             
             
            if (ev instanceof org.gcreator.events.KeyboardEvent || ev instanceof org.gcreator.events.MouseEvent)
            print(actor, "    }");
            if (ev instanceof org.gcreator.events.CollisionEvent)
            {print(actor, "    }");print(actor, "    }");}
            
            }
            print(actor, collision+"}}");
            print(actor, callevents+endcall);
            print(actor, keypress+"} "+keyrelease+"}");
            print(actor, "");
            print(actor, "}");
            actor.close();
        } catch (Exception e) {
        }
actorindex++;
    }
    
    @Override
    public void parseScript(String code,String name)
    {
        try {
           script+= this.parseGCL(code, this);
        } catch (IOException ex) {
            Logger.getLogger(GJava.class.getName()).log(Level.SEVERE, null, ex);
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

    public void parseScene(Scene s, GFile f) throws IOException {
        loadscene += "    scenes[" + scenes + "] = new " + f.name + "();";
        scenes++;
        FileWriter sceneFW = new FileWriter(FileFolder + File.separator + f.name + ".java");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "package org.gcreator.compilers.gjava;");
        print(scene, "");
        





        print(scene, "import java.awt.Color;");
        print(scene, "import org.gcreator.compilers.gjava.core.*;");
        print(scene, "import org.gcreator.compilers.gjava.api.*;");
        print(scene, "import org.gcreator.compilers.gjava.api.Integer;");
        print(scene, "import org.gcreator.compilers.gjava.api.Double;");
        print(scene, "import org.gcreator.compilers.gjava.api.components.Background;");
        
        print(scene, "public class " + f.name + " extends org.gcreator.compilers.gjava.gtge.Scene2D {");
        print(scene, "");
        print(scene, "    " + f.name + "() {");
        if (s.drawbackcolor) {
            print(scene, "        super(Game.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", new Color(" + s.background.getRed() + "," + s.background.getGreen() + "," + s.background.getBlue() + "));");
        } else {
            print(scene, "        super(Game.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", Color.black);");
        }
        print(scene, "    setupScene();");
        print(scene, "    SortDepth();");
        print(scene, "    }");
        print(scene, "    private void setupScene() {");
        
        for(int i=0; i<s.actors.size(); i++)
        print(scene, "instances.add(new " + ((ActorInScene) s.actors.get(i)).Sactor.name + "(" + ((ActorInScene) s.actors.get(i)).x + "," + ((ActorInScene) s.actors.get(i)).y + ","+((ActorInScene) s.actors.get(i)).id +"));");

        
        //write backgrounds
        print(scene,"backgrounds.add(new Background(false,0,0,0,0,0,0,0,0,0,0,0,0,0,null));");
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
            f1=new File("Projects" + File.separator + projectname + File.separator + "Java" + File.separator+"com"+ File.separator);
            f2=new File("plugins"+ File.separator+"com"+ File.separator);
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
                run(GPanel.getMainProject());
            }
        });
        ToolbarManager.toolbuttons.add(btn);
    }
    
    public void init() {
        utilities.addStringMessage("Installed G-Java!");
        //compilername = "GJava";
        version=0.4;
        updateURL="http://g-creator.org/update/G-Java/update.xml";
        update();
        
        //Reset important variables
        loadscene = "";
        loadSprites = "public static Sprite ";
        createSprites = "public void loadSprites() { ";
        script="";
        // add toolbar button
//        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);
//
//        run.addActionListener(new ActionListener() {
//
//                    public void actionPerformed(ActionEvent evt) {
//                        run(Aurwindow.getMainProject());
//                    }
//                });
                
        menuItem = new JMenuItem("Compile with G-Java");
        menuItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
               // run(Aurwindow.getMainProject());
               startprogress();
            }
        });
        
        PluginHelper.addMenuItem(3, menuItem);
        //Aurwindow.tool.add(run);
    }
    
    

    public void createJavaFiles() throws IOException {
        FileWriter gameFW = new FileWriter(FileFolder + File.separator + "Game.java");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "package org.gcreator.compilers.gjava;");
        print(game, "import com.golden.gamedev.GameLoader; import com.golden.gamedev.engine.graphics.WindowedMode;");
        print(game, "import java.awt.*;");
        print(game, "import org.gcreator.compilers.gjava.api.*;");
print(game, "import org.gcreator.compilers.gjava.api.components.*;");
print(game, "import org.gcreator.compilers.gjava.gtge.Scene2D;");

        print(game, "import java.awt.image.BufferedImage;");
        print(game, "public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {");
        print(game, loadSprites + "G_Creator_NULL_SPRITE;");
        print(game, "    Game(){");
        print(game, "//loading image code will go here");
        print(game, "//loadSprites();");
        print(game, "  //      loadScenes();");
        print(game, "    //    nextScene();");
        print(game, "    }");
        
        //scenes
        
        print(game, "   public void loadScenes(){");
        //print(game, "  scenes = new Scene2D[" + scenes + "]; ");
        //print(game, "" + loadscene);
        print(game, "scenes = new Scene2D[]{");
        int i = gcreator.panel.getMainProject().findFromName("$218");
        System.out.println("get scenes");
        boolean hasscenes=false;
        if (i > 0) {
            GObject ff = gcreator.panel.getMainProject().childAt(i);
            System.out.println("1");
            if (ff != null && ff instanceof GFile) {
                System.out.println("2");
                GFile f = (GFile) ff;
                if (f.value != null && f.value instanceof org.gcreator.fileclass.res.SettingsValues) {
                    System.out.println("3");
                    org.gcreator.fileclass.res.SettingsValues s = (org.gcreator.fileclass.res.SettingsValues) f.value;
                    System.out.println("s done"+s);
                    
                    org.gcreator.fileclass.res.TabValues Scenes = s.getValue("Scene Order");
                    
                    System.out.println("scenes:"+Scenes);
                    if(Scenes==null)
                    {
                        JOptionPane.showMessageDialog(null, "Error you haven't set the scene order, set it in the game settings first!","G-Java",JOptionPane.ERROR_MESSAGE);
                        System.out.println("null scenes");
                    }
                    Vector v = (Vector) Scenes.getValue("Scenes");
                    //System.out.println("Size:"+v.size());
                    for (Enumeration t = v.elements(); t.hasMoreElements();) {
                        
                        System.out.println("has scenes");
                        GFile o = (GFile) t.nextElement();
                        hasscenes=true;
                        print(game, "new " + o.name + "()" + (t.hasMoreElements() ? "," : ""));
                    }
                }
            }
        }
        if (hasscenes == false)
        {
            System.out.println("No scene order!");
            JOptionPane.showMessageDialog(null, "Error you haven't set the scene order, set it in the game settings first!","G-Java",JOptionPane.ERROR_MESSAGE);
        }
        print(game, "    };");
        print(game, "    }");
        //Load sprites method
        print(game, createSprites + "}");
        print(game, "   public static void main(java.lang.String[] args){");
        print(game, "       Runningas = \"Application\";");
        print(game, "       game = new GameLoader();");
        print(game, "       game.setup(new Game(), new Dimension(640,480), false); frame=((WindowedMode)Game.game.getGame().bsGraphics).getFrame();");
        print(game, "       game.start();");
        print(game, "   }");
        print(game, "}");
        game.close();
    }
    
    public void convertVariables(String filename){
        String search="";
        String replace="";
        Patch.main(new String[] {search,replace,filename});
    }

    public void run(Project project) {
        if (project == null) {
            System.out.println("Error: Can't compile null!");
            return;
        }
        System.out.println("Saving...");
        if (gcreator.panel.istabs) {
            for (int ii = 0; ii < gcreator.panel.tabs.getTabCount(); ii++) {
                if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project.equals(GPanel.getMainProject()) && ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            JDesktopPane mdi = gcreator.panel.mdi.getDesktop();
            for (int ii = 0; ii < mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project.equals(GPanel.getMainProject()) && ((ExtendedFrame) mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) mdi.getComponent(ii)).getPanel().Save();
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
       // this.p.jLabel1.setText("Converting to java with G-java");
        
        createFolders();
        super.run(project);
        try {
            createJavaFiles();
        } catch (Exception e) {
        }
        p.dispose();
        GJavaCompiler compiler = new GJavaCompiler();
        p.setVisible(false);
    }

    @Override
    public void parseSettings(String string, String name) {
      //  System.out.println("got here!");
    }
    
     
    @Override
    public Object onSignalReceived(PluginCore caller, Object signal){
        try {
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
        } catch (NullPointerException exc) {
            return false;
        }
        return false;
    }
    
    @Override
    public String getID(){
        return "G-Java";
    }

    @Override
    public boolean checkvariable(String name) {
        //return super.checkvariable(name);
       // System.out.println("check variable");
        java.lang.String nm= name;
         try {
            
            Method m = org.gcreator.compilers.gjava.api.Actor.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
            return true;
        } catch (NoSuchMethodException ex) {
            System.out.println("no method"+ex);
            try{
            Method m = Variables.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
            return true;
            }catch(Exception e){
            System.out.println("no method"+e);
            try{
            Method m = Constants.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
            return true;
            }catch(Exception ee){
            System.out.println("no method"+ee);
            }
            }
           
        } catch (SecurityException ex) {
            System.out.println("security:"+ex);
            
        }
         return false;
    }
    
    public boolean checkfunction(String name) {
        //return super.checkvariable(name);
//       System.out.println("Check function:"+name);
//        java.lang.String nm= name;
//         try {
//            
//            Method m = org.gcreator.compilers.gjava.api.GCL.class.getDeclaredMethod(name, new Class[]{});
//            return true;
//        } catch (NoSuchMethodException ex) {
//            System.out.println("no function:"+ex);
//            try{
//            Method m = Actor.class.getDeclaredMethod(name, new Class[]{});
//            return true;
//            }catch(Exception e){
//            System.out.println("no function: "+e);
//            
//            }
//           
//        } catch (SecurityException ex) {
//            System.out.println("security:"+ex);
//            
//        }
         return true;
    }

//    public String varstatement(String type, String vars) {
//        System.out.println("G-java var");
//        return type+ " "+vars+";";
//    }
    
    @Override
    public void uninstall() {
        PluginHelper.removeMenuItem(3, menuItem);
    }
}
