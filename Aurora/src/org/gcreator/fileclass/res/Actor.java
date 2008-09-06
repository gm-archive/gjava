/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import java.util.Enumeration;
import java.util.Vector;
import org.gcreator.actions.Action;
import org.gcreator.components.ActorFieldPane.Field;
import org.gcreator.events.Event;

/**
 *
 * @author TGMG
 */
public class Actor implements Resource {

    static final long serialVersionUID = 1L;
    public boolean visible = true,  solid = true,  persistent;
    public int sprite;
    public int extend,  mask;
    public int index,  depth;
    public Vector<Event> events;
    public Vector<Field> fields;
    
    public Actor() {
        events = new Vector<Event>();
        fields = new Vector<Field>();
    }

    public String writeXml() {
        String xml = "";
        xml += "<?xml version=\"1.0\"?>\n"; //changes for new version of actor
        xml += "<actoreditor version=\"1.0\"/>\n";
        xml += "<Solid>" + solid + "</Solid>\n";
        xml += "<Visible>" + visible + "</Visible>\n";
        xml += "<Persistent>" + persistent + "</Persistent>\n";
        if (sprite == -1) {
            xml += "<Sprite>//!NULLSPRITE</Sprite>";
        } else {
            xml += "<Sprite>" + sprite + "</Sprite>";
        }
        for (Enumeration e = events.elements(); e.hasMoreElements();) {
            xml += ((Event) e.nextElement()).writeXml();
        }
        return xml;
    }


    @Override
    @SuppressWarnings("unchecked")
    public Object clone() {
        Actor a = new Actor();
        a.depth = depth;
        Vector ev = new Vector();
        for (Event e : events) {
            ev.add(e);
            e.actions = (Vector<Action>) e.actions.clone();
        }
        a.events = ev;
        a.extend = extend;
        a.index = index;
        a.mask = mask;
        a.persistent = persistent;
        a.solid = solid;
        a.visible = visible;
        a.sprite = sprite;
        a.fields = (Vector<Field>) fields.clone();
        return a;
    }
}
