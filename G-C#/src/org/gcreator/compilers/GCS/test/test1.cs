/*This is the first G-C# test*/

//gmcs test1.cs -out:test1.exe -r:libGCS.dll

using org.gcreator.Components;
using org.gcreator.Native;
using org.gcreator.Support;

class Scene1 : Scene
{
	private Image img = new Image("graphics/Minimize.png");
	public override void Draw()
	{
		SDL.DrawToSurface(img, SDL.Game.game.master, new Rectangle(0,0,30,30));
	}
}

public class Test1
{
	public static Scene[] scenelist = new Scene[]{
		new Scene1()
	};

	public static void Main()
	{
		SDL.Game game = new SDL.Game(scenelist, false, true, 800, 600, "Test1");
		game.Run();
	}
}
