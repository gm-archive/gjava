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
 * @author TGMG
 */
public class Classes implements Resource {
    static final long serialVersionUID = 1L;
    public String value = "";
    
    public Classes(String value){
        this.value = value;
    }
    
    public String writeXml() {
        return value;
    }

     
    public void readXml(String xml) {
        value = xml;
    }

     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone(){
        Classes a = new Classes(value);
        //a.name = name;
        return a;
    }
    
     
    public String toString(){
        return value;
    }
}
