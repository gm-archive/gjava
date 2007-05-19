/*
 * MyItemData.java
 *
 * Created on 02 March 2007, 16:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor.Action;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
import org.openide.util.Utilities;

public class ActionData {
    private Properties props;
    
    private Image icon16;
    private Image icon32;
    
    public static final String PROP_ID = "id";
    public static String PROP_NAME = "displayName";
    public static final String PROP_COMMENT = "comment";
    public static final String PROP_ICON16 = "icon16";
    public static final String PROP_ICON32 = "icon32";
    public  String code = "";
    public  String img = "";
    public String arg0 = "";
    public String arg1 = "";
    public String arg2 = "";
    public String arg3 = "";
    public String arg4 = "";
    public String arg5 = "";
    public String arg6 = "";
    public String arg7 = "";
    FileObject pf;
    
   public ActionData()
    {
    }
    
    /** Creates a new instance of MyItemData */
    ActionData( Properties props,FileObject pf ) {
        this.pf = pf;
        this.props = props;
        this.img =  props.getProperty( PROP_ICON32 );
        loadIcons();
        //System.out.println(props.getProperty( "code" ));
        this.code = props.getProperty( "code" );
        this.arg0 = props.getProperty( "arg0" );
        this.arg1 = props.getProperty( "arg1" );
        this.arg2 = props.getProperty( "arg2" );
        this.arg3 = props.getProperty( "arg3" );
        this.arg4 = props.getProperty( "arg4" );
        this.arg5 = props.getProperty( "arg5" );
        this.arg6 = props.getProperty( "arg6" );
        this.arg7 = props.getProperty( "arg7" );
    }
    
    public void refresh()
    {
        try {
            props.load(pf.getInputStream());
            this.img = props.getProperty(PROP_ICON32);
            loadIcons();
            this.code = props.getProperty("code");
            this.arg0 = props.getProperty( "arg0" );
        this.arg1 = props.getProperty( "arg1" );
        this.arg2 = props.getProperty( "arg2" );
        this.arg3 = props.getProperty( "arg3" );
        this.arg4 = props.getProperty( "arg4" );
        this.arg5 = props.getProperty( "arg5" );
        this.arg6 = props.getProperty( "arg6" );
        this.arg7 = props.getProperty( "arg7" );
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
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
        String iconId = props.getProperty( PROP_ICON32 );
        icon16 = Utilities.loadImage( iconId );
        iconId = props.getProperty( PROP_ICON32 );
        icon32 = Utilities.loadImage( iconId );
    }
}
