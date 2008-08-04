/*
 * File.java
 */

package org.gcreator.compilers.gjava.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.IOException;

   /**
     * This class allows you to modify text files. It also contains general functions for manipulating files.
    * When a file is open it is open for both reading and writing.
     */
    public class File extends Object {


        /**
         * Temporary directory created for the game. You can store temporary files here. They will be removed at the end of the game.
         */
        public static String TempDirectory = new String(System.getProperty("java.io.tmpdir"));

        /**
         * Working directory for the game. (Not including the final backslash.)
         */
        public static String WorkingDirectory = new String(System.getProperty("user.dir"));


              
        private BufferedReader reader;
        private BufferedWriter writer;
        

        /**
         * Opens the text file for reading and writing. Don't forget to close them once you are finished with them.
         * @param fname
         * @param readwrite 
         */
        public void open(String fname,int readwrite) {
            try {
                if (readwrite == 0)
                writer = new BufferedWriter(new java.io.FileWriter(fname+""));
                else
                reader = new BufferedReader(new java.io.FileReader(fname+""));
                
            } catch (Exception ex) {
                ex.printStackTrace();
                
            }
        }

       /**
         * Opens the indicated file for appending data at the end, creating it if it does not exist. The function returns the FileWriter of the file that must be used in the other functions.
         * @param fname
         * 
         */
        public void openAppend(String fname) {
            try {
                writer = new BufferedWriter(new java.io.FileWriter(fname+"", true));
                
            } catch (IOException ex) {
                ex.printStackTrace();
                
            }
        }

        /**
         * Closes the file.
         * 
         */
        public void close() {
            try {
                if (writer !=null)
                writer.close();
                else
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

       /**
         * Writes the string to the file.
        * @param str 
        */
        public void writeString(String str) {
            try {
                writer.write(str+"");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Write the real value to the file.
         * @param x 
         */
        public void writeDouble(double x) {
            try {
                writer.write("" + x+"\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Write a newline character to the file.
         */
        public void newLine() {
            try {
                writer.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Reads a string from the file and returns this string. A string ends at the end of line.
         * @return 
         */
        public String readString() {
            try {
                return new String(reader.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
                return new String("");
            }
        }

        /**
         * Reads a double value from the file and returns this value.
         * @return 
         */
//        public double readDouble() {
//            try {
//                int i = reader.read();
//                //get rid of spaces
//                while ((("" + i).equals(" ")) && (i != -1)) {
//                    i = reader.read();
//                }
//                String thenumber = new String("" + i);
//                while ((!("" + i).equals(" ")) && (i != -1)) {
//                    thenumber = new String(thenumber+"" + reader.read());
//                }
//
//                return Double.parseDouble(thenumber);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                
//                return 0;
//            }
//        }

        /**
         * Skips the rest of the line in the file and starts at the start of the next line.
         *
         */
        public void readln() {
            try {
                reader.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
                /**
         * Returns whether we reached the end of the file in the reader.
         * @return 
         */
        public boolean endOfFile() {
            try {
                char[] cbuf= new char[1];
                
                reader.mark(4);
                if (reader.read(cbuf) == -1) {
                    return true;
                } else {
                    reader.reset();
                    return false;
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                return true;
            }
        }

        /**
         * Returns whether the file with the given name exists (true) or not (false).
         * @param fname
         * @return
         */
        public static boolean exists(String fname) {
            return new java.io.File(fname+"").exists();
        }

        /**
         *  Deletes the file with the given name.
         * @param fname
         */
        public static void delete(java.lang.String fname) {
            new java.io.File(fname+"").delete();
        }

        /**
         * Renames the file with name oldname into newname.
         * @param oldname
         * @param newname
         */
        public static void rename(java.lang.String oldname, java.lang.String newname) {
            new java.io.File(oldname+"").renameTo(new java.io.File(newname+""));
        }

        /**
         * Copies the file fname to the newname.
         * @param fname
         * @param newname
         */
        public static void copy(java.lang.String fname, java.lang.String newname) {
            try {
                java.io.InputStream in;
                in = new java.io.FileInputStream(new java.io.File(fname+""));
                java.io.File f = new java.io.File(newname+"");
                if (new java.io.File(fname+"").isDirectory()) {
                    f.mkdirs();
                }
                if (!f.exists()) {
                    f.createNewFile();
                }
                java.io.OutputStream out = new java.io.FileOutputStream(f);
                byte[] b = new byte[1024];
                int len;
                while ((len = in.read(b)) > 0) {
                    out.write(b, 0, len);
                }
                in.close();
                out.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Returns whether the indicated directory does exist.
         * @param dname
         * @return
         */
        public static boolean directoryExists(String dname) {
            return new java.io.File(dname+"").exists();
        }

        /**
         * Creates a directory with the given name(including the path towards it) if it does not exist.
         * @param dname
         */
        public static void directoryCreate(String dname) {
            new java.io.File(dname+"").mkdir();
        }


        /**
         * Returns the name part of the indicated file name, with the extension but without the path.
         * @param fname
         * @return
         */
//        public static String getFileName(String fname) {
//            return org.gcreator.compilers.gjava.api.String.replace(fname, getFilePath(fname+""), "");
//        }

        /**
         * Returns the path part of the indicated file name, including the final backslash.
         * @param fname
         * @return
         */
//        public static String getFilePath(String fname) {
//            try {
//                java.net.URL u = new java.net.URL(fname+"");
//                return u.getPath();
//            } catch (MalformedURLException ex) {
//                ex.printStackTrace();
//                return new String("");
//            }
//        }

        /**
         * Returns the directory part of the indicated file name, which normally is the same as the path except for the final backslash.
         * @param fname
         * @return
         */
//        public static String getFileDir(String fname) {
//            return getFilePath(fname).substring(0, getFilePath(fname).length() - 1);
//        }

        /**
         * Returns the drive information of the filename.
         * @param fname
         * @return
         */
//        public static String getFileDrive(String fname) {
//
//            return new String((getFilePath(fname)+"").substring(0, 1));
//        }

        /**
         * Returns the extension part of the indicated file name, including the leading dot.
         * @param fname
         * @return
         */
//        public static String getFileExtension(String fname) {
//            return new String(getFileName(fname).substring((""+getFileName(fname)).length() - 4, (""+getFileName(fname)).length()));
//        }

        /**
         * Changes the extension of file fname with newext
         * @param fname
         * @param newext
         *
         */
//        public static void changeFileExtension(String fname, String newext) {
//            java.io.File f = new java.io.File(fname+"");
//            f.renameTo(new java.io.File(getFilePath(fname).replaceAll(getFileExtension(fname), newext)));
//        }     
        
    }


