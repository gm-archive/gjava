package org.dolphin.game.api.components;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Properties;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
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
	
	static String[] fields={"<noname>","<noname>","<noname>","<noname>","<noname>","<noname>","<noname>","<noname>","<noname>","<noname>"};
	static String[] score={"0","0","0","0","0","0","0","0","0","0"}; //used for resetting
	String[] names,scores;
	HashMap<String, JTextField> mValues = new HashMap<String, JTextField>();
	static Color oldcolor=Color.black,newcolor=Color.red;
	String newname="";
		
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
				if (names[i] == null) {names[i]="noname :(";}
				newname=names[i];
			break;
			}
		}
		
		for (int i = 0; i < names.length; i++) {
				
			JLabel scorelabel,namelabel;
			namelabel = new JLabel(names[i]);
			namelabel.setForeground(((names[i].equals(newname))? newcolor:oldcolor));
				main.add(new JLabel("   "+(i+1)));
				main.add(namelabel);
				
				scorelabel = new JLabel("    "+scores[i]);
				scorelabel.setForeground(((names[i].equals(newname))? newcolor:oldcolor));
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
	
	public static void clear(){
		try {
		FileWriter fs = new FileWriter("highscores.store");
		BufferedWriter bs = new BufferedWriter(fs);
		for (int i = 0; i < fields.length; i++) {
		bs.write(fields[i]+"\n");
		
		bs.write(score[i]+"\n");
		}
		bs.close();
		} catch (Exception e){e.printStackTrace();}
	}
	
		
	
}