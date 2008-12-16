package org.dolphin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.dolphin.parser.PlatformCore;
import org.dolphin.parser.gscriptLexer;
import org.dolphin.parser.gscriptParser;
import org.lateralgm.file.GmFile;
import org.lateralgm.file.GmFormatException;
import org.lateralgm.resources.GmObject;
import org.lateralgm.resources.Room;
import org.lateralgm.resources.sub.Action;
import org.lateralgm.resources.sub.BackgroundDef;
import org.lateralgm.resources.sub.Event;
import org.lateralgm.resources.sub.Instance;
import org.lateralgm.resources.sub.MainEvent;
import org.lateralgm.resources.sub.Tile;
import org.lateralgm.resources.sub.View;

public class DolphinWriter {

    DolphinFrame df;
    GmFile gmFile;
    String FileFolder, filename;
    File location;

    public DolphinWriter(DolphinFrame df, GmFile gmFile, File file) {
        filename = gmFile.filename.substring(gmFile.filename.lastIndexOf(File.separator) + 1);
        df.progress(1, "Starting to parse files", "Starting Dolphin for " + filename);
        this.df = df;
        this.gmFile = gmFile;
        this.location = file;
        this.FileFolder = file.getPath() + File.separator + "Dolphin Projects" + File.separator + filename + File.separator;
        new File(FileFolder).mkdirs();
        try {
            parseObjects();
            parseRooms();
        } catch (Exception e) {
            showException(e);
        }
    }

    public void createFolders() {
        System.out.println("Moving folders");

    }

    void parseBackgrounds() {
        for (org.lateralgm.resources.Background b : gmFile.backgrounds) {
        }
    }

    void parseObjects() throws GmFormatException {
        ArrayList<String> names = new ArrayList<String>(gmFile.gmObjects.size());

        for (GmObject a : gmFile.gmObjects) {
            /*check for duplicate objects*/
            String name = a.getName();
            if (names.contains(name)) {
                throw new GmFormatException(gmFile, "Duplicate object name: " + name);
            }
            try {
                FileWriter actorFW = new FileWriter(FileFolder + name + ".java");
                BufferedWriter actor = new BufferedWriter(actorFW);

                print(actor, "package org.dolphin.game;");

                print(actor, "public class " + name + " extends Actor {");
                print(actor, "");
                print(actor, " public   " + name + "(int X,int Y,double instance_id) {");

                if (a.getSprite() == null) {
                    print(actor, "        super(\"" + a.getName() + "\", null, " + a.solid + ", " + a.visible + ", " + a.depth + ", " + a.persistent + ");");
                } else {
                    print(actor, "        super(\"" + a.getName() + "\", Game.thegame.loadSprite(" + a.getSprite().get().getName() + "," + a.solid + ", " + a.visible + ", " + a.depth + ".0 , " + a.persistent + ");");
                }
                print(actor, "        xstart = X;xprevious=X;yprevious=Y;");
                print(actor, "        ystart = Y;");
                print(actor, "        x = X;");
                print(actor, "        y = Y;");
                print(actor, "        this.instance_id = instance_id;");
                print(actor, "    }");

                for (int j = 0; j < 11; j++) {
                    for (Event ev : a.mainEvents[j].events) {
                        if (j == 0) {
                            writeCreateEvent(actor, ev);
                        }
                        else if (j==1){writeDestroyEvent(actor, ev);}
                        System.out.println("" + ev.id + " " + getActionsCode(ev));
                    }
                }

                print(actor, "");
                actor.close();
            } catch (Exception e) {
                showException(e);
            }
        }
    }

    public void writeCreateEvent(BufferedWriter actor, Event ev) throws IOException {
        print(actor, "  public void Create() {");
        print(actor, " " + parseGCL(getActionsCode(ev)));
        print(actor, " }");
    }

    public void writeDestroyEvent(BufferedWriter actor, Event ev) throws IOException {
        print(actor, "  public void Destroy() {");
        print(actor, " " + parseGCL(getActionsCode(ev)));
        print(actor, " }");
    }
    PlatformCore pc = new PlatformCore();

