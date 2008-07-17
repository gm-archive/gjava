/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.externproject;

import java.io.File;
import java.util.zip.ZipInputStream;

/**
 *
 * @author luis
 */
public class ImportContext {
    private File f = null;
    public ZipInputStream zip = null;
    
    public ImportContext(File f){
        this.f = f;
    }
    
    public File getFile(){
        return f;
    }
}
