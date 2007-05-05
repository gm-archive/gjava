/*
 * ActionSave.java
 *
 * Created on 04 May 2007, 21:00
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor.Action;

import java.io.IOException;
import java.util.Iterator;
import org.openide.cookies.SaveCookie;
import org.openide.windows.TopComponent;

/**
 *
 * @author ali1
 */
public class ActionSave implements SaveCookie {
    /**
     * 
     */
    public ActionDataObject a;
    
    /** Creates a new instance of Save 
     * @param a 
     */
    public ActionSave(ActionDataObject a) {
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
            if (tc instanceof Actioneditor)
            {
                Actioneditor elc = (Actioneditor)tc;
                
                if (a.getPrimaryFile().getPath().equals(elc.path))
                {
                    //elc.requestActive();
                    elc.savefile();
                    
                }
            }
        }
      a.setModified(false);
    }
    
}

