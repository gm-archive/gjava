/*
 * ImportGM6.java
 *
 * Created on 6/Out/2007, 19:58:31
 *
 * Based on Lateral Game MakerGm6FileReader
 */

package interaction;

import java.io.*;
import java.awt.*;
import java.util.zip.*;
import javax.swing.*;
import core.*;
import managers.*;
import fileclass.res.*;
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
        fileclass.GameProject pro;
        GmStreamDecoder in;
        Gm6FileContext(fileclass.GameProject pro, GmStreamDecoder in) {
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
        fileclass.GameProject project = new fileclass.GameProject(fileName.replaceAll("(.*(\\\\|/))(.*)\\..*", "$3"),"");
        Aurwindow.setMainProject(project);
        project.add(new fileclass.ImageGroup(project, "Images"));
        project.add(new fileclass.SpriteGroup(project, "Sprites"));
        project.add(new fileclass.SoundGroup(project, "Sounds"));
        project.add(new fileclass.ActorGroup(project, "Actors"));
        project.add(new fileclass.SceneGroup(project, "Scenes"));
        project.add(new fileclass.EGMLGroup(project, "Classes"));
        project.add(new fileclass.Group(project, "Extensions"));
        fileclass.File settings = new fileclass.File(project, "Settings", "settings", null);
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
        
        ProjectTree.importFolderToTree(project, core.aurora.window.top);
    }
    
    private void readSettings(fileclass.File settings, Gm6FileContext c) throws IOException,Gm6FormatException,
			DataFormatException
    {
        GmStreamDecoder in = c.in;
        in.read4(); //Game ID - unused
        in.skip(16); // unknown bytes following game id
        int ver = in.read4();
        if (ver != 542 && ver != 600 && ver != 702){
            String msg = Messages.getString("Gm6FileReader.ERROR_UNSUPPORTED"); //$NON-NLS-1$
            throw new Gm6FormatException(String.format(msg,"",ver)); //$NON-NLS-1$
	}
        fileclass.res.SettingsValues value = new fileclass.res.SettingsValues();
        settings.value = value;
    }
}