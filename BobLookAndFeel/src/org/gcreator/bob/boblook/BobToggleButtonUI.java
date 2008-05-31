/*
 * @(#)BobToggleButtonUI.java	1.22 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
 
package org.gcreator.bob.boblook;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.*;


/**
 * BasicToggleButton implementation
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @version 1.22 11/17/05
 * @author Rich Schiavi
 */
public class BobToggleButtonUI extends BasicToggleButtonUI 
{
    private final static BobToggleButtonUI motifToggleButtonUI = new BobToggleButtonUI();

    protected Color selectColor;

    private boolean defaults_initialized = false;
    
    // ********************************
    //         Create PLAF
    // ********************************
    public static ComponentUI createUI(JComponent b) {
	return motifToggleButtonUI;
    }

    // ********************************
    //          Install Defaults
    // ********************************
    public void installDefaults(AbstractButton b) {
	super.installDefaults(b);
	if(!defaults_initialized) {
	    selectColor = UIManager.getColor(getPropertyPrefix() + "select");
	    defaults_initialized = true;
	}
        LookAndFeel.installProperty(b, "opaque", Boolean.FALSE);
    }

    protected void uninstallDefaults(AbstractButton b) {
	super.uninstallDefaults(b);
	defaults_initialized = false;
    }
    
    // ********************************
    //          Default Accessors
    // ********************************

    protected Color getSelectColor() {
	return selectColor;
    }
    
    // ********************************
    //         Paint Methods
    // ********************************
    protected void paintButtonPressed(Graphics g, AbstractButton b) {
        if (b.isContentAreaFilled()) {
	    Color oldColor = g.getColor();
	    Dimension size = b.getSize();
	    Insets insets = b.getInsets();
	    Insets margin = b.getMargin();

	    if(b.getBackground() instanceof UIResource) {
		g.setColor(getSelectColor());
	    }
	    g.fillRect(insets.left - margin.left,
		       insets.top - margin.top, 
		       size.width - (insets.left-margin.left) - (insets.right - margin.right),
		       size.height - (insets.top-margin.top) - (insets.bottom - margin.bottom));
	    g.setColor(oldColor);
	}
    }
    
    public Insets getInsets(JComponent c) { 
	Border border = c.getBorder();
	Insets i = border != null? border.getBorderInsets(c) : new Insets(0,0,0,0);
	return i;
    }

} 


