/*
 * @(#)BobButtonListener.java	1.19 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
 

package org.gcreator.bob.boblook;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;
import javax.swing.event.*;

/**
 * Button Listener
 * <p>
 *
 * @version 1.19 11/17/05
 * @author Rich Schiavi
 */
public class BobButtonListener extends BasicButtonListener {
    public BobButtonListener(AbstractButton b ) {
        super(b);
    }

    protected void checkOpacity(AbstractButton b) {
	b.setOpaque( false );
    }
}


