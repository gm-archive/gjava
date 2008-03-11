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

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBFragmentShader;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBTextureBorderClamp;
import org.lwjgl.opengl.ARBTextureCompression;
import org.lwjgl.opengl.ARBTextureEnvCombine;
import org.lwjgl.opengl.ARBTextureEnvDot3;
import org.lwjgl.opengl.ARBTextureMirroredRepeat;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTTextureCompressionS3TC;
import org.lwjgl.opengl.EXTTextureFilterAnisotropic;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.Util;
import org.lwjgl.opengl.glu.GLU;
import org.lwjgl.opengl.glu.MipMap;

import com.jme.image.Image;
import com.jme.image.Texture;
import com.jme.math.FastMath;
import com.jme.math.Vector3f;
import com.jme.renderer.ColorRGBA;
import com.jme.renderer.RenderContext;
import com.jme.scene.SceneElement;
import com.jme.scene.state.RenderState;
import com.jme.scene.state.TextureState;
import com.jme.scene.state.lwjgl.records.RendererRecord;
import com.jme.scene.state.lwjgl.records.StateRecord;
import com.jme.scene.state.lwjgl.records.TextureRecord;
import com.jme.scene.state.lwjgl.records.TextureStateRecord;
import com.jme.scene.state.lwjgl.records.TextureUnitRecord;
import com.jme.system.DisplaySystem;
import com.jme.util.TextureManager;

/**
 * <code>LWJGLTextureState</code> subclasses the TextureState object using the
 * LWJGL API to access OpenGL for texture processing.
 * 
 * @author Mark Powell
 * @author Joshua Slack - updates, optimizations, etc. also StateRecords
 * @version $Id: LWJGLTextureState.java,v 1.98 2007/12/22 04:34:34 renanse Exp $
 */
public class LWJGLTextureState extends TextureState {
    private static final Logger logger = Logger.getLogger(LWJGLTextureState.class.getName());

    private static final long serialVersionUID = 1L;

    private static int[] imageComponents = { GL11.GL_RGBA4, GL11.GL_RGB8,
            GL11.GL_RGB5_A1, GL11.GL_RGBA8, GL11.GL_LUMINANCE8_ALPHA8,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGB_S3TC_DXT1_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT1_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT3_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT5_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGB_S3TC_DXT1_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT1_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT3_EXT,
            EXTTextureCompressionS3TC.GL_COMPRESSED_RGBA_S3TC_DXT5_EXT };

    private static int[] imageFormats = { GL11.GL_RGBA, GL11.GL_RGB,
            GL11.GL_RGBA, GL11.GL_RGBA, GL11.GL_LUMINANCE_ALPHA, GL11.GL_RGB,
            GL11.GL_RGBA, GL11.GL_RGBA, GL11.GL_RGBA };

    private static boolean inited = false;

    /**
     * Constructor instantiates a new <code>LWJGLTextureState</code> object.
     * The number of textures that can be combined is determined during
     * construction. This equates the number of texture units supported by the
     * graphics card.
     */
    public LWJGLTextureState() {
        super();

        // get our array of texture objects ready.
        texture = new ArrayList<Texture>();

        // See if we haven't already setup a texturestate before.
        if (!inited) {
            // Check for support of multitextures.
            supportsMultiTexture = supportsMultiTextureDetected = GLContext.getCapabilities().GL_ARB_multitexture;
            
            // Check for support of fixed function dot3 environment settings
            supportsEnvDot3 = supportsEnvDot3Detected = GLContext.getCapabilities().GL_ARB_texture_env_dot3;
            
            // Check for support of fixed function dot3 environment settings
            supportsEnvCombine = supportsEnvCombineDetected = GLContext.getCapabilities().GL_ARB_texture_env_combine;

            // If we do support multitexturing, find out how many textures we
            // can handle.
            if (supportsMultiTexture) {
                IntBuffer buf = BufferUtils.createIntBuffer(16);
                GL11.glGetInteger(ARBMultitexture.GL_MAX_TEXTURE_UNITS_ARB, buf);
                numFixedTexUnits = buf.get(0);
            } else {
                numFixedTexUnits = 1;
            }

            // Go on to check number of texture units supported for vertex and
            // fragment shaders
            if (GLContext.getCapabilities().GL_ARB_shader_objects
                    && GLContext.getCapabilities().GL_ARB_vertex_shader
                    && GLContext.getCapabilities().GL_ARB_fragment_shader) {
                IntBuffer buf = BufferUtils.createIntBuffer(16);
                GL11.glGetInteger(
                        ARBVertexShader.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB,
                        buf);
                numVertexTexUnits = buf.get(0);
                GL11.glGetInteger(
                        ARBFragmentShader.GL_MAX_TEXTURE_IMAGE_UNITS_ARB, buf);
                numFragmentTexUnits = buf.get(0);
                GL11.glGetInteger(
                        ARBFragmentShader.GL_MAX_TEXTURE_COORDS_ARB, buf);
                numFragmentTexCoordUnits = buf.get(0);
            } else {
                // based on nvidia dev doc:
                // http://developer.nvidia.com/object/General_FAQ.html#t6
                // "For GPUs that do not support GL_ARB_fragment_program and
                // GL_NV_fragment_program, those two limits are set equal to
                // GL_MAX_TEXTURE_UNITS."
                numFragmentTexCoordUnits = numFixedTexUnits;
                numFragmentTexUnits = numFixedTexUnits;
                
                // We'll set this to 0 for now since we do not know:
                numVertexTexUnits = 0;
            }

            // Now determine the maximum number of supported texture units
            numTotalTexUnits = Math.max(numFragmentTexCoordUnits, 
                               Math.max(numFixedTexUnits, 
                               Math.max(numFragmentTexUnits,
                                        numVertexTexUnits)));

            // Check for S3 texture compression capability.
            supportsS3TCCompression = supportsS3TCCompressionDetected = GLContext.getCapabilities().GL_EXT_texture_compression_s3tc;

            // See if we support anisotropic filtering
            supportsAniso = supportsAnisoDetected = GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic;

            if (supportsAniso) {
                // Due to LWJGL buffer check, you can't use smaller sized
                // buffers (min_size = 16 for glGetFloat()).
                FloatBuffer max_a = BufferUtils.createFloatBuffer(16);
                max_a.rewind();

                // Grab the maximum anisotropic filter.
                GL11.glGetFloat(
                                EXTTextureFilterAnisotropic.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT,
                                max_a);

                // set max.
                maxAnisotropic = max_a.get(0);
            }

            // See if we support textures that are not power of 2 in size.
            supportsNonPowerTwo = supportsNonPowerTwoDetected = GLContext.getCapabilities().GL_ARB_texture_non_power_of_two;

            // See if we support textures that do not have width == height.
            supportsRectangular = supportsRectangularDetected = GLContext.getCapabilities().GL_ARB_texture_rectangle;

            // Setup our default texture by adding it to our array and loading
            // it, then clearing our array.
            setTexture(defaultTexture);
            load(0);
            this.texture.clear();

            // We're done initing! Wee! :)
            inited = true;
        }
    }

