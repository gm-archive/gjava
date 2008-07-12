/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import java.util.*;
import org.gcreator.units.*;

/**
 *
 * @author luis
 */
public class Structure implements Resource{
    static final long serialVersionUID = 1L;
    public Vector<StructureField> structures = new Vector<StructureField>();
    
    public Resource clone(){
        Structure res = new Structure();
        for(StructureField field : res.structures)
            res.structures.add(field.clone());
        return res;
    }
    
    public String exportToHtml(boolean xhtml){
        return "";
    }
}
