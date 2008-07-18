/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.sax;

/**
 *
 * @author luis
 */
public abstract class Node {
    public abstract String getName();
    public abstract int getAttributeCount();
    public abstract String getAttributeName(int i);
    public abstract String getAttributeValue(String val);
    public abstract String getContent();
    public abstract Node getParent();
    public abstract int getChildrenCount();
    public abstract Node getChildAt(int i);
    
    public String getAttributeValue(int i){
        String name = getAttributeName(i);
        if(name==null) return null;
        return getAttributeValue(name);
    }
}
