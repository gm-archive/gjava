package org.gjava.actoreditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class actorDataObject extends MultiDataObject 
implements Lookup.Provider {
    
       
   public  actorData data = new actorData();
   public Actoreditor ae;// = new ActorEditorTopComponent(this);
    
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
        
        if (this.getName().equals("Actor"))
            return;
        //System.out.println("Write java");
        org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
   FileWriter BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/"+this.getName()+".java");
BufferedWriter Basicgame = new BufferedWriter(BasicgameFW);
    BufferedReader from=new BufferedReader(new InputStreamReader(this.getPrimaryFile().getInputStream()));
    String line="",solid="false",visible="false",eventcode="",relative="",applies="";
   String arg0 = "";
        String arg1 = "";
        String arg2 = "";
        String arg3 = "";
        String arg4 = "";
        String arg5 = "";
        String arg6 = "";
        String arg7 = "";
    
    //start java code
    print(Basicgame,"package org.gjava.runner;");
			print(Basicgame,"import java.awt.*;");
			print(Basicgame,"import java.awt.event.*;");
			print(Basicgame,"import javax.swing.*;");
			print(Basicgame,"import java.io.*;");
			print(Basicgame,"import java.util.*;");
			print(Basicgame,"import java.net.*;");
			print(Basicgame,"import java.applet.*;");
         print(Basicgame,"class " + this.getName() + " extends Actor {");
    
         //if already written header
         boolean alarm=false,collision=false,keyboard=false,keypress=false,keyrelease=false,mouse=false;
       while ((line=from.readLine()) != null)
        {
            System.out.println("read line");
             if (line.contains("<Solid>") && line.contains("</Solid>"))
            {
                 System.out.println("Solid");
                if (line.contains("True") )
                    
                    solid = "true";
                
                else
                   solid = "false";
            }
             
              if (line.contains("<Visible>") && line.contains("</Visible>"))
            {
                if (line.contains("True") )
                    
                    visible = "true";
                
                else
                   visible = "false";
            }
             
             String name="",img="",code="",args="";
             if (line.equals("<Event>")) {
                line=from.readLine();
                
                if (line.contains("<Name>") && line.contains("</Name>")) {
                    name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                }
                line=from.readLine();
                if (line.contains("<Image>") && line.contains("</Image>")) {
                    img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                }
                
                //write create event
                if (name.equals("Create"))
                print(Basicgame,"    public void Create_event() {");
                //write destroy event
                if (name.equals("Destory"))
                print(Basicgame,"    public void Destroy_event() {");
                //write step event
                if (name.equals("Step"))
                print(Basicgame,"    public void Step() {");
                //write draw event
                if (name.equals("Draw"))
                {
                    print(Basicgame,"    public void Draw_event(Graphics g) {");
					print(Basicgame,"			if (visible) {");
					print(Basicgame,"				Graphics comp2D = (Graphics2D)g;");
					print(Basicgame,"				g.setColor( Color.black );");
                }
                
                if (name.contains("Alarm"))
                {
                    if (alarm == false)
                    {
                        print(Basicgame,"    public void Alarm() {");
                        alarm = true;
                    }
                    int event = -1;
                    print(Basicgame,"    	if (G_JAVA_alarm[" + name.replaceAll("Alarm", "").replaceAll(" Event", "") + "] == 0) {");
					
                }
                
                                // 
                                
                
                line=from.readLine();
                while (!line.equals("</Event>")) {
                    code="";
                    args="";
                    //get actions
                    if (line.equals("<Action>")) {
                        line=from.readLine();
                        if (line.contains("<Name>") && line.contains("</Name>")) {
                            name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Image>") && line.contains("</Image>")) {
                            img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                            System.out.println(img);
                        }
                        
                        //Relative
                        line=from.readLine();
                        if (line.contains("<Relative>") && line.contains("</Relative>")) {
                            relative = line.replaceAll("<Relative>", "").replaceAll("</Relative>", "");
                            
                        }
                        //showRelative
                        line=from.readLine();
                        //description
                        line=from.readLine();
                        
                        line=from.readLine();
                        if (line.contains("<Code>")) {
                            if (line.contains("</Code>"))
                                code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            else
                            while (!line.contains("</Code>")) {
                            code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            //System.out.println(code);
                            line=from.readLine();
                            }
                            code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";

                        }
//                        line=from.readLine();
//                        if (line.contains("<Args>")) {
//                            if (line.contains("</Args>"))
//                                args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
//                            else
//                            while (!line.contains("</Args>")) {
//                            args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
//                            //System.out.println(args);
//                            line=from.readLine();
//                            }
//                            args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
//
//                        }
                        
                        line=from.readLine();
                        if (line.contains("<Arg0>") && line.contains("</Arg0>")) {
                            arg0 = line.replaceAll("<Arg0>", "").replaceAll("</Arg0>", "");
                        }
                        
                                line=from.readLine();
                        if (line.contains("<Arg1>") && line.contains("</Arg1>")) {
                            arg1 = line.replaceAll("<Arg1>", "").replaceAll("</Arg1>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg2>") && line.contains("</Arg2>")) {
                            arg2 = line.replaceAll("<Arg2>", "").replaceAll("</Arg2>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg3>") && line.contains("</Arg3>")) {
                            arg3 = line.replaceAll("<Arg3>", "").replaceAll("</Arg3>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg4>") && line.contains("</Arg4>")) {
                            arg4 = line.replaceAll("<Arg4>", "").replaceAll("</Arg4>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg5>") && line.contains("</Arg5>")) {
                            arg5 = line.replaceAll("<Arg5>", "").replaceAll("</Arg5>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg6>") && line.contains("</Arg6>")) {
                            arg6 = line.replaceAll("<Arg6>", "").replaceAll("</Arg6>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg7>") && line.contains("</Arg7>")) {
                            arg7 = line.replaceAll("<Arg7>", "").replaceAll("</Arg7>", "");
                        }
                        
                        //caption 0
                        line=from.readLine();
                        
                        
                                line=from.readLine();
                       
                        line=from.readLine();
                       
                        line=from.readLine();
                       
                        line=from.readLine();
                        
                        line=from.readLine();
                        
                        line=from.readLine();
                       
                        line=from.readLine();
                       
                        //print(Basicgame,"{");
                         //print(Basicgame,args);
                          print(Basicgame,code.replaceAll("@arg0", arg0).replaceAll("@arg1", arg1).replaceAll("@arg2", arg2).replaceAll("@arg3", arg3).replaceAll("@arg4", arg4).replaceAll("@arg5", arg5).replaceAll("@arg6", arg6).replaceAll("@arg7", arg7).replaceAll("@applies", "this").replaceAll("@relative", relative));
                       //  print(Basicgame,"}");
                        
                        line=from.readLine();//</Action>
                        // add the action
                        //Value v = (Value)eventList.events.lastElement();
                        //v.actions.addElement(new ActionValue(name,img,code,args ));
                    }
                    line=from.readLine();
                }
                print(Basicgame,"    }");
       if (name.equals("Draw Event"))
       {
           print(Basicgame,"    }");
           print(Basicgame,"    }");
       }
       if (name.contains("Alarm"))
             print(Basicgame,"    }");
            }
       
       }
         
    
    
        System.out.println("Write super actor!!");
				print(Basicgame,"      " +  this.getName() + "(int X, int Y) {");
				print(Basicgame,"      super(\"" +  this.getName() + "\",\""+data.img.replaceAll(pro.getProjectDirectory().getPath(), "")+"\"," + solid + "," + visible
						+ ",0,0);");
				print(Basicgame,"      this.x = X;");
				print(Basicgame,"      this.y = Y;");
				print(Basicgame,"      this.xstart = X;");
				print(Basicgame,"      this.ystart = Y;");
				print(Basicgame,"      }");
                                
                                
                                
                                

                                //finish class
                                print(Basicgame,"}");
                                
        from.close();
        Basicgame.close();
        /*java.io.PrintStream printStream = new java.io.PrintStream(new java.io.File(pro.getProjectDirectory().getPath() +"/logs/"+this.getName()+".log"));
                            java.lang.System.setErr(printStream);
        com.sun.tools.javac.Javac j = new com.sun.tools.javac.Javac();
        j.javac(new java.lang.String[]{"-classpath",pro.getProjectDirectory().getPath(),pro.getProjectDirectory().getPath() + "/org/gjava/runner/"+this.getName()+".java"
                                    });
        printStream.close();*/
        
    }
    
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
