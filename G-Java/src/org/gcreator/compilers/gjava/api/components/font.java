package org.gcreator.compilers.gjava.api.components;
import java.awt.*;
import java.io.*;

/**
 * Add a new font with this object
 * @author G-Java development team
 * @version 1.0
 */
public class font {
	/**
	 * The filename of the font
	 */
	public String fname;
        /**
         * The name of the font
         */
        public String  fontname;
	/**
	 * The size of the font
	 */
	public int size;
	//private FileInputStream fi;
	private InputStream fi;
	
	private Font nf;
	/**
	 * The {@link Font} object of this font
	 */
	public Font font;
	
	font(String name, String fontname, int size) {
		// name is the name of the font in gm
		//fontname is the actual name of the font
		//size is the size of the font
		this.fname = fontname;
		this.fontname = name;
		this.size = size + 4;
		// load the font
		this.font = load();
	}
	
	/**
	 * Get the {@link Font} object of this font
	 * @return {@link Font} object of this font
	 */
	public Font get() {
		return font;
	}
	
	/**
	 * This will load the font, called when a new font object is created
	 * @return Font object for this font
	 */
	public Font load () {
		
			fi = this.getClass().getResourceAsStream(""+fname+".gjf");
			
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