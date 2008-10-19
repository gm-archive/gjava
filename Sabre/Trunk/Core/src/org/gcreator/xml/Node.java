/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package org.gcreator.xml;

import java.util.Hashtable;
import java.util.Vector;
import org.xml.sax.Attributes;

/**
 * Contains information about a XML node.
 * @author Luís Reis
 */
public final class Node {

    private Node parent = null;
    private String name = null;
    private Vector<Node> children = new Vector<Node>();
    private Hashtable<String, String> attributes = new Hashtable<String, String>();
    private String content = null;

    /**
     * Creates a new Node
     * <br>
     * For example:<br>
     * &lt;abc def="ghi"&gt;&lt;jkl/&gt;&lt;/abc&gt;<br>
     * "abc" is the name, "def" is an attribute with value "ghi" and
     * the "abc" node is the parent of "jkl" node.
     * 
     * @param parent The parent of this node. Can be null if root node.
     * @param name The name of the node.
     * @param attributes The attributes of the node
     */
    public Node(Node parent, String name, Attributes attributes) {
        this.parent = parent;
        this.name = name;
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                String s = attributes.getLocalName(i);
                this.attributes.put(s, attributes.getValue(s));
            }
        }
    }

    /**
     * Gets the parent of the node
     * @see #addChild(Node)
     */
    public Node getParent() {
        return parent;
    }

    /**
     * Gets the name of the node
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a child node.
     * @param node The child node to be added. For consistency reasons,
     * the node should be added only to its parent.
     * 
     * @see #getParent()
     * @see #getChildren()
     */
    public void addChild(Node node) {
        children.add(node);
    }

    /**
     * Gets the children of this node
     * 
     * @see #addChild(Node)
     */
    public Vector<Node> getChildren() {
        return (Vector<Node>) children.clone();
    }

    /**
     * Counts the number of children
     * 
     * @see #addChild(Node)
     * @see #getChildren()
     */
    public int countChildren() {
        return children.size();
    }

    /**
     * Gets the content of the node.<br>
     * For example:<br>
     * &lt;abc&gt;DEFGHI&lt;/abc&gt;<br>
     * "abc" is a node with content "DEFGHI".
     * 
     * @see #setContent(String)
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content of the node
     * @param content The content of the node
     * @see #getContent()
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the number of attributes
     * @see #getAttributeName(int)
     * @see #getAttributeValue(String)
     */
    public int getAttributeCount() {
        if (attributes == null) {
            return 0;
        }
        return attributes.size();
    }

    /**
     * Gets the name of the attribute
     * @param i The position of the attribute.
     * @see #getAttributeCount()
     * @see #getAttributeValue(String)
     */
    public String getAttributeName(int i) {
        if (i < 0) {
            return null;
        }
        try {
            if (i < getAttributeCount()) {
                return (String) attributes.keySet().toArray()[i];
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    /**
     * Whether or not the root has the given attribute
     * @param key The attribute to check
     */
    public boolean hasAttribute(String key) {
        return attributes.containsKey(key);
    }

    /**
     * Modifies an attribute
     * @param key The attribute
     * @param value The value
     */
    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }

    /**
     * Gets the value of an attribute
     * @param val The name of the attribute
     * @see #getAttributeName(int)
     * @see #getAttributeValueAsInteger(String)
     */
    public String getAttributeValue(String val) {
        if (attributes == null) {
            return null;
        }
        return attributes.get(val);
    }

    /**
     * Calls {@link #getAttributeValue(String)} and converts the result
     * to int
     * @param val The name of the attribute
     * @return The value of the attribute as an integer, or -1 if that's not
     * possible
     * 
     * @see #getAttributeValue(String)
     */
    public int getAttributeValueAsInteger(String val) {
        if (attributes == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributes.get(val));
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * Converts to string
     * In order for toString() to work, the node must NOT have
     * BOTH content and child nodes.
     */
    @Override
    public String toString() {
        String res = "<" + getName();
        for (int i = 0; i < getAttributeCount(); i++) {
            String attr = getAttributeName(i);
            res += " " + attr + "=\"" + getAttributeValue(attr).replaceAll("&", "&amp;").replaceAll("\"", "&quot;") + "\"";
        }
        if (getContent().equals("") && countChildren() == 0) {
            return res + "/>";
        } else {
            res += ">";
        }

        if (countChildren() != 0) {
            for (Node n : getChildren()) {
                res += "\n" + n.toString();
            }
            res += "\n";
        } else {
            res += getContent().replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        }

        res += "</" + getName() + ">";

        return res;
    }
}
