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
import java.awt.Color;
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
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
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
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.gcreator.core.gcreator;
import org.gcreator.plugins.Plugin;
import org.gcreator.plugins.PluginList;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 * This class lets the user update G-Creator (and its properly configured plugins) with a GUI.
 * 
 * @author Serge Humphrey
 * @author TGMG
 */
public final class Updater {

    private int index = 0;
    private JPanel panel1,  panel2, finishPanel;
    private Update[] updates;
    private OutputStream out;
    private InputStream in;
    private boolean abort = false;
    private boolean done;
    private static boolean updating = false;
    private ArrayList<UpdateComponent> downloads = new ArrayList<Updater.UpdateComponent>();
    private JPanel downloadsPanel;
    private JPanel center;
    
    /**
     * Updates G-Creator and all of its properly configured plugins.
     */
    public Updater() {
        updating = true;
        final JDialog dialog = new JDialog(gcreator.window,"Update G-Creator", true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cancel();
            }
        });
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
        final JButton cancelButton = new JButton("Cancel");

        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                index++;
                if (index < 3) {
                    backButton.setEnabled(true);
                    
                } else if (index == 4) {
                    dialog.dispose();
                }
                if (index < 4) {
                    clayout.next(panel);
                }
                if (index == 1) {
                    Thread thread = new Thread("G-Creator-update-index-1") {

                        @Override
                        public void run() {

                            nextButton.setEnabled(false);
                            backButton.setEnabled(false);
                            updates = downloadInfo();

                            backButton.setEnabled(true);

                            center = new JPanel();
                            center.setLayout(new BorderLayout());
                            JLabel l3;
                            if (updates == null || updates.length == 0) {//Error occured or No updates available.
                                String text;
                                if (updates == null) {
                                    text = "<html><h1>Error Downloading Update Information</h1>" +
                                            "Failed to download update information.<br/>Please check your Internet connection.</html>";
                                } else {
                                    text = "<html><h1>No Updates Available</h1>Your G-Creator version is up to date.</html>";
                                }
                                l3 = new JLabel(text);
                                nextButton.setText("Finish");
                                cancelButton.setEnabled(false);
                                done = true;
                                nextButton.setEnabled(true);
                                center.add(l3, BorderLayout.NORTH);
                                panel2.remove(box2);
                                panel2.add(center, BorderLayout.CENTER);
                                panel2.updateUI();
                                return;
                            } else {
                                l3 = new JLabel("<html><h1>Available Updates</h1>Select an update to view information " +
                                        "about it and check off which updates you would like to download.</html>");
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
                                public Component getListCellRendererComponent(JList list, Object value,
                                        int index, boolean isSelected, boolean cellHasFocus) {
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
                                    Update update = ((Update) updateList.getModel().getElementAt(index));
                                    JCheckBox b = update.box;
                                    update.checked = !update.checked;
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
                            JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(updateList), infoPanel);
                            center.add(split);


                            panel2.remove(box2);
                            panel2.add(center, BorderLayout.CENTER);
                            panel2.updateUI();
                        }
                    };
                    thread.start();
                } else if (index == 2) {
                    if (done) {
                        dialog.dispose();
                        cancel();//Just for caution
                        done = false;
                        return;
                    }
                    nextButton.setEnabled(false);
                    for (int i = 0; i < updates.length; i++) {
                        Update u = updates[i];
                        if (u.checked) {
                            UpdateComponent uc = new UpdateComponent(u);
                            downloads.add(uc);
                            downloadsPanel.add(uc);
                            if (i - 1 < updates.length) {
                                downloadsPanel.add(Box.createVerticalStrut(2));
                            }
                        }
                    }

                    final Thread install = new Thread("G-Creator-updater-install") {

                        @Override
                        public void run() {
                            for (UpdateComponent uc : downloads) {
                                if (uc.update.aborted) {
                                    continue;
                                }
                                File f = new File(uc.update.location + "/install"+uc.update.displayVersion+".js");
                                if (f.exists()) {
                                    uc.status.setText("Installing...");
                                    try {
                                        new ScriptEngineManager().getEngineByName("JavaScript").eval(new BufferedReader(new FileReader(f)));
                                    } catch (FileNotFoundException ex) {
                                        Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Impossible error", ex);
                                    } catch (ScriptException ex) {
                                        Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error in install script '" + f + "'.", ex);
                                    }
                                }
                                uc.status.setText("Finished");
                            }
                        }
                    };

                    new Thread("G-Creator-updater-download") {

                        @Override
                        public void run() {
                            backButton.setEnabled(false);
                            for (UpdateComponent uc : downloads) {
                                final Update u = uc.update;
                                final String fname = u.displayVersion + String.valueOf(u.version).replaceAll("\\.", "_") +
                                        ((u.file.contains(".")) ? u.file.substring(u.file.lastIndexOf('.')) : "");
                                final UpdateComponent ucFinal = uc;
                                System.out.println("Updater: Saving to '" + fname + "'.");
                                Thread t = new Thread() {

                                    @Override
                                    public void run() {
                                        download(u.file, fname, ucFinal);
                                    }
                                };
                                t.start();

                                while (t.isAlive()) {
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Updater.class.getName()).log(Level.WARNING, "Sleeping interrupted", ex);
                                    }
                                }
                                System.out.println("Updater: Finished updating " + u.displayVersion);
                            }
                            System.out.println("Updater: Installing updates");
                            
                            if (!abort) {
                                install.start();
                            }
                            StringBuffer buffer = new StringBuffer(150);
                            for (UpdateComponent uc : downloads) {
                                buffer.append(uc.update.displayVersion+": "+((uc.update.aborted) ? "<strong>Failed</strong>": "Successful")+"<br/>");
                            }
                            finishPanel.add(new JLabel("<html><h1>Finished</h1>Report:<br/><div " +
                                    "style=\"background-color: white; border-style: solid; border-width: 2; border-color: black;\">"+buffer+
                                    "</div><br/>Close G-Creator ans start it again to enable the updates.</html>"));
                            nextButton.setText("Finish");
                            nextButton.setEnabled(true);
                            cancelButton.setEnabled(false);
                        }
                    }.start();
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
                    panel2.remove(center);
                    panel2.add(box2, BorderLayout.NORTH);
                    panel2.updateUI();
                }
                if (updates == null || updates.length == 0) {
                    nextButton.setText("Next >");
                }
                if (index < 2) {
                    updates = null;
                }
            }
        });

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
                "<span style=\"font-size: 10pt;\">This requires a working Internet connection.</span></html>");
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
        downloadsPanel = new JPanel();
        downloadsPanel.setLayout(new BoxLayout(downloadsPanel, BoxLayout.Y_AXIS));
        panel3.add(new JLabel("<html><h1>Downloading Updates</h1></html>"));
        panel3.add(new JScrollPane(downloadsPanel));
        panel.add(panel3, "panel3");
        
        finishPanel = new JPanel();
        panel.add(finishPanel, "finishPanel");
        
        dialog.add(panel, gc);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private void unzip(String zipfile, Update u) {
        try {
            ZipFile zipFile = new ZipFile(zipfile);
            for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    new File(entry.getName()).mkdirs();
                } else {
                    String name;
                    if (entry.getName().equals("install.js")) {
                        name = "install"+u.displayVersion+".js";
                    } else {
                        name = entry.getName();
                    }
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(name)));
                }
            }
            zipFile.close();
        } catch (IOException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while unzipping", ex);
        }
    }

    private final void copyInputStream(InputStream in, OutputStream out) throws IOException {
        byte buffer[] = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }

    private void download(String address, String localFileName, UpdateComponent uc) {
        try {
            URLConnection conn = null;
            URL url = new URL(address);
            uc.status.setText("Starting...");
            conn = url.openConnection();
            File f = new File(new File(localFileName).toURI());
            if (f.exists() && conn.getContentLength() == f.length()) {
                if (JOptionPane.showConfirmDialog(gcreator.window, "<html>File ʻ" + localFileName + "ʼ already exists.<br/>" +
                        "Are you sure you want to download it again?</html>") != JOptionPane.OK_OPTION) {
                    uc.progress.setString("Canceled");
                    return;
                }
            }
            out = new BufferedOutputStream(new FileOutputStream(localFileName));
            int size = conn.getContentLength();
            int refresh = 10240;// Update every 10 kilobytes. You may want to change this for speed consideartions.
            try {
                in = conn.getInputStream();//No need for Buffering; already done.
            } catch (FileNotFoundException exc) {
                uc.status.setText("Error: File '"+address+"' does not exist.");
                uc.update.aborted = true;
                return;
            }
            int read;
            long readed = 0;
            while ((read = in.read()) != -1 && !abort) {
                out.write(read);
                readed++;
                if (readed % refresh == 1 || readed == size) {
                    int percent = (int) ((((double) readed) / ((double) size)) * 100);
                    uc.progress.setValue(percent);
                    uc.progress.setString(percent + " %");
                    uc.status.setText(readed / 1024 + " kB of " + size / 1024 + " kB");
                }
            }
        } catch (Exception ex) {
            //Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while downloading file from " + address, ex);
            uc.update.aborted = true;
            uc.status.setText(ex.toString());
        } finally {
            if (!abort && !uc.update.aborted) {
                System.out.println("Updater: Downloaded file");
                System.out.println("Updater: Unzipping file");
                uc.status.setText("Unzipping...");
                unzip(localFileName, uc.update);
                uc.status.setText("Waiting to install...");
            } else if (abort) {
                System.out.println("Updater: Abort!");
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while closing OutputStream out", ex);
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Error while closing InputStream in", ex);
            }
            out = null;
            in = null;
        }
    }

    private void cancel() {
        abort = true;
    }

    public static void update() {
        if (updating) {
            return;
        }
        try {
            new Updater();
        } catch (Exception ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "Exception while updating", ex);
        }
        updating = false;
    }

    private Update[] downloadInfo() {
        Update gcreatorUpdate = downloadUpdateInfo("http://www.g-creator.org/update/update.xml");
        if (gcreatorUpdate == null) {
            return null;
        }
        ArrayList<Update> pluginUpdates = new ArrayList<Update>();
        if (gcreatorUpdate.version > gcreator.version) {
            pluginUpdates.add(gcreatorUpdate);
        }

        for (Plugin p : PluginList.stdlist.plugins) {
            if (p.update != null) {
                Update u = downloadUpdateInfo(p.update);
                if (u != null && u.version > Double.parseDouble(p.version)) {
                    u.location = "./plugins/jars";
                    pluginUpdates.add(downloadUpdateInfo(p.update));
                }
            }
        }
        
        return pluginUpdates.toArray(new Update[pluginUpdates.size()]);
    }

    private Update downloadUpdateInfo(String surl) {
        URL url = null;
        try {
            url = new URL(surl);
            URLConnection urlConn = urlConn = url.openConnection();
            urlConn.getContentLength();
            SAXParser parser = new SAXParser(new BufferedInputStream(urlConn.getInputStream()));
            Node root = parser.getRootNode();
            Hashtable<String, Node> elements = new Hashtable<String, Node>(root.getChildrenCount());
            for (int i = 0; i < root.getChildrenCount(); i++) {
                elements.put(root.getChildAt(i).getName(), root.getChildAt(i));
            }
            Update up = new Update();
            up.version = Double.parseDouble(elements.get("version").getContent());
            up.displayVersion = elements.get("display-version").getContent();
            up.description = elements.get("description").getContent();
            up.file = elements.get("file").getContent();
            up.size = elements.get("size").getContent();

            return up;
        } catch (SAXException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, "SAXException while parsing " + url, ex);
        } catch (MalformedURLException e) {
            System.out.println("Updater: Bad URL '" + url + "':" + e.toString());
        } catch (IOException e1) {
            System.out.println("Updater: Can't read  from the Internet: " + e1.toString());
        }
        return null;
    }

    private static class Update {

        public JCheckBox box = new JCheckBox();
        public boolean checked;
        public String location = "./";

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
        public boolean aborted;
        
        @Override
        public String toString() {
            return displayVersion;
        }
    }

    private static class UpdateComponent extends Box {

        private static final long serialVersionUID = 1;
        public JLabel status = new JLabel("Waiting...");
        public JProgressBar progress = new JProgressBar();
        public Update update;

        public UpdateComponent(Update u) {
            super(BoxLayout.Y_AXIS);
            this.update = u;
            this.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 1, new Color(0x000080)));
            this.add(Box.createVerticalStrut(4));
            Box hBox = Box.createHorizontalBox();
            hBox.add(new Filler(new Dimension(48, 0), new Dimension(48, 0), new Dimension(48, 1)));
            hBox.add(progress);
            hBox.add(new Filler(new Dimension(64, 0), new Dimension(64, 0), new Dimension(64, 1)));
            this.add(hBox);
            this.add(status);
            this.add(Box.createVerticalStrut(16));

            this.progress.setStringPainted(true);
            this.progress.setString("0 %");
        }
    }
}
