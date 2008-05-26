/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class IconList extends JComponent{
    private int columns = 3;
    private Vector<IconListElement> elements = new Vector<IconListElement>();
    private Vector<Runnable> onclickRunnables = new Vector<Runnable>();
    private int columnWidth = 120;
    private int columnHeight = 120;
    private int selIndex = 0;
    private int wgap = 10;
    private int hgap = 10;
    private Color selectionColor = Color.BLUE;
    
    public IconList(){
        super();
        addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent evt){}
            public void mouseExited(MouseEvent evt){}
            public void mousePressed(MouseEvent evt){
                mouseAction(evt);
            }
            public void mouseReleased(MouseEvent evt){}
            public void mouseClicked(MouseEvent evt){}
        });
    }
    
    public void mouseAction(MouseEvent evt){
        int x = evt.getX();
        int y = evt.getY();
        int b = evt.getButton();
        if(b!=MouseEvent.BUTTON1)
            return;
        x -= wgap; //Remove initial gaps
        y -= hgap;
        if((x%(columnWidth+wgap))>columnWidth)
            return;
        if((y%(columnHeight+hgap))>columnHeight)
            return;
        x /= (columnWidth+wgap);
        y /= (columnHeight+hgap);
        int t = y*columns + x;
        if(t<countVisibleElements()){
            selIndex = t;
            repaint();
            //updateUI();
        }
        for (Runnable r : onclickRunnables)
            r.run();
    }
    
    public int countVisibleElements(){
        int cf = 0;
        Enumeration<IconListElement> e = elements.elements();
        while(e.hasMoreElements()){
            IconListElement element = e.nextElement();
            if(element.visible)
                cf++;
        }
        return cf;
    }
    
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
    
    public String getSelectedText(){
        return getTextAt(getSelectedIndex(), true);
    }
    
    public Object getSelectedExtraContent(){
        return getExtraContentAt(getSelectedIndex(), true);
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
    
    public void addElement(String text, ImageIcon img, Object plus){
        elements.add(new IconListElement(text, img, plus));
    }
    
    public void removeElement(int i){
        elements.removeElementAt(i);
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
    
    public Object getExtraContentAt(int i){
        return getExtraContentAt(i, false);
    }
    
    public Object getExtraContentAt(int i, boolean visibleonly){
        if(i<0||i>=elements.size())
            return null;
        int x = i;
        if(visibleonly){
            x = 0;
            Enumeration<IconListElement> e = elements.elements();
            while(e.hasMoreElements()){
                if(x==i)
                    return e.nextElement().plus;
                if(e.nextElement().visible==true)
                    x++;
            }
            return null;
        }
        return elements.get(x).plus;
    }
    
    public String getTextAt(int i){
        return getTextAt(i, false);
    }
    
    public String getTextAt(int i, boolean visibleonly){
        if(i<0||i>=elements.size())
            return null;
        int x = i;
        if(visibleonly){
            x = 0;
            Enumeration<IconListElement> e = elements.elements();
            while(e.hasMoreElements()){
                if(x==i)
                    return e.nextElement().text;
                if(e.nextElement().visible==true)
                    x++;
            }
            return null;
        }
        return elements.get(x).text;
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
    
    public void setElementExtraContent(int i, Object plus){
        if(i<0||i>=elements.size())
            return;
        elements.get(i).plus = plus;
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
    
    @Override
    public Dimension getPreferredSize(){
        int rows = calcRows();
        return new Dimension(columnWidth*columns+(columns+1)*Math.max(wgap,1), columnHeight*rows+(rows+1)*Math.max(hgap,1));
    }
    /**
     * Removes all icons in the iconlist.
     */
    public void clear() {
        elements.clear();
    }
    /**
     * Adds a Runnable to the list of runnables that will be ran
     * when a icon on the list is clicked.
     * @param r The Runnable to add.
     */
    public void addRunnable(Runnable r) {
        onclickRunnables.add(r);
    }
    
    public boolean removeRunnable(Runnable r) {
        return onclickRunnables.remove(r);
    }
    private void paintComponent(Graphics g, IconListElement element, int r, int c, int i){
        int wstart = c*columnWidth + (c+1)*wgap;
        int hstart = r*columnHeight + (r+1)*hgap;
        if(i==selIndex){
            g.setColor(Color.BLUE);
            g.drawRect(wstart+1, hstart+1, columnWidth-2, columnHeight-2);
        }
        else
            g.setColor(Color.GRAY);
        g.drawRect(wstart, hstart, columnWidth, columnHeight);
        int imgw = columnWidth-4;
        int imgh = columnHeight-22;
        ImageIcon img = element.img;
        if(img==null)
            return;
        int iconh = img.getIconHeight();
        int iconw = img.getIconWidth();
        if(iconw>=imgw&&iconh>=imgh){
            g.drawImage(img.getImage(), wstart + 2, hstart + 2, imgw, imgh, img.getImageObserver());
        }
        if(iconw>=imgw&&iconh<imgh){
            g.drawImage(img.getImage(), wstart + 2, hstart + 2 + (imgh-iconh)/2, imgw, iconh, img.getImageObserver());
        }
        if(img.getIconWidth()<imgw&&img.getIconHeight()>=imgh){
            g.drawImage(img.getImage(), wstart + 2 + (imgw-iconw)/2, hstart + 2, iconw, imgh, img.getImageObserver());
        }
        if(img.getIconWidth()<imgw&&img.getIconHeight()<imgh){
            g.drawImage(img.getImage(), wstart + 2 + (imgw-iconw)/2, hstart + 2 + (imgh-iconh)/2, iconw, img.getIconHeight(), img.getImageObserver());
        }
        g.drawString(element.text, wstart+3, hstart+imgh+16);
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
    public Object plus = null;
    public IconListElement(){}
    public IconListElement(String text, ImageIcon img, Object plus){
        this.text = text;
        this.img = img;
        this.plus = plus;
    }
}