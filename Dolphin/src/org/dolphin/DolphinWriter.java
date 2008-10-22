package org.dolphin;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.lateralgm.file.GmFile;
import org.lateralgm.resources.Room;

public class DolphinWriter {
	DolphinFrame df;
	GmFile gmFile;
	String FileFolder;
	File location;

	public DolphinWriter(DolphinFrame df, GmFile gmFile, File file) {
		df.progress(1, "Starting to parse files", "Starting Dolphin");
		this.df = df;
		this.gmFile = gmFile;
		this.location = file;
		this.FileFolder = file.getPath() + File.separator + "Dolphin Projects"
				+ File.separator + gmFile.filename + File.separator;
		new File(FileFolder).mkdirs();
	}

	

	public void createFolders() {
		System.out.println("Moving folders");

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

		        print(scene, "public class " + r.getName() + " extends org.dolphin.game.gtge.Scene2D {");
		        print(scene, "");
		        print(scene, "    " + r.getName() + "() {");
				

			} catch (Exception e) {
				e.printStackTrace();
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
