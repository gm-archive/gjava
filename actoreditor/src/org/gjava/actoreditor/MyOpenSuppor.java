/*
 * ActorOpenCookie.java
 *
 * Created on 04 March 2007, 21:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor;

import org.openide.cookies.OpenCookie;

/**
 *
 * @author ali1
 */
public class ActorOpenCookie implements OpenCookie
{
    
    /** Creates a new instance of ActorOpenCookie */
    public ActorOpenCookie()
    {
    }
    
    public void open() {
       System.out.print("hey,hey");
    }

}
