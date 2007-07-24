package org.gjava.egmllexer;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class EGMLDataLoader extends UniFileLoader {

    public static final String REQUIRED_MIME = "text/x-egml";

    private static final long serialVersionUID = 1L;

    public EGMLDataLoader() {
        super("org.gjava.egmllexer.EGMLDataObject");
    }

    protected String defaultDisplayName() {
        return NbBundle.getMessage(EGMLDataLoader.class, "LBL_EGML_loader_name");
    }

    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }

    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new EGMLDataObject(primaryFile, this);
    }

    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }

}
