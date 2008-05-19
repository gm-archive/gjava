/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.OutputStream;
import org.gcreator.components.SystemOutputReader;

/**
 *
 * @author bob
 */
public class SystemOutStream extends PrintStreamCensor {
    public static SystemOutputReader dialog;
        
    public SystemOutStream(OutputStream out) {
	super(out, false);
    }
   protected void alert(Object o) {
        if (dialog == null)
            return;
        dialog.addOutLine(o.toString());
    }
    protected void alertln() {
        if (dialog == null)
            return;
        dialog.addOutLine("\n");
    }
}
