/*
 * ImportGM6.java
 *
 * Created on 6/Out/2007, 19:58:31
 *
 * Based on Lateral Game Maker GmFileReader
 */
package org.gcreator.utils.GMImporter;

import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;
import java.util.zip.*;
import javax.swing.*;
import org.gcreator.actions.components.VSpeedEditor;
import org.gcreator.actions.mainactions.EndOfABlock;
import org.gcreator.actions.mainactions.ExecuteCode;
import org.gcreator.actions.mainactions.SetVSpeed;
import org.gcreator.actions.mainactions.StartOfABlock;
import org.gcreator.components.ProjectTypes;
import org.gcreator.core.*;
import org.gcreator.events.CreateEvent;
import org.gcreator.events.DestroyEvent;
import org.gcreator.events.DrawEvent;
import org.gcreator.events.StepEvent;
import org.gcreator.fileclass.GameProject;
import org.gcreator.managers.*;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.res.*;
import org.lateralgm.file.*;
import org.lateralgm.file.iconio.*;
import org.gcreator.plugins.*;
//import org.lateralgm.messages.*;
/**
 *
 * @author Luís
 */
public class GM6Importer {

    public static final byte LOADBAR_NONE = 0;
    public static final byte LOADBAR_DEFAULT = 1;
    public static final byte LOADBAR_CUSTOM = 2;
    
    public static final byte EV_CREATE = 0;
    public static final byte EV_DESTROY = 1;
    public static final byte EV_ALARM = 2;
    public static final byte EV_STEP = 3;
    public static final byte EV_COLLISION = 4;
    public static final byte EV_KEYBOARD = 5;
    public static final byte EV_MOUSE = 6;
    public static final byte EV_OTHER = 7;
    public static final byte EV_DRAW = 8;
    public static final byte EV_KEYPRESS = 9;
    public static final byte EV_KEYRELEASE = 10;
    
    public static final byte EXEC_NONE = 0;
    public static final byte EXEC_FUNCTION = 1;
    public static final byte EXEC_CODE = 2;

    private GM6Importer() {
    }

    static class GmFileContext {

        org.gcreator.fileclass.GameProject pro;
        GmStreamDecoder in;

        GmFileContext(org.gcreator.fileclass.GameProject pro, GmStreamDecoder in) {
            this.pro = pro;
            this.in = in;
        }
        
        Vector<org.gcreator.fileclass.GFile> sprites = new Vector<org.gcreator.fileclass.GFile>();
    }

    private static GmFormatException versionError(String error, String res, int ver) {
        return versionError(error, res, 0, ver);
    }

    private static GmFormatException versionError(String error, String res, int i, int ver) {
        JOptionPane.showMessageDialog(null, "This game maker file version is unnsupported make sure it is a valid gm6 file.");
        return new GmFormatException("Unsupported"); //$NON-NLS-1$
    }

    public GM6Importer(String fileName) throws IOException, GmFormatException, DataFormatException {
        System.out.println("Line 75, fileName=" + fileName);
        GmStreamDecoder in = null;
        long startTime = System.currentTimeMillis();
        in = new GmStreamDecoder(fileName);
        GameProject project = GameProject.balance(ProjectTypes.EMPTY_GAME);
        project.name = fileName.replaceAll("(.*(\\\\|/))(.*)\\..*", "$3");
        Aurwindow.setMainProject(project);
        org.gcreator.fileclass.GFile settings = (org.gcreator.fileclass.GFile) project.childAt(project.findFromName("$218"));
        settings.editable = false;
        GmFileContext c = new GmFileContext(project, in);
        int identifier = in.read4();
        if (identifier != 1234321) {
            throw new GmFormatException("Invalid"); //$NON-NLS-1$
        }
        int ver = in.read4();
        System.out.println("version:"+ver);
        if (ver < 600) {
            System.out.println("unsupported");
                    JOptionPane.showMessageDialog(null, "This game maker file version is unnsupported make sure it is a valid gm6 file.");
            String msg = "Unsupported"; //$NON-NLS-1$
            throw new GmFormatException(String.format(msg, "", ver)); //$NON-NLS-1$
        }
        System.out.println("read settings");
        SettingsValues values = readSettings(settings, c);
        
        readSounds(c);
        readSprites(c);
        readBackgrounds(c);
        readPaths(c);
        readScripts(c);
        readFonts(c);
        readTimelines(c);
        readActors(c);

        in.close();

        ProjectTree.importFolderToTree(project, PluginHelper.getWindow().top);
        PluginHelper.getWindow().workspace.updateUI();
        PluginHelper.getWindow().workspace.repaint();
    }

