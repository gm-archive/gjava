/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.util.*;
import org.gcreator.units.*;

/**
 *
 * @author luis
 */
public class Structure extends Resource{
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
