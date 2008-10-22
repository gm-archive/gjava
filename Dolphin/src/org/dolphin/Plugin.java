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
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.lateralgm.components.impl.ResNode;
import org.lateralgm.components.mdi.MDIFrame;
import org.lateralgm.main.LGM;
import org.lateralgm.resources.Resource;
import org.lateralgm.subframes.SubframeInformer;
import org.lateralgm.subframes.SubframeInformer.SubframeListener;

public class Plugin implements ActionListener, SubframeListener {
	public JMenuItem run, debug, build, compile;
	public DolphinFrame df;
	public DolphinWriter dw;
	public File pluginLocation;
	
	public Plugin() {
		JMenu menu = new JMenu("Dolphin");

		run = new JMenuItem("Run");
		run.addActionListener(this);
		menu.add(run);
		debug = new JMenuItem("Debug");
		debug.addActionListener(this);
		menu.add(debug);
		build = new JMenuItem("Build");
		build.addActionListener(this);
		menu.add(build);
		compile = new JMenuItem("Compile");
		compile.addActionListener(this);
		menu.add(compile);

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
		System.out.println("plugin dir:"+this.pluginLocation);
		try {
			ZipFile zipFile = new ZipFile(this.pluginLocation);

			for (Enumeration entries = zipFile.entries(); entries
					.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				if (entry.isDirectory()) {
					System.out.println("Folder:" + entry.getName());
					(new File(System.getProperty("user.dir")+File.separator+"plugins" + File.separator
							+ (entry.getName()).toString())).mkdirs();
				} else {
					new File(System.getProperty("user.dir")+File.separator+
											"plugins" + File.separator).mkdirs();
					copyInputStream(zipFile.getInputStream(entry),
							new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir")+File.separator+
											"plugins" + File.separator+
											entry.getName())));
				}
			}

			zipFile.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	
}
