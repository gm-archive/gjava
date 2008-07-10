/*
 * G-C# plugin
 */
package org.gcreator.compilers.GCS.plugin;

import org.gcreator.core.*;
import org.gcreator.plugins.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;
import java.io.*;
import java.awt.image.*;
import java.net.URL;
import sun.awt.image.*;
import javax.imageio.*;
import org.gcreator.components.*;
import java.util.*;
import org.gcreator.units.ActorInScene;
import org.gcreator.units.Tile;
import org.gcreator.units.TileLayer;

/**
 *
 * @author Luís
 */
public class GCSharp extends PlatformCore {

    public static class Comb {

        public Tileset t;
        public String name;

        public Comb(Tileset t, String name) {
            this.t = t;
            this.name = name;
        }
    }
    public GCSOptions settings;
    public static String projectname,  FileFolder;
    public static Vector<String> files = new Vector<String>(),  scenelist = new Vector<String>();
    public static Vector<Comb> tilelist = new Vector<Comb>();

    @Override
    public boolean checkvariable(String name) {
        if (name.equals("x"))
            return true;
        if (name.equals("y"))
            return true;
        if (name.equals("xprevious"))
            return true;
        if (name.equals("yprevious"))
            return true;
        if (name.equals("depth"))
            return true;
        if (name.equals("hspeed"))
            return true;
        if (name.equals("vspeed"))
            return true;
        if (name.equals("gravity"))
            return true;
        if (name.equals("gravity_direction"))
            return true;
        if (name.equals("solid"))
            return true;
        if (name.equals("speed"))
            return true;
        if (name.equals("direction"))
            return true;
        return false;
    }

    public void parseImage(ImageIcon i, GFile f) {
        System.out.println("Got here");
        PluginHelper.println("Parse image " + f.name);
        try {
            File tff = new File(FileFolder + "graphics");
            //
            PluginHelper.println("ttf=" + tff + "; exits=" + tff.exists());
            tff.mkdirs();
            File ff = new File(FileFolder + "graphics" + File.separator + f.name + "." + f.type);

            BufferedImage ii;
            if ((i.getImage()) instanceof ToolkitImage) {
                System.out.println("Toolkit");
                ii = ((ToolkitImage) (i.getImage())).getBufferedImage();
            } else {
                ii = (BufferedImage) i.getImage();
            }
            ImageIO.write(ii, f.type, ff);
        } catch (Exception e) {
            PluginHelper.println("Exception parsing image" + e.getMessage());
        }
    }

