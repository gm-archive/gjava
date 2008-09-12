/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.sax;

import java.util.Hashtable;
import java.util.Vector;
import org.xml.sax.Attributes;

/**
 *
 * @author luis
 */
public class DefaultNode extends Node {

    private String name = null;
    private Hashtable<String, String> attrs = new Hashtable<String, String>();
    private String content = null;
    private Node parent = null;
    private Vector<Node> children = new Vector<Node>();

    public DefaultNode(Node parent, String name, Attributes attrs) {
        this.parent = parent;
        this.name = name;
        for (int i = 0; i < attrs.getLength(); i++) {
            String n = attrs.getLocalName(i);
            this.attrs.put(n, attrs.getValue(n));
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttributeCount() {
        if (attrs == null) {
            return 0;
        }
        return attrs.size();
    }

    @Override
    public String getAttributeName(int i) {
        if (i < 0) {
            return null;
        }
        try {
            if (i < getAttributeCount()) {
                return (String) attrs.keySet().toArray()[i];
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public String getAttributeValue(String val) {
        if (attrs == null) {
            return null;
        }
        return attrs.get(val);
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
        if (i < 0) {
            return null;
        }
        if (i < getChildrenCount()) {
            return children.get(i);
        }
        return null;
    }

    @Override
    public Node[] getClildren() {
        return children.toArray(new Node[children.size()]);
    }
}
