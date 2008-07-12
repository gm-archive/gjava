/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */


package org.gcreator.components.codeeditor;

import java.awt.Color;
import org.gcreator.managers.ScriptThemeManager;

/**
 *
 * @author Serge Humphrey
 */
public class GCLKeywordList extends KeywordList {
    private Color darkBlue = new Color(0x0, 0x0, 0xA0);
    private Keyword[] keywords = new Keyword[] {
            new Keyword("var", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("if", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("else", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("while", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("for", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("do", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("switch", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("case", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("default", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("continue", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("break", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("return", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("begin", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("end", ScriptThemeManager.getColors().get("Keywords")),
            new Keyword("true", ScriptThemeManager.getColors().get("Constants")),
            new Keyword("false", ScriptThemeManager.getColors().get("Constants")),
            new Keyword("then", ScriptThemeManager.getColors().get("Keywords"))
        };
    @Override
    public Keyword[] getKeywords() {
        return keywords;
    }

}
