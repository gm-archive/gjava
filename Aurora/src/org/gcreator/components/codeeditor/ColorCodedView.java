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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.PlainView;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;
import org.gcreator.components.codeeditor.KeywordList.Keyword;
import org.gcreator.managers.ScriptThemeManager;

/**
 *
 * @author Serge Humphrey
 */
public final class ColorCodedView extends PlainView {

    protected Color unselected = ScriptThemeManager.getColors().get("Plain");
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

    //<editor-fold desc="Ripped paint method" default-state="collapsed">
    //Ripped from PlainView because selection doesn't work right in most Look&Feels. (it still doesn't work in Nimubs)
    @Override
    public void paint(final Graphics g, final Shape a) {
        Shape originalA = a;
        Rectangle alloc = (Rectangle) a;
        ColorCodedTextArea host = (ColorCodedTextArea) getContainer();
        Highlighter h = host.getHighlighter();
        g.setFont(host.getFont());
        int sel0 = host.getSelectionStart();
        int sel1 = host.getSelectionEnd();
        unselected = (host.isEnabled()) ? /*host.getForeground()*/ host.getKeywordList().getPlainTextColor() : host.getDisabledTextColor();
        Caret c = host.getCaret();
        selected = c.isSelectionVisible() && h != null ? host.getSelectedTextColor() : unselected;
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
        Object[] tags = new Object[4];
        try {
            String before = null, after = null;
            if (component.getCaretPosition() > 0 && !isInside(component.getCaretPosition() - 1, allcomments)
                            && !isInside(component.getCaretPosition() - 1, allstrings)) {
                before = component.getText(component.getCaretPosition() - 1, 1);
            }
            
            if (component.getCaretPosition() < component.getDocument().getLength()) {
                after = component.getText(component.getCaretPosition(), 1);
            }
            
            String extra = (component.getKeywordList().allowMarkup()) ? "|<|>" : "";
            String extra_open = (component.getKeywordList().allowMarkup()) ? "|<" : "";
            
            if (before != null && before.matches("\\(|\\)|\\[|\\]|\\]|\\{|\\}"+extra)) {
                Color color = Color.YELLOW;
                int index = -1;
                if (before.matches("\\(|\\[|\\{"+extra_open)) {
                    if (component.getCaretPosition() != document.length()) {
                        index = findEndBrace(before.charAt(0), (char)((before.charAt(0) != '(')
                            ? before.charAt(0) + 2 : before.charAt(0) + 1), component.getCaretPosition(), document.length(), false);
                    }
                    if (index < 0) {
                        color = Color.RED;
                    }
                } else {                    index = findEndBrace(before.charAt(0), (char)((before.charAt(0) != ')')
                            ? before.charAt(0) - 2 : before.charAt(0) - 1), 0, component.getCaretPosition()-1, true);
                    if (index < 0) {
                        color = Color.RED;
                    }
                }
                tags[0] = h.addHighlight(component.getCaretPosition() - 1, component.getCaretPosition(),
                        new DefaultHighlighter.DefaultHighlightPainter(color));
                if (index >= 0) {
                    tags[1] = h.addHighlight(index, index + 1, new DefaultHighlighter.DefaultHighlightPainter(color));
                }
            } else if (after != null && after.matches("\\(|\\)|\\[|\\]|\\]|\\{|\\}"+extra)) {
                Color color = Color.YELLOW;
                int index = -1;
                if (after.matches("\\(|\\[|\\{"+extra_open)) {
                    index = findEndBrace(after.charAt(0), (char)((after.charAt(0) != '(')
                            ? after.charAt(0) + 2 : after.charAt(0) + 1),
                            Math.min(component.getCaretPosition() + 1, document.length()), document.length(), false);
                    if (index < 0) {
                        color = Color.RED;
                    }
                } else {
                    index = findEndBrace(after.charAt(0), (char)((after.charAt(0) != ')')
                            ? after.charAt(0) - 2 : after.charAt(0) - 1), 0, component.getCaretPosition(), true);
                    if (index < 0) {
                        color = Color.RED;
                    }
                }
                tags[0] = h.addHighlight(component.getCaretPosition(), component.getCaretPosition() + 1,
                        new DefaultHighlighter.DefaultHighlightPainter(color));
                if (index >= 0) {
                    tags[1] = h.addHighlight(index, index + 1, new DefaultHighlighter.DefaultHighlightPainter(color));
                }
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(ColorCodedView.class.getName()).log(Level.SEVERE, null, ex);
        }
        LayeredHighlighter dh = (h instanceof LayeredHighlighter) ? (LayeredHighlighter) h : null;
        for (int line = linesAbove; line < endLine; line++) {
            if (dh != null) {
                Element lineElement = map.getElement(line);
                if (line == lineCount) {
                    dh.paintLayeredHighlights(g, lineElement.getStartOffset(),
                            lineElement.getEndOffset(),
                            originalA, host, ColorCodedView.this);
                } else {
                    dh.paintLayeredHighlights(g, lineElement.getStartOffset(),
                            lineElement.getEndOffset() - 1,
                            originalA, host, ColorCodedView.this);
                }
            }
            drawLine(line, g, x, y);
            y += fontHeight;
        }
        for (Object o : tags) {
            if (o != null) {
                h.removeHighlight(o);
            }
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
        ArrayList<int[]> strings = new ArrayList<int[]>(5);
        ArrayList<int[]> comments = new ArrayList<int[]>(5);
        /*Mark the comments and the strings.*/
        if (p0 != p1) {
            allstrings.clear();
            allcomments.clear();
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

                if (index == cslash) {
                    if (isInside(index - p0, comments)) {// avoid '/* *//' scenario
                        end++;
                    } else {
                        end = indexOf(cslash, "\n");
                        if ((cslash >= p0 && cslash <= p1) || (end >= p0 && end <= p1)) {
                            comments.add(new int[]{cslash + ((isInside(cslash + 1, comments)) ? 1 : 0) - p0, end - p0});
                        }
                        allcomments.add(new int[]{cslash + ((isInside(cslash + 1, comments)) ? 1 : 0), end, 0});
                        end += 1;
                    }
                } else if (index == cstar) {
                    end = indexOf(cstar + 2, "*/");
                    if ((cstar <= p1 && cstar >= p0) || end >= p0) {
                        comments.add(new int[]{cstar - p0, end + 1 - p0});
                    }
                    allcomments.add(new int[]{cstar, end + 1, 1});
                    end++;
                } else if (index == qsingle) {
                    end = indexOf(qsingle + 1, "\'");
                    if ((qsingle <= p1 && qsingle >= p0) || end >= p0) {
                        strings.add(new int[]{qsingle - p0, end - p0});
                    }
                    allstrings.add(new int[]{qsingle, end});
                    end++;
                } else if (index == qdouble) {
                    end = indexOf(qdouble + 1, "\"");
                    if ((qdouble <= p1 && qdouble >= p0) || end >= p0) {
                        strings.add(new int[]{qdouble - p0, end - p0});
                    }
                    allstrings.add(new int[]{qdouble, end});
                    end++;
                }
            }
        }
        /*Done marking all the comments and strings*/
        String curstr = "";
        LinkedList<String> stubs = new LinkedList<String>();
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
                                Math.min(Math.max(n[1] + 1, Math.max(n[0], 0)), line.length()));
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
                                Math.min(Math.max(n[1] + 1, Math.max(n[0], 0)), line.length()));
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
        return x + component.getFontMetrics(component.getFont()).charWidth(' ') * 6;
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

