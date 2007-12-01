/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.macro;

import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class OpenFileAction implements MacroAction{
    private File file;
    public OpenFileAction(File file){
        this.file = file;
    }
    public File getFile(){
        return file;
    }
    public void setFile(File file){
        this.file = file;
    }
    public void play(){
        gcreator.window.Open(file);
    }
}
