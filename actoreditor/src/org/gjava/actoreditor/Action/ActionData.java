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
import java.util.Properties;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
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
     public  String name = "";
    public  String code = "";
    public  String description = "";
    public  boolean relative=true;
    public  boolean showrelative=true;
    public  boolean showapplies=false;
    public  boolean applies=true;
    public  String img = "";
    public String arg0 = "";
    public String arg1 = "";
    public String arg2 = "";
    public String arg3 = "";
    public String arg4 = "";
    public String arg5 = "";
    public String arg6 = "";
    public String arg7 = "";
    public String caption0 = "";
    public String caption1 = "";
    public String caption2 = "";
    public String caption3 = "";
    public String caption4 = "";
    public String caption5 = "";
    public String caption6 = "";
    public String caption7 = "";
    FileObject pf;
    
   public ActionData()
    {
    }
    
    /** Creates a new instance of MyItemData */
    ActionData( Properties props,FileObject pf ) {
        this.pf = pf;
        this.props = props;
        loadIcons();
        refresh();
    }
    
    public void refresh()
    {
        try {
            props.load(pf.getInputStream());
            this.name =  props.getProperty( PROP_NAME );
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
        this.caption0 = props.getProperty( "caption0" );
        System.out.println("caption0:"+caption0);
        this.caption1 = props.getProperty( "caption1" );
        this.caption2 = props.getProperty( "caption2" );
        this.caption3 = props.getProperty( "caption3" );
        this.caption4 = props.getProperty( "caption4" );
        this.caption5 = props.getProperty( "caption5" );
        this.caption6 = props.getProperty( "caption6" );
        this.caption7 = props.getProperty( "caption7" );
        this.description = props.getProperty("description");
        this.relative = Boolean.parseBoolean(props.getProperty("relative"));
        this.showapplies = Boolean.parseBoolean(props.getProperty("applies"));
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
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
