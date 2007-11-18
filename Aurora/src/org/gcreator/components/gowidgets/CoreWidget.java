/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.gowidgets;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public abstract class CoreWidget implements VisualWidget{
    private int borderwidth = 1;
    protected GoManager go = null;
    private boolean closable = true;
    private String text = "";
    private ImageIcon img = null;
    private boolean icon = false;
    private boolean iconizable = true;
    
    public void setBorderWidth(int border){
        borderwidth = border;
    }
    
    public int getBorderWidth(){
        return borderwidth;
    }
    
    public GoManager getGoManager(){
        return go;
    }
    
    public void close(){
        if(go!=null)
            go.removeWidget(this);
    }
    
    public boolean isClosable(){
        return closable;
    }
    
    public void setClosable(boolean closable){
        this.closable = closable;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void setImage(ImageIcon img){
        this.img = img;
    }
    
    public ImageIcon getImage(){
        return img;
    }
    
    public void setIcon(boolean icon){
        this.icon = icon;
    }
    
    public boolean isIcon(){
        return icon;
    }
    
    public void setIconizable(boolean iconizable){
        this.iconizable = iconizable;
    }
    
    public boolean isIconizable(){
        return iconizable;
    }
}
