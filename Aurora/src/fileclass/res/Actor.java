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
public class Actor extends Resource {
public boolean visible, solid, persistant;
public String name,sprite,extend,mask;
public int index,depth;
public Vector events;
  public  Actor(String name, int index)
    {
        this.name = name;
    }
  
  public String writeXml()
  {
      String xml = "";
      xml += "<?xml version=\"1.0\"?>\n"; //changes for new version of actor
      xml += "<Solid>"+solid+"</Solid>\n";
      xml += "<Visible>"+visible+"</Visible>\n";
      xml += "<Persistant>"+solid+"</Persistant>\n";
      return xml;
  }
    
    @Override
    public void readXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
