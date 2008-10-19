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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * An easy SAX-based class designed to import a XML file and generate the
 * adequated {@link Node} instances.
 * @author Luís Reis
 */
public class SAXImporter extends DefaultHandler {

    private Node root = null;
    private Node current = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void startElement(String namespace, String localName,
            String qualifiedName, Attributes attributes) throws SAXException {

        if (root == null) {
            root = current;
        } else if (current == null) {
            throw new SAXException("Document with multiple roots: unsupported feature");
        }
        Node previous = current;
        current = new Node(previous, localName, attributes);
        if (previous != null) {
            previous.addChild(current);
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void endElement(String namespace, String localName, String qualifiedName) {
        current = current.getParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void characters(char[] text, int start, int length) {
        if (current != null) {
            current.setContent(new String(text).substring(start, start + length));
        }
    }

    /**
     * Gets the root of the document
     * @see Node
     */
    public Node getDocumentRoot() {
        return root;
    }

    /**
     * Creates a SAXImporter from a file
     * @param file The XML file
     * @throws java.io.IOException If there is an error reading the file
     * @throws org.xml.sax.SAXException If there is an error parsing the XML.
     * @see #SAXImporter(InputStream)
     */
    public SAXImporter(File file) throws IOException, SAXException {
        this(new FileInputStream(file), true);
    }

    /**
     * Creates a SAXImporter from an input stream
     * @param is The stream
     * @throws java.io.IOException If there is an error reading the stream
     * @throws org.xml.sax.SAXException If there is an error parsing the XML.
     * @see #SAXImporter(File)
     * @see #SAXImporter(InputStream, boolean)
     */
    public SAXImporter(InputStream is) throws IOException, SAXException {
        this(is, false);
    }

    /**
     * Creates a SAXImporter from an input stream
     * @param is The stream
     * @param closeWhenFinished Whether or not the input stream should be
     * closed when finished parsing.
     * @throws java.io.IOException If there is an error reading the stream
     * @throws org.xml.sax.SAXException If there is an error parsing the XML.
     * @see #SAXImporter(InputStream)
     */
    public SAXImporter(InputStream is, boolean closeWhenFinished) throws
            IOException, SAXException {
        XMLReader r = XMLReaderFactory.createXMLReader();
        r.setContentHandler(this);
        r.setErrorHandler(this);
        r.parse(new InputSource(is));
        if (closeWhenFinished) {
            is.close();
        }
    }
}
