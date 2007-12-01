/*
 * GameProjectr.java
 * 
 * Created on 5/Set/2007, 14:52:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class PackageProject extends Project {
    public PackageProject(String name, String location){
        super(name, location);
    }
    
    public PackageProject(){}
    
     
    public String getType(){
        return "Package";
    }
    
    public String getObjectType(){
        return "PackageProject";
    }
    
    private ImageIcon img = new ImageIcon(getClass().getResource("/org/gcreator/resources/package.png"));
    
    public ImageIcon getImage(){
        return img;
    }
}
