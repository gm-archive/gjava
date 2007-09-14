/*
 * File.java
 * 
 * Created on 4/Set/2007, 20:12:37
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

import fileclass.res.Sprite;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.*;

/**
 *
 * @author Luís
 */
public class File extends Object{
    public Folder root;
    public String type; //If file is "a.txt", leave only "txt" here
    public java.lang.Object value;
    public Sprite sp;
    
    public File(Folder root, String name, String type, Object value){
        super(name);
        this.root = root;
        this.type = type;
        this.value = value;
        root.add(this);
    }
    
    @Override
    public String getObjectType(){
        return "File";
    }
    
    public String writeToBuffer(){
        return ""+value;
    }
}
