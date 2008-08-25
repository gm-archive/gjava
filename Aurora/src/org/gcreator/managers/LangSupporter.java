/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

/**
 * @deprecated No longer works. Will print stack trace to make removal easier
 * @author Luis Reis
 */
public class LangSupporter {
    public static class X{
        public String getEntry(int i){
            System.out.println("Using LangSupporter. Printing Stack Trace");
            (new Exception()).printStackTrace();
            return "$" + i;
        }
    }
    public static X activeLang = new X();
}
