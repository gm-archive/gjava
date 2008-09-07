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

/**
 *
 * @author Serge Humphrey
 */
class VariableNameTextField extends JTextField {

    private static final long serialVersionUID = 1;
    public VariableNameEditor a;
    
    VariableNameTextField(VariableNameEditor a) {
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
        return ((VariableName)o).name;
    }
    
    @Override
    public void setText(String text) {
        super.setText(text);
        ((VariableName)a.getValue()).name = text;
    }
    
    @Override
    public void removeNotify() {
        ((VariableName)a.getValue()).name = super.getText();
    }
}