    private SettingsValues readSettings(org.gcreator.fileclass.GFile settings, GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        SettingsValues value;
        TabValues Graphics, Resolution, Other;
        settings.value = value = new SettingsValues();
        value.setVariable("Graphics", Graphics = new TabValues("Graphics"));
        value.setVariable("Resolution", Resolution = new TabValues("Resolution"));
        value.setVariable("Other", Other = new TabValues("Other"));

        GmStreamDecoder in = c.in;
        in.read4(); //Game ID - unused
        in.skip(16); // unknown bytes following game id
        int ver = in.read4();
        if (ver != 542 && ver != 600 && ver != 702) {
            String msg = "Unsupported"; //$NON-NLS-1$
            throw new GmFormatException(String.format(msg, "", ver)); //$NON-NLS-1$
        }
        boolean startFullscreen = in.readBool();
        boolean interpolate = false;
        if (ver > 542) {
            interpolate = in.readBool();
        }
        Graphics.setVariable("borderless", in.readBool());
        boolean displayCursor = in.readBool();
        int scaling = in.read4();
        if (ver == 530) {
            in.skip(8);
        } //"fullscreen scale" & "only scale w/ hardware support" 
        else {
            Graphics.setVariable("resize", in.readBool());
            boolean alwaysOnTop = alwaysOnTop = in.readBool();
            in.read4(); //Color outside room
        }
        Resolution.setVariable("setrereadBackgrounds(c);s", in.readBool());
        if (ver == 530) {
            in.skip(8); //Color Depth, Exclusive Graphics
            byte b = (byte) in.read4();
            if (b == 6) {
                Resolution.setVariable("resol", (Integer) 0);
            } else if (b == 5) {
                Resolution.setVariable("resol", (Integer) 1);
            } else {
                Resolution.setVariable("resol", (Integer) (b - 2));
            }
            b = (byte) in.read4();
            Resolution.setVariable("frequency", (Integer) ((b == 4) ? 0 : (b + 1)));
            in.skip(8); //vertical blank, caption in fullscreen
        } else {
            Resolution.setVariable("depth", (Integer) (in.read4() * 16));
            Resolution.setVariable("resol", (Integer) in.read4());
            Resolution.setVariable("frequency", (Integer) in.read4());
        }
        boolean dontShowButtons = in.readBool();
        boolean useSynchronization = false;
        if (ver > 530) {
            useSynchronization = in.readBool();
        }
        Other.setVariable("F4", (Boolean) in.readBool());
        boolean F1 = in.readBool();
        Other.setVariable("ESC", (Boolean) in.readBool());
        boolean F5andF6 = in.readBool();
        if (ver == 530) {
            in.skip(8);
        } //unknown bytes, both 0
        if (ver == 702) {
            in.skip(8);
        } //F9 screenshot, Treat close as esc
        int priority = in.read4();
        boolean losefocusfreeze = in.readBool();
        int loadBarMode = in.read4();
        BufferedImage back = null, front = null;
        if (loadBarMode == LOADBAR_CUSTOM) {
            if (in.read4() != -1) {
                back = in.readImage();
            } //back
            if (in.read4() != -1) {
                front = in.readImage();
            } //front
        }
        boolean showCustomLoadImage = in.readBool();
        BufferedImage loadingImage = null;
        if (showCustomLoadImage) {
            if (in.read4() != -1) {
                loadingImage = in.readImage();
            }
        }
        boolean imagePartiallyTransparent = in.readBool();
        int loadImageAlpha = in.read4();
        boolean scaleProgressBar = in.readBool();
        int length = in.read4();
        byte[] gameIconData = new byte[length];
        in.read(gameIconData, 0, length);
        BufferedImage gameIcon = null;
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(gameIconData);
            gameIcon = (BufferedImage) new ICOFile(bais).getDescriptor(0).getImageRGB();
        } catch (Exception e) {
            // hopefully this won't happen
            e.printStackTrace();
        }
        boolean displayErrors = in.readBool();
        boolean writeToLog = in.readBool();
        boolean abortOnError = in.readBool();
        boolean treatUninitializedAs0 = in.readBool();
        String author = in.readStr();
        String version;
        if (ver > 600) {
            version = in.readStr();
        } else {
            version = Integer.toString(in.read4());
        }
        double lastChanged = in.readD();
        String information = in.readStr();
        int no = in.read4();
        for (int i = 0; i < no; i++) {
            /*Constant con = new Constant();
            g.constants.add(con);*/
            /*con.name = */            in.readStr();
            /*con.value = */            in.readStr();
        }
        if (ver > 600) {
            in.skip(4); //Major
            in.skip(4); //Minor
            in.skip(4); //Release
            in.skip(4); //Build
            in.skip(in.read4()); //Company
            in.skip(in.read4()); //Product
            in.skip(in.read4()); //Copyright
            in.skip(in.read4()); //Description
        } else if (ver > 530) {
            no = in.read4();
            for (int i = 0; i < no; i++) {
                /*Include inc = new Include();
                g.includes.add(inc);
                inc.filePath = */                in.readStr();
            }
            int includeFolder = in.read4();
            boolean overwriteExisting = in.readBool();
            boolean removeAtGameEnd = in.readBool();
        }
        return value;
    }

    private void readSounds(GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        //Dumps sounds
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "SOUNDS", ver);
        } //$NON-NLS-1$ //$NON-NLS-2$
        int noSounds = in.read4();
        for (int i = 0; i < noSounds; i++) {
            if (!in.readBool()) {
                continue;
            }
            String name = in.readStr(); //Name
            ver = in.read4();
            if (ver != 440 && ver != 600) {
                throw versionError("IN", "SOUNDS", i, ver);
            }
            int kind53 = -1;
            if (ver == 440) {
                kind53 = in.read4();
            } //kind (wav, mp3, etc)
            else /*snd.kind = (byte) */ {
                in.read4();
            } //normal, background, etc
            String type = in.readStr(); //fileType
            if (type.equals("") || type == null) type ="wav";
            org.gcreator.fileclass.GFile soundFile;
            Group soundFolder = (Group) c.pro.childAt(c.pro.findFromName("$212"));
            soundFile = new org.gcreator.fileclass.GFile(soundFolder, name, type, null);
            Sound val;
            soundFile.value = val = new Sound(name);
            soundFile.type= type.replaceFirst(".", "");
            System.out.println("type:"+soundFile.type);
            //val.width = in.read4();
            if (ver == 440) {
                //-1 = no sound
		/*if (kind53 != -1) snd.data = in.decompress(*/                in.read4()/*)*/;
                in.skip(8);
                /*snd.preload = !*/                in.readBool();
            } else {
                /*snd.fileName = */                in.readStr();
                if (in.readBool()) /*snd.data =*/ {
                    val.sound = in.decompress(in.read4());
                }
                int effects = in.read4();
                //snd.setEffects(effects);
		/*snd.volume =*/ in.readD();
                /*snd.pan =*/ in.readD();
                /*snd.preload =*/ in.readBool();
            }
        }
    }

    private void readSprites(GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        System.out.println("readSprites");
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "SPRITES", ver);
        }
        int noSprites = in.read4();
        Group imageFolder = (Group) c.pro.childAt(c.pro.findFromName("$209"));
        Group spriteFolder = (Group) c.pro.childAt(c.pro.findFromName("$210"));
        for (int i = 0; i < noSprites; i++) {
            if (!in.readBool()) {
                c.sprites.add(null);
                continue;
            }
            org.gcreator.fileclass.GFile spriteFile;
            String name = in.readStr();
            ver = in.read4();
            if (ver != 400 && ver != 542) {
                throw versionError("IN", "SPRITES", i, ver);
            } //$NON-NLS-1$ //$NON-NLS-2$
            spriteFile = new org.gcreator.fileclass.GFile(spriteFolder, name, "sprite", null);
            c.sprites.add(spriteFile);
            Sprite val;
            spriteFile.value = val = new Sprite(name);
            val.width = in.read4();
            val.height = in.read4();
            val.BBleft = in.read4();
            val.BBRight = in.read4();
            val.BBBottom = in.read4();
            val.BBTop = in.read4();
            in.readBool(); //Transparent
            if (ver > 400) {
                /*spr.smoothEdges = */                in.readBool();
                /*spr.preload = */                in.readBool();
            }
            /*spr.boundingBoxMode = (byte) */            in.read4();
            val.precise = in.readBool();
            if (ver == 400) {
                in.skip(4); //use video memory
                /*spr.preload = !*/                in.readBool();
            }
            val.originX = in.read4();
            val.originY = in.read4();
            int nosub = in.read4();
            for (int j = 0; j < nosub; j++) {
                if (in.read4() == -1) {
                    continue;
                }
                BufferedImage img = in.readImage(val.width, val.height);
                org.gcreator.fileclass.GFile imgF;
                imgF = new org.gcreator.fileclass.GFile(imageFolder, "sprimg_" + name + "_" + j, "bmp", null);
                ImageIcon iico;
                imgF.value = new GImage("sprimg_" + name + "_" + j);
                ((GImage) imgF.value).image = iico = new ImageIcon(img);
                //imgF.treeimage = org.gcreator.fileclass.GFile.getScaledIcon(iico);
                val.addToList(imgF);
            }
        }
    }

    private static void readBackgrounds(GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "BACKGROUNDS", ver);
        } //$NON-NLS-1$ //$NON-NLS-2$
        int noBackgrounds = in.read4();
        Group imageFolder = (Group) c.pro.childAt(c.pro.findFromName("$209"));
        Group tilesetFolder = (Group) c.pro.childAt(c.pro.findFromName("$211"));
        for (int i = 0; i < noBackgrounds; i++) {
            /*Must deal with backgrounds and tilesets separatelly*/
            if (!in.readBool()) {
                continue;
            }
            String name = in.readStr();
            ver = in.read4();
            if (ver != 400 && ver != 543) {
                throw versionError("IN", "BACKGROUNDS", i, ver);
            }
            int width = in.read4();
            int height = in.read4();
            boolean transparent = in.readBool();
            boolean tileset = false;
            boolean preload;
            int tileWidth = 0;
            int tileHeight = 0;
            int horizOffset = 0;
            int vertOffset = 0;
            int horizSep = 0;
            int vertSep = 0;
            if (ver > 400) {
                boolean smooth = in.readBool();
                preload = in.readBool();
                tileset = in.readBool();
                tileWidth = in.read4();
                tileHeight = in.read4();
                horizOffset = in.read4();
                vertOffset = in.read4();
                horizSep = in.read4();
                vertSep = in.read4();
            } else {
                in.skip(4); //use video memory
                preload = !in.readBool();
            }
            BufferedImage backgroundImage = null;
            if (in.readBool()) {
                if (in.read4() == -1) {
                    continue;
                }
                backgroundImage = in.readImage(width, height);
            }
            org.gcreator.fileclass.GFile bkimg;
            bkimg = new org.gcreator.fileclass.GFile(imageFolder, "bgimg_" + name, "bmp", null);
            ImageIcon iicon = new ImageIcon(backgroundImage);
            bkimg.value = new GImage("bgimg_" + name);
            //bkimg.value = iicon;
            ((GImage) bkimg.value).image = iicon;
            if (tileset) {
                org.gcreator.fileclass.GFile tlimg;
                tlimg = new org.gcreator.fileclass.GFile(tilesetFolder, name, "tileset", null);
                Tileset t = new Tileset(tlimg.name);
                tlimg.value = t;
                t.startx = horizOffset;
                t.starty = vertOffset;
                t.bwidth = horizSep;
                t.bheight = vertSep;
                t.tilew = tileWidth;
                t.tileh = tileHeight;
            }
        }
    }

    private static void readPaths(GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        GmStreamDecoder in = c.in;

        int ver = in.read4();
        if (ver != 420) {
            throw versionError("BEFORE", "PATHS", ver);
        }
        int noPaths = in.read4();

        //Dump paths
        for (int i = 0; i < noPaths; i++) {
            if (!in.readBool()) {
                continue;
            }
            in.readStr(); //name
            ver = in.read4();
            if (ver != 530) {
                throw versionError("IN", "PATHS", i, ver);
            }
            in.readBool(); //smooth
            in.readBool(); //closed
            in.read4(); //precision
            in.read4(); //Background room
            in.read4(); //snap x
            in.read4(); //snap y
            int nopoints = in.read4();
            for (int j = 0; j < nopoints; j++) {
                //Point point = path.addPoint();
                /*point.x = (int) */                in.readD();
                /*point.y = (int) */                in.readD();
                /*point.speed = (int) */                in.readD();
            }
        }
    }

    private static void readScripts(GmFileContext c) throws IOException, GmFormatException {
        GmStreamDecoder in = c.in;

        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "SCRIPTS", ver);
        }

        int noScripts = in.read4();

        Group scriptsGroup = (Group) c.pro.childAt(c.pro.findFromName("$216"));
        for (int i = 0; i < noScripts; i++) {
            if (!in.readBool()) {
                continue;
            }
            org.gcreator.fileclass.GFile script;
            script = new org.gcreator.fileclass.GFile(scriptsGroup, in.readStr(), "gs", null);
            ver = in.read4();
            if (ver != 400) {
                throw versionError("IN", "SCRIPTS", i, ver);
            }
            script.value = new Classes(parseGML(in.readStr()));
            
        }
    }

    /**@todo The parser itself
     * @param gml The text to be parsed
     * @return The parsed text
     */
    private static String parseGML(String gml) {
        String egml = gml;
        return egml;
    }

    private static void readFonts(GmFileContext c) throws IOException, GmFormatException {
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 440 && ver != 540) {
            throw versionError("BEFORE", "FONTS", ver);
        }
        if (ver == 440) {
            int noDataFiles = in.read4();
            for (int i = 0; i < noDataFiles; i++) {
                if (!in.readBool()) {
                    continue;
                }
                in.skip(in.read4());
                if (in.read4() != 440) {
                    throw new GmFormatException("");
                }
                in.readStr();
                if (in.readBool()) {
                    in.skip(in.read4());
                }
                in.skip(16);
            }
            return;
        }
        int noFonts = in.read4();
        for (int i = 0; i < noFonts; i++) {
            if (!in.readBool()) {
                continue;
            }
            in.readStr(); //Name
            ver = in.read4();
            if (ver != 540) {
                throw versionError("IN", "FONTS", i, ver);
            } //$NON-NLS-1$ //$NON-NLS-2$
            /*font.fontName = */in.readStr();
            /*font.size = */in.read4();
            /*font.bold = */in.readBool();
            /*font.italic = */in.readBool();
            /*font.charRangeMin = */in.read4();
            /*font.charRangeMax = */in.read4();
        }
    }
    
    private static void readTimelines(GmFileContext c) throws IOException,GmFormatException{
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 500) throw versionError("BEFORE","TIMELINES",ver);
        int noTimelines = in.read4();
        for(int i = 0; i < noTimelines; i++){
            if (!in.readBool()){
                continue;
            }
            in.readStr(); //Name
            ver = in.read4();
            if (ver != 500) throw versionError("IN","TIMELINES",i,ver);
            int nomoms = in.read4();
            for(int j = 0; j < nomoms; j++){
                in.read4(); //stepnum
                readTimelineActions(in);
            }
        }
    }
    
    private static void readTimelineActions(GmStreamDecoder in) throws IOException,GmFormatException{
        int ver = in.read4();
        if(ver!=400){
            throw new GmFormatException("!");
        }
        int noacts = in.read4();
        for(int k = 0; k < noacts; k++){
            in.skip(4);
            int libid = in.read4();
            int actid = in.read4();
            boolean unknownLib = true;
            if (unknownLib){
                in.read4(); //action kind
                in.readBool(); //allow relative
                in.readBool(); //question
                in.readBool(); //can apply to
                int execType = in.read4();
                if(execType==1)
                    in.readStr();
                else
                    in.skip(in.read4());
                if(execType==2)
                    in.readStr();
                else
                    in.skip(in.read4());
                int arguments = in.read4();
                int argkindnum = in.read4();
                for (int x = 0; x < argkindnum; x++)
                    in.read4();
                if (unknownLib){
                    //for (int x = 0; x < argkindnum; x++){}
                    int appliesTo = in.read4();
                    in.readBool(); //relative
                    int actualnoargs = in.read4();
                    for (int l = 0; l < actualnoargs; l++){
                        if (l >= arguments){
                            in.skip(in.read4());
                            continue;
                        }
                        in.readStr(); //strval
                    }
                    in.readBool(); //not
                }
            }
        }
    }
    
    private static void readActors(GmFileContext c) throws IOException,GmFormatException{
                System.out.println("readActors");
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) throw versionError("BEFORE","OBJECTS",ver);
        
        Group actorsGroup = (Group) c.pro.childAt(c.pro.findFromName("$214"));
        org.gcreator.fileclass.GFile f;
        Actor a;
        
        int noGmObjects = in.read4();
        for(int i = 0; i < noGmObjects; i++){
            if (!in.readBool()){
                continue;
            }
            f = new org.gcreator.fileclass.GFile(actorsGroup, in.readStr(), "actor", null);
            f.value = a = new Actor(f.name);
            ver = in.read4();
            if (ver != 430) throw versionError("IN","OBJECTS",i,ver);
            int temp = in.read4();
            a.sprite = null;
            if(temp<c.sprites.size()&&temp>=0){
                org.gcreator.fileclass.GFile spr = c.sprites.get(temp);
                if(spr!=null)
                    a.sprite = spr;
            }
            a.solid = in.readBool();
            a.visible = in.readBool();
            a.depth = in.read4();
            a.persistant = in.readBool();
            in.read4(); //parent
            in.read4(); //temp again for mask
            in.skip(4);
            org.gcreator.events.Event e;
            for (int j = 0; j < 11; j++){
                e = null;
                boolean done = false;
                while(!done){
                    int first = in.read4();
                    int id = 0;
                    if(first!=-1){
                        System.out.println("event:"+j+" first:"+first);
                        if(j==EV_CREATE){
                            e = new CreateEvent();
                            a.events.add(e);
                            id = first;
                        }
                        else if(j==EV_DESTROY){
                            e = new DestroyEvent();
                            a.events.add(e);
                            id = first;
                        }
                        else if(j==EV_STEP){
                            e = new StepEvent();
                            a.events.add(e);
                            id = first;
                        }
                        else if(j==EV_DRAW){
                            e = new DrawEvent();
                            a.events.add(e);
                            id = first;
                        } 
                        else if(j==EV_COLLISION)
                            ; //ev.other = c.objids.get(first);
                        else
                            id = first; //ev.id = first;
                        //ev.mainId = j;
                        readActions(c, i, j*1000+id, e);
                    }
                    else
                        done = true;
                }
            }
        }
    }
    
    private static void readActions(GmFileContext c, int format1, int format2,
            org.gcreator.events.Event e)
            throws IOException, GmFormatException{
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400){
            throw new GmFormatException("version error:" + ver);
        }
        int noacts = in.read4();
        //System.out.println("No of actions:"+noacts);
        for(int i = 0; i < noacts; i++){
            String code="",function="";
            in.skip(4);
            int libid = in.read4();
            int actid = in.read4();
            //System.out.println("retrive actions");
            
            //boolean unknownLib = (act == null); //this should always be false
            if (true){
                in.read4(); //action kind
                in.readBool(); //allow relative
                System.out.println("question:"+in.readBool()); //question
                System.out.println("applyto"+in.readBool()); //can apply to
                int exectype = in.read4();
                System.out.println("etype:"+exectype);
                if(exectype == EXEC_FUNCTION)
                    function=in.readStr(); //Exec info
                else {
                    in.skip(in.read4());}
                
                if(exectype == EXEC_CODE){
                    code=in.readStr(); //Exec info
                System.out.println("read code:"+code);
                }
                else {
                    in.skip(in.read4());
                    System.out.println("not code");
                }
                
            }
            else{
                System.out.println("error: not unknownlib");
                in.skip(20);
                in.skip(in.read4());
                in.skip(in.read4());
            }
            System.out.println("action code:"+code+function);
            int arglen = in.read4(); //argument count
            System.out.println("arg count");
            int argkinds = in.read4();
            for(int x = 0; x < argkinds; x++)
                in.read4();
            int appliesTo = in.read4();
            boolean relative = in.readBool(); //relative
            int actualnoargs = in.read4();
            String[] args = null;
            if(actualnoargs!=0)
                args = new String[actualnoargs];
            for (int l = 0; l < actualnoargs; l++)
            {
                if (l >= arglen){
                    in.skip(in.read4());
                    continue;
                }
                args[l] = in.readStr(); //strval
            }
            in.readBool(); //Not
            
            //org.gcreator.actions.Action act = retrieveAction(libid, actid,code);
            //if(act!=null)
                
            //if(act!=null)
            org.gcreator.actions.Action act =    parseAction(code,c, null, appliesTo, relative, args);
            act.project = c.pro;
           // System.out.println("Got here");
            if(act!=null&&e!=null&&e.actions!=null)
                e.actions.add(act);
        }
        System.out.println("Ended actions");
    }
    
    private static org.gcreator.actions.Action retrieveAction(int libid, int actid,String code){
        org.gcreator.actions.Action act = null;
       
        if(libid==1){
            if(actid==422){
                act = new org.gcreator.actions.Action(new StartOfABlock());
                return act;
            }
            if(actid==424){
                act = new org.gcreator.actions.Action(new EndOfABlock());
                return act;
            }
//            if(actid==104){
//                act = new org.gcreator.actions.Action(new SetVSpeed());
//                return act;
            }
            ExecuteCode tt = new ExecuteCode();
            tt.code = code;
            act = new org.gcreator.actions.Action(tt);
            return act;
//        
//        System.out.println("libid=" + libid + ", actid=" + actid);
//        
//        return act;
    }
    
    private static org.gcreator.actions.Action parseAction(String code, GmFileContext c, org.gcreator.actions.Action action,int appliesTo, boolean relative, String[] args) {
        //if(action.pattern instanceof ExecuteCode){
            for (int i=0; i< args.length; i++)
            {
            code+=args[i];
            }
            System.out.println("Code:"+code);
            org.gcreator.actions.Action act = retrieveAction(0, 0,code);
            ((ExecuteCode)act.pattern).code = code;
//            if (action.getPanel() == null){
//                System.out.println("null panel");
//            }
            
       // }
        
        return act;
//        if(action.pattern instanceof SetVSpeed){
//            //((VSpeedEditor) action.getPanel()).relative.setSelected(relative);
//            ((VSpeedEditor) action.getPanel()).to.setText(args[0]);
//            if(appliesTo==-1)
//                ((VSpeedEditor) action.getPanel()).of.setText("this");
//        }
    }
}
