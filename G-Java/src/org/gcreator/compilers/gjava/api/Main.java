/*
 * main.java
 * 
 * Created on 11-Sep-2007, 01:36:47
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.io.IOException;
import java.util.Enumeration;
import org.gcreator.compilers.gjava.java2d.basicgame;
import org.gcreator.compilers.gjava.java2d.basicgame;

/**
 *
 * @author TGMG
 */
public class Main {
    
        public static java.lang.String score_caption = "";
        public static long score = 0;
        public static java.lang.String lives_caption = "";
        public static long lives = 3;
        public static java.lang.String health_caption = "";
        public static long health = 100;

        /**
         * Executes program prog with arguments arg. wait indicates whether to wait for finishing.
         * @param prog
         * @param arg
         * @param wait
         * @since 2.0
         * @author TGMG
         */
        public static void execute_program(java.lang.String prog, java.lang.String arg, boolean wait) {
            try {
                java.lang.Process proc = java.lang.Runtime.getRuntime().exec(""+prog + arg);
                
                if (wait) {
                    try {
                        proc.waitFor();
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException raised: " + e.getMessage());
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                System.err.println("Execute program exception!");
            }
        }

        /**
         * Executes the program (or file) in the shell.
         * @param prog
         * @param arg
         * @since 2.0
         * @author TGMG
         */
        public static void execute_shell(java.lang.String prog, java.lang.String arg) {
            execute_program("bash -i " + prog, arg, false);
        }
        
      
        /**
         * Goto the room with index roomid.
         * @param roomid
         */
//        public static void room_goto(int roomid) {
//            int GJavalocalroomid = basicgame.Current.id;
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.change_room(roomid);
//            } else {
//                basicgame.change_room(roomid, basicgame.Eapplet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * Go to the previous room.
         */
//        public static void room_goto_previous() {
//            int GJavalocalroomid = basicgame.Current.id;
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.prev_room(basicgame.Current.roomid);
//            } else {
//                basicgame.prev_room(basicgame.Current.roomid, basicgame.Eapplet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * Go to the next room.
         */
//        public static void room_goto_next() {
//            int GJavalocalroomid = basicgame.Current.id;
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.next_room(basicgame.Current.roomid);
//            } else {
//                basicgame.next_room(basicgame.Current.roomid, basicgame.Eapplet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * Restart the current room.
         */
//        public static void room_restart() {
//
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.restart_room(basicgame.Current.roomid);
//            } else {
//                basicgame.restart_room(basicgame.Current.roomid, basicgame.Eapplet);
//            }
//        }

        /**
         * Return the index of the room before numb(-1 = none) but don't go there.
         * @param numb
         * @return
         */
//        public static int room_previous(int numb) {
//            return basicgame.Current.roomid - 1;
//        }

        /**
         * Return the index of the room after numb(-1 = none).
         * @param numb
         * @return
         */
//        public static int room_next(int numb) {
//            return basicgame.Current.roomid - 1;
//        }

        /**
         *  End the game.
         */
//        public static void end_game() {
//            // end the game
//            if (basicgame.Runningas == "Application") {
//                // close the application
//                System.exit(0);
//            } else {
//                // close the applet
//                if (basicgame.Runningas == "EApplet") {
//                    basicgame.Eapplet.stop();
//                } else {
//                    basicgame.remove_room(basicgame.Current.id);
//                }
//            }
//        }

        /**
         * Restart the game.
         */
//        public static void game_restart() {
//            int GJavalocalroomid = basicgame.Current.id;
//            if (!basicgame.Runningas.equals("EApplet")) {
//                basicgame.change_room(basicgame.firstroom);
//            } else {
//                basicgame.change_room(basicgame.firstroom, basicgame.applet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * save game to file, only applications or signed applets
         * @param savFilename The filename of the save file to save to
         * @deprecated Not added yet! Does nothing
         */
        public static void game_save(String savFilename) {

            // File savefile = (File)getClass().getResourceAsStream(savFilename);
            // File savefile = new File((String)(getClass().getResource(savFilename)));
            // OutputStream os = new OutputStream();
            // RandomAccessFile((File)savefile,)
        }
        
      
        
        /**
         * Returns the value (a string) of the environment variable with the given name.
         * @param name
         * @return
         */
//        public static String environment_get_variable(String name) {
//            try {
//                java.util.Properties envProps = new java.util.Properties();
//                java.lang.Runtime r = java.lang.Runtime.getRuntime();
//                java.lang.Process p = r.exec("cmd /c set>temp.env");
//                java.lang.Thread.sleep(500);
//                java.io.FileInputStream in = new java.io.FileInputStream("temp.env");
//                java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(in));
//                java.lang.String line = null;
//                while ((line = br.readLine()) != null) {
//                    int index = -1;
//                    if ((index = line.indexOf("=")) > -1) {
//                        java.lang.String key = line.substring(0, index).trim();
//                        java.lang.String value = line.substring(index + 1).trim();
//                        envProps.setProperty(key, value);
//                    } else {
//                        envProps.setProperty(line, "");
//                    }
//                }
//                in.close();
//                new java.io.File("temp.env").delete();
//
//                Enumeration names = envProps.propertyNames();
//                for (Enumeration e = names; e.hasMoreElements();) {
//                    java.lang.String name2 = (java.lang.String) e.nextElement();
//                    if (name2.equals(name)) {
//                        return envProps.getProperty(name+"");
//                    }
//                }
//                return "";
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//                return "";
//            } catch (IOException ex) {
//                ex.printStackTrace();
//                return "";
//            }
//        }
//
//    
}
