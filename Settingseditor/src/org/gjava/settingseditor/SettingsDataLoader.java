package org.gjava.settingseditor;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class SettingsDataLoader extends UniFileLoader {
    
    public static final String REQUIRED_MIME = "text/x-settings";
    
    private static final long serialVersionUID = 1L;
    
    public SettingsDataLoader() {
        super("org.gjava.settingseditor.SettingsDataObject");
    }
    
    protected String defaultDisplayName() {
        return NbBundle.getMessage(SettingsDataLoader.class, "LBL_Settings_loader_name");
    }
    
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new SettingsDataObject(primaryFile, this);
    }
    
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
