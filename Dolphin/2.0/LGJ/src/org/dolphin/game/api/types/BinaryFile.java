package org.dolphin.game.api.types;

import java.io.IOException;

import org.dolphin.game.api.resources.FileStream;

/*
 * The BinaryFile class is a variable used for writing to and reading from binary
 * files. It is mainly used in GCL.java for the binary functions.
 */
public class BinaryFile extends Variable {

	FileStream f;
	java.lang.String fname = "";

	/**
	 * Opens the file with the indicated name as binary.
	 * 
	 * @param fname
	 * 
	 */
	public void open(java.lang.String fname) {
		try {
			f = new FileStream();
			f.open("" + fname, true);
			this.fname = fname;
		} catch (IOException ex){ex.printStackTrace();}
	}

	/**
	 * Rewrites the file, clears it and starts writing at the start.
	 * 
	 */
	public void rewrite() {
		try {
			System.out.println("rewrite");
			f.close();
			new java.io.File(fname).delete();

			f.open(f.fname, true);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Close the binary file
	 */
	public void close() {
		try {
			f.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Returns the size(in bytes) of the file with the given file id.
	 * 
	 * @return the size
	 */
	public double getSize() {
		try {
			return f.size();
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	/**
	 * Returns the current position(in bytes; 0 is the first position) of the
	 * file.
	 * 
	 * @return
	 */
	public double getPosition() {

		try {
			return f.pos();
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	/**
	 * Moves the current position of the file to the indicated position. To
	 * append to a file move the position to the size of the file before
	 * writing.
	 * 
	 * @param pos
	 */
	public void seek(int pos) {
		try {
			f.seek(pos);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes a byte of data to the file.
	 * 
	 * @param b
	 *            byte of data
	 */
	public void writeByte(byte b) {
		try {

			f.writeByte(b);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Reads a byte of data from the file and returns this.
	 * 
	 * @return the byte value at the current position or 0 if an exception has occured
	 */
	public byte readByte() {
		try {
			return f.readByte();
		} catch (IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
}
