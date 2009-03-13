package org.dolphin.game.api.components;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
 
/** Usage:
 * [code]
 * 	ParamDialog pd = new ParamDialog(new String[] {"A", "B", "C"});
 * pd.pack();
 * pd.setVisible(true);
 * Properties p = pd.getProperties();
 */
 
public class Highscore extends StandardDialog {
 
	public static final String SECRET = "(SECRET)";
	Properties file = new Properties();
	
	String[] fields={"<noname>","noname","noname","noname","noname","noname","noname","noname","noname","noname"};
	String[] score={"0","0","0","0","0","0","0","0","0","0"};
	String[] names,scores;
	HashMap<String, JTextField> mValues = new HashMap<String, JTextField>();
	
		
	public Highscore(Frame owner,int playerScore) {
		super(owner);
		names=fields;
		scores=score;
		setModal(true);
		if (new File("highscores.store").exists()){
			try{
			load();
			}catch (Exception e){
				e.printStackTrace();
			}
		} else {
			try{
			new File("highscores.store").createNewFile();
			save();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(fields.length, 3));
		
		for (int i = 0; i < names.length; i++) {
			if (playerScore > Integer.parseInt(scores[i]))
			{
				scores[i] = ""+playerScore;
				names[i]=JOptionPane.showInputDialog("You got a highscore! What is your name?");
			break;
			}
		}
		
		for (int i = 0; i < names.length; i++) {
				
			JLabel scorelabel;
				main.add(new JLabel("   "+(i+1)));
				main.add(new JLabel(names[i]));
				
				scorelabel = new JLabel("    "+scores[i]);
				
				main.add(scorelabel);
			
			
		}
			
		this.setMainContent(main);
		this.setBounds(200, 200, 300, 400);
		this.setVisible(true);
	}
	
	public void save() throws Exception{
		//save the data to a file
		FileWriter fs = new FileWriter("highscores.store");
		BufferedWriter bs = new BufferedWriter(fs);
		for (int i = 0; i < names.length; i++) {
		bs.write(names[i]+"\n");
		
		bs.write(scores[i]+"\n");
		}
		bs.close();
	}
	
	public void load() throws Exception {
		FileReader fr = new FileReader("highscores.store");
		BufferedReader br = new BufferedReader(fr);
		String text;
		for (int i = 0; i < 9; i++) {
			names[i] = br.readLine();
			scores[i] = br.readLine();
		};
		br.close();
	}
 
	public boolean showApplyButton() {
		return false;
	}
 
	public void apply() {
		try{
		save();
		}catch(Exception e){e.printStackTrace();}
	}
	
	private boolean mCancel = false;
	
	public void cancel() {
		mCancel = true;
		super.cancel();
	}
	
	public Properties getProperties() {
		if (mCancel) return null;
		Properties p = new Properties();
		for (int i = 0; i < fields.length; i++) {
			p.put(fields[i], mValues.get(fields[i]).getText());
		}
		return p;
	}
	
		
	
}