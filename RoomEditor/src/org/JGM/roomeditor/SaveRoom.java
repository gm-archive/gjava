/*
 * SaveRoom.java
 *
 * Created on 15 April 2007, 22:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.JGM.roomeditor;

import org.JGM.roomeditor.GMJRoomDataObject;
import org.JGM.roomeditor.*;
import java.io.IOException;
import java.util.Iterator;
import org.JGM.roomeditor.GMJRoomDataObject;
import org.openide.cookies.SaveCookie;
import org.openide.windows.TopComponent;

/**
 *
 * @author ali1
 */
public class SaveRoom implements SaveCookie {
    
    GMJRoomDataObject a;
    
    /** Creates a new instance of SaveRoom */
    public SaveRoom(GMJRoomDataObject a) {
        this.a = a;
    }

    public void save() throws IOException {
       Iterator opened = TopComponent.getRegistry().getOpened().iterator();
        while (opened.hasNext())
        {
            Object tc = opened.next();
            if (tc instanceof RoomEditor)
            {
               RoomEditor elc = (RoomEditor)tc;
                
                if (a.getPrimaryFile().getPath().equals(elc.data.getPrimaryFile().getPath()))
                {
                    //elc.requestActive();
                    elc.savefile();
                    
                }
            }
        }
      a.setModified(false);
      a.writejava();
    }
    
}
