/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author TGMG
 */
public class Script extends Resource {
    static final long serialVersionUID = 1L;
    public String value = "";
    
    public Script(String value){
        this.value = value;
    }

    /*@Override
    public String exportToHtml(boolean xhtml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/

    @Override
    public Object clone() {
        return new Script(value);
    }
    
    public String toString(){
        return value;
    }
}
