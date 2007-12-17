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
import java.util.zip.*;
import javax.swing.*;
import org.gcreator.core.*;
import org.gcreator.managers.*;
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
    
    
    private GM6Importer() {
    }

    static class Gm6FileContext {
        org.gcreator.fileclass.GameProject pro;
        GmStreamDecoder in;
        Gm6FileContext(org.gcreator.fileclass.GameProject pro, GmStreamDecoder in) {
            this.pro = pro;
            this.in = in;
        }
    }

    private static GmFormatException versionError(String error, String res, int ver) {
        return versionError(error, res, 0, ver);
    }

    private static GmFormatException versionError(String error, String res, int i, int ver) {
        return new GmFormatException("Unsupported"); //$NON-NLS-1$
    }

    public GM6Importer(String fileName) throws IOException, GmFormatException, DataFormatException{
        GmStreamDecoder in = null;
        long startTime = System.currentTimeMillis();
        in = new GmStreamDecoder(fileName);
        org.gcreator.fileclass.GameProject project = org.gcreator.fileclass.GameProject.balance();
        project.name = fileName.replaceAll("(.*(\\\\|/))(.*)\\..*", "$3");
        Aurwindow.setMainProject(project);
        org.gcreator.fileclass.File settings = (org.gcreator.fileclass.File) project.childAt(project.findFromName("Settings"));
        settings.editable = false;
        Gm6FileContext c = new Gm6FileContext(project, in);
        int identifier = in.read4();
        if (identifier != 1234321) {
            throw new GmFormatException("Invalid"); //$NON-NLS-1$
        }
        int ver = in.read4();
        if (ver != 600){
            String msg = "Unsupported"; //$NON-NLS-1$
            throw new GmFormatException(String.format(msg,"",ver)); //$NON-NLS-1$
	}
        SettingsValues values = readSettings(settings, c);
        
        in.close();
        
        ProjectTree.importFolderToTree(project, PluginHelper.getWindow().top);
        PluginHelper.getWindow().workspace.updateUI();
    }
    
    private SettingsValues readSettings(org.gcreator.fileclass.File settings, Gm6FileContext c) throws IOException,GmFormatException,
			DataFormatException
    {
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
        if (ver != 542 && ver != 600 && ver != 702){
            String msg = "Unsupported"; //$NON-NLS-1$
            throw new GmFormatException(String.format(msg,"",ver)); //$NON-NLS-1$
	}
        boolean startFullscreen = in.readBool();
        boolean interpolate = false;
        if (ver > 542) interpolate = in.readBool();
        Graphics.setVariable("borderless", in.readBool());
        boolean displayCursor = in.readBool();
        int scaling = in.read4();
        if (ver == 530)
            in.skip(8); //"fullscreen scale" & "only scale w/ hardware support" 
        else{
        Graphics.setVariable("resize", in.readBool());
        boolean alwaysOnTop = alwaysOnTop = in.readBool();
        in.read4(); //Color outside room
        }
        Resolution.setVariable("setres", in.readBool());
        if (ver == 530)
			{
			in.skip(8); //Color Depth, Exclusive Graphics
			byte b = (byte) in.read4();
			if (b == 6)
				Resolution.setVariable("resol", (Integer) 0);
			else if (b == 5)
				Resolution.setVariable("resol", (Integer) 1);
			else
				Resolution.setVariable("resol", (Integer) (b-2));
			b = (byte) in.read4();
			Resolution.setVariable("frequency", (Integer) ((b == 4) ? 0 : (b + 1)));
			in.skip(8); //vertical blank, caption in fullscreen
			}
        else{
            Resolution.setVariable("depth", (Integer) (in.read4() * 16));
            Resolution.setVariable("resol", (Integer) in.read4());
            Resolution.setVariable("frequency", (Integer) in.read4());
        }
        boolean dontShowButtons = in.readBool();
        boolean useSynchronization = false;
	if (ver > 530) useSynchronization = in.readBool();
        Other.setVariable("F4", (Boolean) in.readBool());
        boolean F1 = in.readBool();
        Other.setVariable("ESC", (Boolean) in.readBool());
        boolean F5andF6 = in.readBool();
        if (ver == 530) in.skip(8); //unknown bytes, both 0
	if (ver == 702) in.skip(8); //F9 screenshot, Treat close as esc
        int priority = in.read4();
        boolean losefocusfreeze = in.readBool();
        int loadBarMode = in.read4();
        BufferedImage back = null, front = null;
        if (loadBarMode == LOADBAR_CUSTOM)
	{
            if (in.read4() != -1) back = in.readImage(); //back
            if (in.read4() != -1) front = in.readImage(); //front
        }
        boolean showCustomLoadImage = in.readBool();
        BufferedImage loadingImage = null;
        if (showCustomLoadImage) if (in.read4() != -1) loadingImage = in.readImage();
        boolean imagePartiallyTransparent = in.readBool();
        int loadImageAlpha = in.read4();
        boolean scaleProgressBar = in.readBool();
        int length = in.read4();
        byte[] gameIconData = new byte[length];
        in.read(gameIconData,0,length);
        BufferedImage gameIcon = null;
        try{
			ByteArrayInputStream bais = new ByteArrayInputStream(gameIconData);
			gameIcon = (BufferedImage) new ICOFile(bais).getDescriptor(0).getImageRGB();
	}
	catch (Exception e){
            // hopefully this won't happen
            e.printStackTrace();
	}
        boolean displayErrors = in.readBool();
        boolean writeToLog = in.readBool();
        boolean abortOnError = in.readBool();
        boolean treatUninitializedAs0 = in.readBool();
        String author = in.readStr();
        String version;
        if (ver > 600)
            version = in.readStr();
	else
            version = Integer.toString(in.read4());
        double lastChanged = in.readD();
        String information = in.readStr();
        int no = in.read4();
	for (int i = 0; i < no; i++){
            /*Constant con = new Constant();
            g.constants.add(con);*/
            /*con.name = */in.readStr();
            /*con.value = */in.readStr();
	}
        if (ver > 600){
            in.skip(4); //Major
            in.skip(4); //Minor
            in.skip(4); //Release
            in.skip(4); //Build
            in.skip(in.read4()); //Company
            in.skip(in.read4()); //Product
            in.skip(in.read4()); //Copyright
            in.skip(in.read4()); //Description
	}
	else if (ver > 530){
            no = in.read4();
            for (int i = 0; i < no; i++)
            {
                /*Include inc = new Include();
		g.includes.add(inc);
		inc.filePath = */in.readStr();
            }
            int includeFolder = in.read4();
            boolean overwriteExisting = in.readBool();
            boolean removeAtGameEnd = in.readBool();
	}
        return value;
    }
    
    public void readSounds(Gm6FileContext c) throws IOException,GmFormatException,
			DataFormatException{
        //Will have to figure out how to ignore files until the sound system is implemented
    }
}