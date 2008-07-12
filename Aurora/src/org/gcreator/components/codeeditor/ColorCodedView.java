/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components.codeeditor;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.swing.text.*;
import org.gcreator.components.codeeditor.KeywordList.Keyword;
    
/**
 *
 * @author Serge Humphrey
 */
public final class ColorCodedView extends PlainView {
    
    protected Color unselected = Color.BLACK;
    protected Color selected = Color.BLUE.darker().darker();
    protected ColorCodedTextArea component;
    protected String document;
    /**
      * The cached strings
     */
    protected ArrayList<int[]> allstrings = new ArrayList<int[]>(5);
    protected ArrayList<int[]> allcomments = new ArrayList<int[]>(5);
    
    public ColorCodedView(Element e, final ColorCodedTextArea c) {
        super(e);
        this.component = c;
        c.view = this;
    }
    
    //<editor-fold desc="ripped paint method" default-state="collapsed">
    //Ripped from PlainView because selection doesn't work right in most Look&Feels. (it still doesn't work in Nimubs)
    @Override
    public void paint(Graphics g, Shape a) {
	Shape originalA = a;
        Rectangle alloc = (Rectangle) a;
	JTextComponent host = (JTextComponent) getContainer();
        Highlighter h = host.getHighlighter();
        g.setFont(host.getFont());
        int sel0 = host.getSelectionStart();
        int sel1 = host.getSelectionEnd();
        unselected = (host.isEnabled()) ? 
            host.getForeground() : host.getDisabledTextColor();
	Caret c = host.getCaret();
        selected = c.isSelectionVisible() && h != null ?
                       host.getSelectedTextColor() : unselected;
	updateMetrics();

        // If the lines are clipped then we don't expend the effort to
        // try and paint them.  Since all of the lines are the same height
        // with this object, determination of what lines need to be repainted
        // is quick.
        Rectangle clip = g.getClipBounds();
        int fontHeight = metrics.getHeight();
        int heightBelow = (alloc.y + alloc.height) - (clip.y + clip.height);
        int linesBelow = Math.max(0, heightBelow / fontHeight);
        int heightAbove = clip.y - alloc.y;
        int linesAbove = Math.max(0, heightAbove / fontHeight);
        int linesTotal = alloc.height / fontHeight;

	if (alloc.height % fontHeight != 0) {
	    linesTotal++;
	}
        // update the visible lines
        Rectangle lineArea = lineToRect(a, linesAbove);
        int y = lineArea.y + metrics.getAscent();
        int x = lineArea.x;
        Element map = getElement();
	int lineCount = map.getElementCount();
        int endLine = Math.min(lineCount, linesTotal - linesBelow);
	lineCount--;
	LayeredHighlighter dh = (h instanceof LayeredHighlighter) ?
	                   (LayeredHighlighter)h : null;
        for (int line = linesAbove; line < endLine; line++) {
	    if (dh != null) {
		Element lineElement = map.getElement(line);
		if (line == lineCount) {
		    dh.paintLayeredHighlights(g, lineElement.getStartOffset(),
					      lineElement.getEndOffset(),
					      originalA, host, this);
		}
		else {
		    dh.paintLayeredHighlights(g, lineElement.getStartOffset(),
					      lineElement.getEndOffset() - 1,
					      originalA, host, this);
		}
	    }
            drawLine(line, g, x, y);
            y += fontHeight;
        }
    }
    //</editor-fold>
    /**
     * {@inheritDoc}
     */
    
