/*
 * Copyright (c) 2003-2008 jMonkeyEngine
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

package com.jme.scene.shape;

import com.jme.math.FastMath;
import com.jme.scene.TriMesh;
import com.jme.scene.batch.TriangleBatch;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;
import com.jme.util.export.Savable;
import com.jme.util.geom.BufferUtils;
import java.io.IOException;

/**
 * 
 * @author Landei
 */
public class Tube extends TriMesh implements Savable {

	private static final long serialVersionUID = 1L;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private int axisSamples;
	private int radialSamples;

	private float outerRadius;
	private float innerRadius;
	private float height;

	/**
	 * Constructor meant for Savable use only.
	 */
	public Tube() {
	}

	public Tube(String name, float outerRadius, float innerRadius,
			float height, int axisSamples, int radialSamples) {
		super(name);
		this.outerRadius = outerRadius;
		this.innerRadius = innerRadius;
		this.height = height;
		this.axisSamples = axisSamples;
		this.radialSamples = radialSamples;
		allocateVertices();
	}

	public Tube(String name, float outerRadius, float innerRadius, float height) {
		this(name, outerRadius, innerRadius, height, 2, 20);
	}

	private void allocateVertices() {
		TriangleBatch batch = getBatch(0);
		batch.setVertexCount(2 * (axisSamples + 1) * (radialSamples + 1)
				+ radialSamples * 4);
		batch.setVertexBuffer(BufferUtils.createVector3Buffer(batch
				.getVertexBuffer(), batch.getVertexCount()));
		batch.setNormalBuffer(BufferUtils.createVector3Buffer(batch
				.getNormalBuffer(), batch.getVertexCount()));
		batch.getTextureBuffers().set(0,
				BufferUtils.createVector2Buffer(batch.getVertexCount()));
		batch.setTriangleQuantity(4 * radialSamples * (1 + axisSamples));
		batch.setIndexBuffer(BufferUtils.createIntBuffer(
				batch.getIndexBuffer(), 3 * batch.getTriangleCount()));

		setGeometryData();
		setIndexData();
	}

	public int getAxisSamples() {
		return axisSamples;
	}

	public void setAxisSamples(int axisSamples) {
		this.axisSamples = axisSamples;
		allocateVertices();
	}

	public int getRadialSamples() {
		return radialSamples;
	}

	public void setRadialSamples(int radialSamples) {
		this.radialSamples = radialSamples;
		allocateVertices();
	}

	public float getOuterRadius() {
		return outerRadius;
	}

	public void setOuterRadius(float outerRadius) {
		this.outerRadius = outerRadius;
		allocateVertices();
	}

	public float getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(float innerRadius) {
		this.innerRadius = innerRadius;
		allocateVertices();
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
		allocateVertices();
	}

	private void setGeometryData() {
		TriangleBatch batch = getBatch(0);
		float inverseRadial = 1.0f / radialSamples;
		float axisStep = height / axisSamples;
		float axisTextureStep = 1.0f / axisSamples;
		float halfHeight = 0.5f * height;
		float innerOuterRatio = innerRadius / outerRadius;
		float[] sin = new float[radialSamples];
		float[] cos = new float[radialSamples];

		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			float angle = FastMath.TWO_PI * inverseRadial * radialCount;
			cos[radialCount] = FastMath.cos(angle);
			sin[radialCount] = FastMath.sin(angle);
		}

