/*
 * Classes.java
 * 
 * Created on 16-Sep-2007, 04:34:09
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author Ali1
 */
public class Classes extends Resource {

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
        Classes a = new Classes();
        a.name = name;
        return a;
    }
}
