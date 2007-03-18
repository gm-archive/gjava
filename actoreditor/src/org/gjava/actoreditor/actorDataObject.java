package org.gjava.actoreditor;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class actorDataObject extends MultiDataObject 
implements Lookup.Provider {
    
    private ActionData data;

    public actorDataObject(FileObject pf, actorDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        //cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
        cookies.add(new ActorSaveCookie());
        //cookies.add(new OpenActor(getNodeDelegate()));
        
    }
    
    protected Node createNodeDelegate() {
        return new actorDataNode(this, getLookup());
    }

    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}
