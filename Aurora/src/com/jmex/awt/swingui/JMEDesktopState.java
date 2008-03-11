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
package com.jmex.awt.swingui;

import java.awt.Color;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme.input.InputHandler;
import com.jme.renderer.Renderer;
import com.jme.scene.Node;
import com.jme.scene.SceneElement;
import com.jme.scene.state.LightState;
import com.jme.system.DisplaySystem;
import com.jme.util.GameTaskQueueManager;
import com.jmex.game.state.GameState;

/**
 * @author Matthew D. Hicks
 */
public class JMEDesktopState extends GameState {
    private static final Logger logger = Logger.getLogger(JMEDesktopState.class
            .getName());
    
	private boolean variableDesktopSize;
	private Node guiNode;
	private InputHandler guiInput;
	private JMEDesktop desktop;
	private Node rootNode;
	
	private int width;
	private int height;
	
	public JMEDesktopState() {
		this(800, 600);
	}
	
	public JMEDesktopState(int width, int height) {
		this.width = width;
		this.height = height;
		init();
	}
	
	public JMEDesktopState(boolean variableDesktopSize) {
		this.variableDesktopSize = variableDesktopSize;
		init();
	}
	
	private void init() {
		guiNode = new Node("GUI");
		guiNode.setCullMode(SceneElement.CULL_NEVER);
        guiNode.setLightCombineMode(LightState.OFF);
        
        rootNode = new Node("RootNode");
        
        guiInput = new InputHandler();
        guiInput.setEnabled(true);
        
        Future<JMEDesktop> future = GameTaskQueueManager.getManager().update(new Callable<JMEDesktop>() {
			public JMEDesktop call() throws Exception {
				if (variableDesktopSize) {
					return new JMEDesktop("Desktop", DisplaySystem.getDisplaySystem().getWidth(), DisplaySystem.getDisplaySystem().getHeight(), guiInput);
				} else {
					return new JMEDesktop("Desktop", width, height, guiInput);
				}
			}
        });
        try {
	        desktop = future.get();
	        desktop.getJDesktop().setName("Desktop");
	        desktop.getJDesktop().setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
	        desktop.getJDesktop().setOpaque(true);
	        guiNode.attachChild(desktop);
	        guiNode.getLocalTranslation().set(DisplaySystem.getDisplaySystem().getWidth() / 2, DisplaySystem.getDisplaySystem().getHeight() / 2, 0.0f);
	        guiNode.getLocalScale().set(1.0f, 1.0f, 1.0f);
	        guiNode.updateRenderState();
	        guiNode.updateGeometricState(0.0f, true);
	        guiNode.setRenderQueueMode(Renderer.QUEUE_ORTHO);
	        guiNode.updateGeometricState(0.0f, true);
	        guiNode.updateRenderState();
        } catch(InterruptedException exc) {
        	logger.logp(Level.SEVERE, this.getClass().toString(), "init()", "Exception", exc);
        } catch(ExecutionException exc) {
            logger.logp(Level.SEVERE, this.getClass().toString(), "init()", "Exception", exc);
        }
        
        buildUI();
	}
	
	protected void buildUI() {
	}
	
	public void update(float tpf) {
		guiInput.update(tpf);
		
		guiNode.updateGeometricState(tpf, true);
		rootNode.updateGeometricState(tpf, true);
	}
	
	public void render(float tpf) {
		DisplaySystem.getDisplaySystem().getRenderer().draw(guiNode);
		DisplaySystem.getDisplaySystem().getRenderer().draw(rootNode);
	}
	
	public void cleanup() {
		desktop.dispose();
	}
	
	public Node getRootNode() {
		return rootNode;
	}
	
	public Node getGUINode() {
		return guiNode;
	}
	
	public JMEDesktop getDesktop() {
		return desktop;
	}
	
	public InputHandler getInputHandler() {
		return guiInput;
	}
}
