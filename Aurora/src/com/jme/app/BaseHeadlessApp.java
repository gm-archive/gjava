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

package com.jme.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme.input.InputSystem;
import com.jme.renderer.Renderer;

/**
 * <code>BaseHeadlessApp</code> provides the simplest possible implementation
 * of a main game loop for headless apps. Logic is updated as quickly as
 * possible, with no interpolation to account for shifting frame rates.
 * Rendering occurs "as needed".  To make this more interesting, might need
 * to add a finer control over the timer.
 *
 * @author Joshua Slack, Mark Powell, Eric Woroshow
 * @version $Id: BaseHeadlessApp.java,v 1.9 2007/10/05 22:43:48 nca Exp $
 */
public abstract class BaseHeadlessApp extends AbstractGame {
    private static final Logger logger = Logger.getLogger(BaseHeadlessApp.class
            .getName());

  /**
   * The simplest main game loop possible: render and update as fast as
   * possible.
   */
  public final void start() {
    logger.info( "Application started.");
    try {
      getAttributes();

      initSystem();

      assertDisplayCreated();

      initGame();

      //main loop
            Renderer r = display.getRenderer();
      while (!finished && !display.isClosing()) {
        //update game state, do not use interpolation parameter
        update( -1.0f);

        //render
        render( -1.0f);

        //draw queue contents
        r.displayBackBuffer();
      }
    }
    catch (Throwable t) {
        logger.logp(Level.SEVERE, this.getClass().toString(), "start()", "Exception in game loop", t);
        t.printStackTrace();
    }

    cleanup();
    logger.info( "Application ending.");

    if (display != null)
            display.reset();
    quit();
  }

  /**
   * Quits the program abruptly using <code>System.exit</code>.
   * @see AbstractGame#quit()
   */
  protected void quit() {
      if (display != null)
          display.close();
    System.exit(0);
  }

  /**
   * @param interpolation unused in this implementation
   * @see AbstractGame#update(float interpolation)
   */
  protected abstract void update(float interpolation);

  /**
   * @param interpolation unused in this implementation
   * @see AbstractGame#render(float interpolation)
   */
  protected abstract void render(float interpolation);

  /**
   * @see AbstractGame#initSystem()
   */
  protected abstract void initSystem();

  /**
   * @see AbstractGame#initGame()
   */
  protected abstract void initGame();

  /**
   * @see AbstractGame#reinit()
   */
  protected abstract void reinit();

  /**
   * @see AbstractGame#cleanup()
   */
  protected abstract void cleanup();
}
