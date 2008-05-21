/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.OutputStream;
import org.gcreator.components.SystemOutputReader;
import org.gcreator.core.utilities;

/**
 *
 * @author bob
 */
public class SystemErrStream extends PrintStreamCensor {
    public static SystemOutputReader dialog;
        
    public SystemErrStream(OutputStream out) {
	super(out, false);
    }
   protected void alert(Object o) {
        if (dialog == null)
            return;
        dialog.addErrLine(o.toString());
        utilities.addStringFormatedMessage(o.toString(), "red", false);
    }
    protected void alertln() {
        if (dialog == null)
            return;
        dialog.addErrLine("\n");
    }
}
