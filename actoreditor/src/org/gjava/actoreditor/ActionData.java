/*
 * MyItemData.java
 *
 * Created on 02 March 2007, 16:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import java.awt.Image;
import java.util.Properties;
import org.openide.util.Utilities;

public class ActionData {
    private Properties props;
    
    private Image icon16;
    private Image icon32;
    
    public static final String PROP_ID = "id";
    public static final String PROP_NAME = "displayName";
    public static final String PROP_COMMENT = "comment";
    public static final String PROP_ICON16 = "icon16";
    public static final String PROP_ICON32 = "icon32";
    
    /** Creates a new instance of MyItemData */
    ActionData( Properties props ) {
        this.props = props;
       // loadIcons();
        System.out.println(props.getProperty( "code" ));
    }
    
    public String getId() {
        return props.getProperty( PROP_ID );
    }
    
    public String getDisplayName() {
        return props.getProperty( PROP_NAME );
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
        if( obj instanceof ActionData ) {
            return getId().equals( ((ActionData)obj).getId() );
        }
        return false;
    }
    
    private void loadIcons() {
        String iconId = props.getProperty( PROP_ICON16 );
        icon16 = Utilities.loadImage( iconId );
        iconId = props.getProperty( PROP_ICON32 );
        icon32 = Utilities.loadImage( iconId );
    }
}
