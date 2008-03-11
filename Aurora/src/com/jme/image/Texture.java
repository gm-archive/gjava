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

package com.jme.image;

import java.io.IOException;
import java.io.Serializable;

import com.jme.math.FastMath;
import com.jme.math.Matrix4f;
import com.jme.math.Quaternion;
import com.jme.math.Vector3f;
import com.jme.renderer.ColorRGBA;
import com.jme.util.TextureKey;
import com.jme.util.TextureManager;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;
import com.jme.util.export.Savable;

/**
 * <code>Texture</code> defines a texture object to be used to display an
 * image on a piece of geometry. The image to be displayed is defined by the
 * <code>Image</code> class. All attributes required for texture mapping are
 * contained within this class. This includes mipmapping if desired, filter
 * options, apply options and correction options. Default values are as follows:
 * mipmap - MM_NONE, filter - FM_NEAREST, wrap - WM_CLAMP_S_CLAMP_T, apply -
 * AM_MODULATE, correction - CM_AFFINE.
 * 
 * @see com.jme.image.Image
 * @author Mark Powell
 * @author Joshua Slack
 * @version $Id: Texture.java,v 1.45 2007/11/30 17:45:19 renanse Exp $
 */
public class Texture implements Serializable, Savable {
    private static final long serialVersionUID = -3642148179543729674L;
    
    public static boolean DEFAULT_STORE_TEXTURE = false;

/**
   * Mipmap option for no mipmap.
   */
  public static final int MM_NONE = 0;

  /**
   * Mipmap option to return the value of the texture element that is
   * nearest to the center of the pixel being textured.
   */
  public static final int MM_NEAREST = 1;

  /**
   * Mipmap option to return the weighted average of the four texture
   * elements that are closest to the center of the pixel being textured.
   */
  public static final int MM_LINEAR = 2;

  /**
   * Mipmap option that picks the mipmap that most closely matches the size
   * of the pixel being textured and uses MM_NEAREST criteria.
   */
  public static final int MM_NEAREST_NEAREST = 3;

  /**
   * Mipmap option that picks the mipmap most closely matches the size of the
   * pixel being textured and uses MM_LINEAR criteria.
   */
  public static final int MM_NEAREST_LINEAR = 4;

  /**
   * Mipmap option that picks the two mipmaps that most closely match the
   * size of the pixel being textured and uses MM_NEAREST criteria.
   */
  public static final int MM_LINEAR_NEAREST = 5;

  /**
   * Mipmap option that picks the two mipmaps that most closely match the
   * size of the pixel being textured and uses MM_LINEAR criteria.
   */
  public static final int MM_LINEAR_LINEAR = 6;

  /**
   * Filter option to return the value of the texture element that is
   * nearest to the center of the pixel being textured.
   */
  public static final int FM_NEAREST = 0;

  /**
   * Filter option to return the weighted average of the four texture
   * elements that are closest to the center of the pixel being textured.
   */
  public static final int FM_LINEAR = 1;

  /**
   * Wrapping modifier that clamps both the S and T values of the texture.
   */
  public static final int WM_CLAMP_S_CLAMP_T = 0;

  /**
   * Wrapping modifier that clamps the S value but wraps the T value of the
   * texture.
   */
  public static final int WM_CLAMP_S_WRAP_T = 1;

  /**
   * Wrapping modifier that wraps the S value but clamps the T value of the
   * texture.
   */
  public static final int WM_WRAP_S_CLAMP_T = 2;

  /**
   * Wrapping modifier that wraps both the S and T values of the texture.
   */
  public static final int WM_WRAP_S_WRAP_T = 3;

  /**
   * Wrapping modifier that clamps both the S and T values of the texture.  Uses CLAMP_TO_EDGE.
   */
  public static final int WM_ECLAMP_S_ECLAMP_T = 4;

  /**
   * Wrapping modifier that clamps both the S and T values of the texture.  Uses CLAMP_TO_BORDER.
   */
  public static final int WM_BCLAMP_S_BCLAMP_T = 5;

  /**
   * Wrapping modifier that uses a texture twice the size of the original image with the second half being a
   * mirrored image of the first.  Uses MIRRORED_REPEAT.
   */
  public static final int WM_MIRRORED_S_MIRRORED_T = 6;

  /**
   * Apply modifier that replaces the previous pixel color with the texture
   * color.
   */
  public static final int AM_REPLACE = 0;

