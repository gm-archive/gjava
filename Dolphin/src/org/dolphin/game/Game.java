package org.dolphin.game;

import java.awt.Dimension;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.dolphin.game.api.Clipboard;
import org.dolphin.game.api.components.Room2D;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.engine.graphics.WindowedMode;
import java.awt.image.BufferedImage;
import org.dolphin.game.api.components.Sprite;

public class Game extends org.dolphin.game.api.gtge.BasicGame {
        //to move to basicgame
	

	//test fields
        

        //proper fields
        public static org.dolphin.game.Game thegame;//used to get this game object

	
	public static void setupGame() {
		game = new GameLoader();
                thegame=new Game();
		game.setup(thegame, new Dimension(640, 480), false);
		frame = ((WindowedMode) Game.game.getGame().bsGraphics).getFrame();
	}

        public BufferedImage loadBackground(String name){
        if (!backgrounds.containsKey(name))
        {
            backgrounds.put(name, getImage(name+".png"));
        }
        return (BufferedImage)backgrounds.get(name);
        }

        public Sprite loadSprite(String name){
          if (!sprites.containsKey(name))
        {
            sprites.put(name, getSprite(name));
        }
          return (Sprite)sprites.get(name);
        }

        public Sprite getSprite(String name){
            if (name.equals("wall")) return new Sprite("wall",24, 24, 0, 23, 23, 0, 0, 0,true, new BufferedImage[]{getImage("sprimg_wall_0.png"),getImage("image.png")});
        return null;
        }
	
	
	public void initRooms(){
		rooms=new Vector<Room2D>();
		rooms.add(new Room0(0));
		rooms.add(new Room1(1));
		currentRoom=rooms.firstElement();
		currentRoom.setvisible();
		//previousRoom();
		//nextRoom();
                
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