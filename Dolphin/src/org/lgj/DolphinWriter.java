package org.lgj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.lateralgm.file.GmFile;
import org.lateralgm.resources.Room;

public class DolphinWriter {
	DolphinFrame df;
	GmFile gmFile;
	String FileFolder;
	File location;

	public DolphinWriter(DolphinFrame df, GmFile gmFile, File file)
	{
		df.progress(1, "Starting to parse files", "Starting Dolphin");
		this.df = df;
		this.gmFile = gmFile;
		this.location = file;
		this.FileFolder = file.getPath()+File.separator+"Dolphin Projects"+File.separator+gmFile.filename+File.separator;
	new File(FileFolder).mkdirs();
	}
	
	void parseRooms()
	{
		//out.write4(f.rooms.size());
		for (Room r : gmFile.rooms)
			{
			try {
			FileWriter sceneFW = new FileWriter(FileFolder + r.getName() + ".java");
	        BufferedWriter scene = new BufferedWriter(sceneFW);
	        
			}catch(Exception e){e.printStackTrace();}
			}
	}
	
}
