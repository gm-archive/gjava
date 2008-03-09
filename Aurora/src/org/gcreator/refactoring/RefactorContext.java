/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.refactoring;

/**
 * @author Luís Reis
 */
public interface RefactorContext {
    public org.gcreator.fileclass.File getModifiedFile();
    public org.gcreator.fileclass.File getRefactoringFile();
    public String getRefactoringDescription();
}
