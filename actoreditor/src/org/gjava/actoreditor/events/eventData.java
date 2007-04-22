package org.gjava.actoreditor.events;

import java.awt.Image;
import java.util.Properties;
import java.util.Vector;
import javax.swing.DefaultListModel;
import org.openide.util.Utilities;

public class eventData {
    private Properties props;
    
    private Image icon16;
    private Image icon32;
    
    public final String PROP_ID = "id";
    public  final String PROP_NAME = "displayName";
    public  final String PROP_COMMENT = "comment";
    public final String PROP_ICON16 = "icon16";
    public final String PROP_ICON32 = "icon32";
    public DefaultListModel actions = new DefaultListModel();
     public  String code = "";
    public  String img = "";
    public String name = "";
    
    /** Creates a new instance of MyItemData */
    eventData( Properties props ) {
        this.props = props;
        loadIcons();
        this.img =  props.getProperty( PROP_ICON32 );
        this.name = props.getProperty( PROP_NAME );
    }
    
    public String getId() {
        return props.getProperty( PROP_ID );
    }
    
    public String getDisplayName() {
        return name;
    }
    
    public String getComment() {
        return props.getProperty( PROP_COMMENT );
    }
    
    public Image getSmallImage() {
        return icon16;
    }
    
    public Image getBigImage() {
        return icon32;
    }

    public boolean equals(Object obj) {
        if( obj instanceof eventData ) {
            return getId().equals( ((eventData)obj).getId() );
        }
        return false;
    }
    
    private void loadIcons() {
       /* String iconId = props.getProperty( PROP_ICON16 );
        icon16 = Utilities.loadImage( iconId );
        iconId = props.getProperty( PROP_ICON32 );
        icon32 = Utilities.loadImage( iconId );*/
    }
}


    

