/*
 * ImportGM6.java
 *
 * Created on 6/Out/2007, 19:58:31
 *
 * Based on Lateral Game Maker GmFileReader
 */
package org.gcreator.utils.GMImporter;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;
import java.util.zip.DataFormatException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.gcreator.actions.components.ArgumentList;
import org.gcreator.actions.components.FunctionName;
import org.gcreator.actions.components.VariableName;
import org.gcreator.actions.mainactions.CallFunction;
import org.gcreator.actions.mainactions.Comment;
import org.gcreator.actions.mainactions.Else;
import org.gcreator.actions.mainactions.EndOfABlock;
import org.gcreator.actions.mainactions.ExecuteCode;
import org.gcreator.actions.mainactions.Exit;
import org.gcreator.actions.mainactions.If;
import org.gcreator.actions.mainactions.Repeat;
import org.gcreator.actions.mainactions.SetVariable;
import org.gcreator.actions.mainactions.StartOfABlock;
import org.gcreator.components.ProjectTypes;
import org.gcreator.core.GPanel;
import org.gcreator.events.AlarmEvent;
import org.gcreator.events.BeginStepEvent;
import org.gcreator.events.CollisionEvent;
import org.gcreator.events.CreateEvent;
import org.gcreator.events.DestroyEvent;
import org.gcreator.events.DrawEvent;
import org.gcreator.events.EndStepEvent;
import org.gcreator.events.KeyPress;
import org.gcreator.events.KeyReleased;
import org.gcreator.events.KeyboardEvent;
import org.gcreator.events.MouseEvent;
import org.gcreator.events.StepEvent;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.GameProject;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Classes;
import org.gcreator.fileclass.res.Resource;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.SettingsValues;
import org.gcreator.fileclass.res.Sound;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.fileclass.res.TabValues;
import org.gcreator.fileclass.res.Tileset;
import org.gcreator.fileclass.res.Timeline;
import org.gcreator.managers.ProjectTree;
import org.gcreator.plugins.PluginHelper;
import org.gcreator.units.ActorInScene;
import org.gcreator.units.BackgroundInScene;
import org.gcreator.units.TimelineStep;
import org.lateralgm.file.GmFormatException;
import org.lateralgm.file.GmStreamDecoder;
import org.lateralgm.file.iconio.ICOFile;

/**
 *
 * @author TGMG, Luís
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
        Vector<org.gcreator.fileclass.GFile> backgrounds = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> paths = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> timelines = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> actors = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> scenes = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> scripts = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> fonts = new Vector<org.gcreator.fileclass.GFile>();
        Vector<org.gcreator.fileclass.GFile> sounds = new Vector<org.gcreator.fileclass.GFile>();
    }

    private static GmFormatException versionError(String error, String res, int ver) {
        return versionError(error, res, 0, ver);
    }

    private static GmFormatException versionError(String error, String res, int i, int ver) {
        JOptionPane.showMessageDialog(null, "This game maker file version is unnsupported make sure it is a valid gm6 file.");
        return new GmFormatException("Unsupported"); //$NON-NLS-1$
    }

    public GM6Importer(String fileName) throws IOException, GmFormatException, DataFormatException {
        System.out.println("starting gm6import");
        GmStreamDecoder in = null;
        long startTime = System.currentTimeMillis();
        in = new GmStreamDecoder(fileName);
        GameProject project = GameProject.balance(ProjectTypes.EMPTY_GAME);
        project.name = fileName.replaceAll("(.*(\\\\|/))(.*)\\..*", "$3");
        GPanel.setMainProject(project);
        org.gcreator.fileclass.GFile settings = (org.gcreator.fileclass.GFile) project.childAt(
                project.findFromName("$workspace-game-settings"));
        settings.editable = false;
        GmFileContext c = new GmFileContext(project, in);

        int identifier = in.read4();

        if (identifier != 1234321) {
            throw new GmFormatException("Invalid"); //$NON-NLS-1$
        }
        int ver = in.read4();

        //org.gcreator.core.gcreator.debugOut.println("version:"+ver);
        if (ver < 600) {
            //org.gcreator.core.gcreator.debugOut.println("unsupported");
            JOptionPane.showMessageDialog(null, "This game maker file version is unnsupported make sure it is a valid gm6 file.");
            String msg = "Unsupported Version"; //$NON-NLS-1$
            throw new GmFormatException(String.format(msg, "", ver)); //$NON-NLS-1$
        }
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read settings");
        SettingsValues values = readSettings(settings, c);
        //   org.gcreator.core.gcreator.debugOut.println("GMI: Read Sounds");
        readSounds(c);
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read Sprites");
        readSprites(c);
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read Backgrounds");
        readBackgrounds(c);
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read Paths");
        readPaths(c);
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read Scripts");
        readScripts(c);
        //  org.gcreator.core.gcreator.debugOut.println("GMI: Read Fonts");
        readFonts(c);

        /*
         *
         * read ahead to get names of resources with ids
         *
         */

        long position = c.in.getInputStream().getFilePointer();
        readTimelines(c, true);
        //   org.gcreator.core.gcreator.debugOut.println("GMI: Read Actors ahead");
        readActors(c, true);
        //   org.gcreator.core.gcreator.debugOut.println("GMI: Read Scenes ahead");
        readScenes(c, true);


        //readahead(c);

        //go back to position
        c.in.getInputStream().seek(position);

        readTimelines(c, false);
        readActors(c, false);
        readScenes(c, false);
        TabValues SceneOrder;
        values.setVariable("Scene Order", SceneOrder = new TabValues("Scene Order"));
        Vector<Integer> v = new Vector<Integer>();
        SceneOrder.setVariable("Scenes", v);
        for (GFile f : c.scenes) {
            v.add(f.getID());
        }
        //c=null;
        in.read4();//lastInstanceId
        in.read4();//lastTileId
        ver = in.read4();
        if (ver != 430 && ver != 600 && ver != 620) {
            throw versionError("BEFORE", "GAMEINFO", ver);
        } //$NON-NLS-1$ //$NON-NLS-2$
        if (ver != 620) {
            readGameInformation(c, ver);
        } else {
            int noIncludes = in.read4();
            for (int i = 0; i < noIncludes; i++) {
                ver = in.read4();
//                                        if (ver != 620)
//						throw new GmFormatException(Messages.format("GmFileReader.ERROR_UNSUPPORTED", //$NON-NLS-1$
//								Messages.getString("GmFileReader.INGM7INCLUDES"),ver)); //$NON-NLS-1$
                //Include inc = new Include();
                in.skip(in.read4()); //Filename
                in.readStr();//filePath
                in.skip(4); //orig file chosen
                in.skip(4); //orig file size
                if (in.readBool()) {
                    in.skip(in.read4());
                } //Store in editable
                in.skip(4); //export
                in.skip(in.read4()); //folder to export to
                in.skip(12); //overwrite if exists, free mem, remove at game end
            //f.gameSettings.includes.add(inc);
            }
            ver = in.read4();
            if (ver != 700) {
                throw versionError("BEFORE", "EXTENSIONS", ver);
            } //$NON-NLS-1$ //$NON-NLS-2$
            int noPackages = in.read4();
            for (int i = 0; i < noPackages; i++) {
                in.skip(in.read4()); //Package name
            }
            ver = in.read4();
            if (ver != 600) {
                throw versionError("BEFORE", "GAMEINFO", ver);
            } //$NON-NLS-1$ //$NON-NLS-2$
            readGameInformation(c, 620);
        }
        ver = in.read4();