		// outer cylinder
		for (int radialCount = 0; radialCount < radialSamples + 1; radialCount++) {
			for (int axisCount = 0; axisCount < axisSamples + 1; axisCount++) {
				batch.getVertexBuffer().put(
						cos[radialCount % radialSamples] * outerRadius).put(
						axisStep * axisCount - halfHeight).put(
						sin[radialCount % radialSamples] * outerRadius);
				batch.getNormalBuffer().put(cos[radialCount % radialSamples])
						.put(0).put(sin[radialCount % radialSamples]);
				batch.getTextureBuffer(0).put(radialCount * inverseRadial).put(
						axisTextureStep * axisCount);
			}
		}
		// inner cylinder
		for (int radialCount = 0; radialCount < radialSamples + 1; radialCount++) {
			for (int axisCount = 0; axisCount < axisSamples + 1; axisCount++) {
				batch.getVertexBuffer().put(
						cos[radialCount % radialSamples] * innerRadius).put(
						axisStep * axisCount - halfHeight).put(
						sin[radialCount % radialSamples] * innerRadius);
				batch.getNormalBuffer().put(-cos[radialCount % radialSamples])
						.put(0).put(-sin[radialCount % radialSamples]);
				batch.getTextureBuffer(0).put(radialCount * inverseRadial).put(
						axisTextureStep * axisCount);
			}
		}
		// bottom edge
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			batch.getVertexBuffer().put(cos[radialCount] * outerRadius).put(
					-halfHeight).put(sin[radialCount] * outerRadius);
			batch.getVertexBuffer().put(cos[radialCount] * innerRadius).put(
					-halfHeight).put(sin[radialCount] * innerRadius);
			batch.getNormalBuffer().put(0).put(-1).put(0);
			batch.getNormalBuffer().put(0).put(-1).put(0);
			batch.getTextureBuffer(0).put(0.5f + 0.5f * cos[radialCount]).put(
					0.5f + 0.5f * sin[radialCount]);
			batch.getTextureBuffer(0).put(
					0.5f + innerOuterRatio * 0.5f * cos[radialCount]).put(
					0.5f + innerOuterRatio * 0.5f * sin[radialCount]);
		}
		// top edge
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			batch.getVertexBuffer().put(cos[radialCount] * outerRadius).put(
					halfHeight).put(sin[radialCount] * outerRadius);
			batch.getVertexBuffer().put(cos[radialCount] * innerRadius).put(
					halfHeight).put(sin[radialCount] * innerRadius);
			batch.getNormalBuffer().put(0).put(1).put(0);
			batch.getNormalBuffer().put(0).put(1).put(0);
			batch.getTextureBuffer(0).put(0.5f + 0.5f * cos[radialCount]).put(
					0.5f + 0.5f * sin[radialCount]);
			batch.getTextureBuffer(0).put(
					0.5f + innerOuterRatio * 0.5f * cos[radialCount]).put(
					0.5f + innerOuterRatio * 0.5f * sin[radialCount]);
		}

	}

	private void setIndexData() {
		TriangleBatch batch = getBatch(0);
		int innerCylinder = (axisSamples + 1) * (radialSamples + 1);
		int bottomEdge = 2 * innerCylinder;
		int topEdge = bottomEdge + 2 * radialSamples;
		// outer cylinder
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			for (int axisCount = 0; axisCount < axisSamples; axisCount++) {
				int index0 = axisCount + (axisSamples + 1) * radialCount;
				int index1 = index0 + 1;
				int index2 = index0 + (axisSamples + 1);
				int index3 = index2 + 1;
				batch.getIndexBuffer().put(index0).put(index1).put(index2);
				batch.getIndexBuffer().put(index1).put(index3).put(index2);
			}
		}

		// inner cylinder
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			for (int axisCount = 0; axisCount < axisSamples; axisCount++) {
				int index0 = innerCylinder + axisCount + (axisSamples + 1)
						* radialCount;
				int index1 = index0 + 1;
				int index2 = index0 + (axisSamples + 1);
				int index3 = index2 + 1;
				batch.getIndexBuffer().put(index0).put(index2).put(index1);
				batch.getIndexBuffer().put(index1).put(index2).put(index3);
			}
		}

		// bottom edge
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			int index0 = bottomEdge + 2 * radialCount;
			int index1 = index0 + 1;
			int index2 = bottomEdge + 2 * ((radialCount + 1) % radialSamples);
			int index3 = index2 + 1;
			batch.getIndexBuffer().put(index0).put(index2).put(index1);
			batch.getIndexBuffer().put(index1).put(index2).put(index3);
		}

		// top edge
		for (int radialCount = 0; radialCount < radialSamples; radialCount++) {
			int index0 = topEdge + 2 * radialCount;
			int index1 = index0 + 1;
			int index2 = topEdge + 2 * ((radialCount + 1) % radialSamples);
			int index3 = index2 + 1;
			batch.getIndexBuffer().put(index0).put(index1).put(index2);
			batch.getIndexBuffer().put(index1).put(index3).put(index2);
		}
	}

	@Override
	public void write(JMEExporter e) throws IOException {
		super.write(e);
		OutputCapsule capsule = e.getCapsule(this);
		capsule.write(getAxisSamples(), "axisSamples", 0);
		capsule.write(getRadialSamples(), "radialSamples", 0);
		capsule.write(getOuterRadius(), "outerRadius", 0);
		capsule.write(getInnerRadius(), "innerRadius", 0);
		capsule.write(getHeight(), "height", 0);
	}

	@Override
	public void read(JMEImporter e) throws IOException {
		super.read(e);
		InputCapsule capsule = e.getCapsule(this);
		setAxisSamples(capsule.readInt("axisSamples", 0));
		setRadialSamples(capsule.readInt("radialSamples", 0));
		setOuterRadius(capsule.readFloat("outerRadius", 0));
		setInnerRadius(capsule.readFloat("innerRadius", 0));
		setHeight(capsule.readFloat("height", 0));
	}
}