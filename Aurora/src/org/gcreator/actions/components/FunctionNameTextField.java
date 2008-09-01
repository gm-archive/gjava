/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.components;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author Serge Humphrey
 */
class FunctionNameTextField extends JTextField {

    private static final long serialVersionUID = 1;
    public FunctionNameEditor a;
    
    FunctionNameTextField(FunctionNameEditor a) {
        this.a = a;
        super.setText(getText());
    }
    
    @Override
    public String getText() {
        if (a == null) {
            return "";
        }
        Object o = a.getValue();
        if (o == null) {
            return "null";
        }
        return ((FunctionName)o).name;
    }
    
    @Override
    public void setText(String text) {
        super.setText(text);
        ((FunctionName)a.getValue()).name = text;
    }
    
    @Override
    public void removeNotify() {
        ((FunctionName)a.getValue()).name = super.getText();
    }
}
