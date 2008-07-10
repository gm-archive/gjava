/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.core;

import java.awt.*;
import javax.swing.*;

/**
 * ICore is some kind of listener from more complex events from GPanel
 * @author luis
 */
public interface ICore {
    public void disposeIt();
    public int getExtendedState();
    public void setExtendedState(int state);
    public void setTitle(String title);
    public void setDefaultCloseOperation(int operation);
    public void setJMenuBar(JMenuBar b);
    public void setIconImage(Image i);
    public void pack();
    public Window getParentWindow();
    public void setSize(int width, int height);
}
