/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.filechooser.*;

/**
 * CustomFileFilter is a file filter designed to show only some files(but all folders).
 * This class was once based on Lateral Game Maker CustomFileFilter but was rewritten
 * completelly to be compatible with G-Creator's license.
 * @author Luís Reis
 */
public class CustomFileFilter extends FileFilter implements FilenameFilter{
    private String format = "";
    private String description = "";
    
    /**
     * Creates a new custom file filter
     * @param format The accepted format
     * @param description The file filter description
     */
    public CustomFileFilter(String format, String description){
        this.format = format;
        this.description = description;
    }
    
    /**
     * Gets the accepted file format
     * @return The accepted file format
     */
    public String getAcceptedFormat(){
        return format;
    }
    
    /**
     * Sets the accepted file format
     * @param format The accepted file format
     */
    public void setAcceptedFormat(String format){
        this.format = format;
    }
    
    /**
     * Gets the description of the file filter
     * @return The description of the file filter
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Sets the description of the file filter
     * @param description The description of the filter
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * Asks if a file is accepted by the filter.
     * This function returns true with any folder, plus any file
     * ending in .FORMAT. Format is chosen with setAcceptedFormat
     * @param file The File to be evaluated
     * @return If the file should be visible
     */
    public boolean accept(File file){
        if(file.isDirectory())
            return true;
        if(file.getAbsolutePath().endsWith(format)){
            return true;
        }
        return false;
    }
    
    /**
     * Asks if a file is accepted by the filter.
     * This function returns true with any folder, plus any file
     * ending in .FORMAT. Format is chosen with setAcceptedFormat
     * @param dir The directory where the file is
     * @param name The file name
     * @return If the file should be visible
     */
    public boolean accept(File dir, String name){
        System.out.println(name);
        if(name.endsWith("." + format))
            return true;
        return false;
    }
}
