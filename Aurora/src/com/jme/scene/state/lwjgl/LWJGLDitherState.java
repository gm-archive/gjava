/*
 * Copyright (c) 2003-2007 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software 
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jme.scene.state.lwjgl;

import org.lwjgl.opengl.GL11;

import com.jme.renderer.RenderContext;
import com.jme.scene.state.DitherState;
import com.jme.scene.state.lwjgl.records.DitherStateRecord;
import com.jme.system.DisplaySystem;

/**
 * <code>LWJGLDitherState</code> subclasses the DitherState using the LWJGL
 * API to set the dithering state of OpenGL.
 * 
 * @author Mark Powell
 * @author Joshua Slack - reworked for StateRecords.
 * @version $Id: LWJGLDitherState.java,v 1.9 2007/04/11 18:27:36 nca Exp $
 */
public class LWJGLDitherState extends DitherState {

	private static final long serialVersionUID = 1L;

	/**
	 * <code>set</code> sets the dithering state on if it is enabled, and sets
	 * it off otherwise.
	 * 
	 * @see com.jme.scene.state.DitherState#apply() ()
	 */
	public void apply() {
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        DitherStateRecord record = (DitherStateRecord) context
                .getStateRecord(RS_DITHER);
        context.currentStates[RS_DITHER] = this;
        
        if (!record.isValid() || record.enabled != isEnabled()) {
    		if (isEnabled()) {
    			GL11.glEnable(GL11.GL_DITHER);
    		} else {
    			GL11.glDisable(GL11.GL_DITHER);
    		}
            record.enabled = isEnabled();
        }
        
        if (!record.isValid())
            record.validate();
	}


    @Override
    public DitherStateRecord createStateRecord() {
        return new DitherStateRecord();
    }
}