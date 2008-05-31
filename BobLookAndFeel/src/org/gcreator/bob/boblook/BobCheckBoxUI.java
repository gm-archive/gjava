/*
 * @(#)BobCheckBoxUI.java	1.24 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.gcreator.bob.boblook;

import javax.swing.*;

import javax.swing.plaf.*;

import java.awt.*;

/**
 * BobCheckBox implementation
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @version 1.24 11/17/05
 * @author Rich Schiavi
 */
public class BobCheckBoxUI extends BobRadioButtonUI {

    private static final BobCheckBoxUI motifCheckBoxUI = new BobCheckBoxUI();

    private final static String propertyPrefix = "CheckBox" + ".";

    private boolean defaults_initialized = false;


    // ********************************
    //         Create PLAF
    // ********************************
    public static ComponentUI createUI(JComponent c){
	return motifCheckBoxUI;
    }

    public String getPropertyPrefix() {
	return propertyPrefix;
    }

    // ********************************
    //          Defaults
    // ********************************
    public void installDefaults(AbstractButton b) {
	super.installDefaults(b);
	if(!defaults_initialized) {
	    icon = UIManager.getIcon(getPropertyPrefix() + "icon");
	    defaults_initialized = true;
	}
    }

    protected void uninstallDefaults(AbstractButton b) {
	super.uninstallDefaults(b);
	defaults_initialized = false;
    }
} 
