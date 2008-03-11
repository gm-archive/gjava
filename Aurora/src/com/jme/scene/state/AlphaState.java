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
 * <code>AlphaState</code> maintains the state of the alpha values of a
 * particular node and it's children. The alpha state provides a method for
 * blending a source pixel with a destination pixel. The alpha value provides
 * a transparent or translucent surfaces. For example, this would allow for
 * the rendering of green glass. Where you could see all objects behind this
 * green glass but they would be tinted green.
 * @author Mark Powell
 * @version $Id: AlphaState.java,v 1.9 2007/08/02 22:05:39 nca Exp $
 */
public abstract class AlphaState extends RenderState {
    //source functions
    /**
     * The source value of the blend function is all zeros.
     */
    public final static int SB_ZERO = 0;
    /**
     * The source value of the blend function is all ones.
     */
    public final static int SB_ONE = 1;
    /**
     * The source value of the blend function is the destination color.
     */
    public final static int SB_DST_COLOR = 2;
    /**
     * The source value of the blend function is 1 - the destination color.
     */
    public final static int SB_ONE_MINUS_DST_COLOR = 3;
    /**
     * The source value of the blend function is the source alpha value.
     */
    public final static int SB_SRC_ALPHA = 4;
    /**
     * The source value of the blend function is 1 - the source alpha value.
     */
    public final static int SB_ONE_MINUS_SRC_ALPHA = 5;
    /**
     * The source value of the blend function is the destination alpha.
     */
    public final static int SB_DST_ALPHA = 6;
    /**
     * The source value of the blend function is 1 - the destination alpha.
     */
    public final static int SB_ONE_MINUS_DST_ALPHA = 7;
    /**
     * The source value of the blend function is the minimum of alpha or
     * 1 - alpha.
     */
    public final static int SB_SRC_ALPHA_SATURATE = 8;

    //destination functions
    /**
     * The destination value of the blend function is all zeros.
     */
    public final static int DB_ZERO = 0;
    /**
     * The destination value of the blend function is all ones.
     */
    public final static int DB_ONE = 1;
    /**
     * The destination value of the blend function is the source color.
     */
    public final static int DB_SRC_COLOR = 2;
    /**
     * The destination value of the blend function is 1 - the source color.
     */
    public final static int DB_ONE_MINUS_SRC_COLOR = 3;
    /**
     * The destination value of the blend function is the source alpha value.
     */
    public final static int DB_SRC_ALPHA = 4;
    /**
     * The destination value of the blend function is 1 - the source alpha value.
     */
    public final static int DB_ONE_MINUS_SRC_ALPHA = 5;
    /**
     * The destination value of the blend function is the destination alpha value.
     */
    public final static int DB_DST_ALPHA = 6;
    /**
     * The destination value of the blend function is 1 - the destination alpha
     * value.
     */
    public final static int DB_ONE_MINUS_DST_ALPHA = 7;

    //test functions
    /**
     * Never passes the depth test.
     */
    public final static int TF_NEVER = 0;
    /**
     * Pass the test if this alpha is less than the reference alpha.
     */
    public final static int TF_LESS = 1;
    /**
     * Pass the test if this alpha is equal to the reference alpha.
     */
    public final static int TF_EQUAL = 2;
    /**
     * Pass the test if this alpha is less than or equal to the reference alpha.
     */
    public final static int TF_LEQUAL = 3;
    /**
     * Pass the test if this alpha is greater than the reference alpha.
     */
    public final static int TF_GREATER = 4;
    /**
     * Pass the test if this alpha is not equal to the reference alpha.
     */
    public final static int TF_NOTEQUAL = 5;
    /**
     * Pass the test if this alpha is greater than or equal to the reference
     * alpha.
     */
    public final static int TF_GEQUAL = 6;
    /**
     * Always passes the depth test.
     */
    public final static int TF_ALWAYS = 7;

    //attributes
    /** The current value of if blend is enabled. */
    private boolean blendEnabled;
    /** The current source blend function. */
    private int srcBlend;
    /** The current destiantion blend function. */
    private int dstBlend;
    /** If enabled, alpha testing done. */
    private boolean testEnabled;
    /** Alpha test value. */
    private int test;
    /** The reference value to which incoming alpha values are compared. */
    private float reference;

    /**
     * Constructor instantiates a new <code>AlphaState</code> object with
     * default values.
     *
     */
    public AlphaState() {
        blendEnabled = false;
        srcBlend = SB_SRC_ALPHA;
        dstBlend = DB_ONE_MINUS_SRC_ALPHA;
        testEnabled = false;
        test = TF_ALWAYS;
        reference = 0;
    }
    /**
     * <code>getType</code> returns the type of render state this is.
     * (RS_ALPHA).
     * @see com.jme.scene.state.RenderState#getType()
     */
    public int getType() {
        return RS_ALPHA;
    }

