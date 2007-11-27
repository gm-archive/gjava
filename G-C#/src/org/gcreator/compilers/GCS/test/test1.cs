/*This is the first G-C# test*/

//gmcs test1.cs -out:test1.exe -r:libGCS.dll

using org.gcreator.Components;
using org.gcreator.Native;
using org.gcreator.Support;

class Actor1 : Actor
{
	public Actor1()
	{
		Sprite s;
		setSprite(s = new Sprite());
		s.setImageArray(new Image[]{
			new Image("graphics/Minimize.png")
		});
		setSpritePosition(0);
	}
	/*public override void Draw()
	{
		SDL.DrawToSurface(img, SDL.Game.game.master, new Rectangle(0,0,30,30));
	}*/
}

class Scene1 : Scene
{
	public override void Create()
	{
		base.addActor(new Actor1());
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