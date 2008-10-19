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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Exports a set of Nodes into a File or Stream
 * @author Luís Reis
 */
public final class XMLExporter {
    /**
     * Creates an Exporter instance from a File
     * @param file The XML file to output. Creates/Overwrites it.
     * @param node The XML root node.
     * @throws IOException If there is a problem with the file.
     */
    public XMLExporter(File file, Node node) throws IOException{
        if(file.exists())
            file.createNewFile();
        FileOutputStream s = new FileOutputStream(file);
        initialize(s, node);
        s.close();
    }
    
    /**
     * Creates an Exporter from a stream
     * @param stream The stream to use for output.
     * @param node The XML root node.
     * @throws IOException If there is a problem with the stream.
     */
    public XMLExporter(OutputStream stream, Node node) throws IOException{
        initialize(stream, node);
    }
    
    /**
     * Method to avoid Java's limitation of calling constructors only on first
     * statement
     */
    private void initialize(OutputStream stream, Node node) throws IOException{
        stream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
        stream.write(node.toString().getBytes());
    }
}
