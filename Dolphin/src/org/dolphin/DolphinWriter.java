package org.dolphin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.lateralgm.file.GmFile;
import org.lateralgm.file.GmFormatException;
import org.lateralgm.resources.GmObject;
import org.lateralgm.resources.Room;
import org.lateralgm.resources.sub.BackgroundDef;
import org.lateralgm.resources.sub.Instance;
import org.lateralgm.resources.sub.Tile;

public class DolphinWriter {
	DolphinFrame df;
	GmFile gmFile;
	String FileFolder,filename;
	File location;

	public DolphinWriter(DolphinFrame df, GmFile gmFile, File file) {
            filename=gmFile.filename.substring(gmFile.filename.lastIndexOf(File.separator)+1);
            df.progress(1, "Starting to parse files", "Starting Dolphin for "+filename);
		this.df = df;
		this.gmFile = gmFile;
		this.location = file;
		this.FileFolder = file.getPath() + File.separator + "Dolphin Projects"
				+ File.separator + filename + File.separator;
		new File(FileFolder).mkdirs();
                try{
                parseObjects();
                parseRooms();
                }catch(Exception e){showException(e);}
	}

	

	public void createFolders() {
		System.out.println("Moving folders");

	}
	
	void parseBackgrounds(){
		for (org.lateralgm.resources.Background b : gmFile.backgrounds) {
			
		}
	}
	
	void parseObjects() throws GmFormatException{
		ArrayList<String> names = new ArrayList<String>(gmFile.gmObjects.size());
		
		for (GmObject o : gmFile.gmObjects)
			{
			/*check for duplicate objects*/
			String name = o.getName();
			if (names.contains(name))
				throw new GmFormatException(gmFile,"Duplicate object name: " + name);
			try{
			FileWriter actorFW = new FileWriter(FileFolder + o.getName()
					+ ".java");
			BufferedWriter actor = new BufferedWriter(actorFW);
			
			print(actor, "package org.dolphin.game;");
	        print(actor, "");
                actor.close();
			}catch(Exception e){showException(e);}
			}
	}

        void showException(Exception e){
            e.printStackTrace();
            df.progress(0, "Exception failed to convert!", "Error:"+e.getMessage()+""+e.getStackTrace());
        }

	void parseRooms() {
		// out.write4(f.rooms.size());
		for (Room r : gmFile.rooms) {
			try {
				FileWriter sceneFW = new FileWriter(FileFolder + r.getName()
						+ ".java");
				BufferedWriter scene = new BufferedWriter(sceneFW);
				
				print(scene, "package org.dolphin.game;");
		        print(scene, "");

		        print(scene, "import java.awt.Color;");
		        print(scene, "import org.dolphin.game.core.*;");
		        print(scene, "import org.dolphin.game.api.*;");
		        print(scene, "import org.dolphin.game.api.Integer;");
		        print(scene, "import org.dolphin.game.api.Double;");
		        print(scene, "import org.dolphin.game.api.components.Background;");

		        print(scene, "public class " + r.getName() + " extends org.dolphin.game.api.components.Room2D {");
		        print(scene, "");
		        print(scene, "	public " + r.getName() + "() {");
		        print(scene, "		super(Game.frame,"+r.caption+","+r.speed+","+r.width+","+r.height+",new Color("+r.backgroundColor.getRed()+ "," + r.backgroundColor.getGreen() + "," + r.backgroundColor.getBlue() +","+r.drawBackgroundColor+","+r.persistent+","+r.getId()+");");
		        print(scene, "      this.vectorid=vectorid;");
		        print(scene, "  }");
		        print(scene, "");
		        print(scene, "  protected void setupScene() {");
		        print(scene, "");
		        
		        /*create the instances*/
		        for (int i = 0; i < r.instances.size(); i++) {
		        	Instance in = r.instances.get(i);
		        	print(scene, "    instances.add(new "+in.getObject().get().getName()+"("+in.getPosition().x+", "+in.getPosition().y+", "+in.instanceId+"));");
				}
		        print(scene, "    /*Create the backgrounds*/");
		        /*Create the backgrounds*/
		        for (int i = 0; i < r.backgroundDefs.length; i++) {
		        	BackgroundDef b = r.backgroundDefs[i];
                                System.out.println("b.backgroundId:"+b.backgroundId);
                                if (b.backgroundId!=null)
		        	print(scene, "backgrounds.add(Game."+b.backgroundId.get().getName()+");");
				}
		        
		        print(scene, "    /*Create the tiles*/");
		        /*Create the tiles*/
		        for (int i = 0; i < r.tiles.size(); i++) {
		        	Tile t = r.tiles.get(i);
                                if (t!=null)
		        	print(scene, "tiles.add(new Tile("+t.getRoomPosition().x+", "+t.getRoomPosition().y+","+t.getBackgroundPosition().x+", "+t.getBackgroundPosition().y+", "+t.getSize().width+","+t.getSize().height+""+t.getDepth()+", "+t.tileId+",Game."+t.getBackground().get().getName()+");");
				}
		        
		        print(scene, "");
                        print(scene, "  }");//end setupScene
                        scene.close();
			} catch (Exception e) {
				showException(e);
			}
		}
	}

	/*
	 * Print a line to the BufferedWriter
	 */ 
    public static void print(BufferedWriter file, String printString) throws IOException {
        file.write(printString);
        file.newLine();
    }
}