    public void parseSprite(Sprite s, GFile f) {
        //super.parseSprite(s);
        files.add(f.name + ".cs");
        try {
            FileWriter spr = new FileWriter(FileFolder + f.name + ".cs");
            BufferedWriter w = new BufferedWriter(spr);
            System.out.println("Go " + w.toString());
            print(w, "/*Automatically generated by G-C#*/");
            print(w, "");
            print(w, "using org.gcreator.Components;");
            print(w, "using org.gcreator.Support;");
            print(w, "");
            print(w, "public class " + f.name + " : Sprite");
            print(w, "{");
            print(w, "\tpublic " + f.name + "()");
            print(w, "\t{");
            print(w, "\t\tsetOrigin(" + s.originX + ", " + s.originY + ");");
            print(w, "\t\tsetImageArray(new Image[]");
            print(w, "\t\t{");
            for (int i = 0; i < s.countImages(); i++) {
                if (i != s.countImages() - 1) {
                    print(w, "\t\t\tnew Image(\"./graphics/" + s.getAt(i).name + "." + s.getAt(i).type + "\"),");
                } else {
                    print(w, "\t\t\tnew Image(\"./graphics/" + s.getAt(i).name + "." + s.getAt(i).type + "\")");
                }
            }
            print(w, "\t\t});");
            print(w, "\t\tsetBounds(new Rectangle(" + s.BBLeft + ", " + s.BBTop + ", " + (s.BBRight - s.width) + ", " + (s.BBBottom - s.height) + "));");
            print(w, "\t}");
            print(w, "}");
            w.close();
        } catch (IOException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
    }

    public void parseActor(Actor a, GFile f) {
        files.add(f.name + ".cs");
        System.out.println("Parsing actor " + f.name);
        if (a == null) {
            System.out.println("a is null");
        }
        try {
            System.out.println("Got here 1");
            FileWriter actorFW = new FileWriter(FileFolder + f.name + ".cs");
            System.out.println("Got here 2");
            BufferedWriter actor = new BufferedWriter(actorFW);
            System.out.println("Got here 3");
            print(actor, "using org.gcreator.Components;");
            System.out.println("Got here 5");
            print(actor, "using org.gcreator.Support;");
            print(actor, "using org.gcreator.Types;");
            print(actor, "");
            System.out.println("Got here 6");
            print(actor, "public class " + f.name + " : Actor");
            System.out.println("Got here 7");
            print(actor, "{");
            System.out.println("Got here 9");
            print(actor, "\tpublic " + f.name + "(Object x, Object y)" +
                    ": base(x,y, new Integer(" + a.depth + "))");
            System.out.println("Got here 10");
            print(actor, "\t{");
            print(actor, "\t\tsetVisible(new Boolean(" + a.visible + "));");
            if (a.sprite == null) {
                print(actor, "\t\tsetSprite(null);");
            } else {
                print(actor, "\t\tsetSprite(new " + a.sprite.name + "());");
            }
            print(actor, "\t}");
            print(actor, "");
            System.out.println("Got here 4");
            //events
            PluginHelper.println("Before loop");
            for (Enumeration e = a.events.elements(); e.hasMoreElements();) {
                Object m_evt = e.nextElement();
                PluginHelper.println("Loop");
                if (!(m_evt instanceof org.gcreator.events.Event)) {
                    PluginHelper.println("Invalid convertion");
                    continue;
                }
                org.gcreator.events.Event evt = (org.gcreator.events.Event) m_evt;
                if (evt instanceof org.gcreator.events.CreateEvent) {
                    print(actor, "\tpublic override void Create()");
                    System.out.println("Got here");
                }
                if (evt instanceof org.gcreator.events.BeginStepEvent) {
                    print(actor, "\tpublic override void BeginStep()");
                }
                if (evt instanceof org.gcreator.events.StepEvent) {
                    print(actor, "\tpublic override void Step()");
                }
                if (evt instanceof org.gcreator.events.EndStepEvent) {
                    print(actor, "\tpublic override void End()");
                }
                if (evt instanceof org.gcreator.events.DrawEvent) {
                    print(actor, "\tpublic override void Draw()");
                }
                print(actor, "\t{");
                PluginHelper.println("Got here 5");
                for (org.gcreator.actions.Action act : evt.actions) {
                    print(actor, parseGCL(act.getGCL(), this));
                }
                PluginHelper.println("And here too");
                print(actor, "\t}");
                print(actor, "");
            }
            print(actor, "}");
            actor.close();
            actorFW.close();
        } catch (Exception e) {
            PluginHelper.println(e.getMessage());
        }

    }

    public void parseClass(String s, String name) {
        files.add(name + ".cs");
        try {
            FileWriter scriptFW = new FileWriter(FileFolder + name + ".cs");
            BufferedWriter script = new BufferedWriter(scriptFW);
            print(script, "using org.gcreator.Components;");
            print(script, "using org.gcreator.Support;");
            print(script, "using org.gcreator.Scripting;");
            super.parseGCLClass(s, this);
        } catch (Exception e) {
        }
    }

    public void parseTileset(Tileset t, String name) {
        tilelist.add(new Comb(t, name));
    }

    public void parseScene(Scene s, GFile f) throws IOException {
        files.add(f.name + ".cs");
        FileWriter sceneFW = new FileWriter(FileFolder + f.name + ".cs");
        PluginHelper.println(FileFolder + f.name + ".cs");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "using org.gcreator.Components;");
        print(scene, "using org.gcreator.Support;");
        print(scene, "using org.gcreator.Types;");
        print(scene, "");
        print(scene, "public class " + f.name + " : Scene");
        print(scene, "{");
        print(scene, "\tpublic " + f.name + "(){}");
        print(scene, "\tpublic override void Create(){");
        print(scene, "\t\tbase.setWidth(" + s.width + ");");
        print(scene, "\t\tbase.setHeight(" + s.height + ");");
        if (s.drawbackcolor) {
            print(scene, "\t\tbase.setBackground(System.Drawing.Color.FromArgb(" + s.background.getRed() + ", " + s.background.getGreen() + ", " + s.background.getBlue() + "));");
        }
        print(scene, "\t\tActor c;");
        for (Enumeration<ActorInScene> e = s.actors.elements(); e.hasMoreElements();) {
            ActorInScene ais = e.nextElement();
            print(scene, "\t\taddActor(c = new " + ais.Sactor.name +
                    "(new Integer(" + ais.x + "), new Integer(" + ais.y + ")));");
            print(scene, "\t\tc.Create();");
        }
        for (Enumeration<TileLayer> e = s.tileLayers.elements(); e.hasMoreElements();) {
            TileLayer ais = e.nextElement();
            for (Tile t : ais.tiles) {
                String res = "\t\taddTile(new Tile(";
                res += "TilesetList.";
                res += t.file.name;
                res += ", ";
                res += t.x;
                res += ", ";
                res += t.y;
                res += ", ";
                res += t.tilex;
                res += ", ";
                res += t.tiley;
                res += ", ";
                res += t.width;
                res += ", ";
                res += t.height;
                res += ", ";
                res += ais.depth;
                res += ", true));";
                print(scene, res);
            }
        }
        print(scene, "\t}");
        print(scene, "}");
        scene.close();
    }

