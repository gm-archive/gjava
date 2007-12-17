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

    private static Gm6FormatException versionError(String error, String res, int ver) {
        return versionError(error, res, 0, ver);
    }

    private static Gm6FormatException versionError(String error, String res, int i, int ver) {
        return new Gm6FormatException("Unsupported"); //$NON-NLS-1$
    }

    public GM6Importer(String fileName) throws IOException, Gm6FormatException, DataFormatException{
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
            throw new Gm6FormatException("Invalid"); //$NON-NLS-1$
        }
        int ver = in.read4();
        if (ver != 600){
            String msg = "Unsupported"; //$NON-NLS-1$
            throw new Gm6FormatException(String.format(msg,"",ver)); //$NON-NLS-1$
	}
        SettingsValues values = readSettings(settings, c);
        
        in.close();
        
        ProjectTree.importFolderToTree(project, PluginHelper.getWindow().top);
        PluginHelper.getWindow().workspace.updateUI();
    }
    
    private SettingsValues readSettings(org.gcreator.fileclass.File settings, Gm6FileContext c) throws IOException,Gm6FormatException,
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
            throw new Gm6FormatException(String.format(msg,"",ver)); //$NON-NLS-1$
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
        return value;
    }
}