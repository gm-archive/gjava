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

import java.util.Vector;
import org.gcreator.units.TimelineStep;

/**
 *
 * @author luis
 */
public class Timeline implements Resource {

    private static final long serialVersionUID = 1L;
    public Vector<TimelineStep> steps = new Vector<TimelineStep>();

    public Timeline() {

    }

    @Override
    public Object clone() {
        Timeline a = new Timeline();
        return a;
    }

    public String exportToHtml(boolean xhtml) {
        return "";
    }
}
