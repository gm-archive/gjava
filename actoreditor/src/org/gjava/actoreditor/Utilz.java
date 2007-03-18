/*
 * Utils.java
 *
 * Created on 03 March 2007, 05:38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import java.awt.datatransfer.DataFlavor;
import org.gjava.actoreditor.events.eventData;

/**
 *
 * @author ali1
 */
public class Utilz
{
    public static final DataFlavor ACTION_DATA_FLAVOR = new DataFlavor( ActionData.class, "Action Data" );
    public static final DataFlavor EVENT_DATA_FLAVOR = new DataFlavor( eventData.class, "Event Data" );

    /** Creates a new instance of Utils */
    public Utilz()
    {
    }
    
}
