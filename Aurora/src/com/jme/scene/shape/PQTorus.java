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

package com.jme.scene.shape;

import java.io.IOException;
import java.nio.IntBuffer;

import com.jme.math.FastMath;
import com.jme.math.Vector3f;
import com.jme.scene.TriMesh;
import com.jme.scene.batch.TriangleBatch;
import com.jme.util.export.InputCapsule;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.OutputCapsule;
import com.jme.util.geom.BufferUtils;

/**
 * <code>PQTorus</code> generates the geometry of a parameterized torus, also
 * known as a pq torus.
 * 
 * @author Joshua Slack, Eric Woroshow
 * @version $Id: PQTorus.java,v 1.17 2007/09/21 15:45:27 nca Exp $
 */
public class PQTorus extends TriMesh {

	private static final long serialVersionUID = 1L;

	private float p, q;

	private float radius, width;

	private int steps, radialSamples;

    public PQTorus() {}
    
	/**
	 * Creates a parameterized torus. Steps and radialSamples are both degree of
	 * accuracy values.
	 * 
	 * @param name
	 *            The name of the torus.
	 * @param p
	 *            The x/z oscillation.
	 * @param q
	 *            The y oscillation.
	 * @param radius
	 *            The radius of the PQTorus.
	 * @param width
	 *            The width of the torus.
	 * @param steps
	 *            The steps along the torus.
	 * @param radialSamples
	 *            Radial samples for the torus.
	 */
	public PQTorus(String name, float p, float q, float radius, float width,
			int steps, int radialSamples) {
		super(name);

		this.p = p;
		this.q = q;
		this.radius = radius;
		this.width = width;
		this.steps = steps;
		this.radialSamples = radialSamples;

		setGeometryData();
		setIndexData();
	}

	private void setGeometryData() {
        TriangleBatch batch = getBatch(0);
		final float THETA_STEP = (FastMath.TWO_PI / steps);
		final float BETA_STEP = (FastMath.TWO_PI / radialSamples);

		Vector3f[] toruspoints = new Vector3f[steps];
        // allocate vertices
	    batch.setVertexCount(radialSamples * steps);
        batch.setVertexBuffer(BufferUtils.createVector3Buffer(batch.getVertexCount()));

        // allocate normals if requested
        batch.setNormalBuffer(BufferUtils.createVector3Buffer(batch.getVertexCount()));

        // allocate texture coordinates
        batch.getTextureBuffers().set(0, BufferUtils.createVector2Buffer(batch.getVertexCount()));

		Vector3f pointB = new Vector3f(), T = new Vector3f(), N = new Vector3f(), B = new Vector3f();
		Vector3f tempNorm = new Vector3f();
		float r, x, y, z, theta = 0.0f, beta = 0.0f;
		int nvertex = 0;

		//Move along the length of the pq torus
		for (int i = 0; i < steps; i++) {
			theta += THETA_STEP;
			float circleFraction = ((float) i) / (float) steps;

			//Find the point on the torus
			r = (0.5f * (2.0f + FastMath.sin(q * theta)) * radius);
			x = (r * FastMath.cos(p * theta) * radius);
			y = (r * FastMath.sin(p * theta) * radius);
			z = (r * FastMath.cos(q * theta) * radius);
			toruspoints[i] = new Vector3f(x, y, z);

			//Now find a point slightly farther along the torus
			r = (0.5f * (2.0f + FastMath.sin(q
					* (theta + 0.01f))) * radius);
			x = (r * FastMath.cos(p * (theta + 0.01f)) * radius);
			y = (r * FastMath.sin(p * (theta + 0.01f)) * radius);
			z = (r * FastMath.cos(q * (theta + 0.01f)) * radius);
			pointB = new Vector3f(x, y, z);

			//Approximate the Frenet Frame
			T = pointB.subtract(toruspoints[i]);
			N = toruspoints[i].add(pointB);
			B = T.cross(N);
			N = B.cross(T);

			//Normalise the two vectors before use
			N = N.normalize();
			B = B.normalize();

			//Create a circle oriented by these new vectors
			beta = 0.0f;
			for (int j = 0; j < radialSamples; j++) {
				beta += BETA_STEP;
				float cx = FastMath.cos(beta) * width;
				float cy = FastMath.sin(beta) * width;
				float radialFraction = ((float) j) / radialSamples;
				tempNorm.x = (cx * N.x + cy * B.x);
				tempNorm.y = (cx * N.y + cy * B.y);
				tempNorm.z = (cx * N.z + cy * B.z);

			    batch.getNormalBuffer().put(tempNorm.x).put(tempNorm.y).put(tempNorm.z);

			    tempNorm.addLocal(toruspoints[i]);
				batch.getVertexBuffer().put(tempNorm.x).put(tempNorm.y).put(tempNorm.z);

                batch.getTextureBuffers().get(0).put(radialFraction).put(circleFraction);

				nvertex++;
			}
		}
	}

	private void setIndexData() {
        TriangleBatch batch = getBatch(0);
        IntBuffer indices = BufferUtils.createIntBuffer(6 * batch.getVertexCount());

		for (int i = 0; i < batch.getVertexCount(); i++) {
			indices.put(i);
			indices.put(i - radialSamples);
			indices.put(i + 1);

			indices.put(i + 1);
			indices.put(i - radialSamples);
			indices.put(i - radialSamples + 1);
		}

		for (int i = 0, len = indices.capacity(); i < len; i++) {
		    int ind = indices.get(i);
			if (ind < 0) {
				ind += batch.getVertexCount();
				indices.put(i, ind);
			}
			if (ind >= batch.getVertexCount()) {
				ind -= batch.getVertexCount();
				indices.put(i, ind);
			}
		}
        indices.rewind();
        
        batch.setIndexBuffer(indices);
	}
    
    public void write(JMEExporter e) throws IOException {
        super.write(e);
        OutputCapsule capsule = e.getCapsule(this);
        capsule.write(p, "p", 0);
        capsule.write(q, "q", 0);
        capsule.write(radius, "radius", 0);
        capsule.write(width, "width", 0);
        capsule.write(steps, "steps", 0);
        capsule.write(radialSamples, "radialSamples", 0);
        
    }

    public void read(JMEImporter e) throws IOException {
        super.read(e);
        InputCapsule capsule = e.getCapsule(this);
        p = capsule.readFloat("p", 0);
        q = capsule.readFloat("q", 0);
        radius = capsule.readFloat("radius", 0);
        width = capsule.readFloat("width", 0);
        steps = capsule.readInt("steps", 0);
        radialSamples = capsule.readInt("radialSamples", 0);
        
    }
}