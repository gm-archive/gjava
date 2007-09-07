/*
 * Updater.java
 * 
 * Created on 07-Sep-2007, 15:56:10
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import core.aurora;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali1
 */
public class Updater {
public static void update(){
       String nextLine;
       URL url = null;
       URLConnection urlConn = null;
       InputStreamReader  inStream = null;
       BufferedReader buff = null;
       try{
          // Create the URL obect that points
          // at the default file index.html
          url  = new URL("http://www.g-creator.org/updates/update.xml" );
          urlConn = url.openConnection();
         inStream = new InputStreamReader( 
                           urlConn.getInputStream());
           buff= new BufferedReader(inStream);
        
       // Read and print the lines from index.html
        while (true){
            nextLine =buff.readLine();  
            if (nextLine !=null){
                String version="";
                if (nextLine.contains("<version>"))
                {
                    version = nextLine.replaceAll("<version>", "").replaceAll("</version>", "");
                if (!version.equals(aurora.version))
                JOptionPane.showMessageDialog(aurora.window, "A New version is available. Latest version is "+version+". Download it from http://www.g-creator.org"); //will make multilingual when message finalized
                }
                core.utilities.addStringMessage(nextLine);
               // System.out.println(nextLine); 
            }
            else{
               break;
            } 
        }
     } catch(MalformedURLException e){
       System.out.println("Please check the URL:" + 
                                           e.toString() );
     } catch(IOException  e1){
      System.out.println("Can't read  from the Internet: "+ 
                                          e1.toString() ); 
  }
}
}
