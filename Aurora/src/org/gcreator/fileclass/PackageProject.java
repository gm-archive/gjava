/*
 * GameProjectr.java
 * 
 * Created on 5/Set/2007, 14:52:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author Luís
 */
public class PackageProject extends Project {
    public PackageProject(String name, String location){
        super(name, location);
    }
    
    @Override
    public String getType(){
        return "Package";
    }
    
    public String getObjectType(){
        return "PackageProject";
    }
}
