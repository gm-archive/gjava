package org.gjava.actoreditor.Action;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class ActionDataLoader extends UniFileLoader
{
    
    public static final String REQUIRED_MIME = "text/x-action";
    
    private static final long serialVersionUID = 1L;
    
    public ActionDataLoader()
    {
        super("org.gjava.actoreditor.ActionDataObject");
    }
    
    protected String defaultDisplayName()
    {
        return NbBundle.getMessage(ActionDataLoader.class, "LBL_Action_loader_name");
    }
    
    protected void initialize()
    {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException
    {
        return new ActionDataObject(primaryFile, this);
    }
    
    protected String actionsContext()
    {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
