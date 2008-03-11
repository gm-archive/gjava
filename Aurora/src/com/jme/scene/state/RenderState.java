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
import java.io.Serializable;
import java.util.Arrays;
import java.util.Stack;

import com.jme.scene.SceneElement;
import com.jme.scene.state.lwjgl.records.StateRecord;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;
import com.jme.util.export.Savable;

/**
 * <code>RenderState</code> is the base class for all states that affect the
 * rendering of a piece of geometry. They aren't created directly, but are
 * created for users from the renderer. The renderstate of a parent affects its
 * children and it is OK to assign to more than one Spatial the same render
 * state.
 * 
 * @author Mark Powell
 * @author Joshua Slack
 * @author Jack Lindamood (javadoc only)
 * @version $Id: RenderState.java,v 1.31 2006/11/19 00:41:36 renanse Exp $
 */
public abstract class RenderState implements Serializable, Savable {

	/** The value returned by getType() for AlphaState. */
	public final static int RS_ALPHA = 0;

	/** The value returend by getType() for DitherState. */
	public final static int RS_DITHER = 1;

	/** The value returned by getType() for FogState. */
	public final static int RS_FOG = 2;

	/** The value returned by getType() for LightState. */
	public final static int RS_LIGHT = 3;

	/** The value returend by getType() for MaterialState. */
	public final static int RS_MATERIAL = 4;

	/** The value returned by getType() for ShadeState. */
	public final static int RS_SHADE = 5;

	/** The value returned by getType() for TextureState. */
	public final static int RS_TEXTURE = 6;

	/** The value returned by getType() for WireframeState. */
	public final static int RS_WIREFRAME = 7;

	/** The value returned by getType() for ZBufferState. */
	public final static int RS_ZBUFFER = 8;

	/** The value returned by getType() for CullState. */
	public final static int RS_CULL = 9;

	/** The value returned by getType() for VertexProgramState. */
	public final static int RS_VERTEX_PROGRAM = 10;

	/** The value returned by getType() for FragmentProgramState. */
	public final static int RS_FRAGMENT_PROGRAM = 11;

	/** The value returned by getType() for AttributeState. */
	public final static int RS_ATTRIBUTE = 12;

	/** The value returned by getType() for StencilState. */
	public final static int RS_STENCIL = 13;
	
	/** The value returned by getType() for ShaderObjectsState. */
	public final static int RS_GLSL_SHADER_OBJECTS = 14;

    /** The value returned by getType() for ColorMaskState. */    
    public static final int RS_COLORMASK_STATE = 15; 

    /** The value returned by getType() for ClipState. */
    public static final int RS_CLIP = 16;

    /** The total number of diffrent types of RenderState. */
    public final static int RS_MAX_STATE = 17;

    /**
     * <p>
     * If false, each renderstate of that type is always applied in the renderer
     * and only field by field checks are done to minimize jni overhead. This is
     * slower than setting to true, but relieves the programmer from situations
     * where he has to remember to update the needsRefresh field of a state.
     * </p>
     * <p>
     * If true, each renderstate of that type is checked for == with the last
     * applied renderstate of the same type. If same and the state's
     * needsRefresh method returns false, then application of the renderstate is
     * skipped. This can be much faster than setting false, but in certain
     * circumstances, the programmer must manually set needsRefresh (for
     * example, in a FogState, if you call getFogColor().set(....) to change the
     * color, the fogstate will not set the needsRefresh field. In non-quick
     * compare mode, this is not a problem because it will go into the apply
     * method and do an actual check of the current fog color in opengl vs. the
     * color in the state being applied.)
     * </p>
     * <p>
     * DEFAULTS:
     * <ul>
     * <li>RS_ALPHA: true</li>
     * <li>RS_DITHER: true</li>
     * <li>RS_FOG: false</li>
     * <li>RS_LIGHT: false</li>
     * <li>RS_MATERIAL: false</li>
     * <li>RS_SHADE: true</li>
     * <li>RS_TEXTURE: false</li>
     * <li>RS_WIREFRAME: false</li>
     * <li>RS_ZBUFFER: true</li>
     * <li>RS_CULL: false (temp)</li>
     * <li>RS_VERTEX_PROGRAM: true</li>
     * <li>RS_FRAGMENT_PROGRAM: true</li>
     * <li>RS_ATTRIBUTE: true</li>
     * <li>RS_STENCIL: true</li>
     * <li>RS_GLSL_SHADER_OBJECTS: true</li>
     * <li>RS_COLORMASK_STATE: true</li>
     * <li>RS_CLIP: true</li>
     * </ul>
     */
    public static boolean[] QUICK_COMPARE = new boolean[RS_MAX_STATE];
    static {
        QUICK_COMPARE[RS_ALPHA] = true;
        QUICK_COMPARE[RS_DITHER] = true;
        QUICK_COMPARE[RS_FOG] = false; // false because you can change the fog color object directly without telling the state
        QUICK_COMPARE[RS_LIGHT] = false; // false because you can change a light object directly without telling the state
        QUICK_COMPARE[RS_MATERIAL] = false; // false because you can change a material color object directly without telling the state
        QUICK_COMPARE[RS_SHADE] = true;
        QUICK_COMPARE[RS_TEXTURE] = false; // false because you can change a texture object directly without telling the state
        QUICK_COMPARE[RS_WIREFRAME] = false; // false by default because line attributes can change when drawing lines
        QUICK_COMPARE[RS_ZBUFFER] = true;
        QUICK_COMPARE[RS_CULL] = false; // false because of flippable cull.  Once we change that, this can be true.
        QUICK_COMPARE[RS_VERTEX_PROGRAM] = true;
        QUICK_COMPARE[RS_FRAGMENT_PROGRAM] = true;
        QUICK_COMPARE[RS_ATTRIBUTE] = true;
        QUICK_COMPARE[RS_STENCIL] = true;
        QUICK_COMPARE[RS_GLSL_SHADER_OBJECTS] = true;
        QUICK_COMPARE[RS_COLORMASK_STATE] = true;
        QUICK_COMPARE[RS_CLIP] = true;
    }
    
