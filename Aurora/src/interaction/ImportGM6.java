

/*
 * ImportGM6.java
 * 
 * Created on 6/Out/2007, 15:43:54
 * 
 */

package interaction;

import java.awt.image.*;
import java.io.*;
import java.util.zip.*;
import javax.imageio.*;

/**
 *
 * @author Luís
 */
public class ImportGM6 {
    BufferedReader br;
    public ImportGM6(String fname) throws IOException{
        FileInputStream fstream = new FileInputStream(fname);
        DataInputStream in = new DataInputStream(fstream);
        br = new BufferedReader(new InputStreamReader(in));
        int identifier = read4();
        if(identifier!=1234321)
            throw new IOException();
    }
    
    public int read() throws IOException
    {
	return br.read();
    }

    public int read2() throws IOException
    {
	int a = read();
	int b = read();
	return (a | (b << 8));
    }

    public int read3() throws IOException
    {
	int a = read();
	int b = read();
	int c = read();
	return (a | (b << 8) | (c << 16));
    }
    
    public int read4() throws IOException
    {
	int a = read();
	int b = read();
	int c = read();
	int d = read();
	return (a | (b << 8) | (c << 16) | (d << 24));
    }
}