  /**
   * Apply modifier that replaces the color values of the pixel but makes
   * use of the alpha values.
   */
  public static final int AM_DECAL = 1;

  /**
   * Apply modifier multiples the color of the pixel with the texture color.
   */
  public static final int AM_MODULATE = 2;

  /**
     * Apply modifier that interpolates the color of the pixel with a blend
     * color using the texture color, such that the final color value is Cv = (1 -
     * Ct) * Cf + BlendColor * Ct Where Ct is the color of the texture and Cf is
     * the initial pixel color.
     */
  public static final int AM_BLEND = 3;

  /**
   * Apply modifier combines two textures.
   */
  public static final int AM_COMBINE = 4;

  /**
   * Apply modifier adds two textures.
   */
  public static final int AM_ADD = 5; //note: this is currently considered the last index

  public static final int ACF_REPLACE = 0;
  public static final int ACF_MODULATE = 1;
  public static final int ACF_ADD = 2;
  public static final int ACF_ADD_SIGNED = 3;
  public static final int ACF_SUBTRACT = 4;
  public static final int ACF_INTERPOLATE = 5;
  public static final int ACF_DOT3_RGB = 6;
  public static final int ACF_DOT3_RGBA = 7;

  public static final int ACS_TEXTURE = 0;
  public static final int ACS_PRIMARY_COLOR = 1;
  public static final int ACS_CONSTANT = 2;
  public static final int ACS_PREVIOUS = 3;
  public static final int ACS_TEXTURE0 = 4;
  public static final int ACS_TEXTURE1 = 5;
  public static final int ACS_TEXTURE2 = 6;
  public static final int ACS_TEXTURE3 = 7;
  public static final int ACS_TEXTURE4 = 8;
  public static final int ACS_TEXTURE5 = 9;
  public static final int ACS_TEXTURE6 = 10;
  public static final int ACS_TEXTURE7 = 11;
  public static final int ACS_TEXTURE8 = 12;
  public static final int ACS_TEXTURE9 = 13;
  public static final int ACS_TEXTURE10 = 14;
  public static final int ACS_TEXTURE11 = 15;
  public static final int ACS_TEXTURE12 = 16;
  public static final int ACS_TEXTURE13 = 17;
  public static final int ACS_TEXTURE14 = 18;
  public static final int ACS_TEXTURE15 = 19;
  public static final int ACS_TEXTURE16 = 20;
  public static final int ACS_TEXTURE17 = 21;
  public static final int ACS_TEXTURE18 = 22;
  public static final int ACS_TEXTURE19 = 23;
  public static final int ACS_TEXTURE20 = 24;
  public static final int ACS_TEXTURE21 = 25;
  public static final int ACS_TEXTURE22 = 26;
  public static final int ACS_TEXTURE23 = 27;
  public static final int ACS_TEXTURE24 = 28;
  public static final int ACS_TEXTURE25 = 29;
  public static final int ACS_TEXTURE26 = 30;
  public static final int ACS_TEXTURE27 = 31;
  public static final int ACS_TEXTURE28 = 32;
  public static final int ACS_TEXTURE29 = 33;
  public static final int ACS_TEXTURE30 = 34;
  public static final int ACS_TEXTURE31 = 35;

  public static final int ACO_SRC_COLOR = 0;
  public static final int ACO_ONE_MINUS_SRC_COLOR = 1;
  public static final int ACO_SRC_ALPHA = 2;
  public static final int ACO_ONE_MINUS_SRC_ALPHA = 3;

  public static final int ACSC_ONE = 0;
  public static final int ACSC_TWO = 1;
  public static final int ACSC_FOUR = 2;

  public static final int EM_NONE = 0;
  public static final int EM_EYE_LINEAR = 1;
  public static final int EM_SPHERE = 2;
  public static final int EM_OBJECT_LINEAR = 4;

  public static final int RTT_SOURCE_RGB = 0;
  public static final int RTT_SOURCE_RGBA = 1;
  public static final int RTT_SOURCE_DEPTH = 2;
  public static final int RTT_SOURCE_LUMINANCE = 3;
  public static final int RTT_SOURCE_LUMINANCE_ALPHA = 4;
  public static final int RTT_SOURCE_ALPHA = 5;
  public static final int RTT_SOURCE_INTENSITY = 6;

  // Optional String to point to where this texture is located
  private String imageLocation;