	private boolean enabled = true;

    private boolean needsRefresh = false;

	/**
	 * Construts a new RenderState. The state is enabled by default.
	 */
	public RenderState() {
	}

	/**
	 * Defined by the subclass, this returns an int identifying the renderstate.
	 * For example, RS_CULL or RS_TEXTURE.
	 * 
	 * @return An int identifying this render state.
	 */
	public abstract int getType();

	/**
	 * Returns if this render state is enabled during rendering. Disabled states
	 * are ignored.
	 * 
	 * @return True if this state is enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets if this render state is enabled during rendering. Disabled states
	 * are ignored.
	 * 
	 * @param value
	 *            False if the state is to be disabled, true otherwise.
	 */
	public void setEnabled(boolean value) {
		this.enabled = value;
        setNeedsRefresh(true);
	}

	/**
	 * This function is defined in the RenderState that is actually used by the
	 * Renderer. It contains the code that, when executed, applies the render
	 * state for the given render system. This should only be called internally
	 * and not by users directly.
	 */
	public abstract void apply();

	/**
	 * Extracts from the stack the correct renderstate that should apply to the
	 * given spatial. This is mainly used for RenderStates that can be
	 * cumulitive such as TextureState or LightState. By default, the top of the
	 * static is returned. This function should not be called by users directly.
	 * 
	 * @param stack
	 *            The stack to extract render states from.
	 * @param spat
	 *            The spatial to apply the render states too.
	 * @return The render state to use.
	 */
	public RenderState extract(Stack stack, SceneElement spat) {
		// The default behavior is to return the top of the stack, the last item
		// pushed during the recursive traveral.
		return (RenderState) stack.peek();
	}
    
    public void write(JMEExporter e) throws IOException {
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(enabled, "enabled", true);
    }

    public void read(JMEImporter e) throws IOException {
        InputCapsule capsule = e.getCapsule(this);
        enabled = capsule.readBoolean("enabled", true);
    }
    
    public Class getClassTag() {
        return this.getClass();
    }

    public abstract StateRecord createStateRecord();

    /**
     * @return true if we should apply this state even if we think it is the
     *         current state of its type in the current context. Is reset to
     *         false after apply is finished.
     */
    public boolean needsRefresh() {
        return needsRefresh;
    }
    
    /**
     * This should be called by states when it knows internal data has been altered.
     * 
     * @param refresh true if we should apply this state even if we think it is the
     *         current state of its type in the current context.
     */ 
    public void setNeedsRefresh(boolean refresh) {
        needsRefresh  = refresh;
    }

    /**
     * @see #QUICK_COMPARE
     * @param enabled
     */
    public static void setQuickCompares(boolean enabled) {
        Arrays.fill(QUICK_COMPARE, enabled);
    }
}