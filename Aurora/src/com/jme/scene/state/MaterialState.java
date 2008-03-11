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

import com.jme.renderer.ColorRGBA;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;

/**
 * <code>MaterialState</code> defines a state to define an objects material
 * settings. Material is defined by the emissive quality of the object, the
 * ambient color, diffuse color and specular color. The material also defines
 * the shininess of the object and the alpha value of the object.
 * 
 * @author Mark Powell
 * @author Joshua Slack - Material Face and Performance enhancements
 * @author Three Rings - contributed color material
 * @version $Id: MaterialState.java,v 1.16 2007/09/21 15:45:29 nca Exp $
 */
public abstract class MaterialState extends RenderState {
    /** Geometry colors are ignored. This is default. */
    public static final int CM_NONE = 0;
    
    /** Geometry colors determine material ambient color. */
    public static final int CM_AMBIENT = 1;
    
    /** Geometry colors determine material diffuse color. */
    public static final int CM_DIFFUSE = 2;
    
    /** Geometry colors determine material ambient and diffuse colors. */
    public static final int CM_AMBIENT_AND_DIFFUSE = 3;
    
    /** Geometry colors determine material specular colors. */
    public static final int CM_SPECULAR = 4;
    
    /** Geometry colors determine material emissive color. */
    public static final int CM_EMISSIVE = 5;
    
    /** Apply materials to front face only. This is default. */
    public static final int MF_FRONT = 0;
    
    /** Apply materials to back face only. */
    public static final int MF_BACK = 1;
    
    /** Apply materials to front and back faces. */
    public static final int MF_FRONT_AND_BACK = 2;

    
    /** Default ambient color for all material states. */
    public static final ColorRGBA defaultAmbient = new ColorRGBA(0.2f, 0.2f,
            0.2f, 1.0f);
    
    /** Default diffuse color for all material states. */
    public static final ColorRGBA defaultDiffuse = new ColorRGBA(0.8f, 0.8f,
            0.8f, 1.0f);
    
    /** Default specular color for all material states. */
    public static final ColorRGBA defaultSpecular = new ColorRGBA(0.0f, 0.0f,
            0.0f, 1.0f);
    
    /** Default emissive color for all material states. */
    public static final ColorRGBA defaultEmissive = new ColorRGBA(0.0f, 0.0f,
            0.0f, 1.0f);
    
    /** Default shininess for all material states. */
    public static final float defaultShininess = 0.0f;

    /** Default color material mode for all material states. */
    public static final int defaultColorMaterial = CM_NONE;

    /** Default material face for all material states. */
    public static final int defaultMaterialFace = MF_FRONT;

    // attributes of the material
    protected ColorRGBA ambient;
    protected ColorRGBA diffuse;
    protected ColorRGBA specular;
    protected ColorRGBA emissive;
    protected float shininess;
    protected int colorMaterial;
    protected int materialFace;

    /**
     * Constructor instantiates a new <code>MaterialState</code> object.
     */
    public MaterialState() {
        emissive = defaultEmissive.clone();
        ambient = defaultAmbient.clone();
        diffuse = defaultDiffuse.clone();
        specular = defaultSpecular.clone();
        shininess = defaultShininess;
        colorMaterial = defaultColorMaterial;
        materialFace = defaultMaterialFace;
    }

    /**
     * <code>getAmbient</code> retreives the ambient color of the material.
     * 
     * @return the color of the ambient value.
     */
    public ColorRGBA getAmbient() {
        return ambient;
    }

    /**
     * <code>setAmbient</code> sets the ambient color of the material.
     * 
     * @param ambient
     *            the ambient color of the material.
     */
    public void setAmbient(ColorRGBA ambient) {
        this.ambient.set(ambient);
        setNeedsRefresh(true);
    }

    /**
     * <code>getDiffuse</code> retrieves the diffuse color of the material.
     * 
     * @return the color of the diffuse value.
     */
    public ColorRGBA getDiffuse() {
        return diffuse;
    }

    /**
     * <code>setDiffuse</code> sets the diffuse color of the material.
     * 
     * @param diffuse
     *            the diffuse color of the material.
     */
    public void setDiffuse(ColorRGBA diffuse) {
        this.diffuse.set(diffuse);
        setNeedsRefresh(true);
    }