  //texture attributes.
  private Image image;
  private ColorRGBA blendColor;

  private Vector3f translation;
  private Vector3f scale;
  private Quaternion rotation;
  private Matrix4f matrix;

  private float anisoLevel = 0.0f;

  private int mipmapState;
  private transient int textureId;
  private int apply;
  private int wrap;
  private int filter;
  private int envMapMode;
  private int rttSource;
  private int memReq;

  //only used if combine apply mode on
  private int combineFuncRGB;
  private int combineFuncAlpha;
  private int combineSrc0RGB = ACS_TEXTURE;
  private int combineSrc1RGB = ACS_PREVIOUS;
  private int combineSrc2RGB = ACS_CONSTANT;
  private int combineSrc0Alpha;
  private int combineSrc1Alpha;
  private int combineSrc2Alpha;
  private int combineOp0RGB = ACO_SRC_COLOR;
  private int combineOp1RGB = ACO_SRC_COLOR;
  private int combineOp2RGB = ACO_SRC_ALPHA;
  private int combineOp0Alpha;
  private int combineOp1Alpha;
  private int combineOp2Alpha;
  private float combineScaleRGB;
  private float combineScaleAlpha;

  private TextureKey key;
  private transient boolean storeTexture = DEFAULT_STORE_TEXTURE;

  /**
   * Constructor instantiates a new <code>Texture</code> object with
   * default attributes.
   *
   */
  public Texture() {
    mipmapState = MM_NONE;
    filter = FM_NEAREST;
    apply = AM_MODULATE;
    wrap = WM_ECLAMP_S_ECLAMP_T;
    setBlendColor(new ColorRGBA(0, 0, 0, 0));
    combineScaleRGB = 1.0f;
    combineScaleAlpha = 1.0f;
    rttSource = Texture.RTT_SOURCE_RGBA;
    memReq = 0;
  }

  /**
   * <code>setBlendColorBuffer</code> sets the buffer that contains the
   * color values that are used to tint the texture.
   * @param blendColor the buffer that contains the texture tint color.
   */
  public void setBlendColor(ColorRGBA blendColor) {
    this.blendColor = blendColor;
  }

  /**
   * <code>getMipmapState</code> returns the current mipmap state of this
   * texture.
   * @return the mipmap state of this texture.
   */
  public int getMipmapState() {
    return mipmapState;
  }

  /**
   * <code>setMipmapState</code> sets the mipmap state for this texture.
   * If the state is invalid it is set to MM_NONE.
   * @param mipmapState the new mipmap state.
   */
  public void setMipmapState(int mipmapState) {
    if (mipmapState < 0 || mipmapState > 6) {
      mipmapState = MM_NONE;
    }
    this.mipmapState = mipmapState;
  }

  /**
   * <code>setApply</code> sets the apply mode for this texture. If an
   * invalid value is passed, it is set to AM_MODULATE;
   * @param apply the apply mode for this texture.
   */
  public void setApply(int apply) {
    if (apply < AM_REPLACE || apply > AM_ADD) {
      apply = AM_MODULATE;
    }
    this.apply = apply;
  }

  /**
   * <code>setFilter</code> sets the texture filter mode for this
   * texture. If an invalid value is passed, it is set to FM_NEAREST.
   * @param filter the filter mode for this texture.
   */
  public void setFilter(int filter) {
    if (filter < 0 || filter > 1) {
      filter = FM_NEAREST;
    }
    this.filter = filter;
  }

  /**
   * <code>setImage</code> sets the image object that defines the texture.
   * @param image the image that defines the texture.
   */
  public void setImage(Image image) {
    this.image = image;
    updateMemoryReq();
  }

  /**
   * <code>setWrap</code> sets the wrap mode of this texture. If an invalid
   * value is passed, it is set to WM_ECLAMP_S_ECLAMP_T.
   * @param wrap the wrap mode for this texture.
   */
  public void setWrap(int wrap) {
    if (wrap < 0 || wrap > 6) {
      wrap = WM_ECLAMP_S_ECLAMP_T;
    }
    this.wrap = wrap;
  }

  /**
   * <code>getTextureId</code> returns the texture id of this texture. This
   * id is required to be unique to any other texture objects running in the
   * same JVM. However, no guarantees are made that it will be unique, and as
   * such, the user is responsible for this.
   * @return the id of the texture.
   */
  public int getTextureId() {
    return textureId;
  }

