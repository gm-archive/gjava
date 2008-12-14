package org.dolphin.game;

import java.awt.Dimension;
import java.awt.Frame;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.dolphin.game.api.Clipboard;
import org.dolphin.game.api.components.Background;
import org.dolphin.game.api.components.Room2D;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.engine.graphics.WindowedMode;

public class Game extends org.dolphin.game.api.gtge.BasicGame {

	public static Frame frame;
	//test fields
	public static Background bg0;
	
	public Game(){}
	
	public static void setupGame() {
		game = new GameLoader();
		game.setup(new Game(), new Dimension(640, 480), false);
		frame = ((WindowedMode) Game.game.getGame().bsGraphics).getFrame();
	}
	
	public void initBackgrounds(){
		bg0=new Background(false,0,0,0,0,0,0,0,0,0,0,0,0,0,null);
	}
	
	public void initRooms(){
		rooms=new Vector<Room2D>();
		rooms.add(new Room0(0));
		rooms.add(new Room1(1));
		currentRoom=rooms.firstElement();
		
		previousRoom();
		nextRoom();
	}
	
	
	
	@Override
	public void initResources() {
		super.initResources();
		initRooms();
		System.out.println("init resources");
	}
	
	public static void main(java.lang.String[] args) {
		parameter_count = args.length;
		parameters = args;
		gameType = "Application";

		try {
			setupGame();
			game.start();
		} catch (Exception e) {

			/*
			 * Display any Exceptions that occur during the game
			 */
			final Writer result = new StringWriter();
			final PrintWriter printWriter = new PrintWriter(result);
			e.printStackTrace(printWriter);
			Clipboard.setText(new org.dolphin.game.api.types.String(("" + result.toString() + Clipboard.getText())));
			JOptionPane
					.showMessageDialog(null,"Error: "
									+ e
									+ ", "
									+ e.getMessage()
									+ ". \n Stack trace:"
									+ result.toString()
									+ "\n \n The Error has been added to clipboard, just before the previous contents of the clipboard. \n Please contact the G-Java development team for help. http://forums.g-java.com");
			System.out.println("Exception:"+result.toString());
			System.exit(1); // Exit the game
		}

	}
}