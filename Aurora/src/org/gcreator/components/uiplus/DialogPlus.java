/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.uiplus;

import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author luis
 */
public class DialogPlus extends JDialog{
    private float alpha = 1.0f;
    public DialogPlus(){
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
    
    public void setWindowAlpha(float alpha) {
        try {
            com.sun.jna.examples.WindowUtils.setWindowAlpha(this, alpha);
            this.alpha = alpha;
        } catch (Exception exc) {
            System.err.println("Exception Caught. Message: "+exc/*+"\nStack Trace:"*/);
        //    exc.printStackTrace();
        }
    }
    
    public float getWindowAlpha(){
        return alpha;
    }
    
    public void fadeOut(){
        fadeOut(5);
    }
    
    public void fadeOut(final long delay){
        System.out.println(com.sun.jna.examples.WindowUtils.isWindowAlphaSupported());
        Thread t = new Thread(){
            @Override
            public void run(){
                try{
                if(com.sun.jna.examples.WindowUtils.isWindowAlphaSupported()){
                    while(alpha>0){
                        alpha-=0.01;
                        if(isVisible()) {
                            setWindowAlpha(alpha);
                        }
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
                catch(Exception e){}
            }
        };
        t.start();
    }
}