  /**
   * <code>setTextureId</code> sets the texture id for this
   * texture. Zero means no id is set.
   * @param textureId the texture id of this texture.
   */
  public void setTextureId(int textureId) {
    this.textureId = textureId;
  }

  /**
   *
   * <code>getImage</code> returns the image data that makes up this texture.
   * If no image data has been set, this will return null.
   * @return the image data that makes up the texture.
   */
  public Image getImage() {
    return image;
  }

  /**
   *
   * <code>getMipmap</code> returns the mipmap mode for the texture.
   * @return the mipmap mode of the texture.
   */
  public int getMipmap() {
    return mipmapState;
  }

  /**
   * <code>getApply</code> returns the apply mode for the texture.
   * @return the apply mode of the texture.
   */
  public int getApply() {
    return apply;
  }

  /**
   * <code>getBlendColor</code> returns the buffer that contains the
   * texture's tint color.
   * @return the buffer that contains the texture's tint color.
   */
  public ColorRGBA getBlendColor() {
    return blendColor;
  }

  /**
   * <code>getWrap</code> returns the wrap mode for the texture.
   * @return the wrap mode of the texture.
   */
  public int getWrap() {
    return wrap;
  }

  /**
   * <code>getFilter</code> returns the filter mode for the texture.
   * @return the filter mode of the texture.
   */
  public int getFilter() {
    return filter;
  }

  /**
   * @return Returns the combineFuncRGB.
   */
  public int getCombineFuncRGB() {
    return combineFuncRGB;
  }

  /**
   * @param combineFuncRGB The combineFuncRGB to set.
   */
  public void setCombineFuncRGB(int combineFuncRGB) {
    this.combineFuncRGB = combineFuncRGB;
  }

  /**
   * @return Returns the combineOp0Alpha.
   */
  public int getCombineOp0Alpha() {
    return combineOp0Alpha;
  }

  /**
   * @param combineOp0Alpha The combineOp0Alpha to set.
   */
  public void setCombineOp0Alpha(int combineOp0Alpha) {
    this.combineOp0Alpha = combineOp0Alpha;
  }

  /**
   * @return Returns the combineOp0RGB.
   */
  public int getCombineOp0RGB() {
    return combineOp0RGB;
  }

  /**
   * @param combineOp0RGB The combineOp0RGB to set.
   */
  public void setCombineOp0RGB(int combineOp0RGB) {
    this.combineOp0RGB = combineOp0RGB;
  }

  /**
   * @return Returns the combineOp1Alpha.
   */
  public int getCombineOp1Alpha() {
    return combineOp1Alpha;
  }

  /**
   * @param combineOp1Alpha The combineOp1Alpha to set.
   */
  public void setCombineOp1Alpha(int combineOp1Alpha) {
    this.combineOp1Alpha = combineOp1Alpha;
  }

  /**
   * @return Returns the combineOp1RGB.
   */
  public int getCombineOp1RGB() {
    return combineOp1RGB;
  }

  /**
   * @param combineOp1RGB The combineOp1RGB to set.
   */
  public void setCombineOp1RGB(int combineOp1RGB) {
    this.combineOp1RGB = combineOp1RGB;
  }

  /**
   * @return Returns the combineOp2Alpha.
   */
  public int getCombineOp2Alpha() {
    return combineOp2Alpha;
  }

  /**
   * @param combineOp2Alpha The combineOp2Alpha to set.
   */
  public void setCombineOp2Alpha(int combineOp2Alpha) {
    this.combineOp2Alpha = combineOp2Alpha;
  }

  /**
   * @return Returns the combineOp2RGB.
   */
  public int getCombineOp2RGB() {
    return combineOp2RGB;
  }

  /**
   * @param combineOp2RGB The combineOp2RGB to set.
   */
  public void setCombineOp2RGB(int combineOp2RGB) {
    this.combineOp2RGB = combineOp2RGB;
  }

  /**
   * @return Returns the combineScaleAlpha.
   */
  public float getCombineScaleAlpha() {
    return combineScaleAlpha;
  }

  /**
   * @param combineScaleAlpha The combineScaleAlpha to set.
   */
  public void setCombineScaleAlpha(float combineScaleAlpha) {
    this.combineScaleAlpha = combineScaleAlpha;
  }

  /**
   * @return Returns the combineScaleRGB.
   */
  public float getCombineScaleRGB() {
    return combineScaleRGB;
  }

