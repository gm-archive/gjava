/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class IconList extends JComponent{
    private int columns = 3;
    private Vector<IconListElement> elements = new Vector<IconListElement>();
    private int columnWidth = 100;
    private int columnHeight = 100;
    private int selIndex = 0;
    private int wgap = 10;
    private int hgap = 10;
    private Color selectionColor = Color.BLUE;
    
    public Color getSelectionColor(){
        return selectionColor;
    }
    
    public void setSelectionColor(Color selectionColor){
        this.selectionColor = selectionColor;
        updateUI();
    }
    
    public int getWidthGap(){
        return wgap;
    }
    
    public int getHeightGap(){
        return hgap;
    }
    
    public void setWidthGap(int wgap){
        this.wgap = wgap;
        updateUI();
    }
    
    public void setHeightGap(int hgap){
        this.hgap = hgap;
        updateUI();
    }
    
    public int getSelectedIndex(){
        return selIndex;
    }
    
    public void setSelectedIndex(int index){
        selIndex = index;
        updateUI();
    }
    
    public int getColumnWidth(){
        return columnWidth;
    }
    
    public int getColumnHeight(){
        return columnHeight;
    }
    
    public void setColumnWidth(int dim){
        columnWidth = dim;
        updateUI();
    }
    
    public void setColumnHeight(int dim){
        columnHeight = dim;
        updateUI();
    }
    
    public void addElement(String text, ImageIcon img){
        elements.add(new IconListElement(text, img));
    }
    
    public void removeElement(int i){
        elements.remove(i);
        elements.trimToSize();
        updateUI();
    }
    
    public int getColumns(){
        return columns;
    }
    
    public void setColumns(int columns){
        this.columns = columns;
        updateUI();
    }
    
    public String getTextAt(int i){
        if(i<0||i>=elements.size())
            return null;
        return elements.get(i).text;
    }
    
    public ImageIcon getImageAt(int i){
        if(i<0||i>=elements.size())
            return null;
        return elements.get(i).img;
    }
    
    public boolean isElementVisible(int i){
        if(i<0||i>=elements.size())
            return false;
        return elements.get(i).visible;
    }
    
    public boolean elementExists(int i){
        if(i<0||i>=elements.size())
            return false;
        return true;
    }
    
    public void setElementVisible(int i, boolean visible){
        if(i<0||i>=elements.size())
            return;
        elements.get(i).visible = visible;
        updateUI();
    }
    
    public void setElementText(int i, String text){
        if(i<0||i>=elements.size())
            return;
        elements.get(i).text = text;
        updateUI();
    }
    
    public void setElementImage(int i, ImageIcon img){
        if(i<0||i>=elements.size())
            return;
        elements.get(i).img = img;
        updateUI();
    }
    
    public int calcRows(){
        int cf = 0;
        Enumeration<IconListElement> e = elements.elements();
        while(e.hasMoreElements()){
            IconListElement element = e.nextElement();
            if(element.visible)
                cf++;
        }
        if(cf%columns!=0)
            return cf/columns + 1;
        else
            return cf/columns;
    }
    
    public Dimension getPreferredSize(){
        int rows = calcRows();
        return new Dimension(columnWidth*columns+((columns+1)*wgap), columnHeight*rows+((rows+1)*hgap));
    }
    
    private void paintComponent(Graphics g, IconListElement element, int r, int c, int i){
        int wstart = c*columnWidth + (c+1)*wgap;
        int hstart = r*columnHeight + (r+1)*hgap;
        if(i==selIndex)
            g.setColor(Color.BLUE);
        else
            g.setColor(Color.GRAY);
        g.drawRect(wstart, hstart, columnWidth, columnHeight);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        int r = 0;
        int c = 0;
        int i = 0;
        Enumeration<IconListElement> e = elements.elements();
        while(e.hasMoreElements()){
            IconListElement element = e.nextElement();
            if(element.visible){
                paintComponent(g, element, r, c, i);
                c++;
                if(c>=columns){
                    c-=columns;
                    r++;
                }
            }
            i++;
        }
    }
}

class IconListElement{
    public String text = "";
    public ImageIcon img = null;
    public boolean visible = true;
    public IconListElement(){}
    public IconListElement(String text, ImageIcon img){
        this.text = text;
        this.img = img;
    }
}