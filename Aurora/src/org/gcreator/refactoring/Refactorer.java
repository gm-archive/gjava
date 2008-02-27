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

/**
 * @author Luís Reis
 */
public class Refactorer {
    private static Vector<RefactoringMethod> collection =
            new Vector<RefactoringMethod>();
    
    public static void addRefactoringMethod(RefactoringMethod method){
        collection.add(method);
    }
    
    public static RefactoringMethod getRefactoringMethod(org.gcreator.fileclass.File file){
        if(file==null)
            return null;
        for(RefactoringMethod m : collection){
            if(m.accepts(file.type, file.value.getClass().getName()))
                return m;
        }
        return null;
    }
}
