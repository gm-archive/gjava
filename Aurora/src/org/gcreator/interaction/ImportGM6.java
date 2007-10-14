/*
 * ImportGM6.java
 *
 * Created on 6/Out/2007, 19:58:31
 *
 * Based on Lateral Game MakerGm6FileReader
 */

package org.gcreator.interaction;

import java.io.*;
import java.awt.*;
import java.util.zip.*;
import javax.swing.*;
import org.gcreator.core.*;
import org.gcreator.managers.*;
import org.gcreator.fileclass.res.*;
import org.lateralgm.file.*;
import org.lateralgm.messages.*;

/**
 *
 * @author Luís
 */
public class ImportGM6 {

    private ImportGM6() {
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
        return new Gm6FormatException(String.format(Messages.getString("Gm6FileReader.ERROR_UNSUPPORTED"), String.format(Messages.getString("Gm6FileReader." + error), Messages.getString("LGM." + res), i), ver)); //$NON-NLS-1$
    }
    public static JFileChooser chooser = null;

    public static ImportGM6 callDialog(Component caller) throws IOException, Gm6FormatException, DataFormatException{
        if (chooser == null) {
            chooser = new JFileChooser();
        }
        chooser.showOpenDialog(caller);
        File f = chooser.getSelectedFile();
        if (f == null) {
            return null;
        }
        return new ImportGM6(f.getPath());
    }

    public ImportGM6(String fileName) throws IOException, Gm6FormatException, DataFormatException{
        GmStreamDecoder in = null;
        long startTime = System.currentTimeMillis();
        in = new GmStreamDecoder(fileName);
        org.gcreator.fileclass.GameProject project = new org.gcreator.fileclass.GameProject(fileName.replaceAll("(.*(\\\\|/))(.*)\\..*", "$3"),"");
        Aurwindow.setMainProject(project);
        project.add(new org.gcreator.fileclass.ImageGroup(project, "Images"));
        project.add(new org.gcreator.fileclass.SpriteGroup(project, "Sprites"));
        project.add(new org.gcreator.fileclass.SoundGroup(project, "Sounds"));
        project.add(new org.gcreator.fileclass.ActorGroup(project, "Actors"));
        project.add(new org.gcreator.fileclass.SceneGroup(project, "Scenes"));
        project.add(new org.gcreator.fileclass.EGMLGroup(project, "Classes"));
        project.add(new org.gcreator.fileclass.Group(project, "Extensions"));
        org.gcreator.fileclass.File settings = new org.gcreator.fileclass.File(project, "Settings", "settings", null);
        settings.editable = false;
        Gm6FileContext c = new Gm6FileContext(project, in);
        int identifier = in.read4();
        if (identifier != 1234321) {
            throw new Gm6FormatException(String.format(Messages.getString("Gm6FileReader.ERROR_INVALID"), fileName, identifier)); //$NON-NLS-1$
        }
        int ver = in.read4();
        if (ver != 600){
            String msg = Messages.getString("Gm6FileReader.ERROR_UNSUPPORTED"); //$NON-NLS-1$
            throw new Gm6FormatException(String.format(msg,"",ver)); //$NON-NLS-1$
	}
        readSettings(settings, c);
        
        in.close();
        
        ProjectTree.importFolderToTree(project, org.gcreator.core.gcreator.window.top);
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
            String msg = Messages.getString("Gm6FileReader.ERROR_UNSUPPORTED"); //$NON-NLS-1$
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