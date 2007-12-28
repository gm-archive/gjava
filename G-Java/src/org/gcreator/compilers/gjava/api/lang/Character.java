/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api.lang;

/**
 * The Character class wraps a value of the primitive type char in an object.
 * In addition, this class provides several methods for determining the type of a character and converting characters from uppercase to lowercase and vice versa.
 * @author TGMG
 */
public class Character {

    char c;

    Character(char cc) {
        c = cc;
    }

    /**
     * Returns the value of this Character object as a char primitive.
     * @return
     */
    public char getPrimitive() {
        return c;
    }
    
    /**
     * Determines if the specified character is a digit.
     * @param ch
     * @return
     */
    public static boolean isDigit(char ch) {
        return java.lang.Character.isDigit(ch);
    }
    
    /**
     * Determines if the specified character is a letter.
     * @param ch
     * @return
     */
    public static boolean isLetter(char ch) {
       return java.lang.Character.isLetter(ch);
   }
    
    /**
     * Determines if the specified character is a letter or digit.
     * @param ch
     * @return
     */
    public static boolean isLetterOrDigit(char ch) {
         return java.lang.Character.isLetterOrDigit(ch);
    }
    
    /**
     * Determines if the specified character is a lowercase character.
     * @param ch the character to be tested.
     * @return  <code>true</code> if the character is lowercase;
     *          <code>false</code> otherwise.
     */
    public static boolean 	isLowerCase(char ch)
    {
        return java.lang.Character.isLowerCase(ch);
    }
    
    /**
     * Determines if the specified character is an uppercase character.
     * @param ch the character to be tested.
     * @return  <code>true</code> if the character is uppercase;
     *          <code>false</code> otherwise.
     */
    public static boolean 	isUpperCase(char ch)
    {
        return java.lang.Character.isUpperCase(ch);
    }
   
    /**
     * Determines if the specified character is white space.
     * @param ch
     * @return
     */
    public static boolean 	isWhitespace(char ch)
   {
       return java.lang.Character.isWhitespace(ch);
   }
   
    /**
     * The given character is mapped to its lowercase equivalent; if the character has no lowercase equivalent, the character itself is returned.
     * @param ch
     * @return
     */
    public static char 	toLowerCase(char ch)
   {
       return java.lang.Character.toLowerCase(ch);
   }
   
    /**
     * Converts the character argument to uppercase.
     * @param ch
     * @return
     */
    public static char 	toUpperCase(char ch) {
       return java.lang.Character.toUpperCase(ch);
   }
}
