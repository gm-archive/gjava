package org.dolphin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.dolphin.parser.PlatformCore;
import org.lateralgm.components.impl.ResNode;
import org.lateralgm.components.mdi.MDIFrame;
import org.lateralgm.main.LGM;
import org.lateralgm.resources.Resource;
import org.lateralgm.subframes.SubframeInformer;
import org.lateralgm.subframes.SubframeInformer.SubframeListener;

public class Plugin implements ActionListener, SubframeListener {
	public JMenuItem run, debug, build, compile,standalone;
	public DolphinFrame df;
	public DolphinWriter dw;
	public static File pluginLocation;
	
	public Plugin() {
		JMenu menu = new JMenu("Dolphin");

		run = new JMenuItem("Run");
		run.addActionListener(this);
		//menu.add(run);
                run.setEnabled(false);
		debug = new JMenuItem("Debug");
		debug.addActionListener(this);
		menu.add(debug);
                debug.setEnabled(false);
		build = new JMenuItem("Build");
		build.addActionListener(this);
		menu.add(build);
                build.setEnabled(false);
		compile = new JMenuItem("Compile (source)");
		compile.addActionListener(this);
		menu.add(compile);
                standalone = new JMenuItem("Create Standalone (no source)");
		standalone.addActionListener(this);
		menu.add(standalone);

		LGM.frame.getJMenuBar().add(menu,5);
		SubframeInformer.addSubframeListener(this);
		
		/*
		 * Get the plugin location
		 */
		try
		{
		pluginLocation = new File(Plugin.class.getProtectionDomain().getCodeSource().getLocation().toURI());
		}
	catch (URISyntaxException e1)
		{
		e1.printStackTrace();
		}
		
		extractRunners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == run)
		{
		run();
		}
	if (e.getSource() == debug)
		{
		debug();
		}
	if (e.getSource() == build)
		{
		build();
		}
	if (e.getSource() == compile)
		{
            DolphinWriter.standalone=false;
		compile();
		}
                if (e.getSource() == standalone)
		{
                    DolphinWriter.standalone=true;
		compile();
		}
		
	}

	private void compile() {
		df = new DolphinFrame();
		dw = new DolphinWriter(df,LGM.currentFile,LGM.workDir.getParentFile());
		dw.parseRooms();
		
		
	}
	
	/*
	 * 
	 * Get the File folder for the project
	 * 
	 */
	private void getFolder()
	{
		
	}

	private void build() {
		// TODO Auto-generated method stub
		
	}

	private void debug() {
		// TODO Auto-generated method stub
		
	}

	private void run() {
		// TODO Auto-generated method stub
		
	}

	public void subframeAppeared(MDIFrame source) {
		// TODO Auto-generated method stub
		
	}

	public boolean subframeRequested(Resource<?> res, ResNode node) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * 
	 * Copy an InputStream to an OutputStream
	 * 
	 */
	public static final void copyInputStream(InputStream in, OutputStream out)
			throws IOException {
		byte buffer[] = new byte[1024];
		int len;
		while ((len = in.read(buffer)) >= 0) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}

	/*
	 * Extract the java class files from the plugin to the plugins folder of lgm so they can be copied later on
	 * to the directory of the game project.
	 */
	public void extractRunners() {
		System.out.println("plugin dir:"+Plugin.pluginLocation);
		try{
			ZipFile zipFile = new ZipFile(Plugin.pluginLocation);

			for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
                            
				ZipEntry entry = (ZipEntry) entries.nextElement();

				if (entry.isDirectory()) {
					System.out.println("Folder:" + entry.getName());
					(new File(System.getProperty("user.dir")+File.separator+"plugins" + File.separator+"runner"+ File.separator
							+ (entry.getName()).toString())).mkdirs();
				} else {
                                    try{
                                    //System.out.println("the file:"+System.getProperty("user.dir")+File.separator+
					//						"plugins" + File.separator+"runner"+ File.separator+entry.getName());
                                    //new File(System.getProperty("user.dir")+File.separator+
					//						"plugins" + File.separator+"runner"+ File.separator+entry.getName()).mkdirs();
					//new File(System.getProperty("user.dir")+File.separator+
					//						"plugins" + File.separator+"runner"+ File.separator+entry.getName()).createNewFile();//.mkdirs();
					copyInputStream(zipFile.getInputStream(entry),
							new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir")+File.separator+
											"plugins" + File.separator+"runner"+ File.separator +
											entry.getName())));
                                        }catch(Exception e){e.printStackTrace();}
				}
                            
			}
                        
			zipFile.close();
                        }catch(Exception e){System.out.println("could not open/close zip");e.printStackTrace();}
		deleteUnusedRunners();
	}
	
	void deleteUnusedRunners(){
        try {
            PlatformCore.recursivelyDeleteDirectory(new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "antlr"));
            PlatformCore.recursivelyDeleteDirectory(new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator + "parser"));
            //(new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator + "Plugin.class")).delete();
            DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator)).getPath(), ".class");
            DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator)).getPath(), ".java");
            DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator+"game" + File.separator)).getPath(), ".png");
             DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator+"game" + File.separator)).getPath(), ".java");
             DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator+"game" + File.separator)).getPath(), ".wav");
             DolphinWriter.deleteFiles((new File(System.getProperty("user.dir") + File.separator + "plugins" + File.separator + "runner" + File.separator + "org" + File.separator + "dolphin" + File.separator+"game" + File.separator)).getPath(), ".jpg");

        } catch (IOException ex) {
            Logger.getLogger(Plugin.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        }
	
}
