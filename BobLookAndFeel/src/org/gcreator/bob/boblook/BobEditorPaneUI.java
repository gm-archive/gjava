/*
 * @(#)BobEditorPaneUI.java	1.15 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.gcreator.bob.boblook;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.BasicEditorPaneUI;

/**
 * Provides the look and feel for an pluggable content-type text editor.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @author  Timothy Prinzing
 * @version 1.15 11/17/05
 */
public class BobEditorPaneUI extends BasicEditorPaneUI {

    /**
     * Creates a UI for the JTextPane.
     *
     * @param c the JTextPane component
     * @return the UI
     */
    public static ComponentUI createUI(JComponent c) {
        return new BobEditorPaneUI();
    }

    /**
     * Creates the object to use for a caret.  By default an
     * instance of BobTextUI.BobCaret is created.  This method
     * can be redefined to provide something else that implements
     * the Caret interface.
     *
     * @return the caret object
     */
    protected Caret createCaret() {
	return BobTextUI.createCaret();
    }

}


