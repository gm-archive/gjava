package org.gjava.actoreditor.Action;

import org.gjava.actoreditor.*;
import java.awt.Image;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.beans.BeanInfo;
import java.io.IOException;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;

public class ActionDataNode extends DataNode
{
    
    private static final String IMAGE_ICON_BASE = "org/gjava/actoreditor/info.png";
    private ActionData data;
    
    public ActionDataNode(ActionDataObject obj,ActionData data)
    {
        super(obj, Children.LEAF);
        //setIconBaseWithExtension(IMAGE_ICON_BASE);
        this.data = data;
        //setName( data.getId() );
        //setShortDescription( data.getComment() );
    }
    ActionDataNode(ActionDataObject obj, Lookup lookup)
    {
        super(obj, Children.LEAF, lookup);
        setIconBaseWithExtension(IMAGE_ICON_BASE);
        
    }
    
    public Image getIcon(int i) {
        if( i == BeanInfo.ICON_COLOR_16x16 || i == BeanInfo.ICON_MONO_16x16 ) {
            return data.getSmallImage();
        }
        return data.getBigImage();
    }
    
    public String getDisplayName() {
        return data.getDisplayName();
    }

    // DND start
    public Transferable drag() throws IOException {
        //data.refresh();
        ExTransferable retValue = ExTransferable.create( super.drag() );
        //add the 'data' into the Transferable
        retValue.put( new ExTransferable.Single( Utilz.ACTION_DATA_FLAVOR ) {
            protected Object getData() throws IOException, UnsupportedFlavorException {
                return data;
            }
        });
        return retValue;
    }
    //DND end
    
}
