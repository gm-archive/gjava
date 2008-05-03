/*
 * Updater.java
 * 
 * Created on 07-Sep-2007, 15:56:10
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.io.BufferedOutputStream;
import org.gcreator.core.gcreator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;

/**
 *
 * @author TGMG
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
          url  = new URL("http://www.g-creator.org/update/update.xml" );
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
                 String   v = nextLine.replaceAll("<version>", "").replaceAll("</version>", "");
                    double d = Double.parseDouble(v);
                    //check if it is a new version
                if (d>Double.parseDouble(gcreator.version)) {
                //JOptionPane.showMessageDialog(gcreator.window, "A New version is available. Latest version is "+version+". Download it from http://www.g-creator.org"); //will make multilingual when message finalized
                int update = JOptionPane.showConfirmDialog(null, "A G-Creator update is available. Are you sure you want to update? ");
        if (update == JOptionPane.NO_OPTION || update == JOptionPane.CANCEL_OPTION)
            return;
                }
                else
                    return;
                }
                if (nextLine.contains("<zip>")){
                    //download and unzip the zip
                    String v = nextLine.replaceAll("<zip>", "").replaceAll("</zip>", "");
                    download(v,"g-creator.zip");
                    unzip("g-creator.zip");
                    System.out.println("unzipped");
                    JOptionPane.showMessageDialog(gcreator.window, "Finished updating G-Creator"); //will make multilingual when message finalized

                }
                org.gcreator.core.utilities.addStringMessage(nextLine);
                System.out.println(nextLine); 
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

 public static void unzip(String zipfile)
    {
        try {
            ZipFile zipFile = new ZipFile(zipfile);
            for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    //System.out.println("Folder:" + entry.getName());
                    (new File(entry.getName())).mkdirs();
                } else {
                    //System.out.println("File:" + entry.getName());
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(entry.getName())));
                }
            }
            zipFile.close();
        } catch (IOException ioe) {
        
            ioe.printStackTrace();

        }
    }
    
    public static final void copyInputStream(InputStream in, OutputStream out)
            throws IOException {
        byte buffer[] = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }
    
       public static void download(String address, String localFileName) {
        try {
            OutputStream out = null;
            InputStream in = null;
            URLConnection conn = null;

            URL url = new URL(address);
            out = new BufferedOutputStream(new FileOutputStream(localFileName));
            conn = url.openConnection();
            in = conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            int numWritten;
            for (numWritten = 0; (numRead = in.read(buffer)) != -1; numWritten += numRead) {
                out.write(buffer, 0, numRead);
            }
            
            
            //System.out.println((new StringBuilder()).append(localFileName).append(" loaded...(").append(numWritten).append(" bytes)").toString());
            System.out.println("Downloaded zip");
            {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        } catch (Exception ex) {
            
            System.out.println("" + ex.getLocalizedMessage());
        }

    }

    
}
