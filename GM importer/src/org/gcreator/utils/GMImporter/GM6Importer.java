/*
 * ImportGM6.java
 *
 * Created on 6/Out/2007, 19:58:31
 *
 * Based on Lateral Game MakerGm6FileReader
 */

package org.gcreator.utils.GMImporter;

import java.io.*;
import java.awt.*;
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
        readSettings(settings, c);
        
        in.close();
        
        ProjectTree.importFolderToTree(project, PluginHelper.getWindow().top);
        PluginHelper.getWindow().workspace.updateUI();
    }
    
    private void readSettings(org.gcreator.fileclass.File settings, Gm6FileContext c) throws IOException,Gm6FormatException,
			DataFormatException
    {
        SettingsValues value;
        TabValues Graphics, Resolution;
        settings.value = value = new SettingsValues();
        value.setVariable("Graphics", Graphics = new TabValues("Graphics"));
        value.setVariable("Resolution", Resolution = new TabValues("Resolution"));
       
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
        boolean dontDrawBorder = in.readBool();
        boolean displayCursor = in.readBool();
        int scaling = in.read4();
        Graphics.setVariable("resize", in.readBool());
        boolean alwaysOnTop = alwaysOnTop = in.readBool();
        in.read4(); //Color outside room
        Resolution.setVariable("setres", in.readBool());
        Resolution.setVariable("depth", in.read4() * 16);
        Resolution.setVariable("resol", (Integer) in.read4());
    }
}