    /*
     *                 Sun Public License Notice
     *
     * The contents of this file are subject to the Sun Public License
     * Version 1.0 (the "License"). You may not use this file except in
     * compliance with the License. A copy of the License is available at
     * http://www.sun.com/
     *
     * The Original Code is the CSSCompletion module.
     * The Initial Developer of the Original Code is Nicolas D�sy.
     * Portions created by Nicolas D�sy are Copyright (C) 2006.
     * All Rights Reserved.
     */

/*
 * ManifestCompletionProvider.java
 *
 * Created on February 13, 2006, 7:1
 
 */

package org.gjava.gmscript.manifest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JToolTip;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.ErrorManager;
import org.openide.text.NbDocument;


/**
 * @author Nicolas D�sy & Geertjan Wielenga
 */
@SuppressWarnings("unchecked")
public class ManifestCompletionProvider implements CompletionProvider {
    
    public CompletionTask createTask(final int queryType, final JTextComponent component) {
        
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            
            protected void query(final CompletionResultSet resultSet, Document doc, final int caretOffset) {
                
                final StyledDocument bDoc = (StyledDocument)doc;
                
                class Operation implements Runnable {
                    
                    String filter = null;
                    int startOffset = caretOffset-1;
                    
                    public void run() {
                        
                        //Here we create the filter:
                        try {
                            final int lineStartOffset = Utilities.getRowFirstNonWhite(bDoc, caretOffset);
                            if(lineStartOffset > -1 && caretOffset > lineStartOffset){
                                final char[] line = bDoc.getText(lineStartOffset, caretOffset-lineStartOffset).toCharArray();
                                final int whiteOffset = Utilities.indexOfWhite(line);
                                filter = new String(line, whiteOffset+1, line.length-whiteOffset-1);
                            }
                        } catch (BadLocationException ex) {
                            ErrorManager.getDefault().notify(ex);
                        }
                        
                        //Here we use the filter, if not null:
                        if(filter != null){
                            final Iterator it;
                           int i=0;
                            it = keywords.iterator();
                           
                           
                            while(it.hasNext()){
                                final String entry = (String)it.next();
                                if(entry.startsWith(filter)){
                                    resultSet.addItem(new ManifestCompletionItem(entry, startOffset, caretOffset,(String)keyworddoc.get(i)));
                                    i++;
                                }
                            }
                        } else{
                            final Iterator it;
                          int i=0;
                            it = keywords.iterator();
                           
                             
                            while(it.hasNext()){
                                final String entry = (String)it.next();
                                resultSet.addItem(new ManifestCompletionItem(entry, startOffset, caretOffset,(String)keyworddoc.get(i)));
                                i++;
                            }
                        }
                        
                        resultSet.setAnchorOffset(caretOffset);
                        resultSet.finish();
                        
                    }
                }
                
                Operation oper = new Operation();
                bDoc.render(oper);
            }
        }, component);
    }
    
    
    public int getAutoQueryTypes(JTextComponent component, String typedText) {
           if (".".equals(typedText)) {
                            return 1;
        }
        return 0;
    }
    
    private final static List keywords = new ArrayList();
    private final static List keyworddoc = new ArrayList();
    static{
keywords.add("string.chr");
 keyworddoc.add("<b>String</b> chr <i>(double v)</i><br><br>   Returns a string containing the character with asci code val ");
keywords.add("string.ord");
 keyworddoc.add("<b>double</b> ord <i>(String s)</i><br><br>   Returns the asci code of the first character in str ");
keywords.add("string.real");
 keyworddoc.add("<b>double</b> real <i>(String s)</i><br><br>   Turns str into a real number str can contain a minus sign a decimal dot and even an exponential part ");
keywords.add("string.string");
 keyworddoc.add("<b>String</b> string <i>(double v)</i><br><br>   Turns the real value into a string using a standard format (no decimal places when it is an integer, and two decimal places otherwise) ");
keywords.add("string.string_format");
 keyworddoc.add("<b>String</b> string_format <i>(double v, double t, double d)</i><br><br>   Turns val into a string using your own format tot indicates the total number of places and dec indicated the number of decimal places ");
keywords.add("string.string_length");
 keyworddoc.add("<b>double</b> string_length <i>(String s)</i><br><br>   Returns the number of characters in the string ");
keywords.add("string.string_pos");
 keyworddoc.add("<b>double</b> string_pos <i>(String sub, String s)</i><br><br>   Returns the position of substr in str (0=no occurrence) ");
keywords.add("string.string_copy");
 keyworddoc.add("<b>String</b> string_copy <i>(String s, double i, double c)</i><br><br>   Returns a substring of str starting at position index and of length count ");
keywords.add("string.string_char_at");
 keyworddoc.add("<b>String</b> string_char_at <i>(String s, double i)</i><br><br>   Returns the character in str at position index ");
keywords.add("string.string_delete");
 keyworddoc.add("<b>String</b> string_delete <i>(String s, double i, double c)</i><br><br>   Returns a copy of str with the part removed that starts at position index and has length count ");
keywords.add("string.string_insert");
 keyworddoc.add("<b>String</b> string_insert <i>(String sub, String s, double i)</i><br><br>   Returns a copy of str with substr added at position index ");
keywords.add("string.string_replace");
 keyworddoc.add("<b>String</b> string_replace <i>(String s, String sub, String n)</i><br><br>   Returns a copy of str with the first occurrence of substr replaced by newstr ");
keywords.add("string.string_replace_all");
 keyworddoc.add("<b>String</b> string_replace_all <i>(String s, String sub, String n)</i><br><br>   Returns a copy of str with all occurrences of substr replaced by newstr ");
keywords.add("string.string_count");
 keyworddoc.add("<b>double</b> string_count <i>(String sub, String s)</i><br><br>   Returns the number of occurrences of substr in str ");
keywords.add("string.string_lower");
 keyworddoc.add("<b>String</b> string_lower <i>(String s)</i><br><br>   Returns a lowercase copy of str ");
keywords.add("string.string_upper");
 keyworddoc.add("<b>String</b> string_upper <i>(String s)</i><br><br>   Returns an uppercase copy of str ");
keywords.add("string.string_repeat");
 keyworddoc.add("<b>String</b> string_repeat <i>(String s, double c)</i><br><br>   Returns a string consisting of count copies of str ");
keywords.add("string.string_letters");
 keyworddoc.add("<b>String</b> string_letters <i>(String s)</i><br><br>   Returns a string that only contains the letters in str ");
keywords.add("string.string_digits");
 keyworddoc.add("<b>String</b> string_digits <i>(String s)</i><br><br>   Returns a string that only contains the digits in str ");
keywords.add("string.string_lettersdigits");
 keyworddoc.add("<b>String</b> string_lettersdigits <i>(String s)</i><br><br>   Returns a string that contains the letters and digits in str ");
keywords.add("date.current_datetime");
 keyworddoc.add("<b>double</b> current_datetime <i>()</i><br><br>   Returns the date - time value that corresponds to the current moment ");
keywords.add("date.current_date");
 keyworddoc.add("<b>double</b> current_date <i>()</i><br><br>   Returns the date - time value that corresponds to the current date only (ignoring the time) ");
keywords.add("date.current_time");
 keyworddoc.add("<b>double</b> current_time <i>()</i><br><br>   Returns the date - time value that corresponds to the current time only (ignoring the date) ");
keywords.add("date.create_datetime");
 keyworddoc.add("<b>double</b> create_datetime <i>(double y, double m, double d, double h, double min, double s)</i><br><br>   Creates a date - time value corresponding to the indicated date and time ");
keywords.add("date.create_date");
 keyworddoc.add("<b>double</b> create_date <i>(double y, double m, double d)</i><br><br>   Creates a date - time value corresponding to the indicated date ");
keywords.add("date.create_time");
 keyworddoc.add("<b>double</b> create_time <i>(double h, double m, double s)</i><br><br>   Creates a date - time value corresponding to the indicated time ");
keywords.add("date.valid_datetime");
 keyworddoc.add("<b>double</b> valid_datetime <i>(double y, double m, double d, double h, double min, double s)</i><br><br>   Returns whether the indicated date and time are valid ");
keywords.add("date.valid_date");
 keyworddoc.add("<b>double</b> valid_date <i>(double y, double m, double d)</i><br><br>   Returns whether the indicated date is valid ");
keywords.add("date.valid_time");
 keyworddoc.add("<b>double</b> valid_time <i>(double h, double m, double s)</i><br><br>   Returns whether the indicated time is valid ");
keywords.add("date.inc_year");
 keyworddoc.add("<b>double</b> inc_year <i>(double d, double a)</i><br><br>   Returns a new date that is amount years after the indicated date amount must be an integer number ");
keywords.add("date.inc_month");
 keyworddoc.add("<b>double</b> inc_month <i>(double d, double a)</i><br><br>   Returns a new date that is amount months after the indicated date amount must be an integer number ");
keywords.add("date.inc_week");
 keyworddoc.add("<b>double</b> inc_week <i>(double d, double a)</i><br><br>   Returns a new date that is amount weeks after the indicated date amount must be an integer number ");
keywords.add("date.inc_day");
 keyworddoc.add("<b>double</b> inc_day <i>(double d, double a)</i><br><br>   Returns a new date that is amount days after the indicated date amount must be an integer number ");
keywords.add("date.inc_hour");
 keyworddoc.add("<b>double</b> inc_hour <i>(double d, double a)</i><br><br>   Returns a new date that is amount hours after the indicated date amount must be an integer number ");
keywords.add("date.inc_minute");
 keyworddoc.add("<b>double</b> inc_minute <i>(double d, double a)</i><br><br>   Returns a new date that is amount minutes after the indicated date amount must be an integer number ");
keywords.add("date.inc_second");
 keyworddoc.add("<b>double</b> inc_second <i>(double d, double a)</i><br><br>   Returns a new date that is amount seconds after the indicated date amount must be an integer number ");
keywords.add("date.get_year");
 keyworddoc.add("<b>double</b> get_year <i>(double d)</i><br><br>   Returns the year corresponding to the date ");
keywords.add("date.get_month");
 keyworddoc.add("<b>double</b> get_month <i>(double d)</i><br><br>   Returns the month corresponding to the date ");
keywords.add("date.get_week");
 keyworddoc.add("<b>double</b> get_week <i>(double d)</i><br><br>   Returns the week of the year corresponding to the date ");
keywords.add("date.get_day");
 keyworddoc.add("<b>double</b> get_day <i>(double d)</i><br><br>   Returns the day of the month corresponding to the date ");
keywords.add("date.get_hour");
 keyworddoc.add("<b>double</b> get_hour <i>(double d)</i><br><br>   Returns the hour corresponding to the date ");
keywords.add("date.get_minute");
 keyworddoc.add("<b>double</b> get_minute <i>(double d)</i><br><br>   Returns the minute corresponding to the date ");
keywords.add("date.get_second");
 keyworddoc.add("<b>double</b> get_second <i>(double d)</i><br><br>   Returns the second corresponding to the date ");
keywords.add("date.get_weekday");
 keyworddoc.add("<b>double</b> get_weekday <i>(double d)</i><br><br>   Returns the day of the week corresponding to the date ");
keywords.add("date.get_day_of_year");
 keyworddoc.add("<b>double</b> get_day_of_year <i>(double d)</i><br><br>   Returns the day of the year corresponding to the date ");
keywords.add("date.get_hour_of_year");
 keyworddoc.add("<b>double</b> get_hour_of_year <i>(double d)</i><br><br>   Returns the hour of the year corresponding to the date ");
keywords.add("date.get_minute_of_year");
 keyworddoc.add("<b>double</b> get_minute_of_year <i>(double d)</i><br><br>   Returns the minute of the year corresponding to the date ");
keywords.add("date.get_second_of_year");
 keyworddoc.add("<b>double</b> get_second_of_year <i>(double d)</i><br><br>   Returns the second of the year corresponding to the date ");
keywords.add("date.year_span");
 keyworddoc.add("<b>double</b> year_span <i>(double d1, double d2)</i><br><br>   Returns the number of years between the two dates It reports incomplete years as a fraction ");
keywords.add("date.month_span");
 keyworddoc.add("<b>double</b> month_span <i>(double d1, double d2)</i><br><br>   Returns the number of months between the two dates It reports incomplete months as a fraction ");
keywords.add("date.week_span");
 keyworddoc.add("<b>double</b> week_span <i>(double d1, double d2)</i><br><br>   Returns the number of weeks between the two dates It reports incomplete weeks as a fraction ");
keywords.add("date.day_span");
 keyworddoc.add("<b>double</b> day_span <i>(double d1, double d2)</i><br><br>   Returns the number of days between the two dates It reports incomplete days as a fraction ");
keywords.add("date.hour_span");
 keyworddoc.add("<b>double</b> hour_span <i>(double d1, double d2)</i><br><br>   Returns the number of hours between the two dates It reports incomplete hours as a fraction ");
keywords.add("date.minute_span");
 keyworddoc.add("<b>double</b> minute_span <i>(double d1, double d2)</i><br><br>   Returns the number of minutes between the two dates It reports incomplete minutes as a fraction ");
keywords.add("date.second_span");
 keyworddoc.add("<b>double</b> second_span <i>(double d1, double d2)</i><br><br>   Returns the number of seconds between the two dates It reports incomplete seconds as a fraction ");
keywords.add("date.compare_datetime");
 keyworddoc.add("<b>double</b> compare_datetime <i>(double d1, double d2)</i><br><br>   Compares the two date - time values Returns -1 0 or 1 depending on whether the first is smaller equal or larger than the second value ");
keywords.add("date.compare_date");
 keyworddoc.add("<b>double</b> compare_date <i>(double d1, double d2)</i><br><br>   Compares the two date - time values only taking the date part into account Returns -1 0 or 1 depending on whether the first is smaller equal or larger than the second value ");
keywords.add("date.compare_time");
 keyworddoc.add("<b>double</b> compare_time <i>(double d1, double d2)</i><br><br>   Compares the two date - time values only taking the time part into account Returns -1 0 or 1 depending on whether the first is smaller equal or larger than the second value ");
keywords.add("date.of");
 keyworddoc.add("<b>double</b> of <i>(double d)</i><br><br>   Returns the date part of the indicated date - time value setting the time part to 0 ");
keywords.add("date.time_of");
 keyworddoc.add("<b>double</b> time_of <i>(double d)</i><br><br>   Returns the time part of the indicated date - time value setting the date part to 0 ");
keywords.add("date.datetime_string");
 keyworddoc.add("<b>String</b> datetime_string <i>(double d)</i><br><br>   Returns a string indicating the given date and time in the default format for the system ");
keywords.add("date.string");
 keyworddoc.add("<b>String</b> string <i>(double d)</i><br><br>   Returns a string indicating the given date in the default format for the system ");
keywords.add("date.time_string");
 keyworddoc.add("<b>String</b> time_string <i>(double d)</i><br><br>   Returns a string indicating the given time in the default format for the system ");
keywords.add("date.days_in_month");
 keyworddoc.add("<b>double</b> days_in_month <i>(double d)</i><br><br>   Returns the number of days in the month indicated by the date - time value ");
keywords.add("date.days_in_year");
 keyworddoc.add("<b>double</b> days_in_year <i>(double d)</i><br><br>   Returns the number of days in the year indicated by the date - time value ");
keywords.add("date.leap_year");
 keyworddoc.add("<b>double</b> leap_year <i>(double d)</i><br><br>   Returns whether the year indicated by the date - time value is a leap year ");
keywords.add("date.is_today");
 keyworddoc.add("<b>double</b> is_today <i>(double d)</i><br><br>   Returns whether the indicated date - time value is on today ");
//math
 keywords.add("math.cbrt");
 keyworddoc.add("<b>double</b> cbrt <i>(double x)</i><br><br>   The Mathematical constant E , the base of the natural logarithms / public static double E = Math E ; /   Returns the cube root of a double value For positive finite x , cbrt (-x) == - cbrt (x) ; that is , the cube root of a negative value is the negative of the cube root of that value s magnitude  ");
keywords.add("math.random");
 keyworddoc.add("<b>double</b> random <i>(double x)</i><br><br>   Returns a random real number between 0 and x The number is always smaller than x ");
keywords.add("math.abs");
 keyworddoc.add("<b>double</b> abs <i>(double x)</i><br><br>   Returns the absolute value of x ");
keywords.add("math.sign");
 keyworddoc.add("<b>double</b> sign <i>(double x)</i><br><br>   Returns the sign of x (-1, 0 or 1) ");
keywords.add("math.round");
 keyworddoc.add("<b>double</b> round <i>(double x)</i><br><br>   Returns x rounded to the nearest integer ");
keywords.add("math.floor");
 keyworddoc.add("<b>double</b> floor <i>(double x)</i><br><br>   Returns the floor of x , that is , x rounded down to an integer ");
keywords.add("math.ceil");
 keyworddoc.add("<b>double</b> ceil <i>(double x)</i><br><br>   Returns the ceiling of x , that is , x rounded up to an integer ");
keywords.add("math.frac");
 keyworddoc.add("<b>double</b> frac <i>(double x)</i><br><br>   Returns the fractional part of x , that is , the part behind the decimal dot ");
keywords.add("math.sqrt");
 keyworddoc.add("<b>double</b> sqrt <i>(double x)</i><br><br>   Returns the square root of x x must be non - negative ");
keywords.add("math.sqr");
 keyworddoc.add("<b>double</b> sqr <i>(double x)</i><br><br>   Returns x  x ");
keywords.add("math.power");
 keyworddoc.add("<b>double</b> power <i>(double x, double n)</i><br><br>   Returns x to the power n ");
keywords.add("math.exp");
 keyworddoc.add("<b>double</b> exp <i>(double x)</i><br><br>   Returns e to the power x ");
keywords.add("math.ln");
 keyworddoc.add("<b>double</b> ln <i>(double x)</i><br><br>   Returns the natural logarithm of x ");
keywords.add("math.log2");
 keyworddoc.add("<b>double</b> log2 <i>(double x)</i><br><br>   Returns the log base 2 of x ");
keywords.add("math.log10");
 keyworddoc.add("<b>double</b> log10 <i>(double x)</i><br><br>   Returns the log base 10 of x ");
keywords.add("math.logn");
 keyworddoc.add("<b>double</b> logn <i>(double n, double x)</i><br><br>   Returns the log base n of x ");
keywords.add("math.sin");
 keyworddoc.add("<b>double</b> sin <i>(double x)</i><br><br>   Returns the sine of x (x in radians) ");
keywords.add("math.signum");
 keyworddoc.add("<b>double</b> signum <i>(double x)</i><br><br>   Returns the signum function of the argument ; zero if the argument is zero , 1 0 if the argument is greater than zero , -1 0 if the argument is less than zero ");
keywords.add("math.sinh");
 keyworddoc.add("<b>double</b> sinh <i>(double x)</i><br><br>   Returns the hyperbolic sine of x ");
keywords.add("math.cos");
 keyworddoc.add("<b>double</b> cos <i>(double x)</i><br><br>   Returns the cosine of x (x in radians) ");
keywords.add("math.cosh");
 keyworddoc.add("<b>double</b> cosh <i>(double x)</i><br><br>   Returns the hyperbolic cosine of x ");
keywords.add("math.expm1");
 keyworddoc.add("<b>double</b> expm1 <i>(double x)</i><br><br>   Returns ex -1 ");
keywords.add("math.hypot");
 keyworddoc.add("<b>double</b> hypot <i>(double x, double y)</i><br><br>   Returns sqrt (xx +yy) without intermediate overflow or underflow ");
keywords.add("math.ulp");
 keyworddoc.add("<b>double</b> ulp <i>(double x)</i><br><br>   Returns the size of an ulp of the argument ");
keywords.add("math.tanh");
 keyworddoc.add("<b>double</b> tanh <i>(double x)</i><br><br>   Returns the hyperbolic tangent of x ");
keywords.add("math.tan");
 keyworddoc.add("<b>double</b> tan <i>(double x)</i><br><br>   Returns the tangent of x (x in radians) ");
keywords.add("math.arcsin");

keyworddoc.add("<b>double</b> arcsin <i>(double x)</i><br><br>   Returns the inverse sine of x ");
keywords.add("math.arccos");
 keyworddoc.add("<b>double</b> arccos <i>(double x)</i><br><br>   Returns the inverse cosine of x ");
keywords.add("math.arctan");
 keyworddoc.add("<b>double</b> arctan <i>(double x)</i><br><br>   Returns the inverse tangent of x ");
keywords.add("math.arctan2");
 keyworddoc.add("<b>double</b> arctan2 <i>(double y, double x)</i><br><br>   Calculates arctan (Y/X) , and returns an angle in the correct quadrant ");
keywords.add("math.degtorad");
 keyworddoc.add("<b>double</b> degtorad <i>(double x)</i><br><br>   Converts degrees to radians ");
keywords.add("math.radtodeg");
 keyworddoc.add("<b>double</b> radtodeg <i>(double x)</i><br><br>   Converts radians to degrees ");
keywords.add("math.min");
 keyworddoc.add("<b>double</b> min <i>(double v1, double v2)</i><br><br>   Returns the minimum of the values The function can have up to 16 arguments ");
keywords.add("math.max");
 keyworddoc.add("<b>double</b> max <i>(double v1, double v2)</i><br><br>   Returns the maximum of the values The function can have up to 16 arguments ");
keywords.add("math.mean");
 keyworddoc.add("<b>double</b> mean <i>(double v1, double v2)</i><br><br>   Returns the average of the values The function can have up to 16 arguments ");

keywords.add("math.median");
 keyworddoc.add("<b>double</b> median <i>(double a)</i><br><br>   Returns the median of the values , that is , the middle value (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments They must all be real values ");

keywords.add("math.true_median");
 keyworddoc.add("<b>double</b> true_median <i>(double a)</i><br><br>   Returns the true median of the values (based on mean rather than min) , that is , the middle value The function can have up to 16 arguments They must all be real values ");
keywords.add("math.point_distance");
 keyworddoc.add("<b>double</b> point_distance <i>(double x1, double y1, double x2, double y2)</i><br><br>   Returns the distance between point (x1,y1) and point (x2,y2) ");
keywords.add("math.point_direction");
 keyworddoc.add("<b>double</b> point_direction <i>(double x1, double y1, double x2, double y2)</i><br><br>   Returns the direction from point (x1,y1) toward point (x2,y2) in degrees ");
keywords.add("math.is_string");
 keyworddoc.add("<b>boolean</b> is_string <i>(String a)</i><br><br>   Always returns true , used for compatibility with GM ");
keywords.add("math.is_string");
 keyworddoc.add("<b>boolean</b> is_string <i>(double a)</i><br><br>   Always returns false , used for compatibility with GM ");
keywords.add("math.is_string");
 keyworddoc.add("<b>boolean</b> is_string <i>(boolean a)</i><br><br>   Always returns false , used for compatibility with GM ");
keywords.add("math.is_real");
 keyworddoc.add("<b>boolean</b> is_real <i>(String a)</i><br><br>   Always returns false , used for compatibility with GM ");
keywords.add("math.is_real");
 keyworddoc.add("<b>boolean</b> is_real <i>(double a)</i><br><br>   Always returns true , used for compatibility with GM ");
keywords.add("math.is_real");
 keyworddoc.add("<b>boolean</b> is_real <i>(boolean a)</i><br><br>   Always returns true , used for compatibility with GM ");
keywords.add("math.lengthdir_x");
 keyworddoc.add("<b>double</b> lengthdir_x <i>(double len, double dir)</i><br><br>   Returns the horizontal x - component of the vector determined by the indicated length and direction ");
keywords.add("math.lengthdir_y");
 keyworddoc.add("<b>double</b> lengthdir_y <i>(double len, double dir)</i><br><br>   Returns the vertical y - component of the vector determined by the indicated length and direction ");

 //clipboard
 keywords.add("clipboard.clipboard_has_text");
 keyworddoc.add("<b>double</b> clipboard_has_text <i>()</i><br><br>   Returns whether there is any text on the clipboard ");
keywords.add("clipboard.clipboard_get_text");
 keyworddoc.add("<b>String</b> clipboard_get_text <i>()</i><br><br>   Returns the current text on the clipboard ");
keywords.add("clipboard.clipboard_set_text");
 keyworddoc.add("<b>double</b> clipboard_set_text <i>(String s)</i><br><br>   Sets the string str on the clipboard ");

 //display
 keywords.add("display.display_get_width");
 keyworddoc.add("<b>double</b> display_get_width <i>()</i><br><br>   Returns the width of the display in pixels ");
keywords.add("display.display_get_height");
 keyworddoc.add("<b>double</b> display_get_height <i>()</i><br><br>   Returns the height of the display in pixels ");
keywords.add("display.display_get_colordepth");
 keyworddoc.add("<b>int</b> display_get_colordepth <i>()</i><br><br>   Returns the color depth in bits ");
keywords.add("display.display_get_frequency");
 keyworddoc.add("<b>int</b> display_get_frequency <i>()</i><br><br>   Returns the refresh frequency of the display ");
keywords.add("display.display_set_size");
 keyworddoc.add("<b>boolean</b> display_set_size <i>(int w, int h)</i><br><br>   Sets the width and height of the display in pixels Returns whether this was successful (Realize that only certain combinations are allowed.) ");
keywords.add("display.display_set_colordepth");
 keyworddoc.add("<b>boolean</b> display_set_colordepth <i>(int coldepth)</i><br><br>   Sets the color depth In general only 16 and 32 are allowed values Returns whether successful ");
keywords.add("display.display_set_frequency");
 keyworddoc.add("<b>boolean</b> display_set_frequency <i>(double frequency)</i><br><br>   Sets the refresh frequency for the display Only few frequencies are allowed Typically you could set this to 60 with a same room speed to get smooth 60 frames per second motion Returns whether successful ");
keywords.add("display.display_set_all");
 keyworddoc.add("<b>boolean</b> display_set_all <i>(double w, double h, double frequency, double coldepth)</i><br><br>   Sets all at once Returns whether successful ");
keywords.add("display.display_test_all");
 keyworddoc.add("<b>boolean</b> display_test_all <i>(double w, double h, double frequency, double coldepth)</i><br><br>   Tests whether the indicated settings are allowed It does not change the settings Returns whether the settings are allowed ");
keywords.add("display.display_reset");
 keyworddoc.add("<b>void</b> display_reset <i>()</i><br><br>   Resets the display settings to the ones when the program was started ");
keywords.add("display.display_mouse_get_x");
 keyworddoc.add("<b>double</b> display_mouse_get_x <i>()</i><br><br>   Returns the x - coordinate of the mouse on the display < br >  < b > Warning : uses java 1 5 , remove if need lower java version b > ");
keywords.add("display.display_mouse_get_y");
 keyworddoc.add("<b>double</b> display_mouse_get_y <i>()</i><br><br>   Returns the y - coordinate of the mouse on the display  < b > Warning : uses java 1 5 , remove if need lower java version b > ");
keywords.add("display.display_mouse_set");
 keyworddoc.add("<b>void</b> display_mouse_set <i>(double x, double y)</i><br><br>   Sets the position of the mouse on the display to the indicated values ");

 
    }
    
}