/*
 * files.java
 * 
 * Created on 11-Sep-2007, 01:41:27
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Enumeration;
import org.gcreator.compilers.gjava.api.res.FileStream;

/**
     * It is useful to use external files in games. For example, you could make a file that describes at what moments certain things should happen. Also you probably want to save information for the next time the game is run (for example, the current room).
     */
    public class File {

        /**
         * read-only files
         */
        public static int fa_readonly = 0;
        /**
         * hidden files
         */
        public static int fa_hidden = 1;
        /**
         * system files
         */
        public static int fa_sysfile = 2;
        /**
         * volume-id files
         */
        public static int fa_volumeid = 3;
        /**
         * directories
         */
        public static int fa_directory = 4;
        /**
         * archived files
         */
        public static int fa_archive = 5;

        /**
         * Unique identifier for the game. You can use this if you need a unique file name.
         */
        public static double game_id = 0;

        /**
         * Temporary directory created for the game. You can store temporary files here. They will be removed at the end of the game.
         */
        public static String temp_directory = System.getProperty("java.io.tmpdir");

        /**
         * Working directory for the game. (Not including the final backslash.)
         */
        public static String working_directory = System.getProperty("user.dir");


        /**
         * Returns the number of command-line parameters (note that the name of the program itself is one of them.
         */
        public static int parameter_count = 0;

        /**
         * A String array of the program parameters
         */
        public static String[] parameters;

        /**
         * Opens the file with the indicated name for reading. The function returns the FileWriter of the file that must be used in the other functions. You can open multiple files at the same time. Don't forget to close them once you are finished with them.
         * @param fname
         * @return
         */
        public static BufferedReader file_text_open_read(String fname) {
            try {
                return new BufferedReader(new java.io.FileReader(fname));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        /**
         * Opens the indicated file for writing, creating it if it does not exist. The function returns the FileWriter object of the file that must be used in the other functions.
         * @param fname
         * @return The FileWriter object of the file that must be used in the other functions
         */
        public static BufferedWriter file_text_open_write(String fname) {
            try {
                return new BufferedWriter(new java.io.FileWriter(fname));
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        /**
         * Opens the indicated file for appending data at the end, creating it if it does not exist. The function returns the FileWriter of the file that must be used in the other functions.
         * @param fname
         * @return
         */
        public static BufferedWriter file_text_open_append(String fname) {
            try {
                return new BufferedWriter(new java.io.FileWriter(fname, true));
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        /**
         * Closes the file.
         * @param fname The FileWriter object to close
         * @return
         */
        public static void file_text_close(BufferedWriter fileid) {
            try {
                fileid.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                //unable to close
            }
        }

        /**
         * Closes the file.
         * @param fname The FileWriter object to close
         * @return
         */
        public static void file_text_close(BufferedReader fileid) {
            try {
                fileid.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                //unable to close
            }
        }


        /**
         * Writes the string to the file.
         * @param fname
         * @return
         */
        public static void file_text_write_string(BufferedWriter fileid, String str) {
            try {
                fileid.write(str);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Write the real value to the file.
         * @param fname
         * @return
         */
        public static void file_text_write_real(FileWriter fileid, double x) {
            try {
                fileid.write(" " + x);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Write a newline character to the file.
         * @param fname
         * @return
         */
        public static void file_text_writeln(BufferedWriter fileid) {
            try {
                fileid.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Reads a string from the file and returns this string. A string ends at the end of line.
         * @param fname
         * @return
         */
        public static String file_text_read_string(BufferedReader fileid) {
            try {
                return fileid.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
                return "";
            }
        }

        /**
         * Reads a real value from the file and returns this value.
         * @param fname
         * @return
         */
        public static double file_text_read_real(FileReader fileid) {
            try {
                int i = fileid.read();
                //get rid of spaces
                while ((("" + i).equals(" ")) && (i != -1)) {
                    i = fileid.read();
                }
                String thenumber = "" + i;
                while ((!("" + i).equals(" ")) && (i != -1)) {
                    thenumber += "" + fileid.read();
                }

                return StringH.real(thenumber);
            } catch (Exception ex) {
                ex.printStackTrace();
                GScript.msgbox("Error reading real!", 1);
                return 0;
            }
        }

        /**
         * Skips the rest of the line in the file and starts at the start of the next line.
         *
         */
        public static void file_text_readln(BufferedReader fileid) {
            try {
                fileid.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Returns whether we reached the end of the file.
         * @param fileid
         * @return
         */
        public static boolean file_text_eof(BufferedWriter fileid) {
            return true;
        }

        /**
         * Returns whether we reached the end of the file.
         * @param fileid
         * @return
         */
        public static boolean file_text_eof(BufferedReader fileid) {
            try {
                fileid.mark(4);
                if (fileid.read() == -1) {

                    return true;
                } else {
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
        public static boolean file_exists(String fname) {
            return new java.io.File(fname).exists();
        }

        /**
         *  Deletes the file with the given name.
         * @param fname
         */
        public static void file_delete(String fname) {
            new java.io.File(fname).delete();
        }

        /**
         * Renames the file with name oldname into newname.
         * @param oldname
         * @param newname
         */
        public static void file_rename(String oldname, String newname) {
            new java.io.File(oldname).renameTo(new java.io.File(newname));
        }

        /**
         * Copies the file fname to the newname.
         * @param fname
         * @param newname
         */
        public static void file_copy(String fname, String newname) {
            try {
                java.io.InputStream in;
                in = new java.io.FileInputStream(new java.io.File(fname));
                java.io.File f = new java.io.File(newname);
                if (new java.io.File(fname).isDirectory()) {
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
        public static boolean directory_exists(String dname) {
            return new java.io.File(dname).exists();
        }

        /**
         * Creates a directory with the given name(including the path towards it) if it does not exist.
         * @param dname
         */
        public static void directory_create(String dname) {
            new java.io.File(dname).mkdir();
        }


        /**
         * Returns the name part of the indicated file name, with the extension but without the path.
         * @param fname
         * @return
         */
        public static String filename_name(String fname) {
            return StringH.string_replace(fname, filename_path(fname), "");
        }

        /**
         * Returns the path part of the indicated file name, including the final backslash.
         * @param fname
         * @return
         */
        public static String filename_path(String fname) {
            try {
                java.net.URL u = new java.net.URL(fname);
                return u.getPath();
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
                return "";
            }
        }

        /**
         * Returns the directory part of the indicated file name, which normally is the same as the path except for the final backslash.
         * @param fname
         * @return
         */
        public static String filename_dir(String fname) {
            return filename_path(fname).substring(0, filename_path(fname).length() - 1);
        }

        /**
         * Returns the drive information of the filename.
         * @param fname
         * @return
         */
        public static String filename_drive(String fname) {

            return filename_path(fname).substring(0, 1);
        }

        /**
         * Returns the extension part of the indicated file name, including the leading dot.
         * @param fname
         * @return
         */
        public static String filename_ext(String fname) {
            return filename_name(fname).substring(filename_name(fname).length() - 4, filename_name(fname).length());
        }

        /**
         * Returns the indicated file name, with the extension(including the dot) changed to the new extension. By using an empty string as the new extension you can remove the extension.
         * @param fname
         * @param newext
         *
         */
        public static void filename_change_ext(String fname, String newext) {
            java.io.File f = new java.io.File(fname);
            f.renameTo(new java.io.File(filename_path(fname).replaceAll(filename_ext(fname), newext)));
        }



        /**
         * Opens the file with the indicated name. The mode indicates what can be done with the file: 0 = reading, 1 = writing, 2 = both reading and writing). The function returns the id of the file that must be used in the other functions. You can open multiple files at the same time. Don't forget to close them once you are finished with them.
         * @param fname
         * @param mode
         * @return
         */
        public static FileStream file_bin_open(String fname, int mode) {
            try {
                FileStream f = new FileStream();
                if (mode == 0) {
                    f.open(fname, false);
                } else {
                    f.open(fname, true);
                }
                return f;
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        /**
         * Rewrites the file with the given file id, that is, clears it and starts writing at the start.
         * @param fileid
         */
        public static void file_bin_rewrite(FileStream fileid) {
            try {
                fileid.open(fileid.fname, true);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         *
         * @param fileid
         */
        public static void file_bin_close(FileStream fileid) {
            try {
                fileid.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Returns the size(in bytes) of the file with the given file id.
         * @param fileid
         * @return
         */
        public static double file_bin_size(FileStream fileid) {
            try {
                return fileid.size();
            } catch (IOException ex) {
                ex.printStackTrace();
                return 0;
            }
        }

        /**
         * Returns the current position(in bytes; 0 is the first position) of the file with the given file id.
         * @return
         */
        public static double file_bin_position(FileStream fileid) {
            try {
                return fileid.pos();
            } catch (IOException ex) {
                ex.printStackTrace();
                return 0;
            }
        }

        /**
         * Moves the current position of the file to the indicated position. To append to a file move the position to the size of the file before writing.
         * @param fileid
         * @param pos
         */
        public static void file_bin_seek(FileStream fileid, int pos) {
            try {
                fileid.seek(pos);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Writes a byte of data to the file with the given file id.
         * @param fileid
         * @param b
         */
        public static void file_bin_write_byte(FileStream fileid, byte b) {
            try {
                fileid.writeByte(b);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Reads a byte of data from the file and returns this.
         * @param fileid
         * @return
         */
        public static byte file_bin_read_byte(FileStream fileid) {
            try {
                return fileid.readByte();
            } catch (IOException ex) {
                ex.printStackTrace();
                return 0;
            }
        }

        /**
         * Returns the number of command-line parameters (note that the name of the program itself is one of them.
         * @return
         */
        public static int parameter_count() {
            return parameter_count;
        }

        /**
         * Returns command-line parameters n. The first parameter has index 0. This is the name of the program.
         * @param n
         * @return
         */
        public static String parameter_string(int n) {
            return parameters[n];
        }

        /**
         * Returns the value (a string) of the environment variable with the given name.
         * @param name
         * @return
         */
        public static String environment_get_variable(String name) {
            try {
                java.util.Properties envProps = new java.util.Properties();
                java.lang.Runtime r = java.lang.Runtime.getRuntime();
                java.lang.Process p = r.exec("cmd /c set>temp.env");
                java.lang.Thread.sleep(500);
                java.io.FileInputStream in = new java.io.FileInputStream("temp.env");
                java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(in));
                java.lang.String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    if ((index = line.indexOf("=")) > -1) {
                        java.lang.String key = line.substring(0, index).trim();
                        java.lang.String value = line.substring(index + 1).trim();
                        envProps.setProperty(key, value);
                    } else {
                        envProps.setProperty(line, "");
                    }
                }
                in.close();
                new java.io.File("temp.env").delete();

                Enumeration names = envProps.propertyNames();
                for (Enumeration e = names; e.hasMoreElements();) {
                    String name2 = (String) e.nextElement();
                    if (name2.equals(name)) {
                        return envProps.getProperty(name);
                    }
                }
                return "";
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                return "";
            } catch (IOException ex) {
                ex.printStackTrace();
                return "";
            }
        }
    }


