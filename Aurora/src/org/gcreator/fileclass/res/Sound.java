/*
 * Sound.java
 * 
 * Created on 13-Sep-2007, 07:50:14
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author Ali1
 */
public class Sound extends Resource {

    @Override
    public String writeXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readXml(String xml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Resource clone(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