    /**
     *
     * <code>isBlendEnabled</code> returns true if blending is turned on,
     * otherwise false is returned.
     * @return true if blending is enabled, false otherwise.
     */
    public boolean isBlendEnabled() {
        return blendEnabled;
    }

    /**
     *
     * <code>setBlendEnabled</code> sets whether or not blending is enabled.
     * @param value true to enable the blending, false to disable it.
     */
    public void setBlendEnabled(boolean value) {
        blendEnabled = value;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>setSrcFunction</code> sets the source function for the blending
     * function. If an invalid value is passed, the default SB_SRC_ALPHA is
     * used.
     * @param srcFunction the source function for the blending equation.
     */
    public void setSrcFunction(int srcFunction) {
        if(srcFunction < 0 || srcFunction > 8) {
            srcFunction = SB_SRC_ALPHA;
        }
        srcBlend = srcFunction;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>getSrcFunction</code> returns the source function for the
     * blending function.
     * @return the source function for the blending function.
     */
    public int getSrcFunction() {
        return srcBlend;
    }

    /**
     *
     * <code>setDstFunction</code> sets the destination function for the
     * blending function. If an invalid value is passed, the default
     * DB_ONE_MINUS_SRC_ALPHA is used.
     * @param dstFunction the destination function for the blending equation.
     */
    public void setDstFunction(int dstFunction) {
        if(dstFunction < 0 || dstFunction > 7) {
            dstFunction = DB_ONE_MINUS_SRC_ALPHA;
        }
        dstBlend = dstFunction;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>getDstFunction</code> returns the destination function for the
     * blending function.
     * @return the destination function for the blending function.
     */
    public int getDstFunction() {
        return dstBlend;
    }

    /**
     *
     * <code>isTestEnabled</code> returns true if alpha testing is enabled,
     * false otherwise.
     * @return true if alpha testing is enabled, false otherwise.
     */
    public boolean isTestEnabled() {
        return testEnabled;
    }

    /**
     *
     * <code>setTestEnabled</code> turns alpha testing on and off. True turns
     * on the testing, while false diables it.
     * @param value true to enabled alpha testing, false to disable it.
     */
    public void setTestEnabled(boolean value) {
        testEnabled = value;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>setTestFunction</code> sets the testing function used for the
     * alpha testing. If an invalid value is passed, the default TF_ALWAYS is
     * used.
     * @param testFunction the testing function used for the alpha testing.
     */
    public void setTestFunction(int testFunction) {
        if(testFunction < 0 || testFunction > 7) {
            testFunction = TF_ALWAYS;
        }
        test = testFunction;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>getTestFunction</code> returns the testing function used for the
     * alpha testing.
     * @return the testing function used for the alpha testing.
     */
    public int getTestFunction() {
        return test;
    }

    /**
     *
     * <code>setReference</code> sets the reference value that incoming
     * alpha values are compared to. This is clamped to [0, 1].
     * @param reference the reference value that alpha values are compared to.
     */
    public void setReference(float reference) {
        if(reference < 0) {
            reference = 0;
        }

        if(reference > 1) {
            reference = 1;
        }
        this.reference = reference;
        setNeedsRefresh(true);
    }

    /**
     *
     * <code>getReference</code> returns the reference value that incoming
     * alpha values are compared to.
     * @return the reference value that alpha values are compared to.
     */
    public float getReference() {
        return reference;
    }
    
    public void write(JMEExporter e) throws IOException {
        super.write(e);
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(blendEnabled, "blendEnabled", false);
        capsule.write(srcBlend, "srcBlend", SB_SRC_ALPHA);
        capsule.write(dstBlend, "dstBlend", DB_ONE_MINUS_SRC_ALPHA);
        capsule.write(testEnabled, "testEnabled", false);
        capsule.write(test, "test", TF_ALWAYS);
        capsule.write(reference, "reference", 0);
    }

    public void read(JMEImporter e) throws IOException {
        super.read(e);
        InputCapsule capsule = e.getCapsule(this);
        blendEnabled = capsule.readBoolean("blendEnabled", false);
        srcBlend = capsule.readInt("srcBlend", SB_SRC_ALPHA);
        dstBlend = capsule.readInt("dstBlend", DB_ONE_MINUS_SRC_ALPHA);
        testEnabled = capsule.readBoolean("testEnabled", false);
        test = capsule.readInt("test", TF_ALWAYS);
        reference = capsule.readFloat("reference", 0);
    }
    
    public Class getClassTag() {
        return AlphaState.class;
    }

}
