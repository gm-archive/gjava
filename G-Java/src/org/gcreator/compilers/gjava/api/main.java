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
import org.gcreator.compilers.gjava.core.basicgame;
import org.gcreator.compilers.gjava.core.basicgame;

/**
 *
 * @author Ali1
 */
public class main {
/**
         *  The game score, Starts at 0
         * @since 2.0
         */
        public static int score = 0;

        /**
         * Whether to show the score in the window caption.
         * @since 2.0
         */
        public static boolean show_score = true;
        /**
         * Whether to show the number of lives in the window caption.
         * @since 2.0
         */
        public static boolean show_lives = false;
        /**
         * Whether to show the health in the window caption.
         * @since 2.0
         */
        public static boolean show_health = false;

        /**
         * The Game lives, default 5
         *  @since 2.0
         */
        public static int lives = 5;

        /**
         * The game health, starts at 100
         *  @since 2.0
         */
        public static int health = 100;

        /**
         * The score caption
         * @since 2.0
         */
        public static String score_caption = "score:";
        /**
         * The lives caption
         * @since 2.0
         */
        public static String lives_caption = "lives:";

        /**
         * The health caption
         * @since 2.0
         */
        public static String health_caption = "health:";
        
        /**
         * Executes program prog with arguments arg. wait indicates whether to wait for finishing.
         * @param prog
         * @param arg
         * @param wait
         * @since 2.0
         * @author TGMG
         */
        public static void execute_program(String prog, String arg, boolean wait) {
            try {
                java.lang.Process proc = java.lang.Runtime.getRuntime().exec(prog + arg);
                if (wait) {
                    try {
                        proc.waitFor();
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException raised: " + e.getMessage());
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /**
         * Executes the program (or file) in the shell.
         * @param prog
         * @param arg
         * @since 2.0
         * @author TGMG
         */
        public static void execute_shell(String prog, String arg) {
            execute_program("bash -i " + prog, arg, false);
        }
        
        /**
         * Index of the current room;
         */
        public static int room = basicgame.Current_room.roomid;

        /**
         * Index of the first room in the game.
         */
        public static int room_first = basicgame.firstroom;

        /**
         * Index of the last room in the game.
         */
        public static int room_last = basicgame.lastroom;

        /**
         * The width of the current room
         */
        public static int room_width = basicgame.Current_room.width;

        /**
         * The height of the current room
         */
        public static int room_height = basicgame.Current_room.height;

        /**
         * The caption of the current room
         */
        public static String room_caption = basicgame.Current_room.Caption;

        /**
         * @deprecated Used for compatibility with gm
         */
        public static boolean room_persistent = false;

        /**
         * Goto the room with index roomid.
         * @param roomid
         */
//        public static void room_goto(int roomid) {
//            int GJavalocalroomid = basicgame.Current_room.id;
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
//            int GJavalocalroomid = basicgame.Current_room.id;
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.prev_room(basicgame.Current_room.roomid);
//            } else {
//                basicgame.prev_room(basicgame.Current_room.roomid, basicgame.Eapplet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * Go to the next room.
         */
//        public static void room_goto_next() {
//            int GJavalocalroomid = basicgame.Current_room.id;
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.next_room(basicgame.Current_room.roomid);
//            } else {
//                basicgame.next_room(basicgame.Current_room.roomid, basicgame.Eapplet);
//            }
//            basicgame.remove_room(GJavalocalroomid);
//        }

        /**
         * Restart the current room.
         */
//        public static void room_restart() {
//
//            if (basicgame.Runningas != "EApplet") {
//                basicgame.restart_room(basicgame.Current_room.roomid);
//            } else {
//                basicgame.restart_room(basicgame.Current_room.roomid, basicgame.Eapplet);
//            }
//        }

        /**
         * Return the index of the room before numb(-1 = none) but don't go there.
         * @param numb
         * @return
         */
        public static int room_previous(int numb) {
            return basicgame.Current_room.roomid - 1;
        }

        /**
         * Return the index of the room after numb(-1 = none).
         * @param numb
         * @return
         */
        public static int room_next(int numb) {
            return basicgame.Current_room.roomid - 1;
        }

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
//                    basicgame.remove_room(basicgame.Current_room.id);
//                }
//            }
//        }

        /**
         * Restart the game.
         */
//        public static void game_restart() {
//            int GJavalocalroomid = basicgame.Current_room.id;
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
         * Load game from file, only applications or signed applets
         * @deprecated Not added yet! Does nothing
         * @param savFilename The filename of the save file to load from
         */
        public static void game_load(String savFilename) {
        }
        
        public double version() {
        return 0.33;
    }

    public String location() {
        
        //TODO this fucntion
        return ""; //parameters[0];
    }
}
