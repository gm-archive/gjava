/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import javax.swing.*;
import org.gcreator.managers.*;

/**
 *
 * @author luis
 */
public class DefaultToolbarItem extends ToolbarButton{
    public DefaultToolbarItem(String id, ImageIcon img, int lang){
        super(id, LangSupporter.activeLang.getEntry(lang), img);
    }
}
