/*
 * @(#)BobMenuBarUI.java	1.39 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.gcreator.bob.boblook;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;
import java.io.Serializable;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.BasicMenuBarUI;
//REMIND
import javax.swing.plaf.basic.*;

/**
 * A Windows L&F implementation of MenuBarUI.  This implementation 
 * is a "combined" view/controller.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * 1.39 11/17/05
 * @author Georges Saab
 * @author Rich Schiavi
 */

public class BobMenuBarUI extends BasicMenuBarUI
{

    public static ComponentUI createUI(JComponent x) {
	return new BobMenuBarUI();
    }

} // end class

