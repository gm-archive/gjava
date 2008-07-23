/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.io.IOException;
import org.gcreator.compilers.gjava.api.res.FileStream;

/**
 * BinaryFile is used to modify binary files, files are open for both reading and writing.
 * @author TGMG
 */
public class BinaryFile extends Object {
    
    FileStream f;
    java.lang.String fname="";
/**
         * Opens the file with the indicated name as binary.
         * @param fname
         * 
         */
        public void open(java.lang.String fname) {
            try {
                f = new FileStream();
                
                    f.open(""+fname, true);
                this.fname=fname;
                //return f;
            } catch (IOException ex) {
                ex.printStackTrace();
               // return null;
            }
        }

        /**
         * Rewrites the file, clears it and starts writing at the start.
         
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
         * Returns the current position(in bytes; 0 is the first position) of the file.
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
         * Moves the current position of the file to the indicated position. To append to a file move the position to the size of the file before writing.
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
         * @param b byte of data
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
         * @return
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
