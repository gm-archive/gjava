/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.sax;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author luis
 */
public class SAXParser extends DefaultHandler {

    private Node current = null;
    private Node root = null;
    private boolean finished = false;

    public void startElement(String namespaceURI, String localName, String qualifiedName, Attributes atts)
            throws SAXException {
        
        if(root==null) root = current;
        else if(current==null) throw new SAXException("Multiple roots");
        Node prev = current;
        current = new DefaultNode(prev, localName, atts);
        if(prev!=null&&prev instanceof DefaultNode)
            ((DefaultNode) prev).addChild(current);
    }
    
    public void endElement(String namespaceURI, String localName, String qualifiedName)
    throws SAXException {
    
        current = current.getParent();
    }
    
    public void characters(char[] text, int start, int length) {
        if(current!=null&&current instanceof DefaultNode)
            ((DefaultNode) current).setContent(new String(text).substring(start, start+length));
    }
    
    public Node getRootNode(){
        return root;
    }
    
    public void endDocument(){
        finished = true;
    }

     public SAXParser(InputStream is) throws SAXException, IOException{
        XMLReader xr = XMLReaderFactory.createXMLReader();
        xr.setContentHandler(this);
        xr.setErrorHandler(this);
        xr.parse(new InputSource(is));
    }
}
