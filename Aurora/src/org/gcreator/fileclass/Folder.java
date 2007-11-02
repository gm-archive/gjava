/*
 * Folder.java
 * 
 * Created on 4/Set/2007, 20:13:08
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import org.gcreator.exceptions.*;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class Folder extends Object{
    protected Vector<Object> childNodes;
    
    
    
    public Folder(String name){
        super(name);
        childNodes = new Vector<Object>(); //Up to 100 childNodes
    }
    
    public boolean add(Object node){
        int i = 0;
        return childNodes.add(node);
    }
    
    public int find(Object search){
        if(childNodes==null)
            return -1;
        for(int i = 0; i < childNodes.size(); i++)
            if(childNodes.get(i)==search)
                return i;
        return -1;
    }
    
    public int findFromName(String search){
        if(childNodes==null)
            return -1;
        for(int i = 0; i < childNodes.size(); i++)
            if(childNodes.get(i)!=null&&childNodes.get(i).name.equals(search))
                return i;
        return -1;
    }
    
    public Object childAt(int pos){
        return childNodes.get(pos);
    }
    
    public int getChildNum(){
        int num = 0;
        for(int i = 0; i < childNodes.size(); i++)
            if(childNodes.get(i)!=null)
                num++;
        return num;
    }
    
    public int getChildArrayNum(){
        return childNodes.size();
    }
    
    public boolean allowsFileType(String format){
        return true;
    }
    
    public boolean allowsGroup(Group group){
        return true;
    }
    
    public Group newGroup(String name){
        Group group = new Group(this, name);
        add(group);
        return group;
    }
    
    public Folder findFolder(String name) throws NoSuchFolderException{
        if(name==null)
            throw new NoSuchFolderException();
        if(name.equals("")||name.equals("/"))
            return this;
        if(name.charAt(0)=='/')
            name = name.substring(1);
        if(name.indexOf("/")==-1){
            if(!name.equals(this.name))
                throw new NoSuchFolderException();
            else
                return this;
        }
        else
            if(!name.substring(name.indexOf("/")).equals(name))
                throw new NoSuchFolderException();
        for(int i = 0; i < childNodes.size(); i++){
            Object o = childNodes.get(i);
            if(o != null && o instanceof Folder){
                try{
                    Folder a = ((Folder) o).findFolder(name.substring(name.indexOf(name)));
                    return a;
                }
                catch(NoSuchFolderException e){}
            }
        }
        throw new NoSuchFolderException("Folder");
    }
    
     
    public String getObjectType(){
        return "Folder";
    }
    
    public ImageIcon getImage(){
        return null;
    }
}
