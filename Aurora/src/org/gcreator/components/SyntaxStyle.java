/*
 * SyntaxStyle.java - A simple text style class
 * Copyright (C) 1999 Slava Pestov
 *
 * You may use and modify this package for any purpose. Redistribution is
 * permitted, in both source and binary form, provided that this notice
 * remains intact in all source distributions of this package.
 */

package org.gcreator.components;

import java.awt.*;

/**
 * A simple text style class. It can specify the color, italic flag,
 * and bold flag of a run of text.
 * @author Slava Pestov
 * @version $Id: SyntaxStyle.java,v 1.6 1999/12/13 03:40:30 sp Exp $
 */
public class SyntaxStyle
{
	/**
	 * Creates a new SyntaxStyle.
	 * @param color The text color
	 * @param italic True if the text should be italics
	 * @param bold True if the text should be bold
	 */
	public SyntaxStyle(Color color, Font f)
	{
		this.color = color;
		this.f = f;
	}
        
        public SyntaxStyle(Color color, boolean italic, boolean bold){
            this.color = color;
            f = new Font(Font.MONOSPACED, (italic? Font.ITALIC : 0) | (bold? Font.BOLD : 0), 12);
        }

	/**
	 * Returns the color specified in this style.
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Returns true if no font styles are enabled.
	 */
	public boolean isPlain()
	{
		return !(isBold() || isItalic());
	}

	/**
	 * Returns true if italics is enabled for this style.
	 */
	public boolean isItalic()
	{
		return f.isItalic();
	}

	/**
	 * Returns true if boldface is enabled for this style.
	 */
	public boolean isBold()
	{
		return f.isBold();
	}

	/**
	 * Returns the specified font, but with the style's bold and
	 * italic flags applied.
	 */
	public Font getStyledFont(Font font)
	{
		/*if(font == null)
			throw new NullPointerException("font param must not"
				+ " be null");*/
            if(f==null)
                f = new Font(Font.MONOSPACED, Font.PLAIN, 12);
		if(f.equals(lastFont))
			return lastStyledFont;
		lastFont = f;
		lastStyledFont = new Font(f.getFamily(),
			(f.isBold() ? Font.BOLD : 0)
			| (f.isItalic() ? Font.ITALIC : 0),
			f.getSize());
		return lastStyledFont;
	}

	/**
	 * Returns the font metrics for the styled font.
	 */
	public FontMetrics getFontMetrics(Font font)
	{
		if(font == null)
			throw new NullPointerException("font param must not"
				+ " be null");
		if(f.equals(lastFont) && fontMetrics != null)
			return fontMetrics;
		//lastFont = font;
                lastFont = f;
		lastStyledFont = new Font(f.getFamily(),
			(f.isBold() ? Font.BOLD : 0)
			| (f.isItalic() ? Font.ITALIC : 0),
			f.getSize());
		fontMetrics = /*Toolkit.getDefaultToolkit().*/getFontMetrics(lastStyledFont);
		return fontMetrics;
	}

	/**
	 * Sets the foreground color and font of the specified graphics
	 * context to that specified in this style.
	 * @param gfx The graphics context
	 * @param font The font to add the styles to
	 */
	public void setGraphicsFlags(Graphics gfx, Font font)
	{
		Font _font = getStyledFont(font);
		gfx.setFont(_font);
		gfx.setColor(color);
	}

	/**
	 * Returns a string representation of this object.
	 */
	public String toString()
	{
		return getClass().getName() + "[color=" + color +
			(f.isItalic() ? ",italic" : "") +
			(f.isBold() ? ",bold" : "") + "]";
	}

	// private members
	private Color color;
	private Font f;
	private Font lastFont;
	private Font lastStyledFont;
	private FontMetrics fontMetrics;
}