    /**
     * override MipMap to access helper methods
     */
    protected static class LWJGLMipMap extends MipMap {
        /**
         * @see MipMap#glGetIntegerv(int)
         */
        protected static int glGetIntegerv(int what) {
            return org.lwjgl.opengl.glu.Util.glGetIntegerv(what);
        }

        /**
         * @see MipMap#nearestPower(int)
         */
        protected static int nearestPower(int value) {
            return org.lwjgl.opengl.glu.Util.nearestPower(value);
        }

        /**
         * @see MipMap#bytesPerPixel(int, int)
         */
        protected static int bytesPerPixel(int format, int type) {
            return org.lwjgl.opengl.glu.Util.bytesPerPixel(format, type);
        }
    }

    @Override
    public void load(int unit) {
        Texture texture = getTexture(unit);
        if (texture == null) {
            return;
        }
        
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = null;
        if (context != null)
            record = (TextureStateRecord) context.getStateRecord(RS_TEXTURE);

        // Check we are in the right unit
        if (record != null)
            checkAndSetUnit(unit, record);
        
        // Create the texture
        if (texture.getTextureKey() != null) {
            Texture cached = TextureManager.findCachedTexture(texture
                    .getTextureKey());
            if (cached == null) {
                TextureManager.addToCache(texture);
            } else if (cached.getTextureId() != 0) {
                texture.setTextureId(cached.getTextureId());
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, cached.getTextureId());
                if (record != null)
                    record.units[unit].boundTexture = texture.getTextureId();
                return;
            }
        }

