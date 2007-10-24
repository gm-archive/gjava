/*
 * load_Rooms.java
 * 
 * Created on 19-Oct-2007, 15:24:00
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.core;

import java.awt.Image;
import javax.swing.JApplet;
import javax.swing.JFrame;
import org.gcreator.compilers.gjava.components.Scene;

/**
 *
 * @author Ali
 */
public class load_Rooms {

public static JFrame Room;
public static int firstroom = 1; 
public static int lastroom = 5; 
public static JApplet maingamep;
public static Scene[] rooms = new Scene[5];
public static int roomid;
public static Image GIcon;
public static int getroom[]= {1,0,3,4,5};

load_Rooms(int roomid) {}

load_Rooms(int roomid,JApplet maingamep) {}

public static boolean if_prev_room(int roomid) {return false;}

public static boolean if_next_room(int roomid) {return false;}

public static void prev_room(int roomid,JApplet maingamep) {}

public static void prev_room(int roomid) {}

public static void next_room(int roomid,JApplet maingamep) {}

public static void next_room(int roomid) {}

public static void change_room(int roomid){}

public static void change_room(int roomid,JApplet maingamep) {}

public static void restart_room(int roomid,JApplet maingamep) {}

public static void restart_room(int roomid) {}

public static void remove_room(int roomid) {}
}

