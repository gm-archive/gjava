package org.gjava.actoreditor.imageformat;

import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.gjava.actoreditor.ImageData;
import org.gjava.actoreditor.Utilz;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;

public class ImageDataNode extends DataNode {
    
    private static final String IMAGE_ICON_BASE = "SET/PATH/TO/ICON/HERE";
    
     private ImageData data;
    
    public ImageDataNode(ImageDataObject obj,ImageData data) {
        super(obj, Children.LEAF);
        this.data = data;
        //        setIconBaseWithExtension(IMAGE_ICON_BASE);
    }
    ImageDataNode(ImageDataObject obj, Lookup lookup) {
        super(obj, Children.LEAF, lookup);
        //        setIconBaseWithExtension(IMAGE_ICON_BASE);
    }
    
    // DND start Adds drag and drop support
    public Transferable drag() throws IOException {
        ExTransferable retValue = ExTransferable.create( super.drag() );
        //add the 'data' into the Transferable
        retValue.put( new ExTransferable.Single( Utilz.IMAGE_DATA_FLAVOR ) {
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
