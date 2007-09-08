/*
 * File.java
 * 
 * Created on 4/Set/2007, 20:12:37
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

/**
 *
 * @author Luís
 */
public class File extends Object{
    public Folder root;
    public String type; //If file is "a.txt", leave only "txt" here
    public String value;
    
    public File(Folder root, String name, String type, String value){
        super(name);
        this.root = root;
        this.type = type;
        this.value = value;
        root.add(this);
    }
    
    public String getObjectType(){
        return "File";
    }
}
