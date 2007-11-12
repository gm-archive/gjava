/*
 * Resource.java
 * 
 * Created on 16-Sep-2007, 03:06:42
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.io.Serializable;

/**
 *
 * @author Ali1
 */
public abstract class Resource implements Serializable {
    public String name;
    static final long serialVersionUID = 1L;
    public abstract String writeXml();
    public abstract void readXml(String xml);
    public abstract String exportToHtml(boolean xhtml);
     
    public abstract Resource clone();
}
