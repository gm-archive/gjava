/*
 * This is the prototype for custom editors
 */

package org.gcreator.plugins;

import org.gcreator.fileclass.*;

/**
 *
 * @author luis
 */
public interface FileOpenListener {
    public String[] getFileFormats();
    public boolean openNewFile(org.gcreator.fileclass.File file, Project project);
}
