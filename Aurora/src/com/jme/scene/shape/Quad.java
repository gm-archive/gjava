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

import java.nio.FloatBuffer;

import com.jme.math.Vector3f;
import com.jme.scene.TriMesh;
import com.jme.scene.batch.TriangleBatch;
import com.jme.util.geom.BufferUtils;

/**
 * <code>Quad</code> defines a four sided, two dimensional shape. The local
 * height of the <code>Quad</code> defines it's size about the y-axis, while
 * the width defines the x-axis. The z-axis will always be 0.
 * 
 * @author Mark Powell
 * @version $Id: Quad.java,v 1.13 2007/09/21 15:45:27 nca Exp $
 */
public class Quad extends TriMesh {

	private static final long serialVersionUID = 1L;

    public Quad() {
        
    }
    
	/**
	 * Constructor creates a new <code>Quad</code> object. That data for the
	 * <code>Quad</code> is not set until a call to <code>initialize</code>
	 * is made.
	 * 
	 * @param name
	 *            the name of this <code>Quad</code>.
	 */
	public Quad(String name) {
		super(name);
	}

	/**
	 * Constructor creates a new <code>Quade</code> object with the provided
	 * width and height.
	 * 
	 * @param name
	 *            the name of the <code>Quad</code>.
	 * @param width
	 *            the width of the <code>Quad</code>.
	 * @param height
	 *            the height of the <code>Quad</code>.
	 */
	public Quad(String name, float width, float height) {
		super(name);
		initialize(width, height);
	}

	/**
	 * <code>resize</code> changes the width and height of the given quad by
	 * altering its vertices.
	 * 
	 * @param width
	 *            the new width of the <code>Quad</code>.
	 * @param height
	 *            the new height of the <code>Quad</code>.
	 */
	public void resize(float width, float height) {
        TriangleBatch batch = getBatch(0);
		batch.getVertexBuffer().clear();
		batch.getVertexBuffer().put(-width / 2f).put(height / 2f).put(0);
		batch.getVertexBuffer().put(-width / 2f).put(-height / 2f).put(0);
		batch.getVertexBuffer().put(width / 2f).put(-height / 2f).put(0);
		batch.getVertexBuffer().put(width / 2f).put(height / 2f).put(0);
	}

	/**
	 * 
	 * <code>initialize</code> builds the data for the <code>Quad</code>
	 * object.
	 * 
	 * 
	 * @param width
	 *            the width of the <code>Quad</code>.
	 * @param height
	 *            the height of the <code>Quad</code>.
	 */
	public void initialize(float width, float height) {
        TriangleBatch batch = getBatch(0);
		batch.setVertexCount(4);
		batch.setVertexBuffer(BufferUtils.createVector3Buffer(batch.getVertexCount()));
		batch.setNormalBuffer(BufferUtils.createVector3Buffer(batch.getVertexCount()));
        FloatBuffer tbuf = BufferUtils.createVector2Buffer(batch.getVertexCount());
        setTextureBuffer(0,tbuf);
	    batch.setTriangleQuantity(2);
	    batch.setIndexBuffer(BufferUtils.createIntBuffer(batch.getTriangleCount() * 3));

		batch.getVertexBuffer().put(-width / 2f).put(height / 2f).put(0);
		batch.getVertexBuffer().put(-width / 2f).put(-height / 2f).put(0);
		batch.getVertexBuffer().put(width / 2f).put(-height / 2f).put(0);
		batch.getVertexBuffer().put(width / 2f).put(height / 2f).put(0);

		batch.getNormalBuffer().put(0).put(0).put(1);
		batch.getNormalBuffer().put(0).put(0).put(1);
		batch.getNormalBuffer().put(0).put(0).put(1);
		batch.getNormalBuffer().put(0).put(0).put(1);

        
		tbuf.put(0).put(1);
        tbuf.put(0).put(0);
        tbuf.put(1).put(0);
        tbuf.put(1).put(1);

	    batch.getIndexBuffer().put(0);
	    batch.getIndexBuffer().put(1);
	    batch.getIndexBuffer().put(2);
	    batch.getIndexBuffer().put(0);
	    batch.getIndexBuffer().put(2);
	    batch.getIndexBuffer().put(3);
	}

	/**
	 * <code>getCenter</code> returns the center of the <code>Quad</code>.
	 * 
	 * @return Vector3f the center of the <code>Quad</code>.
	 */
	public Vector3f getCenter() {
		return worldTranslation;
	}
}