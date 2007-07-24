package org.gjava.egmllexer;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.Children;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

public class EGMLDataObject extends MultiDataObject {

    public EGMLDataObject(FileObject pf, EGMLDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        
        ic = new InstanceContent();
        lookup = new AbstractLookup(ic);
        ic.add(EGMLEditorSupport.create(this));
        ic.add(this);
        
        CookieSet cookies = getCookieSet();
        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
    }
    
    protected Node createNodeDelegate() {
        DataNode n = new DataNode(this,Children.LEAF);
        //n.setIconBaseWithExtension(PROP_NAME);
        return n;
    }

    public Lookup getLookup() {
        return lookup;
    }
    
    public Node.Cookie getCookie(Class type) {
        Object o = lookup.lookup(type);
        return o instanceof Node.Cookie ? (Node.Cookie)o : null;
    }
    final InstanceContent ic;
    private AbstractLookup lookup;
}
