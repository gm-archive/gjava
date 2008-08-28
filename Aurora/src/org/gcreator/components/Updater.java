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

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.Box;
import javax.swing.Box.Filler;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.gcreator.core.gcreator;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 *
 * @author TGMG
 */
public final class Updater {

    private static int index = 0;
    private static JPanel panel1,  panel2;
    private static boolean updating = false;
    private static Update[] updates;
    private static OutputStream out;
    private static InputStream in;
    private static JProgressBar progress;
    private static JLabel downloadInfo;
    private static boolean abort = false;
    private static boolean done;
    
    public static void update() {
        if (updating) {
            return;
        }
        abort = false;
        index = 0;
        updates = null;
        updating = true;
        done = false;
        //final JDialog dialog = new JDialog(gcreator.window, true);
        //dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        final JFrame dialog = new JFrame("Update G-Creator");
        dialog.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cancel();
            }
        });
        dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        dialog.setSize(640, 480);
        dialog.setMinimumSize(new Dimension(480, 300));
        dialog.setLayout(new GridBagLayout());


        final CardLayout clayout = new CardLayout();
        final JPanel panel = new JPanel(clayout);
        final Box box2 = Box.createHorizontalBox();

        //Buttons
        final JButton backButton = new JButton("< Back");
        backButton.setEnabled(false);
        final JButton nextButton = new JButton("Next >");

        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clayout.next(panel);
                backButton.setEnabled(true);
                index++;

                if (index == 1) {
                    nextButton.setEnabled(false);
                    updates = downloadInfo();
                    if (updates == null) {//No updates available.
                        
                    }
                    JPanel center = new JPanel();
                    center.setLayout(new BorderLayout());
                    JLabel l3;
                    if (updates == null) {//No updates available.
                        l3 = new JLabel("<html><h1>No Updates Available</h1>Your G-Creator version is up to date.</html>");
                        nextButton.setText("Finish");
                        done = true;
                        nextButton.setEnabled(true);
                        center.add(l3, BorderLayout.NORTH);
                        panel2.remove(box2);
                        panel2.add(center, BorderLayout.CENTER);
                        return;
                    } else {
                        l3 = new JLabel("<html><h1>Available Updates</h1>Select an update to view information about it and check off which updates you would like to download.</html>");
                    }
                    l3.setFont(new Font("Sans", Font.PLAIN, 12));
                    center.add(l3, BorderLayout.NORTH);

                    final JEditorPane info = new JEditorPane();
                    info.setEditable(false);
                    info.setContentType("text/html");
                    final JList updateList = new JList(updates);
                    updateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    updateList.setCellRenderer(new DefaultListCellRenderer() {

                        private static final long serialVersionUID = 1;

                        @Override
                        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                            JLabel l = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                            Box box = Box.createHorizontalBox();
                            if (value instanceof Update) {
                                JCheckBox b = ((Update) value).box;
                                b.setBackground(list.getBackground());
                                box.add(b);
                                box.add(l);
                            } else {
                                box.add(l);
                            }
                            return box;
                        }
                    });
                    updateList.addMouseListener(new MouseAdapter() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getX() > updates[0].box.getWidth()) {
                                return;
                            }
                            int index = Math.round(e.getY() / updates[0].box.getHeight());
                            if (index >= updateList.getModel().getSize()) {
                                return;
                            }
                            Update upd8 = ((Update) updateList.getModel().getElementAt(index));
                            JCheckBox b = upd8.box;
                            upd8.checked = !upd8.checked;
                            b.setSelected(!b.isSelected());

                            updateList.repaint();
                            int selected = 0;
                            for (Update u : updates) {
                                if (u.checked) {
                                    selected++;
                                }
                            }

                            if (nextButton.isEnabled() && selected == 0) {
                                nextButton.setEnabled(false);
                            }
                            if (!nextButton.isEnabled() && selected > 0) {
                                nextButton.setEnabled(true);
                            }
                        }
                    });

                    final JLabel infoLabel = new JLabel();
                    updateList.addListSelectionListener(new ListSelectionListener() {

                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            Update u = ((Update) updateList.getSelectedValue());
                            infoLabel.setText(new StringBuffer("<html><h2>").append(u.displayVersion).
                                    append("</h2>Version: ").append(u.version).append("<br/>Download size: ").
                                    append(u.size).append("<br/>File URL: <a href=\"").append(u.file).append("\">").
                                    append(u.file).append("</a><br/>Description: (below)</html>").toString());
                            info.setText(u.description);
                        }
                    });

                    JPanel infoPanel = new JPanel();
                    infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
                    infoPanel.add(infoLabel);
                    infoPanel.add(new JScrollPane(info));
                    JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, updateList, infoPanel);
                    center.add(split);


                    panel2.remove(box2);
                    panel2.add(center, BorderLayout.CENTER);
                } else if (index == 2) {
                    if (done) {
                        dialog.dispose();
                        cancel();//Just for caution
                        done = false;
                        updating = false;
                        return;
                    }
                    nextButton.setEnabled(false);
                    for (Update u : updates) {
                        if (u.checked) {
                            final String fname = u.displayVersion + String.valueOf(u.version).
                                    replaceAll("\\.", "_") + u.file.substring(u.file.lastIndexOf('.'));
                            System.out.println("Updater: Saving to '" + fname + "'.");

                            final Update uf = u;
                            new Thread() {

                                @Override
                                public void run() {
                                    download(uf.file, fname);
                                }
                            }.start();
                        }
                    }
                }
            }
        });

        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clayout.previous(panel);
                nextButton.setEnabled(true);
                index--;
                if (index == 0) {
                    backButton.setEnabled(false);
                }
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
                dialog.dispose();
            }
        });

        Box bottomBox = Box.createHorizontalBox();
        bottomBox.add(Box.createHorizontalGlue());
        bottomBox.add(backButton);
        bottomBox.add(Box.createHorizontalStrut(4));
        bottomBox.add(nextButton);
        bottomBox.add(Box.createHorizontalStrut(4));
        bottomBox.add(cancelButton);
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.SOUTHEAST;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 7);
        gc.fill = GridBagConstraints.NONE;
        gc.gridx = 3;
        gc.gridy = 1;
        gc.gridwidth = 2;
        gc.gridheight = 1;
        dialog.add(bottomBox, gc);


        gc.gridx = 1;
        gc.gridy = 1;
        gc.gridwidth = 5;
        gc.gridheight = 2;
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(8, 8, 48, 8);

        panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.add(Box.createVerticalStrut(100));
        JLabel l = new JLabel("<html><h1>Welcome to the G-Creator Updater</h1>" +
                "<p>This will update G-Creator and all of its installed plug-ins.<br/>" +
                "First we must download version information.</p>" +
                "<h3>Click Next to continue.</h3><br/><br/>" +
                "<span style=\"font-size: 10pt;\">This requires a working network connection.</span></html>");
        l.setFont(new Font("Sans", Font.PLAIN, 12));
        panel1.add(l);

        panel.add(panel1, "panel1");

        panel2 = new JPanel(new BorderLayout());

        JLabel l2 = new JLabel("<html><h2>Downloading Update Information...</h2>" +
                "This should only take a few seconds.</html>");
        l2.setFont(l.getFont());
        box2.add(new Filler(new Dimension(80, 80), new Dimension(100, 120),
                new Dimension(Short.MAX_VALUE, 0)));
        box2.add(l2);
        panel2.add(box2, BorderLayout.NORTH);

        panel.add(panel2, "panel2");

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        progress = new JProgressBar(0, 100);
        downloadInfo = new JLabel("Starting download...");
        panel3.add(progress);
        panel3.add(downloadInfo);
        panel.add(panel3, "panel3");


        dialog.add(panel, gc);

        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private static void unzip(String zipfile) {
        try {
            ZipFile zipFile = new ZipFile(zipfile);
            for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    (new File(entry.getName())).mkdirs();
                } else {
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(entry.getName())));
                }
            }
            zipFile.close();
        } catch (IOException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while unzipping", ex);
        }
    }

    private static final void copyInputStream(InputStream in, OutputStream out)
            throws IOException {
        byte buffer[] = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }

    private static void download(String address, String localFileName) {
        try {
            URLConnection conn = null;
            URL url = new URL(address);

            out = new BufferedOutputStream(new FileOutputStream(localFileName));
            conn = url.openConnection();
            File f = new File(localFileName);
            if (f.exists() && conn.getContentLength() == f.length()) {
                if (JOptionPane.showConfirmDialog(gcreator.window, "<html>File ʻ" + localFileName + "ʼ already exists.<br/>" +
                        "Are you sure you want to download it again?</html>") != JOptionPane.OK_OPTION) {
                    return;
                }
            }
            int size = conn.getContentLength();
            int refresh = 4500;// Update every (4500) bytes.
            in = conn.getInputStream();//No need for Buffering; already done.
            int read;
            long readed = 0;
            while ((read = in.read()) != -1 && !abort) {
                out.write(read);
                readed++;
                if (readed % refresh == 1 || readed == size) {
                    progress.setValue((int) ((((double) readed) / ((double) size)) * 100));
                    downloadInfo.setText(readed / 1024 + " kB of " + size / 1024);
                }
            }
            if (!abort) {
                System.out.println("Updater: Downloaded file");
                unzip(localFileName);
            } else {
                System.out.println("Updater: Abort!");
            }

        } catch (Exception ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while downloading file from " + address, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while closing OutputStream out", ex);
            }
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while closing InputStream in", ex);
            }
            out = null;
            in = null;
        }
        if (abort) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Updater.update();
    }

    private static void cancel() {
        abort = true;
        //Clean up
        updating = false;
    }

    /* Don't allow instantation. */
    private Updater() {
    }

    private static Update[] downloadInfo() {
        URL url = null;
        URLConnection urlConn = null;
        try {
            // Create the URL obect that points
            // at the default file index.html
            url = new URL("file:///home/bob-the-blueberry/update.xml");//URL("http://www.g-creator.org/update/update.xml");
            urlConn = url.openConnection();
            urlConn.getContentLength();
            SAXParser parser = new SAXParser(new BufferedInputStream(urlConn.getInputStream()));
            Node root = parser.getRootNode();
            Hashtable<String, Node> elements = new Hashtable<String, Node>(root.getChildrenCount());
            for (int i = 0; i < root.getChildrenCount(); i++) {
                elements.put(root.getChildAt(i).getName(), root.getChildAt(i));
            }
            Update up = new Update();
            up.version = Double.parseDouble(elements.get("version").getContent());
            if (up.version <= gcreator.version /*&& there_is_no_other_updates*/) {
                return null;
            }
            up.displayVersion = elements.get("display-version").getContent();
            up.description = elements.get("description").getContent();
            up.file = elements.get("file").getContent();
            up.size = elements.get("size").getContent();

            return new Update[]{up};
        } catch (SAXException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "SAXException while parsing " + url, ex);
        } catch (MalformedURLException e) {
            System.out.println("Please check the URL:" +
                    e.toString());
        } catch (IOException e1) {
            System.out.println("Can't read  from the Internet: " +
                    e1.toString());
        }
        return null;
    }

    private static class Update {

        public JCheckBox box = new JCheckBox();
        public boolean checked;

        public Update() {
        }

        public Update(double version, String displayVersion, String description, String file, String size) {
            this.version = version;
            this.displayVersion = displayVersion;
            this.description = description;
            this.file = file;
            this.size = size;
        }
        public double version;
        public String displayVersion;
        public String description;
        public String file;
        public String size;

        @Override
        public String toString() {
            return displayVersion;
        }
    }
}
