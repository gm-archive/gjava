/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
 
public class Patch {
 
    private static byte[] sought;
	private static byte[] replacement;
 
	private static boolean matches(MappedByteBuffer bb, int pos) {
		for (int j = 0; j < sought.length; ++j)
		{
			if (sought[j] != bb.get(pos + j))
			{
				return false;
			}
		}
		return true;
	}
 
	private static void replace(MappedByteBuffer bb, int pos) {
		for (int j = 0; j < sought.length; ++j)
		{
			byte b = (j < replacement.length)? replacement[j] : (byte)' ';
			bb.put(pos + j, b);
		}
	}
 
	private static void searchAndReplace(MappedByteBuffer bb, int sz) {
		int replacementsCount = 0;
		for (int pos = 0; pos <= sz - sought.length; ++pos)
		{
			if (matches(bb, pos)) {
				replace(bb, pos);
				pos += sought.length - 1;
				++replacementsCount;
			}
		}
		System.out.println("" + replacementsCount + " replacements done.");
	}
 
    // Search for occurrences of the input pattern in the given file
    private static void patch(File f) throws IOException {
 
		// Open the file and then get a channel from the stream
		RandomAccessFile raf = new RandomAccessFile(f, "rw"); // "rws", "rwd"
		FileChannel fc = raf.getChannel();
 
		// Get the file's size and then map it into memory
		int sz = (int)fc.size();
		MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_WRITE, 0, sz);
 
		searchAndReplace(bb, sz);
 
		bb.force(); // Write back to file, like "flush()"
 
		// Close the channel and the stream
		raf.close();
    }
 
    public static void main(String[] args) {
		if (args.length == 0)
		{
			args = new String[] { "row ", "item", "2.xml" };
		}
		if (args.length < 3) {
			System.err.println("Usage: java Patch sought replacement file...");
			return;
		}
		sought = args[0].getBytes();
		replacement = args[1].getBytes();
		if (sought.length != replacement.length) {
			// Better build-in some support for padding with blanks.
			System.err.println("Usage: sought (" + args[0] + ") and replacement (" + args[1] + ") must have same length");
			return;
		}
		for (int i = 2; i < args.length; i++) {
			File f = new File(args[i]);
			try {
				patch(f);
			} catch (IOException x) {
				System.err.println(f + ": " + x);
			}
		}
    }
}
 
