package org.gmj.gmjfilesupport;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.text.DataEditorSupport;
import org.openide.util.actions.SystemAction;

public class GMJRoomDataObject extends MultiDataObject {
    
    public GMJRoomDataObject(FileObject pf, JGMRoomDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        //CookieSet cookies = getCookieSet();
        //cookies.add((Node.Cookie) RoomEditorCookie.open(this));
        
    }
    
    /*protected Node createNodeDelegate() {
        return new GMJRoomDataNode(this);
    }*/
    protected Node createNodeDelegate () {
        GMJRoomDataNode me = new GMJRoomDataNode(this);
        //me.setDefaultAction (SystemAction.get (OpenRoom.class));
        return me;
    }
    
}
