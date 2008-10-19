/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

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
package org.gcreator.core;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.gcreator.xml.Node;
import org.gcreator.xml.SAXImporter;
import org.xml.sax.SAXException;

/**
 * The Project class contains information relatively to a Pineapple project.
 * @author Luís Reis
 */
public class Project {
    private File manifestFile;
    
    /**
     * Creates a new project from a manifest file.
     * @param manifestFile The project manifest file.
     */
    public Project(File manifestFile){
        this.manifestFile = manifestFile;
    }
    
    /**
     * Gets the manifest file of the project
     */
    public File getManifest(){
        return manifestFile;
    }
    
    /**
     * Gets the settings of the project.
     * @throws IOException If there is a problem reading the manifest file
     * @throws SAXException If there is a problem parsing the XML.
     */
    public Hashtable<String, String> getSettings() throws IOException, SAXException{
        SAXImporter importer = new SAXImporter(getManifest());
        Node root = importer.getDocumentRoot();
        if(!root.getName().equals("pineapple-project"))
            throw new SAXException("Not a pineapple project");
        if(!root.hasAttribute("version"))
            throw new SAXException("Not a valid pineapple project");
        if(!root.getAttributeValue("version").equals("1.0"))
            throw new SAXException("Can not read given project version");
        Hashtable<String, String> hs = new Hashtable<String, String>();
        for(Node node : root.getChildren()){
            if(node.getName().equals("setting"))
                hs.put(node.getAttributeValue("key"), node.getAttributeValue("value"));
        }
        return hs;
    }
    
    /**
     * Gets the files owned by the project
     * @throws IOException If there is a problem reading the manifest file
     * @throws SAXException If there is a problem parsing the XML.
     */
    public Vector<File> getFiles() throws IOException, SAXException{
        SAXImporter importer = new SAXImporter(getManifest());
        Node root = importer.getDocumentRoot();
        if(!root.getName().equals("pineapple-project"))
            throw new SAXException("Not a pineapple project");
        if(!root.hasAttribute("version"))
            throw new SAXException("Not a valid pineapple project");
        if(!root.getAttributeValue("version").equals("1.0"))
            throw new SAXException("Can not read given project version");
        Vector<File> files = new Vector<File>();
        for(Node node : root.getChildren()){
            if(node.getName().equals("file"))
                files.add(new File(node.getContent()));
        }
        return files;
    }
    
    /**
     * Adds a file to the manifest.
     * WILL THROW A TODO ERROR
     */
    public void addFile(File file){
        throw new Error("TODO: addFile(File)");
    }
    
    /**
     * Adds or modifies a setting
     * WILL THROW A TODO ERROR
     */
    public void setSetting(String setting, String value){
        throw new Error("TODO: setSetting(String, String)");
    }
}
