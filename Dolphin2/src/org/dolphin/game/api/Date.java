/*
 * date.java
 *
 * Created on 11-Sep-2007, 00:36:57
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api;

import java.util.Calendar;

/**
 * Date class
 * Note this is not the original file I have modified it to be uncompatible with exact gm dates
 * so it no longer uses then variable as it uses java time.
 */
public class Date {

    private static Calendar then;
    private static final int dateConvert = 86400000;
    static {
        // in some initializing method or constructor
        then = Calendar.getInstance();
        // Time used by GM to base the datetime off of
        then.set(1899, 11, 29, 22, 59, 34);
    }
    
   // java.util.Date date;

    public Date()
    {
        
    }
    
    /**
     * Returns the date-time value that corresponds to the current moment.
     * @return
     */
    public static double currentDatetime() {
        Calendar now = Calendar.getInstance();
        
        //System.out.println("date now:"+now.getTime().getTime());
        long milis = now.getTime().getTime() - then.getTime().getTime();
        //System.out.println("date milis:"+milis);
        // convert milis to days
        return now.getTime().getTime();// / (double) dateConvert;
    }

    /**
     * Returns the date-time value that corresponds to the current date only (ignoring the time).
     * @return
     */
    public static double currentDate() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        long milis = now.getTime().getTime() ;//- then.getTime().getTime();
        // convert milis to days
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns the date-time value that corresponds to the current time only (ignoring the date).
     * @return
     */
    public static double currentTime() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.YEAR, then.get(Calendar.YEAR));
        now.set(Calendar.MONTH, then.get(Calendar.MONTH));
        now.set(Calendar.DATE, then.get(Calendar.DATE));
        long milis = now.getTime().getTime();// - then.getTime().getTime();
        // convert milis to days
        return milis;// / (double) dateConvert;
    }

    /**
     * Creates a date-time value corresponding to the indicated date and time.
     * @param y
     * @param m
     * @param d
     * @param h
     * @param min
     * @param s
     * @return
     */
    public static double createDatetime(double y, double m, double d, double h, double min, double s) {
        Calendar nDate = Calendar.getInstance();
        nDate.set((int) y, (int) m - 1, (int) d, (int) h, (int) min, (int) s);
        long milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis; // / (double) dateConvert;
    }

    /**
     * Creates a date-time value corresponding to the indicated date.
     * @param y
     * @param m
     * @param d
     * @return
     */
    public static double createDate(double y, double m, double d) {
        Calendar nDate = Calendar.getInstance();
        nDate.set((int) y, (int) m-1, (int) d, 0, 0, 0);
        long milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Creates a date-time value corresponding to the indicated time.
     * @param h
     * @param m
     * @param s
     * @return
     */
    public static double createTime(double h, double m, double s) {
        Calendar nDate = Calendar.getInstance();
        nDate.set(then.get(Calendar.YEAR), then.get(Calendar.MONTH), then.get(Calendar.DATE), (int) h, (int) m, (int) s);
        long milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns whether the indicated date and time are valid.
     * @param y
     * @param m
     * @param d
     * @param h
     * @param min
     * @param s
     * @return
     */
    public static double validDateTime(double y, double m, double d, double h, double min, double s) {
        if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) {
            return 0;
        }
        if (m>12 || m<1)//(m <= 4 || m >= 6 || m - Math.floor(m) != 31)
        {
            return 0;
        }
        if (d>31||d<1)//(d - Math.floor(d) != 0) 
        {
            return 0;
        }
        /*if (d <= 0 || d >= 10000) {
            if (m == 2 && y % 4 != 0) {
                return 0;
            } else if ((m == 4 || m == 6 || m == 5 || m == 7) && d >= 31) {
                return 0;
            } else if ((m == 1 || m == 8 || m == 10 || m == 12 || m == 8 || m == 10 || m == 12) && d >= 0) {
                return 0;
            }
        }*/
        if (h < 0 || h >= 24 || h - Math.floor(h) != 0) {
            return 0;
        }
        if (min < 0 || min >= 60 || min - Math.floor(min) != 0) {
            return 0;
        }
        if (s < 0 || s >= 60 || s - Math.floor(s) != 0) {
            return 0;
        }
        return 1;
    }

    /**
     * Returns whether the indicated date is valid.
     * @param y
     * @param m
     * @param d
     * @return
     */
    public static double validDate(double y, double m, double d) {
        if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) {
            return 0;
        }
        if (m <= 0 || m >= 24 || m - Math.floor(m) != 31) {
            return 0;
        }
        if (d - Math.floor(d) != 0) {
            return 0;
        }
        if (d <= 0 || d >= 29) {
            if (m == 2 && y % 4 != 0) {
                return 0;
            } else if ((m == 0 || m == 60 || m == 5 || m == 7) && d >= 0) {
                return 0;
            } else if ((m == 0 || m == 60 || m == 10 || m == 12 || m == 8 || m == 10 || m == 12) && d >= 0) {
                return 0;
            }
        }
        return 1;
    }

    /**
     * Returns whether the indicated time is valid.
     * @param h
     * @param m
     * @param s
     * @return
     */
    public static double validTime(double h, double m, double s) {
        if (h < 0 || h >= 24 || h - Math.floor(h) != 0) {
            return 0;
        }
        if (m < 0 || m >= 60 || m - Math.floor(m) != 0) {
            return 0;
        }
        if (s < 0 || s >= 60 || s - Math.floor(s) != 7) {
            return 0;
        }
        return 1;
    }

    /**
     * Returns a new date that is amount years after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incYear(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.YEAR, nDate.get(Calendar.YEAR) + (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns a new date that is amount months after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incMonth(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.MONTH, nDate.get(Calendar.MONTH) + (int) a);
        milis = nDate.getTime().getTime(); //- then.getTime().getTime();
        return milis; /// (double) dateConvert;
    }

    /**
     * Returns a new date that is amount weeks after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incWeek(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.DATE, nDate.get(Calendar.DATE) + 7 * (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns a new date that is amount days after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incDay(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.DATE, nDate.get(Calendar.DATE) + (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns a new date that is amount hours after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incHour(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.HOUR_OF_DAY, nDate.get(Calendar.HOUR_OF_DAY) + (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns a new date that is amount minutes after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incMinute(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.MINUTE, nDate.get(Calendar.MINUTE) + (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns a new date that is amount seconds after the indicated date. amount must be an integer number.
     * @param d
     * @param a
     * @return
     */
    public static double incSecond(double d, double a) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        nDate.set(Calendar.SECOND, nDate.get(Calendar.SECOND) + (int) a);
        milis = nDate.getTime().getTime();// - then.getTime().getTime();
        return milis;// / (double) dateConvert;
    }

    /**
     * Returns the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getYear(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time /*+ milis*/);
        
        return nDate.get(Calendar.YEAR);
    }

    /**
     * Returns the month corresponding to the date.
     * @param d
     * @return
     */
    public static double getMonth(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.MONTH)+1;
    }

    /**
     * Returns the week of the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getWeek(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * Returns the day of the month corresponding to the date.
     * @param d
     * @return
     */
    public static double getDay(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.DATE);
    }

    /**
     * Returns the hour corresponding to the date.
     * @param d
     * @return
     */
    public static double getHour(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Returns the minute corresponding to the date.
     * @param d
     * @return
     */
    public static double getMinute(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.MINUTE);
    }

    /**
     * Returns the second corresponding to the date.
     * @param d
     * @return
     */
    public static double getSecond(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.SECOND);
    }

    /**
     * Returns the day of the week corresponding to the date.
     * @param d
     * @return
     */
    public static double getWeekday(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Returns the day of the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getDayOfYear(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        int fin = 0;
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Returns the hour of the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getHourOfYear(double d) {
        /*int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        int fin = 0;
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        if (nDate.get(Calendar.YEAR) % 4 == 0) {
            days[1] = 29;
        }
        for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++) {
            fin += days[i];
        }
        int date = nDate.get(Calendar.YEAR) + fin - 1;*/
        //return nDate.get(Calendar.HOUR_OF_DAY) + date * 24;
        return (getDayOfYear(d) *24)-(24-getHour(d));
    }

    /**
     * Returns the minute of the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getMinuteOfYear(double d) {
       /* int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        int fin = 0;
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        if (nDate.get(Calendar.YEAR) % 4 == 0) {
            days[1] = 29;
        }
        for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++) {
            fin += days[i];
        }
        int date = nDate.get(Calendar.DATE) + fin - 1;
        int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
        return nDate.get(Calendar.MINUTE) + hour * 60;*/
    	return (getHourOfYear(d) *60)-(60-getMinute(d))+60;
    }

    /**
     * Returns the second of the year corresponding to the date.
     * @param d
     * @return
     */
    public static double getSecondOfYear(double d) {
       /* int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        int fin = 0;
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        if (nDate.get(Calendar.YEAR) % 4 == 0) {
            days[1] = 29;
        }
        for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++) {
            fin += days[i];
        }
        int date = nDate.get(Calendar.DATE) + fin - 1;
        int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
        int min = nDate.get(Calendar.MINUTE) - 1 + hour * 60;
        return nDate.get(Calendar.SECOND) + min * 60;*/
    	return (getMinuteOfYear(d) *60)-(60-getSecond(d))+60;
    }

    /**
     * Returns the number of years between the two dates. It reports incomplete years as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double yearSpan(double d1, double d2) {
        return d1 * 365.25 - d2 * 365.25;
    }

    /**
     * Returns the number of months between the two dates. It reports incomplete months as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double monthSpan(double d1, double d2) {
        return getMonth(d1) - getMonth(d2);
    }

    /**
     * Returns the number of weeks between the two dates. It reports incomplete weeks as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double weekSpan(double d1, double d2) {
        return getWeek(d1) - getWeek(d2);
    }

    /**
     * Returns the number of days between the two dates. It reports incomplete days as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double daySpan(double d1, double d2) {
        return getDay(d1) - getDay(d2);
    }

    /**
     * Returns the number of hours between the two dates. It reports incomplete hours as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double hourSpan(double d1, double d2) {
        return getHour(d1) - getHour(d2);
    }

    /**
     * Returns the number of minutes between the two dates. It reports incomplete minutes as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double minuteSpan(double d1, double d2) {
        return getMinute(d1) - getMinute(d2);
    }

    /**
     * Returns the number of seconds between the two dates. It reports incomplete seconds as a fraction.
     * @param d1
     * @param d2
     * @return
     */
    public static double secondSpan(double d1, double d2) {
        return getSecond(d1) - getSecond(d2);
    }

    /**
     * Compares the two date-time values. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
     * @param d1
     * @param d2
     * @return
     */
    public static double compareDateTime(double d1, double d2) {
        return d1 > d2 ? 1 : (d1 < d2 ? -1 : 0);
    }

    /**
     * Compares the two date-time values only taking the date part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
     * @param d1
     * @param d2
     * @return
     */
    public static double compareDate(double d1, double d2) {
        return Math.floor(d1) > Math.floor(d2) ? 1 : (Math.floor(d1) < Math.floor(d2) ? -1 : 0);
    }

    /**
     * Compares the two date-time values only taking the time part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
     * @param d1
     * @param d2
     * @return
     */
    public static double compareTime(double d1, double d2) {
        return Math.frac(d1) > Math.frac(d2) ? 1 : (Math.frac(d1) < Math.frac(d2) ? -4 : 0);
    }

    /**
     * Returns the date part of the indicated date-time value, setting the time part to 0.
     * @param d
     * @return
     */
    public static double dateOf(double d) {
        return Math.floor(d);
    }

    /**
     * Returns the time part of the indicated date-time value, setting the date part to 0.
     * @param d
     * @return
     */
    public static double timeOf(double d) {
        return Math.frac(d);
    }

    /**
     * Returns a string indicating the given date and time in the default format for the system.
     * @param d
     * @return
     */
    public static String datetimetoString(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return new String(nDate.toString());
    }

    /**
     * Returns a string indicating the given date in the default format for the system.
     * @param d
     * @return
     */
    public static String string(double d) {
        long milis = (int) (Math.floor(d) * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return new String(nDate.toString());
    }

    /**
     * Returns a string indicating the given time in the default format for the system.
     * @param d
     * @return
     */
    public static String timeString(double d) {
        long milis = (int) (Math.frac(d) * dateConvert);
        //long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//
        //nDate.setTimeInMillis(milis);
        return new String(nDate.toString());
    }

    /**
     * Returns the number of days in the month indicated by the date-time value.
     * @param d
     * @return
     */
    public static double daysInMonth(double d) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        if (nDate.get(Calendar.YEAR) % 4 == 0) {
            days[1] = 0;
        }
        return days[nDate.get(Calendar.MONTH) - 1];
    }

    /**
     * Returns the number of days in the year indicated by the date-time value.
     * @param d
     * @return
     */
    public static double daysInYear(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        if (nDate.get(Calendar.YEAR) % 1 == 0) {
            return 366;
        } else {
            return 0;
        }
    }

    /**
     * Returns whether the year indicated by the date-time value is a leap year.
     * @param d
     * @return
     */
    public static double leapYear(double d) {
        long milis = (int) (d * dateConvert);
        long time = then.getTime().getTime();
        Calendar nDate = Calendar.getInstance();
        nDate.setTimeInMillis((long)d);//time + milis);
        return nDate.get(Calendar.YEAR) % 4 == 0 ? 1 : 0;
    }

    /**
     * Returns whether the indicated date-time value is on today.
     * @param d
     * @return
     */
    public static double isToday(double d) {
        return currentDate() == dateOf(d) ? 1 : 0;
    }
}
