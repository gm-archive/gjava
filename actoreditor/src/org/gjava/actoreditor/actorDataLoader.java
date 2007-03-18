package org.gjava.actoreditor;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class actorDataLoader extends UniFileLoader {

    public static final String REQUIRED_MIME = "text/x-actor";

    private static final long serialVersionUID = 1L;

    public actorDataLoader() {
        super("org.gjava.actoreditor.actorDataObject");
    }

    protected String defaultDisplayName() {
        return NbBundle.getMessage(actorDataLoader.class, "LBL_actor_loader_name");
    }

    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }

    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new actorDataObject(primaryFile, this);
    }

    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }

}
