/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author luis
 */
public class Structure extends Resource{
    static final long serialVersionUID = 1L;
    
    public Resource clone(){
        Structure res = new Structure();
        
        return res;
    }
    
    public String exportToHtml(boolean xhtml){
        return "";
    }
}
