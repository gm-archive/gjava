/*
 * Actor.java
 * 
 * Created on 09-Sep-2007, 16:42:21
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.fileclass.res;

import java.util.Vector;
import org.gcreator.units.PathNode;


     
/**
 *
 * @author Serge Humphrey
 */
    public class Path extends Resource {
    static final long serialVersionUID = 1L;
    public boolean smoothCurves,  closedCurves, showGrid, snapGrid;
    //show/snapGrid are for EDITOR purposes ONLY!
    public Vector<PathNode> nodes;

    public Path(Vector<PathNode> nodes) {
        this.nodes = nodes;
    }

    public String writeXml() {
        String xml = "";
        xml += "<?xml version=\"1.0\"?>\n"; //changes for new version of path
        xml += "<path>\n";
        
        xml += "<smooth>" + smoothCurves + "</smooth>\n";
        xml += "<closed>" + closedCurves + "</closed>\n";
        xml += "<showgrid>" + showGrid + "</showgrid>\n";
        xml += "<snapgrid>" + showGrid + "</snapgrid>\n";
        xml += "<nodes>\n";
        for (PathNode e : nodes) {
            xml += "<node ";
            xml += "x=\""+e.x+"\" ";
            xml += "y=\""+e.y+"\" ";
            xml += "speed=\""+e.getSpeed()+"\" ";
            xml += "/>\n";
        }
        xml += "</nodes>";
        xml += "</path>";
        return xml;
    }
     
    public void readXml(String xml) {
        String[] lines = xml.split("\n");
        String line;
        if(!lines[0].matches("<\\?xml version=\"1\\.0\"\\?>"))
            return;
        if(!lines[1].matches("<path>"))
            return;
        if(lines.length < 3)
            return;
        int i = 3;
        while(i < lines.length) {
            line = lines[i];
            if(line == null || line.equals(""))
                continue;
            if(line.equals("</path>")){
                break;
            }
            
            if (line.matches("<smooth>(true|false)</smooth>")) {
                String smooth = line.replaceAll("<smooth>(true|false)</smooth>", "$1");
                smoothCurves = Boolean.parseBoolean(smooth);
            } else if (line.matches("<closed>(true|false)</closed>")) {
                String closed = line.replaceAll("<closed>(true|false)</closed>", "$1");
                closedCurves = Boolean.parseBoolean(closed);
            } else if (line.matches("<showgrid>(true|false)</showgrid>")) {
                String closed = line.replaceAll("<showgrid>(true|false)</showgrid>", "$1");
                showGrid = Boolean.parseBoolean(closed);
            } else if (line.matches("<snapgrid>(true|false)</snapgrid>")) {
                String closed = line.replaceAll("<snapgrid>(true|false)</snapgrid>", "$1");
                snapGrid = Boolean.parseBoolean(closed);
            } else if (line.matches("<nodes>")) {
                while (!lines[++i].matches("</nodes>")) {
                    nodes.add(new PathNode(lines[i]));
                }
            }
            i++;
        }
    }
    
    public String exportToHtml(boolean xhtml) {
        String html = "";
        return html;
    }

    //SuppressWarnings("unchecked")
    public Object clone() {
        Path a = new Path((Vector<PathNode>)nodes.clone());
        a.smoothCurves = smoothCurves;
        a.closedCurves = closedCurves;
        a.showGrid = showGrid;
        a.snapGrid = snapGrid;
        return a;
    }
}
