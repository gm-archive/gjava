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

package com.jme.scene;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme.bounding.BoundingVolume;
import com.jme.intersection.CollisionResults;
import com.jme.intersection.PickResults;
import com.jme.math.Ray;
import com.jme.renderer.Renderer;
import com.jme.util.export.JMEExporter;
import com.jme.util.export.JMEImporter;
import com.jme.util.export.Savable;

/**
 * <code>Node</code> defines an internal node of a scene graph. The internal
 * node maintains a collection of children and handles merging said children
 * into a single bound to allow for very fast culling of multiple nodes. Node
 * allows for any number of children to be attached.
 * 
 * @author Mark Powell
 * @author Gregg Patton
 * @version $Id: Node.java,v 1.75 2007/10/15 14:52:03 nca Exp $
 */
public class Node extends Spatial implements Serializable, Savable {
    private static final Logger logger = Logger.getLogger(Node.class.getName());

    private static final long serialVersionUID = 1L;

    /** This node's children. */
    protected ArrayList<Spatial> children;

    /**
     * Default constructor.
     */
    public Node() {
        logger.info("Node created.");
    }

    /**
     * Constructor instantiates a new <code>Node</code> with a default empty
     * list for containing children.
     * 
     * @param name
     *            the name of the scene element. This is required for
     *            identification and comparision purposes.
     */
    public Node(String name) {
        super(name);
        logger.info("Node created.");
    }

    /**
     * 
     * <code>getQuantity</code> returns the number of children this node
     * maintains.
     * 
     * @return the number of children this node maintains.
     */
    public int getQuantity() {
        if(children == null) {
            return 0;
        } 
            
        return children.size();        
    }
    
