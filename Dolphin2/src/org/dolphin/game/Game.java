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
import org.dolphin.game.api.components.*;
import org.dolphin.game.api.types.AllOfObject;
public class Game extends org.dolphin.game.api.gtge.BasicGame {
public static org.dolphin.game.Game thegame;//used to get this game object
public static AllOfObject object0= new AllOfObject(new object0()), object1= new AllOfObject(new object1()),  nullallofobject;

public static void setupGame() {
	game = new GameLoader();
        thegame=new Game();
	game.setup(thegame, new Dimension(640, 480), false);
	frame = ((WindowedMode) Game.game.getGame().bsGraphics).getFrame();
   initPaths();
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
public Sound loadSound(String name){
  if (!sounds.containsKey(name))
{
    sounds.put(name, getSound(name));
}
  return (Sound)sounds.get(name);
}
  public Sprite getSprite(String name){
    if (name.equals("sprite0")) return new Sprite("sprite0",157, 158, 0, 157, 156, 0, 0, 0, true, new BufferedImage[]{getImage("sprite0[0].png")});
 return null;
  }
  public Sound getSound(String name){
 return null;
  }
public static Path  DOLPHIN_nullpath;
  public static void initPaths(){
  }
  public static void initRooms(){
     rooms=new Vector<Room2D>();
     rooms.add(new room0(0));
    currentRoom=rooms.firstElement();
    currentRoom.setvisible();

    /*new Thread() {

                @Override
                public void run() {
                    while(true){
                    try{

                    for (int i = 0; i < currentRoom.instances.size(); i++) {
                        currentRoom.instances.elementAt(i).checkCollision();

                    }
                    }catch(Exception e){}}
                }
            }.start();*/

            

  }
        public void initResources() {
		super.initResources();
		initRooms();
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
			Clipboard.setText(("" + result.toString() + Clipboard.getText()));
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
