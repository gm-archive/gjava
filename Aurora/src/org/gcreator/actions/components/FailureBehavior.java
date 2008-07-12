/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.actions.components;

import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class FailureBehavior {
    public int status = 0;
    
    public FailureBehavior(int status){
        this.status = status;
    }
    
    @Override
    public String toString(){
        if(status==0) return LangSupporter.activeLang.getEntry(237);
        if(status==1) return LangSupporter.activeLang.getEntry(238);
        return LangSupporter.activeLang.getEntry(239);
    }
}
