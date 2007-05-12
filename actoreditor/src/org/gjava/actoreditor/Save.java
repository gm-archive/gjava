/*
 * Save.java
 *
 * Created on 15 April 2007, 14:38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import java.io.IOException;
import java.util.Iterator;
import org.openide.cookies.SaveCookie;
import org.openide.windows.TopComponent;

/**
 *
 * @author ali1
 */
public class Save implements SaveCookie {
    /**
     * 
     */
    public actorDataObject a;
    
    /** Creates a new instance of Save 
     * @param a 
     */
    public Save(actorDataObject a) {
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
            if (tc instanceof Actoreditor)
            {
                Actoreditor elc = (Actoreditor)tc;
                
                if (a.pf2.getPath().equals(elc.path))
                {
                    //elc.requestActive();
                    elc.save();
                    
                }
            }
        }
      a.setModified(false);
    }
    
}