        IntBuffer id = BufferUtils.createIntBuffer(1);
        id.clear();
        GL11.glGenTextures(id);
        texture.setTextureId(id.get(0));

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture.getTextureId());
        if (record != null)
            record.units[unit].boundTexture = texture.getTextureId();

        TextureManager.registerForCleanup(texture.getTextureKey(), texture
                .getTextureId());

        // pass image data to OpenGL
        Image image = texture.getImage();
        if (image == null) {
            logger.warning("Image data for texture is null.");
        }
        
        // set alignment to support images with width % 4 != 0, as images are
        // not aligned
        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);

        // Get texture image data. Not all textures have image data.
        // For example, AM_COMBINE modes can use primary colors,
        // texture output, and constants to modify fragments via the
        // texture units.
        if (image != null) {
            if (!supportsNonPowerTwo
                    && (!FastMath.isPowerOfTwo(image.getWidth()) || !FastMath
                            .isPowerOfTwo(image.getHeight()))) {
                logger.warning("Attempted to apply texture with size that is not power "
                                + "of 2: "
                                + image.getWidth()
                                + " x "
                                + image.getHeight());

                final int maxSize = LWJGLMipMap
                        .glGetIntegerv(GL11.GL_MAX_TEXTURE_SIZE);

                int actualWidth = image.getWidth();
                int w = LWJGLMipMap.nearestPower(actualWidth);
                if (w > maxSize) {
                    w = maxSize;
                }

                int actualHeight = image.getHeight();
                int h = LWJGLMipMap.nearestPower(actualHeight);
                if (h > maxSize) {
                    h = maxSize;
                }
                logger.warning("Rescaling image to " + w + " x " + h + " !!!");

                // must rescale image to get "top" mipmap texture image
                int format = imageFormats[image.getType()];
                int type = GL11.GL_UNSIGNED_BYTE;
                int bpp = LWJGLMipMap.bytesPerPixel(format, type);
                ByteBuffer scaledImage = BufferUtils.createByteBuffer((w + 4)
                        * h * bpp);
                int error = MipMap.gluScaleImage(format, actualWidth,
                        actualHeight, type, image.getData(), w, h, type,
                        scaledImage);
                if (error != 0) {
                    Util.checkGLError();
                }

                image.setWidth(w);
                image.setHeight(h);
                image.setData(scaledImage);
            }

            // For textures which need mipmaps auto-generating and which
            // aren't using compressed images, generate the mipmaps.
            // A new mipmap builder may be needed to build mipmaps for
            // compressed textures.
            if (texture.getMipmap() >= Texture.MM_NEAREST_NEAREST
                    && !image.hasMipmaps() && !image.isCompressedType()) {
                // insure the buffer is ready for reading
                image.getData().rewind();
                GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D, imageComponents[image
                        .getType()], image.getWidth(), image.getHeight(),
                        imageFormats[image.getType()], GL11.GL_UNSIGNED_BYTE,
                        image.getData());
            } else {
                // Get mipmap data sizes and amount of mipmaps to send to
                // opengl. Then loop through all mipmaps and send them.
                int[] mipSizes = image.getMipMapSizes();
                ByteBuffer data = image.getData();
                int max = 1;
                int pos = 0;
                if (mipSizes == null) {
                    mipSizes = new int[] { data.capacity() };
                } else if (texture.getMipmap() != Texture.MM_NONE) {
                    max = mipSizes.length;
                }

                for (int m = 0; m < max; m++) {
                    int width = Math.max(1, image.getWidth() >> m);
                    int height = Math.max(1, image.getHeight() >> m);

                    data.position(pos);

                    if (image.isCompressedType()) {
                        data.limit(pos+mipSizes[m]);
                        ARBTextureCompression.glCompressedTexImage2DARB(
                                GL11.GL_TEXTURE_2D, m, imageComponents[image
                                        .getType()], width, height, 0, data);
                    } else {
                        data.limit(data.position() + mipSizes[m]);
                        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, m,
                                imageComponents[image.getType()], width,
                                height, 0, imageFormats[image.getType()],
                                GL11.GL_UNSIGNED_BYTE, data);
                    }

                    pos += mipSizes[m];
                }
                data.clear();
            }
        }
    }

    /**
     * <code>apply</code> manages the textures being described by the state.
     * If the texture has not been loaded yet, it is generated and loaded using
     * OpenGL11. This means the initial pass to set will be longer than
     * subsequent calls. The multitexture extension is used to define the
     * multiple texture states, with the number of units being determined at
     * construction time.
     * 
     * @see com.jme.scene.state.RenderState#apply()
     */
    public void apply() {
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = (TextureStateRecord) context
                .getStateRecord(RS_TEXTURE);
        context.currentStates[RS_TEXTURE] = this;

        if (isEnabled()) {

            Texture texture;
            TextureUnitRecord unitRecord;
            TextureRecord texRecord;

            int glHint = getPerspHint(getCorrection());
            if (!record.isValid() || record.hint != glHint) {
                // set up correction mode
                GL11.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT,
                        glHint);
                record.hint = glHint;
            }

            // loop through all available texture units...
            for (int i = 0; i < numTotalTexUnits; i++) {
                unitRecord = record.units[i];
                
                // grab a texture for this unit, if available
                texture = getTexture(i);
                
                // check for invalid textures - ones that have no opengl id and
                // no image data
                if (texture != null && texture.getTextureId() == 0
                        && texture.getImage() == null)
                    texture = null;

                // null textures above fixed limit do not need to be disabled
                // since they are not really part of the pipeline.
                if (texture == null) {
                    if (i >= numFixedTexUnits)
                        continue;
                    else {
                        // a null texture indicates no texturing at this unit
                        // Disable 2D texturing on this unit if enabled.
                        if (!unitRecord.isValid() || unitRecord.enabled) {
                            // Check we are in the right unit
                            checkAndSetUnit(i, record);
                            GL11.glDisable(GL11.GL_TEXTURE_2D);
                            unitRecord.enabled = false;
                        }
                        if (i < idCache.length)
                            idCache[i] = 0;

                        // next texture!
                        continue;
                    }
                }

                // Time to bind the texture, so see if we need to load in image
                // data for this texture.
                if (texture.getTextureId() == 0) {
                    // texture not yet loaded.
                    // this will load and bind and set the records...
                    load(i);
                    if (texture.getTextureId() == 0) continue;
                } else {
                    // texture already exists in OpenGL, just bind it if needed
                    if (!unitRecord.isValid() || unitRecord.boundTexture != texture.getTextureId()) {
                        // Check we are in the right unit
                        checkAndSetUnit(i, record);
                        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture.getTextureId());
                        unitRecord.boundTexture = texture.getTextureId();
                    }
                }
            
                // Grab our record for this texture
                texRecord = record.getTextureRecord(texture.getTextureId());
            
                // Set the idCache value for this unit of this texture state
                // This is done so during state comparison we don't have to
                // spend a lot of time pulling out classes and finding field
                // data.
                idCache[i] = texture.getTextureId();

                // Some texture things only apply to fixed function pipeline
                if (i < numFixedTexUnits) {

                    // Enable 2D texturing on this unit if not enabled.
                    if (!unitRecord.isValid() || !unitRecord.enabled) {
                        checkAndSetUnit(i, record);
                        GL11.glEnable(GL11.GL_TEXTURE_2D);
                        unitRecord.enabled = true;
                    }

                    // Set our blend color, if needed.
                    applyBlendColor(texture, unitRecord, i, record);

                    // Set the texture environment mode if this unit isn't
                    // already set properly
                    int glEnvMode = getGLEnvMode(texture.getApply());
                    applyEnvMode(glEnvMode, unitRecord, i, record);

                    // If our mode is combine, and we support multitexturing
                    // apply combine settings.
                    if (glEnvMode == ARBTextureEnvCombine.GL_COMBINE_ARB && supportsMultiTexture && supportsEnvCombine) {
                        applyCombineFactors(texture, unitRecord, i, record);
                    }
                }
                
                // Other items only apply to textures below the frag unit limit
                if (i < numFragmentTexUnits) {

                    // texture specific params
                    applyFilter(texture, texRecord, i, record);
                    applyWrap(texture, texRecord, i, record);
                    
                    // all states have now been applied for a tex record, so we can safely make it valid
                    if (!texRecord.isValid())
                        texRecord.validate();

                }
                
                // Other items only apply to textures below the frag tex coord unit limit
                if (i < numFragmentTexCoordUnits) {

                    // Now time to play with texture matrices
                    // Determine which transforms to do.
                    applyTextureTransforms(texture, i, record);

                    // Now let's look at automatic texture coordinate generation.
                    applyTexCoordGeneration(texture, unitRecord, i, record);

                }
                
            }

        } else {
            // turn off texturing
            TextureUnitRecord unitRecord;

            if (supportsMultiTexture) {
                for (int i = 0; i < numFixedTexUnits; i++) {
                    unitRecord = record.units[i];
                    if (!unitRecord.isValid() || unitRecord.enabled) {
                        checkAndSetUnit(i, record);
                        GL11.glDisable(GL11.GL_TEXTURE_2D);
                        unitRecord.enabled = false;
                    }
                }
            } else {
                unitRecord = record.units[0];
                if (!unitRecord.isValid() || unitRecord.enabled) {
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    unitRecord.enabled = false;
                }
            }
        }
        
        if (!record.isValid())
            record.validate();
    }

    public static void applyCombineFactors(Texture texture, TextureUnitRecord unitRecord, int unit, TextureStateRecord record) {
        // check that this is a valid fixed function unit.  glTexEnv is only supported for unit < GL_MAX_TEXTURE_UNITS
        if (unit >= numFixedTexUnits) {
            return;
        }
        
        // first thing's first... if we are doing dot3 and don't
        // support it, disable this texture.
        boolean checked = false;
        if (!supportsEnvDot3 && (texture.getCombineFuncAlpha() == Texture.ACF_DOT3_RGB
                || texture.getCombineFuncAlpha() == Texture.ACF_DOT3_RGBA 
                || texture.getCombineFuncRGB() == Texture.ACF_DOT3_RGB
                || texture.getCombineFuncRGB() == Texture.ACF_DOT3_RGBA)) {
        
            checkAndSetUnit(unit, record);
            checked = true;
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            unitRecord.enabled = false;
            
            // No need to continue
            return;
        }

        // Okay, now let's set our scales if we need to:
        // First RGB Combine scale
        if (!unitRecord.isValid() || unitRecord.envRGBScale != texture.getCombineScaleRGB()) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvf(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_RGB_SCALE_ARB, texture
                    .getCombineScaleRGB());
            unitRecord.envRGBScale = texture.getCombineScaleRGB();
        }
        // Then Alpha Combine scale
        if (!unitRecord.isValid() || unitRecord.envAlphaScale != texture.getCombineScaleAlpha()) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvf(GL11.GL_TEXTURE_ENV, GL11.GL_ALPHA_SCALE, texture
                    .getCombineScaleAlpha());
            unitRecord.envAlphaScale = texture.getCombineScaleAlpha();
        }
        
        // Time to set the RGB combines
        int rgbCombineFunc = texture.getCombineFuncRGB();
        if (!unitRecord.isValid() || unitRecord.rgbCombineFunc != rgbCombineFunc) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_COMBINE_RGB_ARB,
                    getGLCombineFunc(rgbCombineFunc));
            unitRecord.rgbCombineFunc = rgbCombineFunc;
        }
        
        int combSrcRGB = texture.getCombineSrc0RGB();
        if (!unitRecord.isValid() || unitRecord.combSrcRGB0 != combSrcRGB) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE0_RGB_ARB, getGLCombineSrc(combSrcRGB));
            unitRecord.combSrcRGB0 = combSrcRGB;
        }
        
        int combOpRGB = texture.getCombineOp0RGB();
        if (!unitRecord.isValid() || unitRecord.combOpRGB0 != combOpRGB) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND0_RGB_ARB, getGLCombineOpRGB(combOpRGB));
            unitRecord.combOpRGB0 = combOpRGB;
        }

        if (rgbCombineFunc != Texture.ACF_REPLACE) {
            
            combSrcRGB = texture.getCombineSrc1RGB();
            if (!unitRecord.isValid() || unitRecord.combSrcRGB1 != combSrcRGB) {
                if (!checked) {
                    checkAndSetUnit(unit, record);
                    checked = true;
                }
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE1_RGB_ARB, getGLCombineSrc(combSrcRGB));
                unitRecord.combSrcRGB1 = combSrcRGB;
            }

            combOpRGB = texture.getCombineOp1RGB();
            if (!unitRecord.isValid() || unitRecord.combOpRGB1 != combOpRGB) {
                if (!checked) {
                    checkAndSetUnit(unit, record);
                    checked = true;
                }
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND1_RGB_ARB, getGLCombineOpRGB(combOpRGB));
                unitRecord.combOpRGB1 = combOpRGB;
            }

            if (rgbCombineFunc == Texture.ACF_INTERPOLATE) {
                
                combSrcRGB = texture.getCombineSrc2RGB();
                if (!unitRecord.isValid() || unitRecord.combSrcRGB2 != combSrcRGB) {
                    if (!checked) {
                        checkAndSetUnit(unit, record);
                        checked = true;
                    }
                    GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE2_RGB_ARB, getGLCombineSrc(combSrcRGB));
                    unitRecord.combSrcRGB2 = combSrcRGB;
                }
                
                combOpRGB = texture.getCombineOp2RGB();
                if (!unitRecord.isValid() || unitRecord.combOpRGB2 != combOpRGB) {
                    if (!checked) {
                        checkAndSetUnit(unit, record);
                        checked = true;
                    }
                    GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND2_RGB_ARB, getGLCombineOpRGB(combOpRGB));
                    unitRecord.combOpRGB2 = combOpRGB;
                }

            }
        }

        
        // Now Alpha combines
        int alphaCombineFunc = texture.getCombineFuncAlpha();
        if (!unitRecord.isValid() || unitRecord.alphaCombineFunc != alphaCombineFunc) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_COMBINE_ALPHA_ARB,
                    getGLCombineFunc(alphaCombineFunc));
            unitRecord.alphaCombineFunc = alphaCombineFunc;
        }
        
        int combSrcAlpha = texture.getCombineSrc0Alpha();
        if (!unitRecord.isValid() || unitRecord.combSrcAlpha0 != combSrcAlpha) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE0_ALPHA_ARB, getGLCombineSrc(combSrcAlpha));
            unitRecord.combSrcAlpha0 = combSrcAlpha;
        }
        
        int combOpAlpha = texture.getCombineOp0Alpha();
        if (!unitRecord.isValid() || unitRecord.combOpAlpha0 != combOpAlpha) {
            if (!checked) {
                checkAndSetUnit(unit, record);
                checked = true;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND0_ALPHA_ARB, getGLCombineOpAlpha(combOpAlpha));
            unitRecord.combOpAlpha0 = combOpAlpha;
        }

        if (alphaCombineFunc != Texture.ACF_REPLACE) {

            combSrcAlpha = texture.getCombineSrc1Alpha();
            if (!unitRecord.isValid() || unitRecord.combSrcAlpha1 != combSrcAlpha) {
                if (!checked) {
                    checkAndSetUnit(unit, record);
                    checked = true;
                }
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE1_ALPHA_ARB, getGLCombineSrc(combSrcAlpha));
                unitRecord.combSrcAlpha1 = combSrcAlpha;
            }
            
            combOpAlpha = texture.getCombineOp1Alpha();
            if (!unitRecord.isValid() || unitRecord.combOpAlpha1 != combOpAlpha) {
                if (!checked) {
                    checkAndSetUnit(unit, record);
                    checked = true;
                }
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND1_ALPHA_ARB, getGLCombineOpAlpha(combOpAlpha));
                unitRecord.combOpAlpha1 = combOpAlpha;
            }
            if (alphaCombineFunc == Texture.ACF_INTERPOLATE) {

                combSrcAlpha = texture.getCombineSrc2Alpha();
                if (!unitRecord.isValid() || unitRecord.combSrcAlpha2 != combSrcAlpha) {
                    if (!checked) {
                        checkAndSetUnit(unit, record);
                        checked = true;
                    }
                    GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE2_ALPHA_ARB, getGLCombineSrc(combSrcAlpha));
                    unitRecord.combSrcAlpha2 = combSrcAlpha;
                }
                
                combOpAlpha = texture.getCombineOp2Alpha();
                if (!unitRecord.isValid() || unitRecord.combOpAlpha2 != combOpAlpha) {
                    if (!checked) {
                        checkAndSetUnit(unit, record);
                        checked = true;
                    }
                    GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND2_ALPHA_ARB, getGLCombineOpAlpha(combOpAlpha));
                    unitRecord.combOpAlpha2 = combOpAlpha;
                }
            }
        }
    }
    
    public static int getGLCombineOpRGB(int combineOpRGB) {
        switch (combineOpRGB) {
            case Texture.ACO_SRC_COLOR:
                return GL11.GL_SRC_COLOR;
            case Texture.ACO_ONE_MINUS_SRC_COLOR:
                return GL11.GL_ONE_MINUS_SRC_COLOR;
            case Texture.ACO_SRC_ALPHA:
                return GL11.GL_SRC_ALPHA;
            case Texture.ACO_ONE_MINUS_SRC_ALPHA:
                return GL11.GL_ONE_MINUS_SRC_ALPHA;
            default:
                return GL11.GL_SRC_COLOR;
        }
    }
    
    public static int getGLCombineOpAlpha(int combineOpAlpha) {
        switch (combineOpAlpha) {
            case Texture.ACO_SRC_ALPHA:
                return GL11.GL_SRC_ALPHA;
            case Texture.ACO_ONE_MINUS_SRC_ALPHA:
                return GL11.GL_ONE_MINUS_SRC_ALPHA;
            case Texture.ACO_SRC_COLOR: // these 2 we just put here to help prevent errors.
                return GL11.GL_SRC_ALPHA;
            case Texture.ACO_ONE_MINUS_SRC_COLOR:
                return GL11.GL_ONE_MINUS_SRC_ALPHA;
            default:
                return GL11.GL_SRC_ALPHA;
        }
    }

    public static int getGLCombineSrc(int combineSrc) {
        switch (combineSrc) {
            case Texture.ACS_TEXTURE:
                return GL11.GL_TEXTURE;
            case Texture.ACS_PRIMARY_COLOR:
                return ARBTextureEnvCombine.GL_PRIMARY_COLOR_ARB;
            case Texture.ACS_CONSTANT:
                return ARBTextureEnvCombine.GL_CONSTANT_ARB;
            case Texture.ACS_PREVIOUS:
                return ARBTextureEnvCombine.GL_PREVIOUS_ARB;
            case Texture.ACS_TEXTURE0:
                return ARBMultitexture.GL_TEXTURE0_ARB;
            case Texture.ACS_TEXTURE1:
                return ARBMultitexture.GL_TEXTURE1_ARB;
            case Texture.ACS_TEXTURE2:
                return ARBMultitexture.GL_TEXTURE2_ARB;
            case Texture.ACS_TEXTURE3:
                return ARBMultitexture.GL_TEXTURE3_ARB;
            case Texture.ACS_TEXTURE4:
                return ARBMultitexture.GL_TEXTURE4_ARB;
            case Texture.ACS_TEXTURE5:
                return ARBMultitexture.GL_TEXTURE5_ARB;
            case Texture.ACS_TEXTURE6:
                return ARBMultitexture.GL_TEXTURE6_ARB;
            case Texture.ACS_TEXTURE7:
                return ARBMultitexture.GL_TEXTURE7_ARB;
            case Texture.ACS_TEXTURE8:
                return ARBMultitexture.GL_TEXTURE8_ARB;
            case Texture.ACS_TEXTURE9:
                return ARBMultitexture.GL_TEXTURE9_ARB;
            case Texture.ACS_TEXTURE10:
                return ARBMultitexture.GL_TEXTURE10_ARB;
            case Texture.ACS_TEXTURE11:
                return ARBMultitexture.GL_TEXTURE11_ARB;
            case Texture.ACS_TEXTURE12:
                return ARBMultitexture.GL_TEXTURE12_ARB;
            case Texture.ACS_TEXTURE13:
                return ARBMultitexture.GL_TEXTURE13_ARB;
            case Texture.ACS_TEXTURE14:
                return ARBMultitexture.GL_TEXTURE14_ARB;
            case Texture.ACS_TEXTURE15:
                return ARBMultitexture.GL_TEXTURE15_ARB;
            case Texture.ACS_TEXTURE16:
                return ARBMultitexture.GL_TEXTURE16_ARB;
            case Texture.ACS_TEXTURE17:
                return ARBMultitexture.GL_TEXTURE17_ARB;
            case Texture.ACS_TEXTURE18:
                return ARBMultitexture.GL_TEXTURE18_ARB;
            case Texture.ACS_TEXTURE19:
                return ARBMultitexture.GL_TEXTURE19_ARB;
            case Texture.ACS_TEXTURE20:
                return ARBMultitexture.GL_TEXTURE20_ARB;
            case Texture.ACS_TEXTURE21:
                return ARBMultitexture.GL_TEXTURE21_ARB;
            case Texture.ACS_TEXTURE22:
                return ARBMultitexture.GL_TEXTURE22_ARB;
            case Texture.ACS_TEXTURE23:
                return ARBMultitexture.GL_TEXTURE23_ARB;
            case Texture.ACS_TEXTURE24:
                return ARBMultitexture.GL_TEXTURE24_ARB;
            case Texture.ACS_TEXTURE25:
                return ARBMultitexture.GL_TEXTURE25_ARB;
            case Texture.ACS_TEXTURE26:
                return ARBMultitexture.GL_TEXTURE26_ARB;
            case Texture.ACS_TEXTURE27:
                return ARBMultitexture.GL_TEXTURE27_ARB;
            case Texture.ACS_TEXTURE28:
                return ARBMultitexture.GL_TEXTURE28_ARB;
            case Texture.ACS_TEXTURE29:
                return ARBMultitexture.GL_TEXTURE29_ARB;
            case Texture.ACS_TEXTURE30:
                return ARBMultitexture.GL_TEXTURE30_ARB;
            case Texture.ACS_TEXTURE31:
                return ARBMultitexture.GL_TEXTURE31_ARB;
            default:
                return ARBTextureEnvCombine.GL_PRIMARY_COLOR_ARB;
        }
    }
    
    public static int getGLCombineFunc(int combineFunc) {
        switch (combineFunc) {
            case Texture.ACF_REPLACE:
                return GL11.GL_REPLACE;
            case Texture.ACF_ADD:
                return GL11.GL_ADD;
            case Texture.ACF_ADD_SIGNED:
                return ARBTextureEnvCombine.GL_ADD_SIGNED_ARB;
            case Texture.ACF_SUBTRACT:
                if (GLContext.getCapabilities().OpenGL13) {
                    return GL13.GL_SUBTRACT;
                } else {
                    // XXX: lwjgl's ARBTextureEnvCombine is missing subtract?
                    // for now... a backup.
                    return GL11.GL_MODULATE;
                }
            case Texture.ACF_INTERPOLATE:
                return ARBTextureEnvCombine.GL_INTERPOLATE_ARB;
            case Texture.ACF_DOT3_RGB:
                return ARBTextureEnvDot3.GL_DOT3_RGB_ARB;
            case Texture.ACF_DOT3_RGBA:
                return ARBTextureEnvDot3.GL_DOT3_RGBA_ARB;
            case Texture.ACF_MODULATE:
            default:
                return GL11.GL_MODULATE;
        }
    }

    public static void applyEnvMode(int glEnvMode, TextureUnitRecord unitRecord, int unit, TextureStateRecord record) {
        if (!unitRecord.isValid() || unitRecord.envMode != glEnvMode) {
            checkAndSetUnit(unit, record);
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,
                    GL11.GL_TEXTURE_ENV_MODE, glEnvMode);
            unitRecord.envMode = glEnvMode;
        }
    }

    public static void applyBlendColor(Texture texture, TextureUnitRecord unitRecord, int unit, TextureStateRecord record) {
        ColorRGBA texBlend = texture.getBlendColor();
        if (texBlend == null) texBlend = TextureRecord.defaultColor;
        if (!unitRecord.isValid() || unitRecord.blendColor.r != texBlend.r || 
                unitRecord.blendColor.g != texBlend.g || 
                unitRecord.blendColor.b != texBlend.b || 
                unitRecord.blendColor.a != texBlend.a) {
            checkAndSetUnit(unit, record);
            unitRecord.colorBuffer.clear();
            unitRecord.colorBuffer.put(texBlend.r).put(texBlend.g).put(texBlend.b).put(texBlend.a);
            unitRecord.colorBuffer.rewind();
            GL11.glTexEnv(GL11.GL_TEXTURE_ENV,
                    GL11.GL_TEXTURE_ENV_COLOR, unitRecord.colorBuffer);
            unitRecord.blendColor.set(texBlend);
        }
    }

    public static void applyTextureTransforms(Texture texture, int unit,
            TextureStateRecord record) {
        boolean needsReset = !record.units[unit].identityMatrix;
        
        
        
        // Should we load a base matrix?
        boolean doMatrix = (texture.getMatrix() != null && !texture.getMatrix()
                .isIdentity());

        // Should we apply transforms?
        boolean doTrans = texture.getTranslation() != null
                && (texture.getTranslation().x != 0
                        || texture.getTranslation().y != 0 
                        || texture.getTranslation().z != 0);
        boolean doRot = texture.getRotation() != null
                && !texture.getRotation().isIdentity();
        boolean doScale = texture.getScale() != null
                && (texture.getScale().x != 1 
                        || texture.getScale().y != 1 
                        || texture.getScale().z != 1);

        // Now do them.
        RendererRecord matRecord = (RendererRecord) DisplaySystem.getDisplaySystem().getCurrentContext().getRendererRecord();
        if (doMatrix || doTrans || doRot || doScale) {
            checkAndSetUnit(unit, record);
            matRecord.switchMode(GL11.GL_TEXTURE);
            if (doMatrix) {
                texture.getMatrix().fillFloatBuffer(record.tmp_matrixBuffer, true);
                GL11.glLoadMatrix(record.tmp_matrixBuffer);
            } else {
                GL11.glLoadIdentity();
            }
            if (doTrans) {
                GL11.glTranslatef(texture.getTranslation().x, texture
                        .getTranslation().y, texture.getTranslation().z);
            }
            if (doRot) {
                Vector3f vRot = record.tmp_rotation1;
                float rot = texture.getRotation().toAngleAxis(vRot)
                        * FastMath.RAD_TO_DEG;
                GL11.glRotatef(rot, vRot.x, vRot.y, vRot.z);
            }
            if (doScale)
                GL11.glScalef(texture.getScale().x, texture.getScale().y,
                        texture.getScale().z);

            record.units[unit].identityMatrix = false;
        } else if (needsReset) {
            checkAndSetUnit(unit, record);
            matRecord.switchMode(GL11.GL_TEXTURE);
            GL11.glLoadIdentity();
            record.units[unit].identityMatrix = true;
        }
        // Switch back to the modelview matrix for further operations
        matRecord.switchMode(GL11.GL_MODELVIEW);
    }

    public static void applyTexCoordGeneration(Texture texture,
            TextureUnitRecord unitRecord, int unit, TextureStateRecord record) {
        
        checkAndSetUnit(unit, record);
        
        if (texture.getEnvironmentalMapMode() == Texture.EM_NONE) {
            
            // No coordinate generation
            if (!unitRecord.isValid() || unitRecord.textureGenQ) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_Q);
                unitRecord.textureGenQ = false;
            }
            if (!unitRecord.isValid() || unitRecord.textureGenR) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_R);
                unitRecord.textureGenR = false;
            }
            if (!unitRecord.isValid() || unitRecord.textureGenS) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_S);
                unitRecord.textureGenS = false;
            }
            if (!unitRecord.isValid() || unitRecord.textureGenT) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_T);
                unitRecord.textureGenT = false;
            }
        } else if (texture.getEnvironmentalMapMode() == Texture.EM_SPHERE) {
            // generate spherical texture coordinates
            if (!unitRecord.isValid() || unitRecord.textureGenSMode != GL11.GL_SPHERE_MAP) {
                GL11.glTexGeni(GL11.GL_S, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_SPHERE_MAP);
                unitRecord.textureGenSMode = GL11.GL_SPHERE_MAP;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenTMode != GL11.GL_SPHERE_MAP) {
                GL11.glTexGeni(GL11.GL_T, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_SPHERE_MAP);
                unitRecord.textureGenTMode = GL11.GL_SPHERE_MAP;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenQ) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_Q);
                unitRecord.textureGenQ = false;
            }
            if (!unitRecord.isValid() || unitRecord.textureGenR) {
                GL11.glDisable(GL11.GL_TEXTURE_GEN_R);
                unitRecord.textureGenR = false;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenS) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_S);
                unitRecord.textureGenS = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenT) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_T);
                unitRecord.textureGenT = true;
            }
        } else if (texture.getEnvironmentalMapMode() == Texture.EM_EYE_LINEAR) {
            // generate eye linear texture coordinates
            if (!unitRecord.isValid() || unitRecord.textureGenQMode != GL11.GL_EYE_LINEAR) {
                GL11.glTexGeni(GL11.GL_Q, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_EYE_LINEAR);
                unitRecord.textureGenQMode = GL11.GL_EYE_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenRMode != GL11.GL_EYE_LINEAR) {
                GL11.glTexGeni(GL11.GL_R, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_EYE_LINEAR);
                unitRecord.textureGenRMode = GL11.GL_EYE_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenSMode != GL11.GL_EYE_LINEAR) {
                GL11.glTexGeni(GL11.GL_S, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_EYE_LINEAR);
                unitRecord.textureGenSMode = GL11.GL_EYE_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenTMode != GL11.GL_EYE_LINEAR) {
                GL11.glTexGeni(GL11.GL_T, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_EYE_LINEAR);
                unitRecord.textureGenTMode = GL11.GL_EYE_LINEAR;
            }

            record.eyePlaneS.rewind();
            GL11.glTexGen(GL11.GL_S, GL11.GL_EYE_PLANE, record.eyePlaneS);
            record.eyePlaneT.rewind();
            GL11.glTexGen(GL11.GL_T, GL11.GL_EYE_PLANE, record.eyePlaneT);
            record.eyePlaneR.rewind();
            GL11.glTexGen(GL11.GL_R, GL11.GL_EYE_PLANE, record.eyePlaneR);
            record.eyePlaneQ.rewind();
            GL11.glTexGen(GL11.GL_Q, GL11.GL_EYE_PLANE, record.eyePlaneQ);

            if (!unitRecord.isValid() || !unitRecord.textureGenQ) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_Q);
                unitRecord.textureGenQ = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenR) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_R);
                unitRecord.textureGenR = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenS) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_S);
                unitRecord.textureGenS = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenT) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_T);
                unitRecord.textureGenT = true;
            }
        } else if (texture.getEnvironmentalMapMode() == Texture.EM_OBJECT_LINEAR) {
            // generate eye linear texture coordinates
            if (!unitRecord.isValid() || unitRecord.textureGenQMode != GL11.GL_OBJECT_LINEAR) {
                GL11.glTexGeni(GL11.GL_Q, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_OBJECT_LINEAR);
                unitRecord.textureGenSMode = GL11.GL_OBJECT_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenRMode != GL11.GL_OBJECT_LINEAR) {
                GL11.glTexGeni(GL11.GL_R, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_OBJECT_LINEAR);
                unitRecord.textureGenTMode = GL11.GL_OBJECT_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenSMode != GL11.GL_OBJECT_LINEAR) {
                GL11.glTexGeni(GL11.GL_S, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_OBJECT_LINEAR);
                unitRecord.textureGenSMode = GL11.GL_OBJECT_LINEAR;
            }

            if (!unitRecord.isValid() || unitRecord.textureGenTMode != GL11.GL_OBJECT_LINEAR) {
                GL11.glTexGeni(GL11.GL_T, GL11.GL_TEXTURE_GEN_MODE,
                        GL11.GL_OBJECT_LINEAR);
                unitRecord.textureGenTMode = GL11.GL_OBJECT_LINEAR;
            }

            record.eyePlaneS.rewind();
            GL11.glTexGen(GL11.GL_S, GL11.GL_OBJECT_PLANE, record.eyePlaneS);
            record.eyePlaneT.rewind();
            GL11.glTexGen(GL11.GL_T, GL11.GL_OBJECT_PLANE, record.eyePlaneT);
            record.eyePlaneR.rewind();
            GL11.glTexGen(GL11.GL_R, GL11.GL_OBJECT_PLANE, record.eyePlaneR);
            record.eyePlaneQ.rewind();
            GL11.glTexGen(GL11.GL_Q, GL11.GL_OBJECT_PLANE, record.eyePlaneQ);

            if (!unitRecord.isValid() || !unitRecord.textureGenQ) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_Q);
                unitRecord.textureGenQ = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenR) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_R);
                unitRecord.textureGenR = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenS) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_S);
                unitRecord.textureGenS = true;
            }
            if (!unitRecord.isValid() || !unitRecord.textureGenT) {
                GL11.glEnable(GL11.GL_TEXTURE_GEN_T);
                unitRecord.textureGenT = true;
            }
        }
    }

    public static int getGLEnvMode(int apply) {
        switch (apply) {
            case Texture.AM_REPLACE:
                return GL11.GL_REPLACE;
            case Texture.AM_BLEND:
                return GL11.GL_BLEND;
            case Texture.AM_COMBINE:
                return ARBTextureEnvCombine.GL_COMBINE_ARB;
            case Texture.AM_DECAL:
                return GL11.GL_DECAL;
            case Texture.AM_ADD:
                return GL11.GL_ADD;
            case Texture.AM_MODULATE:
            default:
                return GL11.GL_MODULATE;
        }
    }

    public static int getPerspHint(int correction) {
        switch (correction) {
            case TextureState.CM_AFFINE:
                return GL11.GL_FASTEST;
            case TextureState.CM_PERSPECTIVE:
            default:
                return GL11.GL_NICEST;
        }
    }

    // If we support multtexturing, specify the unit we are affecting.
    public static void checkAndSetUnit(int unit, TextureStateRecord record) {
        if (unit >= numTotalTexUnits || !supportsMultiTexture || unit < 0) {
            // ignore this request as it is not valid for the user's hardware.
            return;
        }
        // No need to worry about valid record, since invalidate sets record's
        // currentUnit to -1.
        if (record.currentUnit != unit) {
            ARBMultitexture.glActiveTextureARB(ARBMultitexture.GL_TEXTURE0_ARB + unit);
            record.currentUnit = unit;
        }
    }

    /**
     * Check if the filter settings of this particular texture have been changed and
     * apply as needed.
     * 
     * @param texture
     *            our texture object
     * @param texRecord
     *            our record of the last state of the texture in gl
     * @param record 
     */
    public static void applyFilter(Texture texture, TextureRecord texRecord, int unit, TextureStateRecord record) {
        int magFilter = getGLMagFilter(texture.getFilter());
        // set up magnification filter
        if (!texRecord.isValid() || texRecord.magFilter != magFilter) {
            checkAndSetUnit(unit, record);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                    GL11.GL_TEXTURE_MAG_FILTER, magFilter);
            texRecord.magFilter = magFilter;
        }

        int minFilter = getGLMinFilter(texture.getMipmap());
        // set up mipmap filter
        if (!texRecord.isValid() || texRecord.minFilter != minFilter) {
            checkAndSetUnit(unit, record);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                    GL11.GL_TEXTURE_MIN_FILTER, minFilter);
            texRecord.minFilter = minFilter;
        }
        
        // set up aniso filter
        if (supportsAniso) {
            float aniso = texture.getAnisoLevel() * (maxAnisotropic - 1.0f);
            aniso += 1.0f;
            if (!texRecord.isValid() || texRecord.anisoLevel != aniso) {
                checkAndSetUnit(unit, record);
                GL11.glTexParameterf(GL11.GL_TEXTURE_2D,
                        EXTTextureFilterAnisotropic.GL_TEXTURE_MAX_ANISOTROPY_EXT,
                        aniso);
                texRecord.anisoLevel = aniso;
            }
        }
    }

    public static int getGLMagFilter(int magFilter) {
        switch (magFilter) {
            case Texture.FM_LINEAR:
                return GL11.GL_LINEAR;
            case Texture.FM_NEAREST:
            default: 
                return GL11.GL_NEAREST;
                
        }
    }

    public static int getGLMinFilter(int minFilter) {
        switch (minFilter) {
            case Texture.MM_LINEAR:
                return GL11.GL_LINEAR;
            case Texture.MM_LINEAR_LINEAR:
                return GL11.GL_LINEAR_MIPMAP_LINEAR;
            case Texture.MM_LINEAR_NEAREST:
                return GL11.GL_LINEAR_MIPMAP_NEAREST;
            case Texture.MM_NEAREST:
                return GL11.GL_NEAREST;
            case Texture.MM_NEAREST_NEAREST:
                return GL11.GL_NEAREST_MIPMAP_NEAREST;
            case Texture.MM_NONE:
                return GL11.GL_NEAREST;
            case Texture.MM_NEAREST_LINEAR:
            default: 
                return GL11.GL_NEAREST_MIPMAP_LINEAR;
                
        }
    }

    /**
     * Check if the wrap mode of this particular texture has been changed and
     * apply as needed.
     * 
     * @param texture
     *            our texture object
     * @param texRecord
     *            our record of the last state of the unit in gl
     * @param record 
     */
    public static void applyWrap(Texture texture, TextureRecord texRecord, int unit, TextureStateRecord record) {
        int wrapS = -1;
        int wrapT = -1;
        switch (texture.getWrap()) {
            case Texture.WM_ECLAMP_S_ECLAMP_T:
                wrapS = GL12.GL_CLAMP_TO_EDGE;
                wrapT = GL12.GL_CLAMP_TO_EDGE;
                break;
            case Texture.WM_BCLAMP_S_BCLAMP_T:
                wrapS = ARBTextureBorderClamp.GL_CLAMP_TO_BORDER_ARB;
                wrapT = ARBTextureBorderClamp.GL_CLAMP_TO_BORDER_ARB;
                break;
            case Texture.WM_CLAMP_S_CLAMP_T:
                wrapS = GL11.GL_CLAMP;
                wrapT = GL11.GL_CLAMP;
                break;
            case Texture.WM_CLAMP_S_WRAP_T:
                wrapS = GL11.GL_CLAMP;
                wrapT = GL11.GL_REPEAT;
                break;
            case Texture.WM_WRAP_S_CLAMP_T:
                wrapS = GL11.GL_REPEAT;
                wrapT = GL11.GL_CLAMP;
                break;
            case Texture.WM_MIRRORED_S_MIRRORED_T:
                if (GLContext.getCapabilities().GL_ARB_texture_mirrored_repeat) {
                    wrapS = ARBTextureMirroredRepeat.GL_MIRRORED_REPEAT_ARB;
                    wrapT = ARBTextureMirroredRepeat.GL_MIRRORED_REPEAT_ARB;
                    break;
                }
                // no support, so fall through to wrap/wrap
            case Texture.WM_WRAP_S_WRAP_T:
            default:
                wrapS = GL11.GL_REPEAT;
                wrapT = GL11.GL_REPEAT;
        }
        
        if (!texRecord.isValid() || texRecord.wrapS != wrapS) {
            checkAndSetUnit(unit, record);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                    GL11.GL_TEXTURE_WRAP_S, wrapS);
            texRecord.wrapS = wrapS;
        }
        if (!texRecord.isValid() || texRecord.wrapT != wrapT) {
            checkAndSetUnit(unit, record);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                    GL11.GL_TEXTURE_WRAP_T, wrapT);
            texRecord.wrapT = wrapT;
        }
        
    }
    
    public RenderState extract(Stack stack, SceneElement spat) {
        int mode = spat.getTextureCombineMode();
        if (mode == REPLACE || (mode != OFF && stack.size() == 1)) // todo: use
            // dummy
            // state if
            // off?
            return (LWJGLTextureState) stack.peek();

        // accumulate the textures in the stack into a single LightState object
        LWJGLTextureState newTState = new LWJGLTextureState();
        boolean foundEnabled = false;
        Object states[] = stack.toArray();
        switch (mode) {
            case COMBINE_CLOSEST:
            case COMBINE_RECENT_ENABLED:
                for (int iIndex = states.length - 1; iIndex >= 0; iIndex--) {
                    TextureState pkTState = (TextureState) states[iIndex];
                    if (!pkTState.isEnabled()) {
                        if (mode == COMBINE_RECENT_ENABLED)
                            break;

                        continue;
                    }

                    foundEnabled = true;
                    for (int i = 0, max = pkTState.getNumberOfSetTextures(); i < max; i++) {
                        Texture pkText = pkTState.getTexture(i);
                        if (newTState.getTexture(i) == null) {
                            newTState.setTexture(pkText, i);
                        }
                    }
                }
                break;
            case COMBINE_FIRST:
                for (int iIndex = 0, max = states.length; iIndex < max; iIndex++) {
                    TextureState pkTState = (TextureState) states[iIndex];
                    if (!pkTState.isEnabled())
                        continue;

                    foundEnabled = true;
                    for (int i = 0; i < numTotalTexUnits; i++) {
                        Texture pkText = pkTState.getTexture(i);
                        if (newTState.getTexture(i) == null) {
                            newTState.setTexture(pkText, i);
                        }
                    }
                }
                break;
            case OFF:
                break;
        }
        newTState.setEnabled(foundEnabled);
        return newTState;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jme.scene.state.TextureState#delete(int)
     */
    public void delete(int unit) {
        if (unit < 0 || unit >= texture.size() || texture.get(unit) == null)
            return;
        
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = (TextureStateRecord) context
                .getStateRecord(RS_TEXTURE);

        Texture tex = texture.get(unit);
        int texId = tex.getTextureId();

        IntBuffer id = BufferUtils.createIntBuffer(1);
        id.clear();
        id.put(texId);
        id.rewind();
        tex.setTextureId(0);

        GL11.glDeleteTextures(id);
        
        // if the texture was currently bound glDeleteTextures reverts the binding to 0
        // however we still have to clear it from currentTexture.
        record.removeTextureRecord(texId);
        idCache[unit] = 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jme.scene.state.TextureState#deleteAll()
     */
    public void deleteAll() {
        deleteAll(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jme.scene.state.TextureState#deleteAll()
     */
    public void deleteAll(boolean removeFromCache) {
        
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = (TextureStateRecord) context
                .getStateRecord(RS_TEXTURE);

        IntBuffer id = BufferUtils.createIntBuffer(texture.size());

        for (int i = 0; i < texture.size(); i++) {
            Texture tex = texture.get(i);
            if (removeFromCache) TextureManager.releaseTexture(tex);
            int texId = tex.getTextureId();
            if (tex == null)
                continue;
            id.put(texId);
            tex.setTextureId(0);

            // if the texture was currently bound glDeleteTextures reverts the binding to 0
            // however we still have to clear it from currentTexture.
            record.removeTextureRecord(texId);
            idCache[i] = 0;
        }

        // Now delete them all from GL in one fell swoop.
        id.rewind();
        GL11.glDeleteTextures(id);
    }

    public void deleteTextureId(int textureId) {
        
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = (TextureStateRecord) context
                .getStateRecord(RS_TEXTURE);

        IntBuffer id = BufferUtils.createIntBuffer(1);
        id.clear();
        id.put(textureId);
        id.rewind();
        GL11.glDeleteTextures(id);
        record.removeTextureRecord(textureId);
    }

    @Override
    public StateRecord createStateRecord() {
        return new TextureStateRecord(numTotalTexUnits);
    }

    /**
     * Useful for external lwjgl based classes that need to safely set the
     * current texture.
     */
    public static void doTextureBind(int textureId, int unit) {
        // ask for the current state record
        RenderContext context = DisplaySystem.getDisplaySystem()
                .getCurrentContext();
        TextureStateRecord record = (TextureStateRecord) context
                .getStateRecord(RenderState.RS_TEXTURE);
        context.currentStates[RenderState.RS_TEXTURE] = null;
        checkAndSetUnit(unit, record);
        
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureId);
    }
}