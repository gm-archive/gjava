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

package com.jme.intersection;

import java.util.ArrayList;

import com.jme.scene.Geometry;
import com.jme.scene.SceneElement;
import com.jme.scene.TriMesh;

/**
 * TriangleCollisionResults creates a CollisionResults object that calculates
 * collisions to the triangle accuracy. CollisionData objects are added to the
 * collision list as they happen, these data objects only refer to the two
 * meshes, not their triangle lists. While TriangleCollisionResults defines a
 * processCollisions method, it is empty and should be further defined by the
 * user if so desired.
 * 
 * NOTE: Only TriMesh objects may obtain triangle accuracy, all others will 
 * result in Bounding accuracy.
 * 
 * @author Mark Powell
 * @version $Id: TriangleCollisionResults.java,v 1.11 2007/02/05 16:14:22 nca Exp $
 */
public class TriangleCollisionResults extends CollisionResults {
    /*
     * (non-Javadoc)
     * 
     * @see com.jme.intersection.CollisionResults#addCollision(com.jme.scene.Geometry,
     *      com.jme.scene.Geometry)
     */
    public void addCollision(Geometry s, Geometry t) {
        //find the triangle that is being hit.
        //add this node and the triangle to the CollisionResults list.
        if ((s.getType() & SceneElement.TRIMESH) == 0 || (t.getType() & SceneElement.TRIMESH) == 0) {
            CollisionData data = new CollisionData(s, t);
            addCollisionData(data);
        } else {
        	//XXX speed this up.
        	for(int i = 0; i < s.getBatchCount(); i++) {
        		for(int j = 0; j < t.getBatchCount(); j++) {
        			ArrayList<Integer> a = new ArrayList<Integer>();
        		    ArrayList<Integer> b = new ArrayList<Integer>();
        			((TriMesh) s).findTriangleCollision((TriMesh) t, i, j, a, b);
        			CollisionData data = new CollisionData(s, t, i, j, a, b);
                    addCollisionData(data);
        		}
        	}
            
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jme.intersection.CollisionResults#processCollisions()
     */
    public void processCollisions() {

    }

}