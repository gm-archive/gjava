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
import org.gcreator.xml.XMLExporter;
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
     * @throws IOException If there is a problem writing to the file
     */
    public void addFile(File file) throws IOException, SAXException{
        if(file.toString().equals(getManifest().toString()))
            return;
        SAXImporter importer = new SAXImporter(getManifest());
        Node root = importer.getDocumentRoot();
        if(!root.getName().equals("pineapple-project"))
            throw new SAXException("Not a pineapple project");
        if(!root.hasAttribute("version"))
            throw new SAXException("Not a valid pineapple project");
        if(!root.getAttributeValue("version").equals("1.0"))
            throw new SAXException("Can not read given project version");
        for(Node node : root.getChildren()){
            if(node.getName().equals("file")&&node.getContent().equals(file.toString()))
                return; //Already has this file;
        }
        Node n = new Node(root, "file", null);
        n.setContent(file.toString());
        root.addChild(n);
        new XMLExporter(getManifest(), root);
    }
    
    /**
     * Adds or modifies a setting
     * @param setting The setting to change or add
     * @param value The value of the setting
     * @throws IOException If there is an error when reading manifest
     */
    public void setSetting(String setting, String value) throws IOException,
            SAXException{
        SAXImporter importer = new SAXImporter(getManifest());
        Node root = importer.getDocumentRoot();
        if(!root.getName().equals("pineapple-project"))
            throw new SAXException("Not a pineapple project");
        if(!root.hasAttribute("version"))
            throw new SAXException("Not a valid pineapple project");
        if(!root.getAttributeValue("version").equals("1.0"))
            throw new SAXException("Can not read given project version");
        boolean modified = false;
        for(Node node : root.getChildren()){
            if(node.getName().equals("setting")&&node.getAttributeValue("key").equals(setting)){
                node.setAttribute(setting, value);
                modified = true;
            }
        }
        if(!modified){
            Node n = new Node(root, "setting", null);
            n.setAttribute("key", setting);
            n.setAttribute("value", value);
            root.addChild(n);
        }
        new XMLExporter(getManifest(), root);
    }
    
    /**
     * Creates a new empty project.
     * @param location The manifest file location. If location already exists,
     * it will be deleted and recreated.
     * @param name The project name
     * @return The created project
     * @throws IOException If there was
     */
    public static Project createNewProject(File location, String name)
        throws IOException{
        if(location.exists())
            location.delete();
        location.createNewFile();
        Project p = new Project(location);
        
        Node root = new Node(null, "pineapple-project", null);
        root.setAttribute("version", "1.0");
        new XMLExporter(location, root);
        
        try{
            p.setSetting("name", name);
        }
        catch(SAXException e){
            System.out.println("SAXException: " + e);
        }
        
        return p;
    }
}
