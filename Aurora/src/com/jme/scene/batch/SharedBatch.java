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

package com.jme.scene.batch;

import java.io.IOException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.jme.bounding.BoundingVolume;
import com.jme.renderer.ColorRGBA;
import com.jme.renderer.Renderer;
import com.jme.scene.SceneElement;
import com.jme.scene.TriMesh;
import com.jme.scene.VBOInfo;
import com.jme.scene.state.RenderState;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;

/**
 * <code>SharedBatch</code> allows the sharing of data between multiple nodes.
 * A provided TriMesh is used as the model for this node. This allows the user
 * to place multiple copies of the same object throughout the scene without
 * having to duplicate data. It should be known that any change to the provided
 * target mesh will affect the appearance of this mesh, including animations.
 * Secondly, the SharedBatch is read only. Any attempt to write to the mesh data
 * via set* methods, will result in a warning being logged and nothing else. Any
 * changes to the mesh should happened to the target mesh being shared. <br>
 * If you plan to use collisions with a <code>SharedBatch</code> it is
 * recommended that you disable passing of <code>updateCollisionTree</code>
 * calls to the target mesh. This is to prevent multiple calls to the target's
 * <code>updateCollisionTree</code> method, from different shared meshes.
 * Instead of this method being called from the scenegraph, you can now invoke
 * it directly on the target mesh, thus ensuring it will only be invoked once.
 * <br>
 * <b>Important:</b> It is highly recommended that the Target mesh is NOT
 * placed into the scenegraph, as it's translation, rotation and scale are
 * replaced by the shared meshes using it before they are rendered. <br>
 * <b>Note:</b> Special thanks to Kevin Glass.
 * 
 * @author Mark Powell
 * @version $Id: SharedBatch.java,v 1.19 2007/10/05 22:44:18 nca Exp $
 */
public class SharedBatch extends TriangleBatch {
    private static final Logger logger = Logger.getLogger(SharedBatch.class
            .getName());
    
	private static final long serialVersionUID = 1L;

	private TriangleBatch target;

	public SharedBatch() {
		super();
		defaultColor = null;
	}

	public SharedBatch(TriangleBatch target) {
		this();
		if ((target.getType() & SceneElement.SHAREDBATCH) != 0) {
			setTarget(((SharedBatch) target).getTarget());
		} else {
			setTarget(target);
		}
	}

	public int getType() {
		return SceneElement.TRIANGLEBATCH | SceneElement.GEOMBATCH
				| SceneElement.SHAREDBATCH;
	}

	/**
	 * <code>setTarget</code> sets the shared data mesh.
	 * 
	 * @param target
	 *            the TriMesh to share the data.
	 */
	public void setTarget(TriangleBatch target) {
		this.target = target;

		for (int i = 0; i < RenderState.RS_MAX_STATE; i++) {
			RenderState renderState = this.target.getRenderState(i);
			if (renderState != null) {
				setRenderState(renderState);
			}
		}
		setCullMode(target.getLocalCullMode());
		setLightCombineMode(target.getLocalLightCombineMode());
		setRenderQueueMode(target.getLocalRenderQueueMode());
		setTextureCombineMode(target.getLocalTextureCombineMode());
		setZOrder(target.getZOrder());
	}

	/**
	 * <code>getTarget</code> returns the mesh that is being shared by this
	 * object.
	 * 
	 * @return the mesh being shared.
	 */
	public TriangleBatch getTarget() {
		return target;
	}

	/**
	 * <code>reconstruct</code> is not supported in SharedBatch.
	 * 
	 * @param vertices
	 *            the new vertices to use.
	 * @param normals
	 *            the new normals to use.
	 * @param colors
	 *            the new colors to use.
	 * @param textureCoords
	 *            the new texture coordinates to use (position 0).
	 */
	public void reconstruct(FloatBuffer vertices, FloatBuffer normals,
			FloatBuffer colors, FloatBuffer textureCoords) {
		logger.info("SharedBatch will ignore reconstruct.");
	}

