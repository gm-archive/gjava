package org.gjava.actoreditor;

import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;

public class actorDataNode extends DataNode {

    private static final String IMAGE_ICON_BASE = "org/gjava/actoreditor/object.png";

    public actorData data;
    
    public actorDataNode(actorDataObject obj,actorData data) {
        super(obj, Children.LEAF);
        this.data = data;
        //if (data.img == null)
            setIconBaseWithExtension(IMAGE_ICON_BASE);
        //else
        //setIconBaseWithExtension(data.img);
        
    }
    actorDataNode(actorDataObject obj, Lookup lookup) {
        super(obj, Children.LEAF, lookup);
        setIconBaseWithExtension(IMAGE_ICON_BASE);
    }
    
    // DND start Adds drag and drop support
    public Transferable drag() throws IOException {
        ExTransferable retValue = ExTransferable.create( super.drag() );
        //add the 'data' into the Transferable
        retValue.put( new ExTransferable.Single( Utilz.ACTOR_DATA_FLAVOR ) {
            protected Object getData() throws IOException, UnsupportedFlavorException {
                return data;
            }
        });
        return retValue;
    }
    //DND end

//    /** Creates a property sheet. */
//    protected Sheet createSheet() {
//        Sheet s = super.createSheet();
//        Sheet.Set ss = s.get(Sheet.PROPERTIES);
//        if (ss == null) {
//            ss = Sheet.createPropertiesSet();
//            s.put(ss);
//        }
//        // TODO add some relevant properties: ss.put(...)
//        return s;
//    }

}
