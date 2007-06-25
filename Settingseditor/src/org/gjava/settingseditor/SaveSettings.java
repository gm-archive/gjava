/*
 * SaveSettings.java
 * 
 * Created on 13-Jun-2007, 18:00:21
 * 
 * 
 */

package org.gjava.settingseditor;

import java.io.IOException;
import java.util.Iterator;
import org.openide.cookies.SaveCookie;
import org.openide.windows.TopComponent;

/**
 *
 * @author TGMG
 */
public class SaveSettings implements SaveCookie {
    /**
     * 
     */
    public SettingsDataObject a;
    
    /** Creates a new instance of Save 
     * @param a 
     */
    public SaveSettings(SettingsDataObject a) {
        this.a = a;
    }

    /**
     * 
     * @throws java.io.IOException 
     */
    public void save() throws IOException {
        
        Iterator opened = TopComponent.getRegistry().getOpened().iterator();
        while (opened.hasNext())
        {
            Object tc = opened.next();
            if (tc instanceof SettingseditorTopComponent)
            {
                SettingseditorTopComponent elc = (SettingseditorTopComponent)tc;
                
                //if (a.pf2.getPath().equals(elc.path))
               // {
                    //elc.requestActive();
                    elc.savefile();
                    
               // }
            }
        }
      a.setModified(false);
    }
    
}