	/**
	 * <code>setVBOInfo</code> is not supported in SharedBatch.
	 */
	public void setVBOInfo(VBOInfo info) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
    }

	/**
	 * <code>getVBOInfo</code> returns the target mesh's vbo info.
	 */
	public VBOInfo getVBOInfo() {
		return target.getVBOInfo();
	}

	/**
	 * 
	 * <code>setSolidColor</code> is not supported by SharedBatch.
	 * 
	 * @param color
	 *            the color to set.
	 */
	public void setSolidColor(ColorRGBA color) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * <code>setRandomColors</code> is not supported by SharedBatch.
	 */
	public void setRandomColors() {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
    }

	/**
	 * <code>getVertexBuffer</code> returns the float buffer that contains the
	 * target geometry's vertex information.
	 * 
	 * @return the float buffer that contains the target geometry's vertex
	 *         information.
	 */
	public FloatBuffer getVertexBuffer() {
		return target.getVertexBuffer();
	}

	/**
	 * <code>setVertexBuffer</code> is not supported by SharedBatch.
	 * 
	 * @param buff
	 *            the new vertex buffer.
	 */
	public void setVertexBuffer(FloatBuffer buff) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * <code>getNormalBuffer</code> retrieves the target geometry's normal
	 * information as a float buffer.
	 * 
	 * @return the float buffer containing the target geometry information.
	 */
	public FloatBuffer getNormalBuffer() {
		return target.getNormalBuffer();
	}

	/**
	 * <code>setNormalBuffer</code> is not supported by SharedBatch.
	 * 
	 * @param buff
	 *            the new normal buffer.
	 */
	public void setNormalBuffer(FloatBuffer buff) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * <code>getColorBuffer</code> retrieves the float buffer that contains
	 * the target geometry's color information.
	 * 
	 * @return the buffer that contains the target geometry's color information.
	 */
	public FloatBuffer getColorBuffer() {
		return target.getColorBuffer();
	}

	/**
	 * <code>setColorBuffer</code> is not supported by SharedBatch.
	 * 
	 * @param buff
	 *            the new color buffer.
	 */
	public void setColorBuffer(FloatBuffer buff) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * 
	 * <code>getIndexAsBuffer</code> retrieves the target's indices array as
	 * an <code>IntBuffer</code>.
	 * 
	 * @return the indices array as an <code>IntBuffer</code>.
	 */
	public IntBuffer getIndexBuffer() {
		return target.getIndexBuffer();
	}

	/**
	 * 
	 * <code>setIndexBuffer</code> is not supported by SharedBatch.
	 * 
	 * @param indices
	 *            the index array as an IntBuffer.
	 */
	public void setIndexBuffer(IntBuffer indices) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	public int getVertexCount() {
		return target.getVertexCount();
	}

	/**
	 * Returns the number of triangles the target TriMesh contains.
	 * 
	 * @return The current number of triangles.
	 */
	public int getTriangleCount() {
		return target.getTriangleCount();
	}

	public void getTriangle(int index, int[] storage) {
		target.getTriangle(index, storage);
	}

	/**
	 * 
	 * <code>copyTextureCoords</code> is not supported by SharedBatch.
	 * 
	 * @param fromIndex
	 *            the coordinates to copy.
	 * @param toIndex
	 *            the texture unit to set them to.
	 */
	public void copyTextureCoords(int fromIndex, int toIndex) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * <code>getTextureBuffers</code> retrieves the target geometry's texture
	 * information contained within a float buffer array.
	 * 
	 * @return the float buffers that contain the target geometry's texture
	 *         information.
	 */
	public ArrayList<FloatBuffer> getTextureBuffers() {
		return target.getTextureBuffers();
	}

	/**
	 * 
	 * <code>getTextureAsFloatBuffer</code> retrieves the texture buffer of a
	 * given texture unit.
	 * 
	 * @param textureUnit
	 *            the texture unit to check.
	 * @return the texture coordinates at the given texture unit.
	 */
	public FloatBuffer getTextureBuffer(int textureUnit) {
		return target.getTextureBuffer(textureUnit);
	}

	/**
	 * <code>setTextureBuffer</code> is not supported by SharedBatch.
	 * 
	 * @param buff
	 *            the new vertex buffer.
	 */
	public void setTextureBuffer(FloatBuffer buff) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * <code>setTextureBuffer</code> not supported by SharedBatch
	 * 
	 * @param buff
	 *            the new vertex buffer.
	 */
	public void setTextureBuffer(FloatBuffer buff, int position) {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

	/**
	 * clearBuffers is not supported by SharedBatch
	 */
	public void clearBuffers() {
		logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
	}

    @Override
    public void setTangentBuffer(FloatBuffer tangentBuf) {
        logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
    }

    @Override
    public FloatBuffer getTangentBuffer() {
        return target.getTangentBuffer();
    }

    public void setBinormalBuffer(FloatBuffer binormalBuf) {
        logger.warning("SharedBatch does not allow the manipulation"
                + "of the the mesh data.");
    }

    @Override
    public FloatBuffer getBinormalBuffer() {
        return target.getBinormalBuffer();
    }
    
	/**
	 * <code>updateWorldBound</code> updates the bounding volume that contains
	 * this geometry. The location of the geometry is based on the location of
	 * all this node's parents.
	 * 
	 * @see com.jme.scene.Spatial#updateWorldBound()
	 */
	public void updateWorldBound() {
		if (target.getModelBound() != null) {
			worldBound = target.getModelBound().transform(
					parentGeom.getWorldRotation(),
					parentGeom.getWorldTranslation(),
					parentGeom.getWorldScale(), worldBound);
		}
	}

	/**
	 * <code>setModelBound</code> sets the bounding object for this geometry.
	 * 
	 * @param modelBound
	 *            the bounding object for this geometry.
	 */
	public void setModelBound(BoundingVolume modelBound) {
		target.setModelBound(modelBound);
	}

	/**
	 * <code>updateBound</code> recalculates the bounding object assigned to
	 * the geometry. This resets it parameters to adjust for any changes to the
	 * vertex information.
	 * 
	 */
	public void updateModelBound() {
		if (target.getModelBound() != null) {
			target.updateModelBound();
			updateWorldBound();
		}
	}

	/**
	 * returns the model bound of the target object.
	 */
	public BoundingVolume getModelBound() {
		return target.getModelBound();
	}

	/**
	 * draw renders the target mesh, at the translation, rotation and scale of
	 * this shared mesh.
	 * 
	 * @see com.jme.scene.Spatial#draw(com.jme.renderer.Renderer)
	 */
	public void draw(Renderer r) {
		// if this batch is not enabled, don't bother processing it.
		if (!isEnabled()) {
			return;
		}

		if (!r.isProcessingQueue()) {
			if (r.checkAndAdd(this))
				return;
		}

		target.parentGeom.getWorldTranslation().set(
				parentGeom.getWorldTranslation());
		target.parentGeom.getWorldRotation().set(parentGeom.getWorldRotation());
		target.parentGeom.getWorldScale().set(parentGeom.getWorldScale());
		target.setDefaultColor(getDefaultColor());
		System.arraycopy(this.states, 0, target.states, 0, states.length);

		r.draw(target);
	}

	public void write(JMEExporter e) throws IOException {
		OutputCapsule capsule = e.getCapsule(this);
		capsule.write(target, "target", null);
		super.write(e);
	}

	private static TriMesh motherMesh = null;

	public void read(JMEImporter e) throws IOException {
		InputCapsule capsule = e.getCapsule(this);
		target = (TriangleBatch) capsule.readSavable("target", null);
		if (target != null && target.parentGeom == null) {
			if (motherMesh == null) {
				motherMesh = new TriMesh("mother");
				motherMesh.clearBatches();
			}
			motherMesh.addBatch(target);
		}
		super.read(e);
	}

	@Override
	public void lockMeshes(Renderer r) {
		target.lockMeshes(r);
	}

	@Override
	public boolean hasDirtyVertices() {
		return target.hasDirtyVertices;
	}

	public String toString() {
		if (target.parentGeom != null && parentGeom != null)
			return target.parentGeom.getName() + ": SharedBatch "
					+ parentGeom.getBatchIndex(this);

		return "orphaned batch";
	}

	@Override
	public ColorRGBA getDefaultColor() {
		if (defaultColor == null) {
			return target.getDefaultColor();
		} else {
			return defaultColor;
		}
	}
}
