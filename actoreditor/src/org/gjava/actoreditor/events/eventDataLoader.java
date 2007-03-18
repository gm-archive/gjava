package org.gjava.actoreditor.events;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class eventDataLoader extends UniFileLoader
{
    
    public static final String REQUIRED_MIME = "text/x-event";
    
    private static final long serialVersionUID = 1L;
    
    public eventDataLoader()
    {
        super("org.gjava.actoreditor.events.eventDataObject");
    }
    
    protected String defaultDisplayName()
    {
        return NbBundle.getMessage(eventDataLoader.class, "LBL_event_loader_name");
    }
    
    protected void initialize()
    {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }
    
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException
    {
        return new eventDataObject(primaryFile, this);
    }
    
    protected String actionsContext()
    {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
    
}
