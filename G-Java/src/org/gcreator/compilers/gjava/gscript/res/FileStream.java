/*
 * FileStream - A file reading/writing class using little endian
 * IsmAvatar 20060526 - Original Coding and Concept
 * Contains no error checking, for efficiency, except for readStr()
 */

package org.gcreator.compilers.gjava.gscript.res;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileStream
	{
	private static byte w[] = new byte[8];
	public boolean write;
	public boolean read;
	public RandomAccessFile f, t;
        public String fname;
	public FileStream() {}

	/* 
	 * Open a file for reading (false) or writing (true)
	 * May open 1 read file and 1 write file simultaneously with 1 FileStream
	 */
	public void open(File file,boolean write) throws IOException
		{
		if (write)
			this.write = true;
		else
			this.read = true;
		if (write)
			t = new RandomAccessFile(file,"rw");
		else
			f = new RandomAccessFile(file,"r");
                
                fname = file.getName();
		}
	
	/* 
	 * Open a file for reading (false) or writing (true)
	 * May open 1 read file and 1 write file simultaneously with 1 FileStream
	 */
	public void open(String file,boolean write) throws IOException
		{
		if (write)
			this.write = true;
		else
			this.read = true;
		if (write)
			t = new RandomAccessFile(file,"rw");
		else
			f = new RandomAccessFile(file,"r");
                
                fname = file;
		}

	//Write a byte to file
	public void writeByte(byte b) throws IOException
		{
		t.writeByte(b);
		}

	//Write a 2-byte short to file (acts as a writeUnsignedShort)
	public void writeShort(int b) throws IOException
		{
		w[0] = (byte) b;
		w[1] = (byte) (b >> 8);
		t.write(w,0,2);
		}

	//Write a 4-byte integer to file
	public void writeInt(int b) throws IOException
		{
		w[0] = (byte) b;
		w[1] = (byte) (b >> 8);
		w[2] = (byte) (b >> 16);
		w[3] = (byte) (b >> 24);
		t.write(w,0,4);
		}

	//Write an 8-byte double to file
	public void writeDouble(double b) throws IOException
		{
		long l = Double.doubleToLongBits(b);
    w[ 0 ] = (byte) l;
    w[ 1 ] = (byte) ( l >> 8 );
    w[ 2 ] = (byte) ( l >> 16 );
    w[ 3 ] = (byte) ( l >> 24 );
    w[ 4 ] = (byte) ( l >> 32 );
    w[ 5 ] = (byte) ( l >> 40 );
    w[ 6 ] = (byte) ( l >> 48 );
    w[ 7 ] = (byte) ( l >> 56 );
    t.write( w, 0, 8 );
		}

	//Write a string to file by writing 4 bytes for length, and 1 byte per character
	public void writeStr(String s) throws IOException
		{
		writeInt(s.length());
		t.write(s.getBytes());
		}

	//Read a byte from file
	public byte readByte() throws IOException
		{
		return f.readByte();
		}

	//Read a 2-byte short from file
	public short readShort() throws IOException
		{
		f.readFully(w,0,2);
		return (short) ((w[1] & 0xff) << 8 | (w[0] & 0xff));
		}

	//Read a 4-byte integer from file
	public int readInt() throws IOException
		{
		f.readFully(w,0,4);
		return (w[3]) << 24 | (w[2] & 0xff) << 16 | (w[1] & 0xff) << 8 | (w[0] & 0xff);
		}

	//Read an 8-byte double from file
	public final double readDouble() throws IOException
		{
		f.readFully(w,0,8);
		long l = (long) (w[7]) << 56 | /* long cast needed or shift done modulo 32 */
		(long) (w[6] & 0xff) << 48 |
		(long) (w[5] & 0xff) << 40 |
		(long) (w[4] & 0xff) << 32 |
		(long) (w[3] & 0xff) << 24 |
		(long) (w[2] & 0xff) << 16 |
		(long) (w[1] & 0xff) << 8 |
		(long) (w[0] & 0xff);
		return Double.longBitsToDouble(l);
		}

	//Read a string from file by reading in 4 bytes to determine length, and 1 byte per character
	public String readStr() throws IOException
		{
		int s = readInt();
		/*
		 * Sometimes you may get a format error or something,
		 * which can cause the wrong size of a string to be reported.
		 * Following through with this size can cause a Heap Space error,
		 * which a program cannot recover from. This tries to prevent
		 * that by checking the string size against the Heap size
		 */
		if (s > Runtime.getRuntime().maxMemory()) throw new IOException("Not enough memory");
		byte[] b = new byte[s];
		f.readFully(b);
		return new String(b);
		}

	//Write a byte v at position p in writing file (overwrites a byte of data)
	public void injectByte(long p,byte v) throws IOException
		{
		long p2 = post();
		seekt(p);
		writeByte(v);
		seekt(p2);
		}

	//Write a 2-byte short v at position p in writing file (overwrites 2 bytes of data)
	public void injectShort(long p,int v) throws IOException
		{
		long p2 = post();
		seekt(p);
		writeShort(v);
		seekt(p2);
		}

	//Write a 4-byte integer v at position p in writing file (overwrites 4 bytes of data)
	public void injectInt(long p,int v) throws IOException
		{
		long p2 = post();
		seekt(p);
		writeInt(v);
		seekt(p2);
		}

	//Write an 8-byte double v at position p in writing file (overwrites 8 bytes of data)
	public void injectDouble(long p,double v) throws IOException
		{
		long p2 = post();
		seekt(p);
		writeDouble(v);
		seekt(p2);
		}

	//There is no injectString method because this can easily cause corruptions

	//Read a byte at position p in reading file
	public byte peekByte(long p) throws IOException
		{
		long p2 = pos();
		seek(p);
		byte v = readByte();
		seek(p2);
		return v;
		}

	//Read a 2-byte short at position p in reading file
	public short peekShort(long p) throws IOException
		{
		long p2 = pos();
		seek(p);
		short v = readShort();
		seek(p2);
		return v;
		}

	//Read a 4-byte integer at position p in reading file
	public int peekInt(long p) throws IOException
		{
		long p2 = pos();
		seek(p);
		int v = readInt();
		seek(p2);
		return v;
		}

	//Read an 8-byte double at position p in reading file
	public double peekDouble(long p) throws IOException
		{
		long p2 = pos();
		seek(p);
		double v = readDouble();
		seek(p2);
		return v;
		}

	//Read a String at position p in reading file
	public String peekStr(long p) throws IOException
		{
		long p2 = pos();
		seek(p);
		String v = readStr();
		seek(p2);
		return v;
		}

	//Transfer a byte from reading file to writing file and return the byte value 
	public byte sniffByte() throws IOException
		{
		byte b = readByte();
		writeByte(b);
		return b;
		}

	//Transfer 2 bytes from reading file to writing file and return the short value 
	public short sniffShort() throws IOException
		{
		f.readFully(w,0,2);
		t.write(w,0,2);
		return (short) ((w[1] & 0xff) << 8 | (w[0] & 0xff));
		}

	//Transfer 4 bytes from reading file to writing file and return the integer value 
	public int sniffInt() throws IOException
		{
		f.readFully(w,0,4);
		t.write(w,0,4);
		return (w[3]) << 24 | (w[2] & 0xff) << 16 | (w[1] & 0xff) << 8 | (w[0] & 0xff);
		}

	//Transfer 8 bytes from reading file to writing file and return the double value 
	public double sniffDouble() throws IOException
		{
		f.readFully(w,0,8);
		t.write(w,0,8);
		long l = (long) (w[7]) << 56 | /* long cast needed or shift done modulo 32 */
		(long) (w[6] & 0xff) << 48 |
		(long) (w[5] & 0xff) << 40 |
		(long) (w[4] & 0xff) << 32 |
		(long) (w[3] & 0xff) << 24 |
		(long) (w[2] & 0xff) << 16 |
		(long) (w[1] & 0xff) << 8 |
		(long) (w[0] & 0xff);
		return Double.longBitsToDouble(l);
		}

	//Transfer a string from reading file to writing file and return the string value
	public String sniffStr() throws IOException
		{
		String s = readStr();
		writeStr(s);
		return s;
		}

	//Skip n bytes in reading file
	public void skip(int n) throws IOException
		{
		f.skipBytes(n);
		}

	//Skip a string in file without reading each character
	public void skipStr() throws IOException
		{
		skip(readInt());
		}

	//Transfer n bytes from reading file to writing file
	public void trans(int n) throws IOException
		{
		for (int m = n; m > 0; m--)
			t.writeByte(f.readByte());
		}

	//Returns the size of the opened file (or the Reading file if both are open)
	public long size() throws IOException
		{
		if (read)
			return f.getChannel().size();
		else
			return t.getChannel().size();
		}

	//Returns the size of the writing file only
	public long sizet() throws IOException
		{
		return t.getChannel().size();
		}

	//Returns the current position in opened file (or in Reading file if both are open)
	public long pos() throws IOException
		{
		if (read)
			return f.getFilePointer();
		else
			return t.getFilePointer();
		}

	//Returns the current position in writing file only
	public long post() throws IOException
		{
		return t.getFilePointer();
		}

	//Jump to position n in opened file (or in Reading file if both are open)
	public void seek(long n) throws IOException
		{
		if (read)
			f.seek(n);
		else
			t.seek(n);
		}

	//Jump to position n in writing file only
	public void seekt(long n) throws IOException
		{
		t.seek(n);
		}

	//Close all opened files
	public void close() throws IOException
		{
		if (write) t.close();
		if (read) f.close();
		write = read = false;
		}

	//Close only the reading file
	public void closef() throws IOException
		{
		f.close();
		read = false;
		}

	//Close only the writing file
	public void closet() throws IOException
		{
		t.close();
		write = false;
		}
	}