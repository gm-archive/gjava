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

/**
 *
 * @author Serge Humphrey
 */
public class GCLKeywordList extends KeywordList {
    private Color darkBlue = new Color(0x0, 0x0, 0xA0);
    private Keyword[] keywords = new Keyword[] {
            new Keyword("string", Color.BLUE),
            new Keyword("var", Color.BLUE),
            new Keyword("boolean", Color.BLUE),
            new Keyword("break", Color.BLUE),
            new Keyword("byte", Color.BLUE),
            new Keyword("case", Color.BLUE),
            new Keyword("catch", Color.BLUE),
            new Keyword("char", Color.BLUE),
            new Keyword("repeat", Color.BLUE),
            new Keyword("const", Color.BLUE),
            new Keyword("continue", Color.BLUE),
            new Keyword("default", Color.BLUE),
            new Keyword("do", Color.BLUE),
            new Keyword("double", Color.BLUE),
            new Keyword("else", Color.BLUE),
            new Keyword("final", Color.BLUE),
            new Keyword("finally", Color.BLUE),
            new Keyword("float", Color.BLUE),
            new Keyword("for", Color.BLUE),
            new Keyword("goto", Color.BLUE),
            new Keyword("if", Color.BLUE),
            new Keyword("import", Color.BLUE),
            new Keyword("instanceof", Color.BLUE),
            new Keyword("int", Color.BLUE),
            new Keyword("long", Color.BLUE),
            new Keyword("native", Color.BLUE),
            new Keyword("new", Color.BLUE),
            new Keyword("return", Color.BLUE),
            new Keyword("short", Color.BLUE),
            new Keyword("static", Color.BLUE),
            new Keyword("strictfp", Color.BLUE),
            new Keyword("super", Color.BLUE),
            new Keyword("switch", Color.BLUE),
            new Keyword("synchronized", Color.BLUE),
            new Keyword("this", Color.BLUE),
            new Keyword("throw", Color.BLUE),
            new Keyword("try", Color.BLUE),
            new Keyword("void", Color.BLUE),
            new Keyword("volatile", Color.BLUE),
            new Keyword("while", Color.BLUE),
            //Constants
            new Keyword("true", Color.RED),
            new Keyword("false", Color.RED),
            new Keyword("null", Color.RED),
            //Methods
            new Keyword("show_message", darkBlue, true),
            //colors
            new Keyword("blue", Color.blue),
            new Keyword("red", Color.red),
            new Keyword("green", Color.green),
            new Keyword("orange", Color.orange),
            new Keyword("purple", new Color(0x800080)),
            new Keyword("yellow", Color.yellow),
            new Keyword("pink", Color.pink),
            new Keyword("black", Color.black),
            new Keyword("white", Color.white),
            new Keyword("gray", Color.gray),
            new Keyword("light_gray", Color.lightGray),
            new Keyword("dark_gray", Color.darkGray),
            new Keyword("cyan", Color.CYAN),
            new Keyword("magenta", Color.MAGENTA)
        };
    @Override
    public Keyword[] getKeywords() {
        return keywords;
    }

}
