package org.gmj.gmjfilesupport;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataLoader;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

public class JGMRoomDataLoader extends UniFileLoader {
    
    public static final String REQUIRED_MIME = "text/x-gmjroom";
    
    private static final long serialVersionUID = 1L;
    
    public JGMRoomDataLoader() {
        super("org.gmj.gmjfilesupport.GMJRoomDataObject");
    }
    
    protected String defaultDisplayName() {
        return NbBundle.getMessage(JGMRoomDataLoader.class, "LBL_GMJRoom_loader_name");
    }
    
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new GMJRoomDataObject(primaryFile, this);
    }
    
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
    public final Lookup getLookup() {
        return null;
    }
    
    public static DataLoader getLoader (Class loaderClass) {
        return null;
    }
    
    public Node.Cookie getCookie(Class type) {
    return null;
    }
    
}
