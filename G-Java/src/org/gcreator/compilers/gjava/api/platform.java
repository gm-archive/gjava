/*
 * platform.java
 * 
 * Created on 11-Sep-2007, 04:13:49
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

public class platform {

        public static String get_os_name() {
            return System.getProperty("os.name");
        }
    }
