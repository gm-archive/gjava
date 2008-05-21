/*
 * NoSuchFolderException.java
 * 
 * Created on 17/Set/2007, 16:13:36
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.exceptions;

/**
 *
 * @author Luís
 */
public class NoSuchFolderException extends Exception{
    public NoSuchFolderException(){
        super();
    }
    
    public NoSuchFolderException(String msg){
        super(msg);
    }
    
    public String toString(){
        return "NoSuchFolderException: " + getMessage();
    }
}
