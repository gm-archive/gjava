package org.gmj.gmjfilesupport.actor;

import java.io.IOException;
import javax.swing.Action;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.text.DataEditorSupport;
import org.openide.util.Lookup;
import org.openide.util.lookup.InstanceContent;

public class ActorDataObject extends MultiDataObject {
    
    public ActorDataObject(FileObject pf, ActorDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        InstanceContent content = new InstanceContent();
        
        CookieSet cookies = getCookieSet();
        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
       content.add( initializePalette() );
        
    }
    
    protected Node createNodeDelegate() {
        return new ActorDataNode(this);
    }
    
    private PaletteController initializePalette() {
        try {
            return PaletteFactory.createPalette( "RoomEditorPalette", new PaletteActions() {
                public Action[] getCustomCategoryActions(Lookup lookup) {
                    return new Action[0];
                }
                public Action[] getCustomItemActions(Lookup lookup) {
                    return new Action[0];
                }
                public Action[] getCustomPaletteActions() {
                    return new Action[0];
                }
                public Action[] getImportActions() {
                    return new Action[0];
                }
                public Action getPreferredAction(Lookup lookup) {
                    return null; //TODO
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }
}
