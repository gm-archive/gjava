/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.actions;

import java.util.*;
import javax.swing.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís Reis
 */
public class ActionContainer {
    public static Vector<ActionCategory> actionCats = new Vector<ActionCategory>();
    static {
        ActionCategory main = new ActionCategory();
        //ActionCategory move = new ActionCategory();
        //ActionCategory scenes = new ActionCategory();
        //ActionCategory draw2D = new ActionCategory();
        //ActionCategory clipboard = new ActionCategory();
        //ActionCategory platform = new ActionCategory();
        main.add(new org.gcreator.actions.mainactions.StartOfABlock());
        main.add(new org.gcreator.actions.mainactions.EndOfABlock());
        main.add(new org.gcreator.actions.mainactions.Comment());
        main.add(new org.gcreator.actions.mainactions.ExecuteCode());
        main.name = LangSupporter.activeLang.getEntry(199);
        main.icon = new ImageIcon(ActionContainer.class.getResource("/org/gcreator/actions/images/Main.png"));
        //move.add(new org.gcreator.actions.mainactions.SetHSpeed());
        //move.add(new org.gcreator.actions.mainactions.SetVSpeed());
        //move.add(new org.gcreator.actions.mainactions.WarpTo());
        //move.name = LangSupporter.activeLang.getEntry(200);
        //move.icon = new ImageIcon(ActionContainer.class.getResource("/org/gcreator/actions/images/hspeed.png"));
        //scenes.add(new org.gcreator.actions.mainactions.NextScene());
        //scenes.add(new org.gcreator.actions.mainactions.PreviousScene());
        //scenes.name = LangSupporter.activeLang.getEntry(208);
        //scenes.icon = new ImageIcon(ActionContainer.class.getResource("/org/gcreator/actions/images/Scene.png"));
        //draw2D.add(new org.gcreator.actions.mainactions.AddImageToSprite());
        //draw2D.name = LangSupporter.activeLang.getEntry(201);
        //draw2D.icon = new ImageIcon(ActionContainer.class.getResource("/org/gcreator/actions/images/Draw2D.png"));
        //clipboard.name = LangSupporter.activeLang.getEntry(202);
        //clipboard.icon = new ImageIcon(ActionContainer.class.getResource("/org/gcreator/resources/general/paste.png"));
        //clipboard.add(new org.gcreator.actions.mainactions.IfClipboardHasContent());
        //platform.name = LangSupporter.activeLang.getEntry(203);
        //platform.add(new org.gcreator.actions.platform.CmdAction());
        actionCats.add(main);
        //actionCats.add(move);
        //actionCats.add(scenes);
        //actionCats.add(draw2D);
        //actionCats.add(clipboard);
        //actionCats.add(platform);
    }
}
