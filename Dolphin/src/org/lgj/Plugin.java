package org.lgj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public Plugin() {
		JMenu menu = new JMenu("LGJava");

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
	
}
