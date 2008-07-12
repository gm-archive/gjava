/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author luis
 */
public class ToolbarButton extends ToolbarItem{
    private String id = null;
    private String text = null;
    private ImageIcon image = null;
    private ActionListener actionlistener = null;
    private boolean showImage = false;
    private boolean showText = false;
    private boolean bold = false;
    
    /**
     * Builds a new toolbar button with no text nor image
     */
    public ToolbarButton(){
    }
    
    /**
     * Builds a new toolbar button with a given name and image
     * @param text The text of the toolbar button
     * @param image The image of the toolbar button
     */
    public ToolbarButton(String id, String text, ImageIcon image){
        setID(id);
        setText(text);
        setImage(image);
        if(image!=null)
            showImage = true;
        else if(text!=null)
            showText = true;
    }
    
    /**
     * Gets the text of the toolbar button
     * @return The text of the toolbar button
     */
    public String getText(){
        return text;
    }
    
    /**
     * Sets the text of the toolbar button
     * @param text The text of the toolbar button
     */
    public void setText(String text){
        this.text = text;
    }
    
    /**
     * Gets the name/ID of the toolbar button
     * @return The name/ID of the toolbar button
     */
    public String getID(){
        return id;
    }
    
    /**
     * Sets the name/ID of the toolbar button
     * @param id The name/ID of the toolbar button
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
     * Sets whether the text should be bold or not
     * @param visible True to bold, false to standard
     */
    public void setBold(boolean bold){
        this.bold = bold;
    }
    
    /**
     * Checks if the text is visible or not
     * @return True if the text is visible, false otherwise
     */
    public boolean isTextVisible(){
        return showText;
    }
    
    /**
     * Checks if the image is visible or not
     * @return True if the image is visible, false otherwise
     */
    public boolean isImageVisible(){
        return showImage;
    }
    
    /**
     * Checks if the text should be bold or not
     * @return True if the text is bold, false otherwise
     */
    public boolean isBold(){
        return bold;
    }
    
    public void paint(Graphics g, int x, int height){
        
    }
    
    /**
     * @todo
     */
    public int getWidth(){
        int size = 0;
        if(isImageVisible())
            size += image.getIconWidth();
        if(isTextVisible()){
            size += (int) (new JLabel(text)).getPreferredSize().getWidth();
        }
        return size;
    }
    
    /**
     * @todo
     */
    public int getHeight(){
        int size = 0;
        if(isImageVisible())
            size += image.getIconHeight();
        if(isTextVisible()){
            size += (int) (new JLabel(text)).getPreferredSize().getHeight();
        }
        return size;
    }
    
    public ActionListener getActionListener(){
        return actionlistener;
    }
    public void setActionListener(ActionListener alisten){
        actionlistener = alisten;
    }
}