  /**
   * @param combineScaleRGB The combineScaleRGB to set.
   */
  public void setCombineScaleRGB(float combineScaleRGB) {
    this.combineScaleRGB = combineScaleRGB;
  }

  /**
   * @return Returns the combineSrc0Alpha.
   */
  public int getCombineSrc0Alpha() {
    return combineSrc0Alpha;
  }

  /**
   * @param combineSrc0Alpha The combineSrc0Alpha to set.
   */
  public void setCombineSrc0Alpha(int combineSrc0Alpha) {
    this.combineSrc0Alpha = combineSrc0Alpha;
  }

  /**
   * @return Returns the combineSrc0RGB.
   */
  public int getCombineSrc0RGB() {
    return combineSrc0RGB;
  }

  /**
   * @param combineSrc0RGB The combineSrc0RGB to set.
   */
  public void setCombineSrc0RGB(int combineSrc0RGB) {
    this.combineSrc0RGB = combineSrc0RGB;
  }

  /**
   * @return Returns the combineSrc1Alpha.
   */
  public int getCombineSrc1Alpha() {
    return combineSrc1Alpha;
  }

  /**
   * @param combineSrc1Alpha The combineSrc1Alpha to set.
   */
  public void setCombineSrc1Alpha(int combineSrc1Alpha) {
    this.combineSrc1Alpha = combineSrc1Alpha;
  }

  /**
   * @return Returns the combineSrc1RGB.
   */
  public int getCombineSrc1RGB() {
    return combineSrc1RGB;
  }

  /**
   * @param combineSrc1RGB The combineSrc1RGB to set.
   */
  public void setCombineSrc1RGB(int combineSrc1RGB) {
    this.combineSrc1RGB = combineSrc1RGB;
  }

  /**
   * @return Returns the combineSrc2Alpha.
   */
  public int getCombineSrc2Alpha() {
    return combineSrc2Alpha;
  }

  /**
   * @param combineSrc2Alpha The combineSrc2Alpha to set.
   */
  public void setCombineSrc2Alpha(int combineSrc2Alpha) {
    this.combineSrc2Alpha = combineSrc2Alpha;
  }

  /**
   * @return Returns the combineSrc2RGB.
   */
  public int getCombineSrc2RGB() {
    return combineSrc2RGB;
  }

  /**
   * @param combineSrc2RGB The combineSrc2RGB to set.
   */
  public void setCombineSrc2RGB(int combineSrc2RGB) {
    this.combineSrc2RGB = combineSrc2RGB;
  }

  /**
   * @return Returns the combineFuncAlpha.
   */
  public int getCombineFuncAlpha() {
    return combineFuncAlpha;
  }

  /**
   * @param combineFuncAlpha The combineFuncAlpha to set.
   */
  public void setCombineFuncAlpha(int combineFuncAlpha) {
    this.combineFuncAlpha = combineFuncAlpha;
  }

  public void setEnvironmentalMapMode(int envMapMode) {
    this.envMapMode = envMapMode;
  }

  public int getEnvironmentalMapMode() {
    return envMapMode;
  }

  public String getImageLocation() {
    return imageLocation;
  }

  public void setImageLocation(String imageLocation) {
    this.imageLocation = imageLocation;
  }

