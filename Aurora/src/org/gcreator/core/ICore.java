/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