    public void createFolders() {
        try {
            java.lang.String osName = System.getProperty("os.name");
            if (osName.startsWith("Windows")) {
                FileFolder = getClass().getProtectionDomain().getCodeSource().getLocation().toString();
                FileFolder += "/";
                FileFolder = FileFolder.replaceAll("%20", " ");
                FileFolder = FileFolder.replaceAll("file:", "").replaceAll("\\./plugins/", "").replaceAll("//+", "/");
                FileFolder = FileFolder.replaceAll("/\\\\", "/");
                FileFolder = FileFolder.replaceAll("\\\\/", "/");
                FileFolder = FileFolder.replaceAll("//", "/");
                FileFolder = FileFolder.substring(1, 2) + ":" + File.separator;
            } else {
                FileFolder = "/tmp/";
            }
            FileFolder += "Projects" + File.separator + projectname + File.separator + "CSharp" + File.separator;
            File f1 = new File(FileFolder);
            if (f1.exists()) {
                f1.delete();
            }
            f1.mkdirs();

            String t = getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
            t = t.replaceAll("\\./", "");
            try {
                t = t.replaceAll("/+", File.separator);
            } catch (Exception e) {
            }
            t = t.replaceAll("%20", " ");
            t = t.replaceAll("\\\\", File.separator);
            t = t.replaceAll("file:/*", "") + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "GCS" + File.separator + "require";
            if (osName.startsWith("Windows")) {
                if (t.startsWith("/") || t.startsWith("\\")) {
                    t = t.substring(1);
                }
            } else {
                if (!t.startsWith("/") && !t.startsWith("~")) {
                    t = "/" + t;
                }
            }
            PluginHelper.println(t);

        } catch (Exception ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    public void copy(InputStream from, String to) {
        File f = new File(to);
        try {
            FileOutputStream fo = new FileOutputStream(f);

            int c = 0;
            while ((c = from.read()) != -1) {
                fo.write(c);
            }

            fo.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void copyRequired(String file, String to) {
        copy(
                getClass().getResourceAsStream(
                "/org/gcreator/compilers/GCS/require/" + file), to + file);
    }

    public GCSharp() {
        VarsRegistry.setVariable("gcs.version", "draft");
        settings = new GCSOptions();
    }

    public void createSharpFiles(Project p) throws IOException {
        copyRequired("SDL.dll", FileFolder);
        copyRequired("SDL_image.dll", FileFolder);
        copyRequired("SDL_mixer.dll", FileFolder);
        copyRequired("SdlDotNet.dll", FileFolder);
        copyRequired("Tao.Sdl.dll", FileFolder);
        copyRequired("gmcs.bat", FileFolder);
        copyRequired("jpeg.dll", FileFolder);
        copyRequired("libGCS.dll", FileFolder);
        copyRequired("tiff.dll", FileFolder);
        (new File(FileFolder + "fonts/")).mkdir();
        copyRequired("CourierNew.ttf", FileFolder + "fonts/");
        files.add("Game.cs");
        FileWriter gameFW = new FileWriter(FileFolder + "Game.cs");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "/*Automatically generated by G-C#*/");
        print(game, "");
        print(game, "using org.gcreator.Components;");
        print(game, "using org.gcreator.Native;");
        print(game, "");
        print(game, "public class Application");
        print(game, "{");
        print(game, "\tprivate static Scene[] scenelist = new Scene[]");
        print(game, "\t{");
        int i = p.findFromName("$218");
        if (i > 0) {
            GObject ff = p.childAt(i);
            if (ff != null && ff instanceof GFile) {
                GFile f = (GFile) ff;
                if (f.value != null && f.value instanceof org.gcreator.fileclass.res.SettingsValues) {
                    org.gcreator.fileclass.res.SettingsValues s = (org.gcreator.fileclass.res.SettingsValues) f.value;
                    org.gcreator.fileclass.res.TabValues Scenes = s.getValue("Scene Order");
                    Vector v = (Vector) Scenes.getValue("Scenes");
                    for (Enumeration t = v.elements(); t.hasMoreElements();) {
                        GFile o = (GFile) t.nextElement();
                        print(game, "\t\tnew " + o.name + "()" + (t.hasMoreElements() ? "," : ""));
                    }
                }
            }
        }
        print(game, "\t};");
        print(game, "");
        print(game, "\t[System.STAThread]");
        print(game, "\tpublic static void Main(string[] args)");
        print(game, "\t{");
        print(game, "\t\tSDL.Game game = new SDL.Game(scenelist, false, true, \"G-C# Application\");");
        print(game, "\t\tgame.Run();");
        print(game, "\t}");
        print(game, "}");
        game.close();
    }

    public void run(Project proj) {
        System.out.println("Saving...");
        if (gcreator.panel.istabs) {
            for (int ii = 0; ii < gcreator.panel.tabs.getTabCount(); ii++) {
                if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project.equals(GPanel.getMainProject()) && ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < gcreator.panel.mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().project.equals(GPanel.getMainProject()) && ((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        projectname = proj.name;
        PluginHelper.println("Building/running using StarFish (C#)");
        createFolders();
        files.clear();
        tilelist.clear();
        super.run(proj);
        try {
            createSharpFiles(proj);
        } catch (Exception e) {
        }

        p.dispose();
        GCSCompiler compiler = new GCSCompiler(this);
        p.setVisible(false);
    }
    JMenuItem menuItem;

    @Override
    public void onSplashDispose() {
        PluginHelper.println("Installed StarFish (C#)");
        PluginHelper.addGlobalTab("StarFish (C#)", settings);
        //JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);
        /*run.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent evt) {
        run(Aurwindow.getMainProject());
        }
        });*/
        menuItem = new JMenuItem("Compile with StarFish (C#)");
        menuItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                //run(Aurwindow.getMainProject());
                startprogress();
            }
        });

        PluginHelper.addMenuItem(3, menuItem);
        version = 0.2;
        updateURL = "http://g-creator.org/update/G-CSharp/update.xml";
        update();
    //Aurwindow.tool.add(run);
    }

    @Override
    public void uninstall() {
        PluginHelper.removeMenuItem(3, menuItem);
    }

    @Override
    public Object onSignalReceived(PluginCore caller, Object signal) {
        if (signal instanceof Object[]) {
            Object[] args = (Object[]) signal;
            if (args[0] instanceof String && ((String) args[0]).equals("compile")) {
                for (int i = 1; i < args.length; i++) {
                    if (args[i] != null && args[i] instanceof Project) {
                        run((Project) args[i]);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String getID() {
        return "G-C#";
    }
}
