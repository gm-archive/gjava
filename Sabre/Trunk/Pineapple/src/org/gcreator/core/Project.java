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
import java.util.Hashtable;
import java.util.Vector;

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
     * Gets the settings of the project
     * WILL THROW A TODO ERROR
     */
    public Hashtable<String, String> getSettings(){
        throw new Error("TODO: getSettings()");
    }
    
    /**
     * Gets the files owned by the project
     * WILL THROW A TODO ERROR
     */
    public Vector<File> getFiles(){
        throw new Error("TODO: getFiles()");
    }
}
