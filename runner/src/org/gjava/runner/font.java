package org.gjava.runner.runner;
import java.awt.*;
import java.io.*;

public class font {
	public String name, fontname;
	public int size;
	//private FileInputStream fi;
	private InputStream fi;
	public Font nf;
	public Font font;
	
	font(String name, String fontname, int size) {
		// name is the name of the font in gm
		//fontname is the actual name of the font
		//size is the size of the font
		this.name = name;
		this.fontname = fontname;
		this.size = size + 4;
		// load the font
		this.font = load();
	}
	
	public Font get() {
		return font;
	}
	
	public Font load () {
		// this will get the font from the file
		//java.io.File file = new java.io.File(getClass().getResourceAsStream(name+".TTF")); 
		//try {
			//fi = new java.io.FileInputStream();
			//fi = this.getClass().getResourceAsStream("/"+name+".gjf");
			fi = this.getClass().getResourceAsStream(""+name+".gjf");
			
		//} catch(FileNotFoundException ex) { }
		
      	BufferedInputStream fb = new java.io.BufferedInputStream(fi); 
      	
        try {
        	try {
        	nf = Font.createFont(Font.TRUETYPE_FONT, fb); 
        	fi.close();
        	fb.close();
        	} catch (IOException ex) { System.out.println("G-java IO error!"+ex.toString());}
        } catch(FontFormatException ex) {System.out.println("Font format error!"+ex.toString());}
        nf = nf.deriveFont(Font.BOLD, 10);
    return nf;
	}	
}