    public String parseGCL(String code) throws IOException {
        //change code simply for testing
        gscriptParser parser;
        gscriptLexer lex = null;

        //code = "int i; int ii; int iii; { me = 3; if (5==2) {}} /* hey */  return 8;";
        //System.out.println("CODE:"+code);
        FileWriter ftempcode = new FileWriter("tempcode.gcl");
        BufferedWriter tempcode = new BufferedWriter(ftempcode);
        tempcode.write(code);
        tempcode.close();
        //System.out.println("test");
        lex = new gscriptLexer(new ANTLRFileStream(new File("tempcode.gcl").getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        try {
            parser = new gscriptParser(tokens);
            //parser.DEFAULT_TOKEN_CHANNEL=80;

            parser.setPlatform(pc);


            parser.code();

            System.out.println("Finished! Code output:" + pc.returncode);
        } catch (Exception e) {
            System.out.println("Error with parser:" + e + e.getLocalizedMessage() + " " + e.getMessage() + "\n code:" + code);
        }
        return pc.returncode;
    }


    /*credits to enigma team for this code*/
    public String getActionsCode(Event ev) {
        String code = "";
        for (Action act : ev.actions) {

            if (act.getLibAction().actionKind == Action.ACT_CODE) {
                code += act.getArguments().get(0).getVal() + System.getProperty("line.separator");
            } else {
                /*if (!actionDemise)
                {
                String mess = "Warning, you have a D&D action which is unsupported by this compiler."
                + " This and future unsupported D&D actions will be discarded.";
                JOptionPane.showMessageDialog(null,mess);
                actionDemise = true;
                }*/
            }
        }
        return code;
    }

    void showException(Exception e) {
        e.printStackTrace();
        df.progress(0, "Exception failed to convert!", "Error:" + e.getMessage() + "" + e.getStackTrace());
    }

    void parseRooms() {
        // out.write4(f.rooms.size());
        for (Room r : gmFile.rooms) {
            try {
                FileWriter sceneFW = new FileWriter(FileFolder + r.getName() + ".java");
                BufferedWriter scene = new BufferedWriter(sceneFW);

                print(scene, "package org.dolphin.game;");
                print(scene, "");

                print(scene, "import java.awt.Color;");
                print(scene, "import org.dolphin.game.core.*;");
                print(scene, "import org.dolphin.game.api.*;");
                print(scene, "import org.dolphin.game.api.Integer;");
                print(scene, "import org.dolphin.game.api.Double;");
                print(scene, "import org.dolphin.game.api.components.Background;");

                print(scene, "public class " + r.getName() + " extends org.dolphin.game.api.components.Room2D {");
                print(scene, "");
                print(scene, "	public " + r.getName() + "() {");
                print(scene, "		super(Game.frame," + r.caption + "," + r.speed + "," + r.width + "," + r.height + ",new Color(" + r.backgroundColor.getRed() + "," + r.backgroundColor.getGreen() + "," + r.backgroundColor.getBlue() + "," + r.drawBackgroundColor + "," + r.persistent + "," + r.getId() + ");");
                print(scene, "      this.vectorid=vectorid;");
                print(scene, "  }");
                print(scene, "");
                print(scene, "  protected void setupScene() {");
                print(scene, "");

                /*create the instances*/
                for (int i = 0; i < r.instances.size(); i++) {
                    Instance in = r.instances.get(i);
                    print(scene, "    instances.add(new " + in.getObject().get().getName() + "(" + in.getPosition().x + ", " + in.getPosition().y + ", " + in.instanceId + "));");
                }
                print(scene, "    /*Create the backgrounds*/");
                /*Create the backgrounds*/
                for (int i = 0; i < r.backgroundDefs.length; i++) {
                    BackgroundDef b = r.backgroundDefs[i];
                    System.out.println("b.backgroundId:" + b.backgroundId);
                    if (b.backgroundId != null) {
                        print(scene, "backgrounds.add(new Background()Game." + b.backgroundId.get().getName() + ");");
                    }
                //TODO fix the above code to write backgrounds
                }

                print(scene, "    /*Create the tiles*/");
                /*Create the tiles*/
                for (int i = 0; i < r.tiles.size(); i++) {
                    Tile t = r.tiles.get(i);
                    if (t != null) {
                        print(scene, "tiles.add(new Tile(" + t.getRoomPosition().x + ", " + t.getRoomPosition().y + "," + t.getBackgroundPosition().x + ", " + t.getBackgroundPosition().y + ", " + t.getSize().width + "," + t.getSize().height + "" + t.getDepth() + ", " + t.tileId + ",Game." + t.getBackground().get().getName() + ");");
                    }
                }

                print(scene, "    /*Create the views*/");
                /*Create the tiles*/
                for (int i = 0; i < r.views.length; i++) {
                    View v = r.views[i];
                    if (v != null) {
                        print(scene, "views.add(new View(" + v.viewX + ", " + v.viewY + "," + v.viewW + ", " + v.viewH + ", " + v.portX + "," + v.portY + "" + v.portW + ", " + v.portH + "," + v.hspeed + "," + v.vspeed + "," + v.hbor + "," + v.vbor + "," + v.visible + ");");
                    }
                }

                print(scene, "");
                print(scene, "  }");//end setupScene
                scene.close();
            } catch (Exception e) {
                showException(e);
            }
        }
    }

    /*
     * Print a line to the BufferedWriter
     */
    public static void print(BufferedWriter file, String printString) throws IOException {
        file.write(printString);
        file.newLine();
    }
}