    @Override
    @SuppressWarnings("empty-statement")
    protected int drawUnselectedText(Graphics g, int x, int y, int p0, int p1) throws BadLocationException {
        Color defaultColor = unselected;
        g.setColor(defaultColor);
        
        Document doc = getDocument();
        document = doc.getText(0, doc.getLength());
        final String line = doc.getText(p0, p1 - p0);
        allstrings.clear();
        allcomments.clear();
        ArrayList<int[]> strings = new ArrayList<int[]>(5);
        ArrayList<int[]> comments = new ArrayList<int[]>(5);
        /*Mark the comments and the strings.*/
        if (p0 != p1) {
            int end = 0;
            while (end < doc.getLength()) {
                int cslash = indexOf2(end, "//"), cstar = indexOf2(end, "/*"),
                  qsingle = indexOf2(end, "\'"), qdouble = indexOf2(end, "\"");

                if (cslash < 0 && cstar < 0 && qsingle < 0 && qdouble < 0) {
                    break;
                }
                if (cslash < 0) {
                    cslash = Integer.MAX_VALUE;
                }
                if (cstar < 0) {
                    cstar = Integer.MAX_VALUE;
                }
                if (qsingle < 0) {
                    qsingle = Integer.MAX_VALUE;
                }
                if (qdouble < 0) {
                    qdouble = Integer.MAX_VALUE;
                }
                
                int index = Math.min(cslash, Math.min(cstar, Math.min(qsingle, qdouble)));

                if (index >= doc.getLength()) {
                    break;
                }
                
                if (index == cslash ) {
                    if (isInside(index-p0, comments)) {// avoid '/* *//' scenario
                        end++;
                    } else {
                        end = indexOf(cslash, "\n");
                        if ((cslash >= p0 && cslash <= p1) || (end >= p0 && end <= p1)) {
                            comments.add(new int[]{cslash+((isInside(cslash+1, comments)) ? 1 : 0)-p0, end-p0});
                        }
                        allcomments.add(new int[]{cslash+((isInside(cslash+1, comments)) ? 1 : 0), end, 0});
                        end += 2;
                    }
                } else if (index == cstar) {
                    end = indexOf(cstar+2, "*/");
                    if ((cstar <= p1 && cstar >= p0) || end >= p0) {
                        comments.add(new int[]{cstar-p0, end+1-p0});
                    }
                    allcomments.add(new int[]{cstar, end+1, 1});
                    end ++;
                } else if (index == qsingle) {
                    end = indexOf(qsingle+1, "\'");
                    if ((qsingle <= p1 && qsingle >= p0) || end >= p0) {
                        strings.add(new int[]{qsingle-p0, end-p0});
                    }
                    allstrings.add(new int[]{qsingle, end});
                    end++;
                } else if (index == qdouble) {
                    end = indexOf(qdouble+1, "\"");
                    if ((qdouble <= p1 && qdouble >= p0) || end >= p0) {
                        strings.add(new int[]{qdouble-p0, end-p0});
                    }
                    allstrings.add(new int[]{qdouble, end});
                    end++;
                }
            }
        }
        /*Done marking all the comments and strings*/
        String curstr = "";
        LinkedList<String>stubs = new LinkedList<String>();
        final Pattern seperator = Pattern.compile("\\W|[!#$%&\'\"\\(\\)\\*\\+,-\\./:;<=>\\?@\\[\\\\\\]\\^`\\{\\|\\}~]");
        for (int i = 0; i < line.toCharArray().length; i++) {
            char c = line.toCharArray()[i];
            //paint blocks of comment/string all at once.
            if (isInside(i, comments)) {
                if (curstr != "") {
                    stubs.add(curstr);
                    curstr = "";
                }
                String substr = null;
                for (int[] n : comments) {
                    if (i >= n[0] && i <= n[1]) {
                        substr = line.substring(Math.min(Math.max(n[0], 0), line.length()),
                                Math.min(Math.max(n[1]+1, Math.max(n[0], 0)), line.length()));
                        i = n[1];
                        break;
                    }
                }
                stubs.add(substr);
                continue;
            } else if (isInside(i, strings)) {
                if (curstr != "") {
                    stubs.add(curstr);
                    curstr = "";
                }
                String substr = null;
                for (int[] n : strings) {
                    if (i >= n[0] && i <= n[1]) {
                        substr = line.substring(Math.min(Math.max(n[0], 0), line.length()),
                                Math.min(Math.max(n[1]+1, Math.max(n[0], 0)), line.length()));
                        i = n[1];
                        break;
                    }
                }
                stubs.add(substr);
                continue;
            }
           
            if (seperator.matcher(Character.toString(c)).matches()) {
                if (curstr != "" && curstr != null) {
                    stubs.add(curstr);
                    curstr = "";
                }
                stubs.add(Character.toString(c));
            } else {
                curstr += c;
            }
            
        }
        
        if (curstr != "") {
            stubs.add(curstr);
        }
//        org.gcreator.core.gcreator.debugOut.println("------------------------------------");
//        for (String stub : stubs) {
//            org.gcreator.core.gcreator.debugOut.println(stub);
//        }
        
        int written = 0;
        final Font originalFont = g.getFont();
        for (String stub : stubs) {
            if (isInside(written, comments)) {
                g.setColor(component.keywordList.getCommentColor());//Comment Color
                g.setFont(new Font(g.getFont().getFamily(), Font.ITALIC, g.getFont().getSize()));
            } else if (isInside(written, strings)) {
                g.setColor(component.keywordList.getStringColor());
            } else if (!seperator.matcher(stub).matches()) {
               Color c = getColor(stub);
               if (c != null) {
                   g.setColor(c);
               }
            }
            x = Utilities.drawTabbedText(new Segment(stub.toCharArray(), 0, stub.length()), x, y, g, this, p0);
            written += stub.length();
            g.setColor(defaultColor);
            g.setFont(originalFont);
        }
        return x;
    }
    
    @Override
    protected int drawSelectedText(Graphics g, int x, int y, final int p0, final int p1) throws BadLocationException {
       return super.drawSelectedText(g, x, y, p0, p1);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    
    public float nextTabStop(float x, int tabOffset) {
        return x+component.getFontMetrics(component.getFont()).charWidth(' ')*6;
    }
    
    /**
     * Gets the color for a keyword, or return <tt>null</tt> if the given string is not a keyword
     */
    private Color getColor(String kwd) {
        boolean number = true;
        for (char c : kwd.toCharArray()) {
            if ((c < '0' || c > '9') && c != '.') {
                number = false;
                break;
            }
        }
        
        if (number) {
            return component.getKeywordList().getNumberColor();
        }
        
        Keyword[] keywords = component.getKeywordList().getKeywords();
        for (Keyword k : keywords) {
           if (k.getName().equals(kwd)) {
                return k.getColor();
            }
        }
        
        return null;
    }
    
    private boolean isInside(int i, ArrayList<int[]> list) {
        for (int[] c : list) {
            if (i >= c[0] && i <= c[1]) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    //Gives this method package access.
    protected void damageLineRange(int line0, int line1, Shape a, Component host) {
        super.damageLineRange(line0, line1, a, host);
    } 
    
    int indexOf(int start, String thing) {
        int pos = document.substring(start).indexOf(thing);
        if (pos < 0) {
            pos = getDocument().getLength();
        } else {
            pos += start;
        }
        return pos;
    }
    
    int indexOf2(int start, String thing) {
        int pos = document.substring(start).indexOf(thing);
        return pos + ((pos != -1) ? start : 0);
    }
}