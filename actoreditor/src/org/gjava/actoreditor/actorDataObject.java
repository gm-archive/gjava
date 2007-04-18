package org.gjava.actoreditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.gjava.actoreditor.Action.ActionData;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Properties;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

public class actorDataObject extends MultiDataObject 
implements Lookup.Provider {
    
   public  actorData data = new actorData();
   public ActorEditorTopComponent ae;// = new ActorEditorTopComponent(this);
    
    public final FileObject pf2;

    public actorDataObject(FileObject pf, actorDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        pf2 = pf;
        InputStream input = pf.getInputStream();
        data.name = pf.getName();
        data.path = pf.getPath();
        
        
    BufferedReader from=new BufferedReader(new InputStreamReader(input));
   
        String line;
        boolean found = false;
        while ((line=from.readLine()) != null)
        {
            if (line.contains("<Image>") && line.contains("</Image>") && (found == false))
            {
              data.img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
               System.out.println(data.img);
               found = true;
            }
        }
    input.close();
       // data = new actorData();
       /* cookies.add(new OpenCookie() {
        
          public void open() {
        
        System.out.println("hey,hey,hey,hey");
         // c = (actorDataObject) node.getCookie(actorDataObject.class);
      
        //ActorEditorTopComponent re = ActorEditorTopComponent.getInstance(pf2.getPath());
        //re.setName(pf2.getPath());
       // re.path = pf2.getPath();
        //re.setHtmlDisplayName(c.getName());
       // re.setIcon(Utilities.loadImage("org/gjava/actoreditor/object.png"));
        //re.open();
       // re.requestActive();
    }
            
        });
        */
    cookies.add(new Save(this));
    cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
       writejava(); 
    }

    public void writejava()
     throws IOException {
        System.out.println("Write java");
        org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
   FileWriter BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/"+this.getName()+".java");
BufferedWriter Basicgame = new BufferedWriter(BasicgameFW);
    BufferedReader from=new BufferedReader(new InputStreamReader(this.getPrimaryFile().getInputStream()));
    String line="",solid="",visible="";
    try
    {
       while ((line=from.readLine()) != null)
        {
            
             if (line.contains("<Solid>") && line.contains("</Solid>"))
            {
                if (line.contains("True") )
                    
                    solid = "1";
                
                else
                   solid = "0";
            }
              if (line.contains("<Visible>") && line.contains("</Visible>"))
            {
                if (line.contains("True") )
                    
                    visible = "1";
                
                else
                   visible = "0";
            }
       }
    }finally
    {
        print(Basicgame,"package org.gjava.runner;");
			print(Basicgame,"import java.awt.*;");
			print(Basicgame,"import java.awt.event.*;");
			print(Basicgame,"import javax.swing.*;");
			print(Basicgame,"import java.io.*;");
			print(Basicgame,"import java.util.*;");
			print(Basicgame,"import java.net.*;");
			print(Basicgame,"import java.applet.*;");
         print(Basicgame,"class " + this.getName() + " extends Actor {");
				print(Basicgame,"      " +  this.getName() + "(int X, int Y) {");
				print(Basicgame,"      super(\"" +  this.getName() + "\",0," + solid + "," + visible
						+ ",0,0,0,0);");
				print(Basicgame,"      this.X = X;");
				print(Basicgame,"      this.Y = Y;");
				print(Basicgame,"      this.xstart = X;");
				print(Basicgame,"      this.ystart = Y;");
				print(Basicgame,"      }");
                                //write create event
                                print(Basicgame,"    public void Create_event() {");
                                print(Basicgame,"    }");

                                //finish class
                                print(Basicgame,"}");
                                
        from.close();
        Basicgame.close();
    }}
    
     public void print(BufferedWriter file,String printString) throws IOException {
            // printString.replaceAll("\n",""+(char)10);
            file.write(printString);
            file.newLine();
        }
    
    public void setModified(boolean arg0) {
        super.setModified(arg0);
        if (arg0 == true)
        {
//            Iterator opened = TopComponent.getRegistry().getOpened().iterator();
//        while (opened.hasNext())
//        {
//            Object tc = opened.next();
//            if (tc instanceof ActorEditorTopComponent)
//            {
//                ActorEditorTopComponent elc = (ActorEditorTopComponent)tc;
//                
//                if (this.getPrimaryFile().getPath().equals(elc.path))
//                {
//                    //elc.requestActive();
//                    elc.setHtmlDisplayName(elc.getHtmlDisplayName()+"*");
//                    
//                }
//            }
//        }
        }
        
        else if (arg0 == false)
        {
//            Iterator opened = TopComponent.getRegistry().getOpened().iterator();
//        while (opened.hasNext())
//        {
//            Object tc = opened.next();
//            if (tc instanceof ActorEditorTopComponent)
//            {
//                ActorEditorTopComponent elc = (ActorEditorTopComponent)tc;
//                
//                if (this.getPrimaryFile().getPath().equals(elc.path))
//                {
//                    //elc.requestActive();
//                    try {
//                    elc.setHtmlDisplayName(elc.oldDisplayName);
//                    } catch(Exception e) {}
//                    
//                }
//            }
//        }
        }
    }
    
    protected Node createNodeDelegate() {
        return new actorDataNode(this, data);
    }

    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}
