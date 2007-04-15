package org.gjava.actoreditor.imageformat;

import java.io.IOException;
import org.gjava.actoreditor.ImageData;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class ImageDataObject extends MultiDataObject
        implements Lookup.Provider {
    
    private ImageData data = new ImageData();
    
    public ImageDataObject(FileObject pf, ImageDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
        this.data.path = pf.getPath();
    }
    
    protected Node createNodeDelegate() {
        return new ImageDataNode(this, data);
    }
    
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}
