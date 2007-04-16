package org.gjava.runner.runner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.rtf.*;

class Game_Information
		extends 	JFrame
{
	public static JEditorPane editor;
	public Game_Information()
	{
		//The Game Settings
GameSettings gs = new GameSettings();

		setTitle( "Game Information" );
		setSize( 600, 400 );
		setBackground( Color.gray );
		getContentPane().setLayout( new BorderLayout() );

		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel, BorderLayout.CENTER );

		// Create an RTF editor window
		RTFEditorKit rtf = new RTFEditorKit();
		editor = new JEditorPane();
		editor.setEditable(false);
		editor.setEditorKit( rtf );
		editor.setBackground(gs.Gameinfoback);

		// This text could be big so add a scroll pane
		JScrollPane scroller = new JScrollPane();
		scroller.getViewport().add( editor );
		topPanel.add( scroller, BorderLayout.CENTER );

		// Load an RTF file into the editor
		InputStream in;
	     
		// First try the classloader
		in = Game_Information.class.getResourceAsStream("gameinformation.rtf"); 
	  
		// check to see 
		if(in == null) {
			// Are we instead looking at a filename?
			try {
				FileInputStream fis = new FileInputStream("gameinformation.rtf");
		    // 	It's open!
				in = fis;
			} catch(FileNotFoundException foe) {
		    // 	we give up!
				//return null;
			}
		}
		try {
			//FileInputStream fi = new FileInputStream( "gameinformation.rtf" );
			//FileInputStream fi = getClass().getResourceAsStream("gameinformation.rtf");

			rtf.read( in, editor.getDocument(), 0 );
		}
		catch( FileNotFoundException e )
		{
			System.out.println( "File not found" );
		}
		catch( IOException e )
		{
			System.out.println( "I/O error" );
		}
		catch( BadLocationException e )
		{
		}
	}
	
	public static void main( String args[] )
	{
		// Create an instance of the test application
		Game_Information mainFrame	= new Game_Information();
		mainFrame.setVisible( true );
	}
	
	public static void set_color(Color backcolor) {
		editor.setBackground( backcolor );
	}


}