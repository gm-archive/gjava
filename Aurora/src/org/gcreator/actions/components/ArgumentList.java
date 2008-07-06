/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.actions.components;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 *
 * @author Luís
 */
public class ArgumentList implements Serializable{

    public Vector<String> arguments = new Vector<String>();

    @Override
    public String toString() {
        String res = "";
        try {
            String last = arguments.lastElement();
            for (String arg : arguments) {
                res += arg;
                if (arg!=last) { //I KNOW I'M NOT USING equals
                    res += ", ";
                }
            }
            return res;
        } catch (NoSuchElementException e) {
            return "";
        }
    }
}