    private int indexOf(int start, String thing) {
        int pos = document.substring(start).indexOf(thing);
        if (pos < 0) {
            pos = getDocument().getLength();
        } else {
            pos += start;
        }
        return pos;
    }

    private int indexOf2(int start, String thing) {
        int pos = document.substring(start).indexOf(thing);
        return pos + ((pos != -1) ? start : 0);
    }
    
    private int findEndBrace(char opener, char closer, int start, int end, boolean china) {
        //@china: Everything is backwards in China.
        try {
            int pos = -1;
            int length = component.getDocument().getLength();
            String text = component.getText(start, end-start);
            if (china) {
                char[] chars = new char[text.length()];
                for (int i = 0; i < text.length(); i++) {
                    chars[i] = text.charAt(text.length()-1-i);
                }
                text = new String(chars);
            }
            
            Matcher mo = Pattern.compile("\\"+opener).matcher(text);
            Matcher mc = Pattern.compile("\\"+closer).matcher(text);
            ArrayList<Bracket> list = new ArrayList<Bracket>(4);
            final int OPEN = 0;
            final int CLOSE = 1;
            while (mo.find()) {
                list.add(new Bracket(mo.end(), OPEN));
            }
            while (mc.find()) {
                list.add(new Bracket(mc.end(), CLOSE));
            }
            Bracket[] values = list.toArray(new Bracket[list.size()]);
            Arrays.sort(values);
            int open = 0;
            for (Bracket b : values) {
                int mend = b.position+start-1;
                if (china) {
                    mend = text.length()-mend-1;
                }
                if (isInside(mend, allcomments) || isInside(mend, allstrings)) {
                    continue;
                }
                if (b.direction == OPEN) {
                    open++;
                } else {
                    open--;
                }
                
                if (open < 0) {
                    pos = mend;
                    break;
                }
            }
            
            return pos;
        } catch (BadLocationException ex) {
            Logger.getLogger(ColorCodedView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    private class Bracket implements Comparable {
        public int direction;
        public int position;

        private Bracket(int pos, int dir) {
            position = pos;
            direction = dir;
        }
        
        @Override
        public int compareTo(Object o) {
            if (o instanceof Bracket) {
                int pos = ((Bracket)o).position;
                if (pos == position) {
                    return 0;
                } else if (position < pos) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return -1;
        }
    }
}
