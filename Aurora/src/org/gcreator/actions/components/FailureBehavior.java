/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
