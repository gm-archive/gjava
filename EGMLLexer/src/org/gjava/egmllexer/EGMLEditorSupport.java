/*
 * EGMLEditorSupport.java
 * 
 * Created on 19-Jul-2007, 16:02:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gjava.egmllexer;

import java.io.IOException;
import org.openide.cookies.EditCookie;
import org.openide.cookies.EditorCookie;
import org.openide.cookies.OpenCookie;
import org.openide.cookies.SaveCookie;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.text.DataEditorSupport;

/**
 *
 * @author Administrator
 */
public class EGMLEditorSupport extends DataEditorSupport implements OpenCookie,EditCookie,EditorCookie {
private EGMLEditorSupport(EGMLDataObject obj)
{
    super(obj,new EGMLEnv(obj));
    
}

    
    protected boolean notifyModified() {
        boolean retValue;
        retValue = super.notifyModified();
        if (retValue) {
            EGMLDataObject obj = (EGMLDataObject)getDataObject();
            obj.ic.add(env);
        }
        return retValue;
    }

    
    protected void notifyUnmodified() {
        super.notifyUnmodified();
        EGMLDataObject obj = (EGMLDataObject)getDataObject();
        obj.ic.remove(env);
    }

public static EGMLEditorSupport create(EGMLDataObject obj)
{
    return new EGMLEditorSupport(obj);
}

private static final class EGMLEnv extends DataEditorSupport.Env implements SaveCookie {

    public EGMLEnv(EGMLDataObject obj)
    {
        super(obj);
    }
    
        public void save() throws IOException {
            EGMLEditorSupport ed = (EGMLEditorSupport)this.findCloneableOpenSupport();
            ed.saveDocument();
        }

        protected FileObject getFile() {
            return super.getDataObject().getPrimaryFile();
        }

        protected FileLock takeLock() throws IOException {
            return ((EGMLDataObject)super.getDataObject()).getPrimaryEntry().takeLock();
        }
    
}

}
