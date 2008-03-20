/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.refactoring;

import org.gcreator.fileclass.*;

/**
 * @author Luís Reis
 */
public class DeleteRefactorContext implements RefactorContext{
    private GFile deleted, refactoring;
    
    public DeleteRefactorContext(GFile deleted, GFile refactoring){
        this.deleted = deleted;
        this.refactoring = refactoring;
    }
    
    public GFile getRefactoringFile(){
        return refactoring;
    }
    
    public GFile getModifiedFile(){
        return deleted;
    }
    
    public String getRefactoringDescription(){
        return "A file was deleted.";
    }
}
