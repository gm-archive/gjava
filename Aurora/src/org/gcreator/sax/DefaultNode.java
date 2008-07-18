/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.sax;

import java.util.Vector;
import org.xml.sax.Attributes;

/**
 *
 * @author luis
 */
public class DefaultNode extends Node{
    private String name = null;
    private Attributes attrs = null;
    private String content = null;
    private Node parent = null;
    private Vector<Node> children = new Vector<Node>();
    
    public DefaultNode(Node parent, String name, Attributes attrs){
        this.parent = parent;
        this.name = name;
        this.attrs = attrs;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    
    public void addChild(Node child){
        children.add(child);
    }
    
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getAttributeCount() {
        if(attrs==null) return 0;
        return attrs.getLength();
    }

    @Override
    public String getAttributeName(int i) {
        if(i<0) return null;
        if(i<getAttributeCount()) return attrs.getLocalName(i);
        return null;
    }

    @Override
    public String getAttributeValue(String val) {
        if(attrs==null) return null;
        return attrs.getValue(val);
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public int getChildrenCount() {
        return children.size();
    }

    @Override
    public Node getChildAt(int i) {
        if(i<0) return null;
        if(i<getChildrenCount()) return children.get(i);
        return null;
    }
}
