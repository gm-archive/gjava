/*
 * Actor.java
 * 
 * Created on 09-Sep-2007, 16:42:21
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass.res;

import java.util.Vector;

/**
 *
 * @author Ali1
 */
public class Actor {
public boolean visible, solid, persistant;
public String name,sprite,extend,mask;
public int index,depth;
public Vector events;
  public  Actor(String name, int index)
    {
        this.name = name;
    }
  
  public  static void writeXml()
  {
      
  }
}
