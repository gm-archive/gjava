/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import java.util.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;

/**
 *
 * @author luis
 */
public class ToolbarManager {
    public static Vector<Toolbar> toolbars = new Vector<Toolbar>();
    public static Vector<ToolbarButton> toolbuttons = new Vector<ToolbarButton>();
    
    public static void destroyToolbars(){
        gcreator.window.topContainer.removeAll();
        gcreator.window.bottomContainer.removeAll();
        gcreator.window.leftContainer.removeAll();
        gcreator.window.rightContainer.removeAll();
    }
    public static void makeToolbars(Aurwindow window){
        for(Toolbar toolbar : toolbars){
            toolbar.make(window);
        }
    }
    public static void makeToolbars(){
        makeToolbars(gcreator.window);
    }
    public static void remakeToolbars(){
        destroyToolbars();
        makeToolbars();
    }
}
