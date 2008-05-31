/*
 * @(#)BobPopupMenuSeparatorUI.java	1.12 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.gcreator.bob.boblook;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.plaf.*;

/**
 * A Bob L&F implementation of PopupMenuSeparatorUI.  This implementation
 * is a "combined" view/controller.
 *
 * @version 1.12 11/17/05
 * @author Jeff Shapiro
 */

public class BobPopupMenuSeparatorUI extends BobSeparatorUI
{
    public static ComponentUI createUI( JComponent c )
    {
        return new BobPopupMenuSeparatorUI();
    }

    public void paint( Graphics g, JComponent c )
    {
        Dimension s = c.getSize();

	g.setColor( c.getForeground() );
	g.drawLine( 0, 0, s.width, 0 );

	g.setColor( c.getBackground() );
	g.drawLine( 0, 1, s.width, 1 );
    }

    public Dimension getPreferredSize( JComponent c )
    {
        return new Dimension( 0, 2 );
    }

}