//			if (ver != 500) throw new GmFormatException(Messages.format("GmFileReader.ERROR_UNSUPPORTED", //$NON-NLS-1$
//					Messages.getString("GmFileReader.AFTERINFO"),ver)); //$NON-NLS-1$
        int no = in.read4(); //Library Creation Code
        for (int j = 0; j < no; j++) {
            in.skip(in.read4());
        }
        ver = in.read4();
//			if (ver != 500 && ver != 540 && ver != 700)
//				throw new GmFormatException(Messages.format("GmFileReader.ERROR_UNSUPPORTED", //$NON-NLS-1$
//						Messages.getString("GmFileReader.AFTERINFO2"),ver)); //$NON-NLS-1$
        in.skip(in.read4() * 4); //Room Execution Order
        //readTree(c,ver);
        //}catch(Exception e){e.printStackTrace();}           
        in.close();
        c = null;
        ProjectTree.importFolderToTree(project, PluginHelper.getPanel().top);
        PluginHelper.getPanel().workspace.updateUI();
        PluginHelper.getPanel().workspace.repaint();
    }

    private void readGameInformation(GmFileContext c, int ver) throws IOException {
        GmStreamDecoder in = c.in;
        //GameInformation gameInfo = c.f.gameInfo;
        int bc = in.read4();
        //if (bc >= 0) gameInfo.backgroundColor = Util.convertGmColor(bc);
        in.readBool();//mimicGameWindow
        if (ver > 430) {
            in.readStr();//formCaption
            in.read4();//left
            in.read4();//top
            in.read4();//width
            in.read4();//height
            in.readBool();//showBorder
            in.readBool();//allowResize
            in.readBool();//stayOnTop
            in.readBool();//pauseGame
        }
        in.readStr();//gameInfoStr
    }

    private SettingsValues readSettings(org.gcreator.fileclass.GFile settings, GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {
        //  org.gcreator.core.gcreator.debugOut.println("GMI: in Settings");
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
        //System.out.println("got to ver"+ver);
        if (ver != 542 && ver != 600 && ver != 702) {
            String msg = "Unsupported Version in Settings"; //$NON-NLS-1$
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
            /*con.name = */ in.readStr();
            /*con.value = */ in.readStr();
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
                inc.filePath = */ in.readStr();
            }
            int includeFolder = in.read4();
            boolean overwriteExisting = in.readBool();
            boolean removeAtGameEnd = in.readBool();
        }
        return value;
    }

    private void readSounds(GmFileContext c) throws IOException, GmFormatException,
            DataFormatException {

        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "SOUNDS", ver);
        } //$NON-NLS-1$ //$NON-NLS-2$
        int noSounds = in.read4();
        for (int i = 0; i < noSounds; i++) {
            if (!in.readBool()) {
                c.sounds.add(null);
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
            if (type.equals("") || type == null) {
                type = "wav";
            }
            org.gcreator.fileclass.GFile soundFile;
            Group soundFolder = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-sound"));
            soundFile = new org.gcreator.fileclass.GFile(soundFolder, name, type, null);
            c.sounds.add(soundFile);
            Sound s = new Sound();

            soundFile.value = s;

            soundFile.type = type.replaceFirst(".", "");
            //org.gcreator.core.gcreator.debugOut.println("type:"+soundFile.type);
            //val.width = in.read4();
            if (ver == 440) {
                //-1 = no sound
		/*if (kind53 != -1) snd.data = in.decompress(*/ in.read4()/*)*/;
                in.skip(8);
                /*snd.preload = !*/ in.readBool();
            } else {
                /*snd.fileName = */ in.readStr();
                if (in.readBool()) /*snd.data =*/ {
                    int size = in.read4();
                    s.data = in.decompress(size);
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
        //org.gcreator.core.gcreator.debugOut.println("readSprites");
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "SPRITES", ver);
        }
        int noSprites = in.read4();
        Group imageFolder = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-image"));
        Group spriteFolder = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-sprite"));
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
            spriteFile.value = val = new Sprite(c.pro);
            val.width = in.read4();
            val.height = in.read4();
            val.BBLeft = in.read4();
            val.BBRight = in.read4();
            val.BBBottom = in.read4();
            val.BBTop = in.read4();
            boolean transparent = in.readBool(); //Transparent
            if (ver > 400) {
                /*spr.smoothEdges = */ in.readBool();
                /*spr.preload = */ in.readBool();
            }
            /*spr.boundingBoxMode = (byte) */ in.read4();
            val.precise = in.readBool();
            if (ver == 400) {
                in.skip(4); //use video memory
                /*spr.preload = !*/ in.readBool();
            }
            val.originX = in.read4();
            val.originY = in.read4();
            int nosub = in.read4();
            for (int j = 0; j < nosub; j++) {
                if (in.read4() == -1) {
                    continue;
                }
                BufferedImage img = in.readImage(val.width, val.height);
                int tpixel = img.getRGB(img.getMinX(), img.getHeight() - 1);

                BufferedImage timage;
                if (transparent) {
                    timage = Transparency.makeColorTransparent(img, new Color(tpixel));
                } else {
                    timage = img;
                }
                org.gcreator.fileclass.GFile imgF;
                imgF = new org.gcreator.fileclass.GFile(imageFolder, "sprimg_" + name + "_" + j, "png", null);
                ImageIcon iico;
                imgF.value = new ImageIcon(timage);//new GImage();
                //((GImage) imgF.value).image = iico = new ImageIcon(img);
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
        Group imageFolder = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-image"));
        Group tilesetFolder = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-tileset"));
        for (int i = 0; i < noBackgrounds; i++) {
            /*Must deal with backgrounds and tilesets separatelly*/
            if (!in.readBool()) {
                c.backgrounds.add(null);
                continue;
            }
            String name = in.readStr();
            org.gcreator.fileclass.GFile bkimg;
            bkimg = new org.gcreator.fileclass.GFile(imageFolder, "bgimg_" + name, "bmp", null);
            c.backgrounds.add(bkimg);
            //   System.out.println("add background:"+bkimg.getID());
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

            ImageIcon iicon = new ImageIcon(backgroundImage);
            bkimg.value = iicon;//new GImage("bgimg_" + name);
            //bkimg.value = iicon;
            //((GImage) bkimg.value).image = iicon;

            if (tileset) {
                org.gcreator.fileclass.GFile tlimg;
                tlimg = new org.gcreator.fileclass.GFile(tilesetFolder, name, "tileset", null);
                Tileset t = new Tileset();
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
                c.paths.add(null);
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
                /*point.x = (int) */ in.readD();
                /*point.y = (int) */ in.readD();
                /*point.speed = (int) */ in.readD();
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

        Group scriptsGroup = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-script"));
        for (int i = 0; i < noScripts; i++) {
            if (!in.readBool()) {
                c.scripts.add(null);
                continue;
            }
            org.gcreator.fileclass.GFile script;
            script = new org.gcreator.fileclass.GFile(scriptsGroup, in.readStr(), "gs", null);
            c.scripts.add(script);
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
                    c.fonts.add(null);
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
            /*font.fontName = */
            in.readStr();
            /*font.size = */ in.read4();
            /*font.bold = */ in.readBool();
            /*font.italic = */ in.readBool();
            /*font.charRangeMin = */ in.read4();
            /*font.charRangeMax = */ in.read4();
        }
    }

    private static void readTimelines(GmFileContext c, boolean fake) throws IOException, GmFormatException {
        GmStreamDecoder in = c.in;
        int ver = in.read4();

        Group tlGroup = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-timeline"));
        org.gcreator.fileclass.GFile f;
        Timeline a;

        if (ver != 500) {
            throw versionError("BEFORE", "TIMELINES", ver);
        }
        int noTimelines = in.read4();
        for (int i = 0; i < noTimelines; i++) {
            if (!in.readBool()) {
                c.timelines.add(null);
                continue;
            }

            //in.readStr(); //Name
            f = new org.gcreator.fileclass.GFile(tlGroup, in.readStr(), "timeline", null);
            if (fake) {
                tlGroup.remove(f);
            }
            f.value = a = new Timeline();

            c.timelines.add(f);
            ver = in.read4();
            if (ver != 500) {
                throw versionError("IN", "TIMELINES", i, ver);
            }
            int nomoms = in.read4();
            for (int j = 0; j < nomoms; j++) {
                //a.steps
                TimelineStep ts = new TimelineStep();
                ts.stepnum = in.read4(); //stepnum

                readTimelineActions(in);
            }
        }
    }

    private static void readTimelineActions(GmStreamDecoder in) throws IOException, GmFormatException {
        int ver = in.read4();
        if (ver != 400) {
            throw new GmFormatException("!");
        }
        int noacts = in.read4();
        for (int k = 0; k < noacts; k++) {
            in.skip(4);
            int libid = in.read4();
            int actid = in.read4();
            boolean unknownLib = true;
            if (unknownLib) {
                in.read4(); //action kind
                in.readBool(); //allow relative
                in.readBool(); //question
                in.readBool(); //can apply to
                int execType = in.read4();
                if (execType == 1) {
                    in.readStr();
                } else {
                    in.skip(in.read4());
                }
                if (execType == 2) {
                    in.readStr();
                } else {
                    in.skip(in.read4());
                }
                int arguments = in.read4();
                int argkindnum = in.read4();
                for (int x = 0; x < argkindnum; x++) {
                    in.read4();
                }
                if (unknownLib) {
                    //for (int x = 0; x < argkindnum; x++){}
                    int appliesTo = in.read4();
                    in.readBool(); //relative
                    int actualnoargs = in.read4();
                    for (int l = 0; l < actualnoargs; l++) {
                        if (l >= arguments) {
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

    private static void readScenes(GmFileContext c, boolean fake) throws IOException, GmFormatException {
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        Group scenesGroup = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-scene"));
        org.gcreator.fileclass.GFile f;
        Scene a;

        int noGmRooms = in.read4();
        for (int i = 0; i < noGmRooms; i++) {
            if (!in.readBool()) {
                c.scenes.add(null);
                continue;
            }
            f = new org.gcreator.fileclass.GFile(scenesGroup, in.readStr(), "scene", null);
            if (fake) {
                scenesGroup.remove(f);
            }
            f.value = a = new Scene();
            c.scenes.add(f);
            ver = in.read4();
            a.caption = in.readStr();
            //   org.gcreator.core.gcreator.debugOut.println("Caption:" + a.caption);
            a.width = in.read4();
            a.height = in.read4();
            a.snapY = in.read4();
            a.snapX = in.read4();
            a.isometric = in.readBool();
            a.speed = in.read4();
            a.persistant = in.readBool();
            int col = in.read4();
            //System.out.println("Got here");
            a.background = new Color(col & 0xFF, (col & 0xFF00) >> 8, (col & 0xFF0000) >> 16);
            a.drawbackcolor = in.readBool();
            a.code = in.readStr();

            //System.out.println("Got here2");
            int nobackgrounds = in.read4();
            for (int j = 0; j < nobackgrounds; j++) {
                //System.out.println("Looping");
                BackgroundInScene bis = new BackgroundInScene("Background" + j);
                bis.visibleonstart = in.readBool();
                int fore = in.read4(); //foreground?
                int im = in.read4(); //image
                //org.gcreator.core.gcreator.debugOut.println("size:"+c.backgrounds.size());
                if (im != -1) {
                    //     System.out.println("background:"+im+" fore:"+fore);
                    if (c.backgrounds.get(im) != null) {
                        bis.image = c.backgrounds.get(im).getID();
                    }
                }
                bis.xpos = in.read4(); //xpos
                bis.ypos = in.read4(); //ypos
                boolean tileh = in.readBool(); //tileh
                boolean tilev = in.readBool(); //tilev
                bis.hspeed = in.read4(); //hspeed
                bis.vspeed = in.read4(); //vspeed
                bis.stretch = in.readBool(); //stretch
//                if (bis.stretch){
//                bis.hmode = bis.MODE_STRETCH;
//                bis.vmode = bis.MODE_STRETCH;
//                }
                if (tileh) {
                    bis.hmode = bis.MODE_REPEAT;
                }
                if (tilev) {
                    bis.vmode = bis.MODE_REPEAT;
                }
                a.backgrounds.add(bis);
            }
            in.readBool(); //enable views
            int noviews = in.read4();
            for (int j = 0; j < noviews; j++) {
                //System.out.println("Looping again");

                boolean visible = in.readBool();
                int viewX = in.read4();
                int viewY = in.read4();
                int viewW = in.read4();
                int viewH = in.read4();
                int portX = in.read4();
                int portY = in.read4();
                if (ver > 520) {
                    int portW = in.read4();
                    int portH = in.read4();
                }
                int hbor = in.read4();
                int vbor = in.read4();
                int hspeed = in.read4();
                int vspeed = in.read4();
                in.read4(); //actor to follow
            }

            int noinstances = in.read4();
            for (int j = 0; j < noinstances; j++) {
                //ActorInScene = new ActorInScene(f, j, j, i);
                int x = in.read4();//x
                int y = in.read4();//y
                int temp = in.read4(); //actor
                int id = in.read4(); //instanceID
                in.readStr(); //code
                in.readBool(); //locked

                if (temp < c.actors.size() && temp >= 0) {
                    org.gcreator.fileclass.GFile act = c.actors.get(temp);
                    if (act != null) {
                        a.actors.add(new ActorInScene(act, x, y, id));
                    }
                } else {
                    System.out.println("warning: actor not added to scene");
                }
            }

            int notiles = in.read4();
            for (int j = 0; j < notiles; j++) {
                in.read4();//x
                in.read4();//y
                in.read4();//width
                in.read4();//height
                in.read4();//depth
                in.read4();//tileId
                in.readBool(); //locked
            }
            System.out.println("Got here Finally!");
            in.readBool();//rememberWindowSize
            in.read4();//editorWidth
            in.read4();//editorHeight
            in.readBool();//showGrid
            in.readBool();//showObjects
            in.readBool();//showTiles
            in.readBool();//showBackgrounds
            in.readBool();//showForegrounds
            in.readBool();//showViews
            in.readBool();//deleteUnderlyingObjects
            in.readBool();//deleteUnderlyingTiles
            if (ver == 520) {
                in.skip(6 * 4);
            } //tile info
            in.read4(); //currenttab
            in.read4();//scrollBarX
            in.read4();//scrollBarY
            System.out.println("The end of scenes");
        }
    }

    private static void readActors(GmFileContext c, boolean fake) throws IOException, GmFormatException {
        //org.gcreator.core.gcreator.debugOut.println("readActors");
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw versionError("BEFORE", "OBJECTS", ver);
        }

        Group actorsGroup = (Group) c.pro.childAt(c.pro.findFromName("$workspace-game-actor"));
        org.gcreator.fileclass.GFile f;
        Actor a;

        int noGmObjects = in.read4();
        for (int i = 0; i < noGmObjects; i++) {
            if (!in.readBool()) {
                c.actors.add(i, null);
                continue;
            }
            f = new org.gcreator.fileclass.GFile(actorsGroup, in.readStr(), "actor", null);
            if (fake) {
                actorsGroup.remove(f);
            }
            f.value = a = new Actor();
            c.actors.add(i, f);
            ver = in.read4();
            if (ver != 430) {
                throw versionError("IN", "OBJECTS", i, ver);
            }
            int temp = in.read4();
            a.sprite = -1;
            if (temp < c.sprites.size() && temp >= 0) {
                org.gcreator.fileclass.GFile spr = c.sprites.get(temp);
                if (spr != null) {
                    a.sprite = spr.getID();
                }
            }
            a.solid = in.readBool();
            a.visible = in.readBool();
            a.depth = in.read4();
            a.persistent = in.readBool();
            temp = in.read4(); //parent
            if (temp < c.actors.size() && temp >= 0) {
                org.gcreator.fileclass.GFile act = c.actors.get(temp);
                if (act != null) {
                    a.extend = act.getID();
                }
            }
            temp = in.read4(); //temp again for mask
            if (temp < c.sprites.size() && temp >= 0) {
                org.gcreator.fileclass.GFile spr = c.sprites.get(temp);
                if (spr != null) {
                    a.mask = spr.getID();
                }
            }
            in.skip(4);
            org.gcreator.events.Event e;
            for (int j = 0; j < 11; j++) {
                e = null;
                boolean done = false;
                while (!done) {
                    int first = in.read4();
                    int id = 0;
                    if (first != -1) {
                        //org.gcreator.core.gcreator.debugOut.println("event:"+j+" first:"+first);
                        if (j == EV_CREATE) {
                            org.gcreator.core.gcreator.debugOut.println("Create");
                            e = new CreateEvent();
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_DESTROY) {
                            org.gcreator.core.gcreator.debugOut.println("destroy");
                            e = new DestroyEvent();
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_ALARM) {
                            org.gcreator.core.gcreator.debugOut.println("alarm");
                            e = new AlarmEvent(first);
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_STEP) {

                            if (first == 1) {
                                e = new BeginStepEvent();
                            } else if (first == 2) {
                                e = new EndStepEvent();
                            } else {
                                e = new StepEvent();
                            }
                            a.events.add(e);
                            id = first;
                            org.gcreator.core.gcreator.debugOut.println("Step Id:" + id);
                        } else if (j == EV_COLLISION) {
                            temp = first;
                            if (temp < c.actors.size() && temp >= 0) {
                                org.gcreator.fileclass.GFile spr = c.actors.get(temp);
                                if (spr != null) {
                                    // a.sprite = spr.getID();
                                    e = new CollisionEvent(spr);
                                    a.events.add(e);
                                    id = first;
                                }
                            }

                        } //ev.other = c.objids.get(first);
                        else if (j == EV_KEYBOARD) {
                            org.gcreator.core.gcreator.debugOut.println("keyboard");
                            e = new KeyboardEvent(first, "" + getKeyText(first));
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_KEYPRESS) {
                            org.gcreator.core.gcreator.debugOut.println("keyboard press");
                            e = new KeyPress(first, "" + getKeyText(first));
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_KEYRELEASE) {
                            org.gcreator.core.gcreator.debugOut.println("keyboard press");
                            e = new KeyReleased(first, "" + getKeyText(first));
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_MOUSE) {
                            System.out.println("mouse event" + first);
                            if (first == 4) {
                                first = 5006;
                            }
                            e = new MouseEvent(first);
                            a.events.add(e);
                            id = first;
                        } else if (j == EV_OTHER) {
                            System.out.println("other events not supported yet");
                        } else if (j == EV_DRAW) {
                            org.gcreator.core.gcreator.debugOut.println("draw");
                            e = new DrawEvent();
                            a.events.add(e);
                            id = first;
                        } else {
                            id = first;
                        } //ev.id = first;
                        //ev.mainId = j;
                        org.gcreator.core.gcreator.debugOut.println("GMI: read action");
                        try {
                            readActions(c, i, j * 1000 + id, e, a);
                        } catch (Exception ee) {
                            ee.printStackTrace();
                            org.gcreator.core.gcreator.debugOut.println("error in actor readactions");
                        }
                    } else {
                        done = true;
                    }
                }
            }
        }
    }

    public static String getKeyText(int keyCode) {
        if (keyCode == 1) {
            return "Any Key";
        }
        if (keyCode >= KeyEvent.VK_0 && keyCode <= KeyEvent.VK_9 ||
                keyCode >= KeyEvent.VK_A && keyCode <= KeyEvent.VK_Z) {
            return String.valueOf((char) keyCode);
        }

        switch (keyCode) {
            case KeyEvent.VK_COMMA:
                return "COMMA";
            case KeyEvent.VK_PERIOD:
                return "PERIOD";
            case KeyEvent.VK_SLASH:
                return "SLASH";
            case KeyEvent.VK_SEMICOLON:
                return "SEMICOLON";
            case KeyEvent.VK_EQUALS:
                return "EQUALS";
            case KeyEvent.VK_OPEN_BRACKET:
                return "OPEN_BRACKET";
            case KeyEvent.VK_BACK_SLASH:
                return "BACK_SLASH";
            case KeyEvent.VK_CLOSE_BRACKET:
                return "CLOSE_BRACKET";

            case KeyEvent.VK_ENTER:
                return "ENTER";
            case KeyEvent.VK_BACK_SPACE:
                return "BACK_SPACE";
            case KeyEvent.VK_TAB:
                return "TAB";
            case KeyEvent.VK_CANCEL:
                return "CANCEL";
            case KeyEvent.VK_CLEAR:
                return "CLEAR";
            case KeyEvent.VK_SHIFT:
                return "SHIFT";
            case KeyEvent.VK_CONTROL:
                return "CONTROL";
            case KeyEvent.VK_ALT:
                return "ALT";
            case KeyEvent.VK_PAUSE:
                return "PAUSE";
            case KeyEvent.VK_CAPS_LOCK:
                return "CAPS_LOCK";
            case KeyEvent.VK_ESCAPE:
                return "ESCAPE";
            case KeyEvent.VK_SPACE:
                return "SPACE";
            case KeyEvent.VK_PAGE_UP:
                return "PAGE_UP";
            case KeyEvent.VK_PAGE_DOWN:
                return "PAGE_DOWN";
            case KeyEvent.VK_END:
                return "END";
            case KeyEvent.VK_HOME:
                return "HOME";
            case KeyEvent.VK_LEFT:
                return "LEFT";
            case KeyEvent.VK_UP:
                return "UP";
            case KeyEvent.VK_RIGHT:
                return "RIGHT";
            case KeyEvent.VK_DOWN:
                return "DOWN";

            // numpad numeric keys handled below
            case KeyEvent.VK_MULTIPLY:
                return "MULTIPLY";
            case KeyEvent.VK_ADD:
                return "ADD";
            case KeyEvent.VK_SEPARATOR:
                return "SEPARATOR";
            case KeyEvent.VK_SUBTRACT:
                return "SUBTRACT";
            case KeyEvent.VK_DECIMAL:
                return "DECIMAL";
            case KeyEvent.VK_DIVIDE:
                return "DIVIDE";
            case KeyEvent.VK_DELETE:
                return "DELETE";
            case KeyEvent.VK_NUM_LOCK:
                return "NUM_LOCK";
            case KeyEvent.VK_SCROLL_LOCK:
                return "SCROLL_LOCK";

            case KeyEvent.VK_F1:
                return "F1";
            case KeyEvent.VK_F2:
                return "F2";
            case KeyEvent.VK_F3:
                return "F3";
            case KeyEvent.VK_F4:
                return "F4";
            case KeyEvent.VK_F5:
                return "F5";
            case KeyEvent.VK_F6:
                return "F6";
            case KeyEvent.VK_F7:
                return "F7";
            case KeyEvent.VK_F8:
                return "F8";
            case KeyEvent.VK_F9:
                return "F9";
            case KeyEvent.VK_F10:
                return "F10";
            case KeyEvent.VK_F11:
                return "F11";
            case KeyEvent.VK_F12:
                return "F12";
            case KeyEvent.VK_F13:
                return "F13";
            case KeyEvent.VK_F14:
                return "F14";
            case KeyEvent.VK_F15:
                return "F15";
            case KeyEvent.VK_F16:
                return "F16";
            case KeyEvent.VK_F17:
                return "F17";
            case KeyEvent.VK_F18:
                return "F18";
            case KeyEvent.VK_F19:
                return "F19";
            case KeyEvent.VK_F20:
                return "F20";
            case KeyEvent.VK_F21:
                return "F21";
            case KeyEvent.VK_F22:
                return "F22";
            case KeyEvent.VK_F23:
                return "F23";
            case KeyEvent.VK_F24:
                return "F24";

            case KeyEvent.VK_PRINTSCREEN:
                return "PRINTSCREEN";
            case KeyEvent.VK_INSERT:
                return "INSERT";
            case KeyEvent.VK_HELP:
                return "HELP";
            case KeyEvent.VK_META:
                return "META";
            case KeyEvent.VK_BACK_QUOTE:
                return "BACK_QUOTE";
            case KeyEvent.VK_QUOTE:
                return "QUOTE";

            case KeyEvent.VK_KP_UP:
                return "KP_UP";
            case KeyEvent.VK_KP_DOWN:
                return "KP_DOWN";
            case KeyEvent.VK_KP_LEFT:
                return "KP_LEFT";
            case KeyEvent.VK_KP_RIGHT:
                return "KP_RIGHT";

            case KeyEvent.VK_DEAD_GRAVE:
                return "DEAD_GRAVE";
            case KeyEvent.VK_DEAD_ACUTE:
                return "DEAD_ACUTE";
            case KeyEvent.VK_DEAD_CIRCUMFLEX:
                return "DEAD_CIRCUMFLEX";
            case KeyEvent.VK_DEAD_TILDE:
                return "DEAD_TILDE";
            case KeyEvent.VK_DEAD_MACRON:
                return "DEAD_MACRON";
            case KeyEvent.VK_DEAD_BREVE:
                return "DEAD_BREVE";
            case KeyEvent.VK_DEAD_ABOVEDOT:
                return "DEAD_ABOVEDOT";
            case KeyEvent.VK_DEAD_DIAERESIS:
                return "DEAD_DIAERESIS";
            case KeyEvent.VK_DEAD_ABOVERING:
                return "DEAD_ABOVERING";
            case KeyEvent.VK_DEAD_DOUBLEACUTE:
                return "DEAD_DOUBLEACUTE";
            case KeyEvent.VK_DEAD_CARON:
                return "DEAD_CARON";
            case KeyEvent.VK_DEAD_CEDILLA:
                return "DEAD_CEDILLA";
            case KeyEvent.VK_DEAD_OGONEK:
                return "DEAD_OGONEK";
            case KeyEvent.VK_DEAD_IOTA:
                return "DEAD_IOTA";
            case KeyEvent.VK_DEAD_VOICED_SOUND:
                return "DEAD_VOICED_SOUND";
            case KeyEvent.VK_DEAD_SEMIVOICED_SOUND:
                return "DEAD_SEMIVOICED_SOUND";

            case KeyEvent.VK_AMPERSAND:
                return "AMPERSAND";
            case KeyEvent.VK_ASTERISK:
                return "ASTERISK";
            case KeyEvent.VK_QUOTEDBL:
                return "QUOTEDBL";
            case KeyEvent.VK_LESS:
                return "LESS";
            case KeyEvent.VK_GREATER:
                return "GREATER";
            case KeyEvent.VK_BRACELEFT:
                return "BRACELEFT";
            case KeyEvent.VK_BRACERIGHT:
                return "BRACERIGHT";
            case KeyEvent.VK_AT:
                return "AT";
            case KeyEvent.VK_COLON:
                return "COLON";
            case KeyEvent.VK_CIRCUMFLEX:
                return "CIRCUMFLEX";
            case KeyEvent.VK_DOLLAR:
                return "DOLLAR";
            case KeyEvent.VK_EURO_SIGN:
                return "EURO_SIGN";
            case KeyEvent.VK_EXCLAMATION_MARK:
                return "EXCLAMATION_MARK";
            case KeyEvent.VK_INVERTED_EXCLAMATION_MARK:
                return "INVERTED_EXCLAMATION_MARK";
            case KeyEvent.VK_LEFT_PARENTHESIS:
                return "LEFT_PARENTHESIS";
            case KeyEvent.VK_NUMBER_SIGN:
                return "NUMBER_SIGN";
            case KeyEvent.VK_MINUS:
                return "MINUS";
            case KeyEvent.VK_PLUS:
                return "PLUS";
            case KeyEvent.VK_RIGHT_PARENTHESIS:
                return "RIGHT_PARENTHESIS";
            case KeyEvent.VK_UNDERSCORE:
                return "UNDERSCORE";

            case KeyEvent.VK_FINAL:
                return "FINAL";
            case KeyEvent.VK_CONVERT:
                return "CONVERT";
            case KeyEvent.VK_NONCONVERT:
                return "NONCONVERT";
            case KeyEvent.VK_ACCEPT:
                return "ACCEPT";
            case KeyEvent.VK_MODECHANGE:
                return "MODECHANGE";
            case KeyEvent.VK_KANA:
                return "KANA";
            case KeyEvent.VK_KANJI:
                return "KANJI";
            case KeyEvent.VK_ALPHANUMERIC:
                return "ALPHANUMERIC";
            case KeyEvent.VK_KATAKANA:
                return "KATAKANA";
            case KeyEvent.VK_HIRAGANA:
                return "HIRAGANA";
            case KeyEvent.VK_FULL_WIDTH:
                return "FULL_WIDTH";
            case KeyEvent.VK_HALF_WIDTH:
                return "HALF_WIDTH";
            case KeyEvent.VK_ROMAN_CHARACTERS:
                return "ROMAN_CHARACTERS";
            case KeyEvent.VK_ALL_CANDIDATES:
                return "ALL_CANDIDATES";
            case KeyEvent.VK_PREVIOUS_CANDIDATE:
                return "PREVIOUS_CANDIDATE";
            case KeyEvent.VK_CODE_INPUT:
                return "CODE_INPUT";
            case KeyEvent.VK_JAPANESE_KATAKANA:
                return "JAPANESE_KATAKANA";
            case KeyEvent.VK_JAPANESE_HIRAGANA:
                return "JAPANESE_HIRAGANA";
            case KeyEvent.VK_JAPANESE_ROMAN:
                return "JAPANESE_ROMAN";
            case KeyEvent.VK_KANA_LOCK:
                return "KANA_LOCK";
            case KeyEvent.VK_INPUT_METHOD_ON_OFF:
                return "INPUT_METHOD_ON_OFF";

            case KeyEvent.VK_AGAIN:
                return "AGAIN";
            case KeyEvent.VK_UNDO:
                return "UNDO";
            case KeyEvent.VK_COPY:
                return "COPY";
            case KeyEvent.VK_PASTE:
                return "PASTE";
            case KeyEvent.VK_CUT:
                return "CUT";
            case KeyEvent.VK_FIND:
                return "FIND";
            case KeyEvent.VK_PROPS:
                return "PROPS";
            case KeyEvent.VK_STOP:
                return "STOP";

            case KeyEvent.VK_COMPOSE:
                return "COMPOSE";
            case KeyEvent.VK_ALT_GRAPH:
                return "ALT_GRAPH";
        }

        if (keyCode >= KeyEvent.VK_NUMPAD0 && keyCode <= KeyEvent.VK_NUMPAD9) {
            char c = (char) (keyCode - KeyEvent.VK_NUMPAD0 + '0');
            return "NUMPAD" + c;
        }

        return "unknown(0x" + Integer.toString(keyCode, 16) + ")";
    }

    private static void readActions(GmFileContext c, int format1, int format2,
            org.gcreator.events.Event e, Resource resource)
            throws IOException, GmFormatException {
        GmStreamDecoder in = c.in;
        int ver = in.read4();
        if (ver != 400) {
            throw new GmFormatException("version error:" + ver);
        }
        int noacts = in.read4();
        ////org.gcreator.core.gcreator.debugOut.println("No of actions:"+noacts);
        for (int i = 0; i < noacts; i++) {
            String code = "", function = "";
            in.skip(4);
            int libid = in.read4();
            int actid = in.read4();
            ////org.gcreator.core.gcreator.debugOut.println("retrive actions");
            int k;
            //boolean unknownLib = (act == null); //this should always be false
            boolean question = false;
            if (true) {
                k = in.read4(); //action kind
                //org.gcreator.core.gcreator.debugOut.println("kind:"+k);//1=sblock,2=eblock,0=comment,7=code
                boolean ar = in.readBool(); //allow relative
                //org.gcreator.core.gcreator.debugOut.println("allow relative:"+ar);
                question = in.readBool(); //is a question
                in.readBool(); //can apply to
                int exectype = in.read4();
                //org.gcreator.core.gcreator.debugOut.println("exectype:"+exectype);

                if (exectype == EXEC_FUNCTION) {
                    function = in.readStr();
                } //Exec info
                else {
                    in.skip(in.read4());
                }

                if (exectype == EXEC_CODE) {
                    code = in.readStr(); //Exec info
                    org.gcreator.core.gcreator.debugOut.println("code action:" + code);
                //org.gcreator.core.gcreator.debugOut.println("read code:"+code);
                } else {
                    in.skip(in.read4());
                //org.gcreator.core.gcreator.debugOut.println("not code");
                }

            } else {
                //org.gcreator.core.gcreator.debugOut.println("error: not unknownlib");
                in.skip(20);
                in.skip(in.read4());
                in.skip(in.read4());
            }
            //org.gcreator.core.gcreator.debugOut.println("action code:"+code+function);
            int arglen = in.read4(); //argument count


            String[] args = null;
            int[] argkind = null;

            int argkinds = in.read4();
            argkind = new int[argkinds];
            for (int x = 0; x < argkinds; x++) {
                argkind[x] = in.read4();
            }

            int appliesTo = in.read4();
            boolean relative = in.readBool(); //relative
            int actualnoargs = in.read4();

            if (actualnoargs != 0) {
                args = new String[actualnoargs];
            }
            for (int l = 0; l < actualnoargs; l++) {
                if (l >= arglen) {
                    in.skip(in.read4());
                    continue;
                }
                args[l] = in.readStr(); //strval
                //change based on arg kind
                if (argkind[l] == 1) {
                    args[l] = "\"" + args[l] + "\"";
                } else if (argkind[l] == 0) {
                } else if (argkind[l] == 5) { //sprite
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.sprites.get(r).name;
                    }
                } else if (argkind[l] == 6) {//sound
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.sounds.get(r).name;
                    }
                } else if (argkind[l] == 7) {//background
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.backgrounds.get(r).name;
                    }
                } else if (argkind[l] == 8) {//path
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.paths.get(r).name;
                    }
                } else if (argkind[l] == 9) {//script
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.scripts.get(r).name;
                    }
                } else if (argkind[l] == 10) {//actor
//                    int r = Integer.parseInt(args[l]);
//                    try{
//                    if (r>c.actors.size())
//                    {}//c.actors.add(i, null);
//                    else if (c.actors.get(r) !=null)
//                    args[l]=c.actors.get(r).name;
//                    }catch(Exception ee){}
                } else if (argkind[l] == 11) {//scene
                    int r = Integer.parseInt(args[l]);
                //args[l]=c.scenes.get(r).name;
                } else if (argkind[l] == 12) {//font
                    int r = Integer.parseInt(args[l]);
                // args[l]=c.fonts.get(r).name; fonts not added yet
                } else if (argkind[l] == 14) {//timeline
                    int r = Integer.parseInt(args[l]);
                    if (r < 0) {
                        args[l] = "null";
                    } else {
                        args[l] = c.timelines.get(r).name;
                    }
                }
            //org.gcreator.core.gcreator.debugOut.println("argkind:"+argkind[l]);
            }

            boolean not = in.readBool(); //Not


            org.gcreator.actions.Action act;

            act = parseAction(code, function, c, null, appliesTo, relative, args, k, question, resource);
            act.project = c.pro;
            // //org.gcreator.core.gcreator.debugOut.println("Got here");
            if (act != null && e != null && e.actions != null) {
                e.actions.add(act);
            }
        }
        org.gcreator.core.gcreator.debugOut.println("Ended actions");
    }

    private static org.gcreator.actions.Action retrieveAction(int libid, int actid, String code, boolean function, String fname, int kind, ArgumentList al, boolean relative, boolean question, Resource res) {
        org.gcreator.actions.Action act = null;

        //check kind
        if (kind == 0) {
            Comment c = new Comment();
            c.text = code.substring(1, code.length() - 1);
            act = new org.gcreator.actions.Action(c, res);
        } else if (kind == 1) {
            act = new org.gcreator.actions.Action(new StartOfABlock(), res);
        } else if (kind == 2) {
            act = new org.gcreator.actions.Action(new EndOfABlock(), res);
        } else if (kind == 3) {
            act = new org.gcreator.actions.Action(new Else(), res);
        } else if (kind == 4) {
            act = new org.gcreator.actions.Action(new Exit(), res);
        } else if (kind == 5) {
            Repeat r = new Repeat();
            r.times = code;
            act = new org.gcreator.actions.Action(r, res);
        } else if (kind == 6) {
            SetVariable s = new SetVariable();
            s.to = al.arguments.get(1);
            s.var = new VariableName(al.arguments.get(0).substring(1, al.arguments.get(0).length() - 1));
            s.relative = relative;
            act = new org.gcreator.actions.Action(s, res);
        }
        if (function) {
            if (question) {
                If i = new If();
                i.condition = "" + fname + "(" + al + ")";
                act = new org.gcreator.actions.Action(i, res);

            } else {
                CallFunction tt = new CallFunction();
                tt.fname = new FunctionName(fname);
                tt.args = al;
                tt.relative = relative;

                act = new org.gcreator.actions.Action(tt, res);
            }
        } else if (kind == 7) {
            ExecuteCode tt = new ExecuteCode();
            tt.code = code.substring(1, code.length() - 1);
            act = new org.gcreator.actions.Action(tt, res);

        }
        return act;
    }

    private static org.gcreator.actions.Action parseAction(String code, String function, GmFileContext c, org.gcreator.actions.Action action, int appliesTo, boolean relative, String[] args, int kind, boolean question, Resource resource) {
        ArgumentList a = new ArgumentList();

        boolean func = true;
        String fname = function;
        if (function.equals("")) {
            func = false;
        }

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null) {
                    a.arguments.add(args[i]);
                    function += " ," + args[i];
                }
            }
        }

        org.gcreator.core.gcreator.debugOut.println("function:" + function);
        //org.gcreator.core.gcreator.debugOut.println("Code:"+code);
        try {
            org.gcreator.actions.Action act = retrieveAction(0, 0, function, func, fname, kind, a, relative, question, resource);
            //org.gcreator.core.gcreator.debugOut.println("aftre ret");
//            if (act.pattern instanceof ExecuteCode)
//            ((ExecuteCode)act.pattern).code = function;




            return act;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
//        if(action.pattern instanceof SetVSpeed){
//            //((VSpeedEditor) action.getPanel()).relative.setSelected(relative);
//            ((VSpeedEditor) action.getPanel()).to.setText(args[0]);
//            if(appliesTo==-1)
//                ((VSpeedEditor) action.getPanel()).of.setText("this");
//        }
    }

    private void readTree(GmFileContext c, int ver) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
     *
     * This will read ahead to get names of future resources so they can be linked from
     * current resources
     *
     */
    private void readahead(GmFileContext c) {
    }//    private void readahead(GmFileContext c) {
//        //this will read ahead to get resource names
//        GmStreamDecoder in = c.in;
//        System.out.println("Reading ahead");
//        
//        //Timelines
//        int ver = in.read4();
//        
//        if (ver != 500) throw versionError("BEFORE","TIMELINES",ver);
//        int noTimelines = in.read4();
//        for(int i = 0; i < noTimelines; i++){
//            if (!in.readBool()){
//                c.timelines.add(null);
//                continue;
//            }
//            
//            //in.readStr(); //Name
//            f = new org.gcreator.fileclass.GFile(tlGroup, in.readStr(), "timeline", null);
//            f.value = a = new Timeline();
//            
//            c.timelines.add(f);
//            ver = in.read4();
//            if (ver != 500) throw versionError("IN","TIMELINES",i,ver);
//            int nomoms = in.read4();
//            for(int j = 0; j < nomoms; j++){
//                //a.steps
//                TimelineStep ts = new TimelineStep();
//                ts.stepnum=in.read4(); //stepnum
//                
//                readTimelineActions(in);
//            }
//        }
//    }
}

class Transparency {

    public static BufferedImage makeColorTransparent(Image im, final Color color) {
        ImageFilter filter = new RGBImageFilter() {
            // the color we are looking for... Alpha bits are set to opaque
            public int markerRGB = color.getRGB() | 0xFF000000;

            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | 0xFF000000) == markerRGB) {
                    // Mark the alpha bits as zero - transparent
                    return 0x00FFFFFF & rgb;
                } else {
                    // nothing to do
                    return rgb;
                }
            }
        };
        ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return createBufferedImage(Toolkit.getDefaultToolkit().createImage(ip));
    }

    private static BufferedImage createBufferedImage(Image image) {
        BufferedImage bi = new BufferedImage(image.getWidth(null), image.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.drawImage(image, 0, 0, null);

        return bi;
    }
}
