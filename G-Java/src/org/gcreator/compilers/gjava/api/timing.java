/*
 * timing.java
 * 
 * Created on 11-Sep-2007, 01:30:40
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.core.basicgame;

/**
     * Good games require careful timing of things happening. Fortunately G-Java does most of the timing for you.
     */
    public class timing {

        /**
         * Speed of the game in the current room (in steps per second).
         */
        public static double room_speed;
        /**
         * Number of frames that are actually drawn per second.
         */
        public static double fps = basicgame.Current_room.averageFPS;
        /**
         * Number of milliseconds that have passed since the system was started.
         */
        public static double current_time = date.current_time();
        /**
         *  The current year.
         */
        public static double current_year = date.get_year(date.current_date());

        /**
         *  The current month.
         */
        public static double current_month = date.get_month(date.current_date());
        /**
         * The current day.
         */
        public static double current_day = date.get_day(date.current_date());
        /**
         * The current day of the week (1=sunday, ..., 7=saturday).
         */
        public static double current_weekday = date.get_weekday(date.current_date());
        /**
         * The current hour.
         */
        public static double current_hour = date.get_hour(date.current_time());
        /**
         * The current minute.
         */
        public static double current_minute = date.get_minute(date.current_time());
        /**
         * The current second.
         */
        public static double current_second = date.get_second(date.current_time());

        /**
         * Sleeps numb milliseconds.
         * @param numb
         */
        public static void sleep(long numb) {
            try {
                java.lang.Thread.sleep(numb);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

