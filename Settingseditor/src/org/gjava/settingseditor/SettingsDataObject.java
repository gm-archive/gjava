package org.gjava.settingseditor;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class SettingsDataObject extends MultiDataObject
        implements Lookup.Provider {
    
    public final FileObject pf2;
    
    public SettingsDataObject(FileObject pf, SettingsDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        pf2 = pf;
        CookieSet cookies = getCookieSet();
        cookies.add(new SaveSettings(this));
        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
    }
    
    protected Node createNodeDelegate() {
        return new SettingsDataNode(this, getLookup());
    }
    
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}