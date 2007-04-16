package org.JGM.roomeditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.JGM.roomeditor.JGMRoomDataLoader;
import org.JGM.roomeditor.SaveRoom;
import org.gmj.gmjfilesupport.*;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.text.DataEditorSupport;
import org.openide.util.actions.SystemAction;

public class GMJRoomDataObject extends MultiDataObject {
    
    public GMJRoomDataObject(FileObject pf, JGMRoomDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        cookies.add(new SaveRoom(this));
        writejava();
    }
    
     public void print(BufferedWriter file,String printString) throws IOException {
            // printString.replaceAll("\n",""+(char)10);
            file.write(printString);
            file.newLine();
        }
    
    public void writejava()
     throws IOException {
        
        org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
   FileWriter BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/"+this.getName()+".java");
BufferedWriter Basicgame = new BufferedWriter(BasicgameFW);
    BufferedReader from=new BufferedReader(new InputStreamReader(this.getPrimaryFile().getInputStream()));
    try
    {
        
        //write header
        print(Basicgame,"class " + this.getName()
						+ " extends RoomPanel implements KeyListener,MouseListener {");
				print(Basicgame,"");
				print(Basicgame," public Objects o;");
				print(Basicgame,"public int roomsetup=0;");
				print(Basicgame," private int ii, dd;");
				print(Basicgame," JFrame R;");
				print(Basicgame,"public static   Vector backgrounds = new Vector();");

				print(Basicgame,this.getName() + " (JFrame R, int id,int roomid) {");
//if (DrawBackroundColor == 1)
				//	print(Basicgame,"super(R, \"" + room_caption + "\", " + Speed + ", " + Width + ", " + Height
					//		+ ", new Color(" + red + "," + green + "," + blue + "));");
				//else
					//print(Basicgame,"super(R, \"" + room_caption + "\", " + Speed + ", " + Width + ", " + Height
					//		+ ", Color.black);");
        
        String line;
        while ((line=from.readLine()) != null)
        {
            if (line.contains("<SnapX>") && line.contains("</SnapX>"))
            {
               line = line.replaceAll("<SnapX>", "").replaceAll("</SnapX>", "");
               //not needed for java file
            }
            
            if (line.contains("<SnapY>") && line.contains("</SnapY>"))
            {
                line = line.replaceAll("<SnapY>", "").replaceAll("</SnapY>", "");
               
                  //not needed for java file
            }
            if (line.contains("<Showgrid>") && line.contains("</Showgrid>"))
            {
               //not needed for java file
            }
            
            if (line.equals("<Instance>"))
            {
                line=from.readLine();
                String name="",img="",code="";
                if (line.contains("<Name>") && line.contains("</Name>"))
                {
                    name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                }
                line=from.readLine();
                if (line.contains("<Image>") && line.contains("</Image>"))
                {
                    img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                    
                }
                
                line=from.readLine();
                if (line.contains("<X>") && line.contains("</X>"))
                {
                  String  x = line.replaceAll("<X>", "").replaceAll("</X>", "");
                    
                }
                
                line=from.readLine();
                if (line.contains("<Y>") && line.contains("</Y>"))
                {
                  String  y = line.replaceAll("<Y>", "").replaceAll("</Y>", "");
                    
                }
                
                line=from.readLine();
                
                   
            }
           
        }
    }
    finally
    {
        from.close();
        Basicgame.close();
    }
}

    
    /*protected Node createNodeDelegate() {
        return new GMJRoomDataNode(this);
    }*/
    protected Node createNodeDelegate () {
        GMJRoomDataNode me = new GMJRoomDataNode(this);
        //me.setDefaultAction (SystemAction.get (OpenRoom.class));
        return me;
    }
    
}
