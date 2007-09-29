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
public String sprite,extend,mask;
public int index,depth;
public Vector<events.Event> events;
  public  Actor(String name)
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
      for(events.Event event : events)
          xml += event.writeXml();
      return xml;
  }
    
    @Override
    public void readXml(String xml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String exportToHtml(boolean xhtml){
        String html = "";
        if(xhtml)
            html += "<!DOCTYPE html\nPUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        else
            html += "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">";
        html += "\n";
        html += "<html>\n";
        html += "<head>\n";
        html += "\t<title>" + name + "</title>\n";
        html += "</head>\n";
        html += "<body>\n";
        
        html += "<table border=";
        if(xhtml)
            html += "\"";
        html += "1";
        if(xhtml)
            html += "\"";
        html += " width=";
        if(xhtml)
            html += "\"";
        html += "100%";
        if(xhtml)
            html += "\"";
        html += ">\n";
        html += "<tr>\n";
        html += "<td>\n";
        
        html += "Name: " + name + "<br";
        if(xhtml)
            html += "/";
        html += ">\n";
        
        html += "<fieldset>\n<legend>Sprite</legend>\n</fieldset>\n";
        
        html += "<input type=\"checkbox\"";
        if(visible){
            html += " checked";
            if(xhtml)
                html += "=\"checked\"";
        }
        html += " disabled";
        if(xhtml)
            html += "=\"disabled\" /";
        html += ">Visible<br";
        if(xhtml)
            html += "/";
        html += ">\n";
        
        html += "<input type=\"checkbox\"";
        if(solid){
            html += " checked";
            if(xhtml)
                html += "=\"checked\"";
        }
        html += " disabled";
        if(xhtml)
            html += "=\"disabled\" /";
        html += ">Solid<br";
        if(xhtml)
            html += "/";
        html += ">\n";
        
        html += "<input type=\"checkbox\"";
        if(persistant){
            html += " checked";
            if(xhtml)
                html += "=\"checked\"";
        }
        html += " disabled";
        if(xhtml)
            html += "=\"disabled\" /";
        html += ">Persistant<br";
        if(xhtml)
            html += "/";
        html += ">\n";
        
        if(xhtml)
            html += "</td>\n";
        if(xhtml)
            html += "</tr>\n";
        html += "</table>\n";
        
        html += "</body>\n";
        html += "</html>";
        
        return html;
    }
}
