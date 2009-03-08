/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.components;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Ali
 */
public class SaveFile implements Serializable {
private static final long serialVersionUID = 1L;

public Vector<Room2D> rooms=null;
public Room2D currentRoom=null;

}
