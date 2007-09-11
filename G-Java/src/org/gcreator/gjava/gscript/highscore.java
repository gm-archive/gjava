/*
 * highscore.java
 * 
 * Created on 11-Sep-2007, 04:22:06
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.gjava.gscript;

/**
     * One special pop-up is the highscore list that is maintained for each game.
     */
    public class highscore {
 private static Highscore highscore = new Highscore();
        /**
         * Shows the highscore table. numb is the new score. If this score is good enough to be added to the list, the player can input a name. Use -1 to simple display the current list.
         * @param numb
         */
        public static void highscore_show(double numb) {
            highscore.setVisible(true);
            String str = GScript.popups.get_string("Player name?", "<nobody>");
            highscore.add_score(str, numb);
        }

        /**
         * Sets whether the highscore form must have a border or not.
         * @param show
         */
        public static void highscore_set_border(boolean show) {
            highscore.setUndecorated(show);
        }


        /**
         * Changes the different default strings used when showing the highscore table. caption is the caption of the form. nobody is the string used when there is nobody at the particular rank. escape is the string at the bottom indicating to press the escape key. You can in particular use this when your game should use a different language.
         * @param caption
         * @param nobody
         * @param escape
         */
        public static void highscore_set_strings(String caption, String nobody, String escape) {
            //TODO highscore_set_strings (nobody)
            highscore.setTitle(caption);
            highscore.jLabel11.setText(escape);
        }

        /**
         * Clears the highscore list.
         */
        public static void highscore_clear() {
            //TODO highscore_clear
            highscore.s = new Highscore.Score[10];
        }

        /**
         * Adds a player with name str and score numb to the list.
         * @param str
         * @param numb
         */
        public static void highscore_add(String str, double numb) {
            highscore.add_score(str, numb);
        }

        /**
         * Adds the current score to the highscore list. The player is asked to provide a name.
         */
        public static void highscore_add_current() {
            String str = GScript.popups.get_string("Player name?", "<nobody>");
            highscore.add_score(str, GScript.score.score);
        }

        /**
         * Returns the score of the person on the given place (1-10). This can be used to draw your own highscore list.
         * @param place
         * @return
         */
        public static double highscore_value(int place) {
            return highscore.s[place].score;
        }

        /**
         * Returns the name of the person on the given place (1-10).
         * @param place
         * @return
         */
        public static String highscore_name(int place) {
            return highscore.s[place].name;
        }
    }