    /**
     * <code>getEmissive</code> retrieves the emissive color of the material.
     * 
     * @return the color of the emissive value.
     */
    public ColorRGBA getEmissive() {
        return emissive;
    }

    /**
     * <code>setEmissive</code> sets the emissive color of the material.
     * 
     * @param emissive
     *            the emissive color of the material.
     */
    public void setEmissive(ColorRGBA emissive) {
        this.emissive.set(emissive);
        setNeedsRefresh(true);
    }

    /**
     * <code>getShininess</code> retrieves the shininess value of the
     * material.
     * 
     * @return the shininess value of the material.
     */
    public float getShininess() {
        return shininess;
    }

    /**
     * <code>setShininess</code> sets the shininess of the material.
     * 
     * @param shininess
     *            the shininess of the material.  Must be between 0 and 128.
     */
    public void setShininess(float shininess) {
        if (shininess < 0 || shininess > 128) {
            throw new IllegalArgumentException("Shininess must be between 0 and 128.");
        }
        this.shininess = shininess;
        setNeedsRefresh(true);
    }

    /**
     * <code>getSpecular</code> retrieves the specular color of the material.
     * 
     * @return the specular color of the material.
     */
    public ColorRGBA getSpecular() {
        return specular;
    }

    /**
     * <code>setSpecular</code> sets the specular color of the material.
     * 
     * @param specular
     *            the specular color of the material.
     */
    public void setSpecular(ColorRGBA specular) {
        this.specular.set(specular);
        setNeedsRefresh(true);
    }

    /**
     * <code>getColorMaterial</code> retrieves the color material mode, which
     * determines how geometry colors affect the material.
     * 
     * @return the color material mode
     */
    public int getColorMaterial() {
        return colorMaterial;
    }

    /**
     * <code>setColorMaterial</code> sets the color material mode.
     * 
     * @param colorMaterial
     *            the color material mode
     */
    public void setColorMaterial(int colorMaterial) {
        this.colorMaterial = colorMaterial;
        setNeedsRefresh(true);
    }

    /**
     * <code>getMaterialFace</code> retrieves the face this material state
     * affects.
     * 
     * @return one of MF_FRONT, MF_BACK or MF_FRONT_AND_BACK
     */
    public int getMaterialFace() {
        return materialFace;
    }

    /**
     * <code>setMaterialFace</code> sets the face this material state affects.
     * 
     * @param materialFace
     *            one of MF_FRONT, MF_BACK or MF_FRONT_AND_BACK
     */
    public void setMaterialFace(int materialFace) {
        this.materialFace = materialFace;
        setNeedsRefresh(true);
    }

    /**
     * <code>getType</code> returns the render state type of this.
     * (RS_MATERIAL).
     * 
     * @see com.jme.scene.state.RenderState#getType()
     */
    public int getType() {
        return RS_MATERIAL;
    }
    
    public void write(JMEExporter e) throws IOException {
        super.write(e);
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(ambient, "ambient", ColorRGBA.black);
        capsule.write(diffuse, "diffuse", ColorRGBA.black);
        capsule.write(specular, "specular", ColorRGBA.black);
        capsule.write(emissive, "emissive", ColorRGBA.black);
        capsule.write(shininess, "shininess", defaultShininess);
        capsule.write(colorMaterial, "colorMaterial", defaultColorMaterial);
        capsule.write(materialFace, "materialFace", defaultMaterialFace);
    }

    public void read(JMEImporter e) throws IOException {
        super.read(e);
        InputCapsule capsule = e.getCapsule(this);
        ambient = (ColorRGBA)capsule.readSavable("ambient", ColorRGBA.black.clone());
        diffuse = (ColorRGBA)capsule.readSavable("diffuse", ColorRGBA.black.clone());
        specular = (ColorRGBA)capsule.readSavable("specular", ColorRGBA.black.clone());
        emissive = (ColorRGBA)capsule.readSavable("emissive", ColorRGBA.black.clone());
        shininess = capsule.readFloat("shininess", defaultShininess);
        colorMaterial = capsule.readInt("colorMaterial", defaultColorMaterial);
        materialFace = capsule.readInt("materialFace", defaultMaterialFace);
    }
    
    public Class getClassTag() {
        return MaterialState.class;
    }
}
