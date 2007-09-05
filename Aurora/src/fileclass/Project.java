/*
 * Project.java
 * 
 * Created on 4/Set/2007, 20:15:34
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

/**
 *
 * @author Luís
 */
public class Project extends Folder{
    public String location; //If project "Alfa" is in "C:/Program Files/Alfa", leave only "C:/Program Files/";
    
    public Project(String name, String location){
        super(name);
        this.location = location;
    }
    
    public String getType(){
        return null;
    }
}
