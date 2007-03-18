package org.gjava.actoreditor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class ActionDataObject extends MultiDataObject
        implements Lookup.Provider
{
    
    private ActionData data;
    
    public ActionDataObject(FileObject pf, ActionDataLoader loader) throws DataObjectExistsException, IOException
    {
        super(pf, loader);
    //DND start 
    //create the 'data' from properties file:
    InputStream input = pf.getInputStream();
    Properties props = new Properties();
    props.load( input );
    input.close();
    data = new ActionData( props );
    //DND end
    }
    
    protected Node createNodeDelegate()
    {
        return new ActionDataNode(this, data);
    }
    
    public Lookup getLookup()
    {
        return getCookieSet().getLookup();
    }
}
