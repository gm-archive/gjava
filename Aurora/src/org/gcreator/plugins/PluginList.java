/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.plugins;

import java.io.*;
import java.util.*;

/**
 * A list of multiple plugins
 * @author Luís Reis
 */
public class PluginList {
    public static final String PLUGLIST = "./settings/pluglist";
    /**
     * The plugin list
     */
    public static final PluginList list = new PluginList(PLUGLIST);
    private PluginList(){} //Don't create plugin lists this way
    public PluginList(String location){
        File pluglist = new File(location);
        FileInputStream reader;
        try{
            reader = new FileInputStream(pluglist);
        }
        catch(IOException e){
            return;
        }
        Vector<String> lines = new Vector<String>();
        String curstring = "";
        try{
            while(true){
                int read = reader.read();
                if(read==-1)
                    break;
                if(read=='\n'){
                    lines.add(curstring);
                    curstring = "";
                }
                else{
                    curstring += (char) read;
                }
            }
        }
        catch(IOException e){}
        
    }
    
}
