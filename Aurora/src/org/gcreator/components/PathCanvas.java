/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JPanel;
import org.gcreator.core.GPanel;
import org.gcreator.core.gcreator;
import org.gcreator.editors.PathEditor;
import org.gcreator.managers.Registry;
import org.gcreator.units.PathNode;

/**
 *
 * @author Serge Humphrey
 */

public class PathCanvas extends JPanel {
    public Vector<PathNode> nodes;
    public PathEditor editor;
    public boolean dragging;
    public PathNode draggingNode;
    public int d = 10;
    private PathNode selectedNode;

    public PathCanvas(PathEditor e) {
        this.editor = e;
        this.nodes = e.nodes;
    }

    public PathCanvas(PathEditor e, Boolean doubleBuffered) {
        super(doubleBuffered);
        this.editor = e;
        this.nodes = e.nodes;
    }
    {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = nodes.size()-1; i >= 0; i--) {
                    PathNode p = nodes.get(i);
                    if (p.distance(e.getPoint()) <= d+2) {
                        setSelectedNode(p);
                        draggingNode = p;
                        dragging = true;
                        break;
                    }
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });
        
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    int x = e.getX();
                    int y = e.getY();
                    if(x<0)
                        x = 0;
                    if(y<0)
                        y = 0;
                    if(editor.path.snapGrid){
                        if(x%editor.path.gridx<(editor.path.gridx/2))
                            x = (x/editor.path.gridx)*editor.path.gridx;
                        else
                            x = (x/editor.path.gridx+1)*editor.path.gridx;
                        if(y%editor.path.gridy<(editor.path.gridy)/2)
                            y = (y/editor.path.gridy)*editor.path.gridy;
                        else
                            y = (y/editor.path.gridy+1)*editor.path.gridy;
                    }
                    draggingNode.setLocation(x, y);
                    editor.getXSpinner().setValue(new Integer(x));
                    editor.getYSpinner().setValue(new Integer(y));
                    editor.getList().repaint();
                    repaint();
                }
            }
        });
    }
    
    public PathNode getSelectedNode() {
        return selectedNode;
    }
  
    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.WHITE);
        g.fillRect(0,0, getWidth(), getHeight());
        if(editor.path.showGrid) {
            paintGrid(g);
        }
        drawPath(g);
        Graphics2D g2 = (Graphics2D)g;
        setAntialiasing(g2, (Boolean)Registry.get("Graphics.antialiasing"));
        for (int i = 0; i < nodes.size(); i++) {
            PathNode p = nodes.get(i);
            if (p == selectedNode) {
                continue;
            }
            g2.setColor(Color.BLUE);
            g2.fillOval(p.x-d/2, p.y-d/2, d,d);
            g2.setColor(new Color(0,0,0,0.5F));
            g2.drawOval(p.x-d/2, p.y-d/2, d,d);
        }
    
        if (selectedNode != null) {
            PathNode p = selectedNode;
            g2.setColor(Color.RED);
            g2.fillOval(p.x-d/2, p.y-d/2, d,d);
            g2.setColor(new Color(0,0,0,0.5F));
            g2.drawOval(p.x-d/2, p.y-d/2, d,d);
        }
    }
    
    public void paintGrid(Graphics g){
        g = g.create();
        g.setColor(Color.WHITE);
        g.setXORMode(Color.BLACK);
        for(int i = 0; i < getWidth(); i+=editor.path.gridx){
            g.drawLine(i, 0, i, getHeight());
        }
        for(int i = 0; i < getHeight(); i+=editor.path.gridy){
            g.drawLine(0, i, getWidth(), i);
        }
    }
    
    private double direction(double x1, double y1, double x2, double y2){
        return Math.atan2(x2-x1,y2-y1)-Math.PI/2;
    }

    private double direction(Point p1, Point p2) {
        return Math.atan2(p2.x-p1.x,p2.y-p1.y)-Math.PI/2;
    }

    private void setAntialiasing(java.awt.Graphics2D g, boolean antia) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
            (antia) ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
    }

    public void setSelectedNode(PathNode node) {
        this.selectedNode = node;
        editor.getList().updateUI();
        if (node != null) {
           editor.getList().setSelectedIndex(nodes.indexOf(node));
           editor.getXSpinner().setValue(new Integer(node.x));
           editor.getYSpinner().setValue(new Integer(node.y));
           editor.getSpeedSpinner().setValue(new Double(node.getSpeed()));
        }
        else {
           editor.getList().setSelectedIndex(-1);
           editor.getXSpinner().setValue(new Integer(0));
           editor.getYSpinner().setValue(new Integer(0));
           editor.getSpeedSpinner().setValue(new Double(0.0D));
        }
        editor.getList().updateUI();
        repaint();
    }

    private void drawPath(java.awt.Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        setAntialiasing(g2, (Boolean)Registry.get("Graphics.antialiasing"));
        boolean smooth = editor.smoothCurves;
        int size = nodes.size();
        
        if (smooth && size > 2) {
            Vector<Point>invisiPoints = new Vector<Point>(10);
            Path2D.Float path = new Path2D.Float();
            path.moveTo(nodes.get(0).x, nodes.get(0).y);
            for (int i = 1; i < size-1; i+= 2) {
                PathNode p = nodes.get(i);
                if (i > 2) {
                    double dir, x, y;
                    dir = direction(nodes.get(i-2), nodes.get(i-1));
                    x = nodes.get(i-1).x+Math.cos(dir)*50;
                    y = nodes.get(i-1).y-Math.sin(dir)*50;
                    path.curveTo(x, y, nodes.get(i).x, nodes.get(i).y, nodes.get(i+1).x, nodes.get(i+1).y);
                    invisiPoints.add(new Point((int)x,(int)y));
                } else {
                    path.quadTo(nodes.get(i).x, nodes.get(i).y, nodes.get(i+1).x, nodes.get(i+1).y);
                }
                if (i+3 == size) {
                    double dir, x, y;
                    dir = direction(nodes.get(size-3), nodes.get(size-2));
                    x = nodes.get(size-2).x+Math.cos(dir)*50;
                    y = nodes.get(size-2).y-Math.sin(dir)*50;
                    invisiPoints.add(new Point((int)x,(int)y));
                    path.quadTo(x, y, nodes.get(size-1).x, nodes.get(size-1).y);
                }
            }

            if (editor.closedCurves) {
                double dir, x1, y1, x2, y2;
                dir = direction(nodes.get(size-2), nodes.get(size-1));
                x1 = nodes.get(size-1).x+Math.cos(dir)*50;
                y1 = nodes.get(size-1).y-Math.sin(dir)*50;
                invisiPoints.add(new Point((int)x1,(int)y1));
                dir = direction(nodes.get(1), nodes.get(0));
                x2 = nodes.get(0).x+Math.cos(dir)*50;
                y2 = nodes.get(0).y-Math.sin(dir)*50;
                invisiPoints.add(new Point((int)x2,(int)y2));
                path.curveTo(x1, y1, x2, y2, nodes.get(0).x, nodes.get(0).y);
            }
            
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(5));
            g2.draw(path);
            g2.setColor(Color.YELLOW);
            g2.setStroke(new BasicStroke(3));
            g2.draw(path);
            /*
             * Uncomment this to view invisible nodes
             * 
            for (Point p : invisiPoints) {
                g2.setColor(Color.MAGENTA);
                g2.fillOval(p.x-d/2, p.y-d/2, d, d);
            }
             */
        } else if (size > 0){
            Stroke smallStroke = new BasicStroke(3);
            Stroke bigStroke = new BasicStroke(5);
            Iterator<PathNode> i = nodes.iterator();
            PathNode p = i.next();
            while (i.hasNext()) {
                PathNode op = p;
                p = i.next();
                g2.setStroke(bigStroke);
                g2.setColor(Color.BLACK);
                g2.drawLine(op.x, op.y, p.x, p.y);
                g2.setStroke(smallStroke);
                g2.setColor(Color.YELLOW);
                g2.drawLine(op.x, op.y, p.x, p.y);
            }
            if (editor.closedCurves && size > 2) {
                PathNode first = nodes.firstElement();
                g2.setStroke(bigStroke);
                g2.setColor(Color.BLACK);
                g2.drawLine(p.x, p.y, first.x, first.y);
                g2.setStroke(smallStroke);
                g2.setColor(Color.YELLOW);
                g2.drawLine(p.x, p.y, first.x, first.y);
            }
        }
    }
}