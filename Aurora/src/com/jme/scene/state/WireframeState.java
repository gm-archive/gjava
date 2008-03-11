/*
 * Copyright (c) 2003-2006 jMonkeyEngine
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

package com.jme.scene.state;

import java.io.IOException;

import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;

/**
 * <code>WireframeState</code> maintains whether a node and it's children
 * should be drawn in wireframe or solid fill. By default all nodes are
 * rendered solid.
 *
 * @author Mark Powell
 * @version $Id: WireframeState.java,v 1.12 2006/11/16 17:02:15 nca Exp $
 */
public abstract class WireframeState extends RenderState {

    /** Both sides of the model are wireframed. */
    public static final int WS_FRONT_AND_BACK = 0;
    /** The front will be wireframed, but the back will be solid. */
    public static final int WS_FRONT = 1;
    /** The back will be wireframed, but the front will be solid. */
    public static final int WS_BACK = 2;

    /** Default wireframe of front and back. */
    protected int face = WS_FRONT_AND_BACK;
    /** Default line width of 1 pixel. */
    protected float lineWidth = 1.0f;
    /** Default line style */
    protected boolean antialiased = false;

    /**
     * <code>getType</code> returns the type of render state this is.
     * (RS_WIREFRAME).
     * @see com.jme.scene.state.RenderState#getType()
     */
    public int getType() {
        return RS_WIREFRAME;
    }

    /**
     * <code>setLineWidth</code> sets the width of lines the wireframe
     * is drawn in. Attempting to set a line width smaller than 0.0
     * throws an <code>IllegalArgumentException</code>.
     * @param width the line width, in pixels
     */
    public void setLineWidth(float width){
        if (width < 0.0f)
            throw new IllegalArgumentException("Line width must be positive");

        lineWidth = width;
        setNeedsRefresh(true);
    }

    /**
     * Returns the current lineWidth.
     * @return the current LineWidth
     */
    public float getLineWidth(){
        return lineWidth;
    }

    /**
     * <code>setFace</code> sets which face will recieve the wireframe.  One of WS_FRONT_AND_BACK,
     * WS_FRONT, or WS_BACK
     * @param face The flag signaling which face will recieve the wireframe.
     */
    public void setFace(int face){
        this.face = face;
        setNeedsRefresh(true);
    }

    /**
     * Returns the face state of this wireframe state.
     * @return The face state (one of WS_FRONT, WS_BACK, or WS_FRONT_AND_BACK)
     */
    public int getFace() {
        return face;
    }
    
    /**
	 * Set whether this wireframe should use antialiasing when drawing lines. May
	 * decrease performance. If you want to enabled antialiasing, you should
	 * also use an alphastate with a source of SB_SRC_ALPHA and a destination of
	 * DB_ONE_MINUS_SRC_ALPHA or DB_ONE. 
	 * 
	 * @param antialiased
	 *            true for using smoothed antialiased lines.
	 */
	public void setAntialiased(boolean antialiased) {
		this.antialiased = antialiased;
        setNeedsRefresh(true);
	}
	/**
	 * @return whether this wireframe uses antialiasing for drawing lines.
	 */
	public boolean isAntialiased() {
		return antialiased;
	}
    
    public void write(JMEExporter e) throws IOException {
        super.write(e);
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(face, "face", WS_FRONT_AND_BACK);
        capsule.write(lineWidth, "lineWidth", 1);
        capsule.write(antialiased, "antialiased", false);
    }

    public void read(JMEImporter e) throws IOException {
        super.read(e);
        InputCapsule capsule = e.getCapsule(this);
        face = capsule.readInt("face", WS_FRONT_AND_BACK);
        lineWidth = capsule.readFloat("lineWidth", 1);
        antialiased = capsule.readBoolean("antialiased", false);
    }
    
    public Class getClassTag() {
        return WireframeState.class;
    }
}