  /**
   * @return the anisotropic filtering level for this texture as a percentage
   *         (0.0 - 1.0)
   */
  public float getAnisoLevel() {
    return anisoLevel;
  }

  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (! (other instanceof Texture)) {
      return false;
    }
    Texture that = (Texture) other;
    if (this.textureId != that.textureId)return false;
    if (this.textureId == 0) {
      if (this.getImage() != null && !this.getImage().equals(that.getImage()))return false;
      if (this.getImage() == null && that.getImage() != null)return false;
      if (this.getAnisoLevel() != that.getAnisoLevel())return false;
      if (this.getApply() != that.getApply())return false;
      if (this.getCombineFuncAlpha() != that.getCombineFuncAlpha())return false;
      if (this.getCombineFuncRGB() != that.getCombineFuncRGB())return false;
      if (this.getCombineOp0Alpha() != that.getCombineOp0Alpha())return false;
      if (this.getCombineOp1RGB() != that.getCombineOp1RGB())return false;
      if (this.getCombineOp2Alpha() != that.getCombineOp2Alpha())return false;
      if (this.getCombineOp2RGB() != that.getCombineOp2RGB())return false;
      if (this.getCombineScaleAlpha() != that.getCombineScaleAlpha())return false;
      if (this.getCombineScaleRGB() != that.getCombineScaleRGB())return false;
      if (this.getCombineSrc0Alpha() != that.getCombineSrc0Alpha())return false;
      if (this.getCombineSrc0RGB() != that.getCombineSrc0RGB())return false;
      if (this.getCombineSrc1Alpha() != that.getCombineSrc1Alpha())return false;
      if (this.getCombineSrc1RGB() != that.getCombineSrc1RGB())return false;
      if (this.getCombineSrc2Alpha() != that.getCombineSrc2Alpha())return false;
      if (this.getCombineSrc2RGB() != that.getCombineSrc2RGB())return false;
      if (this.getEnvironmentalMapMode() != that.getEnvironmentalMapMode())return false;
      if (this.getFilter() != that.getFilter())return false;
      if (this.getMipmap() != that.getMipmap())return false;
      if (this.getMipmapState() != that.getMipmapState())return false;
      if (this.getWrap() != that.getWrap())return false;
      if (this.getBlendColor() != null &&
          !this.getBlendColor().equals(that.getBlendColor()))return false;
      if (this.getBlendColor() == null && that.getBlendColor() != null)return false;
    }
    return true;
  }

  public Texture createSimpleClone() {
      Texture rVal = new Texture();
      return createSimpleClone(rVal);
  }

  /**
   * Retreive a basic clone of this Texture (ie, clone everything but the image data, which is shared)
   * @return Texture
   */
  public Texture createSimpleClone(Texture rVal) {
    rVal.setApply(apply);
    rVal.setCombineFuncAlpha(combineFuncAlpha);
    rVal.setCombineFuncRGB(combineFuncRGB);
    rVal.setCombineOp0Alpha(combineOp0Alpha);
    rVal.setCombineOp0RGB(combineOp0RGB);
    rVal.setCombineOp1Alpha(combineOp1Alpha);
    rVal.setCombineOp1RGB(combineOp1RGB);
    rVal.setCombineOp2Alpha(combineOp2Alpha);
    rVal.setCombineOp2RGB(combineOp2RGB);
    rVal.setCombineScaleAlpha(combineScaleAlpha);
    rVal.setCombineScaleRGB(combineScaleRGB);
    rVal.setCombineSrc0Alpha(combineSrc0Alpha);
    rVal.setCombineSrc0RGB(combineSrc0RGB);
    rVal.setCombineSrc1Alpha(combineSrc1Alpha);
    rVal.setCombineSrc1RGB(combineSrc1RGB);
    rVal.setCombineSrc2Alpha(combineSrc2Alpha);
    rVal.setCombineSrc2RGB(combineSrc2RGB);
    rVal.setEnvironmentalMapMode(envMapMode);
    rVal.setFilter(filter);
    rVal.setAnisoLevel(anisoLevel);
    rVal.setImage(image);  // NOT CLONED.
    rVal.memReq = memReq;
    rVal.setImageLocation(imageLocation);
    rVal.setMipmapState(mipmapState);
    rVal.setTextureId(textureId);
    rVal.setWrap(wrap);
    rVal.setBlendColor(blendColor != null ? blendColor.clone() : null);
    if (scale != null)
        rVal.setScale(scale);
    if (translation != null)
        rVal.setTranslation(translation);
    if (rotation != null)
        rVal.setRotation(rotation);
    if (matrix != null)
        rVal.setMatrix(matrix);
    return rVal;
  }
    /**
     * @return Returns the rotation.
     */
    public Quaternion getRotation() {
        return rotation;
    }
    /**
     * @param rotation The rotation to set.
     */
    public void setRotation(Quaternion rotation) {
        this.rotation = rotation;
    }
    /**
     * @return the texture matrix set on this texture or null if none is set.
     */
    public Matrix4f getMatrix() {
        return matrix;
    }
    /**
     * @param matrix The matrix to set on this Texture.  If null, rotation, scale and/or translation will be used.
     */
    public void setMatrix(Matrix4f matrix) {
        this.matrix = matrix;
    }
	/**
	 * @return Returns the scale.
	 */
	public Vector3f getScale() {
	    return scale;
	}
	/**
	 * @param scale The scale to set.
	 */
	public void setScale(Vector3f scale) {
	    this.scale = scale;
	}
	/**
	 * @return Returns the translation.
	 */
	public Vector3f getTranslation() {
	    return translation;
	}
	/**
	 * @param translation The translation to set.
	 */
	public void setTranslation(Vector3f translation) {
	    this.translation = translation;
	}
	/**
     * @return Returns the rttSource.
     */
    public int getRTTSource() {
        return rttSource;
    }

    /**
     * @param rttSource The rttSource to set.
     */
    public void setRTTSource(int rttSource) {
        this.rttSource = rttSource;
    }

    /**
     *
     * @return the estimated footprint of this texture in bytes
     */
    public int getMemoryReq() {
        return memReq;
    }

    public void updateMemoryReq() {
        if (image != null) {
            int width = image.getWidth(), height = image.getHeight();
            memReq = width * height;
            switch (image.getType()) {
                case Image.RGBA4444:  // 16 bit
                case Image.RGBA5551:
                case Image.RA88:
                    memReq *= 2;
                    break;
                case Image.RGB888:  // 24 bit
                    memReq *=  3;
                    break;
                case Image.RGBA8888:  // 32 bit
                    memReq *= 4;
                    break;
                case Image.DXT1_NATIVE:  // DXT1 = 1/8 * blocksize of 8
                case Image.DXT1A_NATIVE:
                case Image.RGB888_DXT1:
                    memReq *= (.125 * 8);
                    break;
                case Image.DXT3_NATIVE:  // DXT3,5 = 1/8 * blocksize of 16
                case Image.DXT5_NATIVE:
                case Image.RGBA8888_DXT1A:
                case Image.RGBA8888_DXT3:
                case Image.RGBA8888_DXT5:
                    memReq *= (.125 * 16);
                    break;
            }
            if (this.getMipmap() >= Texture.MM_NEAREST_NEAREST || image.hasMipmaps()) {
                if (FastMath.isPowerOfTwo(image.getWidth()) && FastMath.isPowerOfTwo(image.getHeight()))
                    memReq *= 1.33333f;
                else
                    memReq *= 2.0f;
            }
        }
    }

    /**
     * Used with Serialization. Do not call this directly.
     *
     * @param s
     * @throws IOException
     * @throws ClassNotFoundException
     * @see java.io.Serializable
     */
    private void readObject(java.io.ObjectInputStream s) throws IOException,
            ClassNotFoundException {
        s.defaultReadObject();
        textureId = 0;
    }

    public void write(JMEExporter e) throws IOException {
        
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(imageLocation, "imageLocation", null);
        if(storeTexture) {
            capsule.write(image, "image", null);
        }
        capsule.write(blendColor, "blendColor", null);
        capsule.write(translation, "translation", null);
        capsule.write(scale, "scale", null);
        capsule.write(rotation, "rotation", null);
        capsule.write(matrix, "matrix", null);
        capsule.write(anisoLevel, "anisoLevel", 1);
        capsule.write(mipmapState, "mipmapState", MM_NONE);
        capsule.write(apply, "apply", AM_MODULATE);
        capsule.write(wrap, "wrap", WM_ECLAMP_S_ECLAMP_T);
        capsule.write(filter, "filter", FM_NEAREST);
        capsule.write(envMapMode, "envMapMode", 0);
        capsule.write(rttSource, "rttSource", RTT_SOURCE_RGBA);
        capsule.write(memReq, "memReq", 0);
        capsule.write(combineFuncRGB, "combineFuncRGB", ACF_REPLACE);
        capsule.write(combineFuncAlpha, "combineFuncAlpha", ACF_REPLACE);
        capsule.write(combineSrc0RGB, "combineSrc0RGB", ACS_TEXTURE);
        capsule.write(combineSrc1RGB, "combineSrc1RGB", ACS_PREVIOUS);
        capsule.write(combineSrc2RGB, "combineSrc2RGB", ACS_CONSTANT);
        capsule.write(combineSrc0Alpha, "combineSrc0Alpha", ACS_TEXTURE);
        capsule.write(combineSrc1Alpha, "combineSrc1Alpha", ACS_TEXTURE);
        capsule.write(combineSrc2Alpha, "combineSrc2Alpha", ACS_TEXTURE);
        capsule.write(combineOp0RGB, "combineOp0RGB", ACO_SRC_COLOR);
        capsule.write(combineOp1RGB, "combineOp1RGB", ACO_SRC_COLOR);
        capsule.write(combineOp2RGB, "combineOp2RGB", ACO_SRC_ALPHA);
        capsule.write(combineOp0Alpha, "combineOp0Alpha", ACO_SRC_COLOR);
        capsule.write(combineOp1Alpha, "combineOp1Alpha", ACO_SRC_COLOR);
        capsule.write(combineOp2Alpha, "combineOp2Alpha", ACO_SRC_COLOR);
        capsule.write(combineScaleRGB, "combineScaleRGB", 1);
        capsule.write(combineScaleAlpha, "combineScaleAlpha", 1);
        if(!storeTexture) {
            capsule.write(key, "textureKey", null);
        }
    }

    public void read(JMEImporter e) throws IOException {
        InputCapsule capsule = e.getCapsule(this);
        imageLocation = capsule.readString("imageLocation", null);
        image = (Image) capsule.readSavable("image", null);
        if (image == null) {
            key = (TextureKey) capsule.readSavable("textureKey", null);
            if (key != null && key.getLocation() != null) {
                TextureManager.loadTexture(this, key);
            }
        }
        blendColor = (ColorRGBA)capsule.readSavable("blendColor", null);
        translation = (Vector3f)capsule.readSavable("translation", null);
        scale = (Vector3f)capsule.readSavable("scale", null);
        rotation = (Quaternion)capsule.readSavable("rotation", null);
        matrix = (Matrix4f)capsule.readSavable("matrix", null);
        anisoLevel = capsule.readFloat("anisoLevel", 1);
        mipmapState = capsule.readInt("mipmapState", MM_NONE);
        apply = capsule.readInt("apply", AM_MODULATE);
        wrap = capsule.readInt("wrap", WM_ECLAMP_S_ECLAMP_T);
        filter = capsule.readInt("filter", FM_NEAREST);
        envMapMode = capsule.readInt("envMapMode", 0);
        rttSource = capsule.readInt("rttSource", RTT_SOURCE_RGBA);
        memReq = capsule.readInt("memReq", 0);
        combineFuncRGB = capsule.readInt("combineFuncRGB", ACF_REPLACE);
        combineFuncAlpha = capsule.readInt("combineFuncAlpha", ACF_REPLACE);
        combineSrc0RGB = capsule.readInt("combineSrc0RGB", ACS_TEXTURE);
        combineSrc1RGB = capsule.readInt("combineSrc1RGB", ACS_PREVIOUS);
        combineSrc2RGB = capsule.readInt("combineSrc2RGB", ACS_CONSTANT);
        combineSrc0Alpha = capsule.readInt("combineSrc0Alpha", ACS_TEXTURE);
        combineSrc1Alpha = capsule.readInt("combineSrc1Alpha", ACS_TEXTURE);
        combineSrc2Alpha = capsule.readInt("combineSrc2Alpha", ACS_TEXTURE);
        combineOp0RGB = capsule.readInt("combineOp0RGB", ACO_SRC_COLOR);
        combineOp1RGB = capsule.readInt("combineOp1RGB", ACO_SRC_COLOR);
        combineOp2RGB = capsule.readInt("combineOp2RGB", ACO_SRC_ALPHA);
        combineOp0Alpha = capsule.readInt("combineOp0Alpha", ACO_SRC_COLOR);
        combineOp1Alpha = capsule.readInt("combineOp1Alpha", ACO_SRC_COLOR);
        combineOp2Alpha = capsule.readInt("combineOp2Alpha", ACO_SRC_COLOR);
        combineScaleRGB = capsule.readFloat("combineScaleRGB", 1);
        combineScaleAlpha = capsule.readFloat("combineScaleAlpha", 1);
    }
    
    public Class getClassTag() {
        return this.getClass();
    }

    public void setTextureKey(TextureKey tkey) {
         this.key = tkey;   
    }
    
    public TextureKey getTextureKey() {
        return key;
    }

    public boolean isStoreTexture() {
        return storeTexture;
    }

    public void setStoreTexture(boolean storeTexture) {
        this.storeTexture = storeTexture;
    }

    /**
     * @param level the anisotropic filtering level for this texture as a percentage
     *         (0.0 - 1.0)
     */
    public void setAnisoLevel(float level) {
    	    if (level > 1.0f) level = 1.0f;
    	    else if (level < 0.0f) level = 0.0f;
        this.anisoLevel = level;
    }
}