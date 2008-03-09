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
public interface RefactoringMethod {
    public boolean accepts(RefactorContext context);
    public void refactor(RefactorContext context);
}
