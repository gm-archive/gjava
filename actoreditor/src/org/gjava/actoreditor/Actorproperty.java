/*
 * Actorproperty.java
 *
 * Created on 01 March 2007, 15:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.openide.ErrorManager;

/**
 *
 * @author ali1
 */
public class Actorproperty extends PropertyEditorSupport {

    /** Creates a new instance of Actorproperty */
    public Actorproperty() {
    }

public String getAsText() {
    /*Date d = (Date) getValue();
    if (d == null) {
        return "No Date Set";
    }*/
    return "";//new SimpleDateFormat("MM/dd/yy HH:mm:ss").format(d);
}

public void setAsText(String s) {
    try {
        setValue (new SimpleDateFormat("MM/dd/yy HH:mm:ss").parse(s));
    } catch (ParseException pe) {
        IllegalArgumentException iae = new IllegalArgumentException ("Could not parse date");
        ErrorManager.getDefault().annotate(iae, ErrorManager.USER, 
                iae.getMessage(), iae.getMessage(), null, null);
        throw iae;
    }
}

}
