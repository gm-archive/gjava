/*
 * InvalidSignalException.java
 * 
 * Created on 12/Set/2007, 14:45:16
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author Luís
 */
public class InvalidSignalException extends Exception{
    Object signal;
    public InvalidSignalException(Object signal){
        this.signal = signal;
    }
    
    @Override
    public String toString(){
        return "InvalidSignalException with signal " + signal.toString();
    }
}
