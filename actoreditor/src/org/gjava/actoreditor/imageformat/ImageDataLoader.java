package org.gjava.actoreditor.imageformat;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class ImageDataLoader extends UniFileLoader {
    
    public static final String REQUIRED_MIME = "text/x-images";
    
    private static final long serialVersionUID = 1L;
    
    public ImageDataLoader() {
        super("org.gjava.actoreditor.imageformat.ImageDataObject");
    }
    
    protected String defaultDisplayName() {
        return NbBundle.getMessage(ImageDataLoader.class, "LBL_Image_loader_name");
    }
    
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new ImageDataObject(primaryFile, this);
    }
    
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