    /**
     * <code>getTriangleCount</code> returns the number of triangles contained
     * in all sub-branches of this node that contain geometry.
     * @return the triangle count of this branch.
     */
    @Override
    public int getTriangleCount() {
        int count = 0;
        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                count += children.get(i).getTriangleCount();
            }
        }
        
        return count;
    }
    
    /**
     * <code>getVertexCount</code> returns the number of vertices contained
     * in all sub-branches of this node that contain geometry.
     * @return the vertex count of this branch.
     */
    @Override
    public int getVertexCount() {
        int count = 0;
        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
               count += children.get(i).getVertexCount();
            }
        }
        
        return count;
    }

    /**
     * 
     * <code>attachChild</code> attaches a child to this node. This node
     * becomes the child's parent. The current number of children maintained is
     * returned.
     * <br>
     * If the child already had a parent it is detached from that former parent.
     * 
     * @param child
     *            the child to attach to this node.
     * @return the number of children maintained by this node.
     */
    public int attachChild(Spatial child) {
        if (child != null) {
            if (child.getParent() != this) {
                if (child.getParent() != null) {
                    child.getParent().detachChild(child);
                }
                child.setParent(this);
                if(children == null) {
                    children = new ArrayList<Spatial>(1);  
                }
                children.add(child);
                if (logger.isLoggable(Level.INFO)) {
                    logger.info("Child (" + child.getName()
                            + ") attached to this" + " node (" + getName()
                            + ")");
                }
            }
        }
        
        if (children == null) return 0;
        return children.size();
    }
    
    /**
     * 
     * <code>attachChildAt</code> attaches a child to this node at an index. This node
     * becomes the child's parent. The current number of children maintained is
     * returned.
     * <br>
     * If the child already had a parent it is detached from that former parent.
     * 
     * @param child
     *            the child to attach to this node.
     * @return the number of children maintained by this node.
     */
    public int attachChildAt(Spatial child, int index) {
        if (child != null) {
            if (child.getParent() != this) {
                if (child.getParent() != null) {
                    child.getParent().detachChild(child);
                }
                child.setParent(this);
                if(children == null) {
                    children = new ArrayList<Spatial>(1);  
                }
                children.add(index, child);
                if (logger.isLoggable(Level.INFO)) {
                    logger.info("Child (" + child.getName()
                            + ") attached to this" + " node (" + getName()
                            + ")");
                }
            }
        }

        if (children == null) return 0;
        return children.size();
    }

    /**
     * <code>detachChild</code> removes a given child from the node's list.
     * This child will no longe be maintained.
     * 
     * @param child
     *            the child to remove.
     * @return the index the child was at. -1 if the child was not in the list.
     */
    public int detachChild(Spatial child) {
        if(children == null) {
            return -1;
        }
        if (child == null)
            return -1;
        if (child.getParent() == this) {
            int index = children.indexOf(child);
            if (index != -1) {
                detachChildAt(index);
            }
            return index;
        } 
            
        return -1;        
    }

    /**
     * <code>detachChild</code> removes a given child from the node's list.
     * This child will no longe be maintained. Only the first child with a
     * matching name is removed.
     * 
     * @param childName
     *            the child to remove.
     * @return the index the child was at. -1 if the child was not in the list.
     */
    public int detachChildNamed(String childName) {
        if(children == null) {
            return -1;
        }
        if (childName == null)
            return -1;
        for (int x = 0, max = children.size(); x < max; x++) {
            Spatial child =  children.get(x);
            if (childName.equals(child.getName())) {
                detachChildAt( x );
                return x;
            }
        }
        return -1;
    }

    /**
     * 
     * <code>detachChildAt</code> removes a child at a given index. That child
     * is returned for saving purposes.
     * 
     * @param index
     *            the index of the child to be removed.
     * @return the child at the supplied index.
     */
    public Spatial detachChildAt(int index) {
        if(children == null) {
            return null;
        }
        Spatial child =  children.remove(index);
        if ( child != null ) {
            child.setParent( null );
            logger.info("Child removed.");
        }
        return child;
    }

    /**
     * 
     * <code>detachAllChildren</code> removes all children attached to this
     * node.
     */
    public void detachAllChildren() {
        if(children != null) {
            for ( int i = children.size() - 1; i >= 0; i-- ) {
                detachChildAt( i );
            }
            logger.info("All children removed.");
        }
    }

    public int getChildIndex(Spatial sp) {
        if(children == null) {
            return -1;
        }
        return children.indexOf(sp);
    }

    public void swapChildren(int index1, int index2) {
        Spatial c2 =  children.get(index2);
        Spatial c1 =  children.remove(index1);
        children.add(index1, c2);
        children.remove(index2);
        children.add(index2, c1);
    }

    /**
     * 
     * <code>getChild</code> returns a child at a given index.
     * 
     * @param i
     *            the index to retrieve the child from.
     * @return the child at a specified index.
     */
    public Spatial getChild(int i) {
        if(children == null) {
            return null;
        }
        return children.get(i);
    }

    /**
     * 
     * <code>getChild</code> returns the first child found with exactly the
     * given name (case sensitive.)
     * 
     * @param name
     *            the name of the child to retrieve.
     * @return the child if found, or null.
     */
    public Spatial getChild(String name) {
        for (int x = 0, cSize = getQuantity(); x < cSize; x++) {
            Spatial child = children.get(x);
            if (name.equals(child.getName())) {
                return child;
            } else if(child instanceof Node) {
                Spatial out = ((Node)child).getChild(name);
                if(out != null) {
                    return out;
                }
            }
        }
        return null;
    }
    
    public int getType() {
    	return SceneElement.NODE;
    }

    /**
     * determines if the provide Spatial is contained in the children list of
     * this node.
     * 
     * @param spat
     *            the spatial object to check.
     * @return true if the object is contained, false otherwise.
     */
    public boolean hasChild(Spatial spat) {
        if(children == null) {
            return false;
        }
        if (children.contains(spat))
            return true;

        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if ((child.getType() & SceneElement.NODE) != 0 && ((Node) child).hasChild(spat))
                return true;
        }

        return false;
    }

    /**
     * <code>updateWorldData</code> updates all the children maintained by
     * this node.
     * 
     * @param time
     *            the frame time.
     */
    public void updateWorldData(float time) {
        super.updateWorldData(time);

        Spatial child;
        for (int i = 0, n = getQuantity(); i < n; i++) {
            try {
                child = children.get(i);
            } catch (IndexOutOfBoundsException e) {
                // a child was removed in updateGeometricState (note: this may
                // skip one child)
                break;
            }
            if (child != null) {
                child.updateGeometricState(time, false);
            }
        }
    }

    // inheritted docs
    public void lockBounds() {
        super.lockBounds();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.lockBounds();
            }
        }
    }

    //  inheritted docs
    public void lockShadows() {
        super.lockShadows();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.lockShadows();
            }
        }
    }
    
    //  inheritted docs
    public void lockTransforms() {
        super.lockTransforms();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.lockTransforms();
            }
        }
    }

    //  inheritted docs
    public void lockMeshes(Renderer r) {
        super.lockMeshes(r);
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.lockMeshes(r);
            }
        }
    }
    
    //  inheritted docs
    public void unlockBounds() {
        super.unlockBounds();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.unlockBounds();
            }
        }
    }
    
    //  inheritted docs
    public void unlockShadows() {
        super.unlockShadows();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.unlockShadows();
            }
        }
    }
    
    //  inheritted docs
    public void unlockTransforms() {
        super.unlockTransforms();
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.unlockTransforms();
            }
        }
    }

    //  inheritted docs
    public void unlockMeshes(Renderer r) {
        super.unlockMeshes(r);
        for (int i = 0, max = getQuantity(); i < max; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                child.unlockMeshes(r);
            }
        }
    }

    /**
     * <code>draw</code> calls the onDraw method for each child maintained by
     * this node.
     * 
     * @see com.jme.scene.Spatial#draw(com.jme.renderer.Renderer)
     * @param r
     *            the renderer to draw to.
     */
    public void draw(Renderer r) {
        if(children == null) {
            return;
        }
        Spatial child;
        for (int i = 0, cSize = children.size(); i < cSize; i++) {
            child =  children.get(i);
            if (child != null)
                child.onDraw(r);
        }
    }

    /**
     * Applies the stack of render states to each child by calling
     * updateRenderState(states) on each child.
     * 
     * @param states
     *            The Stack[] of render states to apply to each child.
     */
    protected void applyRenderState(Stack[] states) {
        if(children == null) {
            return;
        }
        for (int i = 0, cSize = children.size(); i < cSize; i++) {
            Spatial pkChild = getChild(i);
            if (pkChild != null)
                pkChild.updateRenderState(states);
        }
    }

    /**
     * <code>updateWorldBound</code> merges the bounds of all the children
     * maintained by this node. This will allow for faster culling operations.
     * 
     * @see com.jme.scene.Spatial#updateWorldBound()
     */
    public void updateWorldBound() {
        if ((lockedMode & SceneElement.LOCKED_BOUNDS) != 0) return;
        if (children == null) {
            return;
        }
        BoundingVolume worldBound = null;
        for (int i = 0, cSize = children.size(); i < cSize; i++) {
            Spatial child =  children.get(i);
            if (child != null) {
                if (worldBound != null) {
                    // merge current world bound with child world bound
                    worldBound.mergeLocal(child.getWorldBound());

                } else {
                    // set world bound to first non-null child world bound
                    if (child.getWorldBound() != null) {
                        worldBound = child.getWorldBound().clone(this.worldBound);
                    }
                }
            }
        }
        this.worldBound = worldBound;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jme.scene.Spatial#hasCollision(com.jme.scene.Spatial,
     *      com.jme.intersection.CollisionResults)
     */
    public void findCollisions(Spatial scene, CollisionResults results) {
        if (getWorldBound() != null && isCollidable && scene.isCollidable()) {
            if (getWorldBound().intersects(scene.getWorldBound())) {
                // further checking needed.
                for (int i = 0; i < getQuantity(); i++) {
                    getChild(i).findCollisions(scene, results);
                }
            }
        }
    }

    public boolean hasCollision(Spatial scene, boolean checkTriangles) {
        if (getWorldBound() != null && isCollidable && scene.isCollidable()) {
            if (getWorldBound().intersects(scene.getWorldBound())) {
                if(children == null && !checkTriangles) {
                    return true;
                }
                // further checking needed.
                for (int i = 0; i < getQuantity(); i++) {
                    if (getChild(i).hasCollision(scene, checkTriangles)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void findPick(Ray toTest, PickResults results) {
        if(children == null) {
            return;
        }
        if (getWorldBound() != null && isCollidable) {
            if (getWorldBound().intersects(toTest)) {
                // further checking needed.
                for (int i = 0; i < getQuantity(); i++) {
                    ( children.get(i)).findPick(toTest, results);
                }
            }
        }
    }

	/**
	 * Returns all children to this node.
	 *
	 * @return an array containing all children to this node
	 */
	public ArrayList<Spatial> getChildren() {
        return children;
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
        if (children != null) {
            // go through children and set parent to this node
            for (int x = 0, cSize = children.size(); x < cSize; x++) {
                Spatial child = children.get(x);
                child.parent = this;
            }
        }
    }

    public void batchChange(Geometry geometry, int index1, int index2) {
        //just pass to parent
        if(parent != null) {
            parent.batchChange(geometry, index1, index2);
        }
    }
    
    public void write(JMEExporter e) throws IOException {
        super.write(e);
        e.getCapsule(this).writeSavableArrayList(children, "children", null);
    }

    @SuppressWarnings("unchecked")
    public void read(JMEImporter e) throws IOException {
        super.read(e);
        children = e.getCapsule(this).readSavableArrayList("children", null);

        // go through children and set parent to this node
        if (children != null) {
            for (int x = 0, cSize = children.size(); x < cSize; x++) {
                Spatial child = children.get(x);
                child.parent = this;
            }
        }
    }

    @Override
    public void setModelBound(BoundingVolume modelBound) {
        if(children != null) {
            for(int i = 0, max = children.size(); i < max; i++) {
                children.get(i).setModelBound(modelBound != null ? modelBound.clone(null) : null);
            }
        }
    }

    @Override
    public void updateModelBound() {
        if(children != null) {
            for(int i = 0, max = children.size(); i < max; i++) {
                children.get(i).updateModelBound();
            }
        }
    }
}
