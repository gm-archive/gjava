package org.JGM.roomeditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.JGM.roomeditor.JGMRoomDataLoader;
import org.JGM.roomeditor.SaveRoom;
//import org.gmj.gmjfilesupport.*;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;

public class GMJRoomDataObject extends MultiDataObject {
    
    GMJRoomData data = new GMJRoomData();
    
    public GMJRoomDataObject(FileObject pf, JGMRoomDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        cookies.add(new SaveRoom(this));
        writejava();
        data.path = this.getName();
    }
    
     public void print(BufferedWriter file,String printString) throws IOException {
            // printString.replaceAll("\n",""+(char)10);
            file.write(printString);
            file.newLine();
        }
    
    public void writejava()
     throws IOException {
         System.out.println("Write java");
        org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
   FileWriter BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/"+this.getName()+".java");
BufferedWriter Basicgame = new BufferedWriter(BasicgameFW);
    BufferedReader from=new BufferedReader(new InputStreamReader(this.getPrimaryFile().getInputStream()));
    try
    {
        print(Basicgame,"package org.gjava.runner;");
			print(Basicgame,"import java.awt.*;");
			print(Basicgame,"import java.awt.event.*;");
			print(Basicgame,"import javax.swing.*;");
			print(Basicgame,"import java.io.*;");
			print(Basicgame,"import java.util.*;");
			print(Basicgame,"import java.net.*;");
			print(Basicgame,"import java.applet.*;");
        //write header
        print(Basicgame,"class " + this.getName()
						+ " extends RoomPanel implements KeyListener,MouseListener {");
				print(Basicgame,"");
				print(Basicgame," public Actor o;");
				print(Basicgame,"public int roomsetup=0;");
				print(Basicgame," private int ii, dd;");
                                print(Basicgame,"public static int room_id = 0;");
				print(Basicgame," JFrame R;");
				print(Basicgame,"public static   Vector backgrounds = new Vector();");

				print(Basicgame,this.getName() + " (JFrame R, int id,int roomid) {");

        
        String line,caption="",red="",green="",blue="",speed="",width="",height="",x="",y="";
        while ((line=from.readLine()) != null)
        {
            
            if (line.contains("<Caption>") && line.contains("</Caption>"))
                {
                  caption =line.replaceAll("<Caption>", "").replaceAll("</Caption>", "");
                }
            
            if (line.contains("<Width>") && line.contains("</Width>"))
                {
                  width =line.replaceAll("<Width>", "").replaceAll("</Width>", "");
                }
            
            if (line.contains("<Height>") && line.contains("</Height>"))
                {
                  height =line.replaceAll("<Height>", "").replaceAll("</Height>", "");
                }
            
            if (line.contains("<Speed>") && line.contains("</Speed>"))
                {
                  speed =line.replaceAll("<Speed>", "").replaceAll("</Speed>", "");
                }
            
            if (line.contains("<BcolorR>") && line.contains("</BcolorR>"))
                {
                    red = line.replaceAll("<BcolorR>", "").replaceAll("</BcolorR>", "");
                }
            
           if (line.contains("<BcolorG>") && line.contains("</BcolorG>"))
                {
                    green = line.replaceAll("<BcolorG>", "").replaceAll("</BcolorG>", "");
                }
            
            if (line.contains("<BcolorB>") && line.contains("</BcolorB>"))
                {
                    blue = line.replaceAll("<BcolorB>", "").replaceAll("</BcolorB>", "");
                }
            
            if (line.contains("<Drawbackgroundcolor>") && line.contains("</Drawbackgroundcolor>"))
            {
                if (line.contains("True") )
                    
                    print(Basicgame,"super(R,\""+ this.getName() +"\", \"" + caption + "\", " + speed + ", " + width + ", " + height
							+ ", new Color(" + red + "," + green + "," + blue + "));");

                
                else
                    print(Basicgame,"super(R,\""+ this.getName() +"\",\"" + caption + "\", " + speed + ", " + width + ", " + height
							+ ", Color.black);");
                print(Basicgame,"this.R = R;");
				print(Basicgame,"this.id = id;");
				print(Basicgame,"this.roomid = roomid;");
                                print(Basicgame,"this.room_id = roomid;");
				print(Basicgame,"if (basicgame.Runningas != \"EApplet\") {");
				print(Basicgame,"R.addKeyListener(this);");
				print(Basicgame,"R.addMouseListener(this);");
				print(Basicgame,"} else {");
				print(Basicgame,"basicgame.Eapplet.addKeyListener(this);");
				print(Basicgame,"basicgame.Eapplet.addMouseListener(this);");
				print(Basicgame,"}");
				print(Basicgame,"}");
                                print(Basicgame,"public void setup_Room() {");
                                print(Basicgame,"instances = new Vector(1);");
				
            }
            
           
            
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
                  x = line.replaceAll("<X>", "").replaceAll("</X>", "");
                    
                }
                
                line=from.readLine();
                if (line.contains("<Y>") && line.contains("</Y>"))
                {
                  y = line.replaceAll("<Y>", "").replaceAll("</Y>", "");
                    
                }
                if (!name.equals("room"))
                print(Basicgame,"instances.add(0, new " + name + "(" + x + "," + y + "));");
                line=from.readLine();
                
                   
            }
           
        }
    }
    finally
    {
        print(Basicgame,"instances.trimToSize();");
				print(Basicgame,"roomsetup = 1;");
                                print(Basicgame,"SortDepth();");
                                // close setup room
				print(Basicgame,"}");
				print(Basicgame,"public synchronized void keyPressed(KeyEvent evt) {");
				print(Basicgame,"    int keycode = evt.getKeyCode();");

				print(Basicgame,"    // call key press events");
				/*if (LetF1ShowGameInformation == 1)
					{
					print(Basicgame,"    if (keycode == 112) {");
					print(Basicgame,"        Game_Information mainFrame  = new Game_Information();");
					print(Basicgame,"        mainFrame.setVisible( true );");
					print(Basicgame,"    }");
					}*/
				print(Basicgame,"ii = 0;");
				print(Basicgame,"while (ii < (instances.size())) {");
				print(Basicgame,"");
				print(Basicgame,"Actor o = (Actor)instances.get(ii);");
				print(Basicgame,"");
				print(Basicgame,"o.Key_Pressed(keycode);");
				print(Basicgame,"ii++;");
				print(Basicgame,"}");
				print(Basicgame,"}");
				print(Basicgame,"");
				print(Basicgame,"public synchronized void keyReleased(KeyEvent evt) {");
				print(Basicgame,"    int keycode = evt.getKeyCode();");
				print(Basicgame,"    // call key Released events");
				print(Basicgame,"ii = 0;");
				print(Basicgame,"while (ii < (instances.size())) {");
				print(Basicgame,"");
				print(Basicgame,"Actor o = (Actor)instances.get(ii);");
				print(Basicgame,"");
				print(Basicgame,"o.Key_Released(keycode);");
				print(Basicgame,"ii++;");
				print(Basicgame,"}");
				print(Basicgame,"}");
				print(Basicgame,"");
				print(Basicgame,"public synchronized void keyTyped(KeyEvent evt) {");
				print(Basicgame,"}");

				print(Basicgame,"   public void mouseClicked(MouseEvent evt) {");
				print(Basicgame,"");
				print(Basicgame,"  }");
				print(Basicgame," public void mouseEntered(MouseEvent evt) {");
				print(Basicgame,"// called when the pointer enters the room's rectangular area");
				print(Basicgame,"     }");
				print(Basicgame,"");
				print(Basicgame,"public void mouseExited(MouseEvent evt) {");
				print(Basicgame,"// called when the pointer leaves the room's rectangular area");
				print(Basicgame,"}");
				print(Basicgame,"");
				print(Basicgame,"public void mousePressed(MouseEvent evt) {");
				print(Basicgame,"");
				print(Basicgame,"    int keycode = evt.getButton();");
				print(Basicgame,"    // call mouse press events");
				print(Basicgame,"ii = 0;");
				print(Basicgame,"while (ii < (instances.size())) {");
				print(Basicgame,"");
				print(Basicgame,"Actor o = (Actor)instances.get(ii);");
				print(Basicgame,"");
				print(Basicgame,"o.mouse_Pressed(keycode,evt.getX(),evt.getY());");
				print(Basicgame,"ii++;");
				print(Basicgame,"}");

				print(Basicgame,"}");
				print(Basicgame,"");
				print(Basicgame,"public void mouseReleased(MouseEvent evt) {");
				print(Basicgame,"");
				print(Basicgame,"}");

				print(Basicgame,"public  void paint(Graphics g) {");
				print(Basicgame,"// The main game loop    ");
				print(Basicgame,"");
//				print(Basicgame,"Font f = new Font(\"Arial Narrow\",Font.PLAIN,16);");
//				print(Basicgame,"g.setFont(f);");
				print(Basicgame,"// Clear the drawing buffer to the background color");
				print(Basicgame,"g.setColor( backcolor );");
				print(Basicgame,"g.fillRect( 0, 0, width, height);");
				print(Basicgame,"");
				print(Basicgame,"// draw backgrounds");
/*
				// TODO background code
				print(Basicgame,"for (int subi = 0; subi<8;subi++)");
				print(Basicgame,"if ((Rbackgrounds[subi] != -1)&&(visible[subi] == 1))");
				print(Basicgame,"{");
				print(Basicgame,"if ((TileH[subi] == 0) && (TileV[subi] == 0))");
				print(Basicgame,"	{");
				print(
						Basicgame,
						" g.drawImage(basicgame.background[Rbackgrounds[subi]].show(),Xpos[subi],Ypos[subi],basicgame.background[Rbackgrounds[subi]].back_width,basicgame.background[Rbackgrounds[subi]].back_height,this);");
				print(Basicgame," }");
				print(Basicgame,"else");
				print(Basicgame," {");
				print(Basicgame,"do");
				print(Basicgame,"{");
				print(Basicgame," if ((Xpos[subi]-basicgame.background[Rbackgrounds[subi]].back_width)>0)");
				print(Basicgame," Xpos[subi]-=basicgame.background[Rbackgrounds[subi]].back_width;");
				print(Basicgame," } while ((Xpos[subi]-basicgame.background[Rbackgrounds[subi]].back_width)>0);");
				print(Basicgame," do");
				print(Basicgame,"{");
				print(Basicgame,"if ((Ypos[subi]-basicgame.background[Rbackgrounds[subi]].back_height)>0)");
				print(Basicgame,"Ypos[subi]-=basicgame.background[Rbackgrounds[subi]].back_height;");
				print(Basicgame,"} while ((Ypos[subi]-basicgame.background[Rbackgrounds[subi]].back_height)>0);");
				print(Basicgame,"  ");
				print(Basicgame,"if (basicgame.Runningas != \"EApplet\") {");
				print(Basicgame,
						" NumberX = 1 + ((int)R.getWidth()+Xpos[subi])/ basicgame.background[Rbackgrounds[subi]].back_width;");
				print(Basicgame,
						" NumberY = 1 + ((int)R.getHeight()+Ypos[subi]) / basicgame.background[Rbackgrounds[subi]].back_height;");
				print(Basicgame,"} else {");
				print(
						Basicgame,
						" NumberX = 1 + ((int)basicgame.Eapplet.getWidth()+Xpos[subi])/ basicgame.background[Rbackgrounds[subi]].back_width;");
				print(
						Basicgame,
						" NumberY = 1 + ((int)basicgame.Eapplet.getHeight()+Ypos[subi]) / basicgame.background[Rbackgrounds[subi]].back_height;");
				print(Basicgame,"}");
				print(Basicgame,"  ");
				print(Basicgame,"if (TileH[subi] == 1) { ");
				print(Basicgame,"");
				print(
						Basicgame,
						"Image row = createImage(ScreenWidth+basicgame.background[Rbackgrounds[subi]].back_width,basicgame.background[Rbackgrounds[subi]].back_height);");
				print(Basicgame,"Graphics rowg = row.getGraphics();");
				print(Basicgame,"for (int j = 0;j <= NumberX; j++) {");
				print(
						Basicgame,
						"rowg.drawImage(basicgame.background[Rbackgrounds[subi]].show(),j*basicgame.background[Rbackgrounds[subi]].back_width,0,basicgame.background[Rbackgrounds[subi]].back_width,basicgame.background[Rbackgrounds[subi]].back_height,this);");
				print(Basicgame,"}");
				print(Basicgame,"if (TileV[subi] == 0) {");
				print(
						Basicgame,
						"g.drawImage(row,Xpos[subi]-basicgame.background[Rbackgrounds[subi]].back_width,Ypos[subi],row.getWidth(null),row.getHeight(null),this);");
				print(Basicgame,"} else {");
				print(Basicgame,"");
				print(Basicgame,"for (int i = 0;i <= NumberY; i++)");
				print(Basicgame,"{");
				print(
						Basicgame,
						"g.drawImage(row,Xpos[subi],i*basicgame.background[Rbackgrounds[subi]].back_height + Ypos[subi],ScreenWidth+basicgame.background[Rbackgrounds[subi]].back_width,basicgame.background[Rbackgrounds[subi]].back_height,this);");
				print(Basicgame,"}");
				print(Basicgame,"}");
				print(Basicgame," } else if  (TileV[subi] == 1)  {");
				print(Basicgame,"for (int i = 0;i <= NumberY; i++)");
				print(Basicgame,"{");
				print(
						Basicgame,
						"g.drawImage(basicgame.background[Rbackgrounds[subi]].show(),Xpos[subi],i*basicgame.background[Rbackgrounds[subi]].back_height + Ypos[subi],basicgame.background[Rbackgrounds[subi]].back_width,basicgame.background[Rbackgrounds[subi]].back_height,this);");
				print(Basicgame,"}");
				print(Basicgame,"}");
				print(Basicgame," }");
				print(Basicgame,"}");*/

				// instances
				print(Basicgame,"");
				print(Basicgame,"dd = 0;");
				print(Basicgame,"while (dd < instances.size()) {");
				print(Basicgame,"this.instance_id = dd;");
				print(Basicgame,"Actor o = (Actor)instances.get(dd);");
				//print(Basicgame,"o.Begin_Step_event();");
				print(Basicgame,"//if (o.timeline != null)");
				print(Basicgame,"//o.timeline.runTimeline();");
				print(Basicgame,"o.Alarm();");
				print(Basicgame,"o.Keyboard_event();");
				print(Basicgame,"o.Step();");
				//print(Basicgame,"if((o.X <= -1) || (o.X >= basicgame.Current_room.Width+1) || (o.Y <= -1) || (o.Y >= basicgame.Current_room.Height+1))");
				//print(Basicgame,"    o.Outside();");
				
				/*if (end_animation_event == true)
					{
					print(Basicgame,"if (o.Object_sprite != null) {");
					print(Basicgame,"if (o.csubimage == o.Object_sprite.subimages)");
					print(Basicgame,"o.End_animation();");
					print(Basicgame,"}");
					}*/
				print(Basicgame,"o.Move();");
				print(Basicgame,"o.Collision_event();");
				//print(Basicgame,"o.End_Step_event();");
				print(Basicgame,"// decrease the alarms");
				print(Basicgame,"o.decrease_alarms();");
				print(Basicgame," dd = this.instance_id;");
				print(Basicgame,"dd++;");
				print(Basicgame,"}");

				// draw everything
				print(Basicgame,"dd = 0;");
				print(Basicgame,"while (dd < depth.size() ) {");
				print(Basicgame,"tile t = (tile)depth.get(dd);");
				print(Basicgame,"t.Draw_event(g);");
				print(Basicgame,"dd++;");
				print(Basicgame,"}");
				print(Basicgame,"dd = 0;");

				print(Basicgame,"");
				print(Basicgame,"");
				print(Basicgame,"}");
				print(Basicgame,"}");
        from.close();
        Basicgame.close();
    }
}

    
    /*protected Node createNodeDelegate() {
        return new GMJRoomDataNode(this);
    }*/
    protected Node createNodeDelegate () {
        GMJRoomDataNode me = new GMJRoomDataNode(this,data);
        //me.setDefaultAction (SystemAction.get (OpenRoom.class));
        return me;
    }
    
}
