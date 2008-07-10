/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.uiplus;

import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author luis
 */
public class FramePlus extends JFrame{
    private float alpha = 1.0f;
    public FramePlus(){
        setContentPane(new JPanel());
    }
    public void setWindowMask(Icon mask){
        com.sun.jna.examples.WindowUtils.setWindowMask(this, mask);
    }
    public void setDoubleBuffered(boolean b){
        Container c = getContentPane();
        try{
        c.getClass().getMethod("setDoubleBuffered", Boolean.TYPE).invoke(c, b);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void setWindowAlpha(float alpha){
        com.sun.jna.examples.WindowUtils.setWindowAlpha(this, alpha);
        this.alpha = alpha;
    }
    
    public float getWindowAlpha(){
        return alpha;
    }
    
    public void fadeOut(){
        fadeOut(5);
    }
    
    public void setVisible(boolean b){
        super.setVisible(b);
        if(b)
            setWindowAlpha(alpha);
    }
    
    public void fadeOut(final long delay){
        Thread t = new Thread(){
            @Override
            public void run(){
                if(com.sun.jna.examples.WindowUtils.isWindowAlphaSupported()){
                    while(alpha>=0.01){
                        alpha-=0.01;
                        if(isVisible())
                            setWindowAlpha(alpha);
                        try{
                            sleep(delay);
                        }
                        catch(Exception e){
                            System.out.println(e.toString());
                        }
                    }
                    dispose();
                }
                else{
                    dispose();
                }
            }
        };
        t.start();
    }
}
