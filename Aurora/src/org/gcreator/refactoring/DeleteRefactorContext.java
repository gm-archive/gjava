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
    private File deleted, refactoring;
    
    public DeleteRefactorContext(File deleted, File refactoring){
        this.deleted = deleted;
        this.refactoring = refactoring;
    }
    
    public File getRefactoringFile(){
        return refactoring;
    }
    
    public File getModifiedFile(){
        return deleted;
    }
    
    public String getRefactoringDescription(){
        return "A file was deleted.";
    }
}
