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
    private GFile file;
    public OpenFileAction(GFile file){
        this.file = file;
    }
    public GFile getFile(){
        return file;
    }
    public void setFile(GFile file){
        this.file = file;
    }
    public void play(){
        gcreator.panel.Open(file);
    }
}
