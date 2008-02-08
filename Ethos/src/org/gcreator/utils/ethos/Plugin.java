/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.utils.ethos;

import java.io.*;
import java.net.*;
import javax.swing.*;

import com.l2fprod.gui.plaf.skin.*;
import org.gcreator.plugins.*;

/**
 * @author Luís Reis
 */
public class Plugin extends PluginCore{
    public Plugin(){}
    
    public void onSplashDispose(){
        try{
            Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
            SkinLookAndFeel.setSkin(
                SkinLookAndFeel.loadThemePack("themepack.zip")
            );
            UIManager.setLookAndFeel(new SkinLookAndFeel());
            UIManager.getLookAndFeelDefaults().put("ClassLoader", getClass().getClassLoader());
            UIManager.getLookAndFeelDefaults().put("ExtendedMenuItemUI", SkinMenuItemUI.class.getName());
            UIManager.getLookAndFeelDefaults().put("MenuItemUI", SkinMenuItemUI.class.getName());
            UIManager.getLookAndFeelDefaults().put("PanelUI", SkinPanelUI.class.getName());
            PluginHelper.updateStyle();
        }
        catch(Exception e){
            PluginHelper.println(e.toString());
        }
    }
}
