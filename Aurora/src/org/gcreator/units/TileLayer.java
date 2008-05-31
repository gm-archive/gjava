/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Vector;

/**
 *
 * @author Serge Humphrey
 */
public class TileLayer implements Serializable {
    public Vector<Tile> tiles = new Vector<Tile>();
    public int depth;
    public boolean visible = true;
    public TileLayer(int depth) {
        this.depth = depth;
    }
    
    public void add(Tile t) {
        tiles.add(t);
    }
    
    public boolean remove(Tile t) {
        return tiles.remove(t);
    }
    
    @Override
    public String toString() {
        return NumberFormat.getIntegerInstance().format(depth);
    }
}
