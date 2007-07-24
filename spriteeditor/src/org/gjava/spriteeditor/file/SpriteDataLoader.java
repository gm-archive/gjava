package org.gjava.spriteeditor.file;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class SpriteDataLoader extends UniFileLoader {
    
    public static final String REQUIRED_MIME = "text/x-sprite";
    
    private static final long serialVersionUID = 1L;
    
    public SpriteDataLoader() {
        super("org.gjava.spriteeditor.file.SpriteDataObject");
    }
    
    protected String defaultDisplayName() {
        return NbBundle.getMessage(SpriteDataLoader.class, "LBL_Sprite_loader_name");
    }
    
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new SpriteDataObject(primaryFile, this);
    }
    
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
