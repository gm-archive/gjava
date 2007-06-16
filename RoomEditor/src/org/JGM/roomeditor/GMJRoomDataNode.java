package org.JGM.roomeditor;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.util.datatransfer.ExTransferable;

public class GMJRoomDataNode extends DataNode {
    
    GMJRoomData data;
    public static final DataFlavor Room_DATA_FLAVOR = new DataFlavor( GMJRoomData.class, "Room Data"  );
    
    public static final String IMAGE_ICON_BASE = "org/gmj/gmjfilesupport/room.png";
    
    public GMJRoomDataNode(GMJRoomDataObject obj,GMJRoomData data) {
        super(obj, Children.LEAF);
        setIconBaseWithExtension(IMAGE_ICON_BASE);
        this.data = data;
        //data.path = obj.getPrimaryFile().getPath();
    }
    
     // DND start Adds drag and drop support
    public Transferable drag() throws IOException {
        ExTransferable retValue = ExTransferable.create( super.drag() );
        //add the 'data' into the Transferable
        retValue.put( new ExTransferable.Single( Room_DATA_FLAVOR ) {
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
