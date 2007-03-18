package org.gmj.gmjfilesupport.actor;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class ActorDataLoader extends UniFileLoader {
    
    public static final String REQUIRED_MIME = "text/x-java";
    
    private static final long serialVersionUID = 1L;
    
    public ActorDataLoader() {
        super("org.gmj.gmjfilesupport.actor.ActorDataObject");
    }
    
    protected String defaultDisplayName() {
        return NbBundle.getMessage(ActorDataLoader.class, "LBL_Actor_loader_name");
    }
    
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new ActorDataObject(primaryFile, this);
    }
    
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
