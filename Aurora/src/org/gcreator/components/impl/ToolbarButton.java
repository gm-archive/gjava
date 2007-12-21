/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import javax.swing.*;

/**
 *
 * @author luis
 */
public class ToolbarButton{
    private String id = null; //Invalid
    private String name = null;
    private ImageIcon image = null;
    private boolean showImage, showText;
    
    /**
     * Builds a new toolbar button with no name nor image
     */
    public ToolbarButton(){
        showText = false;
        showImage = false;
    }
    
    /**
     * Builds a new toolbar button with a given name and image
     * @param name The name of the toolbar button
     * @param image The image of the toolbar button
     */
    public ToolbarButton(String id, String name, ImageIcon image){
        setID(id);
        setName(name);
        setImage(image);
        showImage = false;
        showText = false;
        if(image!=null)
            showImage = true;
        else if(name!=null)
            showText = true;
    }
    
    /**
     * Gets the name of the toolbar button
     * @return The name of the toolbar button
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the name of the toolbar button
     * @param name The name of the toolbar button
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Gets the name of the toolbar button
     * @return The name of the toolbar button
     */
    public String getID(){
        return id;
    }
    
    /**
     * Sets the id of the toolbar button
     * @param id The ID of the toolbar button
     */
    public void setID(String id){
        this.id = id;
    }
    
    /**
     * Gets the image of the toolbar button
     * @return The image of the toolbar button
     */
    public ImageIcon getImage(){
        return image;
    }
    
    /**
     * Sets the image of the toolbar button
     * @param name The image of the toolbar button
     */
    public void setImage(ImageIcon image){
        this.image = image;
    }
    
    /**
     * Sets whether the text should be visible or not
     * @param visible True to show the text, False to hide it
     */
    public void setTextVisible(boolean visible){
        showText = visible;
    }
    
    /**
     * Sets whether the image should be visible or not
     * @param visible True to show the image, False to hide it
     */
    public void setImageVisible(boolean visible){
        showImage = visible;
    }
    
    /**
     * Checks if the text is visible or not
     * @return True if the text is visible, false otherwise
     */
    public boolean getTextVisible(){
        return showText;
    }
    
    /**
     * Checks if the image is visible or not
     * @return True if the image is visible, false otherwise
     */
    public boolean getImageVisible(){
        return showImage;
    }
}
