/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.refactoring;

import java.util.*;

import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 * @author Luís Reis
 */
public class TilesetDropImageMethod implements RefactoringMethod{
    public TilesetDropImageMethod(){
        
    }
    
    public boolean accepts(RefactorContext context){
        if(!(context instanceof DeleteRefactorContext))
            return false;
        DeleteRefactorContext delc = (DeleteRefactorContext) context;
        if(delc.getRefactoringFile()==null||!delc.getRefactoringFile().type.equals("tileset"))
            return false;
        if(delc.getModifiedFile()==null)
            return false;
        if(!delc.getModifiedFile().type.equals("gif")&&
                !delc.getModifiedFile().type.equals("jpg")&&
                !delc.getModifiedFile().type.equals("png"))
            return false;
        return true;
    }
    
    public void refactor(RefactorContext context){
        if(!(context instanceof DeleteRefactorContext))
            return;
        DeleteRefactorContext delc = (DeleteRefactorContext) context;
        GFile refactoring = delc.getRefactoringFile();
        GFile deleted = delc.getModifiedFile();
        if(refactoring==null||deleted==null)
            return;
        Tileset tileset = (Tileset) refactoring.value;
        if(tileset==null)
            return;
        if(tileset.image==deleted)
            tileset.image = null;
    }
}
