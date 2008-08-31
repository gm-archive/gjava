/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.*;
import org.gcreator.components.uiplus.DialogPlus;

/**
 * @author Luís Reis
 */
public class AutocompleteFrame extends DialogPlus {

    protected JList list;
    protected JScrollPane scroll;
    protected JEditorPane doc;

    public AutocompleteFrame(String text) {
        super();
        setUndecorated(true);
        addFocusListener(new FocusListener() {

            public void focusLost(FocusEvent evt) {
                dispose();
            }

            public void focusGained(FocusEvent evt) {
            }
        });
        setSize(450, 180);
        setLayout(new BorderLayout());
        JLabel label = new JLabel(text);
        label.setFocusable(false);
        label.setVisible(true);
        add(BorderLayout.NORTH, label);
        setTitle(text);

        scroll = new JScrollPane();
        scroll.setFocusable(false);
        scroll.setVisible(true);
        list = new JList();
        list.setFocusable(false);
        list.setVisible(true);
        scroll.setViewportView(list);
        add(BorderLayout.CENTER, scroll);
        doc = new JEditorPane();
        doc.setFocusable(false);
        doc.setVisible(true);
        doc.setEditable(false);
        doc.setContentType("text/html");
        JScrollPane p = new JScrollPane() {

            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.width = 230;
                return d;
            }
        };

        doc.setText("Loading...");
        
        Thread t = new Thread() {

            public void run() {
                try {
                    URL url = new URL("http://wiki.g-creator.org/doku.php?id=show_message");
                    URLConnection connection = url.openConnection();
                    BufferedReader inStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine = "";
                    String txt = "";
                    boolean reading = false;
                    while (null != (inputLine = inStream.readLine())) {
                        if (inputLine.equals("    <!-- wikipage start -->")) {
                            reading = true;
                        } else if (inputLine.equals("    <!-- wikipage stop -->")) {
                            reading = false;
                        }
                        if (reading) {
                            txt += inputLine;
                        }
                    }
                    doc.setText(txt);
                    inStream.close();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        };
        t.start();

        p.setVisible(true);
        p.setViewportView(doc);
        add(BorderLayout.LINE_END, p);
    }

    public boolean requestDie() {
        return false;
    }
}
