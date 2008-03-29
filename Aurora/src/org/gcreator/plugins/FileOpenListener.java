/*
 * This is the prototype for custom editors
 */

package org.gcreator.plugins;

import javax.swing.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author luis
 */
public interface FileOpenListener {
    public String[] getFileFormats();
    public boolean openNewFile(org.gcreator.fileclass.GFile file, Project project, ImageIcon img);
    public java.lang.Object generateResource(org.gcreator.fileclass.GFile file, String value);
}
